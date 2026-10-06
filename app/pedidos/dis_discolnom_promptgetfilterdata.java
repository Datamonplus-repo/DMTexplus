package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis_discolnom_promptgetfilterdata extends GXProcedure
{
   public dis_discolnom_promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_discolnom_promptgetfilterdata.class ), "" );
   }

   public dis_discolnom_promptgetfilterdata( int remoteHandle ,
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
      dis_discolnom_promptgetfilterdata.this.aP5 = new String[] {""};
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
      dis_discolnom_promptgetfilterdata.this.AV49DDOName = aP0;
      dis_discolnom_promptgetfilterdata.this.AV50SearchTxt = aP1;
      dis_discolnom_promptgetfilterdata.this.AV51SearchTxtTo = aP2;
      dis_discolnom_promptgetfilterdata.this.aP3 = aP3;
      dis_discolnom_promptgetfilterdata.this.aP4 = aP4;
      dis_discolnom_promptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV41OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV49DDOName), "DDO_FORTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORTIPARTDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV49DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV49DDOName), "DDO_FOROPCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADFOROPCCLIOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV52OptionsJson = AV39Options.toJSonString(false) ;
      AV53OptionsDescJson = AV41OptionsDesc.toJSonString(false) ;
      AV54OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV44Session.getValue("Pedidos.Dis_DisColNom_PromptGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis_DisColNom_PromptGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV44Session.getValue("Pedidos.Dis_DisColNom_PromptGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV11TFCliNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV12TFForSer = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV13TFForSerDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV14TFForTipArtDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV15TFForTipArtDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV16TFForColNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV17TFForColNum = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV18TFTipColCod = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV61TFTipColDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV62TFTipColDsc_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV19TFForNomCli = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCLI") == 0 )
         {
            AV20TFForNumCli = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV21TFIntDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV22TFForTonal = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV23TFForFec = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV25TFForUltMod = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV27TFForUltUti = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMARC") == 0 )
         {
            AV29TFForNumArc = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFForNumArc_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFECAPR") == 0 )
         {
            AV31TFForFecApr = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI") == 0 )
         {
            AV33TFForOpcCli = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI_SEL") == 0 )
         {
            AV34TFForOpcCli_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV35TFForNumCol = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFForNumCol_To = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV59TFForBlo_SelsJson = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFForBlo_Sels.fromJSonString(AV59TFForBlo_SelsJson, null);
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFORTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFForTipArtDsc = AV50SearchTxt ;
      AV15TFForTipArtDsc_Sel = "" ;
      AV67Pedidos_dis_discolnom_promptds_1_tfclicod = AV10TFCliCod ;
      AV68Pedidos_dis_discolnom_promptds_2_tfclinom = AV11TFCliNom ;
      AV69Pedidos_dis_discolnom_promptds_3_tfforser = AV12TFForSer ;
      AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV13TFForSerDsc ;
      AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV14TFForTipArtDsc ;
      AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV15TFForTipArtDsc_Sel ;
      AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV16TFForColNom ;
      AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV17TFForColNum ;
      AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV18TFTipColCod ;
      AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV61TFTipColDsc ;
      AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV62TFTipColDsc_Sel ;
      AV78Pedidos_dis_discolnom_promptds_12_tffornomcli = AV19TFForNomCli ;
      AV79Pedidos_dis_discolnom_promptds_13_tffornumcli = AV20TFForNumCli ;
      AV80Pedidos_dis_discolnom_promptds_14_tfintdsc = AV21TFIntDsc ;
      AV81Pedidos_dis_discolnom_promptds_15_tffortonal = AV22TFForTonal ;
      AV82Pedidos_dis_discolnom_promptds_16_tfforfec = AV23TFForFec ;
      AV83Pedidos_dis_discolnom_promptds_17_tfforultmod = AV25TFForUltMod ;
      AV84Pedidos_dis_discolnom_promptds_18_tfforultuti = AV27TFForUltUti ;
      AV85Pedidos_dis_discolnom_promptds_19_tffornumarc = AV29TFForNumArc ;
      AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV30TFForNumArc_To ;
      AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV31TFForFecApr ;
      AV88Pedidos_dis_discolnom_promptds_22_tfforopccli = AV33TFForOpcCli ;
      AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV34TFForOpcCli_Sel ;
      AV90Pedidos_dis_discolnom_promptds_24_tffornumcol = AV35TFForNumCol ;
      AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV36TFForNumCol_To ;
      AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV60TFForBlo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                           Integer.valueOf(AV67Pedidos_dis_discolnom_promptds_1_tfclicod) ,
                                           AV68Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                           AV69Pedidos_dis_discolnom_promptds_3_tfforser ,
                                           AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                           AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                           Integer.valueOf(AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum) ,
                                           Byte.valueOf(AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod) ,
                                           AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                           AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                           AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                           Integer.valueOf(AV79Pedidos_dis_discolnom_promptds_13_tffornumcli) ,
                                           AV81Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                           AV82Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                           AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                           AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                           Integer.valueOf(AV85Pedidos_dis_discolnom_promptds_19_tffornumarc) ,
                                           Integer.valueOf(AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to) ,
                                           AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                           AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                           AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                           Integer.valueOf(AV90Pedidos_dis_discolnom_promptds_24_tffornumcol) ,
                                           Integer.valueOf(AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to) ,
                                           Integer.valueOf(AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A3315ForNumArc) ,
                                           A3558ForFecApr ,
                                           A3560ForOpcCli ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                           AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                           A13929ForTipArtD ,
                                           A10045CliAct ,
                                           AV56EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc), 30, "%") ;
      lV68Pedidos_dis_discolnom_promptds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV68Pedidos_dis_discolnom_promptds_2_tfclinom), 30, "%") ;
      lV69Pedidos_dis_discolnom_promptds_3_tfforser = GXutil.padr( GXutil.rtrim( AV69Pedidos_dis_discolnom_promptds_3_tfforser), 16, "%") ;
      lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc), 26, "%") ;
      lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = GXutil.padr( GXutil.rtrim( AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom), 13, "%") ;
      lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc), 30, "%") ;
      lV78Pedidos_dis_discolnom_promptds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV78Pedidos_dis_discolnom_promptds_12_tffornomcli), 13, "%") ;
      lV81Pedidos_dis_discolnom_promptds_15_tffortonal = GXutil.padr( GXutil.rtrim( AV81Pedidos_dis_discolnom_promptds_15_tffortonal), 20, "%") ;
      lV88Pedidos_dis_discolnom_promptds_22_tfforopccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis_discolnom_promptds_22_tfforopccli), 1, "%") ;
      /* Using cursor P0A1V2 */
      pr_default.execute(0, new Object[] {AV56EmprCod, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc, lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, Integer.valueOf(AV67Pedidos_dis_discolnom_promptds_1_tfclicod), lV68Pedidos_dis_discolnom_promptds_2_tfclinom, lV69Pedidos_dis_discolnom_promptds_3_tfforser, lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc, lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom, Integer.valueOf(AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum), Byte.valueOf(AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod), lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc, AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel, lV78Pedidos_dis_discolnom_promptds_12_tffornomcli, Integer.valueOf(AV79Pedidos_dis_discolnom_promptds_13_tffornumcli), lV81Pedidos_dis_discolnom_promptds_15_tffortonal, AV82Pedidos_dis_discolnom_promptds_16_tfforfec, AV83Pedidos_dis_discolnom_promptds_17_tfforultmod, AV84Pedidos_dis_discolnom_promptds_18_tfforultuti, Integer.valueOf(AV85Pedidos_dis_discolnom_promptds_19_tffornumarc), Integer.valueOf(AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to), AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr, lV88Pedidos_dis_discolnom_promptds_22_tfforopccli, AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel, Integer.valueOf(AV90Pedidos_dis_discolnom_promptds_24_tffornumcol), Integer.valueOf(AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4384ForTipArt = P0A1V2_A4384ForTipArt[0] ;
         n4384ForTipArt = P0A1V2_n4384ForTipArt[0] ;
         A10045CliAct = P0A1V2_A10045CliAct[0] ;
         A396EmprCod = P0A1V2_A396EmprCod[0] ;
         A995ForTonal = P0A1V2_A995ForTonal[0] ;
         n995ForTonal = P0A1V2_n995ForTonal[0] ;
         A1191ForNomCli = P0A1V2_A1191ForNomCli[0] ;
         n1191ForNomCli = P0A1V2_n1191ForNomCli[0] ;
         A482ForColNom = P0A1V2_A482ForColNom[0] ;
         A5742ForSerDsc = P0A1V2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P0A1V2_n5742ForSerDsc[0] ;
         A494ForSer = P0A1V2_A494ForSer[0] ;
         A279CliNom = P0A1V2_A279CliNom[0] ;
         A7781ForBlo = P0A1V2_A7781ForBlo[0] ;
         n7781ForBlo = P0A1V2_n7781ForBlo[0] ;
         A486ForNumCol = P0A1V2_A486ForNumCol[0] ;
         A3560ForOpcCli = P0A1V2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P0A1V2_n3560ForOpcCli[0] ;
         A3558ForFecApr = P0A1V2_A3558ForFecApr[0] ;
         n3558ForFecApr = P0A1V2_n3558ForFecApr[0] ;
         A3315ForNumArc = P0A1V2_A3315ForNumArc[0] ;
         n3315ForNumArc = P0A1V2_n3315ForNumArc[0] ;
         A496ForUltUti = P0A1V2_A496ForUltUti[0] ;
         n496ForUltUti = P0A1V2_n496ForUltUti[0] ;
         A495ForUltMod = P0A1V2_A495ForUltMod[0] ;
         n495ForUltMod = P0A1V2_n495ForUltMod[0] ;
         A485ForFec = P0A1V2_A485ForFec[0] ;
         n485ForFec = P0A1V2_n485ForFec[0] ;
         A1192ForNumCli = P0A1V2_A1192ForNumCli[0] ;
         n1192ForNumCli = P0A1V2_n1192ForNumCli[0] ;
         A832TipColDsc = P0A1V2_A832TipColDsc[0] ;
         n832TipColDsc = P0A1V2_n832TipColDsc[0] ;
         A831TipColCod = P0A1V2_A831TipColCod[0] ;
         A483ForColNum = P0A1V2_A483ForColNum[0] ;
         A252CliCod = P0A1V2_A252CliCod[0] ;
         A13929ForTipArtD = P0A1V2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P0A1V2_n13929ForTipArtD[0] ;
         A13929ForTipArtD = P0A1V2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P0A1V2_n13929ForTipArtD[0] ;
         A832TipColDsc = P0A1V2_A832TipColDsc[0] ;
         n832TipColDsc = P0A1V2_n832TipColDsc[0] ;
         A10045CliAct = P0A1V2_A10045CliAct[0] ;
         A279CliNom = P0A1V2_A279CliNom[0] ;
         if ( ! (GXutil.strcmp("", A13929ForTipArtD)==0) )
         {
            AV38Option = A13929ForTipArtD ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
            {
               AV43count = GXutil.lval( (String)AV42OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
               AV43count = (long)(AV43count+1) ;
               AV42OptionIndexes.removeItem(AV37InsertIndex);
               AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV43count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
            }
            else
            {
               AV39Options.add(AV38Option, AV37InsertIndex);
               AV42OptionIndexes.add("1", AV37InsertIndex);
            }
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV61TFTipColDsc = AV50SearchTxt ;
      AV62TFTipColDsc_Sel = "" ;
      AV67Pedidos_dis_discolnom_promptds_1_tfclicod = AV10TFCliCod ;
      AV68Pedidos_dis_discolnom_promptds_2_tfclinom = AV11TFCliNom ;
      AV69Pedidos_dis_discolnom_promptds_3_tfforser = AV12TFForSer ;
      AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV13TFForSerDsc ;
      AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV14TFForTipArtDsc ;
      AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV15TFForTipArtDsc_Sel ;
      AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV16TFForColNom ;
      AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV17TFForColNum ;
      AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV18TFTipColCod ;
      AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV61TFTipColDsc ;
      AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV62TFTipColDsc_Sel ;
      AV78Pedidos_dis_discolnom_promptds_12_tffornomcli = AV19TFForNomCli ;
      AV79Pedidos_dis_discolnom_promptds_13_tffornumcli = AV20TFForNumCli ;
      AV80Pedidos_dis_discolnom_promptds_14_tfintdsc = AV21TFIntDsc ;
      AV81Pedidos_dis_discolnom_promptds_15_tffortonal = AV22TFForTonal ;
      AV82Pedidos_dis_discolnom_promptds_16_tfforfec = AV23TFForFec ;
      AV83Pedidos_dis_discolnom_promptds_17_tfforultmod = AV25TFForUltMod ;
      AV84Pedidos_dis_discolnom_promptds_18_tfforultuti = AV27TFForUltUti ;
      AV85Pedidos_dis_discolnom_promptds_19_tffornumarc = AV29TFForNumArc ;
      AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV30TFForNumArc_To ;
      AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV31TFForFecApr ;
      AV88Pedidos_dis_discolnom_promptds_22_tfforopccli = AV33TFForOpcCli ;
      AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV34TFForOpcCli_Sel ;
      AV90Pedidos_dis_discolnom_promptds_24_tffornumcol = AV35TFForNumCol ;
      AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV36TFForNumCol_To ;
      AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV60TFForBlo_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                           Integer.valueOf(AV67Pedidos_dis_discolnom_promptds_1_tfclicod) ,
                                           AV68Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                           AV69Pedidos_dis_discolnom_promptds_3_tfforser ,
                                           AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                           AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                           Integer.valueOf(AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum) ,
                                           Byte.valueOf(AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod) ,
                                           AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                           AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                           AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                           Integer.valueOf(AV79Pedidos_dis_discolnom_promptds_13_tffornumcli) ,
                                           AV81Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                           AV82Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                           AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                           AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                           Integer.valueOf(AV85Pedidos_dis_discolnom_promptds_19_tffornumarc) ,
                                           Integer.valueOf(AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to) ,
                                           AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                           AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                           AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                           Integer.valueOf(AV90Pedidos_dis_discolnom_promptds_24_tffornumcol) ,
                                           Integer.valueOf(AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to) ,
                                           Integer.valueOf(AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A3315ForNumArc) ,
                                           A3558ForFecApr ,
                                           A3560ForOpcCli ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                           AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                           A13929ForTipArtD ,
                                           A10045CliAct ,
                                           AV56EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc), 30, "%") ;
      lV68Pedidos_dis_discolnom_promptds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV68Pedidos_dis_discolnom_promptds_2_tfclinom), 30, "%") ;
      lV69Pedidos_dis_discolnom_promptds_3_tfforser = GXutil.padr( GXutil.rtrim( AV69Pedidos_dis_discolnom_promptds_3_tfforser), 16, "%") ;
      lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc), 26, "%") ;
      lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = GXutil.padr( GXutil.rtrim( AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom), 13, "%") ;
      lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc), 30, "%") ;
      lV78Pedidos_dis_discolnom_promptds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV78Pedidos_dis_discolnom_promptds_12_tffornomcli), 13, "%") ;
      lV81Pedidos_dis_discolnom_promptds_15_tffortonal = GXutil.padr( GXutil.rtrim( AV81Pedidos_dis_discolnom_promptds_15_tffortonal), 20, "%") ;
      lV88Pedidos_dis_discolnom_promptds_22_tfforopccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis_discolnom_promptds_22_tfforopccli), 1, "%") ;
      /* Using cursor P0A1V3 */
      pr_default.execute(1, new Object[] {AV56EmprCod, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc, lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, Integer.valueOf(AV67Pedidos_dis_discolnom_promptds_1_tfclicod), lV68Pedidos_dis_discolnom_promptds_2_tfclinom, lV69Pedidos_dis_discolnom_promptds_3_tfforser, lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc, lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom, Integer.valueOf(AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum), Byte.valueOf(AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod), lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc, AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel, lV78Pedidos_dis_discolnom_promptds_12_tffornomcli, Integer.valueOf(AV79Pedidos_dis_discolnom_promptds_13_tffornumcli), lV81Pedidos_dis_discolnom_promptds_15_tffortonal, AV82Pedidos_dis_discolnom_promptds_16_tfforfec, AV83Pedidos_dis_discolnom_promptds_17_tfforultmod, AV84Pedidos_dis_discolnom_promptds_18_tfforultuti, Integer.valueOf(AV85Pedidos_dis_discolnom_promptds_19_tffornumarc), Integer.valueOf(AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to), AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr, lV88Pedidos_dis_discolnom_promptds_22_tfforopccli, AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel, Integer.valueOf(AV90Pedidos_dis_discolnom_promptds_24_tffornumcol), Integer.valueOf(AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA1V3 = false ;
         A4384ForTipArt = P0A1V3_A4384ForTipArt[0] ;
         n4384ForTipArt = P0A1V3_n4384ForTipArt[0] ;
         A831TipColCod = P0A1V3_A831TipColCod[0] ;
         A396EmprCod = P0A1V3_A396EmprCod[0] ;
         A10045CliAct = P0A1V3_A10045CliAct[0] ;
         A995ForTonal = P0A1V3_A995ForTonal[0] ;
         n995ForTonal = P0A1V3_n995ForTonal[0] ;
         A1191ForNomCli = P0A1V3_A1191ForNomCli[0] ;
         n1191ForNomCli = P0A1V3_n1191ForNomCli[0] ;
         A482ForColNom = P0A1V3_A482ForColNom[0] ;
         A5742ForSerDsc = P0A1V3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P0A1V3_n5742ForSerDsc[0] ;
         A494ForSer = P0A1V3_A494ForSer[0] ;
         A279CliNom = P0A1V3_A279CliNom[0] ;
         A7781ForBlo = P0A1V3_A7781ForBlo[0] ;
         n7781ForBlo = P0A1V3_n7781ForBlo[0] ;
         A486ForNumCol = P0A1V3_A486ForNumCol[0] ;
         A3560ForOpcCli = P0A1V3_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P0A1V3_n3560ForOpcCli[0] ;
         A3558ForFecApr = P0A1V3_A3558ForFecApr[0] ;
         n3558ForFecApr = P0A1V3_n3558ForFecApr[0] ;
         A3315ForNumArc = P0A1V3_A3315ForNumArc[0] ;
         n3315ForNumArc = P0A1V3_n3315ForNumArc[0] ;
         A496ForUltUti = P0A1V3_A496ForUltUti[0] ;
         n496ForUltUti = P0A1V3_n496ForUltUti[0] ;
         A495ForUltMod = P0A1V3_A495ForUltMod[0] ;
         n495ForUltMod = P0A1V3_n495ForUltMod[0] ;
         A485ForFec = P0A1V3_A485ForFec[0] ;
         n485ForFec = P0A1V3_n485ForFec[0] ;
         A1192ForNumCli = P0A1V3_A1192ForNumCli[0] ;
         n1192ForNumCli = P0A1V3_n1192ForNumCli[0] ;
         A832TipColDsc = P0A1V3_A832TipColDsc[0] ;
         n832TipColDsc = P0A1V3_n832TipColDsc[0] ;
         A483ForColNum = P0A1V3_A483ForColNum[0] ;
         A252CliCod = P0A1V3_A252CliCod[0] ;
         A13929ForTipArtD = P0A1V3_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P0A1V3_n13929ForTipArtD[0] ;
         A832TipColDsc = P0A1V3_A832TipColDsc[0] ;
         n832TipColDsc = P0A1V3_n832TipColDsc[0] ;
         A13929ForTipArtD = P0A1V3_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P0A1V3_n13929ForTipArtD[0] ;
         A10045CliAct = P0A1V3_A10045CliAct[0] ;
         A279CliNom = P0A1V3_A279CliNom[0] ;
         AV43count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A1V3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A1V3_A831TipColCod[0] == A831TipColCod ) )
         {
            brkA1V3 = false ;
            A482ForColNom = P0A1V3_A482ForColNom[0] ;
            A494ForSer = P0A1V3_A494ForSer[0] ;
            A483ForColNum = P0A1V3_A483ForColNum[0] ;
            A252CliCod = P0A1V3_A252CliCod[0] ;
            AV43count = (long)(AV43count+1) ;
            brkA1V3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV38Option = A832TipColDsc ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            AV39Options.add(AV38Option, AV37InsertIndex);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV43count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA1V3 )
         {
            brkA1V3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFOROPCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV33TFForOpcCli = AV50SearchTxt ;
      AV34TFForOpcCli_Sel = "" ;
      AV67Pedidos_dis_discolnom_promptds_1_tfclicod = AV10TFCliCod ;
      AV68Pedidos_dis_discolnom_promptds_2_tfclinom = AV11TFCliNom ;
      AV69Pedidos_dis_discolnom_promptds_3_tfforser = AV12TFForSer ;
      AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = AV13TFForSerDsc ;
      AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = AV14TFForTipArtDsc ;
      AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = AV15TFForTipArtDsc_Sel ;
      AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = AV16TFForColNom ;
      AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum = AV17TFForColNum ;
      AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod = AV18TFTipColCod ;
      AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = AV61TFTipColDsc ;
      AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = AV62TFTipColDsc_Sel ;
      AV78Pedidos_dis_discolnom_promptds_12_tffornomcli = AV19TFForNomCli ;
      AV79Pedidos_dis_discolnom_promptds_13_tffornumcli = AV20TFForNumCli ;
      AV80Pedidos_dis_discolnom_promptds_14_tfintdsc = AV21TFIntDsc ;
      AV81Pedidos_dis_discolnom_promptds_15_tffortonal = AV22TFForTonal ;
      AV82Pedidos_dis_discolnom_promptds_16_tfforfec = AV23TFForFec ;
      AV83Pedidos_dis_discolnom_promptds_17_tfforultmod = AV25TFForUltMod ;
      AV84Pedidos_dis_discolnom_promptds_18_tfforultuti = AV27TFForUltUti ;
      AV85Pedidos_dis_discolnom_promptds_19_tffornumarc = AV29TFForNumArc ;
      AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to = AV30TFForNumArc_To ;
      AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr = AV31TFForFecApr ;
      AV88Pedidos_dis_discolnom_promptds_22_tfforopccli = AV33TFForOpcCli ;
      AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = AV34TFForOpcCli_Sel ;
      AV90Pedidos_dis_discolnom_promptds_24_tffornumcol = AV35TFForNumCol ;
      AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to = AV36TFForNumCol_To ;
      AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels = AV60TFForBlo_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                           Integer.valueOf(AV67Pedidos_dis_discolnom_promptds_1_tfclicod) ,
                                           AV68Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                           AV69Pedidos_dis_discolnom_promptds_3_tfforser ,
                                           AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                           AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                           Integer.valueOf(AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum) ,
                                           Byte.valueOf(AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod) ,
                                           AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                           AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                           AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                           Integer.valueOf(AV79Pedidos_dis_discolnom_promptds_13_tffornumcli) ,
                                           AV81Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                           AV82Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                           AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                           AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                           Integer.valueOf(AV85Pedidos_dis_discolnom_promptds_19_tffornumarc) ,
                                           Integer.valueOf(AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to) ,
                                           AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                           AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                           AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                           Integer.valueOf(AV90Pedidos_dis_discolnom_promptds_24_tffornumcol) ,
                                           Integer.valueOf(AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to) ,
                                           Integer.valueOf(AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1191ForNomCli ,
                                           Integer.valueOf(A1192ForNumCli) ,
                                           A995ForTonal ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A3315ForNumArc) ,
                                           A3558ForFecApr ,
                                           A3560ForOpcCli ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                           AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                           A13929ForTipArtD ,
                                           A396EmprCod ,
                                           AV56EmprCod ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc), 30, "%") ;
      lV68Pedidos_dis_discolnom_promptds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV68Pedidos_dis_discolnom_promptds_2_tfclinom), 30, "%") ;
      lV69Pedidos_dis_discolnom_promptds_3_tfforser = GXutil.padr( GXutil.rtrim( AV69Pedidos_dis_discolnom_promptds_3_tfforser), 16, "%") ;
      lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = GXutil.padr( GXutil.rtrim( AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc), 26, "%") ;
      lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = GXutil.padr( GXutil.rtrim( AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom), 13, "%") ;
      lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc), 30, "%") ;
      lV78Pedidos_dis_discolnom_promptds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV78Pedidos_dis_discolnom_promptds_12_tffornomcli), 13, "%") ;
      lV81Pedidos_dis_discolnom_promptds_15_tffortonal = GXutil.padr( GXutil.rtrim( AV81Pedidos_dis_discolnom_promptds_15_tffortonal), 20, "%") ;
      lV88Pedidos_dis_discolnom_promptds_22_tfforopccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis_discolnom_promptds_22_tfforopccli), 1, "%") ;
      /* Using cursor P0A1V4 */
      pr_default.execute(2, new Object[] {AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc, lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel, AV56EmprCod, Integer.valueOf(AV67Pedidos_dis_discolnom_promptds_1_tfclicod), lV68Pedidos_dis_discolnom_promptds_2_tfclinom, lV69Pedidos_dis_discolnom_promptds_3_tfforser, lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc, lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom, Integer.valueOf(AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum), Byte.valueOf(AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod), lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc, AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel, lV78Pedidos_dis_discolnom_promptds_12_tffornomcli, Integer.valueOf(AV79Pedidos_dis_discolnom_promptds_13_tffornumcli), lV81Pedidos_dis_discolnom_promptds_15_tffortonal, AV82Pedidos_dis_discolnom_promptds_16_tfforfec, AV83Pedidos_dis_discolnom_promptds_17_tfforultmod, AV84Pedidos_dis_discolnom_promptds_18_tfforultuti, Integer.valueOf(AV85Pedidos_dis_discolnom_promptds_19_tffornumarc), Integer.valueOf(AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to), AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr, lV88Pedidos_dis_discolnom_promptds_22_tfforopccli, AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel, Integer.valueOf(AV90Pedidos_dis_discolnom_promptds_24_tffornumcol), Integer.valueOf(AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA1V5 = false ;
         A4384ForTipArt = P0A1V4_A4384ForTipArt[0] ;
         n4384ForTipArt = P0A1V4_n4384ForTipArt[0] ;
         A396EmprCod = P0A1V4_A396EmprCod[0] ;
         A10045CliAct = P0A1V4_A10045CliAct[0] ;
         A3560ForOpcCli = P0A1V4_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P0A1V4_n3560ForOpcCli[0] ;
         A995ForTonal = P0A1V4_A995ForTonal[0] ;
         n995ForTonal = P0A1V4_n995ForTonal[0] ;
         A1191ForNomCli = P0A1V4_A1191ForNomCli[0] ;
         n1191ForNomCli = P0A1V4_n1191ForNomCli[0] ;
         A482ForColNom = P0A1V4_A482ForColNom[0] ;
         A5742ForSerDsc = P0A1V4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P0A1V4_n5742ForSerDsc[0] ;
         A494ForSer = P0A1V4_A494ForSer[0] ;
         A279CliNom = P0A1V4_A279CliNom[0] ;
         A7781ForBlo = P0A1V4_A7781ForBlo[0] ;
         n7781ForBlo = P0A1V4_n7781ForBlo[0] ;
         A486ForNumCol = P0A1V4_A486ForNumCol[0] ;
         A3558ForFecApr = P0A1V4_A3558ForFecApr[0] ;
         n3558ForFecApr = P0A1V4_n3558ForFecApr[0] ;
         A3315ForNumArc = P0A1V4_A3315ForNumArc[0] ;
         n3315ForNumArc = P0A1V4_n3315ForNumArc[0] ;
         A496ForUltUti = P0A1V4_A496ForUltUti[0] ;
         n496ForUltUti = P0A1V4_n496ForUltUti[0] ;
         A495ForUltMod = P0A1V4_A495ForUltMod[0] ;
         n495ForUltMod = P0A1V4_n495ForUltMod[0] ;
         A485ForFec = P0A1V4_A485ForFec[0] ;
         n485ForFec = P0A1V4_n485ForFec[0] ;
         A1192ForNumCli = P0A1V4_A1192ForNumCli[0] ;
         n1192ForNumCli = P0A1V4_n1192ForNumCli[0] ;
         A832TipColDsc = P0A1V4_A832TipColDsc[0] ;
         n832TipColDsc = P0A1V4_n832TipColDsc[0] ;
         A831TipColCod = P0A1V4_A831TipColCod[0] ;
         A483ForColNum = P0A1V4_A483ForColNum[0] ;
         A252CliCod = P0A1V4_A252CliCod[0] ;
         A13929ForTipArtD = P0A1V4_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P0A1V4_n13929ForTipArtD[0] ;
         A13929ForTipArtD = P0A1V4_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P0A1V4_n13929ForTipArtD[0] ;
         A832TipColDsc = P0A1V4_A832TipColDsc[0] ;
         n832TipColDsc = P0A1V4_n832TipColDsc[0] ;
         A10045CliAct = P0A1V4_A10045CliAct[0] ;
         A279CliNom = P0A1V4_A279CliNom[0] ;
         AV43count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A1V4_A3560ForOpcCli[0], A3560ForOpcCli) == 0 ) )
         {
            brkA1V5 = false ;
            A396EmprCod = P0A1V4_A396EmprCod[0] ;
            A482ForColNom = P0A1V4_A482ForColNom[0] ;
            A494ForSer = P0A1V4_A494ForSer[0] ;
            A831TipColCod = P0A1V4_A831TipColCod[0] ;
            A483ForColNum = P0A1V4_A483ForColNum[0] ;
            A252CliCod = P0A1V4_A252CliCod[0] ;
            AV43count = (long)(AV43count+1) ;
            brkA1V5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3560ForOpcCli)==0) )
         {
            AV38Option = A3560ForOpcCli ;
            AV40OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!"))) ;
            AV39Options.add(AV38Option, 0);
            AV41OptionsDesc.add(AV40OptionDesc, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV43count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA1V5 )
         {
            brkA1V5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = dis_discolnom_promptgetfilterdata.this.AV52OptionsJson;
      this.aP4[0] = dis_discolnom_promptgetfilterdata.this.AV53OptionsDescJson;
      this.aP5[0] = dis_discolnom_promptgetfilterdata.this.AV54OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV52OptionsJson = "" ;
      AV53OptionsDescJson = "" ;
      AV54OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44Session = httpContext.getWebSession();
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV11TFCliNom = "" ;
      AV12TFForSer = "" ;
      AV13TFForSerDsc = "" ;
      AV14TFForTipArtDsc = "" ;
      AV15TFForTipArtDsc_Sel = "" ;
      AV16TFForColNom = "" ;
      AV61TFTipColDsc = "" ;
      AV62TFTipColDsc_Sel = "" ;
      AV19TFForNomCli = "" ;
      AV21TFIntDsc = "" ;
      AV22TFForTonal = "" ;
      AV23TFForFec = GXutil.nullDate() ;
      AV25TFForUltMod = GXutil.nullDate() ;
      AV27TFForUltUti = GXutil.nullDate() ;
      AV31TFForFecApr = GXutil.nullDate() ;
      AV33TFForOpcCli = "" ;
      AV34TFForOpcCli_Sel = "" ;
      AV59TFForBlo_SelsJson = "" ;
      AV60TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A13929ForTipArtD = "" ;
      AV68Pedidos_dis_discolnom_promptds_2_tfclinom = "" ;
      AV69Pedidos_dis_discolnom_promptds_3_tfforser = "" ;
      AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = "" ;
      AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = "" ;
      AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel = "" ;
      AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = "" ;
      AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = "" ;
      AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel = "" ;
      AV78Pedidos_dis_discolnom_promptds_12_tffornomcli = "" ;
      AV80Pedidos_dis_discolnom_promptds_14_tfintdsc = "" ;
      AV81Pedidos_dis_discolnom_promptds_15_tffortonal = "" ;
      AV82Pedidos_dis_discolnom_promptds_16_tfforfec = GXutil.nullDate() ;
      AV83Pedidos_dis_discolnom_promptds_17_tfforultmod = GXutil.nullDate() ;
      AV84Pedidos_dis_discolnom_promptds_18_tfforultuti = GXutil.nullDate() ;
      AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr = GXutil.nullDate() ;
      AV88Pedidos_dis_discolnom_promptds_22_tfforopccli = "" ;
      AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel = "" ;
      AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc = "" ;
      scmdbuf = "" ;
      lV68Pedidos_dis_discolnom_promptds_2_tfclinom = "" ;
      lV69Pedidos_dis_discolnom_promptds_3_tfforser = "" ;
      lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc = "" ;
      lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom = "" ;
      lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc = "" ;
      lV78Pedidos_dis_discolnom_promptds_12_tffornomcli = "" ;
      lV81Pedidos_dis_discolnom_promptds_15_tffortonal = "" ;
      lV88Pedidos_dis_discolnom_promptds_22_tfforopccli = "" ;
      A7781ForBlo = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A3558ForFecApr = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      A10045CliAct = "" ;
      AV56EmprCod = "" ;
      A396EmprCod = "" ;
      P0A1V2_A829TipArtCod = new short[1] ;
      P0A1V2_A4384ForTipArt = new short[1] ;
      P0A1V2_n4384ForTipArt = new boolean[] {false} ;
      P0A1V2_A10045CliAct = new String[] {""} ;
      P0A1V2_A396EmprCod = new String[] {""} ;
      P0A1V2_A995ForTonal = new String[] {""} ;
      P0A1V2_n995ForTonal = new boolean[] {false} ;
      P0A1V2_A1191ForNomCli = new String[] {""} ;
      P0A1V2_n1191ForNomCli = new boolean[] {false} ;
      P0A1V2_A482ForColNom = new String[] {""} ;
      P0A1V2_A5742ForSerDsc = new String[] {""} ;
      P0A1V2_n5742ForSerDsc = new boolean[] {false} ;
      P0A1V2_A494ForSer = new String[] {""} ;
      P0A1V2_A279CliNom = new String[] {""} ;
      P0A1V2_A7781ForBlo = new String[] {""} ;
      P0A1V2_n7781ForBlo = new boolean[] {false} ;
      P0A1V2_A486ForNumCol = new int[1] ;
      P0A1V2_A3560ForOpcCli = new String[] {""} ;
      P0A1V2_n3560ForOpcCli = new boolean[] {false} ;
      P0A1V2_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V2_n3558ForFecApr = new boolean[] {false} ;
      P0A1V2_A3315ForNumArc = new int[1] ;
      P0A1V2_n3315ForNumArc = new boolean[] {false} ;
      P0A1V2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V2_n496ForUltUti = new boolean[] {false} ;
      P0A1V2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V2_n495ForUltMod = new boolean[] {false} ;
      P0A1V2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V2_n485ForFec = new boolean[] {false} ;
      P0A1V2_A1192ForNumCli = new int[1] ;
      P0A1V2_n1192ForNumCli = new boolean[] {false} ;
      P0A1V2_A832TipColDsc = new String[] {""} ;
      P0A1V2_n832TipColDsc = new boolean[] {false} ;
      P0A1V2_A831TipColCod = new byte[1] ;
      P0A1V2_A483ForColNum = new int[1] ;
      P0A1V2_A252CliCod = new int[1] ;
      P0A1V2_A13929ForTipArtD = new String[] {""} ;
      P0A1V2_n13929ForTipArtD = new boolean[] {false} ;
      AV38Option = "" ;
      P0A1V3_A829TipArtCod = new short[1] ;
      P0A1V3_A4384ForTipArt = new short[1] ;
      P0A1V3_n4384ForTipArt = new boolean[] {false} ;
      P0A1V3_A831TipColCod = new byte[1] ;
      P0A1V3_A396EmprCod = new String[] {""} ;
      P0A1V3_A10045CliAct = new String[] {""} ;
      P0A1V3_A995ForTonal = new String[] {""} ;
      P0A1V3_n995ForTonal = new boolean[] {false} ;
      P0A1V3_A1191ForNomCli = new String[] {""} ;
      P0A1V3_n1191ForNomCli = new boolean[] {false} ;
      P0A1V3_A482ForColNom = new String[] {""} ;
      P0A1V3_A5742ForSerDsc = new String[] {""} ;
      P0A1V3_n5742ForSerDsc = new boolean[] {false} ;
      P0A1V3_A494ForSer = new String[] {""} ;
      P0A1V3_A279CliNom = new String[] {""} ;
      P0A1V3_A7781ForBlo = new String[] {""} ;
      P0A1V3_n7781ForBlo = new boolean[] {false} ;
      P0A1V3_A486ForNumCol = new int[1] ;
      P0A1V3_A3560ForOpcCli = new String[] {""} ;
      P0A1V3_n3560ForOpcCli = new boolean[] {false} ;
      P0A1V3_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V3_n3558ForFecApr = new boolean[] {false} ;
      P0A1V3_A3315ForNumArc = new int[1] ;
      P0A1V3_n3315ForNumArc = new boolean[] {false} ;
      P0A1V3_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V3_n496ForUltUti = new boolean[] {false} ;
      P0A1V3_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V3_n495ForUltMod = new boolean[] {false} ;
      P0A1V3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V3_n485ForFec = new boolean[] {false} ;
      P0A1V3_A1192ForNumCli = new int[1] ;
      P0A1V3_n1192ForNumCli = new boolean[] {false} ;
      P0A1V3_A832TipColDsc = new String[] {""} ;
      P0A1V3_n832TipColDsc = new boolean[] {false} ;
      P0A1V3_A483ForColNum = new int[1] ;
      P0A1V3_A252CliCod = new int[1] ;
      P0A1V3_A13929ForTipArtD = new String[] {""} ;
      P0A1V3_n13929ForTipArtD = new boolean[] {false} ;
      P0A1V4_A829TipArtCod = new short[1] ;
      P0A1V4_A4384ForTipArt = new short[1] ;
      P0A1V4_n4384ForTipArt = new boolean[] {false} ;
      P0A1V4_A396EmprCod = new String[] {""} ;
      P0A1V4_A10045CliAct = new String[] {""} ;
      P0A1V4_A3560ForOpcCli = new String[] {""} ;
      P0A1V4_n3560ForOpcCli = new boolean[] {false} ;
      P0A1V4_A995ForTonal = new String[] {""} ;
      P0A1V4_n995ForTonal = new boolean[] {false} ;
      P0A1V4_A1191ForNomCli = new String[] {""} ;
      P0A1V4_n1191ForNomCli = new boolean[] {false} ;
      P0A1V4_A482ForColNom = new String[] {""} ;
      P0A1V4_A5742ForSerDsc = new String[] {""} ;
      P0A1V4_n5742ForSerDsc = new boolean[] {false} ;
      P0A1V4_A494ForSer = new String[] {""} ;
      P0A1V4_A279CliNom = new String[] {""} ;
      P0A1V4_A7781ForBlo = new String[] {""} ;
      P0A1V4_n7781ForBlo = new boolean[] {false} ;
      P0A1V4_A486ForNumCol = new int[1] ;
      P0A1V4_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V4_n3558ForFecApr = new boolean[] {false} ;
      P0A1V4_A3315ForNumArc = new int[1] ;
      P0A1V4_n3315ForNumArc = new boolean[] {false} ;
      P0A1V4_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V4_n496ForUltUti = new boolean[] {false} ;
      P0A1V4_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V4_n495ForUltMod = new boolean[] {false} ;
      P0A1V4_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1V4_n485ForFec = new boolean[] {false} ;
      P0A1V4_A1192ForNumCli = new int[1] ;
      P0A1V4_n1192ForNumCli = new boolean[] {false} ;
      P0A1V4_A832TipColDsc = new String[] {""} ;
      P0A1V4_n832TipColDsc = new boolean[] {false} ;
      P0A1V4_A831TipColCod = new byte[1] ;
      P0A1V4_A483ForColNum = new int[1] ;
      P0A1V4_A252CliCod = new int[1] ;
      P0A1V4_A13929ForTipArtD = new String[] {""} ;
      P0A1V4_n13929ForTipArtD = new boolean[] {false} ;
      AV40OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis_discolnom_promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A1V2_A829TipArtCod, P0A1V2_A4384ForTipArt, P0A1V2_n4384ForTipArt, P0A1V2_A10045CliAct, P0A1V2_A396EmprCod, P0A1V2_A995ForTonal, P0A1V2_n995ForTonal, P0A1V2_A1191ForNomCli, P0A1V2_n1191ForNomCli, P0A1V2_A482ForColNom,
            P0A1V2_A5742ForSerDsc, P0A1V2_n5742ForSerDsc, P0A1V2_A494ForSer, P0A1V2_A279CliNom, P0A1V2_A7781ForBlo, P0A1V2_n7781ForBlo, P0A1V2_A486ForNumCol, P0A1V2_A3560ForOpcCli, P0A1V2_n3560ForOpcCli, P0A1V2_A3558ForFecApr,
            P0A1V2_n3558ForFecApr, P0A1V2_A3315ForNumArc, P0A1V2_n3315ForNumArc, P0A1V2_A496ForUltUti, P0A1V2_n496ForUltUti, P0A1V2_A495ForUltMod, P0A1V2_n495ForUltMod, P0A1V2_A485ForFec, P0A1V2_n485ForFec, P0A1V2_A1192ForNumCli,
            P0A1V2_n1192ForNumCli, P0A1V2_A832TipColDsc, P0A1V2_n832TipColDsc, P0A1V2_A831TipColCod, P0A1V2_A483ForColNum, P0A1V2_A252CliCod, P0A1V2_A13929ForTipArtD, P0A1V2_n13929ForTipArtD
            }
            , new Object[] {
            P0A1V3_A829TipArtCod, P0A1V3_A4384ForTipArt, P0A1V3_n4384ForTipArt, P0A1V3_A831TipColCod, P0A1V3_A396EmprCod, P0A1V3_A10045CliAct, P0A1V3_A995ForTonal, P0A1V3_n995ForTonal, P0A1V3_A1191ForNomCli, P0A1V3_n1191ForNomCli,
            P0A1V3_A482ForColNom, P0A1V3_A5742ForSerDsc, P0A1V3_n5742ForSerDsc, P0A1V3_A494ForSer, P0A1V3_A279CliNom, P0A1V3_A7781ForBlo, P0A1V3_n7781ForBlo, P0A1V3_A486ForNumCol, P0A1V3_A3560ForOpcCli, P0A1V3_n3560ForOpcCli,
            P0A1V3_A3558ForFecApr, P0A1V3_n3558ForFecApr, P0A1V3_A3315ForNumArc, P0A1V3_n3315ForNumArc, P0A1V3_A496ForUltUti, P0A1V3_n496ForUltUti, P0A1V3_A495ForUltMod, P0A1V3_n495ForUltMod, P0A1V3_A485ForFec, P0A1V3_n485ForFec,
            P0A1V3_A1192ForNumCli, P0A1V3_n1192ForNumCli, P0A1V3_A832TipColDsc, P0A1V3_n832TipColDsc, P0A1V3_A483ForColNum, P0A1V3_A252CliCod, P0A1V3_A13929ForTipArtD, P0A1V3_n13929ForTipArtD
            }
            , new Object[] {
            P0A1V4_A829TipArtCod, P0A1V4_A4384ForTipArt, P0A1V4_n4384ForTipArt, P0A1V4_A396EmprCod, P0A1V4_A10045CliAct, P0A1V4_A3560ForOpcCli, P0A1V4_n3560ForOpcCli, P0A1V4_A995ForTonal, P0A1V4_n995ForTonal, P0A1V4_A1191ForNomCli,
            P0A1V4_n1191ForNomCli, P0A1V4_A482ForColNom, P0A1V4_A5742ForSerDsc, P0A1V4_n5742ForSerDsc, P0A1V4_A494ForSer, P0A1V4_A279CliNom, P0A1V4_A7781ForBlo, P0A1V4_n7781ForBlo, P0A1V4_A486ForNumCol, P0A1V4_A3558ForFecApr,
            P0A1V4_n3558ForFecApr, P0A1V4_A3315ForNumArc, P0A1V4_n3315ForNumArc, P0A1V4_A496ForUltUti, P0A1V4_n496ForUltUti, P0A1V4_A495ForUltMod, P0A1V4_n495ForUltMod, P0A1V4_A485ForFec, P0A1V4_n485ForFec, P0A1V4_A1192ForNumCli,
            P0A1V4_n1192ForNumCli, P0A1V4_A832TipColDsc, P0A1V4_n832TipColDsc, P0A1V4_A831TipColCod, P0A1V4_A483ForColNum, P0A1V4_A252CliCod, P0A1V4_A13929ForTipArtD, P0A1V4_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFTipColCod ;
   private byte AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod ;
   private byte A831TipColCod ;
   private short A4384ForTipArt ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV10TFCliCod ;
   private int AV17TFForColNum ;
   private int AV20TFForNumCli ;
   private int AV29TFForNumArc ;
   private int AV30TFForNumArc_To ;
   private int AV35TFForNumCol ;
   private int AV36TFForNumCol_To ;
   private int AV67Pedidos_dis_discolnom_promptds_1_tfclicod ;
   private int AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum ;
   private int AV79Pedidos_dis_discolnom_promptds_13_tffornumcli ;
   private int AV85Pedidos_dis_discolnom_promptds_19_tffornumarc ;
   private int AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to ;
   private int AV90Pedidos_dis_discolnom_promptds_24_tffornumcol ;
   private int AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to ;
   private int AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int A486ForNumCol ;
   private int AV37InsertIndex ;
   private long AV43count ;
   private String AV11TFCliNom ;
   private String AV12TFForSer ;
   private String AV13TFForSerDsc ;
   private String AV14TFForTipArtDsc ;
   private String AV15TFForTipArtDsc_Sel ;
   private String AV16TFForColNom ;
   private String AV61TFTipColDsc ;
   private String AV62TFTipColDsc_Sel ;
   private String AV19TFForNomCli ;
   private String AV21TFIntDsc ;
   private String AV22TFForTonal ;
   private String AV33TFForOpcCli ;
   private String AV34TFForOpcCli_Sel ;
   private String A13929ForTipArtD ;
   private String AV68Pedidos_dis_discolnom_promptds_2_tfclinom ;
   private String AV69Pedidos_dis_discolnom_promptds_3_tfforser ;
   private String AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ;
   private String AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ;
   private String AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ;
   private String AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ;
   private String AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ;
   private String AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ;
   private String AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ;
   private String AV80Pedidos_dis_discolnom_promptds_14_tfintdsc ;
   private String AV81Pedidos_dis_discolnom_promptds_15_tffortonal ;
   private String AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ;
   private String AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ;
   private String lV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ;
   private String scmdbuf ;
   private String lV68Pedidos_dis_discolnom_promptds_2_tfclinom ;
   private String lV69Pedidos_dis_discolnom_promptds_3_tfforser ;
   private String lV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ;
   private String lV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ;
   private String lV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ;
   private String lV78Pedidos_dis_discolnom_promptds_12_tffornomcli ;
   private String lV81Pedidos_dis_discolnom_promptds_15_tffortonal ;
   private String lV88Pedidos_dis_discolnom_promptds_22_tfforopccli ;
   private String A7781ForBlo ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A3560ForOpcCli ;
   private String A10045CliAct ;
   private String AV56EmprCod ;
   private String A396EmprCod ;
   private java.util.Date AV23TFForFec ;
   private java.util.Date AV25TFForUltMod ;
   private java.util.Date AV27TFForUltUti ;
   private java.util.Date AV31TFForFecApr ;
   private java.util.Date AV82Pedidos_dis_discolnom_promptds_16_tfforfec ;
   private java.util.Date AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ;
   private java.util.Date AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ;
   private java.util.Date AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date A3558ForFecApr ;
   private boolean returnInSub ;
   private boolean n4384ForTipArt ;
   private boolean n995ForTonal ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n3560ForOpcCli ;
   private boolean n3558ForFecApr ;
   private boolean n3315ForNumArc ;
   private boolean n496ForUltUti ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n1192ForNumCli ;
   private boolean n832TipColDsc ;
   private boolean n13929ForTipArtD ;
   private boolean brkA1V3 ;
   private boolean brkA1V5 ;
   private String AV52OptionsJson ;
   private String AV53OptionsDescJson ;
   private String AV54OptionIndexesJson ;
   private String AV59TFForBlo_SelsJson ;
   private String AV49DDOName ;
   private String AV50SearchTxt ;
   private String AV51SearchTxtTo ;
   private String AV38Option ;
   private String AV40OptionDesc ;
   private com.genexus.webpanels.WebSession AV44Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A1V2_A829TipArtCod ;
   private short[] P0A1V2_A4384ForTipArt ;
   private boolean[] P0A1V2_n4384ForTipArt ;
   private String[] P0A1V2_A10045CliAct ;
   private String[] P0A1V2_A396EmprCod ;
   private String[] P0A1V2_A995ForTonal ;
   private boolean[] P0A1V2_n995ForTonal ;
   private String[] P0A1V2_A1191ForNomCli ;
   private boolean[] P0A1V2_n1191ForNomCli ;
   private String[] P0A1V2_A482ForColNom ;
   private String[] P0A1V2_A5742ForSerDsc ;
   private boolean[] P0A1V2_n5742ForSerDsc ;
   private String[] P0A1V2_A494ForSer ;
   private String[] P0A1V2_A279CliNom ;
   private String[] P0A1V2_A7781ForBlo ;
   private boolean[] P0A1V2_n7781ForBlo ;
   private int[] P0A1V2_A486ForNumCol ;
   private String[] P0A1V2_A3560ForOpcCli ;
   private boolean[] P0A1V2_n3560ForOpcCli ;
   private java.util.Date[] P0A1V2_A3558ForFecApr ;
   private boolean[] P0A1V2_n3558ForFecApr ;
   private int[] P0A1V2_A3315ForNumArc ;
   private boolean[] P0A1V2_n3315ForNumArc ;
   private java.util.Date[] P0A1V2_A496ForUltUti ;
   private boolean[] P0A1V2_n496ForUltUti ;
   private java.util.Date[] P0A1V2_A495ForUltMod ;
   private boolean[] P0A1V2_n495ForUltMod ;
   private java.util.Date[] P0A1V2_A485ForFec ;
   private boolean[] P0A1V2_n485ForFec ;
   private int[] P0A1V2_A1192ForNumCli ;
   private boolean[] P0A1V2_n1192ForNumCli ;
   private String[] P0A1V2_A832TipColDsc ;
   private boolean[] P0A1V2_n832TipColDsc ;
   private byte[] P0A1V2_A831TipColCod ;
   private int[] P0A1V2_A483ForColNum ;
   private int[] P0A1V2_A252CliCod ;
   private String[] P0A1V2_A13929ForTipArtD ;
   private boolean[] P0A1V2_n13929ForTipArtD ;
   private short[] P0A1V3_A829TipArtCod ;
   private short[] P0A1V3_A4384ForTipArt ;
   private boolean[] P0A1V3_n4384ForTipArt ;
   private byte[] P0A1V3_A831TipColCod ;
   private String[] P0A1V3_A396EmprCod ;
   private String[] P0A1V3_A10045CliAct ;
   private String[] P0A1V3_A995ForTonal ;
   private boolean[] P0A1V3_n995ForTonal ;
   private String[] P0A1V3_A1191ForNomCli ;
   private boolean[] P0A1V3_n1191ForNomCli ;
   private String[] P0A1V3_A482ForColNom ;
   private String[] P0A1V3_A5742ForSerDsc ;
   private boolean[] P0A1V3_n5742ForSerDsc ;
   private String[] P0A1V3_A494ForSer ;
   private String[] P0A1V3_A279CliNom ;
   private String[] P0A1V3_A7781ForBlo ;
   private boolean[] P0A1V3_n7781ForBlo ;
   private int[] P0A1V3_A486ForNumCol ;
   private String[] P0A1V3_A3560ForOpcCli ;
   private boolean[] P0A1V3_n3560ForOpcCli ;
   private java.util.Date[] P0A1V3_A3558ForFecApr ;
   private boolean[] P0A1V3_n3558ForFecApr ;
   private int[] P0A1V3_A3315ForNumArc ;
   private boolean[] P0A1V3_n3315ForNumArc ;
   private java.util.Date[] P0A1V3_A496ForUltUti ;
   private boolean[] P0A1V3_n496ForUltUti ;
   private java.util.Date[] P0A1V3_A495ForUltMod ;
   private boolean[] P0A1V3_n495ForUltMod ;
   private java.util.Date[] P0A1V3_A485ForFec ;
   private boolean[] P0A1V3_n485ForFec ;
   private int[] P0A1V3_A1192ForNumCli ;
   private boolean[] P0A1V3_n1192ForNumCli ;
   private String[] P0A1V3_A832TipColDsc ;
   private boolean[] P0A1V3_n832TipColDsc ;
   private int[] P0A1V3_A483ForColNum ;
   private int[] P0A1V3_A252CliCod ;
   private String[] P0A1V3_A13929ForTipArtD ;
   private boolean[] P0A1V3_n13929ForTipArtD ;
   private short[] P0A1V4_A829TipArtCod ;
   private short[] P0A1V4_A4384ForTipArt ;
   private boolean[] P0A1V4_n4384ForTipArt ;
   private String[] P0A1V4_A396EmprCod ;
   private String[] P0A1V4_A10045CliAct ;
   private String[] P0A1V4_A3560ForOpcCli ;
   private boolean[] P0A1V4_n3560ForOpcCli ;
   private String[] P0A1V4_A995ForTonal ;
   private boolean[] P0A1V4_n995ForTonal ;
   private String[] P0A1V4_A1191ForNomCli ;
   private boolean[] P0A1V4_n1191ForNomCli ;
   private String[] P0A1V4_A482ForColNom ;
   private String[] P0A1V4_A5742ForSerDsc ;
   private boolean[] P0A1V4_n5742ForSerDsc ;
   private String[] P0A1V4_A494ForSer ;
   private String[] P0A1V4_A279CliNom ;
   private String[] P0A1V4_A7781ForBlo ;
   private boolean[] P0A1V4_n7781ForBlo ;
   private int[] P0A1V4_A486ForNumCol ;
   private java.util.Date[] P0A1V4_A3558ForFecApr ;
   private boolean[] P0A1V4_n3558ForFecApr ;
   private int[] P0A1V4_A3315ForNumArc ;
   private boolean[] P0A1V4_n3315ForNumArc ;
   private java.util.Date[] P0A1V4_A496ForUltUti ;
   private boolean[] P0A1V4_n496ForUltUti ;
   private java.util.Date[] P0A1V4_A495ForUltMod ;
   private boolean[] P0A1V4_n495ForUltMod ;
   private java.util.Date[] P0A1V4_A485ForFec ;
   private boolean[] P0A1V4_n485ForFec ;
   private int[] P0A1V4_A1192ForNumCli ;
   private boolean[] P0A1V4_n1192ForNumCli ;
   private String[] P0A1V4_A832TipColDsc ;
   private boolean[] P0A1V4_n832TipColDsc ;
   private byte[] P0A1V4_A831TipColCod ;
   private int[] P0A1V4_A483ForColNum ;
   private int[] P0A1V4_A252CliCod ;
   private String[] P0A1V4_A13929ForTipArtD ;
   private boolean[] P0A1V4_n13929ForTipArtD ;
   private GXSimpleCollection<String> AV60TFForBlo_Sels ;
   private GXSimpleCollection<String> AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV41OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class dis_discolnom_promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                          int AV67Pedidos_dis_discolnom_promptds_1_tfclicod ,
                                          String AV68Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                          String AV69Pedidos_dis_discolnom_promptds_3_tfforser ,
                                          String AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                          String AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                          int AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum ,
                                          byte AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod ,
                                          String AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                          String AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                          String AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                          int AV79Pedidos_dis_discolnom_promptds_13_tffornumcli ,
                                          String AV81Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                          java.util.Date AV82Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                          java.util.Date AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                          java.util.Date AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                          int AV85Pedidos_dis_discolnom_promptds_19_tffornumarc ,
                                          int AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to ,
                                          java.util.Date AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                          String AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                          String AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                          int AV90Pedidos_dis_discolnom_promptds_24_tffornumcol ,
                                          int AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to ,
                                          int AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          java.util.Date A496ForUltUti ,
                                          int A3315ForNumArc ,
                                          java.util.Date A3558ForFecApr ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          String AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                          String AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                          String A13929ForTipArtD ,
                                          String A10045CliAct ,
                                          String AV56EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T2.TipArtCod, T1.ForTipArt, T4.CliAct, T1.EmprCod, T1.ForTonal, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, T1.ForNumCol, T1.ForOpcCli," ;
      scmdbuf += " T1.ForFecApr, T1.ForNumArc, T1.ForUltUti, T1.ForUltMod, T1.ForFec, T1.ForNumCli, T3.TipColDsc, T1.TipColCod, T1.ForColNum, T1.CliCod, COALESCE( T2.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM (((TXPCFORMU T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.ForTipArt) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( ! (0==AV67Pedidos_dis_discolnom_promptds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidos_dis_discolnom_promptds_2_tfclinom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_dis_discolnom_promptds_3_tfforser)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Pedidos_dis_discolnom_promptds_12_tffornomcli)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_dis_discolnom_promptds_13_tffornumcli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Pedidos_dis_discolnom_promptds_15_tffortonal)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Pedidos_dis_discolnom_promptds_16_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Pedidos_dis_discolnom_promptds_17_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Pedidos_dis_discolnom_promptds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_dis_discolnom_promptds_19_tffornumarc) )
      {
         addWhere(sWhereString, "(T1.ForNumArc >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to) )
      {
         addWhere(sWhereString, "(T1.ForNumArc <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr)) )
      {
         addWhere(sWhereString, "(T1.ForFecApr >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis_discolnom_promptds_22_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_dis_discolnom_promptds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A1V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                          int AV67Pedidos_dis_discolnom_promptds_1_tfclicod ,
                                          String AV68Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                          String AV69Pedidos_dis_discolnom_promptds_3_tfforser ,
                                          String AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                          String AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                          int AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum ,
                                          byte AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod ,
                                          String AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                          String AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                          String AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                          int AV79Pedidos_dis_discolnom_promptds_13_tffornumcli ,
                                          String AV81Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                          java.util.Date AV82Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                          java.util.Date AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                          java.util.Date AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                          int AV85Pedidos_dis_discolnom_promptds_19_tffornumarc ,
                                          int AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to ,
                                          java.util.Date AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                          String AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                          String AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                          int AV90Pedidos_dis_discolnom_promptds_24_tffornumcol ,
                                          int AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to ,
                                          int AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          java.util.Date A496ForUltUti ,
                                          int A3315ForNumArc ,
                                          java.util.Date A3558ForFecApr ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          String AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                          String AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                          String A13929ForTipArtD ,
                                          String A10045CliAct ,
                                          String AV56EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[28];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T3.TipArtCod, T1.ForTipArt, T1.TipColCod, T1.EmprCod, T4.CliAct, T1.ForTonal, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, T1.ForNumCol," ;
      scmdbuf += " T1.ForOpcCli, T1.ForFecApr, T1.ForNumArc, T1.ForUltUti, T1.ForUltMod, T1.ForFec, T1.ForNumCli, T2.TipColDsc, T1.ForColNum, T1.CliCod, COALESCE( T3.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM (((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.ForTipArt) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( ! (0==AV67Pedidos_dis_discolnom_promptds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidos_dis_discolnom_promptds_2_tfclinom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_dis_discolnom_promptds_3_tfforser)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Pedidos_dis_discolnom_promptds_12_tffornomcli)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_dis_discolnom_promptds_13_tffornumcli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Pedidos_dis_discolnom_promptds_15_tffortonal)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Pedidos_dis_discolnom_promptds_16_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Pedidos_dis_discolnom_promptds_17_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Pedidos_dis_discolnom_promptds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_dis_discolnom_promptds_19_tffornumarc) )
      {
         addWhere(sWhereString, "(T1.ForNumArc >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to) )
      {
         addWhere(sWhereString, "(T1.ForNumArc <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr)) )
      {
         addWhere(sWhereString, "(T1.ForFecApr >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis_discolnom_promptds_22_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_dis_discolnom_promptds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A1V4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels ,
                                          int AV67Pedidos_dis_discolnom_promptds_1_tfclicod ,
                                          String AV68Pedidos_dis_discolnom_promptds_2_tfclinom ,
                                          String AV69Pedidos_dis_discolnom_promptds_3_tfforser ,
                                          String AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc ,
                                          String AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom ,
                                          int AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum ,
                                          byte AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod ,
                                          String AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel ,
                                          String AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc ,
                                          String AV78Pedidos_dis_discolnom_promptds_12_tffornomcli ,
                                          int AV79Pedidos_dis_discolnom_promptds_13_tffornumcli ,
                                          String AV81Pedidos_dis_discolnom_promptds_15_tffortonal ,
                                          java.util.Date AV82Pedidos_dis_discolnom_promptds_16_tfforfec ,
                                          java.util.Date AV83Pedidos_dis_discolnom_promptds_17_tfforultmod ,
                                          java.util.Date AV84Pedidos_dis_discolnom_promptds_18_tfforultuti ,
                                          int AV85Pedidos_dis_discolnom_promptds_19_tffornumarc ,
                                          int AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to ,
                                          java.util.Date AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr ,
                                          String AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel ,
                                          String AV88Pedidos_dis_discolnom_promptds_22_tfforopccli ,
                                          int AV90Pedidos_dis_discolnom_promptds_24_tffornumcol ,
                                          int AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to ,
                                          int AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1191ForNomCli ,
                                          int A1192ForNumCli ,
                                          String A995ForTonal ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          java.util.Date A496ForUltUti ,
                                          int A3315ForNumArc ,
                                          java.util.Date A3558ForFecApr ,
                                          String A3560ForOpcCli ,
                                          int A486ForNumCol ,
                                          String AV72Pedidos_dis_discolnom_promptds_6_tffortipartdsc_sel ,
                                          String AV71Pedidos_dis_discolnom_promptds_5_tffortipartdsc ,
                                          String A13929ForTipArtD ,
                                          String A396EmprCod ,
                                          String AV56EmprCod ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[28];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.TipArtCod, T1.ForTipArt, T1.EmprCod, T4.CliAct, T1.ForOpcCli, T1.ForTonal, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T4.CliNom, T1.ForBlo, T1.ForNumCol," ;
      scmdbuf += " T1.ForFecApr, T1.ForNumArc, T1.ForUltUti, T1.ForUltMod, T1.ForFec, T1.ForNumCli, T3.TipColDsc, T1.TipColCod, T1.ForColNum, T1.CliCod, COALESCE( T2.TipArtDsc, ' ')" ;
      scmdbuf += " AS ForTipArtD FROM (((TXPCFORMU T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.ForTipArt) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.CliAct = 'S')");
      if ( ! (0==AV67Pedidos_dis_discolnom_promptds_1_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidos_dis_discolnom_promptds_2_tfclinom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Pedidos_dis_discolnom_promptds_3_tfforser)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidos_dis_discolnom_promptds_4_tfforserdsc)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Pedidos_dis_discolnom_promptds_7_tfforcolnom)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Pedidos_dis_discolnom_promptds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidos_dis_discolnom_promptds_9_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_dis_discolnom_promptds_10_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_dis_discolnom_promptds_11_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Pedidos_dis_discolnom_promptds_12_tffornomcli)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_dis_discolnom_promptds_13_tffornumcli) )
      {
         addWhere(sWhereString, "(T1.ForNumCli = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Pedidos_dis_discolnom_promptds_15_tffortonal)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Pedidos_dis_discolnom_promptds_16_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Pedidos_dis_discolnom_promptds_17_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Pedidos_dis_discolnom_promptds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_dis_discolnom_promptds_19_tffornumarc) )
      {
         addWhere(sWhereString, "(T1.ForNumArc >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_dis_discolnom_promptds_20_tffornumarc_to) )
      {
         addWhere(sWhereString, "(T1.ForNumArc <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Pedidos_dis_discolnom_promptds_21_tfforfecapr)) )
      {
         addWhere(sWhereString, "(T1.ForFecApr >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis_discolnom_promptds_22_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis_discolnom_promptds_23_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_dis_discolnom_promptds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidos_dis_discolnom_promptds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Pedidos_dis_discolnom_promptds_26_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForOpcCli" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P0A1V2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 1 :
                  return conditional_P0A1V3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
            case 2 :
                  return conditional_P0A1V4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1V4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(21);
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((int[]) buf[35])[0] = rslt.getInt(23);
               ((String[]) buf[36])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((int[]) buf[35])[0] = rslt.getInt(23);
               ((String[]) buf[36])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 16);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(21);
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((int[]) buf[35])[0] = rslt.getInt(23);
               ((String[]) buf[36])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
      }
   }

}

