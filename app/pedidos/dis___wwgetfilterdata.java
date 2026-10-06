package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis___wwgetfilterdata extends GXProcedure
{
   public dis___wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis___wwgetfilterdata.class ), "" );
   }

   public dis___wwgetfilterdata( int remoteHandle ,
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
      dis___wwgetfilterdata.this.aP5 = new String[] {""};
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
      dis___wwgetfilterdata.this.AV47DDOName = aP0;
      dis___wwgetfilterdata.this.AV48SearchTxt = aP1;
      dis___wwgetfilterdata.this.AV49SearchTxtTo = aP2;
      dis___wwgetfilterdata.this.aP3 = aP3;
      dis___wwgetfilterdata.this.aP4 = aP4;
      dis___wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISUSRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISUSRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISCLINUM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCLINUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADDISENCCLIOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTCODOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCOLNOMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADDISNOMCLIOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_MAQCODDIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODDISOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV47DDOName), "DDO_DISUNIMED") == 0 )
      {
         /* Execute user subroutine: 'LOADDISUNIMEDOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV50OptionsJson = AV37Options.toJSonString(false) ;
      AV51OptionsDescJson = AV39OptionsDesc.toJSonString(false) ;
      AV52OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue("Pedidos.Dis___WWGridState"), "") == 0 )
      {
         AV44GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis___WWGridState"), null, null);
      }
      else
      {
         AV44GridState.fromxml(AV42Session.getValue("Pedidos.Dis___WWGridState"), null, null);
      }
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV45GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV53FilterFullText = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV54TFDisUsrCod = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV55TFDisUsrCod_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV33TFDisEst_SelsJson = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV34TFDisEst_Sels.fromJSonString(AV33TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV56TFDisCliNum = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV57TFDisCliNum_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV58TFDisEncCli = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV59TFDisEncCli_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV17TFDisFecEnt = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV18TFDisFecEnt_To = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV19TFCliCod = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFCliCod_To = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV21TFCliNom = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV22TFCliNom_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV23TFDisArtCod = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV24TFDisArtCod_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV25TFDisArtDsc = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV26TFDisArtDsc_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV27TFDisColNom = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV28TFDisColNom_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV29TFDisColNum = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFDisColNum_To = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV31TFDisTipCol = (byte)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV32TFDisTipCol_To = (byte)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV60TFDisNomCli = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV61TFDisNomCli_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV62TFDisNumCli = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFDisNumCli_To = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV64TFMaqCodDis = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV65TFMaqCodDis_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV68TFDisNumUni = CommonUtil.decimalVal( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFDisNumUni_To = CommonUtil.decimalVal( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV70TFDisUniMed = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV71TFDisUniMed_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV66TFDisNumPie = (short)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFDisNumPie_To = (short)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISUSRCODOPTIONS' Routine */
      returnInSub = false ;
      AV54TFDisUsrCod = AV48SearchTxt ;
      AV55TFDisUsrCod_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X2 */
      pr_default.execute(0, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA1X2 = false ;
         A396EmprCod = P0A1X2_A396EmprCod[0] ;
         A4348DisUsrCod = P0A1X2_A4348DisUsrCod[0] ;
         A370DisFecCli = P0A1X2_A370DisFecCli[0] ;
         A369DisFec = P0A1X2_A369DisFec[0] ;
         A361DisCod = P0A1X2_A361DisCod[0] ;
         A374DisNumPie = P0A1X2_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X2_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X2_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X2_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X2_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X2_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X2_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X2_n390DisTipCol[0] ;
         A363DisColNum = P0A1X2_A363DisColNum[0] ;
         n363DisColNum = P0A1X2_n363DisColNum[0] ;
         A362DisColNom = P0A1X2_A362DisColNom[0] ;
         n362DisColNom = P0A1X2_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X2_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X2_A335DisArtCod[0] ;
         A279CliNom = P0A1X2_A279CliNom[0] ;
         A252CliCod = P0A1X2_A252CliCod[0] ;
         A371DisFecEnt = P0A1X2_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X2_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X2_A360DisCliNum[0] ;
         A367DisEst = P0A1X2_A367DisEst[0] ;
         A279CliNom = P0A1X2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A1X2_A4348DisUsrCod[0], A4348DisUsrCod) == 0 ) )
            {
               brkA1X2 = false ;
               A396EmprCod = P0A1X2_A396EmprCod[0] ;
               A361DisCod = P0A1X2_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A4348DisUsrCod)==0) )
            {
               AV36Option = A4348DisUsrCod ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X2 )
         {
            brkA1X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDISCLINUMOPTIONS' Routine */
      returnInSub = false ;
      AV56TFDisCliNum = AV48SearchTxt ;
      AV57TFDisCliNum_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X3 */
      pr_default.execute(1, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA1X4 = false ;
         A396EmprCod = P0A1X3_A396EmprCod[0] ;
         A360DisCliNum = P0A1X3_A360DisCliNum[0] ;
         A370DisFecCli = P0A1X3_A370DisFecCli[0] ;
         A369DisFec = P0A1X3_A369DisFec[0] ;
         A361DisCod = P0A1X3_A361DisCod[0] ;
         A374DisNumPie = P0A1X3_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X3_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X3_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X3_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X3_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X3_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X3_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X3_n390DisTipCol[0] ;
         A363DisColNum = P0A1X3_A363DisColNum[0] ;
         n363DisColNum = P0A1X3_n363DisColNum[0] ;
         A362DisColNom = P0A1X3_A362DisColNom[0] ;
         n362DisColNom = P0A1X3_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X3_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X3_A335DisArtCod[0] ;
         A279CliNom = P0A1X3_A279CliNom[0] ;
         A252CliCod = P0A1X3_A252CliCod[0] ;
         A371DisFecEnt = P0A1X3_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X3_A4813DisEncCli[0] ;
         A4348DisUsrCod = P0A1X3_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X3_A367DisEst[0] ;
         A279CliNom = P0A1X3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A1X3_A360DisCliNum[0], A360DisCliNum) == 0 ) )
            {
               brkA1X4 = false ;
               A396EmprCod = P0A1X3_A396EmprCod[0] ;
               A361DisCod = P0A1X3_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A360DisCliNum)==0) )
            {
               AV36Option = A360DisCliNum ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X4 )
         {
            brkA1X4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDISENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV58TFDisEncCli = AV48SearchTxt ;
      AV59TFDisEncCli_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X4 */
      pr_default.execute(2, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA1X6 = false ;
         A396EmprCod = P0A1X4_A396EmprCod[0] ;
         A4813DisEncCli = P0A1X4_A4813DisEncCli[0] ;
         A370DisFecCli = P0A1X4_A370DisFecCli[0] ;
         A369DisFec = P0A1X4_A369DisFec[0] ;
         A361DisCod = P0A1X4_A361DisCod[0] ;
         A374DisNumPie = P0A1X4_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X4_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X4_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X4_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X4_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X4_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X4_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X4_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X4_n390DisTipCol[0] ;
         A363DisColNum = P0A1X4_A363DisColNum[0] ;
         n363DisColNum = P0A1X4_n363DisColNum[0] ;
         A362DisColNom = P0A1X4_A362DisColNom[0] ;
         n362DisColNom = P0A1X4_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X4_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X4_A335DisArtCod[0] ;
         A279CliNom = P0A1X4_A279CliNom[0] ;
         A252CliCod = P0A1X4_A252CliCod[0] ;
         A371DisFecEnt = P0A1X4_A371DisFecEnt[0] ;
         A360DisCliNum = P0A1X4_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X4_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X4_A367DisEst[0] ;
         A279CliNom = P0A1X4_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A1X4_A4813DisEncCli[0], A4813DisEncCli) == 0 ) )
            {
               brkA1X6 = false ;
               A396EmprCod = P0A1X4_A396EmprCod[0] ;
               A361DisCod = P0A1X4_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A4813DisEncCli)==0) )
            {
               AV36Option = A4813DisEncCli ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X6 )
         {
            brkA1X6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV21TFCliNom = AV48SearchTxt ;
      AV22TFCliNom_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X5 */
      pr_default.execute(3, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA1X8 = false ;
         A396EmprCod = P0A1X5_A396EmprCod[0] ;
         A279CliNom = P0A1X5_A279CliNom[0] ;
         A370DisFecCli = P0A1X5_A370DisFecCli[0] ;
         A369DisFec = P0A1X5_A369DisFec[0] ;
         A361DisCod = P0A1X5_A361DisCod[0] ;
         A374DisNumPie = P0A1X5_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X5_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X5_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X5_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X5_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X5_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X5_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X5_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X5_n390DisTipCol[0] ;
         A363DisColNum = P0A1X5_A363DisColNum[0] ;
         n363DisColNum = P0A1X5_n363DisColNum[0] ;
         A362DisColNom = P0A1X5_A362DisColNom[0] ;
         n362DisColNom = P0A1X5_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X5_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X5_A335DisArtCod[0] ;
         A252CliCod = P0A1X5_A252CliCod[0] ;
         A371DisFecEnt = P0A1X5_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X5_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X5_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X5_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X5_A367DisEst[0] ;
         A279CliNom = P0A1X5_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A1X5_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brkA1X8 = false ;
               A396EmprCod = P0A1X5_A396EmprCod[0] ;
               A361DisCod = P0A1X5_A361DisCod[0] ;
               A252CliCod = P0A1X5_A252CliCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV36Option = A279CliNom ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X8 )
         {
            brkA1X8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV23TFDisArtCod = AV48SearchTxt ;
      AV24TFDisArtCod_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X6 */
      pr_default.execute(4, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA1X10 = false ;
         A396EmprCod = P0A1X6_A396EmprCod[0] ;
         A335DisArtCod = P0A1X6_A335DisArtCod[0] ;
         A370DisFecCli = P0A1X6_A370DisFecCli[0] ;
         A369DisFec = P0A1X6_A369DisFec[0] ;
         A361DisCod = P0A1X6_A361DisCod[0] ;
         A374DisNumPie = P0A1X6_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X6_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X6_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X6_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X6_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X6_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X6_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X6_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X6_n390DisTipCol[0] ;
         A363DisColNum = P0A1X6_A363DisColNum[0] ;
         n363DisColNum = P0A1X6_n363DisColNum[0] ;
         A362DisColNom = P0A1X6_A362DisColNom[0] ;
         n362DisColNom = P0A1X6_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X6_A337DisArtDsc[0] ;
         A279CliNom = P0A1X6_A279CliNom[0] ;
         A252CliCod = P0A1X6_A252CliCod[0] ;
         A371DisFecEnt = P0A1X6_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X6_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X6_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X6_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X6_A367DisEst[0] ;
         A279CliNom = P0A1X6_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A1X6_A335DisArtCod[0], A335DisArtCod) == 0 ) )
            {
               brkA1X10 = false ;
               A396EmprCod = P0A1X6_A396EmprCod[0] ;
               A361DisCod = P0A1X6_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
            {
               AV36Option = A335DisArtCod ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X10 )
         {
            brkA1X10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADDISARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV25TFDisArtDsc = AV48SearchTxt ;
      AV26TFDisArtDsc_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X7 */
      pr_default.execute(5, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA1X12 = false ;
         A396EmprCod = P0A1X7_A396EmprCod[0] ;
         A337DisArtDsc = P0A1X7_A337DisArtDsc[0] ;
         A370DisFecCli = P0A1X7_A370DisFecCli[0] ;
         A369DisFec = P0A1X7_A369DisFec[0] ;
         A361DisCod = P0A1X7_A361DisCod[0] ;
         A374DisNumPie = P0A1X7_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X7_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X7_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X7_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X7_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X7_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X7_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X7_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X7_n390DisTipCol[0] ;
         A363DisColNum = P0A1X7_A363DisColNum[0] ;
         n363DisColNum = P0A1X7_n363DisColNum[0] ;
         A362DisColNom = P0A1X7_A362DisColNom[0] ;
         n362DisColNom = P0A1X7_n362DisColNom[0] ;
         A335DisArtCod = P0A1X7_A335DisArtCod[0] ;
         A279CliNom = P0A1X7_A279CliNom[0] ;
         A252CliCod = P0A1X7_A252CliCod[0] ;
         A371DisFecEnt = P0A1X7_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X7_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X7_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X7_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X7_A367DisEst[0] ;
         A279CliNom = P0A1X7_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0A1X7_A337DisArtDsc[0], A337DisArtDsc) == 0 ) )
            {
               brkA1X12 = false ;
               A396EmprCod = P0A1X7_A396EmprCod[0] ;
               A361DisCod = P0A1X7_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A337DisArtDsc)==0) )
            {
               AV36Option = A337DisArtDsc ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X12 )
         {
            brkA1X12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADDISCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV27TFDisColNom = AV48SearchTxt ;
      AV28TFDisColNom_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X8 */
      pr_default.execute(6, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA1X14 = false ;
         A396EmprCod = P0A1X8_A396EmprCod[0] ;
         A362DisColNom = P0A1X8_A362DisColNom[0] ;
         n362DisColNom = P0A1X8_n362DisColNom[0] ;
         A370DisFecCli = P0A1X8_A370DisFecCli[0] ;
         A369DisFec = P0A1X8_A369DisFec[0] ;
         A361DisCod = P0A1X8_A361DisCod[0] ;
         A374DisNumPie = P0A1X8_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X8_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X8_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X8_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X8_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X8_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X8_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X8_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X8_n390DisTipCol[0] ;
         A363DisColNum = P0A1X8_A363DisColNum[0] ;
         n363DisColNum = P0A1X8_n363DisColNum[0] ;
         A337DisArtDsc = P0A1X8_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X8_A335DisArtCod[0] ;
         A279CliNom = P0A1X8_A279CliNom[0] ;
         A252CliCod = P0A1X8_A252CliCod[0] ;
         A371DisFecEnt = P0A1X8_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X8_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X8_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X8_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X8_A367DisEst[0] ;
         A279CliNom = P0A1X8_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0A1X8_A362DisColNom[0], A362DisColNom) == 0 ) )
            {
               brkA1X14 = false ;
               A396EmprCod = P0A1X8_A396EmprCod[0] ;
               A361DisCod = P0A1X8_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A362DisColNom)==0) )
            {
               AV36Option = A362DisColNom ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X14 )
         {
            brkA1X14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADDISNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV60TFDisNomCli = AV48SearchTxt ;
      AV61TFDisNomCli_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X9 */
      pr_default.execute(7, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brkA1X16 = false ;
         A396EmprCod = P0A1X9_A396EmprCod[0] ;
         A1195DisNomCli = P0A1X9_A1195DisNomCli[0] ;
         A370DisFecCli = P0A1X9_A370DisFecCli[0] ;
         A369DisFec = P0A1X9_A369DisFec[0] ;
         A361DisCod = P0A1X9_A361DisCod[0] ;
         A374DisNumPie = P0A1X9_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X9_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X9_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X9_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X9_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X9_A1196DisNumCli[0] ;
         A390DisTipCol = P0A1X9_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X9_n390DisTipCol[0] ;
         A363DisColNum = P0A1X9_A363DisColNum[0] ;
         n363DisColNum = P0A1X9_n363DisColNum[0] ;
         A362DisColNom = P0A1X9_A362DisColNom[0] ;
         n362DisColNom = P0A1X9_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X9_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X9_A335DisArtCod[0] ;
         A279CliNom = P0A1X9_A279CliNom[0] ;
         A252CliCod = P0A1X9_A252CliCod[0] ;
         A371DisFecEnt = P0A1X9_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X9_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X9_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X9_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X9_A367DisEst[0] ;
         A279CliNom = P0A1X9_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P0A1X9_A1195DisNomCli[0], A1195DisNomCli) == 0 ) )
            {
               brkA1X16 = false ;
               A396EmprCod = P0A1X9_A396EmprCod[0] ;
               A361DisCod = P0A1X9_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X16 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A1195DisNomCli)==0) )
            {
               AV36Option = A1195DisNomCli ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X16 )
         {
            brkA1X16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADMAQCODDISOPTIONS' Routine */
      returnInSub = false ;
      AV64TFMaqCodDis = AV48SearchTxt ;
      AV65TFMaqCodDis_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X10 */
      pr_default.execute(8, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brkA1X18 = false ;
         A396EmprCod = P0A1X10_A396EmprCod[0] ;
         A1122MaqCodDis = P0A1X10_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X10_n1122MaqCodDis[0] ;
         A370DisFecCli = P0A1X10_A370DisFecCli[0] ;
         A369DisFec = P0A1X10_A369DisFec[0] ;
         A361DisCod = P0A1X10_A361DisCod[0] ;
         A374DisNumPie = P0A1X10_A374DisNumPie[0] ;
         A392DisUniMed = P0A1X10_A392DisUniMed[0] ;
         A375DisNumUni = P0A1X10_A375DisNumUni[0] ;
         A1196DisNumCli = P0A1X10_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X10_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X10_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X10_n390DisTipCol[0] ;
         A363DisColNum = P0A1X10_A363DisColNum[0] ;
         n363DisColNum = P0A1X10_n363DisColNum[0] ;
         A362DisColNom = P0A1X10_A362DisColNom[0] ;
         n362DisColNom = P0A1X10_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X10_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X10_A335DisArtCod[0] ;
         A279CliNom = P0A1X10_A279CliNom[0] ;
         A252CliCod = P0A1X10_A252CliCod[0] ;
         A371DisFecEnt = P0A1X10_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X10_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X10_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X10_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X10_A367DisEst[0] ;
         A279CliNom = P0A1X10_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P0A1X10_A1122MaqCodDis[0], A1122MaqCodDis) == 0 ) )
            {
               brkA1X18 = false ;
               A396EmprCod = P0A1X10_A396EmprCod[0] ;
               A361DisCod = P0A1X10_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X18 = true ;
               pr_default.readNext(8);
            }
            if ( ! (GXutil.strcmp("", A1122MaqCodDis)==0) )
            {
               AV36Option = A1122MaqCodDis ;
               AV37Options.add(AV36Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X18 )
         {
            brkA1X18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADDISUNIMEDOPTIONS' Routine */
      returnInSub = false ;
      AV70TFDisUniMed = AV48SearchTxt ;
      AV71TFDisUniMed_Sel = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = AV53FilterFullText ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = AV54TFDisUsrCod ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = AV55TFDisUsrCod_Sel ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = AV34TFDisEst_Sels ;
      AV86Pedidos_dis___wwds_5_tfdisclinum = AV56TFDisCliNum ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = AV57TFDisCliNum_Sel ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = AV58TFDisEncCli ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = AV59TFDisEncCli_Sel ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = AV17TFDisFecEnt ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = AV18TFDisFecEnt_To ;
      AV92Pedidos_dis___wwds_11_tfclicod = AV19TFCliCod ;
      AV93Pedidos_dis___wwds_12_tfclicod_to = AV20TFCliCod_To ;
      AV94Pedidos_dis___wwds_13_tfclinom = AV21TFCliNom ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = AV22TFCliNom_Sel ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = AV23TFDisArtCod ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = AV24TFDisArtCod_Sel ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = AV25TFDisArtDsc ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = AV26TFDisArtDsc_Sel ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = AV27TFDisColNom ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = AV28TFDisColNom_Sel ;
      AV102Pedidos_dis___wwds_21_tfdiscolnum = AV29TFDisColNum ;
      AV103Pedidos_dis___wwds_22_tfdiscolnum_to = AV30TFDisColNum_To ;
      AV104Pedidos_dis___wwds_23_tfdistipcol = AV31TFDisTipCol ;
      AV105Pedidos_dis___wwds_24_tfdistipcol_to = AV32TFDisTipCol_To ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = AV60TFDisNomCli ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = AV61TFDisNomCli_Sel ;
      AV108Pedidos_dis___wwds_27_tfdisnumcli = AV62TFDisNumCli ;
      AV109Pedidos_dis___wwds_28_tfdisnumcli_to = AV63TFDisNumCli_To ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = AV64TFMaqCodDis ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV65TFMaqCodDis_Sel ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = AV68TFDisNumUni ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = AV69TFDisNumUni_To ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = AV70TFDisUniMed ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = AV71TFDisUniMed_Sel ;
      AV116Pedidos_dis___wwds_35_tfdisnumpie = AV66TFDisNumPie ;
      AV117Pedidos_dis___wwds_36_tfdisnumpie_to = AV67TFDisNumPie_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV94Pedidos_dis___wwds_13_tfclinom ,
                                           AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV75DisCod) ,
                                           AV73DisFecFrom ,
                                           AV74DisFecto ,
                                           AV76DisFeccliFrom ,
                                           AV77DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           AV82Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV94Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV96Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV98Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1X11 */
      pr_default.execute(9, new Object[] {lV83Pedidos_dis___wwds_2_tfdisusrcod, AV84Pedidos_dis___wwds_3_tfdisusrcod_sel, lV86Pedidos_dis___wwds_5_tfdisclinum, AV87Pedidos_dis___wwds_6_tfdisclinum_sel, lV88Pedidos_dis___wwds_7_tfdisenccli, AV89Pedidos_dis___wwds_8_tfdisenccli_sel, AV90Pedidos_dis___wwds_9_tfdisfecent, AV91Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV92Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV93Pedidos_dis___wwds_12_tfclicod_to), lV94Pedidos_dis___wwds_13_tfclinom, AV95Pedidos_dis___wwds_14_tfclinom_sel, lV96Pedidos_dis___wwds_15_tfdisartcod, AV97Pedidos_dis___wwds_16_tfdisartcod_sel, lV98Pedidos_dis___wwds_17_tfdisartdsc, AV99Pedidos_dis___wwds_18_tfdisartdsc_sel, lV100Pedidos_dis___wwds_19_tfdiscolnom, AV101Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV102Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV103Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV104Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV105Pedidos_dis___wwds_24_tfdistipcol_to), lV106Pedidos_dis___wwds_25_tfdisnomcli, AV107Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV108Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV109Pedidos_dis___wwds_28_tfdisnumcli_to), lV110Pedidos_dis___wwds_29_tfmaqcoddis, AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV112Pedidos_dis___wwds_31_tfdisnumuni, AV113Pedidos_dis___wwds_32_tfdisnumuni_to, lV114Pedidos_dis___wwds_33_tfdisunimed, AV115Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV116Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV117Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV75DisCod), AV73DisFecFrom, AV74DisFecto, AV76DisFeccliFrom, AV77DisFecclito});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brkA1X20 = false ;
         A396EmprCod = P0A1X11_A396EmprCod[0] ;
         A392DisUniMed = P0A1X11_A392DisUniMed[0] ;
         A370DisFecCli = P0A1X11_A370DisFecCli[0] ;
         A369DisFec = P0A1X11_A369DisFec[0] ;
         A361DisCod = P0A1X11_A361DisCod[0] ;
         A374DisNumPie = P0A1X11_A374DisNumPie[0] ;
         A375DisNumUni = P0A1X11_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1X11_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1X11_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1X11_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1X11_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1X11_A390DisTipCol[0] ;
         n390DisTipCol = P0A1X11_n390DisTipCol[0] ;
         A363DisColNum = P0A1X11_A363DisColNum[0] ;
         n363DisColNum = P0A1X11_n363DisColNum[0] ;
         A362DisColNom = P0A1X11_A362DisColNom[0] ;
         n362DisColNom = P0A1X11_n362DisColNom[0] ;
         A337DisArtDsc = P0A1X11_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1X11_A335DisArtCod[0] ;
         A279CliNom = P0A1X11_A279CliNom[0] ;
         A252CliCod = P0A1X11_A252CliCod[0] ;
         A371DisFecEnt = P0A1X11_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1X11_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1X11_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1X11_A4348DisUsrCod[0] ;
         A367DisEst = P0A1X11_A367DisEst[0] ;
         A279CliNom = P0A1X11_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV41count = 0 ;
            while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P0A1X11_A392DisUniMed[0], A392DisUniMed) == 0 ) )
            {
               brkA1X20 = false ;
               A396EmprCod = P0A1X11_A396EmprCod[0] ;
               A361DisCod = P0A1X11_A361DisCod[0] ;
               AV41count = (long)(AV41count+1) ;
               brkA1X20 = true ;
               pr_default.readNext(9);
            }
            if ( ! (GXutil.strcmp("", A392DisUniMed)==0) )
            {
               AV36Option = A392DisUniMed ;
               AV38OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A392DisUniMed, "@!"))) ;
               AV37Options.add(AV36Option, 0);
               AV39OptionsDesc.add(AV38OptionDesc, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkA1X20 )
         {
            brkA1X20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = dis___wwgetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = dis___wwgetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = dis___wwgetfilterdata.this.AV52OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV50OptionsJson = "" ;
      AV51OptionsDescJson = "" ;
      AV52OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV42Session = httpContext.getWebSession();
      AV44GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53FilterFullText = "" ;
      AV54TFDisUsrCod = "" ;
      AV55TFDisUsrCod_Sel = "" ;
      AV33TFDisEst_SelsJson = "" ;
      AV34TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV56TFDisCliNum = "" ;
      AV57TFDisCliNum_Sel = "" ;
      AV58TFDisEncCli = "" ;
      AV59TFDisEncCli_Sel = "" ;
      AV17TFDisFecEnt = GXutil.nullDate() ;
      AV18TFDisFecEnt_To = GXutil.nullDate() ;
      AV21TFCliNom = "" ;
      AV22TFCliNom_Sel = "" ;
      AV23TFDisArtCod = "" ;
      AV24TFDisArtCod_Sel = "" ;
      AV25TFDisArtDsc = "" ;
      AV26TFDisArtDsc_Sel = "" ;
      AV27TFDisColNom = "" ;
      AV28TFDisColNom_Sel = "" ;
      AV60TFDisNomCli = "" ;
      AV61TFDisNomCli_Sel = "" ;
      AV64TFMaqCodDis = "" ;
      AV65TFMaqCodDis_Sel = "" ;
      AV68TFDisNumUni = DecimalUtil.ZERO ;
      AV69TFDisNumUni_To = DecimalUtil.ZERO ;
      AV70TFDisUniMed = "" ;
      AV71TFDisUniMed_Sel = "" ;
      A4348DisUsrCod = "" ;
      AV82Pedidos_dis___wwds_1_filterfulltext = "" ;
      AV83Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      AV84Pedidos_dis___wwds_3_tfdisusrcod_sel = "" ;
      AV85Pedidos_dis___wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86Pedidos_dis___wwds_5_tfdisclinum = "" ;
      AV87Pedidos_dis___wwds_6_tfdisclinum_sel = "" ;
      AV88Pedidos_dis___wwds_7_tfdisenccli = "" ;
      AV89Pedidos_dis___wwds_8_tfdisenccli_sel = "" ;
      AV90Pedidos_dis___wwds_9_tfdisfecent = GXutil.nullDate() ;
      AV91Pedidos_dis___wwds_10_tfdisfecent_to = GXutil.nullDate() ;
      AV94Pedidos_dis___wwds_13_tfclinom = "" ;
      AV95Pedidos_dis___wwds_14_tfclinom_sel = "" ;
      AV96Pedidos_dis___wwds_15_tfdisartcod = "" ;
      AV97Pedidos_dis___wwds_16_tfdisartcod_sel = "" ;
      AV98Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      AV99Pedidos_dis___wwds_18_tfdisartdsc_sel = "" ;
      AV100Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      AV101Pedidos_dis___wwds_20_tfdiscolnom_sel = "" ;
      AV106Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      AV107Pedidos_dis___wwds_26_tfdisnomcli_sel = "" ;
      AV110Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel = "" ;
      AV112Pedidos_dis___wwds_31_tfdisnumuni = DecimalUtil.ZERO ;
      AV113Pedidos_dis___wwds_32_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV114Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV115Pedidos_dis___wwds_34_tfdisunimed_sel = "" ;
      lV82Pedidos_dis___wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV83Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      lV86Pedidos_dis___wwds_5_tfdisclinum = "" ;
      lV88Pedidos_dis___wwds_7_tfdisenccli = "" ;
      lV94Pedidos_dis___wwds_13_tfclinom = "" ;
      lV96Pedidos_dis___wwds_15_tfdisartcod = "" ;
      lV98Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      lV100Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      lV106Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      lV110Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      lV114Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV73DisFecFrom = GXutil.nullDate() ;
      AV74DisFecto = GXutil.nullDate() ;
      AV76DisFeccliFrom = GXutil.nullDate() ;
      AV77DisFecclito = GXutil.nullDate() ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1122MaqCodDis = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A369DisFec = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      P0A1X2_A396EmprCod = new String[] {""} ;
      P0A1X2_A4348DisUsrCod = new String[] {""} ;
      P0A1X2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X2_A361DisCod = new int[1] ;
      P0A1X2_A374DisNumPie = new short[1] ;
      P0A1X2_A392DisUniMed = new String[] {""} ;
      P0A1X2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X2_A1122MaqCodDis = new String[] {""} ;
      P0A1X2_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X2_A1196DisNumCli = new int[1] ;
      P0A1X2_A1195DisNomCli = new String[] {""} ;
      P0A1X2_A390DisTipCol = new byte[1] ;
      P0A1X2_n390DisTipCol = new boolean[] {false} ;
      P0A1X2_A363DisColNum = new int[1] ;
      P0A1X2_n363DisColNum = new boolean[] {false} ;
      P0A1X2_A362DisColNom = new String[] {""} ;
      P0A1X2_n362DisColNom = new boolean[] {false} ;
      P0A1X2_A337DisArtDsc = new String[] {""} ;
      P0A1X2_A335DisArtCod = new String[] {""} ;
      P0A1X2_A279CliNom = new String[] {""} ;
      P0A1X2_A252CliCod = new int[1] ;
      P0A1X2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X2_A4813DisEncCli = new String[] {""} ;
      P0A1X2_A360DisCliNum = new String[] {""} ;
      P0A1X2_A367DisEst = new byte[1] ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      P0A1X3_A396EmprCod = new String[] {""} ;
      P0A1X3_A360DisCliNum = new String[] {""} ;
      P0A1X3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X3_A361DisCod = new int[1] ;
      P0A1X3_A374DisNumPie = new short[1] ;
      P0A1X3_A392DisUniMed = new String[] {""} ;
      P0A1X3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X3_A1122MaqCodDis = new String[] {""} ;
      P0A1X3_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X3_A1196DisNumCli = new int[1] ;
      P0A1X3_A1195DisNomCli = new String[] {""} ;
      P0A1X3_A390DisTipCol = new byte[1] ;
      P0A1X3_n390DisTipCol = new boolean[] {false} ;
      P0A1X3_A363DisColNum = new int[1] ;
      P0A1X3_n363DisColNum = new boolean[] {false} ;
      P0A1X3_A362DisColNom = new String[] {""} ;
      P0A1X3_n362DisColNom = new boolean[] {false} ;
      P0A1X3_A337DisArtDsc = new String[] {""} ;
      P0A1X3_A335DisArtCod = new String[] {""} ;
      P0A1X3_A279CliNom = new String[] {""} ;
      P0A1X3_A252CliCod = new int[1] ;
      P0A1X3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X3_A4813DisEncCli = new String[] {""} ;
      P0A1X3_A4348DisUsrCod = new String[] {""} ;
      P0A1X3_A367DisEst = new byte[1] ;
      P0A1X4_A396EmprCod = new String[] {""} ;
      P0A1X4_A4813DisEncCli = new String[] {""} ;
      P0A1X4_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X4_A361DisCod = new int[1] ;
      P0A1X4_A374DisNumPie = new short[1] ;
      P0A1X4_A392DisUniMed = new String[] {""} ;
      P0A1X4_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X4_A1122MaqCodDis = new String[] {""} ;
      P0A1X4_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X4_A1196DisNumCli = new int[1] ;
      P0A1X4_A1195DisNomCli = new String[] {""} ;
      P0A1X4_A390DisTipCol = new byte[1] ;
      P0A1X4_n390DisTipCol = new boolean[] {false} ;
      P0A1X4_A363DisColNum = new int[1] ;
      P0A1X4_n363DisColNum = new boolean[] {false} ;
      P0A1X4_A362DisColNom = new String[] {""} ;
      P0A1X4_n362DisColNom = new boolean[] {false} ;
      P0A1X4_A337DisArtDsc = new String[] {""} ;
      P0A1X4_A335DisArtCod = new String[] {""} ;
      P0A1X4_A279CliNom = new String[] {""} ;
      P0A1X4_A252CliCod = new int[1] ;
      P0A1X4_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X4_A360DisCliNum = new String[] {""} ;
      P0A1X4_A4348DisUsrCod = new String[] {""} ;
      P0A1X4_A367DisEst = new byte[1] ;
      P0A1X5_A396EmprCod = new String[] {""} ;
      P0A1X5_A279CliNom = new String[] {""} ;
      P0A1X5_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X5_A361DisCod = new int[1] ;
      P0A1X5_A374DisNumPie = new short[1] ;
      P0A1X5_A392DisUniMed = new String[] {""} ;
      P0A1X5_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X5_A1122MaqCodDis = new String[] {""} ;
      P0A1X5_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X5_A1196DisNumCli = new int[1] ;
      P0A1X5_A1195DisNomCli = new String[] {""} ;
      P0A1X5_A390DisTipCol = new byte[1] ;
      P0A1X5_n390DisTipCol = new boolean[] {false} ;
      P0A1X5_A363DisColNum = new int[1] ;
      P0A1X5_n363DisColNum = new boolean[] {false} ;
      P0A1X5_A362DisColNom = new String[] {""} ;
      P0A1X5_n362DisColNom = new boolean[] {false} ;
      P0A1X5_A337DisArtDsc = new String[] {""} ;
      P0A1X5_A335DisArtCod = new String[] {""} ;
      P0A1X5_A252CliCod = new int[1] ;
      P0A1X5_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X5_A4813DisEncCli = new String[] {""} ;
      P0A1X5_A360DisCliNum = new String[] {""} ;
      P0A1X5_A4348DisUsrCod = new String[] {""} ;
      P0A1X5_A367DisEst = new byte[1] ;
      P0A1X6_A396EmprCod = new String[] {""} ;
      P0A1X6_A335DisArtCod = new String[] {""} ;
      P0A1X6_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X6_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X6_A361DisCod = new int[1] ;
      P0A1X6_A374DisNumPie = new short[1] ;
      P0A1X6_A392DisUniMed = new String[] {""} ;
      P0A1X6_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X6_A1122MaqCodDis = new String[] {""} ;
      P0A1X6_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X6_A1196DisNumCli = new int[1] ;
      P0A1X6_A1195DisNomCli = new String[] {""} ;
      P0A1X6_A390DisTipCol = new byte[1] ;
      P0A1X6_n390DisTipCol = new boolean[] {false} ;
      P0A1X6_A363DisColNum = new int[1] ;
      P0A1X6_n363DisColNum = new boolean[] {false} ;
      P0A1X6_A362DisColNom = new String[] {""} ;
      P0A1X6_n362DisColNom = new boolean[] {false} ;
      P0A1X6_A337DisArtDsc = new String[] {""} ;
      P0A1X6_A279CliNom = new String[] {""} ;
      P0A1X6_A252CliCod = new int[1] ;
      P0A1X6_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X6_A4813DisEncCli = new String[] {""} ;
      P0A1X6_A360DisCliNum = new String[] {""} ;
      P0A1X6_A4348DisUsrCod = new String[] {""} ;
      P0A1X6_A367DisEst = new byte[1] ;
      P0A1X7_A396EmprCod = new String[] {""} ;
      P0A1X7_A337DisArtDsc = new String[] {""} ;
      P0A1X7_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X7_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X7_A361DisCod = new int[1] ;
      P0A1X7_A374DisNumPie = new short[1] ;
      P0A1X7_A392DisUniMed = new String[] {""} ;
      P0A1X7_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X7_A1122MaqCodDis = new String[] {""} ;
      P0A1X7_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X7_A1196DisNumCli = new int[1] ;
      P0A1X7_A1195DisNomCli = new String[] {""} ;
      P0A1X7_A390DisTipCol = new byte[1] ;
      P0A1X7_n390DisTipCol = new boolean[] {false} ;
      P0A1X7_A363DisColNum = new int[1] ;
      P0A1X7_n363DisColNum = new boolean[] {false} ;
      P0A1X7_A362DisColNom = new String[] {""} ;
      P0A1X7_n362DisColNom = new boolean[] {false} ;
      P0A1X7_A335DisArtCod = new String[] {""} ;
      P0A1X7_A279CliNom = new String[] {""} ;
      P0A1X7_A252CliCod = new int[1] ;
      P0A1X7_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X7_A4813DisEncCli = new String[] {""} ;
      P0A1X7_A360DisCliNum = new String[] {""} ;
      P0A1X7_A4348DisUsrCod = new String[] {""} ;
      P0A1X7_A367DisEst = new byte[1] ;
      P0A1X8_A396EmprCod = new String[] {""} ;
      P0A1X8_A362DisColNom = new String[] {""} ;
      P0A1X8_n362DisColNom = new boolean[] {false} ;
      P0A1X8_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X8_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X8_A361DisCod = new int[1] ;
      P0A1X8_A374DisNumPie = new short[1] ;
      P0A1X8_A392DisUniMed = new String[] {""} ;
      P0A1X8_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X8_A1122MaqCodDis = new String[] {""} ;
      P0A1X8_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X8_A1196DisNumCli = new int[1] ;
      P0A1X8_A1195DisNomCli = new String[] {""} ;
      P0A1X8_A390DisTipCol = new byte[1] ;
      P0A1X8_n390DisTipCol = new boolean[] {false} ;
      P0A1X8_A363DisColNum = new int[1] ;
      P0A1X8_n363DisColNum = new boolean[] {false} ;
      P0A1X8_A337DisArtDsc = new String[] {""} ;
      P0A1X8_A335DisArtCod = new String[] {""} ;
      P0A1X8_A279CliNom = new String[] {""} ;
      P0A1X8_A252CliCod = new int[1] ;
      P0A1X8_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X8_A4813DisEncCli = new String[] {""} ;
      P0A1X8_A360DisCliNum = new String[] {""} ;
      P0A1X8_A4348DisUsrCod = new String[] {""} ;
      P0A1X8_A367DisEst = new byte[1] ;
      P0A1X9_A396EmprCod = new String[] {""} ;
      P0A1X9_A1195DisNomCli = new String[] {""} ;
      P0A1X9_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X9_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X9_A361DisCod = new int[1] ;
      P0A1X9_A374DisNumPie = new short[1] ;
      P0A1X9_A392DisUniMed = new String[] {""} ;
      P0A1X9_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X9_A1122MaqCodDis = new String[] {""} ;
      P0A1X9_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X9_A1196DisNumCli = new int[1] ;
      P0A1X9_A390DisTipCol = new byte[1] ;
      P0A1X9_n390DisTipCol = new boolean[] {false} ;
      P0A1X9_A363DisColNum = new int[1] ;
      P0A1X9_n363DisColNum = new boolean[] {false} ;
      P0A1X9_A362DisColNom = new String[] {""} ;
      P0A1X9_n362DisColNom = new boolean[] {false} ;
      P0A1X9_A337DisArtDsc = new String[] {""} ;
      P0A1X9_A335DisArtCod = new String[] {""} ;
      P0A1X9_A279CliNom = new String[] {""} ;
      P0A1X9_A252CliCod = new int[1] ;
      P0A1X9_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X9_A4813DisEncCli = new String[] {""} ;
      P0A1X9_A360DisCliNum = new String[] {""} ;
      P0A1X9_A4348DisUsrCod = new String[] {""} ;
      P0A1X9_A367DisEst = new byte[1] ;
      P0A1X10_A396EmprCod = new String[] {""} ;
      P0A1X10_A1122MaqCodDis = new String[] {""} ;
      P0A1X10_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X10_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X10_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X10_A361DisCod = new int[1] ;
      P0A1X10_A374DisNumPie = new short[1] ;
      P0A1X10_A392DisUniMed = new String[] {""} ;
      P0A1X10_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X10_A1196DisNumCli = new int[1] ;
      P0A1X10_A1195DisNomCli = new String[] {""} ;
      P0A1X10_A390DisTipCol = new byte[1] ;
      P0A1X10_n390DisTipCol = new boolean[] {false} ;
      P0A1X10_A363DisColNum = new int[1] ;
      P0A1X10_n363DisColNum = new boolean[] {false} ;
      P0A1X10_A362DisColNom = new String[] {""} ;
      P0A1X10_n362DisColNom = new boolean[] {false} ;
      P0A1X10_A337DisArtDsc = new String[] {""} ;
      P0A1X10_A335DisArtCod = new String[] {""} ;
      P0A1X10_A279CliNom = new String[] {""} ;
      P0A1X10_A252CliCod = new int[1] ;
      P0A1X10_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X10_A4813DisEncCli = new String[] {""} ;
      P0A1X10_A360DisCliNum = new String[] {""} ;
      P0A1X10_A4348DisUsrCod = new String[] {""} ;
      P0A1X10_A367DisEst = new byte[1] ;
      P0A1X11_A396EmprCod = new String[] {""} ;
      P0A1X11_A392DisUniMed = new String[] {""} ;
      P0A1X11_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X11_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X11_A361DisCod = new int[1] ;
      P0A1X11_A374DisNumPie = new short[1] ;
      P0A1X11_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1X11_A1122MaqCodDis = new String[] {""} ;
      P0A1X11_n1122MaqCodDis = new boolean[] {false} ;
      P0A1X11_A1196DisNumCli = new int[1] ;
      P0A1X11_A1195DisNomCli = new String[] {""} ;
      P0A1X11_A390DisTipCol = new byte[1] ;
      P0A1X11_n390DisTipCol = new boolean[] {false} ;
      P0A1X11_A363DisColNum = new int[1] ;
      P0A1X11_n363DisColNum = new boolean[] {false} ;
      P0A1X11_A362DisColNom = new String[] {""} ;
      P0A1X11_n362DisColNom = new boolean[] {false} ;
      P0A1X11_A337DisArtDsc = new String[] {""} ;
      P0A1X11_A335DisArtCod = new String[] {""} ;
      P0A1X11_A279CliNom = new String[] {""} ;
      P0A1X11_A252CliCod = new int[1] ;
      P0A1X11_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1X11_A4813DisEncCli = new String[] {""} ;
      P0A1X11_A360DisCliNum = new String[] {""} ;
      P0A1X11_A4348DisUsrCod = new String[] {""} ;
      P0A1X11_A367DisEst = new byte[1] ;
      AV38OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis___wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A1X2_A396EmprCod, P0A1X2_A4348DisUsrCod, P0A1X2_A370DisFecCli, P0A1X2_A369DisFec, P0A1X2_A361DisCod, P0A1X2_A374DisNumPie, P0A1X2_A392DisUniMed, P0A1X2_A375DisNumUni, P0A1X2_A1122MaqCodDis, P0A1X2_n1122MaqCodDis,
            P0A1X2_A1196DisNumCli, P0A1X2_A1195DisNomCli, P0A1X2_A390DisTipCol, P0A1X2_n390DisTipCol, P0A1X2_A363DisColNum, P0A1X2_n363DisColNum, P0A1X2_A362DisColNom, P0A1X2_n362DisColNom, P0A1X2_A337DisArtDsc, P0A1X2_A335DisArtCod,
            P0A1X2_A279CliNom, P0A1X2_A252CliCod, P0A1X2_A371DisFecEnt, P0A1X2_A4813DisEncCli, P0A1X2_A360DisCliNum, P0A1X2_A367DisEst
            }
            , new Object[] {
            P0A1X3_A396EmprCod, P0A1X3_A360DisCliNum, P0A1X3_A370DisFecCli, P0A1X3_A369DisFec, P0A1X3_A361DisCod, P0A1X3_A374DisNumPie, P0A1X3_A392DisUniMed, P0A1X3_A375DisNumUni, P0A1X3_A1122MaqCodDis, P0A1X3_n1122MaqCodDis,
            P0A1X3_A1196DisNumCli, P0A1X3_A1195DisNomCli, P0A1X3_A390DisTipCol, P0A1X3_n390DisTipCol, P0A1X3_A363DisColNum, P0A1X3_n363DisColNum, P0A1X3_A362DisColNom, P0A1X3_n362DisColNom, P0A1X3_A337DisArtDsc, P0A1X3_A335DisArtCod,
            P0A1X3_A279CliNom, P0A1X3_A252CliCod, P0A1X3_A371DisFecEnt, P0A1X3_A4813DisEncCli, P0A1X3_A4348DisUsrCod, P0A1X3_A367DisEst
            }
            , new Object[] {
            P0A1X4_A396EmprCod, P0A1X4_A4813DisEncCli, P0A1X4_A370DisFecCli, P0A1X4_A369DisFec, P0A1X4_A361DisCod, P0A1X4_A374DisNumPie, P0A1X4_A392DisUniMed, P0A1X4_A375DisNumUni, P0A1X4_A1122MaqCodDis, P0A1X4_n1122MaqCodDis,
            P0A1X4_A1196DisNumCli, P0A1X4_A1195DisNomCli, P0A1X4_A390DisTipCol, P0A1X4_n390DisTipCol, P0A1X4_A363DisColNum, P0A1X4_n363DisColNum, P0A1X4_A362DisColNom, P0A1X4_n362DisColNom, P0A1X4_A337DisArtDsc, P0A1X4_A335DisArtCod,
            P0A1X4_A279CliNom, P0A1X4_A252CliCod, P0A1X4_A371DisFecEnt, P0A1X4_A360DisCliNum, P0A1X4_A4348DisUsrCod, P0A1X4_A367DisEst
            }
            , new Object[] {
            P0A1X5_A396EmprCod, P0A1X5_A279CliNom, P0A1X5_A370DisFecCli, P0A1X5_A369DisFec, P0A1X5_A361DisCod, P0A1X5_A374DisNumPie, P0A1X5_A392DisUniMed, P0A1X5_A375DisNumUni, P0A1X5_A1122MaqCodDis, P0A1X5_n1122MaqCodDis,
            P0A1X5_A1196DisNumCli, P0A1X5_A1195DisNomCli, P0A1X5_A390DisTipCol, P0A1X5_n390DisTipCol, P0A1X5_A363DisColNum, P0A1X5_n363DisColNum, P0A1X5_A362DisColNom, P0A1X5_n362DisColNom, P0A1X5_A337DisArtDsc, P0A1X5_A335DisArtCod,
            P0A1X5_A252CliCod, P0A1X5_A371DisFecEnt, P0A1X5_A4813DisEncCli, P0A1X5_A360DisCliNum, P0A1X5_A4348DisUsrCod, P0A1X5_A367DisEst
            }
            , new Object[] {
            P0A1X6_A396EmprCod, P0A1X6_A335DisArtCod, P0A1X6_A370DisFecCli, P0A1X6_A369DisFec, P0A1X6_A361DisCod, P0A1X6_A374DisNumPie, P0A1X6_A392DisUniMed, P0A1X6_A375DisNumUni, P0A1X6_A1122MaqCodDis, P0A1X6_n1122MaqCodDis,
            P0A1X6_A1196DisNumCli, P0A1X6_A1195DisNomCli, P0A1X6_A390DisTipCol, P0A1X6_n390DisTipCol, P0A1X6_A363DisColNum, P0A1X6_n363DisColNum, P0A1X6_A362DisColNom, P0A1X6_n362DisColNom, P0A1X6_A337DisArtDsc, P0A1X6_A279CliNom,
            P0A1X6_A252CliCod, P0A1X6_A371DisFecEnt, P0A1X6_A4813DisEncCli, P0A1X6_A360DisCliNum, P0A1X6_A4348DisUsrCod, P0A1X6_A367DisEst
            }
            , new Object[] {
            P0A1X7_A396EmprCod, P0A1X7_A337DisArtDsc, P0A1X7_A370DisFecCli, P0A1X7_A369DisFec, P0A1X7_A361DisCod, P0A1X7_A374DisNumPie, P0A1X7_A392DisUniMed, P0A1X7_A375DisNumUni, P0A1X7_A1122MaqCodDis, P0A1X7_n1122MaqCodDis,
            P0A1X7_A1196DisNumCli, P0A1X7_A1195DisNomCli, P0A1X7_A390DisTipCol, P0A1X7_n390DisTipCol, P0A1X7_A363DisColNum, P0A1X7_n363DisColNum, P0A1X7_A362DisColNom, P0A1X7_n362DisColNom, P0A1X7_A335DisArtCod, P0A1X7_A279CliNom,
            P0A1X7_A252CliCod, P0A1X7_A371DisFecEnt, P0A1X7_A4813DisEncCli, P0A1X7_A360DisCliNum, P0A1X7_A4348DisUsrCod, P0A1X7_A367DisEst
            }
            , new Object[] {
            P0A1X8_A396EmprCod, P0A1X8_A362DisColNom, P0A1X8_n362DisColNom, P0A1X8_A370DisFecCli, P0A1X8_A369DisFec, P0A1X8_A361DisCod, P0A1X8_A374DisNumPie, P0A1X8_A392DisUniMed, P0A1X8_A375DisNumUni, P0A1X8_A1122MaqCodDis,
            P0A1X8_n1122MaqCodDis, P0A1X8_A1196DisNumCli, P0A1X8_A1195DisNomCli, P0A1X8_A390DisTipCol, P0A1X8_n390DisTipCol, P0A1X8_A363DisColNum, P0A1X8_n363DisColNum, P0A1X8_A337DisArtDsc, P0A1X8_A335DisArtCod, P0A1X8_A279CliNom,
            P0A1X8_A252CliCod, P0A1X8_A371DisFecEnt, P0A1X8_A4813DisEncCli, P0A1X8_A360DisCliNum, P0A1X8_A4348DisUsrCod, P0A1X8_A367DisEst
            }
            , new Object[] {
            P0A1X9_A396EmprCod, P0A1X9_A1195DisNomCli, P0A1X9_A370DisFecCli, P0A1X9_A369DisFec, P0A1X9_A361DisCod, P0A1X9_A374DisNumPie, P0A1X9_A392DisUniMed, P0A1X9_A375DisNumUni, P0A1X9_A1122MaqCodDis, P0A1X9_n1122MaqCodDis,
            P0A1X9_A1196DisNumCli, P0A1X9_A390DisTipCol, P0A1X9_n390DisTipCol, P0A1X9_A363DisColNum, P0A1X9_n363DisColNum, P0A1X9_A362DisColNom, P0A1X9_n362DisColNom, P0A1X9_A337DisArtDsc, P0A1X9_A335DisArtCod, P0A1X9_A279CliNom,
            P0A1X9_A252CliCod, P0A1X9_A371DisFecEnt, P0A1X9_A4813DisEncCli, P0A1X9_A360DisCliNum, P0A1X9_A4348DisUsrCod, P0A1X9_A367DisEst
            }
            , new Object[] {
            P0A1X10_A396EmprCod, P0A1X10_A1122MaqCodDis, P0A1X10_n1122MaqCodDis, P0A1X10_A370DisFecCli, P0A1X10_A369DisFec, P0A1X10_A361DisCod, P0A1X10_A374DisNumPie, P0A1X10_A392DisUniMed, P0A1X10_A375DisNumUni, P0A1X10_A1196DisNumCli,
            P0A1X10_A1195DisNomCli, P0A1X10_A390DisTipCol, P0A1X10_n390DisTipCol, P0A1X10_A363DisColNum, P0A1X10_n363DisColNum, P0A1X10_A362DisColNom, P0A1X10_n362DisColNom, P0A1X10_A337DisArtDsc, P0A1X10_A335DisArtCod, P0A1X10_A279CliNom,
            P0A1X10_A252CliCod, P0A1X10_A371DisFecEnt, P0A1X10_A4813DisEncCli, P0A1X10_A360DisCliNum, P0A1X10_A4348DisUsrCod, P0A1X10_A367DisEst
            }
            , new Object[] {
            P0A1X11_A396EmprCod, P0A1X11_A392DisUniMed, P0A1X11_A370DisFecCli, P0A1X11_A369DisFec, P0A1X11_A361DisCod, P0A1X11_A374DisNumPie, P0A1X11_A375DisNumUni, P0A1X11_A1122MaqCodDis, P0A1X11_n1122MaqCodDis, P0A1X11_A1196DisNumCli,
            P0A1X11_A1195DisNomCli, P0A1X11_A390DisTipCol, P0A1X11_n390DisTipCol, P0A1X11_A363DisColNum, P0A1X11_n363DisColNum, P0A1X11_A362DisColNom, P0A1X11_n362DisColNom, P0A1X11_A337DisArtDsc, P0A1X11_A335DisArtCod, P0A1X11_A279CliNom,
            P0A1X11_A252CliCod, P0A1X11_A371DisFecEnt, P0A1X11_A4813DisEncCli, P0A1X11_A360DisCliNum, P0A1X11_A4348DisUsrCod, P0A1X11_A367DisEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31TFDisTipCol ;
   private byte AV32TFDisTipCol_To ;
   private byte AV104Pedidos_dis___wwds_23_tfdistipcol ;
   private byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private short AV66TFDisNumPie ;
   private short AV67TFDisNumPie_To ;
   private short AV116Pedidos_dis___wwds_35_tfdisnumpie ;
   private short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ;
   private short A374DisNumPie ;
   private short Gx_err ;
   private int AV80GXV1 ;
   private int AV19TFCliCod ;
   private int AV20TFCliCod_To ;
   private int AV29TFDisColNum ;
   private int AV30TFDisColNum_To ;
   private int AV62TFDisNumCli ;
   private int AV63TFDisNumCli_To ;
   private int AV92Pedidos_dis___wwds_11_tfclicod ;
   private int AV93Pedidos_dis___wwds_12_tfclicod_to ;
   private int AV102Pedidos_dis___wwds_21_tfdiscolnum ;
   private int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ;
   private int AV108Pedidos_dis___wwds_27_tfdisnumcli ;
   private int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ;
   private int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ;
   private int AV75DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int A361DisCod ;
   private long AV41count ;
   private java.math.BigDecimal AV68TFDisNumUni ;
   private java.math.BigDecimal AV69TFDisNumUni_To ;
   private java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ;
   private java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ;
   private java.math.BigDecimal A375DisNumUni ;
   private String AV54TFDisUsrCod ;
   private String AV55TFDisUsrCod_Sel ;
   private String AV56TFDisCliNum ;
   private String AV57TFDisCliNum_Sel ;
   private String AV58TFDisEncCli ;
   private String AV59TFDisEncCli_Sel ;
   private String AV21TFCliNom ;
   private String AV22TFCliNom_Sel ;
   private String AV23TFDisArtCod ;
   private String AV24TFDisArtCod_Sel ;
   private String AV25TFDisArtDsc ;
   private String AV26TFDisArtDsc_Sel ;
   private String AV27TFDisColNom ;
   private String AV28TFDisColNom_Sel ;
   private String AV60TFDisNomCli ;
   private String AV61TFDisNomCli_Sel ;
   private String AV64TFMaqCodDis ;
   private String AV65TFMaqCodDis_Sel ;
   private String AV70TFDisUniMed ;
   private String AV71TFDisUniMed_Sel ;
   private String A4348DisUsrCod ;
   private String AV83Pedidos_dis___wwds_2_tfdisusrcod ;
   private String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ;
   private String AV86Pedidos_dis___wwds_5_tfdisclinum ;
   private String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ;
   private String AV88Pedidos_dis___wwds_7_tfdisenccli ;
   private String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ;
   private String AV94Pedidos_dis___wwds_13_tfclinom ;
   private String AV95Pedidos_dis___wwds_14_tfclinom_sel ;
   private String AV96Pedidos_dis___wwds_15_tfdisartcod ;
   private String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ;
   private String AV98Pedidos_dis___wwds_17_tfdisartdsc ;
   private String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ;
   private String AV100Pedidos_dis___wwds_19_tfdiscolnom ;
   private String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ;
   private String AV106Pedidos_dis___wwds_25_tfdisnomcli ;
   private String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ;
   private String AV110Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ;
   private String AV114Pedidos_dis___wwds_33_tfdisunimed ;
   private String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV83Pedidos_dis___wwds_2_tfdisusrcod ;
   private String lV86Pedidos_dis___wwds_5_tfdisclinum ;
   private String lV88Pedidos_dis___wwds_7_tfdisenccli ;
   private String lV94Pedidos_dis___wwds_13_tfclinom ;
   private String lV96Pedidos_dis___wwds_15_tfdisartcod ;
   private String lV98Pedidos_dis___wwds_17_tfdisartdsc ;
   private String lV100Pedidos_dis___wwds_19_tfdiscolnom ;
   private String lV106Pedidos_dis___wwds_25_tfdisnomcli ;
   private String lV110Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String lV114Pedidos_dis___wwds_33_tfdisunimed ;
   private String A360DisCliNum ;
   private String A4813DisEncCli ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1122MaqCodDis ;
   private String A392DisUniMed ;
   private String A396EmprCod ;
   private java.util.Date AV17TFDisFecEnt ;
   private java.util.Date AV18TFDisFecEnt_To ;
   private java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ;
   private java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ;
   private java.util.Date AV73DisFecFrom ;
   private java.util.Date AV74DisFecto ;
   private java.util.Date AV76DisFeccliFrom ;
   private java.util.Date AV77DisFecclito ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A369DisFec ;
   private java.util.Date A370DisFecCli ;
   private boolean returnInSub ;
   private boolean brkA1X2 ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean brkA1X4 ;
   private boolean brkA1X6 ;
   private boolean brkA1X8 ;
   private boolean brkA1X10 ;
   private boolean brkA1X12 ;
   private boolean brkA1X14 ;
   private boolean brkA1X16 ;
   private boolean brkA1X18 ;
   private boolean brkA1X20 ;
   private String AV50OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV52OptionIndexesJson ;
   private String AV33TFDisEst_SelsJson ;
   private String AV47DDOName ;
   private String AV48SearchTxt ;
   private String AV49SearchTxtTo ;
   private String AV53FilterFullText ;
   private String AV82Pedidos_dis___wwds_1_filterfulltext ;
   private String lV82Pedidos_dis___wwds_1_filterfulltext ;
   private String AV36Option ;
   private String AV38OptionDesc ;
   private GXSimpleCollection<Byte> AV34TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1X2_A396EmprCod ;
   private String[] P0A1X2_A4348DisUsrCod ;
   private java.util.Date[] P0A1X2_A370DisFecCli ;
   private java.util.Date[] P0A1X2_A369DisFec ;
   private int[] P0A1X2_A361DisCod ;
   private short[] P0A1X2_A374DisNumPie ;
   private String[] P0A1X2_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X2_A375DisNumUni ;
   private String[] P0A1X2_A1122MaqCodDis ;
   private boolean[] P0A1X2_n1122MaqCodDis ;
   private int[] P0A1X2_A1196DisNumCli ;
   private String[] P0A1X2_A1195DisNomCli ;
   private byte[] P0A1X2_A390DisTipCol ;
   private boolean[] P0A1X2_n390DisTipCol ;
   private int[] P0A1X2_A363DisColNum ;
   private boolean[] P0A1X2_n363DisColNum ;
   private String[] P0A1X2_A362DisColNom ;
   private boolean[] P0A1X2_n362DisColNom ;
   private String[] P0A1X2_A337DisArtDsc ;
   private String[] P0A1X2_A335DisArtCod ;
   private String[] P0A1X2_A279CliNom ;
   private int[] P0A1X2_A252CliCod ;
   private java.util.Date[] P0A1X2_A371DisFecEnt ;
   private String[] P0A1X2_A4813DisEncCli ;
   private String[] P0A1X2_A360DisCliNum ;
   private byte[] P0A1X2_A367DisEst ;
   private String[] P0A1X3_A396EmprCod ;
   private String[] P0A1X3_A360DisCliNum ;
   private java.util.Date[] P0A1X3_A370DisFecCli ;
   private java.util.Date[] P0A1X3_A369DisFec ;
   private int[] P0A1X3_A361DisCod ;
   private short[] P0A1X3_A374DisNumPie ;
   private String[] P0A1X3_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X3_A375DisNumUni ;
   private String[] P0A1X3_A1122MaqCodDis ;
   private boolean[] P0A1X3_n1122MaqCodDis ;
   private int[] P0A1X3_A1196DisNumCli ;
   private String[] P0A1X3_A1195DisNomCli ;
   private byte[] P0A1X3_A390DisTipCol ;
   private boolean[] P0A1X3_n390DisTipCol ;
   private int[] P0A1X3_A363DisColNum ;
   private boolean[] P0A1X3_n363DisColNum ;
   private String[] P0A1X3_A362DisColNom ;
   private boolean[] P0A1X3_n362DisColNom ;
   private String[] P0A1X3_A337DisArtDsc ;
   private String[] P0A1X3_A335DisArtCod ;
   private String[] P0A1X3_A279CliNom ;
   private int[] P0A1X3_A252CliCod ;
   private java.util.Date[] P0A1X3_A371DisFecEnt ;
   private String[] P0A1X3_A4813DisEncCli ;
   private String[] P0A1X3_A4348DisUsrCod ;
   private byte[] P0A1X3_A367DisEst ;
   private String[] P0A1X4_A396EmprCod ;
   private String[] P0A1X4_A4813DisEncCli ;
   private java.util.Date[] P0A1X4_A370DisFecCli ;
   private java.util.Date[] P0A1X4_A369DisFec ;
   private int[] P0A1X4_A361DisCod ;
   private short[] P0A1X4_A374DisNumPie ;
   private String[] P0A1X4_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X4_A375DisNumUni ;
   private String[] P0A1X4_A1122MaqCodDis ;
   private boolean[] P0A1X4_n1122MaqCodDis ;
   private int[] P0A1X4_A1196DisNumCli ;
   private String[] P0A1X4_A1195DisNomCli ;
   private byte[] P0A1X4_A390DisTipCol ;
   private boolean[] P0A1X4_n390DisTipCol ;
   private int[] P0A1X4_A363DisColNum ;
   private boolean[] P0A1X4_n363DisColNum ;
   private String[] P0A1X4_A362DisColNom ;
   private boolean[] P0A1X4_n362DisColNom ;
   private String[] P0A1X4_A337DisArtDsc ;
   private String[] P0A1X4_A335DisArtCod ;
   private String[] P0A1X4_A279CliNom ;
   private int[] P0A1X4_A252CliCod ;
   private java.util.Date[] P0A1X4_A371DisFecEnt ;
   private String[] P0A1X4_A360DisCliNum ;
   private String[] P0A1X4_A4348DisUsrCod ;
   private byte[] P0A1X4_A367DisEst ;
   private String[] P0A1X5_A396EmprCod ;
   private String[] P0A1X5_A279CliNom ;
   private java.util.Date[] P0A1X5_A370DisFecCli ;
   private java.util.Date[] P0A1X5_A369DisFec ;
   private int[] P0A1X5_A361DisCod ;
   private short[] P0A1X5_A374DisNumPie ;
   private String[] P0A1X5_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X5_A375DisNumUni ;
   private String[] P0A1X5_A1122MaqCodDis ;
   private boolean[] P0A1X5_n1122MaqCodDis ;
   private int[] P0A1X5_A1196DisNumCli ;
   private String[] P0A1X5_A1195DisNomCli ;
   private byte[] P0A1X5_A390DisTipCol ;
   private boolean[] P0A1X5_n390DisTipCol ;
   private int[] P0A1X5_A363DisColNum ;
   private boolean[] P0A1X5_n363DisColNum ;
   private String[] P0A1X5_A362DisColNom ;
   private boolean[] P0A1X5_n362DisColNom ;
   private String[] P0A1X5_A337DisArtDsc ;
   private String[] P0A1X5_A335DisArtCod ;
   private int[] P0A1X5_A252CliCod ;
   private java.util.Date[] P0A1X5_A371DisFecEnt ;
   private String[] P0A1X5_A4813DisEncCli ;
   private String[] P0A1X5_A360DisCliNum ;
   private String[] P0A1X5_A4348DisUsrCod ;
   private byte[] P0A1X5_A367DisEst ;
   private String[] P0A1X6_A396EmprCod ;
   private String[] P0A1X6_A335DisArtCod ;
   private java.util.Date[] P0A1X6_A370DisFecCli ;
   private java.util.Date[] P0A1X6_A369DisFec ;
   private int[] P0A1X6_A361DisCod ;
   private short[] P0A1X6_A374DisNumPie ;
   private String[] P0A1X6_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X6_A375DisNumUni ;
   private String[] P0A1X6_A1122MaqCodDis ;
   private boolean[] P0A1X6_n1122MaqCodDis ;
   private int[] P0A1X6_A1196DisNumCli ;
   private String[] P0A1X6_A1195DisNomCli ;
   private byte[] P0A1X6_A390DisTipCol ;
   private boolean[] P0A1X6_n390DisTipCol ;
   private int[] P0A1X6_A363DisColNum ;
   private boolean[] P0A1X6_n363DisColNum ;
   private String[] P0A1X6_A362DisColNom ;
   private boolean[] P0A1X6_n362DisColNom ;
   private String[] P0A1X6_A337DisArtDsc ;
   private String[] P0A1X6_A279CliNom ;
   private int[] P0A1X6_A252CliCod ;
   private java.util.Date[] P0A1X6_A371DisFecEnt ;
   private String[] P0A1X6_A4813DisEncCli ;
   private String[] P0A1X6_A360DisCliNum ;
   private String[] P0A1X6_A4348DisUsrCod ;
   private byte[] P0A1X6_A367DisEst ;
   private String[] P0A1X7_A396EmprCod ;
   private String[] P0A1X7_A337DisArtDsc ;
   private java.util.Date[] P0A1X7_A370DisFecCli ;
   private java.util.Date[] P0A1X7_A369DisFec ;
   private int[] P0A1X7_A361DisCod ;
   private short[] P0A1X7_A374DisNumPie ;
   private String[] P0A1X7_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X7_A375DisNumUni ;
   private String[] P0A1X7_A1122MaqCodDis ;
   private boolean[] P0A1X7_n1122MaqCodDis ;
   private int[] P0A1X7_A1196DisNumCli ;
   private String[] P0A1X7_A1195DisNomCli ;
   private byte[] P0A1X7_A390DisTipCol ;
   private boolean[] P0A1X7_n390DisTipCol ;
   private int[] P0A1X7_A363DisColNum ;
   private boolean[] P0A1X7_n363DisColNum ;
   private String[] P0A1X7_A362DisColNom ;
   private boolean[] P0A1X7_n362DisColNom ;
   private String[] P0A1X7_A335DisArtCod ;
   private String[] P0A1X7_A279CliNom ;
   private int[] P0A1X7_A252CliCod ;
   private java.util.Date[] P0A1X7_A371DisFecEnt ;
   private String[] P0A1X7_A4813DisEncCli ;
   private String[] P0A1X7_A360DisCliNum ;
   private String[] P0A1X7_A4348DisUsrCod ;
   private byte[] P0A1X7_A367DisEst ;
   private String[] P0A1X8_A396EmprCod ;
   private String[] P0A1X8_A362DisColNom ;
   private boolean[] P0A1X8_n362DisColNom ;
   private java.util.Date[] P0A1X8_A370DisFecCli ;
   private java.util.Date[] P0A1X8_A369DisFec ;
   private int[] P0A1X8_A361DisCod ;
   private short[] P0A1X8_A374DisNumPie ;
   private String[] P0A1X8_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X8_A375DisNumUni ;
   private String[] P0A1X8_A1122MaqCodDis ;
   private boolean[] P0A1X8_n1122MaqCodDis ;
   private int[] P0A1X8_A1196DisNumCli ;
   private String[] P0A1X8_A1195DisNomCli ;
   private byte[] P0A1X8_A390DisTipCol ;
   private boolean[] P0A1X8_n390DisTipCol ;
   private int[] P0A1X8_A363DisColNum ;
   private boolean[] P0A1X8_n363DisColNum ;
   private String[] P0A1X8_A337DisArtDsc ;
   private String[] P0A1X8_A335DisArtCod ;
   private String[] P0A1X8_A279CliNom ;
   private int[] P0A1X8_A252CliCod ;
   private java.util.Date[] P0A1X8_A371DisFecEnt ;
   private String[] P0A1X8_A4813DisEncCli ;
   private String[] P0A1X8_A360DisCliNum ;
   private String[] P0A1X8_A4348DisUsrCod ;
   private byte[] P0A1X8_A367DisEst ;
   private String[] P0A1X9_A396EmprCod ;
   private String[] P0A1X9_A1195DisNomCli ;
   private java.util.Date[] P0A1X9_A370DisFecCli ;
   private java.util.Date[] P0A1X9_A369DisFec ;
   private int[] P0A1X9_A361DisCod ;
   private short[] P0A1X9_A374DisNumPie ;
   private String[] P0A1X9_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X9_A375DisNumUni ;
   private String[] P0A1X9_A1122MaqCodDis ;
   private boolean[] P0A1X9_n1122MaqCodDis ;
   private int[] P0A1X9_A1196DisNumCli ;
   private byte[] P0A1X9_A390DisTipCol ;
   private boolean[] P0A1X9_n390DisTipCol ;
   private int[] P0A1X9_A363DisColNum ;
   private boolean[] P0A1X9_n363DisColNum ;
   private String[] P0A1X9_A362DisColNom ;
   private boolean[] P0A1X9_n362DisColNom ;
   private String[] P0A1X9_A337DisArtDsc ;
   private String[] P0A1X9_A335DisArtCod ;
   private String[] P0A1X9_A279CliNom ;
   private int[] P0A1X9_A252CliCod ;
   private java.util.Date[] P0A1X9_A371DisFecEnt ;
   private String[] P0A1X9_A4813DisEncCli ;
   private String[] P0A1X9_A360DisCliNum ;
   private String[] P0A1X9_A4348DisUsrCod ;
   private byte[] P0A1X9_A367DisEst ;
   private String[] P0A1X10_A396EmprCod ;
   private String[] P0A1X10_A1122MaqCodDis ;
   private boolean[] P0A1X10_n1122MaqCodDis ;
   private java.util.Date[] P0A1X10_A370DisFecCli ;
   private java.util.Date[] P0A1X10_A369DisFec ;
   private int[] P0A1X10_A361DisCod ;
   private short[] P0A1X10_A374DisNumPie ;
   private String[] P0A1X10_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1X10_A375DisNumUni ;
   private int[] P0A1X10_A1196DisNumCli ;
   private String[] P0A1X10_A1195DisNomCli ;
   private byte[] P0A1X10_A390DisTipCol ;
   private boolean[] P0A1X10_n390DisTipCol ;
   private int[] P0A1X10_A363DisColNum ;
   private boolean[] P0A1X10_n363DisColNum ;
   private String[] P0A1X10_A362DisColNom ;
   private boolean[] P0A1X10_n362DisColNom ;
   private String[] P0A1X10_A337DisArtDsc ;
   private String[] P0A1X10_A335DisArtCod ;
   private String[] P0A1X10_A279CliNom ;
   private int[] P0A1X10_A252CliCod ;
   private java.util.Date[] P0A1X10_A371DisFecEnt ;
   private String[] P0A1X10_A4813DisEncCli ;
   private String[] P0A1X10_A360DisCliNum ;
   private String[] P0A1X10_A4348DisUsrCod ;
   private byte[] P0A1X10_A367DisEst ;
   private String[] P0A1X11_A396EmprCod ;
   private String[] P0A1X11_A392DisUniMed ;
   private java.util.Date[] P0A1X11_A370DisFecCli ;
   private java.util.Date[] P0A1X11_A369DisFec ;
   private int[] P0A1X11_A361DisCod ;
   private short[] P0A1X11_A374DisNumPie ;
   private java.math.BigDecimal[] P0A1X11_A375DisNumUni ;
   private String[] P0A1X11_A1122MaqCodDis ;
   private boolean[] P0A1X11_n1122MaqCodDis ;
   private int[] P0A1X11_A1196DisNumCli ;
   private String[] P0A1X11_A1195DisNomCli ;
   private byte[] P0A1X11_A390DisTipCol ;
   private boolean[] P0A1X11_n390DisTipCol ;
   private int[] P0A1X11_A363DisColNum ;
   private boolean[] P0A1X11_n363DisColNum ;
   private String[] P0A1X11_A362DisColNom ;
   private boolean[] P0A1X11_n362DisColNom ;
   private String[] P0A1X11_A337DisArtDsc ;
   private String[] P0A1X11_A335DisArtCod ;
   private String[] P0A1X11_A279CliNom ;
   private int[] P0A1X11_A252CliCod ;
   private java.util.Date[] P0A1X11_A371DisFecEnt ;
   private String[] P0A1X11_A4813DisEncCli ;
   private String[] P0A1X11_A360DisCliNum ;
   private String[] P0A1X11_A4348DisUsrCod ;
   private byte[] P0A1X11_A367DisEst ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV39OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV44GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV45GridStateFilterValue ;
}

