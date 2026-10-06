package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generacionaccesorios1getfilterdata extends GXProcedure
{
   public generacionaccesorios1getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionaccesorios1getfilterdata.class ), "" );
   }

   public generacionaccesorios1getfilterdata( int remoteHandle ,
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
      generacionaccesorios1getfilterdata.this.aP5 = new String[] {""};
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
      generacionaccesorios1getfilterdata.this.AV42DDOName = aP0;
      generacionaccesorios1getfilterdata.this.AV40SearchTxt = aP1;
      generacionaccesorios1getfilterdata.this.AV41SearchTxtTo = aP2;
      generacionaccesorios1getfilterdata.this.aP3 = aP3;
      generacionaccesorios1getfilterdata.this.aP4 = aP4;
      generacionaccesorios1getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISUSRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADDISNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_DISUNIMED") == 0 )
      {
         /* Execute user subroutine: 'LOADDISUNIMEDOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_MAQCODDIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODDISOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_REVENID") == 0 )
      {
         /* Execute user subroutine: 'LOADREVENIDOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV46OptionsJson = AV45Options.toJSonString(false) ;
      AV49OptionsDescJson = AV48OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV50OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV53Session.getValue("Pedidos.GeneracionAccesorios1GridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.GeneracionAccesorios1GridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("Pedidos.GeneracionAccesorios1GridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV64TFDisUsrCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV65TFDisUsrCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV10TFDisCod = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDisCod_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV60TFDisFec = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPART") == 0 )
         {
            AV18TFDisPart = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFDisPart_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV20TFDisArtCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV21TFDisArtCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV22TFDisArtDsc = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV23TFDisArtDsc_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV24TFDisColNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV25TFDisColNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV26TFDisColNum = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFDisColNum_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV28TFDisTipCol = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFDisTipCol_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV30TFDisNomCli = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV31TFDisNomCli_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV32TFDisUniMed = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV33TFDisUniMed_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEPIE") == 0 )
         {
            AV34TFDisPiePie = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFDisPiePie_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEKGM") == 0 )
         {
            AV36TFDisPieKgm = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFDisPieKgm_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEMTR") == 0 )
         {
            AV38TFDisPieMtr = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFDisPieMtr_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV66TFMaqCodDis = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV67TFMaqCodDis_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISVOLMAQ") == 0 )
         {
            AV68TFDisVolMaq = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFDisVolMaq_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENID") == 0 )
         {
            AV70TFRevenID = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENID_SEL") == 0 )
         {
            AV71TFRevenID_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV59Emprcod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISEST") == 0 )
         {
            AV62DisEst = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNHDR") == 0 )
         {
            AV63BarNHdr = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISUSRCODOPTIONS' Routine */
      returnInSub = false ;
      AV64TFDisUsrCod = AV40SearchTxt ;
      AV65TFDisUsrCod_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C3 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA8C2 = false ;
         A396EmprCod = P0A8C3_A396EmprCod[0] ;
         A367DisEst = P0A8C3_A367DisEst[0] ;
         A4348DisUsrCod = P0A8C3_A4348DisUsrCod[0] ;
         A12328RevenID = P0A8C3_A12328RevenID[0] ;
         n12328RevenID = P0A8C3_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C3_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C3_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C3_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C3_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C3_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C3_n390DisTipCol[0] ;
         A363DisColNum = P0A8C3_A363DisColNum[0] ;
         n363DisColNum = P0A8C3_n363DisColNum[0] ;
         A362DisColNom = P0A8C3_A362DisColNom[0] ;
         n362DisColNom = P0A8C3_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C3_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C3_A335DisArtCod[0] ;
         A1502DisPart = P0A8C3_A1502DisPart[0] ;
         A279CliNom = P0A8C3_A279CliNom[0] ;
         A252CliCod = P0A8C3_A252CliCod[0] ;
         A369DisFec = P0A8C3_A369DisFec[0] ;
         A361DisCod = P0A8C3_A361DisCod[0] ;
         A387DisPiePie = P0A8C3_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C3_n387DisPiePie[0] ;
         A365DisDes = P0A8C3_A365DisDes[0] ;
         A279CliNom = P0A8C3_A279CliNom[0] ;
         A387DisPiePie = P0A8C3_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C3_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A8C3_A4348DisUsrCod[0], A4348DisUsrCod) == 0 ) )
                     {
                        brkA8C2 = false ;
                        A396EmprCod = P0A8C3_A396EmprCod[0] ;
                        A361DisCod = P0A8C3_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C2 = true ;
                        pr_default.readNext(0);
                     }
                     if ( ! (GXutil.strcmp("", A4348DisUsrCod)==0) )
                     {
                        AV44Option = A4348DisUsrCod ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C2 )
         {
            brkA8C2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV40SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C5 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA8C4 = false ;
         A396EmprCod = P0A8C5_A396EmprCod[0] ;
         A367DisEst = P0A8C5_A367DisEst[0] ;
         A279CliNom = P0A8C5_A279CliNom[0] ;
         A12328RevenID = P0A8C5_A12328RevenID[0] ;
         n12328RevenID = P0A8C5_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C5_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C5_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C5_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C5_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C5_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C5_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C5_n390DisTipCol[0] ;
         A363DisColNum = P0A8C5_A363DisColNum[0] ;
         n363DisColNum = P0A8C5_n363DisColNum[0] ;
         A362DisColNom = P0A8C5_A362DisColNom[0] ;
         n362DisColNom = P0A8C5_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C5_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C5_A335DisArtCod[0] ;
         A1502DisPart = P0A8C5_A1502DisPart[0] ;
         A252CliCod = P0A8C5_A252CliCod[0] ;
         A369DisFec = P0A8C5_A369DisFec[0] ;
         A361DisCod = P0A8C5_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C5_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C5_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C5_n387DisPiePie[0] ;
         A365DisDes = P0A8C5_A365DisDes[0] ;
         A279CliNom = P0A8C5_A279CliNom[0] ;
         A387DisPiePie = P0A8C5_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C5_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A8C5_A279CliNom[0], A279CliNom) == 0 ) )
                     {
                        brkA8C4 = false ;
                        A396EmprCod = P0A8C5_A396EmprCod[0] ;
                        A252CliCod = P0A8C5_A252CliCod[0] ;
                        A361DisCod = P0A8C5_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C4 = true ;
                        pr_default.readNext(1);
                     }
                     if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                     {
                        AV44Option = A279CliNom ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C4 )
         {
            brkA8C4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFDisArtCod = AV40SearchTxt ;
      AV21TFDisArtCod_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C7 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA8C6 = false ;
         A396EmprCod = P0A8C7_A396EmprCod[0] ;
         A367DisEst = P0A8C7_A367DisEst[0] ;
         A335DisArtCod = P0A8C7_A335DisArtCod[0] ;
         A12328RevenID = P0A8C7_A12328RevenID[0] ;
         n12328RevenID = P0A8C7_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C7_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C7_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C7_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C7_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C7_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C7_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C7_n390DisTipCol[0] ;
         A363DisColNum = P0A8C7_A363DisColNum[0] ;
         n363DisColNum = P0A8C7_n363DisColNum[0] ;
         A362DisColNom = P0A8C7_A362DisColNom[0] ;
         n362DisColNom = P0A8C7_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C7_A337DisArtDsc[0] ;
         A1502DisPart = P0A8C7_A1502DisPart[0] ;
         A279CliNom = P0A8C7_A279CliNom[0] ;
         A252CliCod = P0A8C7_A252CliCod[0] ;
         A369DisFec = P0A8C7_A369DisFec[0] ;
         A361DisCod = P0A8C7_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C7_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C7_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C7_n387DisPiePie[0] ;
         A365DisDes = P0A8C7_A365DisDes[0] ;
         A279CliNom = P0A8C7_A279CliNom[0] ;
         A387DisPiePie = P0A8C7_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C7_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A8C7_A335DisArtCod[0], A335DisArtCod) == 0 ) )
                     {
                        brkA8C6 = false ;
                        A396EmprCod = P0A8C7_A396EmprCod[0] ;
                        A361DisCod = P0A8C7_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C6 = true ;
                        pr_default.readNext(2);
                     }
                     if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
                     {
                        AV44Option = A335DisArtCod ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C6 )
         {
            brkA8C6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDISARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFDisArtDsc = AV40SearchTxt ;
      AV23TFDisArtDsc_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C9 */
      pr_default.execute(3, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA8C8 = false ;
         A396EmprCod = P0A8C9_A396EmprCod[0] ;
         A367DisEst = P0A8C9_A367DisEst[0] ;
         A337DisArtDsc = P0A8C9_A337DisArtDsc[0] ;
         A12328RevenID = P0A8C9_A12328RevenID[0] ;
         n12328RevenID = P0A8C9_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C9_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C9_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C9_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C9_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C9_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C9_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C9_n390DisTipCol[0] ;
         A363DisColNum = P0A8C9_A363DisColNum[0] ;
         n363DisColNum = P0A8C9_n363DisColNum[0] ;
         A362DisColNom = P0A8C9_A362DisColNom[0] ;
         n362DisColNom = P0A8C9_n362DisColNom[0] ;
         A335DisArtCod = P0A8C9_A335DisArtCod[0] ;
         A1502DisPart = P0A8C9_A1502DisPart[0] ;
         A279CliNom = P0A8C9_A279CliNom[0] ;
         A252CliCod = P0A8C9_A252CliCod[0] ;
         A369DisFec = P0A8C9_A369DisFec[0] ;
         A361DisCod = P0A8C9_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C9_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C9_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C9_n387DisPiePie[0] ;
         A365DisDes = P0A8C9_A365DisDes[0] ;
         A279CliNom = P0A8C9_A279CliNom[0] ;
         A387DisPiePie = P0A8C9_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C9_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A8C9_A337DisArtDsc[0], A337DisArtDsc) == 0 ) )
                     {
                        brkA8C8 = false ;
                        A396EmprCod = P0A8C9_A396EmprCod[0] ;
                        A361DisCod = P0A8C9_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C8 = true ;
                        pr_default.readNext(3);
                     }
                     if ( ! (GXutil.strcmp("", A337DisArtDsc)==0) )
                     {
                        AV44Option = A337DisArtDsc ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C8 )
         {
            brkA8C8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDISCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDisColNom = AV40SearchTxt ;
      AV25TFDisColNom_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C11 */
      pr_default.execute(4, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA8C10 = false ;
         A396EmprCod = P0A8C11_A396EmprCod[0] ;
         A367DisEst = P0A8C11_A367DisEst[0] ;
         A362DisColNom = P0A8C11_A362DisColNom[0] ;
         n362DisColNom = P0A8C11_n362DisColNom[0] ;
         A12328RevenID = P0A8C11_A12328RevenID[0] ;
         n12328RevenID = P0A8C11_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C11_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C11_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C11_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C11_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C11_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C11_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C11_n390DisTipCol[0] ;
         A363DisColNum = P0A8C11_A363DisColNum[0] ;
         n363DisColNum = P0A8C11_n363DisColNum[0] ;
         A337DisArtDsc = P0A8C11_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C11_A335DisArtCod[0] ;
         A1502DisPart = P0A8C11_A1502DisPart[0] ;
         A279CliNom = P0A8C11_A279CliNom[0] ;
         A252CliCod = P0A8C11_A252CliCod[0] ;
         A369DisFec = P0A8C11_A369DisFec[0] ;
         A361DisCod = P0A8C11_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C11_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C11_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C11_n387DisPiePie[0] ;
         A365DisDes = P0A8C11_A365DisDes[0] ;
         A279CliNom = P0A8C11_A279CliNom[0] ;
         A387DisPiePie = P0A8C11_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C11_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A8C11_A362DisColNom[0], A362DisColNom) == 0 ) )
                     {
                        brkA8C10 = false ;
                        A396EmprCod = P0A8C11_A396EmprCod[0] ;
                        A361DisCod = P0A8C11_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C10 = true ;
                        pr_default.readNext(4);
                     }
                     if ( ! (GXutil.strcmp("", A362DisColNom)==0) )
                     {
                        AV44Option = A362DisColNom ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C10 )
         {
            brkA8C10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADDISNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV30TFDisNomCli = AV40SearchTxt ;
      AV31TFDisNomCli_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C13 */
      pr_default.execute(5, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA8C12 = false ;
         A396EmprCod = P0A8C13_A396EmprCod[0] ;
         A367DisEst = P0A8C13_A367DisEst[0] ;
         A1195DisNomCli = P0A8C13_A1195DisNomCli[0] ;
         A12328RevenID = P0A8C13_A12328RevenID[0] ;
         n12328RevenID = P0A8C13_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C13_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C13_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C13_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C13_A392DisUniMed[0] ;
         A390DisTipCol = P0A8C13_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C13_n390DisTipCol[0] ;
         A363DisColNum = P0A8C13_A363DisColNum[0] ;
         n363DisColNum = P0A8C13_n363DisColNum[0] ;
         A362DisColNom = P0A8C13_A362DisColNom[0] ;
         n362DisColNom = P0A8C13_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C13_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C13_A335DisArtCod[0] ;
         A1502DisPart = P0A8C13_A1502DisPart[0] ;
         A279CliNom = P0A8C13_A279CliNom[0] ;
         A252CliCod = P0A8C13_A252CliCod[0] ;
         A369DisFec = P0A8C13_A369DisFec[0] ;
         A361DisCod = P0A8C13_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C13_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C13_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C13_n387DisPiePie[0] ;
         A365DisDes = P0A8C13_A365DisDes[0] ;
         A279CliNom = P0A8C13_A279CliNom[0] ;
         A387DisPiePie = P0A8C13_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C13_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0A8C13_A1195DisNomCli[0], A1195DisNomCli) == 0 ) )
                     {
                        brkA8C12 = false ;
                        A396EmprCod = P0A8C13_A396EmprCod[0] ;
                        A361DisCod = P0A8C13_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C12 = true ;
                        pr_default.readNext(5);
                     }
                     if ( ! (GXutil.strcmp("", A1195DisNomCli)==0) )
                     {
                        AV44Option = A1195DisNomCli ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C12 )
         {
            brkA8C12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADDISUNIMEDOPTIONS' Routine */
      returnInSub = false ;
      AV32TFDisUniMed = AV40SearchTxt ;
      AV33TFDisUniMed_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C15 */
      pr_default.execute(6, new Object[] {Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), AV59Emprcod, Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA8C14 = false ;
         A396EmprCod = P0A8C15_A396EmprCod[0] ;
         A367DisEst = P0A8C15_A367DisEst[0] ;
         A392DisUniMed = P0A8C15_A392DisUniMed[0] ;
         A12328RevenID = P0A8C15_A12328RevenID[0] ;
         n12328RevenID = P0A8C15_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C15_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C15_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C15_n1122MaqCodDis[0] ;
         A1195DisNomCli = P0A8C15_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C15_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C15_n390DisTipCol[0] ;
         A363DisColNum = P0A8C15_A363DisColNum[0] ;
         n363DisColNum = P0A8C15_n363DisColNum[0] ;
         A362DisColNom = P0A8C15_A362DisColNom[0] ;
         n362DisColNom = P0A8C15_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C15_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C15_A335DisArtCod[0] ;
         A1502DisPart = P0A8C15_A1502DisPart[0] ;
         A279CliNom = P0A8C15_A279CliNom[0] ;
         A252CliCod = P0A8C15_A252CliCod[0] ;
         A369DisFec = P0A8C15_A369DisFec[0] ;
         A361DisCod = P0A8C15_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C15_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C15_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C15_n387DisPiePie[0] ;
         A365DisDes = P0A8C15_A365DisDes[0] ;
         A279CliNom = P0A8C15_A279CliNom[0] ;
         A387DisPiePie = P0A8C15_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C15_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0A8C15_A392DisUniMed[0], A392DisUniMed) == 0 ) )
                     {
                        brkA8C14 = false ;
                        A396EmprCod = P0A8C15_A396EmprCod[0] ;
                        A361DisCod = P0A8C15_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C14 = true ;
                        pr_default.readNext(6);
                     }
                     if ( ! (GXutil.strcmp("", A392DisUniMed)==0) )
                     {
                        AV44Option = A392DisUniMed ;
                        AV47OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A392DisUniMed, "@!"))) ;
                        AV45Options.add(AV44Option, 0);
                        AV48OptionsDesc.add(AV47OptionDesc, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C14 )
         {
            brkA8C14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADMAQCODDISOPTIONS' Routine */
      returnInSub = false ;
      AV66TFMaqCodDis = AV40SearchTxt ;
      AV67TFMaqCodDis_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C17 */
      pr_default.execute(7, new Object[] {AV59Emprcod, Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brkA8C16 = false ;
         A396EmprCod = P0A8C17_A396EmprCod[0] ;
         A1122MaqCodDis = P0A8C17_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C17_n1122MaqCodDis[0] ;
         A367DisEst = P0A8C17_A367DisEst[0] ;
         A12328RevenID = P0A8C17_A12328RevenID[0] ;
         n12328RevenID = P0A8C17_n12328RevenID[0] ;
         A6547DisVolMaq = P0A8C17_A6547DisVolMaq[0] ;
         A392DisUniMed = P0A8C17_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C17_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C17_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C17_n390DisTipCol[0] ;
         A363DisColNum = P0A8C17_A363DisColNum[0] ;
         n363DisColNum = P0A8C17_n363DisColNum[0] ;
         A362DisColNom = P0A8C17_A362DisColNom[0] ;
         n362DisColNom = P0A8C17_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C17_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C17_A335DisArtCod[0] ;
         A1502DisPart = P0A8C17_A1502DisPart[0] ;
         A279CliNom = P0A8C17_A279CliNom[0] ;
         A252CliCod = P0A8C17_A252CliCod[0] ;
         A369DisFec = P0A8C17_A369DisFec[0] ;
         A361DisCod = P0A8C17_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C17_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C17_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C17_n387DisPiePie[0] ;
         A365DisDes = P0A8C17_A365DisDes[0] ;
         A279CliNom = P0A8C17_A279CliNom[0] ;
         A387DisPiePie = P0A8C17_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C17_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P0A8C17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A8C17_A1122MaqCodDis[0], A1122MaqCodDis) == 0 ) )
                     {
                        brkA8C16 = false ;
                        A361DisCod = P0A8C17_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C16 = true ;
                        pr_default.readNext(7);
                     }
                     if ( ! (GXutil.strcmp("", A1122MaqCodDis)==0) )
                     {
                        AV44Option = A1122MaqCodDis ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C16 )
         {
            brkA8C16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADREVENIDOPTIONS' Routine */
      returnInSub = false ;
      AV70TFRevenID = AV40SearchTxt ;
      AV71TFRevenID_Sel = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = AV64TFDisUsrCod ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = AV65TFDisUsrCod_Sel ;
      AV78Pedidos_generacionaccesorios1ds_3_tfdiscod = AV10TFDisCod ;
      AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to = AV11TFDisCod_To ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = AV60TFDisFec ;
      AV81Pedidos_generacionaccesorios1ds_6_tfclicod = AV12TFCliCod ;
      AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to = AV13TFCliCod_To ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = AV14TFCliNom ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = AV15TFCliNom_Sel ;
      AV85Pedidos_generacionaccesorios1ds_10_tfdispart = AV18TFDisPart ;
      AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to = AV19TFDisPart_To ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = AV20TFDisArtCod ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = AV21TFDisArtCod_Sel ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = AV22TFDisArtDsc ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = AV23TFDisArtDsc_Sel ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = AV24TFDisColNom ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = AV25TFDisColNom_Sel ;
      AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum = AV26TFDisColNum ;
      AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to = AV27TFDisColNum_To ;
      AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol = AV28TFDisTipCol ;
      AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to = AV29TFDisTipCol_To ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = AV30TFDisNomCli ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = AV31TFDisNomCli_Sel ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = AV32TFDisUniMed ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = AV33TFDisUniMed_Sel ;
      AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie = AV34TFDisPiePie ;
      AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to = AV35TFDisPiePie_To ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = AV36TFDisPieKgm ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = AV37TFDisPieKgm_To ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = AV38TFDisPieMtr ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = AV39TFDisPieMtr_To ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = AV66TFMaqCodDis ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = AV67TFMaqCodDis_Sel ;
      AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq = AV68TFDisVolMaq ;
      AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to = AV69TFDisVolMaq_To ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = AV70TFRevenID ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = AV71TFRevenID_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) ,
                                           Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) ,
                                           AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod) ,
                                           Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) ,
                                           AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart) ,
                                           Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) ,
                                           AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) ,
                                           Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) ,
                                           Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) ,
                                           Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) ,
                                           AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) ,
                                           Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) ,
                                           AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           A4348DisUsrCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A1502DisPart) ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           A392DisUniMed ,
                                           A1122MaqCodDis ,
                                           Integer.valueOf(A6547DisVolMaq) ,
                                           A12328RevenID ,
                                           Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to) ,
                                           AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV62DisEst) ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod), 8, "%") ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV83Pedidos_generacionaccesorios1ds_8_tfclinom), 30, "%") ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = GXutil.padr( GXutil.rtrim( AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod), 16, "%") ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc), 26, "%") ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom), 13, "%") ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli), 13, "%") ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = GXutil.padr( GXutil.rtrim( AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed), 1, "%") ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis), 6, "%") ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = GXutil.padr( GXutil.rtrim( AV111Pedidos_generacionaccesorios1ds_36_tfrevenid), 10, "%") ;
      /* Using cursor P0A8C19 */
      pr_default.execute(8, new Object[] {AV59Emprcod, Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Short.valueOf(AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to), Byte.valueOf(AV62DisEst), lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod, AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel, Integer.valueOf(AV78Pedidos_generacionaccesorios1ds_3_tfdiscod), Integer.valueOf(AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to), AV80Pedidos_generacionaccesorios1ds_5_tfdisfec, Integer.valueOf(AV81Pedidos_generacionaccesorios1ds_6_tfclicod), Integer.valueOf(AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to), lV83Pedidos_generacionaccesorios1ds_8_tfclinom, AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel, Short.valueOf(AV85Pedidos_generacionaccesorios1ds_10_tfdispart), Short.valueOf(AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to), lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod, AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel, lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc, AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel, lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom, AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel, Integer.valueOf(AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum), Integer.valueOf(AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to), Byte.valueOf(AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol), Byte.valueOf(AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to), lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli, AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel, lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed, AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel, lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis, AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel, Integer.valueOf(AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq), Integer.valueOf(AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to), lV111Pedidos_generacionaccesorios1ds_36_tfrevenid, AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brkA8C18 = false ;
         A396EmprCod = P0A8C19_A396EmprCod[0] ;
         A12328RevenID = P0A8C19_A12328RevenID[0] ;
         n12328RevenID = P0A8C19_n12328RevenID[0] ;
         A367DisEst = P0A8C19_A367DisEst[0] ;
         A6547DisVolMaq = P0A8C19_A6547DisVolMaq[0] ;
         A1122MaqCodDis = P0A8C19_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A8C19_n1122MaqCodDis[0] ;
         A392DisUniMed = P0A8C19_A392DisUniMed[0] ;
         A1195DisNomCli = P0A8C19_A1195DisNomCli[0] ;
         A390DisTipCol = P0A8C19_A390DisTipCol[0] ;
         n390DisTipCol = P0A8C19_n390DisTipCol[0] ;
         A363DisColNum = P0A8C19_A363DisColNum[0] ;
         n363DisColNum = P0A8C19_n363DisColNum[0] ;
         A362DisColNom = P0A8C19_A362DisColNom[0] ;
         n362DisColNom = P0A8C19_n362DisColNom[0] ;
         A337DisArtDsc = P0A8C19_A337DisArtDsc[0] ;
         A335DisArtCod = P0A8C19_A335DisArtCod[0] ;
         A1502DisPart = P0A8C19_A1502DisPart[0] ;
         A279CliNom = P0A8C19_A279CliNom[0] ;
         A252CliCod = P0A8C19_A252CliCod[0] ;
         A369DisFec = P0A8C19_A369DisFec[0] ;
         A361DisCod = P0A8C19_A361DisCod[0] ;
         A4348DisUsrCod = P0A8C19_A4348DisUsrCod[0] ;
         A387DisPiePie = P0A8C19_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C19_n387DisPiePie[0] ;
         A365DisDes = P0A8C19_A365DisDes[0] ;
         A279CliNom = P0A8C19_A279CliNom[0] ;
         A387DisPiePie = P0A8C19_A387DisPiePie[0] ;
         n387DisPiePie = P0A8C19_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to) <= 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
                  }
                  else
                  {
                     A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV52count = 0 ;
                     while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P0A8C19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A8C19_A12328RevenID[0], A12328RevenID) == 0 ) )
                     {
                        brkA8C18 = false ;
                        A361DisCod = P0A8C19_A361DisCod[0] ;
                        AV52count = (long)(AV52count+1) ;
                        brkA8C18 = true ;
                        pr_default.readNext(8);
                     }
                     if ( ! (GXutil.strcmp("", A12328RevenID)==0) )
                     {
                        AV44Option = A12328RevenID ;
                        AV45Options.add(AV44Option, 0);
                        AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV45Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brkA8C18 )
         {
            brkA8C18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = generacionaccesorios1getfilterdata.this.AV46OptionsJson;
      this.aP4[0] = generacionaccesorios1getfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = generacionaccesorios1getfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0A8C20 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         X631Metros = P0A8C20_A631Metros[0] ;
      }
      pr_default.close(9);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0A8C21 */
      pr_default.execute(10, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         X384DisPieMet = P0A8C21_A384DisPieMet[0] ;
      }
      pr_default.close(10);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P0A8C22 */
      pr_default.execute(11, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         X595Kilos = P0A8C22_A595Kilos[0] ;
      }
      pr_default.close(11);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P0A8C23 */
      pr_default.execute(12, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         X382DisPieKil = P0A8C23_A382DisPieKil[0] ;
      }
      pr_default.close(12);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      AV46OptionsJson = "" ;
      AV49OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53Session = httpContext.getWebSession();
      AV55GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV56GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV64TFDisUsrCod = "" ;
      AV65TFDisUsrCod_Sel = "" ;
      AV60TFDisFec = GXutil.nullDate() ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV20TFDisArtCod = "" ;
      AV21TFDisArtCod_Sel = "" ;
      AV22TFDisArtDsc = "" ;
      AV23TFDisArtDsc_Sel = "" ;
      AV24TFDisColNom = "" ;
      AV25TFDisColNom_Sel = "" ;
      AV30TFDisNomCli = "" ;
      AV31TFDisNomCli_Sel = "" ;
      AV32TFDisUniMed = "" ;
      AV33TFDisUniMed_Sel = "" ;
      AV36TFDisPieKgm = DecimalUtil.ZERO ;
      AV37TFDisPieKgm_To = DecimalUtil.ZERO ;
      AV38TFDisPieMtr = DecimalUtil.ZERO ;
      AV39TFDisPieMtr_To = DecimalUtil.ZERO ;
      AV66TFMaqCodDis = "" ;
      AV67TFMaqCodDis_Sel = "" ;
      AV70TFRevenID = "" ;
      AV71TFRevenID_Sel = "" ;
      AV59Emprcod = "" ;
      AV63BarNHdr = "" ;
      A4348DisUsrCod = "" ;
      AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = "" ;
      AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel = "" ;
      AV80Pedidos_generacionaccesorios1ds_5_tfdisfec = GXutil.nullDate() ;
      AV83Pedidos_generacionaccesorios1ds_8_tfclinom = "" ;
      AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel = "" ;
      AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = "" ;
      AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel = "" ;
      AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = "" ;
      AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel = "" ;
      AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = "" ;
      AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel = "" ;
      AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = "" ;
      AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel = "" ;
      AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = "" ;
      AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel = "" ;
      AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm = DecimalUtil.ZERO ;
      AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to = DecimalUtil.ZERO ;
      AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr = DecimalUtil.ZERO ;
      AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to = DecimalUtil.ZERO ;
      AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = "" ;
      AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel = "" ;
      AV111Pedidos_generacionaccesorios1ds_36_tfrevenid = "" ;
      AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel = "" ;
      scmdbuf = "" ;
      lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod = "" ;
      lV83Pedidos_generacionaccesorios1ds_8_tfclinom = "" ;
      lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod = "" ;
      lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc = "" ;
      lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom = "" ;
      lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli = "" ;
      lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed = "" ;
      lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis = "" ;
      lV111Pedidos_generacionaccesorios1ds_36_tfrevenid = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A392DisUniMed = "" ;
      A1122MaqCodDis = "" ;
      A12328RevenID = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P0A8C3_A396EmprCod = new String[] {""} ;
      P0A8C3_A367DisEst = new byte[1] ;
      P0A8C3_A4348DisUsrCod = new String[] {""} ;
      P0A8C3_A12328RevenID = new String[] {""} ;
      P0A8C3_n12328RevenID = new boolean[] {false} ;
      P0A8C3_A6547DisVolMaq = new int[1] ;
      P0A8C3_A1122MaqCodDis = new String[] {""} ;
      P0A8C3_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C3_A392DisUniMed = new String[] {""} ;
      P0A8C3_A1195DisNomCli = new String[] {""} ;
      P0A8C3_A390DisTipCol = new byte[1] ;
      P0A8C3_n390DisTipCol = new boolean[] {false} ;
      P0A8C3_A363DisColNum = new int[1] ;
      P0A8C3_n363DisColNum = new boolean[] {false} ;
      P0A8C3_A362DisColNom = new String[] {""} ;
      P0A8C3_n362DisColNom = new boolean[] {false} ;
      P0A8C3_A337DisArtDsc = new String[] {""} ;
      P0A8C3_A335DisArtCod = new String[] {""} ;
      P0A8C3_A1502DisPart = new short[1] ;
      P0A8C3_A279CliNom = new String[] {""} ;
      P0A8C3_A252CliCod = new int[1] ;
      P0A8C3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C3_A361DisCod = new int[1] ;
      P0A8C3_A387DisPiePie = new short[1] ;
      P0A8C3_n387DisPiePie = new boolean[] {false} ;
      P0A8C3_A365DisDes = new String[] {""} ;
      A365DisDes = "" ;
      AV44Option = "" ;
      P0A8C5_A396EmprCod = new String[] {""} ;
      P0A8C5_A367DisEst = new byte[1] ;
      P0A8C5_A279CliNom = new String[] {""} ;
      P0A8C5_A12328RevenID = new String[] {""} ;
      P0A8C5_n12328RevenID = new boolean[] {false} ;
      P0A8C5_A6547DisVolMaq = new int[1] ;
      P0A8C5_A1122MaqCodDis = new String[] {""} ;
      P0A8C5_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C5_A392DisUniMed = new String[] {""} ;
      P0A8C5_A1195DisNomCli = new String[] {""} ;
      P0A8C5_A390DisTipCol = new byte[1] ;
      P0A8C5_n390DisTipCol = new boolean[] {false} ;
      P0A8C5_A363DisColNum = new int[1] ;
      P0A8C5_n363DisColNum = new boolean[] {false} ;
      P0A8C5_A362DisColNom = new String[] {""} ;
      P0A8C5_n362DisColNom = new boolean[] {false} ;
      P0A8C5_A337DisArtDsc = new String[] {""} ;
      P0A8C5_A335DisArtCod = new String[] {""} ;
      P0A8C5_A1502DisPart = new short[1] ;
      P0A8C5_A252CliCod = new int[1] ;
      P0A8C5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C5_A361DisCod = new int[1] ;
      P0A8C5_A4348DisUsrCod = new String[] {""} ;
      P0A8C5_A387DisPiePie = new short[1] ;
      P0A8C5_n387DisPiePie = new boolean[] {false} ;
      P0A8C5_A365DisDes = new String[] {""} ;
      P0A8C7_A396EmprCod = new String[] {""} ;
      P0A8C7_A367DisEst = new byte[1] ;
      P0A8C7_A335DisArtCod = new String[] {""} ;
      P0A8C7_A12328RevenID = new String[] {""} ;
      P0A8C7_n12328RevenID = new boolean[] {false} ;
      P0A8C7_A6547DisVolMaq = new int[1] ;
      P0A8C7_A1122MaqCodDis = new String[] {""} ;
      P0A8C7_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C7_A392DisUniMed = new String[] {""} ;
      P0A8C7_A1195DisNomCli = new String[] {""} ;
      P0A8C7_A390DisTipCol = new byte[1] ;
      P0A8C7_n390DisTipCol = new boolean[] {false} ;
      P0A8C7_A363DisColNum = new int[1] ;
      P0A8C7_n363DisColNum = new boolean[] {false} ;
      P0A8C7_A362DisColNom = new String[] {""} ;
      P0A8C7_n362DisColNom = new boolean[] {false} ;
      P0A8C7_A337DisArtDsc = new String[] {""} ;
      P0A8C7_A1502DisPart = new short[1] ;
      P0A8C7_A279CliNom = new String[] {""} ;
      P0A8C7_A252CliCod = new int[1] ;
      P0A8C7_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C7_A361DisCod = new int[1] ;
      P0A8C7_A4348DisUsrCod = new String[] {""} ;
      P0A8C7_A387DisPiePie = new short[1] ;
      P0A8C7_n387DisPiePie = new boolean[] {false} ;
      P0A8C7_A365DisDes = new String[] {""} ;
      P0A8C9_A396EmprCod = new String[] {""} ;
      P0A8C9_A367DisEst = new byte[1] ;
      P0A8C9_A337DisArtDsc = new String[] {""} ;
      P0A8C9_A12328RevenID = new String[] {""} ;
      P0A8C9_n12328RevenID = new boolean[] {false} ;
      P0A8C9_A6547DisVolMaq = new int[1] ;
      P0A8C9_A1122MaqCodDis = new String[] {""} ;
      P0A8C9_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C9_A392DisUniMed = new String[] {""} ;
      P0A8C9_A1195DisNomCli = new String[] {""} ;
      P0A8C9_A390DisTipCol = new byte[1] ;
      P0A8C9_n390DisTipCol = new boolean[] {false} ;
      P0A8C9_A363DisColNum = new int[1] ;
      P0A8C9_n363DisColNum = new boolean[] {false} ;
      P0A8C9_A362DisColNom = new String[] {""} ;
      P0A8C9_n362DisColNom = new boolean[] {false} ;
      P0A8C9_A335DisArtCod = new String[] {""} ;
      P0A8C9_A1502DisPart = new short[1] ;
      P0A8C9_A279CliNom = new String[] {""} ;
      P0A8C9_A252CliCod = new int[1] ;
      P0A8C9_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C9_A361DisCod = new int[1] ;
      P0A8C9_A4348DisUsrCod = new String[] {""} ;
      P0A8C9_A387DisPiePie = new short[1] ;
      P0A8C9_n387DisPiePie = new boolean[] {false} ;
      P0A8C9_A365DisDes = new String[] {""} ;
      P0A8C11_A396EmprCod = new String[] {""} ;
      P0A8C11_A367DisEst = new byte[1] ;
      P0A8C11_A362DisColNom = new String[] {""} ;
      P0A8C11_n362DisColNom = new boolean[] {false} ;
      P0A8C11_A12328RevenID = new String[] {""} ;
      P0A8C11_n12328RevenID = new boolean[] {false} ;
      P0A8C11_A6547DisVolMaq = new int[1] ;
      P0A8C11_A1122MaqCodDis = new String[] {""} ;
      P0A8C11_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C11_A392DisUniMed = new String[] {""} ;
      P0A8C11_A1195DisNomCli = new String[] {""} ;
      P0A8C11_A390DisTipCol = new byte[1] ;
      P0A8C11_n390DisTipCol = new boolean[] {false} ;
      P0A8C11_A363DisColNum = new int[1] ;
      P0A8C11_n363DisColNum = new boolean[] {false} ;
      P0A8C11_A337DisArtDsc = new String[] {""} ;
      P0A8C11_A335DisArtCod = new String[] {""} ;
      P0A8C11_A1502DisPart = new short[1] ;
      P0A8C11_A279CliNom = new String[] {""} ;
      P0A8C11_A252CliCod = new int[1] ;
      P0A8C11_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C11_A361DisCod = new int[1] ;
      P0A8C11_A4348DisUsrCod = new String[] {""} ;
      P0A8C11_A387DisPiePie = new short[1] ;
      P0A8C11_n387DisPiePie = new boolean[] {false} ;
      P0A8C11_A365DisDes = new String[] {""} ;
      P0A8C13_A396EmprCod = new String[] {""} ;
      P0A8C13_A367DisEst = new byte[1] ;
      P0A8C13_A1195DisNomCli = new String[] {""} ;
      P0A8C13_A12328RevenID = new String[] {""} ;
      P0A8C13_n12328RevenID = new boolean[] {false} ;
      P0A8C13_A6547DisVolMaq = new int[1] ;
      P0A8C13_A1122MaqCodDis = new String[] {""} ;
      P0A8C13_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C13_A392DisUniMed = new String[] {""} ;
      P0A8C13_A390DisTipCol = new byte[1] ;
      P0A8C13_n390DisTipCol = new boolean[] {false} ;
      P0A8C13_A363DisColNum = new int[1] ;
      P0A8C13_n363DisColNum = new boolean[] {false} ;
      P0A8C13_A362DisColNom = new String[] {""} ;
      P0A8C13_n362DisColNom = new boolean[] {false} ;
      P0A8C13_A337DisArtDsc = new String[] {""} ;
      P0A8C13_A335DisArtCod = new String[] {""} ;
      P0A8C13_A1502DisPart = new short[1] ;
      P0A8C13_A279CliNom = new String[] {""} ;
      P0A8C13_A252CliCod = new int[1] ;
      P0A8C13_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C13_A361DisCod = new int[1] ;
      P0A8C13_A4348DisUsrCod = new String[] {""} ;
      P0A8C13_A387DisPiePie = new short[1] ;
      P0A8C13_n387DisPiePie = new boolean[] {false} ;
      P0A8C13_A365DisDes = new String[] {""} ;
      P0A8C15_A396EmprCod = new String[] {""} ;
      P0A8C15_A367DisEst = new byte[1] ;
      P0A8C15_A392DisUniMed = new String[] {""} ;
      P0A8C15_A12328RevenID = new String[] {""} ;
      P0A8C15_n12328RevenID = new boolean[] {false} ;
      P0A8C15_A6547DisVolMaq = new int[1] ;
      P0A8C15_A1122MaqCodDis = new String[] {""} ;
      P0A8C15_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C15_A1195DisNomCli = new String[] {""} ;
      P0A8C15_A390DisTipCol = new byte[1] ;
      P0A8C15_n390DisTipCol = new boolean[] {false} ;
      P0A8C15_A363DisColNum = new int[1] ;
      P0A8C15_n363DisColNum = new boolean[] {false} ;
      P0A8C15_A362DisColNom = new String[] {""} ;
      P0A8C15_n362DisColNom = new boolean[] {false} ;
      P0A8C15_A337DisArtDsc = new String[] {""} ;
      P0A8C15_A335DisArtCod = new String[] {""} ;
      P0A8C15_A1502DisPart = new short[1] ;
      P0A8C15_A279CliNom = new String[] {""} ;
      P0A8C15_A252CliCod = new int[1] ;
      P0A8C15_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C15_A361DisCod = new int[1] ;
      P0A8C15_A4348DisUsrCod = new String[] {""} ;
      P0A8C15_A387DisPiePie = new short[1] ;
      P0A8C15_n387DisPiePie = new boolean[] {false} ;
      P0A8C15_A365DisDes = new String[] {""} ;
      AV47OptionDesc = "" ;
      P0A8C17_A396EmprCod = new String[] {""} ;
      P0A8C17_A1122MaqCodDis = new String[] {""} ;
      P0A8C17_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C17_A367DisEst = new byte[1] ;
      P0A8C17_A12328RevenID = new String[] {""} ;
      P0A8C17_n12328RevenID = new boolean[] {false} ;
      P0A8C17_A6547DisVolMaq = new int[1] ;
      P0A8C17_A392DisUniMed = new String[] {""} ;
      P0A8C17_A1195DisNomCli = new String[] {""} ;
      P0A8C17_A390DisTipCol = new byte[1] ;
      P0A8C17_n390DisTipCol = new boolean[] {false} ;
      P0A8C17_A363DisColNum = new int[1] ;
      P0A8C17_n363DisColNum = new boolean[] {false} ;
      P0A8C17_A362DisColNom = new String[] {""} ;
      P0A8C17_n362DisColNom = new boolean[] {false} ;
      P0A8C17_A337DisArtDsc = new String[] {""} ;
      P0A8C17_A335DisArtCod = new String[] {""} ;
      P0A8C17_A1502DisPart = new short[1] ;
      P0A8C17_A279CliNom = new String[] {""} ;
      P0A8C17_A252CliCod = new int[1] ;
      P0A8C17_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C17_A361DisCod = new int[1] ;
      P0A8C17_A4348DisUsrCod = new String[] {""} ;
      P0A8C17_A387DisPiePie = new short[1] ;
      P0A8C17_n387DisPiePie = new boolean[] {false} ;
      P0A8C17_A365DisDes = new String[] {""} ;
      P0A8C19_A396EmprCod = new String[] {""} ;
      P0A8C19_A12328RevenID = new String[] {""} ;
      P0A8C19_n12328RevenID = new boolean[] {false} ;
      P0A8C19_A367DisEst = new byte[1] ;
      P0A8C19_A6547DisVolMaq = new int[1] ;
      P0A8C19_A1122MaqCodDis = new String[] {""} ;
      P0A8C19_n1122MaqCodDis = new boolean[] {false} ;
      P0A8C19_A392DisUniMed = new String[] {""} ;
      P0A8C19_A1195DisNomCli = new String[] {""} ;
      P0A8C19_A390DisTipCol = new byte[1] ;
      P0A8C19_n390DisTipCol = new boolean[] {false} ;
      P0A8C19_A363DisColNum = new int[1] ;
      P0A8C19_n363DisColNum = new boolean[] {false} ;
      P0A8C19_A362DisColNom = new String[] {""} ;
      P0A8C19_n362DisColNom = new boolean[] {false} ;
      P0A8C19_A337DisArtDsc = new String[] {""} ;
      P0A8C19_A335DisArtCod = new String[] {""} ;
      P0A8C19_A1502DisPart = new short[1] ;
      P0A8C19_A279CliNom = new String[] {""} ;
      P0A8C19_A252CliCod = new int[1] ;
      P0A8C19_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8C19_A361DisCod = new int[1] ;
      P0A8C19_A4348DisUsrCod = new String[] {""} ;
      P0A8C19_A387DisPiePie = new short[1] ;
      P0A8C19_n387DisPiePie = new boolean[] {false} ;
      P0A8C19_A365DisDes = new String[] {""} ;
      X631Metros = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P0A8C20_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P0A8C21_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      P0A8C22_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P0A8C23_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.generacionaccesorios1getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A8C3_A396EmprCod, P0A8C3_A367DisEst, P0A8C3_A4348DisUsrCod, P0A8C3_A12328RevenID, P0A8C3_n12328RevenID, P0A8C3_A6547DisVolMaq, P0A8C3_A1122MaqCodDis, P0A8C3_n1122MaqCodDis, P0A8C3_A392DisUniMed, P0A8C3_A1195DisNomCli,
            P0A8C3_A390DisTipCol, P0A8C3_n390DisTipCol, P0A8C3_A363DisColNum, P0A8C3_n363DisColNum, P0A8C3_A362DisColNom, P0A8C3_n362DisColNom, P0A8C3_A337DisArtDsc, P0A8C3_A335DisArtCod, P0A8C3_A1502DisPart, P0A8C3_A279CliNom,
            P0A8C3_A252CliCod, P0A8C3_A369DisFec, P0A8C3_A361DisCod, P0A8C3_A387DisPiePie, P0A8C3_n387DisPiePie, P0A8C3_A365DisDes
            }
            , new Object[] {
            P0A8C5_A396EmprCod, P0A8C5_A367DisEst, P0A8C5_A279CliNom, P0A8C5_A12328RevenID, P0A8C5_n12328RevenID, P0A8C5_A6547DisVolMaq, P0A8C5_A1122MaqCodDis, P0A8C5_n1122MaqCodDis, P0A8C5_A392DisUniMed, P0A8C5_A1195DisNomCli,
            P0A8C5_A390DisTipCol, P0A8C5_n390DisTipCol, P0A8C5_A363DisColNum, P0A8C5_n363DisColNum, P0A8C5_A362DisColNom, P0A8C5_n362DisColNom, P0A8C5_A337DisArtDsc, P0A8C5_A335DisArtCod, P0A8C5_A1502DisPart, P0A8C5_A252CliCod,
            P0A8C5_A369DisFec, P0A8C5_A361DisCod, P0A8C5_A4348DisUsrCod, P0A8C5_A387DisPiePie, P0A8C5_n387DisPiePie, P0A8C5_A365DisDes
            }
            , new Object[] {
            P0A8C7_A396EmprCod, P0A8C7_A367DisEst, P0A8C7_A335DisArtCod, P0A8C7_A12328RevenID, P0A8C7_n12328RevenID, P0A8C7_A6547DisVolMaq, P0A8C7_A1122MaqCodDis, P0A8C7_n1122MaqCodDis, P0A8C7_A392DisUniMed, P0A8C7_A1195DisNomCli,
            P0A8C7_A390DisTipCol, P0A8C7_n390DisTipCol, P0A8C7_A363DisColNum, P0A8C7_n363DisColNum, P0A8C7_A362DisColNom, P0A8C7_n362DisColNom, P0A8C7_A337DisArtDsc, P0A8C7_A1502DisPart, P0A8C7_A279CliNom, P0A8C7_A252CliCod,
            P0A8C7_A369DisFec, P0A8C7_A361DisCod, P0A8C7_A4348DisUsrCod, P0A8C7_A387DisPiePie, P0A8C7_n387DisPiePie, P0A8C7_A365DisDes
            }
            , new Object[] {
            P0A8C9_A396EmprCod, P0A8C9_A367DisEst, P0A8C9_A337DisArtDsc, P0A8C9_A12328RevenID, P0A8C9_n12328RevenID, P0A8C9_A6547DisVolMaq, P0A8C9_A1122MaqCodDis, P0A8C9_n1122MaqCodDis, P0A8C9_A392DisUniMed, P0A8C9_A1195DisNomCli,
            P0A8C9_A390DisTipCol, P0A8C9_n390DisTipCol, P0A8C9_A363DisColNum, P0A8C9_n363DisColNum, P0A8C9_A362DisColNom, P0A8C9_n362DisColNom, P0A8C9_A335DisArtCod, P0A8C9_A1502DisPart, P0A8C9_A279CliNom, P0A8C9_A252CliCod,
            P0A8C9_A369DisFec, P0A8C9_A361DisCod, P0A8C9_A4348DisUsrCod, P0A8C9_A387DisPiePie, P0A8C9_n387DisPiePie, P0A8C9_A365DisDes
            }
            , new Object[] {
            P0A8C11_A396EmprCod, P0A8C11_A367DisEst, P0A8C11_A362DisColNom, P0A8C11_n362DisColNom, P0A8C11_A12328RevenID, P0A8C11_n12328RevenID, P0A8C11_A6547DisVolMaq, P0A8C11_A1122MaqCodDis, P0A8C11_n1122MaqCodDis, P0A8C11_A392DisUniMed,
            P0A8C11_A1195DisNomCli, P0A8C11_A390DisTipCol, P0A8C11_n390DisTipCol, P0A8C11_A363DisColNum, P0A8C11_n363DisColNum, P0A8C11_A337DisArtDsc, P0A8C11_A335DisArtCod, P0A8C11_A1502DisPart, P0A8C11_A279CliNom, P0A8C11_A252CliCod,
            P0A8C11_A369DisFec, P0A8C11_A361DisCod, P0A8C11_A4348DisUsrCod, P0A8C11_A387DisPiePie, P0A8C11_n387DisPiePie, P0A8C11_A365DisDes
            }
            , new Object[] {
            P0A8C13_A396EmprCod, P0A8C13_A367DisEst, P0A8C13_A1195DisNomCli, P0A8C13_A12328RevenID, P0A8C13_n12328RevenID, P0A8C13_A6547DisVolMaq, P0A8C13_A1122MaqCodDis, P0A8C13_n1122MaqCodDis, P0A8C13_A392DisUniMed, P0A8C13_A390DisTipCol,
            P0A8C13_n390DisTipCol, P0A8C13_A363DisColNum, P0A8C13_n363DisColNum, P0A8C13_A362DisColNom, P0A8C13_n362DisColNom, P0A8C13_A337DisArtDsc, P0A8C13_A335DisArtCod, P0A8C13_A1502DisPart, P0A8C13_A279CliNom, P0A8C13_A252CliCod,
            P0A8C13_A369DisFec, P0A8C13_A361DisCod, P0A8C13_A4348DisUsrCod, P0A8C13_A387DisPiePie, P0A8C13_n387DisPiePie, P0A8C13_A365DisDes
            }
            , new Object[] {
            P0A8C15_A396EmprCod, P0A8C15_A367DisEst, P0A8C15_A392DisUniMed, P0A8C15_A12328RevenID, P0A8C15_n12328RevenID, P0A8C15_A6547DisVolMaq, P0A8C15_A1122MaqCodDis, P0A8C15_n1122MaqCodDis, P0A8C15_A1195DisNomCli, P0A8C15_A390DisTipCol,
            P0A8C15_n390DisTipCol, P0A8C15_A363DisColNum, P0A8C15_n363DisColNum, P0A8C15_A362DisColNom, P0A8C15_n362DisColNom, P0A8C15_A337DisArtDsc, P0A8C15_A335DisArtCod, P0A8C15_A1502DisPart, P0A8C15_A279CliNom, P0A8C15_A252CliCod,
            P0A8C15_A369DisFec, P0A8C15_A361DisCod, P0A8C15_A4348DisUsrCod, P0A8C15_A387DisPiePie, P0A8C15_n387DisPiePie, P0A8C15_A365DisDes
            }
            , new Object[] {
            P0A8C17_A396EmprCod, P0A8C17_A1122MaqCodDis, P0A8C17_n1122MaqCodDis, P0A8C17_A367DisEst, P0A8C17_A12328RevenID, P0A8C17_n12328RevenID, P0A8C17_A6547DisVolMaq, P0A8C17_A392DisUniMed, P0A8C17_A1195DisNomCli, P0A8C17_A390DisTipCol,
            P0A8C17_n390DisTipCol, P0A8C17_A363DisColNum, P0A8C17_n363DisColNum, P0A8C17_A362DisColNom, P0A8C17_n362DisColNom, P0A8C17_A337DisArtDsc, P0A8C17_A335DisArtCod, P0A8C17_A1502DisPart, P0A8C17_A279CliNom, P0A8C17_A252CliCod,
            P0A8C17_A369DisFec, P0A8C17_A361DisCod, P0A8C17_A4348DisUsrCod, P0A8C17_A387DisPiePie, P0A8C17_n387DisPiePie, P0A8C17_A365DisDes
            }
            , new Object[] {
            P0A8C19_A396EmprCod, P0A8C19_A12328RevenID, P0A8C19_n12328RevenID, P0A8C19_A367DisEst, P0A8C19_A6547DisVolMaq, P0A8C19_A1122MaqCodDis, P0A8C19_n1122MaqCodDis, P0A8C19_A392DisUniMed, P0A8C19_A1195DisNomCli, P0A8C19_A390DisTipCol,
            P0A8C19_n390DisTipCol, P0A8C19_A363DisColNum, P0A8C19_n363DisColNum, P0A8C19_A362DisColNom, P0A8C19_n362DisColNom, P0A8C19_A337DisArtDsc, P0A8C19_A335DisArtCod, P0A8C19_A1502DisPart, P0A8C19_A279CliNom, P0A8C19_A252CliCod,
            P0A8C19_A369DisFec, P0A8C19_A361DisCod, P0A8C19_A4348DisUsrCod, P0A8C19_A387DisPiePie, P0A8C19_n387DisPiePie, P0A8C19_A365DisDes
            }
            , new Object[] {
            P0A8C20_A631Metros
            }
            , new Object[] {
            P0A8C21_A384DisPieMet
            }
            , new Object[] {
            P0A8C22_A595Kilos
            }
            , new Object[] {
            P0A8C23_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28TFDisTipCol ;
   private byte AV29TFDisTipCol_To ;
   private byte AV62DisEst ;
   private byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ;
   private byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ;
   private byte A390DisTipCol ;
   private byte A367DisEst ;
   private short AV18TFDisPart ;
   private short AV19TFDisPart_To ;
   private short AV34TFDisPiePie ;
   private short AV35TFDisPiePie_To ;
   private short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ;
   private short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ;
   private short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ;
   private short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ;
   private short A1502DisPart ;
   private short A387DisPiePie ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private int AV10TFDisCod ;
   private int AV11TFDisCod_To ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV26TFDisColNum ;
   private int AV27TFDisColNum_To ;
   private int AV68TFDisVolMaq ;
   private int AV69TFDisVolMaq_To ;
   private int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ;
   private int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ;
   private int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ;
   private int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ;
   private int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ;
   private int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ;
   private int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ;
   private int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A6547DisVolMaq ;
   private int E361DisCod ;
   private long AV52count ;
   private java.math.BigDecimal AV36TFDisPieKgm ;
   private java.math.BigDecimal AV37TFDisPieKgm_To ;
   private java.math.BigDecimal AV38TFDisPieMtr ;
   private java.math.BigDecimal AV39TFDisPieMtr_To ;
   private java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ;
   private java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ;
   private java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ;
   private java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String AV64TFDisUsrCod ;
   private String AV65TFDisUsrCod_Sel ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV20TFDisArtCod ;
   private String AV21TFDisArtCod_Sel ;
   private String AV22TFDisArtDsc ;
   private String AV23TFDisArtDsc_Sel ;
   private String AV24TFDisColNom ;
   private String AV25TFDisColNom_Sel ;
   private String AV30TFDisNomCli ;
   private String AV31TFDisNomCli_Sel ;
   private String AV32TFDisUniMed ;
   private String AV33TFDisUniMed_Sel ;
   private String AV66TFMaqCodDis ;
   private String AV67TFMaqCodDis_Sel ;
   private String AV70TFRevenID ;
   private String AV71TFRevenID_Sel ;
   private String AV59Emprcod ;
   private String AV63BarNHdr ;
   private String A4348DisUsrCod ;
   private String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ;
   private String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ;
   private String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ;
   private String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ;
   private String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ;
   private String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ;
   private String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ;
   private String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ;
   private String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ;
   private String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ;
   private String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ;
   private String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ;
   private String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ;
   private String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ;
   private String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ;
   private String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ;
   private String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ;
   private String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ;
   private String scmdbuf ;
   private String lV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ;
   private String lV83Pedidos_generacionaccesorios1ds_8_tfclinom ;
   private String lV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ;
   private String lV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ;
   private String lV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ;
   private String lV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ;
   private String lV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ;
   private String lV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ;
   private String lV111Pedidos_generacionaccesorios1ds_36_tfrevenid ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A392DisUniMed ;
   private String A1122MaqCodDis ;
   private String A12328RevenID ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String E396EmprCod ;
   private java.util.Date AV60TFDisFec ;
   private java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ;
   private java.util.Date A369DisFec ;
   private boolean returnInSub ;
   private boolean brkA8C2 ;
   private boolean n12328RevenID ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n387DisPiePie ;
   private boolean brkA8C4 ;
   private boolean brkA8C6 ;
   private boolean brkA8C8 ;
   private boolean brkA8C10 ;
   private boolean brkA8C12 ;
   private boolean brkA8C14 ;
   private boolean brkA8C16 ;
   private boolean brkA8C18 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV44Option ;
   private String AV47OptionDesc ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A8C3_A396EmprCod ;
   private byte[] P0A8C3_A367DisEst ;
   private String[] P0A8C3_A4348DisUsrCod ;
   private String[] P0A8C3_A12328RevenID ;
   private boolean[] P0A8C3_n12328RevenID ;
   private int[] P0A8C3_A6547DisVolMaq ;
   private String[] P0A8C3_A1122MaqCodDis ;
   private boolean[] P0A8C3_n1122MaqCodDis ;
   private String[] P0A8C3_A392DisUniMed ;
   private String[] P0A8C3_A1195DisNomCli ;
   private byte[] P0A8C3_A390DisTipCol ;
   private boolean[] P0A8C3_n390DisTipCol ;
   private int[] P0A8C3_A363DisColNum ;
   private boolean[] P0A8C3_n363DisColNum ;
   private String[] P0A8C3_A362DisColNom ;
   private boolean[] P0A8C3_n362DisColNom ;
   private String[] P0A8C3_A337DisArtDsc ;
   private String[] P0A8C3_A335DisArtCod ;
   private short[] P0A8C3_A1502DisPart ;
   private String[] P0A8C3_A279CliNom ;
   private int[] P0A8C3_A252CliCod ;
   private java.util.Date[] P0A8C3_A369DisFec ;
   private int[] P0A8C3_A361DisCod ;
   private short[] P0A8C3_A387DisPiePie ;
   private boolean[] P0A8C3_n387DisPiePie ;
   private String[] P0A8C3_A365DisDes ;
   private String[] P0A8C5_A396EmprCod ;
   private byte[] P0A8C5_A367DisEst ;
   private String[] P0A8C5_A279CliNom ;
   private String[] P0A8C5_A12328RevenID ;
   private boolean[] P0A8C5_n12328RevenID ;
   private int[] P0A8C5_A6547DisVolMaq ;
   private String[] P0A8C5_A1122MaqCodDis ;
   private boolean[] P0A8C5_n1122MaqCodDis ;
   private String[] P0A8C5_A392DisUniMed ;
   private String[] P0A8C5_A1195DisNomCli ;
   private byte[] P0A8C5_A390DisTipCol ;
   private boolean[] P0A8C5_n390DisTipCol ;
   private int[] P0A8C5_A363DisColNum ;
   private boolean[] P0A8C5_n363DisColNum ;
   private String[] P0A8C5_A362DisColNom ;
   private boolean[] P0A8C5_n362DisColNom ;
   private String[] P0A8C5_A337DisArtDsc ;
   private String[] P0A8C5_A335DisArtCod ;
   private short[] P0A8C5_A1502DisPart ;
   private int[] P0A8C5_A252CliCod ;
   private java.util.Date[] P0A8C5_A369DisFec ;
   private int[] P0A8C5_A361DisCod ;
   private String[] P0A8C5_A4348DisUsrCod ;
   private short[] P0A8C5_A387DisPiePie ;
   private boolean[] P0A8C5_n387DisPiePie ;
   private String[] P0A8C5_A365DisDes ;
   private String[] P0A8C7_A396EmprCod ;
   private byte[] P0A8C7_A367DisEst ;
   private String[] P0A8C7_A335DisArtCod ;
   private String[] P0A8C7_A12328RevenID ;
   private boolean[] P0A8C7_n12328RevenID ;
   private int[] P0A8C7_A6547DisVolMaq ;
   private String[] P0A8C7_A1122MaqCodDis ;
   private boolean[] P0A8C7_n1122MaqCodDis ;
   private String[] P0A8C7_A392DisUniMed ;
   private String[] P0A8C7_A1195DisNomCli ;
   private byte[] P0A8C7_A390DisTipCol ;
   private boolean[] P0A8C7_n390DisTipCol ;
   private int[] P0A8C7_A363DisColNum ;
   private boolean[] P0A8C7_n363DisColNum ;
   private String[] P0A8C7_A362DisColNom ;
   private boolean[] P0A8C7_n362DisColNom ;
   private String[] P0A8C7_A337DisArtDsc ;
   private short[] P0A8C7_A1502DisPart ;
   private String[] P0A8C7_A279CliNom ;
   private int[] P0A8C7_A252CliCod ;
   private java.util.Date[] P0A8C7_A369DisFec ;
   private int[] P0A8C7_A361DisCod ;
   private String[] P0A8C7_A4348DisUsrCod ;
   private short[] P0A8C7_A387DisPiePie ;
   private boolean[] P0A8C7_n387DisPiePie ;
   private String[] P0A8C7_A365DisDes ;
   private String[] P0A8C9_A396EmprCod ;
   private byte[] P0A8C9_A367DisEst ;
   private String[] P0A8C9_A337DisArtDsc ;
   private String[] P0A8C9_A12328RevenID ;
   private boolean[] P0A8C9_n12328RevenID ;
   private int[] P0A8C9_A6547DisVolMaq ;
   private String[] P0A8C9_A1122MaqCodDis ;
   private boolean[] P0A8C9_n1122MaqCodDis ;
   private String[] P0A8C9_A392DisUniMed ;
   private String[] P0A8C9_A1195DisNomCli ;
   private byte[] P0A8C9_A390DisTipCol ;
   private boolean[] P0A8C9_n390DisTipCol ;
   private int[] P0A8C9_A363DisColNum ;
   private boolean[] P0A8C9_n363DisColNum ;
   private String[] P0A8C9_A362DisColNom ;
   private boolean[] P0A8C9_n362DisColNom ;
   private String[] P0A8C9_A335DisArtCod ;
   private short[] P0A8C9_A1502DisPart ;
   private String[] P0A8C9_A279CliNom ;
   private int[] P0A8C9_A252CliCod ;
   private java.util.Date[] P0A8C9_A369DisFec ;
   private int[] P0A8C9_A361DisCod ;
   private String[] P0A8C9_A4348DisUsrCod ;
   private short[] P0A8C9_A387DisPiePie ;
   private boolean[] P0A8C9_n387DisPiePie ;
   private String[] P0A8C9_A365DisDes ;
   private String[] P0A8C11_A396EmprCod ;
   private byte[] P0A8C11_A367DisEst ;
   private String[] P0A8C11_A362DisColNom ;
   private boolean[] P0A8C11_n362DisColNom ;
   private String[] P0A8C11_A12328RevenID ;
   private boolean[] P0A8C11_n12328RevenID ;
   private int[] P0A8C11_A6547DisVolMaq ;
   private String[] P0A8C11_A1122MaqCodDis ;
   private boolean[] P0A8C11_n1122MaqCodDis ;
   private String[] P0A8C11_A392DisUniMed ;
   private String[] P0A8C11_A1195DisNomCli ;
   private byte[] P0A8C11_A390DisTipCol ;
   private boolean[] P0A8C11_n390DisTipCol ;
   private int[] P0A8C11_A363DisColNum ;
   private boolean[] P0A8C11_n363DisColNum ;
   private String[] P0A8C11_A337DisArtDsc ;
   private String[] P0A8C11_A335DisArtCod ;
   private short[] P0A8C11_A1502DisPart ;
   private String[] P0A8C11_A279CliNom ;
   private int[] P0A8C11_A252CliCod ;
   private java.util.Date[] P0A8C11_A369DisFec ;
   private int[] P0A8C11_A361DisCod ;
   private String[] P0A8C11_A4348DisUsrCod ;
   private short[] P0A8C11_A387DisPiePie ;
   private boolean[] P0A8C11_n387DisPiePie ;
   private String[] P0A8C11_A365DisDes ;
   private String[] P0A8C13_A396EmprCod ;
   private byte[] P0A8C13_A367DisEst ;
   private String[] P0A8C13_A1195DisNomCli ;
   private String[] P0A8C13_A12328RevenID ;
   private boolean[] P0A8C13_n12328RevenID ;
   private int[] P0A8C13_A6547DisVolMaq ;
   private String[] P0A8C13_A1122MaqCodDis ;
   private boolean[] P0A8C13_n1122MaqCodDis ;
   private String[] P0A8C13_A392DisUniMed ;
   private byte[] P0A8C13_A390DisTipCol ;
   private boolean[] P0A8C13_n390DisTipCol ;
   private int[] P0A8C13_A363DisColNum ;
   private boolean[] P0A8C13_n363DisColNum ;
   private String[] P0A8C13_A362DisColNom ;
   private boolean[] P0A8C13_n362DisColNom ;
   private String[] P0A8C13_A337DisArtDsc ;
   private String[] P0A8C13_A335DisArtCod ;
   private short[] P0A8C13_A1502DisPart ;
   private String[] P0A8C13_A279CliNom ;
   private int[] P0A8C13_A252CliCod ;
   private java.util.Date[] P0A8C13_A369DisFec ;
   private int[] P0A8C13_A361DisCod ;
   private String[] P0A8C13_A4348DisUsrCod ;
   private short[] P0A8C13_A387DisPiePie ;
   private boolean[] P0A8C13_n387DisPiePie ;
   private String[] P0A8C13_A365DisDes ;
   private String[] P0A8C15_A396EmprCod ;
   private byte[] P0A8C15_A367DisEst ;
   private String[] P0A8C15_A392DisUniMed ;
   private String[] P0A8C15_A12328RevenID ;
   private boolean[] P0A8C15_n12328RevenID ;
   private int[] P0A8C15_A6547DisVolMaq ;
   private String[] P0A8C15_A1122MaqCodDis ;
   private boolean[] P0A8C15_n1122MaqCodDis ;
   private String[] P0A8C15_A1195DisNomCli ;
   private byte[] P0A8C15_A390DisTipCol ;
   private boolean[] P0A8C15_n390DisTipCol ;
   private int[] P0A8C15_A363DisColNum ;
   private boolean[] P0A8C15_n363DisColNum ;
   private String[] P0A8C15_A362DisColNom ;
   private boolean[] P0A8C15_n362DisColNom ;
   private String[] P0A8C15_A337DisArtDsc ;
   private String[] P0A8C15_A335DisArtCod ;
   private short[] P0A8C15_A1502DisPart ;
   private String[] P0A8C15_A279CliNom ;
   private int[] P0A8C15_A252CliCod ;
   private java.util.Date[] P0A8C15_A369DisFec ;
   private int[] P0A8C15_A361DisCod ;
   private String[] P0A8C15_A4348DisUsrCod ;
   private short[] P0A8C15_A387DisPiePie ;
   private boolean[] P0A8C15_n387DisPiePie ;
   private String[] P0A8C15_A365DisDes ;
   private String[] P0A8C17_A396EmprCod ;
   private String[] P0A8C17_A1122MaqCodDis ;
   private boolean[] P0A8C17_n1122MaqCodDis ;
   private byte[] P0A8C17_A367DisEst ;
   private String[] P0A8C17_A12328RevenID ;
   private boolean[] P0A8C17_n12328RevenID ;
   private int[] P0A8C17_A6547DisVolMaq ;
   private String[] P0A8C17_A392DisUniMed ;
   private String[] P0A8C17_A1195DisNomCli ;
   private byte[] P0A8C17_A390DisTipCol ;
   private boolean[] P0A8C17_n390DisTipCol ;
   private int[] P0A8C17_A363DisColNum ;
   private boolean[] P0A8C17_n363DisColNum ;
   private String[] P0A8C17_A362DisColNom ;
   private boolean[] P0A8C17_n362DisColNom ;
   private String[] P0A8C17_A337DisArtDsc ;
   private String[] P0A8C17_A335DisArtCod ;
   private short[] P0A8C17_A1502DisPart ;
   private String[] P0A8C17_A279CliNom ;
   private int[] P0A8C17_A252CliCod ;
   private java.util.Date[] P0A8C17_A369DisFec ;
   private int[] P0A8C17_A361DisCod ;
   private String[] P0A8C17_A4348DisUsrCod ;
   private short[] P0A8C17_A387DisPiePie ;
   private boolean[] P0A8C17_n387DisPiePie ;
   private String[] P0A8C17_A365DisDes ;
   private String[] P0A8C19_A396EmprCod ;
   private String[] P0A8C19_A12328RevenID ;
   private boolean[] P0A8C19_n12328RevenID ;
   private byte[] P0A8C19_A367DisEst ;
   private int[] P0A8C19_A6547DisVolMaq ;
   private String[] P0A8C19_A1122MaqCodDis ;
   private boolean[] P0A8C19_n1122MaqCodDis ;
   private String[] P0A8C19_A392DisUniMed ;
   private String[] P0A8C19_A1195DisNomCli ;
   private byte[] P0A8C19_A390DisTipCol ;
   private boolean[] P0A8C19_n390DisTipCol ;
   private int[] P0A8C19_A363DisColNum ;
   private boolean[] P0A8C19_n363DisColNum ;
   private String[] P0A8C19_A362DisColNom ;
   private boolean[] P0A8C19_n362DisColNom ;
   private String[] P0A8C19_A337DisArtDsc ;
   private String[] P0A8C19_A335DisArtCod ;
   private short[] P0A8C19_A1502DisPart ;
   private String[] P0A8C19_A279CliNom ;
   private int[] P0A8C19_A252CliCod ;
   private java.util.Date[] P0A8C19_A369DisFec ;
   private int[] P0A8C19_A361DisCod ;
   private String[] P0A8C19_A4348DisUsrCod ;
   private short[] P0A8C19_A387DisPiePie ;
   private boolean[] P0A8C19_n387DisPiePie ;
   private String[] P0A8C19_A365DisDes ;
   private java.math.BigDecimal[] P0A8C20_A631Metros ;
   private java.math.BigDecimal[] P0A8C21_A384DisPieMet ;
   private java.math.BigDecimal[] P0A8C22_A595Kilos ;
   private java.math.BigDecimal[] P0A8C23_A382DisPieKil ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class generacionaccesorios1getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A8C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A1502DisPart ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          String A392DisUniMed ,
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          byte A367DisEst ,
                                          byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[37];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisUsrCod, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc," ;
      scmdbuf += " T1.DisArtCod, T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisUsrCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A8C5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A1502DisPart ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          String A392DisUniMed ,
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          byte A367DisEst ,
                                          byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[37];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T2.CliNom, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc," ;
      scmdbuf += " T1.DisArtCod, T1.DisPart, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A8C7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A1502DisPart ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          String A392DisUniMed ,
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          byte A367DisEst ,
                                          byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[37];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisArtCod, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A8C9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                          String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                          int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                          int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                          java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                          int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                          int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                          String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                          String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                          short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                          short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                          String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                          String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                          String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                          String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                          String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                          String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                          int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                          int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                          byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                          byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                          String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                          String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                          String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                          String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                          String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                          String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                          int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                          int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                          String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                          String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                          String A4348DisUsrCod ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A1502DisPart ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          String A392DisUniMed ,
                                          String A1122MaqCodDis ,
                                          int A6547DisVolMaq ,
                                          String A12328RevenID ,
                                          short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                          java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                          java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          byte A367DisEst ,
                                          byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[37];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisArtDsc, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A8C11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                           int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                           java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                           int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                           String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                           short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                           String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                           int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                           byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                           byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                           String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                           int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                           String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           String A4348DisUsrCod ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           short A1502DisPart ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           String A392DisUniMed ,
                                           String A1122MaqCodDis ,
                                           int A6547DisVolMaq ,
                                           String A12328RevenID ,
                                           short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                           java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           String A396EmprCod ,
                                           String AV59Emprcod ,
                                           byte A367DisEst ,
                                           byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[37];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisColNom, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0A8C13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                           int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                           java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                           int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                           String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                           short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                           String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                           int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                           byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                           byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                           String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                           int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                           String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           String A4348DisUsrCod ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           short A1502DisPart ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           String A392DisUniMed ,
                                           String A1122MaqCodDis ,
                                           int A6547DisVolMaq ,
                                           String A12328RevenID ,
                                           short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                           java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           String A396EmprCod ,
                                           String AV59Emprcod ,
                                           byte A367DisEst ,
                                           byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[37];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisNomCli, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisNomCli" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0A8C15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                           int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                           java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                           int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                           String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                           short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                           String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                           int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                           byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                           byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                           String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                           int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                           String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           String A4348DisUsrCod ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           short A1502DisPart ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           String A392DisUniMed ,
                                           String A1122MaqCodDis ,
                                           int A6547DisVolMaq ,
                                           String A12328RevenID ,
                                           short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                           java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           String A396EmprCod ,
                                           String AV59Emprcod ,
                                           byte A367DisEst ,
                                           byte AV62DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[37];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisUniMed, T1.RevenID, T1.DisVolMaq, T1.MaqCodDis, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisUniMed" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0A8C17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                           int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                           java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                           int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                           String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                           short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                           String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                           int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                           byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                           byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                           String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                           int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                           String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           String A4348DisUsrCod ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           short A1502DisPart ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           String A392DisUniMed ,
                                           String A1122MaqCodDis ,
                                           int A6547DisVolMaq ,
                                           String A12328RevenID ,
                                           short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                           java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           byte A367DisEst ,
                                           byte AV62DisEst ,
                                           String AV59Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[37];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodDis, T1.DisEst, T1.RevenID, T1.DisVolMaq, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCodDis" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P0A8C19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel ,
                                           String AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod ,
                                           int AV78Pedidos_generacionaccesorios1ds_3_tfdiscod ,
                                           int AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to ,
                                           java.util.Date AV80Pedidos_generacionaccesorios1ds_5_tfdisfec ,
                                           int AV81Pedidos_generacionaccesorios1ds_6_tfclicod ,
                                           int AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to ,
                                           String AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel ,
                                           String AV83Pedidos_generacionaccesorios1ds_8_tfclinom ,
                                           short AV85Pedidos_generacionaccesorios1ds_10_tfdispart ,
                                           short AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to ,
                                           String AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel ,
                                           String AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod ,
                                           String AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel ,
                                           String AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc ,
                                           String AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel ,
                                           String AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom ,
                                           int AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum ,
                                           int AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to ,
                                           byte AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol ,
                                           byte AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to ,
                                           String AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel ,
                                           String AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli ,
                                           String AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel ,
                                           String AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed ,
                                           String AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel ,
                                           String AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis ,
                                           int AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq ,
                                           int AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to ,
                                           String AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel ,
                                           String AV111Pedidos_generacionaccesorios1ds_36_tfrevenid ,
                                           String A4348DisUsrCod ,
                                           int A361DisCod ,
                                           java.util.Date A369DisFec ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           short A1502DisPart ,
                                           String A335DisArtCod ,
                                           String A337DisArtDsc ,
                                           String A362DisColNom ,
                                           int A363DisColNum ,
                                           byte A390DisTipCol ,
                                           String A1195DisNomCli ,
                                           String A392DisUniMed ,
                                           String A1122MaqCodDis ,
                                           int A6547DisVolMaq ,
                                           String A12328RevenID ,
                                           short AV101Pedidos_generacionaccesorios1ds_26_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV102Pedidos_generacionaccesorios1ds_27_tfdispiepie_to ,
                                           java.math.BigDecimal AV103Pedidos_generacionaccesorios1ds_28_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV104Pedidos_generacionaccesorios1ds_29_tfdispiekgm_to ,
                                           java.math.BigDecimal AV105Pedidos_generacionaccesorios1ds_30_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV106Pedidos_generacionaccesorios1ds_31_tfdispiemtr_to ,
                                           byte A367DisEst ,
                                           byte AV62DisEst ,
                                           String AV59Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[37];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RevenID, T1.DisEst, T1.DisVolMaq, T1.MaqCodDis, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T1.DisPart, T2.CliNom, T1.CliCod, T1.DisFec, T1.DisCod, T1.DisUsrCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.DisCod > 0)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Pedidos_generacionaccesorios1ds_1_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Pedidos_generacionaccesorios1ds_2_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_generacionaccesorios1ds_3_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV79Pedidos_generacionaccesorios1ds_4_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Pedidos_generacionaccesorios1ds_5_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Pedidos_generacionaccesorios1ds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Pedidos_generacionaccesorios1ds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_generacionaccesorios1ds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_generacionaccesorios1ds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_generacionaccesorios1ds_10_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_generacionaccesorios1ds_11_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_generacionaccesorios1ds_12_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_generacionaccesorios1ds_13_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_generacionaccesorios1ds_14_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_generacionaccesorios1ds_15_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_generacionaccesorios1ds_16_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_generacionaccesorios1ds_17_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Pedidos_generacionaccesorios1ds_18_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Pedidos_generacionaccesorios1ds_19_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_generacionaccesorios1ds_20_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_generacionaccesorios1ds_21_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_generacionaccesorios1ds_22_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_generacionaccesorios1ds_23_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_generacionaccesorios1ds_24_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_generacionaccesorios1ds_25_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_generacionaccesorios1ds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_generacionaccesorios1ds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_generacionaccesorios1ds_34_tfdisvolmaq) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq >= ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_generacionaccesorios1ds_35_tfdisvolmaq_to) )
      {
         addWhere(sWhereString, "(T1.DisVolMaq <= ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_generacionaccesorios1ds_36_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_generacionaccesorios1ds_37_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RevenID = ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.RevenID" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P0A8C3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 1 :
                  return conditional_P0A8C5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 2 :
                  return conditional_P0A8C7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 3 :
                  return conditional_P0A8C9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 4 :
                  return conditional_P0A8C11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 5 :
                  return conditional_P0A8C13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 6 :
                  return conditional_P0A8C15(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , ((Number) dynConstraints[59]).byteValue() );
            case 7 :
                  return conditional_P0A8C17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 8 :
                  return conditional_P0A8C19(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C20", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C21", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C22", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8C23", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((String[]) buf[17])[0] = rslt.getString(13, 16);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 30);
               ((int[]) buf[20])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((String[]) buf[17])[0] = rslt.getString(13, 16);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 10);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

