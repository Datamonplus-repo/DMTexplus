package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayolaboratoriowwgetfilterdata extends GXProcedure
{
   public entradaensayolaboratoriowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratoriowwgetfilterdata.class ), "" );
   }

   public entradaensayolaboratoriowwgetfilterdata( int remoteHandle ,
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
      entradaensayolaboratoriowwgetfilterdata.this.aP5 = new String[] {""};
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
      entradaensayolaboratoriowwgetfilterdata.this.AV58DDOName = aP0;
      entradaensayolaboratoriowwgetfilterdata.this.AV56SearchTxt = aP1;
      entradaensayolaboratoriowwgetfilterdata.this.AV57SearchTxtTo = aP2;
      entradaensayolaboratoriowwgetfilterdata.this.aP3 = aP3;
      entradaensayolaboratoriowwgetfilterdata.this.aP4 = aP4;
      entradaensayolaboratoriowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_COLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_COLNOMC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_CARTAZ") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_CARTAZOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_PANTONE") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_PANTONEOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_LB_PEDCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_PEDCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV62OptionsJson = AV61Options.toJSonString(false) ;
      AV65OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV67OptionIndexesJson = AV66OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), null, null);
      }
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV74FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV10TFLb_numero = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLb_numero_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV16TFLb_ArtCod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV17TFLb_ArtCod_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV18TFLb_ArtDsc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV19TFLb_ArtDsc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV24TFLb_ColNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV25TFLb_ColNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV26TFLb_ColNum = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFLb_ColNum_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV28TFTipColCod = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFTipColCod_To = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV32TFLb_ColNomC = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV33TFLb_ColNomC_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUMC") == 0 )
         {
            AV34TFLb_ColNumC = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFLb_ColNumC_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV36TFLb_Cartaz = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV37TFLb_Cartaz_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAE") == 0 )
         {
            AV40TFLb_HoraE = GXutil.resetDate(localUtil.ctot( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV77TFLb_EstEns_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV78TFLb_EstEns_Sels.fromJSonString(AV77TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV50TFLb_Rb = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFLb_Rb_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE") == 0 )
         {
            AV82TFLb_Pantone = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE_SEL") == 0 )
         {
            AV83TFLb_Pantone_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD") == 0 )
         {
            AV84TFLb_PedCod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD_SEL") == 0 )
         {
            AV85TFLb_PedCod_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV56SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD2 */
      pr_default.execute(0, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OD2 = false ;
         A396EmprCod = P09OD2_A396EmprCod[0] ;
         A279CliNom = P09OD2_A279CliNom[0] ;
         A5541Lb_FechaE = P09OD2_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD2_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OD2_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD2_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD2_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD2_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD2_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD2_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD2_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD2_A831TipColCod[0] ;
         n831TipColCod = P09OD2_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD2_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OD2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OD2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09OD2_A252CliCod[0] ;
         A5532Lb_numero = P09OD2_A5532Lb_numero[0] ;
         A279CliNom = P09OD2_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OD2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9OD2 = false ;
            A396EmprCod = P09OD2_A396EmprCod[0] ;
            A252CliCod = P09OD2_A252CliCod[0] ;
            A5532Lb_numero = P09OD2_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV60Option = A279CliNom ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD2 )
         {
            brk9OD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLb_ArtCod = AV56SearchTxt ;
      AV17TFLb_ArtCod_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD3 */
      pr_default.execute(1, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OD4 = false ;
         A396EmprCod = P09OD3_A396EmprCod[0] ;
         A5533Lb_ArtCod = P09OD3_A5533Lb_ArtCod[0] ;
         A5541Lb_FechaE = P09OD3_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD3_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OD3_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD3_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD3_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD3_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD3_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD3_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD3_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD3_A831TipColCod[0] ;
         n831TipColCod = P09OD3_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD3_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD3_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OD3_A5534Lb_ArtDsc[0] ;
         A279CliNom = P09OD3_A279CliNom[0] ;
         A252CliCod = P09OD3_A252CliCod[0] ;
         A5532Lb_numero = P09OD3_A5532Lb_numero[0] ;
         A279CliNom = P09OD3_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OD3_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9OD4 = false ;
            A396EmprCod = P09OD3_A396EmprCod[0] ;
            A5532Lb_numero = P09OD3_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV60Option = A5533Lb_ArtCod ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD4 )
         {
            brk9OD4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_ARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFLb_ArtDsc = AV56SearchTxt ;
      AV19TFLb_ArtDsc_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD4 */
      pr_default.execute(2, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OD6 = false ;
         A396EmprCod = P09OD4_A396EmprCod[0] ;
         A5534Lb_ArtDsc = P09OD4_A5534Lb_ArtDsc[0] ;
         A5541Lb_FechaE = P09OD4_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD4_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OD4_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD4_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD4_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD4_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD4_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD4_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD4_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD4_A831TipColCod[0] ;
         n831TipColCod = P09OD4_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD4_A5536Lb_ColNom[0] ;
         A5533Lb_ArtCod = P09OD4_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OD4_A279CliNom[0] ;
         A252CliCod = P09OD4_A252CliCod[0] ;
         A5532Lb_numero = P09OD4_A5532Lb_numero[0] ;
         A279CliNom = P09OD4_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OD4_A5534Lb_ArtDsc[0], A5534Lb_ArtDsc) == 0 ) )
         {
            brk9OD6 = false ;
            A396EmprCod = P09OD4_A396EmprCod[0] ;
            A5532Lb_numero = P09OD4_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5534Lb_ArtDsc)==0) )
         {
            AV60Option = A5534Lb_ArtDsc ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD6 )
         {
            brk9OD6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFLb_ColNom = AV56SearchTxt ;
      AV25TFLb_ColNom_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD5 */
      pr_default.execute(3, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9OD8 = false ;
         A396EmprCod = P09OD5_A396EmprCod[0] ;
         A5536Lb_ColNom = P09OD5_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09OD5_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD5_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OD5_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD5_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD5_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD5_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD5_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD5_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD5_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD5_A831TipColCod[0] ;
         n831TipColCod = P09OD5_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD5_A5537Lb_ColNum[0] ;
         A5534Lb_ArtDsc = P09OD5_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OD5_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OD5_A279CliNom[0] ;
         A252CliCod = P09OD5_A252CliCod[0] ;
         A5532Lb_numero = P09OD5_A5532Lb_numero[0] ;
         A279CliNom = P09OD5_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09OD5_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk9OD8 = false ;
            A396EmprCod = P09OD5_A396EmprCod[0] ;
            A5532Lb_numero = P09OD5_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5536Lb_ColNom)==0) )
         {
            AV60Option = A5536Lb_ColNom ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD8 )
         {
            brk9OD8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV32TFLb_ColNomC = AV56SearchTxt ;
      AV33TFLb_ColNomC_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD6 */
      pr_default.execute(4, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9OD10 = false ;
         A396EmprCod = P09OD6_A396EmprCod[0] ;
         A5538Lb_ColNomC = P09OD6_A5538Lb_ColNomC[0] ;
         A5541Lb_FechaE = P09OD6_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD6_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OD6_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD6_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD6_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD6_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD6_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD6_A5539Lb_ColNumC[0] ;
         A831TipColCod = P09OD6_A831TipColCod[0] ;
         n831TipColCod = P09OD6_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD6_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD6_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OD6_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OD6_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OD6_A279CliNom[0] ;
         A252CliCod = P09OD6_A252CliCod[0] ;
         A5532Lb_numero = P09OD6_A5532Lb_numero[0] ;
         A279CliNom = P09OD6_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09OD6_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
         {
            brk9OD10 = false ;
            A396EmprCod = P09OD6_A396EmprCod[0] ;
            A5532Lb_numero = P09OD6_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
         {
            AV60Option = A5538Lb_ColNomC ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD10 )
         {
            brk9OD10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV36TFLb_Cartaz = AV56SearchTxt ;
      AV37TFLb_Cartaz_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD7 */
      pr_default.execute(5, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9OD12 = false ;
         A396EmprCod = P09OD7_A396EmprCod[0] ;
         A5540Lb_Cartaz = P09OD7_A5540Lb_Cartaz[0] ;
         A5541Lb_FechaE = P09OD7_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD7_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OD7_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD7_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD7_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD7_A5542Lb_HoraE[0] ;
         A5539Lb_ColNumC = P09OD7_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD7_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD7_A831TipColCod[0] ;
         n831TipColCod = P09OD7_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD7_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD7_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OD7_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OD7_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OD7_A279CliNom[0] ;
         A252CliCod = P09OD7_A252CliCod[0] ;
         A5532Lb_numero = P09OD7_A5532Lb_numero[0] ;
         A279CliNom = P09OD7_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09OD7_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9OD12 = false ;
            A396EmprCod = P09OD7_A396EmprCod[0] ;
            A5532Lb_numero = P09OD7_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5540Lb_Cartaz)==0) )
         {
            AV60Option = A5540Lb_Cartaz ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD12 )
         {
            brk9OD12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADLB_PANTONEOPTIONS' Routine */
      returnInSub = false ;
      AV82TFLb_Pantone = AV56SearchTxt ;
      AV83TFLb_Pantone_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD8 */
      pr_default.execute(6, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9OD14 = false ;
         A396EmprCod = P09OD8_A396EmprCod[0] ;
         A6546Lb_Pantone = P09OD8_A6546Lb_Pantone[0] ;
         A5541Lb_FechaE = P09OD8_A5541Lb_FechaE[0] ;
         A6618Lb_PedCod = P09OD8_A6618Lb_PedCod[0] ;
         A5547Lb_Rb = P09OD8_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD8_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD8_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD8_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD8_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD8_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD8_A831TipColCod[0] ;
         n831TipColCod = P09OD8_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD8_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD8_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OD8_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OD8_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OD8_A279CliNom[0] ;
         A252CliCod = P09OD8_A252CliCod[0] ;
         A5532Lb_numero = P09OD8_A5532Lb_numero[0] ;
         A279CliNom = P09OD8_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09OD8_A6546Lb_Pantone[0], A6546Lb_Pantone) == 0 ) )
         {
            brk9OD14 = false ;
            A396EmprCod = P09OD8_A396EmprCod[0] ;
            A5532Lb_numero = P09OD8_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A6546Lb_Pantone)==0) )
         {
            AV60Option = A6546Lb_Pantone ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD14 )
         {
            brk9OD14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADLB_PEDCODOPTIONS' Routine */
      returnInSub = false ;
      AV84TFLb_PedCod = AV56SearchTxt ;
      AV85TFLb_PedCod_Sel = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV74FilterFullText ;
      AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV10TFLb_numero ;
      AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV12TFCliCod ;
      AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV14TFCliNom ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV24TFLb_ColNom ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV26TFLb_ColNum ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV28TFTipColCod ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV29TFTipColCod_To ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV32TFLb_ColNomC ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV33TFLb_ColNomC_Sel ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV34TFLb_ColNumC ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV35TFLb_ColNumC_To ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV36TFLb_Cartaz ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV37TFLb_Cartaz_Sel ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV40TFLb_HoraE ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV78TFLb_EstEns_Sels ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV50TFLb_Rb ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV51TFLb_Rb_To ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV82TFLb_Pantone ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV83TFLb_Pantone_Sel ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV84TFLb_PedCod ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV85TFLb_PedCod_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV80Lb_FechaEfrom ,
                                           AV81Lb_FechaEto ,
                                           Integer.valueOf(AV86lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           A396EmprCod ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OD9 */
      pr_default.execute(7, new Object[] {AV79EmprCod, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV80Lb_FechaEfrom, AV81Lb_FechaEto, Integer.valueOf(AV86lb_numero)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9OD16 = false ;
         A396EmprCod = P09OD9_A396EmprCod[0] ;
         A6618Lb_PedCod = P09OD9_A6618Lb_PedCod[0] ;
         A5541Lb_FechaE = P09OD9_A5541Lb_FechaE[0] ;
         A6546Lb_Pantone = P09OD9_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OD9_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OD9_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OD9_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OD9_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OD9_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OD9_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OD9_A831TipColCod[0] ;
         n831TipColCod = P09OD9_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OD9_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OD9_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OD9_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OD9_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OD9_A279CliNom[0] ;
         A252CliCod = P09OD9_A252CliCod[0] ;
         A5532Lb_numero = P09OD9_A5532Lb_numero[0] ;
         A279CliNom = P09OD9_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09OD9_A6618Lb_PedCod[0], A6618Lb_PedCod) == 0 ) )
         {
            brk9OD16 = false ;
            A396EmprCod = P09OD9_A396EmprCod[0] ;
            A5532Lb_numero = P09OD9_A5532Lb_numero[0] ;
            AV68count = (long)(AV68count+1) ;
            brk9OD16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A6618Lb_PedCod)==0) )
         {
            AV60Option = A6618Lb_PedCod ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OD16 )
         {
            brk9OD16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradaensayolaboratoriowwgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = entradaensayolaboratoriowwgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = entradaensayolaboratoriowwgetfilterdata.this.AV67OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62OptionsJson = "" ;
      AV65OptionsDescJson = "" ;
      AV67OptionIndexesJson = "" ;
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV69Session = httpContext.getWebSession();
      AV71GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV72GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74FilterFullText = "" ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV16TFLb_ArtCod = "" ;
      AV17TFLb_ArtCod_Sel = "" ;
      AV18TFLb_ArtDsc = "" ;
      AV19TFLb_ArtDsc_Sel = "" ;
      AV24TFLb_ColNom = "" ;
      AV25TFLb_ColNom_Sel = "" ;
      AV32TFLb_ColNomC = "" ;
      AV33TFLb_ColNomC_Sel = "" ;
      AV36TFLb_Cartaz = "" ;
      AV37TFLb_Cartaz_Sel = "" ;
      AV40TFLb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      AV77TFLb_EstEns_SelsJson = "" ;
      AV78TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV50TFLb_Rb = DecimalUtil.ZERO ;
      AV51TFLb_Rb_To = DecimalUtil.ZERO ;
      AV82TFLb_Pantone = "" ;
      AV83TFLb_Pantone_Sel = "" ;
      AV84TFLb_PedCod = "" ;
      AV85TFLb_PedCod_Sel = "" ;
      A279CliNom = "" ;
      AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = "" ;
      AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = "" ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = "" ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = "" ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = "" ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = "" ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = GXutil.resetTime( GXutil.nullDate() );
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = DecimalUtil.ZERO ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = DecimalUtil.ZERO ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = "" ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = "" ;
      scmdbuf = "" ;
      lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      AV80Lb_FechaEfrom = GXutil.nullDate() ;
      AV81Lb_FechaEto = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A6546Lb_Pantone = "" ;
      A6618Lb_PedCod = "" ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5541Lb_FechaE = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV79EmprCod = "" ;
      P09OD2_A396EmprCod = new String[] {""} ;
      P09OD2_A279CliNom = new String[] {""} ;
      P09OD2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD2_A6618Lb_PedCod = new String[] {""} ;
      P09OD2_A6546Lb_Pantone = new String[] {""} ;
      P09OD2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD2_A5569Lb_EstEns = new byte[1] ;
      P09OD2_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD2_A5540Lb_Cartaz = new String[] {""} ;
      P09OD2_A5539Lb_ColNumC = new int[1] ;
      P09OD2_A5538Lb_ColNomC = new String[] {""} ;
      P09OD2_A831TipColCod = new byte[1] ;
      P09OD2_n831TipColCod = new boolean[] {false} ;
      P09OD2_A5537Lb_ColNum = new int[1] ;
      P09OD2_A5536Lb_ColNom = new String[] {""} ;
      P09OD2_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD2_A5533Lb_ArtCod = new String[] {""} ;
      P09OD2_A252CliCod = new int[1] ;
      P09OD2_A5532Lb_numero = new int[1] ;
      AV60Option = "" ;
      P09OD3_A396EmprCod = new String[] {""} ;
      P09OD3_A5533Lb_ArtCod = new String[] {""} ;
      P09OD3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD3_A6618Lb_PedCod = new String[] {""} ;
      P09OD3_A6546Lb_Pantone = new String[] {""} ;
      P09OD3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD3_A5569Lb_EstEns = new byte[1] ;
      P09OD3_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD3_A5540Lb_Cartaz = new String[] {""} ;
      P09OD3_A5539Lb_ColNumC = new int[1] ;
      P09OD3_A5538Lb_ColNomC = new String[] {""} ;
      P09OD3_A831TipColCod = new byte[1] ;
      P09OD3_n831TipColCod = new boolean[] {false} ;
      P09OD3_A5537Lb_ColNum = new int[1] ;
      P09OD3_A5536Lb_ColNom = new String[] {""} ;
      P09OD3_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD3_A279CliNom = new String[] {""} ;
      P09OD3_A252CliCod = new int[1] ;
      P09OD3_A5532Lb_numero = new int[1] ;
      P09OD4_A396EmprCod = new String[] {""} ;
      P09OD4_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD4_A6618Lb_PedCod = new String[] {""} ;
      P09OD4_A6546Lb_Pantone = new String[] {""} ;
      P09OD4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD4_A5569Lb_EstEns = new byte[1] ;
      P09OD4_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD4_A5540Lb_Cartaz = new String[] {""} ;
      P09OD4_A5539Lb_ColNumC = new int[1] ;
      P09OD4_A5538Lb_ColNomC = new String[] {""} ;
      P09OD4_A831TipColCod = new byte[1] ;
      P09OD4_n831TipColCod = new boolean[] {false} ;
      P09OD4_A5537Lb_ColNum = new int[1] ;
      P09OD4_A5536Lb_ColNom = new String[] {""} ;
      P09OD4_A5533Lb_ArtCod = new String[] {""} ;
      P09OD4_A279CliNom = new String[] {""} ;
      P09OD4_A252CliCod = new int[1] ;
      P09OD4_A5532Lb_numero = new int[1] ;
      P09OD5_A396EmprCod = new String[] {""} ;
      P09OD5_A5536Lb_ColNom = new String[] {""} ;
      P09OD5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD5_A6618Lb_PedCod = new String[] {""} ;
      P09OD5_A6546Lb_Pantone = new String[] {""} ;
      P09OD5_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD5_A5569Lb_EstEns = new byte[1] ;
      P09OD5_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD5_A5540Lb_Cartaz = new String[] {""} ;
      P09OD5_A5539Lb_ColNumC = new int[1] ;
      P09OD5_A5538Lb_ColNomC = new String[] {""} ;
      P09OD5_A831TipColCod = new byte[1] ;
      P09OD5_n831TipColCod = new boolean[] {false} ;
      P09OD5_A5537Lb_ColNum = new int[1] ;
      P09OD5_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD5_A5533Lb_ArtCod = new String[] {""} ;
      P09OD5_A279CliNom = new String[] {""} ;
      P09OD5_A252CliCod = new int[1] ;
      P09OD5_A5532Lb_numero = new int[1] ;
      P09OD6_A396EmprCod = new String[] {""} ;
      P09OD6_A5538Lb_ColNomC = new String[] {""} ;
      P09OD6_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD6_A6618Lb_PedCod = new String[] {""} ;
      P09OD6_A6546Lb_Pantone = new String[] {""} ;
      P09OD6_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD6_A5569Lb_EstEns = new byte[1] ;
      P09OD6_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD6_A5540Lb_Cartaz = new String[] {""} ;
      P09OD6_A5539Lb_ColNumC = new int[1] ;
      P09OD6_A831TipColCod = new byte[1] ;
      P09OD6_n831TipColCod = new boolean[] {false} ;
      P09OD6_A5537Lb_ColNum = new int[1] ;
      P09OD6_A5536Lb_ColNom = new String[] {""} ;
      P09OD6_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD6_A5533Lb_ArtCod = new String[] {""} ;
      P09OD6_A279CliNom = new String[] {""} ;
      P09OD6_A252CliCod = new int[1] ;
      P09OD6_A5532Lb_numero = new int[1] ;
      P09OD7_A396EmprCod = new String[] {""} ;
      P09OD7_A5540Lb_Cartaz = new String[] {""} ;
      P09OD7_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD7_A6618Lb_PedCod = new String[] {""} ;
      P09OD7_A6546Lb_Pantone = new String[] {""} ;
      P09OD7_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD7_A5569Lb_EstEns = new byte[1] ;
      P09OD7_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD7_A5539Lb_ColNumC = new int[1] ;
      P09OD7_A5538Lb_ColNomC = new String[] {""} ;
      P09OD7_A831TipColCod = new byte[1] ;
      P09OD7_n831TipColCod = new boolean[] {false} ;
      P09OD7_A5537Lb_ColNum = new int[1] ;
      P09OD7_A5536Lb_ColNom = new String[] {""} ;
      P09OD7_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD7_A5533Lb_ArtCod = new String[] {""} ;
      P09OD7_A279CliNom = new String[] {""} ;
      P09OD7_A252CliCod = new int[1] ;
      P09OD7_A5532Lb_numero = new int[1] ;
      P09OD8_A396EmprCod = new String[] {""} ;
      P09OD8_A6546Lb_Pantone = new String[] {""} ;
      P09OD8_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD8_A6618Lb_PedCod = new String[] {""} ;
      P09OD8_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD8_A5569Lb_EstEns = new byte[1] ;
      P09OD8_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD8_A5540Lb_Cartaz = new String[] {""} ;
      P09OD8_A5539Lb_ColNumC = new int[1] ;
      P09OD8_A5538Lb_ColNomC = new String[] {""} ;
      P09OD8_A831TipColCod = new byte[1] ;
      P09OD8_n831TipColCod = new boolean[] {false} ;
      P09OD8_A5537Lb_ColNum = new int[1] ;
      P09OD8_A5536Lb_ColNom = new String[] {""} ;
      P09OD8_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD8_A5533Lb_ArtCod = new String[] {""} ;
      P09OD8_A279CliNom = new String[] {""} ;
      P09OD8_A252CliCod = new int[1] ;
      P09OD8_A5532Lb_numero = new int[1] ;
      P09OD9_A396EmprCod = new String[] {""} ;
      P09OD9_A6618Lb_PedCod = new String[] {""} ;
      P09OD9_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD9_A6546Lb_Pantone = new String[] {""} ;
      P09OD9_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OD9_A5569Lb_EstEns = new byte[1] ;
      P09OD9_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OD9_A5540Lb_Cartaz = new String[] {""} ;
      P09OD9_A5539Lb_ColNumC = new int[1] ;
      P09OD9_A5538Lb_ColNomC = new String[] {""} ;
      P09OD9_A831TipColCod = new byte[1] ;
      P09OD9_n831TipColCod = new boolean[] {false} ;
      P09OD9_A5537Lb_ColNum = new int[1] ;
      P09OD9_A5536Lb_ColNom = new String[] {""} ;
      P09OD9_A5534Lb_ArtDsc = new String[] {""} ;
      P09OD9_A5533Lb_ArtCod = new String[] {""} ;
      P09OD9_A279CliNom = new String[] {""} ;
      P09OD9_A252CliCod = new int[1] ;
      P09OD9_A5532Lb_numero = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OD2_A396EmprCod, P09OD2_A279CliNom, P09OD2_A5541Lb_FechaE, P09OD2_A6618Lb_PedCod, P09OD2_A6546Lb_Pantone, P09OD2_A5547Lb_Rb, P09OD2_A5569Lb_EstEns, P09OD2_A5542Lb_HoraE, P09OD2_A5540Lb_Cartaz, P09OD2_A5539Lb_ColNumC,
            P09OD2_A5538Lb_ColNomC, P09OD2_A831TipColCod, P09OD2_n831TipColCod, P09OD2_A5537Lb_ColNum, P09OD2_A5536Lb_ColNom, P09OD2_A5534Lb_ArtDsc, P09OD2_A5533Lb_ArtCod, P09OD2_A252CliCod, P09OD2_A5532Lb_numero
            }
            , new Object[] {
            P09OD3_A396EmprCod, P09OD3_A5533Lb_ArtCod, P09OD3_A5541Lb_FechaE, P09OD3_A6618Lb_PedCod, P09OD3_A6546Lb_Pantone, P09OD3_A5547Lb_Rb, P09OD3_A5569Lb_EstEns, P09OD3_A5542Lb_HoraE, P09OD3_A5540Lb_Cartaz, P09OD3_A5539Lb_ColNumC,
            P09OD3_A5538Lb_ColNomC, P09OD3_A831TipColCod, P09OD3_n831TipColCod, P09OD3_A5537Lb_ColNum, P09OD3_A5536Lb_ColNom, P09OD3_A5534Lb_ArtDsc, P09OD3_A279CliNom, P09OD3_A252CliCod, P09OD3_A5532Lb_numero
            }
            , new Object[] {
            P09OD4_A396EmprCod, P09OD4_A5534Lb_ArtDsc, P09OD4_A5541Lb_FechaE, P09OD4_A6618Lb_PedCod, P09OD4_A6546Lb_Pantone, P09OD4_A5547Lb_Rb, P09OD4_A5569Lb_EstEns, P09OD4_A5542Lb_HoraE, P09OD4_A5540Lb_Cartaz, P09OD4_A5539Lb_ColNumC,
            P09OD4_A5538Lb_ColNomC, P09OD4_A831TipColCod, P09OD4_n831TipColCod, P09OD4_A5537Lb_ColNum, P09OD4_A5536Lb_ColNom, P09OD4_A5533Lb_ArtCod, P09OD4_A279CliNom, P09OD4_A252CliCod, P09OD4_A5532Lb_numero
            }
            , new Object[] {
            P09OD5_A396EmprCod, P09OD5_A5536Lb_ColNom, P09OD5_A5541Lb_FechaE, P09OD5_A6618Lb_PedCod, P09OD5_A6546Lb_Pantone, P09OD5_A5547Lb_Rb, P09OD5_A5569Lb_EstEns, P09OD5_A5542Lb_HoraE, P09OD5_A5540Lb_Cartaz, P09OD5_A5539Lb_ColNumC,
            P09OD5_A5538Lb_ColNomC, P09OD5_A831TipColCod, P09OD5_n831TipColCod, P09OD5_A5537Lb_ColNum, P09OD5_A5534Lb_ArtDsc, P09OD5_A5533Lb_ArtCod, P09OD5_A279CliNom, P09OD5_A252CliCod, P09OD5_A5532Lb_numero
            }
            , new Object[] {
            P09OD6_A396EmprCod, P09OD6_A5538Lb_ColNomC, P09OD6_A5541Lb_FechaE, P09OD6_A6618Lb_PedCod, P09OD6_A6546Lb_Pantone, P09OD6_A5547Lb_Rb, P09OD6_A5569Lb_EstEns, P09OD6_A5542Lb_HoraE, P09OD6_A5540Lb_Cartaz, P09OD6_A5539Lb_ColNumC,
            P09OD6_A831TipColCod, P09OD6_n831TipColCod, P09OD6_A5537Lb_ColNum, P09OD6_A5536Lb_ColNom, P09OD6_A5534Lb_ArtDsc, P09OD6_A5533Lb_ArtCod, P09OD6_A279CliNom, P09OD6_A252CliCod, P09OD6_A5532Lb_numero
            }
            , new Object[] {
            P09OD7_A396EmprCod, P09OD7_A5540Lb_Cartaz, P09OD7_A5541Lb_FechaE, P09OD7_A6618Lb_PedCod, P09OD7_A6546Lb_Pantone, P09OD7_A5547Lb_Rb, P09OD7_A5569Lb_EstEns, P09OD7_A5542Lb_HoraE, P09OD7_A5539Lb_ColNumC, P09OD7_A5538Lb_ColNomC,
            P09OD7_A831TipColCod, P09OD7_n831TipColCod, P09OD7_A5537Lb_ColNum, P09OD7_A5536Lb_ColNom, P09OD7_A5534Lb_ArtDsc, P09OD7_A5533Lb_ArtCod, P09OD7_A279CliNom, P09OD7_A252CliCod, P09OD7_A5532Lb_numero
            }
            , new Object[] {
            P09OD8_A396EmprCod, P09OD8_A6546Lb_Pantone, P09OD8_A5541Lb_FechaE, P09OD8_A6618Lb_PedCod, P09OD8_A5547Lb_Rb, P09OD8_A5569Lb_EstEns, P09OD8_A5542Lb_HoraE, P09OD8_A5540Lb_Cartaz, P09OD8_A5539Lb_ColNumC, P09OD8_A5538Lb_ColNomC,
            P09OD8_A831TipColCod, P09OD8_n831TipColCod, P09OD8_A5537Lb_ColNum, P09OD8_A5536Lb_ColNom, P09OD8_A5534Lb_ArtDsc, P09OD8_A5533Lb_ArtCod, P09OD8_A279CliNom, P09OD8_A252CliCod, P09OD8_A5532Lb_numero
            }
            , new Object[] {
            P09OD9_A396EmprCod, P09OD9_A6618Lb_PedCod, P09OD9_A5541Lb_FechaE, P09OD9_A6546Lb_Pantone, P09OD9_A5547Lb_Rb, P09OD9_A5569Lb_EstEns, P09OD9_A5542Lb_HoraE, P09OD9_A5540Lb_Cartaz, P09OD9_A5539Lb_ColNumC, P09OD9_A5538Lb_ColNomC,
            P09OD9_A831TipColCod, P09OD9_n831TipColCod, P09OD9_A5537Lb_ColNum, P09OD9_A5536Lb_ColNom, P09OD9_A5534Lb_ArtDsc, P09OD9_A5533Lb_ArtCod, P09OD9_A279CliNom, P09OD9_A252CliCod, P09OD9_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28TFTipColCod ;
   private byte AV29TFTipColCod_To ;
   private byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ;
   private byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ;
   private byte A5569Lb_EstEns ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV89GXV1 ;
   private int AV10TFLb_numero ;
   private int AV11TFLb_numero_To ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV26TFLb_ColNum ;
   private int AV27TFLb_ColNum_To ;
   private int AV34TFLb_ColNumC ;
   private int AV35TFLb_ColNumC_To ;
   private int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ;
   private int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ;
   private int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ;
   private int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ;
   private int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ;
   private int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ;
   private int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ;
   private int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ;
   private int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ;
   private int AV86lb_numero ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private long AV68count ;
   private java.math.BigDecimal AV50TFLb_Rb ;
   private java.math.BigDecimal AV51TFLb_Rb_To ;
   private java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ;
   private java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV16TFLb_ArtCod ;
   private String AV17TFLb_ArtCod_Sel ;
   private String AV18TFLb_ArtDsc ;
   private String AV19TFLb_ArtDsc_Sel ;
   private String AV24TFLb_ColNom ;
   private String AV25TFLb_ColNom_Sel ;
   private String AV32TFLb_ColNomC ;
   private String AV33TFLb_ColNomC_Sel ;
   private String AV36TFLb_Cartaz ;
   private String AV37TFLb_Cartaz_Sel ;
   private String AV82TFLb_Pantone ;
   private String AV83TFLb_Pantone_Sel ;
   private String AV84TFLb_PedCod ;
   private String AV85TFLb_PedCod_Sel ;
   private String A279CliNom ;
   private String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ;
   private String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ;
   private String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ;
   private String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ;
   private String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ;
   private String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ;
   private String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ;
   private String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ;
   private String scmdbuf ;
   private String lV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String lV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String lV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String lV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String lV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String lV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String lV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String lV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A6546Lb_Pantone ;
   private String A6618Lb_PedCod ;
   private String A396EmprCod ;
   private String AV79EmprCod ;
   private java.util.Date AV40TFLb_HoraE ;
   private java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV80Lb_FechaEfrom ;
   private java.util.Date AV81Lb_FechaEto ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean returnInSub ;
   private boolean brk9OD2 ;
   private boolean n831TipColCod ;
   private boolean brk9OD4 ;
   private boolean brk9OD6 ;
   private boolean brk9OD8 ;
   private boolean brk9OD10 ;
   private boolean brk9OD12 ;
   private boolean brk9OD14 ;
   private boolean brk9OD16 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV77TFLb_EstEns_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV74FilterFullText ;
   private String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String lV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String AV60Option ;
   private GXSimpleCollection<Byte> AV78TFLb_EstEns_Sels ;
   private GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OD2_A396EmprCod ;
   private String[] P09OD2_A279CliNom ;
   private java.util.Date[] P09OD2_A5541Lb_FechaE ;
   private String[] P09OD2_A6618Lb_PedCod ;
   private String[] P09OD2_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD2_A5547Lb_Rb ;
   private byte[] P09OD2_A5569Lb_EstEns ;
   private java.util.Date[] P09OD2_A5542Lb_HoraE ;
   private String[] P09OD2_A5540Lb_Cartaz ;
   private int[] P09OD2_A5539Lb_ColNumC ;
   private String[] P09OD2_A5538Lb_ColNomC ;
   private byte[] P09OD2_A831TipColCod ;
   private boolean[] P09OD2_n831TipColCod ;
   private int[] P09OD2_A5537Lb_ColNum ;
   private String[] P09OD2_A5536Lb_ColNom ;
   private String[] P09OD2_A5534Lb_ArtDsc ;
   private String[] P09OD2_A5533Lb_ArtCod ;
   private int[] P09OD2_A252CliCod ;
   private int[] P09OD2_A5532Lb_numero ;
   private String[] P09OD3_A396EmprCod ;
   private String[] P09OD3_A5533Lb_ArtCod ;
   private java.util.Date[] P09OD3_A5541Lb_FechaE ;
   private String[] P09OD3_A6618Lb_PedCod ;
   private String[] P09OD3_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD3_A5547Lb_Rb ;
   private byte[] P09OD3_A5569Lb_EstEns ;
   private java.util.Date[] P09OD3_A5542Lb_HoraE ;
   private String[] P09OD3_A5540Lb_Cartaz ;
   private int[] P09OD3_A5539Lb_ColNumC ;
   private String[] P09OD3_A5538Lb_ColNomC ;
   private byte[] P09OD3_A831TipColCod ;
   private boolean[] P09OD3_n831TipColCod ;
   private int[] P09OD3_A5537Lb_ColNum ;
   private String[] P09OD3_A5536Lb_ColNom ;
   private String[] P09OD3_A5534Lb_ArtDsc ;
   private String[] P09OD3_A279CliNom ;
   private int[] P09OD3_A252CliCod ;
   private int[] P09OD3_A5532Lb_numero ;
   private String[] P09OD4_A396EmprCod ;
   private String[] P09OD4_A5534Lb_ArtDsc ;
   private java.util.Date[] P09OD4_A5541Lb_FechaE ;
   private String[] P09OD4_A6618Lb_PedCod ;
   private String[] P09OD4_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD4_A5547Lb_Rb ;
   private byte[] P09OD4_A5569Lb_EstEns ;
   private java.util.Date[] P09OD4_A5542Lb_HoraE ;
   private String[] P09OD4_A5540Lb_Cartaz ;
   private int[] P09OD4_A5539Lb_ColNumC ;
   private String[] P09OD4_A5538Lb_ColNomC ;
   private byte[] P09OD4_A831TipColCod ;
   private boolean[] P09OD4_n831TipColCod ;
   private int[] P09OD4_A5537Lb_ColNum ;
   private String[] P09OD4_A5536Lb_ColNom ;
   private String[] P09OD4_A5533Lb_ArtCod ;
   private String[] P09OD4_A279CliNom ;
   private int[] P09OD4_A252CliCod ;
   private int[] P09OD4_A5532Lb_numero ;
   private String[] P09OD5_A396EmprCod ;
   private String[] P09OD5_A5536Lb_ColNom ;
   private java.util.Date[] P09OD5_A5541Lb_FechaE ;
   private String[] P09OD5_A6618Lb_PedCod ;
   private String[] P09OD5_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD5_A5547Lb_Rb ;
   private byte[] P09OD5_A5569Lb_EstEns ;
   private java.util.Date[] P09OD5_A5542Lb_HoraE ;
   private String[] P09OD5_A5540Lb_Cartaz ;
   private int[] P09OD5_A5539Lb_ColNumC ;
   private String[] P09OD5_A5538Lb_ColNomC ;
   private byte[] P09OD5_A831TipColCod ;
   private boolean[] P09OD5_n831TipColCod ;
   private int[] P09OD5_A5537Lb_ColNum ;
   private String[] P09OD5_A5534Lb_ArtDsc ;
   private String[] P09OD5_A5533Lb_ArtCod ;
   private String[] P09OD5_A279CliNom ;
   private int[] P09OD5_A252CliCod ;
   private int[] P09OD5_A5532Lb_numero ;
   private String[] P09OD6_A396EmprCod ;
   private String[] P09OD6_A5538Lb_ColNomC ;
   private java.util.Date[] P09OD6_A5541Lb_FechaE ;
   private String[] P09OD6_A6618Lb_PedCod ;
   private String[] P09OD6_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD6_A5547Lb_Rb ;
   private byte[] P09OD6_A5569Lb_EstEns ;
   private java.util.Date[] P09OD6_A5542Lb_HoraE ;
   private String[] P09OD6_A5540Lb_Cartaz ;
   private int[] P09OD6_A5539Lb_ColNumC ;
   private byte[] P09OD6_A831TipColCod ;
   private boolean[] P09OD6_n831TipColCod ;
   private int[] P09OD6_A5537Lb_ColNum ;
   private String[] P09OD6_A5536Lb_ColNom ;
   private String[] P09OD6_A5534Lb_ArtDsc ;
   private String[] P09OD6_A5533Lb_ArtCod ;
   private String[] P09OD6_A279CliNom ;
   private int[] P09OD6_A252CliCod ;
   private int[] P09OD6_A5532Lb_numero ;
   private String[] P09OD7_A396EmprCod ;
   private String[] P09OD7_A5540Lb_Cartaz ;
   private java.util.Date[] P09OD7_A5541Lb_FechaE ;
   private String[] P09OD7_A6618Lb_PedCod ;
   private String[] P09OD7_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD7_A5547Lb_Rb ;
   private byte[] P09OD7_A5569Lb_EstEns ;
   private java.util.Date[] P09OD7_A5542Lb_HoraE ;
   private int[] P09OD7_A5539Lb_ColNumC ;
   private String[] P09OD7_A5538Lb_ColNomC ;
   private byte[] P09OD7_A831TipColCod ;
   private boolean[] P09OD7_n831TipColCod ;
   private int[] P09OD7_A5537Lb_ColNum ;
   private String[] P09OD7_A5536Lb_ColNom ;
   private String[] P09OD7_A5534Lb_ArtDsc ;
   private String[] P09OD7_A5533Lb_ArtCod ;
   private String[] P09OD7_A279CliNom ;
   private int[] P09OD7_A252CliCod ;
   private int[] P09OD7_A5532Lb_numero ;
   private String[] P09OD8_A396EmprCod ;
   private String[] P09OD8_A6546Lb_Pantone ;
   private java.util.Date[] P09OD8_A5541Lb_FechaE ;
   private String[] P09OD8_A6618Lb_PedCod ;
   private java.math.BigDecimal[] P09OD8_A5547Lb_Rb ;
   private byte[] P09OD8_A5569Lb_EstEns ;
   private java.util.Date[] P09OD8_A5542Lb_HoraE ;
   private String[] P09OD8_A5540Lb_Cartaz ;
   private int[] P09OD8_A5539Lb_ColNumC ;
   private String[] P09OD8_A5538Lb_ColNomC ;
   private byte[] P09OD8_A831TipColCod ;
   private boolean[] P09OD8_n831TipColCod ;
   private int[] P09OD8_A5537Lb_ColNum ;
   private String[] P09OD8_A5536Lb_ColNom ;
   private String[] P09OD8_A5534Lb_ArtDsc ;
   private String[] P09OD8_A5533Lb_ArtCod ;
   private String[] P09OD8_A279CliNom ;
   private int[] P09OD8_A252CliCod ;
   private int[] P09OD8_A5532Lb_numero ;
   private String[] P09OD9_A396EmprCod ;
   private String[] P09OD9_A6618Lb_PedCod ;
   private java.util.Date[] P09OD9_A5541Lb_FechaE ;
   private String[] P09OD9_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OD9_A5547Lb_Rb ;
   private byte[] P09OD9_A5569Lb_EstEns ;
   private java.util.Date[] P09OD9_A5542Lb_HoraE ;
   private String[] P09OD9_A5540Lb_Cartaz ;
   private int[] P09OD9_A5539Lb_ColNumC ;
   private String[] P09OD9_A5538Lb_ColNomC ;
   private byte[] P09OD9_A831TipColCod ;
   private boolean[] P09OD9_n831TipColCod ;
   private int[] P09OD9_A5537Lb_ColNum ;
   private String[] P09OD9_A5536Lb_ColNom ;
   private String[] P09OD9_A5534Lb_ArtDsc ;
   private String[] P09OD9_A5533Lb_ArtCod ;
   private String[] P09OD9_A279CliNom ;
   private int[] P09OD9_A252CliCod ;
   private int[] P09OD9_A5532Lb_numero ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class entradaensayolaboratoriowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[48];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod," ;
      scmdbuf += " T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[48];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod," ;
      scmdbuf += " T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
         GXv_int5[14] = (byte)(1) ;
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09OD4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[48];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ArtDsc, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod," ;
      scmdbuf += " T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09OD5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[48];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ColNom, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod," ;
      scmdbuf += " T1.Lb_ColNum, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
         GXv_int11[14] = (byte)(1) ;
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09OD6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[48];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_ColNomC, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.TipColCod, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09OD7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[48];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_Cartaz, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
         GXv_int17[13] = (byte)(1) ;
         GXv_int17[14] = (byte)(1) ;
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09OD8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[48];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_Pantone, T1.Lb_FechaE, T1.Lb_PedCod, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_Pantone" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09OD9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV80Lb_FechaEfrom ,
                                          java.util.Date AV81Lb_FechaEto ,
                                          int AV86lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          String A396EmprCod ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[48];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_PedCod, T1.Lb_FechaE, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
         GXv_int23[2] = (byte)(1) ;
         GXv_int23[3] = (byte)(1) ;
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV92Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV93Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (0==AV110Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV114Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( ! (0==AV86lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_PedCod" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_P09OD2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 1 :
                  return conditional_P09OD3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 2 :
                  return conditional_P09OD4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 3 :
                  return conditional_P09OD5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 4 :
                  return conditional_P09OD6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 5 :
                  return conditional_P09OD7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 6 :
                  return conditional_P09OD8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
            case 7 :
                  return conditional_P09OD9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OD9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
      }
   }

}