final  class dis___wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisUsrCod, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisUsrCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A1X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[39];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisCliNum, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisCliNum" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A1X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEncCli, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisEncCli" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A1X5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[39];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0A1X6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[39];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisArtCod, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0A1X7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[39];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisArtDsc, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisColNom, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtDsc" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P0A1X8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[39];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisColNom, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol," ;
      scmdbuf += " T1.DisColNum, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisColNom" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P0A1X9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV92Pedidos_dis___wwds_11_tfclicod ,
                                          int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV94Pedidos_dis___wwds_13_tfclinom ,
                                          String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV75DisCod ,
                                          java.util.Date AV73DisFecFrom ,
                                          java.util.Date AV74DisFecto ,
                                          java.util.Date AV76DisFeccliFrom ,
                                          java.util.Date AV77DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[39];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisNomCli, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisTipCol, T1.DisColNum," ;
      scmdbuf += " T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisNomCli" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P0A1X10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A367DisEst ,
                                           GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                           String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           int AV92Pedidos_dis___wwds_11_tfclicod ,
                                           int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                           String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           String AV94Pedidos_dis___wwds_13_tfclinom ,
                                           String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                           int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                           byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                           byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                           String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                           int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                           String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                           short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                           int AV75DisCod ,
                                           java.util.Date AV73DisFecFrom ,
                                           java.util.Date AV74DisFecto ,
                                           java.util.Date AV76DisFeccliFrom ,
                                           java.util.Date AV77DisFecclito ,
                                           String A4348DisUsrCod ,
                                           String A360DisCliNum ,
                                           String A4813DisEncCli ,
                                           java.util.Date A371DisFecEnt ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           int A1196DisNumCli ,
                                           String A1122MaqCodDis ,
                                           java.math.BigDecimal A375DisNumUni ,
                                           String A392DisUniMed ,
                                           short A374DisNumPie ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           java.util.Date A370DisFecCli ,
                                           String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[39];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodDis, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum," ;
      scmdbuf += " T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCodDis" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P0A1X11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A367DisEst ,
                                           GXSimpleCollection<Byte> AV85Pedidos_dis___wwds_4_tfdisest_sels ,
                                           String AV84Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           String AV83Pedidos_dis___wwds_2_tfdisusrcod ,
                                           int AV85Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                           String AV87Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           String AV86Pedidos_dis___wwds_5_tfdisclinum ,
                                           String AV89Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           String AV88Pedidos_dis___wwds_7_tfdisenccli ,
                                           java.util.Date AV90Pedidos_dis___wwds_9_tfdisfecent ,
                                           java.util.Date AV91Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           int AV92Pedidos_dis___wwds_11_tfclicod ,
                                           int AV93Pedidos_dis___wwds_12_tfclicod_to ,
                                           String AV95Pedidos_dis___wwds_14_tfclinom_sel ,
                                           String AV94Pedidos_dis___wwds_13_tfclinom ,
                                           String AV97Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           String AV96Pedidos_dis___wwds_15_tfdisartcod ,
                                           String AV99Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           String AV98Pedidos_dis___wwds_17_tfdisartdsc ,
                                           String AV101Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           String AV100Pedidos_dis___wwds_19_tfdiscolnom ,
                                           int AV102Pedidos_dis___wwds_21_tfdiscolnum ,
                                           int AV103Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                           byte AV104Pedidos_dis___wwds_23_tfdistipcol ,
                                           byte AV105Pedidos_dis___wwds_24_tfdistipcol_to ,
                                           String AV107Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           String AV106Pedidos_dis___wwds_25_tfdisnomcli ,
                                           int AV108Pedidos_dis___wwds_27_tfdisnumcli ,
                                           int AV109Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                           String AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           String AV110Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           java.math.BigDecimal AV112Pedidos_dis___wwds_31_tfdisnumuni ,
                                           java.math.BigDecimal AV113Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           String AV115Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           String AV114Pedidos_dis___wwds_33_tfdisunimed ,
                                           short AV116Pedidos_dis___wwds_35_tfdisnumpie ,
                                           short AV117Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                           int AV75DisCod ,
                                           java.util.Date AV73DisFecFrom ,
                                           java.util.Date AV74DisFecto ,
                                           java.util.Date AV76DisFeccliFrom ,
                                           java.util.Date AV77DisFecclito ,
                                           String A4348DisUsrCod ,
                                           String A360DisCliNum ,
                                           String A4813DisEncCli ,
                                           java.util.Date A371DisFecEnt ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           int A1196DisNumCli ,
                                           String A1122MaqCodDis ,
                                           java.math.BigDecimal A375DisNumUni ,
                                           String A392DisUniMed ,
                                           short A374DisNumPie ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           java.util.Date A370DisFecCli ,
                                           String AV82Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[39];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisUniMed, T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum," ;
      scmdbuf += " T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst FROM (TXPDISPOS T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (0==AV102Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (0==AV75DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisUniMed" ;
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
                  return conditional_P0A1X2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 1 :
                  return conditional_P0A1X3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 2 :
                  return conditional_P0A1X4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 3 :
                  return conditional_P0A1X5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 4 :
                  return conditional_P0A1X6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 5 :
                  return conditional_P0A1X7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 6 :
                  return conditional_P0A1X8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 7 :
                  return conditional_P0A1X9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 8 :
                  return conditional_P0A1X10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
            case 9 :
                  return conditional_P0A1X11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (String)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1X11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 20);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 20);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 26);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((String[]) buf[18])[0] = rslt.getString(15, 16);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
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
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
      }
   }

}

