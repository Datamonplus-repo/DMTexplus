package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnotrecwwgetfilterdata extends GXProcedure
{
   public tnotrecwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnotrecwwgetfilterdata.class ), "" );
   }

   public tnotrecwwgetfilterdata( int remoteHandle ,
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
      tnotrecwwgetfilterdata.this.aP5 = new String[] {""};
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
      tnotrecwwgetfilterdata.this.AV56DDOName = aP0;
      tnotrecwwgetfilterdata.this.AV54SearchTxt = aP1;
      tnotrecwwgetfilterdata.this.AV55SearchTxtTo = aP2;
      tnotrecwwgetfilterdata.this.aP3 = aP3;
      tnotrecwwgetfilterdata.this.aP4 = aP4;
      tnotrecwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_CLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_ALBENT") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_ALBENTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_REFCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_REFCLIOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_ARTCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_ARTDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_COLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_COLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_UNIDAD") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_UNIDADOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_BARPARA") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_BARPARAOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_LOCAL") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_LOCALOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_NR_USER") == 0 )
      {
         /* Execute user subroutine: 'LOADNR_USEROPTIONS' */
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
      if ( GXutil.strcmp(AV67Session.getValue("TNOTRECWWGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TNOTRECWWGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("TNOTRECWWGridState"), null, null);
      }
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV86FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CODIGO") == 0 )
         {
            AV10TFNr_codigo = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFNr_codigo_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBRECCOD") == 0 )
         {
            AV12TFNr_albreccod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFNr_albreccod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLICOD") == 0 )
         {
            AV14TFNr_CliCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFNr_CliCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM") == 0 )
         {
            AV16TFNr_CliNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM_SEL") == 0 )
         {
            AV17TFNr_CliNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT") == 0 )
         {
            AV18TFNr_albent = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT_SEL") == 0 )
         {
            AV19TFNr_albent_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI") == 0 )
         {
            AV20TFNr_refcli = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI_SEL") == 0 )
         {
            AV21TFNr_refcli_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD") == 0 )
         {
            AV22TFNr_artcod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD_SEL") == 0 )
         {
            AV23TFNr_artcod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC") == 0 )
         {
            AV24TFNr_artdsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC_SEL") == 0 )
         {
            AV25TFNr_artdsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM") == 0 )
         {
            AV26TFNr_colnom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM_SEL") == 0 )
         {
            AV27TFNr_colnom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNUM") == 0 )
         {
            AV28TFNr_colnum = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFNr_colnum_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_PIEZAS") == 0 )
         {
            AV30TFNr_piezas = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFNr_piezas_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDADES") == 0 )
         {
            AV32TFNr_unidades = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFNr_unidades_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD") == 0 )
         {
            AV34TFNr_unidad = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD_SEL") == 0 )
         {
            AV35TFNr_unidad_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCODA") == 0 )
         {
            AV36TFNr_barcoda = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFNr_barcoda_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARREOA") == 0 )
         {
            AV38TFNr_barreoa = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFNr_barreoa_To = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA") == 0 )
         {
            AV40TFNr_barpara = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA_SEL") == 0 )
         {
            AV41TFNr_barpara_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_NALB") == 0 )
         {
            AV42TFNr_NAlb = GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV43TFNr_NAlb_To = GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL") == 0 )
         {
            AV44TFNr_local = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL_SEL") == 0 )
         {
            AV45TFNr_local_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER") == 0 )
         {
            AV46TFNr_user = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER_SEL") == 0 )
         {
            AV47TFNr_user_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECREG") == 0 )
         {
            AV48TFNr_fecreg = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECENT") == 0 )
         {
            AV50TFNr_fecent = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCOD") == 0 )
         {
            AV52TFNr_barcod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFNr_barcod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADNR_CLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFNr_CliNom = AV54SearchTxt ;
      AV17TFNr_CliNom_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08472 */
      pr_default.execute(0, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8472 = false ;
         A5341Nr_CliNom = P08472_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08472_n5341Nr_CliNom[0] ;
         A5210Nr_barcod = P08472_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08472_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08472_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08472_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08472_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08472_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08472_A5215Nr_user[0] ;
         n5215Nr_user = P08472_n5215Nr_user[0] ;
         A5214Nr_local = P08472_A5214Nr_local[0] ;
         n5214Nr_local = P08472_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08472_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08472_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08472_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08472_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08472_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08472_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08472_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08472_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08472_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08472_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08472_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08472_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08472_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08472_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08472_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08472_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08472_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08472_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08472_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08472_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08472_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08472_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08472_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08472_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08472_A5199Nr_albent[0] ;
         n5199Nr_albent = P08472_n5199Nr_albent[0] ;
         A5340Nr_CliCod = P08472_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08472_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08472_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08472_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08472_A5198Nr_codigo[0] ;
         A396EmprCod = P08472_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08472_A5341Nr_CliNom[0], A5341Nr_CliNom) == 0 ) )
         {
            brk8472 = false ;
            A5198Nr_codigo = P08472_A5198Nr_codigo[0] ;
            A396EmprCod = P08472_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk8472 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5341Nr_CliNom)==0) )
         {
            AV58Option = A5341Nr_CliNom ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8472 )
         {
            brk8472 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADNR_ALBENTOPTIONS' Routine */
      returnInSub = false ;
      AV18TFNr_albent = AV54SearchTxt ;
      AV19TFNr_albent_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08473 */
      pr_default.execute(1, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8474 = false ;
         A5199Nr_albent = P08473_A5199Nr_albent[0] ;
         n5199Nr_albent = P08473_n5199Nr_albent[0] ;
         A5210Nr_barcod = P08473_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08473_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08473_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08473_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08473_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08473_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08473_A5215Nr_user[0] ;
         n5215Nr_user = P08473_n5215Nr_user[0] ;
         A5214Nr_local = P08473_A5214Nr_local[0] ;
         n5214Nr_local = P08473_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08473_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08473_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08473_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08473_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08473_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08473_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08473_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08473_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08473_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08473_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08473_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08473_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08473_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08473_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08473_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08473_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08473_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08473_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08473_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08473_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08473_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08473_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08473_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08473_n5200Nr_refcli[0] ;
         A5341Nr_CliNom = P08473_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08473_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08473_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08473_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08473_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08473_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08473_A5198Nr_codigo[0] ;
         A396EmprCod = P08473_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08473_A5199Nr_albent[0], A5199Nr_albent) == 0 ) )
         {
            brk8474 = false ;
            A5198Nr_codigo = P08473_A5198Nr_codigo[0] ;
            A396EmprCod = P08473_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk8474 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5199Nr_albent)==0) )
         {
            AV58Option = A5199Nr_albent ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8474 )
         {
            brk8474 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADNR_REFCLIOPTIONS' Routine */
      returnInSub = false ;
      AV20TFNr_refcli = AV54SearchTxt ;
      AV21TFNr_refcli_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08474 */
      pr_default.execute(2, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8476 = false ;
         A5200Nr_refcli = P08474_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08474_n5200Nr_refcli[0] ;
         A5210Nr_barcod = P08474_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08474_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08474_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08474_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08474_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08474_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08474_A5215Nr_user[0] ;
         n5215Nr_user = P08474_n5215Nr_user[0] ;
         A5214Nr_local = P08474_A5214Nr_local[0] ;
         n5214Nr_local = P08474_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08474_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08474_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08474_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08474_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08474_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08474_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08474_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08474_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08474_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08474_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08474_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08474_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08474_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08474_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08474_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08474_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08474_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08474_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08474_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08474_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08474_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08474_n5201Nr_artcod[0] ;
         A5199Nr_albent = P08474_A5199Nr_albent[0] ;
         n5199Nr_albent = P08474_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08474_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08474_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08474_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08474_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08474_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08474_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08474_A5198Nr_codigo[0] ;
         A396EmprCod = P08474_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08474_A5200Nr_refcli[0], A5200Nr_refcli) == 0 ) )
         {
            brk8476 = false ;
            A5198Nr_codigo = P08474_A5198Nr_codigo[0] ;
            A396EmprCod = P08474_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk8476 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5200Nr_refcli)==0) )
         {
            AV58Option = A5200Nr_refcli ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8476 )
         {
            brk8476 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADNR_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFNr_artcod = AV54SearchTxt ;
      AV23TFNr_artcod_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08475 */
      pr_default.execute(3, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8478 = false ;
         A5201Nr_artcod = P08475_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08475_n5201Nr_artcod[0] ;
         A5210Nr_barcod = P08475_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08475_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08475_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08475_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08475_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08475_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08475_A5215Nr_user[0] ;
         n5215Nr_user = P08475_n5215Nr_user[0] ;
         A5214Nr_local = P08475_A5214Nr_local[0] ;
         n5214Nr_local = P08475_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08475_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08475_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08475_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08475_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08475_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08475_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08475_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08475_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08475_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08475_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08475_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08475_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08475_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08475_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08475_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08475_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08475_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08475_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08475_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08475_n5202Nr_artdsc[0] ;
         A5200Nr_refcli = P08475_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08475_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08475_A5199Nr_albent[0] ;
         n5199Nr_albent = P08475_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08475_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08475_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08475_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08475_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08475_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08475_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08475_A5198Nr_codigo[0] ;
         A396EmprCod = P08475_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08475_A5201Nr_artcod[0], A5201Nr_artcod) == 0 ) )
         {
            brk8478 = false ;
            A5198Nr_codigo = P08475_A5198Nr_codigo[0] ;
            A396EmprCod = P08475_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk8478 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5201Nr_artcod)==0) )
         {
            AV58Option = A5201Nr_artcod ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8478 )
         {
            brk8478 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADNR_ARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFNr_artdsc = AV54SearchTxt ;
      AV25TFNr_artdsc_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08476 */
      pr_default.execute(4, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk84710 = false ;
         A5202Nr_artdsc = P08476_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08476_n5202Nr_artdsc[0] ;
         A5210Nr_barcod = P08476_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08476_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08476_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08476_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08476_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08476_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08476_A5215Nr_user[0] ;
         n5215Nr_user = P08476_n5215Nr_user[0] ;
         A5214Nr_local = P08476_A5214Nr_local[0] ;
         n5214Nr_local = P08476_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08476_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08476_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08476_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08476_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08476_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08476_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08476_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08476_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08476_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08476_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08476_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08476_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08476_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08476_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08476_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08476_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08476_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08476_n5203Nr_colnom[0] ;
         A5201Nr_artcod = P08476_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08476_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08476_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08476_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08476_A5199Nr_albent[0] ;
         n5199Nr_albent = P08476_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08476_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08476_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08476_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08476_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08476_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08476_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08476_A5198Nr_codigo[0] ;
         A396EmprCod = P08476_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08476_A5202Nr_artdsc[0], A5202Nr_artdsc) == 0 ) )
         {
            brk84710 = false ;
            A5198Nr_codigo = P08476_A5198Nr_codigo[0] ;
            A396EmprCod = P08476_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk84710 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5202Nr_artdsc)==0) )
         {
            AV58Option = A5202Nr_artdsc ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84710 )
         {
            brk84710 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADNR_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFNr_colnom = AV54SearchTxt ;
      AV27TFNr_colnom_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08477 */
      pr_default.execute(5, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk84712 = false ;
         A5203Nr_colnom = P08477_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08477_n5203Nr_colnom[0] ;
         A5210Nr_barcod = P08477_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08477_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08477_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08477_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08477_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08477_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08477_A5215Nr_user[0] ;
         n5215Nr_user = P08477_n5215Nr_user[0] ;
         A5214Nr_local = P08477_A5214Nr_local[0] ;
         n5214Nr_local = P08477_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08477_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08477_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08477_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08477_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08477_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08477_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08477_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08477_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08477_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08477_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08477_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08477_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08477_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08477_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08477_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08477_n5204Nr_colnum[0] ;
         A5202Nr_artdsc = P08477_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08477_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08477_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08477_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08477_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08477_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08477_A5199Nr_albent[0] ;
         n5199Nr_albent = P08477_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08477_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08477_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08477_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08477_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08477_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08477_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08477_A5198Nr_codigo[0] ;
         A396EmprCod = P08477_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08477_A5203Nr_colnom[0], A5203Nr_colnom) == 0 ) )
         {
            brk84712 = false ;
            A5198Nr_codigo = P08477_A5198Nr_codigo[0] ;
            A396EmprCod = P08477_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk84712 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A5203Nr_colnom)==0) )
         {
            AV58Option = A5203Nr_colnom ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84712 )
         {
            brk84712 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADNR_UNIDADOPTIONS' Routine */
      returnInSub = false ;
      AV34TFNr_unidad = AV54SearchTxt ;
      AV35TFNr_unidad_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08478 */
      pr_default.execute(6, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk84714 = false ;
         A5209Nr_unidad = P08478_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08478_n5209Nr_unidad[0] ;
         A5210Nr_barcod = P08478_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08478_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08478_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08478_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08478_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08478_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08478_A5215Nr_user[0] ;
         n5215Nr_user = P08478_n5215Nr_user[0] ;
         A5214Nr_local = P08478_A5214Nr_local[0] ;
         n5214Nr_local = P08478_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08478_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08478_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08478_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08478_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08478_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08478_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08478_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08478_n5222Nr_barcoda[0] ;
         A5208Nr_unidade = P08478_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08478_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08478_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08478_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08478_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08478_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08478_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08478_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08478_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08478_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08478_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08478_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08478_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08478_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08478_A5199Nr_albent[0] ;
         n5199Nr_albent = P08478_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08478_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08478_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08478_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08478_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08478_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08478_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08478_A5198Nr_codigo[0] ;
         A396EmprCod = P08478_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08478_A5209Nr_unidad[0], A5209Nr_unidad) == 0 ) )
         {
            brk84714 = false ;
            A5198Nr_codigo = P08478_A5198Nr_codigo[0] ;
            A396EmprCod = P08478_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk84714 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A5209Nr_unidad)==0) )
         {
            AV58Option = A5209Nr_unidad ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84714 )
         {
            brk84714 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADNR_BARPARAOPTIONS' Routine */
      returnInSub = false ;
      AV40TFNr_barpara = AV54SearchTxt ;
      AV41TFNr_barpara_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08479 */
      pr_default.execute(7, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk84716 = false ;
         A5224Nr_barpara = P08479_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08479_n5224Nr_barpara[0] ;
         A5210Nr_barcod = P08479_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08479_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08479_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08479_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08479_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08479_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08479_A5215Nr_user[0] ;
         n5215Nr_user = P08479_n5215Nr_user[0] ;
         A5214Nr_local = P08479_A5214Nr_local[0] ;
         n5214Nr_local = P08479_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08479_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08479_n12235Nr_NAlb[0] ;
         A5223Nr_barreoa = P08479_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08479_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08479_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08479_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08479_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08479_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08479_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08479_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08479_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08479_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08479_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08479_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08479_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08479_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08479_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08479_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08479_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08479_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08479_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08479_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08479_A5199Nr_albent[0] ;
         n5199Nr_albent = P08479_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08479_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08479_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08479_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08479_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08479_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08479_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08479_A5198Nr_codigo[0] ;
         A396EmprCod = P08479_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08479_A5224Nr_barpara[0], A5224Nr_barpara) == 0 ) )
         {
            brk84716 = false ;
            A5198Nr_codigo = P08479_A5198Nr_codigo[0] ;
            A396EmprCod = P08479_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk84716 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A5224Nr_barpara)==0) )
         {
            AV58Option = A5224Nr_barpara ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84716 )
         {
            brk84716 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADNR_LOCALOPTIONS' Routine */
      returnInSub = false ;
      AV44TFNr_local = AV54SearchTxt ;
      AV45TFNr_local_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P084710 */
      pr_default.execute(8, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk84718 = false ;
         A5214Nr_local = P084710_A5214Nr_local[0] ;
         n5214Nr_local = P084710_n5214Nr_local[0] ;
         A5210Nr_barcod = P084710_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P084710_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P084710_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P084710_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P084710_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P084710_n5216Nr_fecreg[0] ;
         A5215Nr_user = P084710_A5215Nr_user[0] ;
         n5215Nr_user = P084710_n5215Nr_user[0] ;
         A12235Nr_NAlb = P084710_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P084710_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P084710_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P084710_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P084710_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P084710_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P084710_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P084710_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P084710_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P084710_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P084710_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P084710_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P084710_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P084710_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P084710_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P084710_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P084710_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P084710_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P084710_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P084710_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P084710_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P084710_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P084710_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P084710_n5200Nr_refcli[0] ;
         A5199Nr_albent = P084710_A5199Nr_albent[0] ;
         n5199Nr_albent = P084710_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P084710_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P084710_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P084710_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P084710_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P084710_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P084710_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P084710_A5198Nr_codigo[0] ;
         A396EmprCod = P084710_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P084710_A5214Nr_local[0], A5214Nr_local) == 0 ) )
         {
            brk84718 = false ;
            A5198Nr_codigo = P084710_A5198Nr_codigo[0] ;
            A396EmprCod = P084710_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk84718 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A5214Nr_local)==0) )
         {
            AV58Option = A5214Nr_local ;
            AV59Options.add(AV58Option, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84718 )
         {
            brk84718 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADNR_USEROPTIONS' Routine */
      returnInSub = false ;
      AV46TFNr_user = AV54SearchTxt ;
      AV47TFNr_user_Sel = "" ;
      AV91Tnotrecwwds_1_filterfulltext = AV86FilterFullText ;
      AV92Tnotrecwwds_2_tfnr_codigo = AV10TFNr_codigo ;
      AV93Tnotrecwwds_3_tfnr_codigo_to = AV11TFNr_codigo_To ;
      AV94Tnotrecwwds_4_tfnr_albreccod = AV12TFNr_albreccod ;
      AV95Tnotrecwwds_5_tfnr_albreccod_to = AV13TFNr_albreccod_To ;
      AV96Tnotrecwwds_6_tfnr_clicod = AV14TFNr_CliCod ;
      AV97Tnotrecwwds_7_tfnr_clicod_to = AV15TFNr_CliCod_To ;
      AV98Tnotrecwwds_8_tfnr_clinom = AV16TFNr_CliNom ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = AV17TFNr_CliNom_Sel ;
      AV100Tnotrecwwds_10_tfnr_albent = AV18TFNr_albent ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = AV19TFNr_albent_Sel ;
      AV102Tnotrecwwds_12_tfnr_refcli = AV20TFNr_refcli ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = AV21TFNr_refcli_Sel ;
      AV104Tnotrecwwds_14_tfnr_artcod = AV22TFNr_artcod ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = AV23TFNr_artcod_Sel ;
      AV106Tnotrecwwds_16_tfnr_artdsc = AV24TFNr_artdsc ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = AV25TFNr_artdsc_Sel ;
      AV108Tnotrecwwds_18_tfnr_colnom = AV26TFNr_colnom ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = AV27TFNr_colnom_Sel ;
      AV110Tnotrecwwds_20_tfnr_colnum = AV28TFNr_colnum ;
      AV111Tnotrecwwds_21_tfnr_colnum_to = AV29TFNr_colnum_To ;
      AV112Tnotrecwwds_22_tfnr_piezas = AV30TFNr_piezas ;
      AV113Tnotrecwwds_23_tfnr_piezas_to = AV31TFNr_piezas_To ;
      AV114Tnotrecwwds_24_tfnr_unidades = AV32TFNr_unidades ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = AV33TFNr_unidades_To ;
      AV116Tnotrecwwds_26_tfnr_unidad = AV34TFNr_unidad ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = AV35TFNr_unidad_Sel ;
      AV118Tnotrecwwds_28_tfnr_barcoda = AV36TFNr_barcoda ;
      AV119Tnotrecwwds_29_tfnr_barcoda_to = AV37TFNr_barcoda_To ;
      AV120Tnotrecwwds_30_tfnr_barreoa = AV38TFNr_barreoa ;
      AV121Tnotrecwwds_31_tfnr_barreoa_to = AV39TFNr_barreoa_To ;
      AV122Tnotrecwwds_32_tfnr_barpara = AV40TFNr_barpara ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = AV41TFNr_barpara_Sel ;
      AV124Tnotrecwwds_34_tfnr_nalb = AV42TFNr_NAlb ;
      AV125Tnotrecwwds_35_tfnr_nalb_to = AV43TFNr_NAlb_To ;
      AV126Tnotrecwwds_36_tfnr_local = AV44TFNr_local ;
      AV127Tnotrecwwds_37_tfnr_local_sel = AV45TFNr_local_Sel ;
      AV128Tnotrecwwds_38_tfnr_user = AV46TFNr_user ;
      AV129Tnotrecwwds_39_tfnr_user_sel = AV47TFNr_user_Sel ;
      AV130Tnotrecwwds_40_tfnr_fecreg = AV48TFNr_fecreg ;
      AV131Tnotrecwwds_41_tfnr_fecent = AV50TFNr_fecent ;
      AV132Tnotrecwwds_42_tfnr_barcod = AV52TFNr_barcod ;
      AV133Tnotrecwwds_43_tfnr_barcod_to = AV53TFNr_barcod_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV91Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV98Tnotrecwwds_8_tfnr_clinom ,
                                           AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV100Tnotrecwwds_10_tfnr_albent ,
                                           AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV102Tnotrecwwds_12_tfnr_refcli ,
                                           AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV104Tnotrecwwds_14_tfnr_artcod ,
                                           AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV108Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV114Tnotrecwwds_24_tfnr_unidades ,
                                           AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV116Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV122Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           AV126Tnotrecwwds_36_tfnr_local ,
                                           AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           AV128Tnotrecwwds_38_tfnr_user ,
                                           AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           AV131Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV91Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV98Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV98Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV100Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV100Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV102Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV102Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV104Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV104Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV106Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV106Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV108Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV108Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV116Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV116Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV122Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV122Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV126Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV126Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV128Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV128Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P084711 */
      pr_default.execute(9, new Object[] {lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, lV91Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV92Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV93Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV94Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV95Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV96Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV97Tnotrecwwds_7_tfnr_clicod_to), lV98Tnotrecwwds_8_tfnr_clinom, AV99Tnotrecwwds_9_tfnr_clinom_sel, lV100Tnotrecwwds_10_tfnr_albent, AV101Tnotrecwwds_11_tfnr_albent_sel, lV102Tnotrecwwds_12_tfnr_refcli, AV103Tnotrecwwds_13_tfnr_refcli_sel, lV104Tnotrecwwds_14_tfnr_artcod, AV105Tnotrecwwds_15_tfnr_artcod_sel, lV106Tnotrecwwds_16_tfnr_artdsc, AV107Tnotrecwwds_17_tfnr_artdsc_sel, lV108Tnotrecwwds_18_tfnr_colnom, AV109Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV110Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV111Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV112Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV113Tnotrecwwds_23_tfnr_piezas_to), AV114Tnotrecwwds_24_tfnr_unidades, AV115Tnotrecwwds_25_tfnr_unidades_to, lV116Tnotrecwwds_26_tfnr_unidad, AV117Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV118Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV119Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV120Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV121Tnotrecwwds_31_tfnr_barreoa_to), lV122Tnotrecwwds_32_tfnr_barpara, AV123Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV124Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV125Tnotrecwwds_35_tfnr_nalb_to), lV126Tnotrecwwds_36_tfnr_local, AV127Tnotrecwwds_37_tfnr_local_sel, lV128Tnotrecwwds_38_tfnr_user, AV129Tnotrecwwds_39_tfnr_user_sel, AV130Tnotrecwwds_40_tfnr_fecreg, AV131Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV132Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV133Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk84720 = false ;
         A5215Nr_user = P084711_A5215Nr_user[0] ;
         n5215Nr_user = P084711_n5215Nr_user[0] ;
         A5210Nr_barcod = P084711_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P084711_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P084711_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P084711_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P084711_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P084711_n5216Nr_fecreg[0] ;
         A5214Nr_local = P084711_A5214Nr_local[0] ;
         n5214Nr_local = P084711_n5214Nr_local[0] ;
         A12235Nr_NAlb = P084711_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P084711_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P084711_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P084711_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P084711_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P084711_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P084711_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P084711_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P084711_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P084711_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P084711_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P084711_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P084711_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P084711_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P084711_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P084711_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P084711_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P084711_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P084711_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P084711_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P084711_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P084711_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P084711_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P084711_n5200Nr_refcli[0] ;
         A5199Nr_albent = P084711_A5199Nr_albent[0] ;
         n5199Nr_albent = P084711_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P084711_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P084711_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P084711_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P084711_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P084711_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P084711_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P084711_A5198Nr_codigo[0] ;
         A396EmprCod = P084711_A396EmprCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P084711_A5215Nr_user[0], A5215Nr_user) == 0 ) )
         {
            brk84720 = false ;
            A5198Nr_codigo = P084711_A5198Nr_codigo[0] ;
            A396EmprCod = P084711_A396EmprCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk84720 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A5215Nr_user)==0) )
         {
            AV58Option = A5215Nr_user ;
            AV61OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A5215Nr_user, "@!"))) ;
            AV59Options.add(AV58Option, 0);
            AV62OptionsDesc.add(AV61OptionDesc, 0);
            AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV59Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84720 )
         {
            brk84720 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tnotrecwwgetfilterdata.this.AV60OptionsJson;
      this.aP4[0] = tnotrecwwgetfilterdata.this.AV63OptionsDescJson;
      this.aP5[0] = tnotrecwwgetfilterdata.this.AV65OptionIndexesJson;
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
      AV86FilterFullText = "" ;
      AV16TFNr_CliNom = "" ;
      AV17TFNr_CliNom_Sel = "" ;
      AV18TFNr_albent = "" ;
      AV19TFNr_albent_Sel = "" ;
      AV20TFNr_refcli = "" ;
      AV21TFNr_refcli_Sel = "" ;
      AV22TFNr_artcod = "" ;
      AV23TFNr_artcod_Sel = "" ;
      AV24TFNr_artdsc = "" ;
      AV25TFNr_artdsc_Sel = "" ;
      AV26TFNr_colnom = "" ;
      AV27TFNr_colnom_Sel = "" ;
      AV32TFNr_unidades = DecimalUtil.ZERO ;
      AV33TFNr_unidades_To = DecimalUtil.ZERO ;
      AV34TFNr_unidad = "" ;
      AV35TFNr_unidad_Sel = "" ;
      AV40TFNr_barpara = "" ;
      AV41TFNr_barpara_Sel = "" ;
      AV44TFNr_local = "" ;
      AV45TFNr_local_Sel = "" ;
      AV46TFNr_user = "" ;
      AV47TFNr_user_Sel = "" ;
      AV48TFNr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV50TFNr_fecent = GXutil.nullDate() ;
      A5341Nr_CliNom = "" ;
      AV91Tnotrecwwds_1_filterfulltext = "" ;
      AV98Tnotrecwwds_8_tfnr_clinom = "" ;
      AV99Tnotrecwwds_9_tfnr_clinom_sel = "" ;
      AV100Tnotrecwwds_10_tfnr_albent = "" ;
      AV101Tnotrecwwds_11_tfnr_albent_sel = "" ;
      AV102Tnotrecwwds_12_tfnr_refcli = "" ;
      AV103Tnotrecwwds_13_tfnr_refcli_sel = "" ;
      AV104Tnotrecwwds_14_tfnr_artcod = "" ;
      AV105Tnotrecwwds_15_tfnr_artcod_sel = "" ;
      AV106Tnotrecwwds_16_tfnr_artdsc = "" ;
      AV107Tnotrecwwds_17_tfnr_artdsc_sel = "" ;
      AV108Tnotrecwwds_18_tfnr_colnom = "" ;
      AV109Tnotrecwwds_19_tfnr_colnom_sel = "" ;
      AV114Tnotrecwwds_24_tfnr_unidades = DecimalUtil.ZERO ;
      AV115Tnotrecwwds_25_tfnr_unidades_to = DecimalUtil.ZERO ;
      AV116Tnotrecwwds_26_tfnr_unidad = "" ;
      AV117Tnotrecwwds_27_tfnr_unidad_sel = "" ;
      AV122Tnotrecwwds_32_tfnr_barpara = "" ;
      AV123Tnotrecwwds_33_tfnr_barpara_sel = "" ;
      AV126Tnotrecwwds_36_tfnr_local = "" ;
      AV127Tnotrecwwds_37_tfnr_local_sel = "" ;
      AV128Tnotrecwwds_38_tfnr_user = "" ;
      AV129Tnotrecwwds_39_tfnr_user_sel = "" ;
      AV130Tnotrecwwds_40_tfnr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV131Tnotrecwwds_41_tfnr_fecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV91Tnotrecwwds_1_filterfulltext = "" ;
      lV98Tnotrecwwds_8_tfnr_clinom = "" ;
      lV100Tnotrecwwds_10_tfnr_albent = "" ;
      lV102Tnotrecwwds_12_tfnr_refcli = "" ;
      lV104Tnotrecwwds_14_tfnr_artcod = "" ;
      lV106Tnotrecwwds_16_tfnr_artdsc = "" ;
      lV108Tnotrecwwds_18_tfnr_colnom = "" ;
      lV116Tnotrecwwds_26_tfnr_unidad = "" ;
      lV122Tnotrecwwds_32_tfnr_barpara = "" ;
      lV126Tnotrecwwds_36_tfnr_local = "" ;
      lV128Tnotrecwwds_38_tfnr_user = "" ;
      A5199Nr_albent = "" ;
      A5200Nr_refcli = "" ;
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5203Nr_colnom = "" ;
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5215Nr_user = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5217Nr_fecent = GXutil.nullDate() ;
      P08472_A5341Nr_CliNom = new String[] {""} ;
      P08472_n5341Nr_CliNom = new boolean[] {false} ;
      P08472_A5210Nr_barcod = new int[1] ;
      P08472_n5210Nr_barcod = new boolean[] {false} ;
      P08472_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08472_n5217Nr_fecent = new boolean[] {false} ;
      P08472_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08472_n5216Nr_fecreg = new boolean[] {false} ;
      P08472_A5215Nr_user = new String[] {""} ;
      P08472_n5215Nr_user = new boolean[] {false} ;
      P08472_A5214Nr_local = new String[] {""} ;
      P08472_n5214Nr_local = new boolean[] {false} ;
      P08472_A12235Nr_NAlb = new long[1] ;
      P08472_n12235Nr_NAlb = new boolean[] {false} ;
      P08472_A5224Nr_barpara = new String[] {""} ;
      P08472_n5224Nr_barpara = new boolean[] {false} ;
      P08472_A5223Nr_barreoa = new byte[1] ;
      P08472_n5223Nr_barreoa = new boolean[] {false} ;
      P08472_A5222Nr_barcoda = new int[1] ;
      P08472_n5222Nr_barcoda = new boolean[] {false} ;
      P08472_A5209Nr_unidad = new String[] {""} ;
      P08472_n5209Nr_unidad = new boolean[] {false} ;
      P08472_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08472_n5208Nr_unidade = new boolean[] {false} ;
      P08472_A5207Nr_piezas = new int[1] ;
      P08472_n5207Nr_piezas = new boolean[] {false} ;
      P08472_A5204Nr_colnum = new int[1] ;
      P08472_n5204Nr_colnum = new boolean[] {false} ;
      P08472_A5203Nr_colnom = new String[] {""} ;
      P08472_n5203Nr_colnom = new boolean[] {false} ;
      P08472_A5202Nr_artdsc = new String[] {""} ;
      P08472_n5202Nr_artdsc = new boolean[] {false} ;
      P08472_A5201Nr_artcod = new String[] {""} ;
      P08472_n5201Nr_artcod = new boolean[] {false} ;
      P08472_A5200Nr_refcli = new String[] {""} ;
      P08472_n5200Nr_refcli = new boolean[] {false} ;
      P08472_A5199Nr_albent = new String[] {""} ;
      P08472_n5199Nr_albent = new boolean[] {false} ;
      P08472_A5340Nr_CliCod = new int[1] ;
      P08472_n5340Nr_CliCod = new boolean[] {false} ;
      P08472_A5206Nr_albrecc = new int[1] ;
      P08472_n5206Nr_albrecc = new boolean[] {false} ;
      P08472_A5198Nr_codigo = new int[1] ;
      P08472_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV58Option = "" ;
      P08473_A5199Nr_albent = new String[] {""} ;
      P08473_n5199Nr_albent = new boolean[] {false} ;
      P08473_A5210Nr_barcod = new int[1] ;
      P08473_n5210Nr_barcod = new boolean[] {false} ;
      P08473_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08473_n5217Nr_fecent = new boolean[] {false} ;
      P08473_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08473_n5216Nr_fecreg = new boolean[] {false} ;
      P08473_A5215Nr_user = new String[] {""} ;
      P08473_n5215Nr_user = new boolean[] {false} ;
      P08473_A5214Nr_local = new String[] {""} ;
      P08473_n5214Nr_local = new boolean[] {false} ;
      P08473_A12235Nr_NAlb = new long[1] ;
      P08473_n12235Nr_NAlb = new boolean[] {false} ;
      P08473_A5224Nr_barpara = new String[] {""} ;
      P08473_n5224Nr_barpara = new boolean[] {false} ;
      P08473_A5223Nr_barreoa = new byte[1] ;
      P08473_n5223Nr_barreoa = new boolean[] {false} ;
      P08473_A5222Nr_barcoda = new int[1] ;
      P08473_n5222Nr_barcoda = new boolean[] {false} ;
      P08473_A5209Nr_unidad = new String[] {""} ;
      P08473_n5209Nr_unidad = new boolean[] {false} ;
      P08473_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08473_n5208Nr_unidade = new boolean[] {false} ;
      P08473_A5207Nr_piezas = new int[1] ;
      P08473_n5207Nr_piezas = new boolean[] {false} ;
      P08473_A5204Nr_colnum = new int[1] ;
      P08473_n5204Nr_colnum = new boolean[] {false} ;
      P08473_A5203Nr_colnom = new String[] {""} ;
      P08473_n5203Nr_colnom = new boolean[] {false} ;
      P08473_A5202Nr_artdsc = new String[] {""} ;
      P08473_n5202Nr_artdsc = new boolean[] {false} ;
      P08473_A5201Nr_artcod = new String[] {""} ;
      P08473_n5201Nr_artcod = new boolean[] {false} ;
      P08473_A5200Nr_refcli = new String[] {""} ;
      P08473_n5200Nr_refcli = new boolean[] {false} ;
      P08473_A5341Nr_CliNom = new String[] {""} ;
      P08473_n5341Nr_CliNom = new boolean[] {false} ;
      P08473_A5340Nr_CliCod = new int[1] ;
      P08473_n5340Nr_CliCod = new boolean[] {false} ;
      P08473_A5206Nr_albrecc = new int[1] ;
      P08473_n5206Nr_albrecc = new boolean[] {false} ;
      P08473_A5198Nr_codigo = new int[1] ;
      P08473_A396EmprCod = new String[] {""} ;
      P08474_A5200Nr_refcli = new String[] {""} ;
      P08474_n5200Nr_refcli = new boolean[] {false} ;
      P08474_A5210Nr_barcod = new int[1] ;
      P08474_n5210Nr_barcod = new boolean[] {false} ;
      P08474_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08474_n5217Nr_fecent = new boolean[] {false} ;
      P08474_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08474_n5216Nr_fecreg = new boolean[] {false} ;
      P08474_A5215Nr_user = new String[] {""} ;
      P08474_n5215Nr_user = new boolean[] {false} ;
      P08474_A5214Nr_local = new String[] {""} ;
      P08474_n5214Nr_local = new boolean[] {false} ;
      P08474_A12235Nr_NAlb = new long[1] ;
      P08474_n12235Nr_NAlb = new boolean[] {false} ;
      P08474_A5224Nr_barpara = new String[] {""} ;
      P08474_n5224Nr_barpara = new boolean[] {false} ;
      P08474_A5223Nr_barreoa = new byte[1] ;
      P08474_n5223Nr_barreoa = new boolean[] {false} ;
      P08474_A5222Nr_barcoda = new int[1] ;
      P08474_n5222Nr_barcoda = new boolean[] {false} ;
      P08474_A5209Nr_unidad = new String[] {""} ;
      P08474_n5209Nr_unidad = new boolean[] {false} ;
      P08474_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08474_n5208Nr_unidade = new boolean[] {false} ;
      P08474_A5207Nr_piezas = new int[1] ;
      P08474_n5207Nr_piezas = new boolean[] {false} ;
      P08474_A5204Nr_colnum = new int[1] ;
      P08474_n5204Nr_colnum = new boolean[] {false} ;
      P08474_A5203Nr_colnom = new String[] {""} ;
      P08474_n5203Nr_colnom = new boolean[] {false} ;
      P08474_A5202Nr_artdsc = new String[] {""} ;
      P08474_n5202Nr_artdsc = new boolean[] {false} ;
      P08474_A5201Nr_artcod = new String[] {""} ;
      P08474_n5201Nr_artcod = new boolean[] {false} ;
      P08474_A5199Nr_albent = new String[] {""} ;
      P08474_n5199Nr_albent = new boolean[] {false} ;
      P08474_A5341Nr_CliNom = new String[] {""} ;
      P08474_n5341Nr_CliNom = new boolean[] {false} ;
      P08474_A5340Nr_CliCod = new int[1] ;
      P08474_n5340Nr_CliCod = new boolean[] {false} ;
      P08474_A5206Nr_albrecc = new int[1] ;
      P08474_n5206Nr_albrecc = new boolean[] {false} ;
      P08474_A5198Nr_codigo = new int[1] ;
      P08474_A396EmprCod = new String[] {""} ;
      P08475_A5201Nr_artcod = new String[] {""} ;
      P08475_n5201Nr_artcod = new boolean[] {false} ;
      P08475_A5210Nr_barcod = new int[1] ;
      P08475_n5210Nr_barcod = new boolean[] {false} ;
      P08475_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08475_n5217Nr_fecent = new boolean[] {false} ;
      P08475_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08475_n5216Nr_fecreg = new boolean[] {false} ;
      P08475_A5215Nr_user = new String[] {""} ;
      P08475_n5215Nr_user = new boolean[] {false} ;
      P08475_A5214Nr_local = new String[] {""} ;
      P08475_n5214Nr_local = new boolean[] {false} ;
      P08475_A12235Nr_NAlb = new long[1] ;
      P08475_n12235Nr_NAlb = new boolean[] {false} ;
      P08475_A5224Nr_barpara = new String[] {""} ;
      P08475_n5224Nr_barpara = new boolean[] {false} ;
      P08475_A5223Nr_barreoa = new byte[1] ;
      P08475_n5223Nr_barreoa = new boolean[] {false} ;
      P08475_A5222Nr_barcoda = new int[1] ;
      P08475_n5222Nr_barcoda = new boolean[] {false} ;
      P08475_A5209Nr_unidad = new String[] {""} ;
      P08475_n5209Nr_unidad = new boolean[] {false} ;
      P08475_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08475_n5208Nr_unidade = new boolean[] {false} ;
      P08475_A5207Nr_piezas = new int[1] ;
      P08475_n5207Nr_piezas = new boolean[] {false} ;
      P08475_A5204Nr_colnum = new int[1] ;
      P08475_n5204Nr_colnum = new boolean[] {false} ;
      P08475_A5203Nr_colnom = new String[] {""} ;
      P08475_n5203Nr_colnom = new boolean[] {false} ;
      P08475_A5202Nr_artdsc = new String[] {""} ;
      P08475_n5202Nr_artdsc = new boolean[] {false} ;
      P08475_A5200Nr_refcli = new String[] {""} ;
      P08475_n5200Nr_refcli = new boolean[] {false} ;
      P08475_A5199Nr_albent = new String[] {""} ;
      P08475_n5199Nr_albent = new boolean[] {false} ;
      P08475_A5341Nr_CliNom = new String[] {""} ;
      P08475_n5341Nr_CliNom = new boolean[] {false} ;
      P08475_A5340Nr_CliCod = new int[1] ;
      P08475_n5340Nr_CliCod = new boolean[] {false} ;
      P08475_A5206Nr_albrecc = new int[1] ;
      P08475_n5206Nr_albrecc = new boolean[] {false} ;
      P08475_A5198Nr_codigo = new int[1] ;
      P08475_A396EmprCod = new String[] {""} ;
      P08476_A5202Nr_artdsc = new String[] {""} ;
      P08476_n5202Nr_artdsc = new boolean[] {false} ;
      P08476_A5210Nr_barcod = new int[1] ;
      P08476_n5210Nr_barcod = new boolean[] {false} ;
      P08476_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08476_n5217Nr_fecent = new boolean[] {false} ;
      P08476_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08476_n5216Nr_fecreg = new boolean[] {false} ;
      P08476_A5215Nr_user = new String[] {""} ;
      P08476_n5215Nr_user = new boolean[] {false} ;
      P08476_A5214Nr_local = new String[] {""} ;
      P08476_n5214Nr_local = new boolean[] {false} ;
      P08476_A12235Nr_NAlb = new long[1] ;
      P08476_n12235Nr_NAlb = new boolean[] {false} ;
      P08476_A5224Nr_barpara = new String[] {""} ;
      P08476_n5224Nr_barpara = new boolean[] {false} ;
      P08476_A5223Nr_barreoa = new byte[1] ;
      P08476_n5223Nr_barreoa = new boolean[] {false} ;
      P08476_A5222Nr_barcoda = new int[1] ;
      P08476_n5222Nr_barcoda = new boolean[] {false} ;
      P08476_A5209Nr_unidad = new String[] {""} ;
      P08476_n5209Nr_unidad = new boolean[] {false} ;
      P08476_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08476_n5208Nr_unidade = new boolean[] {false} ;
      P08476_A5207Nr_piezas = new int[1] ;
      P08476_n5207Nr_piezas = new boolean[] {false} ;
      P08476_A5204Nr_colnum = new int[1] ;
      P08476_n5204Nr_colnum = new boolean[] {false} ;
      P08476_A5203Nr_colnom = new String[] {""} ;
      P08476_n5203Nr_colnom = new boolean[] {false} ;
      P08476_A5201Nr_artcod = new String[] {""} ;
      P08476_n5201Nr_artcod = new boolean[] {false} ;
      P08476_A5200Nr_refcli = new String[] {""} ;
      P08476_n5200Nr_refcli = new boolean[] {false} ;
      P08476_A5199Nr_albent = new String[] {""} ;
      P08476_n5199Nr_albent = new boolean[] {false} ;
      P08476_A5341Nr_CliNom = new String[] {""} ;
      P08476_n5341Nr_CliNom = new boolean[] {false} ;
      P08476_A5340Nr_CliCod = new int[1] ;
      P08476_n5340Nr_CliCod = new boolean[] {false} ;
      P08476_A5206Nr_albrecc = new int[1] ;
      P08476_n5206Nr_albrecc = new boolean[] {false} ;
      P08476_A5198Nr_codigo = new int[1] ;
      P08476_A396EmprCod = new String[] {""} ;
      P08477_A5203Nr_colnom = new String[] {""} ;
      P08477_n5203Nr_colnom = new boolean[] {false} ;
      P08477_A5210Nr_barcod = new int[1] ;
      P08477_n5210Nr_barcod = new boolean[] {false} ;
      P08477_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08477_n5217Nr_fecent = new boolean[] {false} ;
      P08477_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08477_n5216Nr_fecreg = new boolean[] {false} ;
      P08477_A5215Nr_user = new String[] {""} ;
      P08477_n5215Nr_user = new boolean[] {false} ;
      P08477_A5214Nr_local = new String[] {""} ;
      P08477_n5214Nr_local = new boolean[] {false} ;
      P08477_A12235Nr_NAlb = new long[1] ;
      P08477_n12235Nr_NAlb = new boolean[] {false} ;
      P08477_A5224Nr_barpara = new String[] {""} ;
      P08477_n5224Nr_barpara = new boolean[] {false} ;
      P08477_A5223Nr_barreoa = new byte[1] ;
      P08477_n5223Nr_barreoa = new boolean[] {false} ;
      P08477_A5222Nr_barcoda = new int[1] ;
      P08477_n5222Nr_barcoda = new boolean[] {false} ;
      P08477_A5209Nr_unidad = new String[] {""} ;
      P08477_n5209Nr_unidad = new boolean[] {false} ;
      P08477_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08477_n5208Nr_unidade = new boolean[] {false} ;
      P08477_A5207Nr_piezas = new int[1] ;
      P08477_n5207Nr_piezas = new boolean[] {false} ;
      P08477_A5204Nr_colnum = new int[1] ;
      P08477_n5204Nr_colnum = new boolean[] {false} ;
      P08477_A5202Nr_artdsc = new String[] {""} ;
      P08477_n5202Nr_artdsc = new boolean[] {false} ;
      P08477_A5201Nr_artcod = new String[] {""} ;
      P08477_n5201Nr_artcod = new boolean[] {false} ;
      P08477_A5200Nr_refcli = new String[] {""} ;
      P08477_n5200Nr_refcli = new boolean[] {false} ;
      P08477_A5199Nr_albent = new String[] {""} ;
      P08477_n5199Nr_albent = new boolean[] {false} ;
      P08477_A5341Nr_CliNom = new String[] {""} ;
      P08477_n5341Nr_CliNom = new boolean[] {false} ;
      P08477_A5340Nr_CliCod = new int[1] ;
      P08477_n5340Nr_CliCod = new boolean[] {false} ;
      P08477_A5206Nr_albrecc = new int[1] ;
      P08477_n5206Nr_albrecc = new boolean[] {false} ;
      P08477_A5198Nr_codigo = new int[1] ;
      P08477_A396EmprCod = new String[] {""} ;
      P08478_A5209Nr_unidad = new String[] {""} ;
      P08478_n5209Nr_unidad = new boolean[] {false} ;
      P08478_A5210Nr_barcod = new int[1] ;
      P08478_n5210Nr_barcod = new boolean[] {false} ;
      P08478_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08478_n5217Nr_fecent = new boolean[] {false} ;
      P08478_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08478_n5216Nr_fecreg = new boolean[] {false} ;
      P08478_A5215Nr_user = new String[] {""} ;
      P08478_n5215Nr_user = new boolean[] {false} ;
      P08478_A5214Nr_local = new String[] {""} ;
      P08478_n5214Nr_local = new boolean[] {false} ;
      P08478_A12235Nr_NAlb = new long[1] ;
      P08478_n12235Nr_NAlb = new boolean[] {false} ;
      P08478_A5224Nr_barpara = new String[] {""} ;
      P08478_n5224Nr_barpara = new boolean[] {false} ;
      P08478_A5223Nr_barreoa = new byte[1] ;
      P08478_n5223Nr_barreoa = new boolean[] {false} ;
      P08478_A5222Nr_barcoda = new int[1] ;
      P08478_n5222Nr_barcoda = new boolean[] {false} ;
      P08478_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08478_n5208Nr_unidade = new boolean[] {false} ;
      P08478_A5207Nr_piezas = new int[1] ;
      P08478_n5207Nr_piezas = new boolean[] {false} ;
      P08478_A5204Nr_colnum = new int[1] ;
      P08478_n5204Nr_colnum = new boolean[] {false} ;
      P08478_A5203Nr_colnom = new String[] {""} ;
      P08478_n5203Nr_colnom = new boolean[] {false} ;
      P08478_A5202Nr_artdsc = new String[] {""} ;
      P08478_n5202Nr_artdsc = new boolean[] {false} ;
      P08478_A5201Nr_artcod = new String[] {""} ;
      P08478_n5201Nr_artcod = new boolean[] {false} ;
      P08478_A5200Nr_refcli = new String[] {""} ;
      P08478_n5200Nr_refcli = new boolean[] {false} ;
      P08478_A5199Nr_albent = new String[] {""} ;
      P08478_n5199Nr_albent = new boolean[] {false} ;
      P08478_A5341Nr_CliNom = new String[] {""} ;
      P08478_n5341Nr_CliNom = new boolean[] {false} ;
      P08478_A5340Nr_CliCod = new int[1] ;
      P08478_n5340Nr_CliCod = new boolean[] {false} ;
      P08478_A5206Nr_albrecc = new int[1] ;
      P08478_n5206Nr_albrecc = new boolean[] {false} ;
      P08478_A5198Nr_codigo = new int[1] ;
      P08478_A396EmprCod = new String[] {""} ;
      P08479_A5224Nr_barpara = new String[] {""} ;
      P08479_n5224Nr_barpara = new boolean[] {false} ;
      P08479_A5210Nr_barcod = new int[1] ;
      P08479_n5210Nr_barcod = new boolean[] {false} ;
      P08479_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08479_n5217Nr_fecent = new boolean[] {false} ;
      P08479_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08479_n5216Nr_fecreg = new boolean[] {false} ;
      P08479_A5215Nr_user = new String[] {""} ;
      P08479_n5215Nr_user = new boolean[] {false} ;
      P08479_A5214Nr_local = new String[] {""} ;
      P08479_n5214Nr_local = new boolean[] {false} ;
      P08479_A12235Nr_NAlb = new long[1] ;
      P08479_n12235Nr_NAlb = new boolean[] {false} ;
      P08479_A5223Nr_barreoa = new byte[1] ;
      P08479_n5223Nr_barreoa = new boolean[] {false} ;
      P08479_A5222Nr_barcoda = new int[1] ;
      P08479_n5222Nr_barcoda = new boolean[] {false} ;
      P08479_A5209Nr_unidad = new String[] {""} ;
      P08479_n5209Nr_unidad = new boolean[] {false} ;
      P08479_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08479_n5208Nr_unidade = new boolean[] {false} ;
      P08479_A5207Nr_piezas = new int[1] ;
      P08479_n5207Nr_piezas = new boolean[] {false} ;
      P08479_A5204Nr_colnum = new int[1] ;
      P08479_n5204Nr_colnum = new boolean[] {false} ;
      P08479_A5203Nr_colnom = new String[] {""} ;
      P08479_n5203Nr_colnom = new boolean[] {false} ;
      P08479_A5202Nr_artdsc = new String[] {""} ;
      P08479_n5202Nr_artdsc = new boolean[] {false} ;
      P08479_A5201Nr_artcod = new String[] {""} ;
      P08479_n5201Nr_artcod = new boolean[] {false} ;
      P08479_A5200Nr_refcli = new String[] {""} ;
      P08479_n5200Nr_refcli = new boolean[] {false} ;
      P08479_A5199Nr_albent = new String[] {""} ;
      P08479_n5199Nr_albent = new boolean[] {false} ;
      P08479_A5341Nr_CliNom = new String[] {""} ;
      P08479_n5341Nr_CliNom = new boolean[] {false} ;
      P08479_A5340Nr_CliCod = new int[1] ;
      P08479_n5340Nr_CliCod = new boolean[] {false} ;
      P08479_A5206Nr_albrecc = new int[1] ;
      P08479_n5206Nr_albrecc = new boolean[] {false} ;
      P08479_A5198Nr_codigo = new int[1] ;
      P08479_A396EmprCod = new String[] {""} ;
      P084710_A5214Nr_local = new String[] {""} ;
      P084710_n5214Nr_local = new boolean[] {false} ;
      P084710_A5210Nr_barcod = new int[1] ;
      P084710_n5210Nr_barcod = new boolean[] {false} ;
      P084710_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P084710_n5217Nr_fecent = new boolean[] {false} ;
      P084710_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P084710_n5216Nr_fecreg = new boolean[] {false} ;
      P084710_A5215Nr_user = new String[] {""} ;
      P084710_n5215Nr_user = new boolean[] {false} ;
      P084710_A12235Nr_NAlb = new long[1] ;
      P084710_n12235Nr_NAlb = new boolean[] {false} ;
      P084710_A5224Nr_barpara = new String[] {""} ;
      P084710_n5224Nr_barpara = new boolean[] {false} ;
      P084710_A5223Nr_barreoa = new byte[1] ;
      P084710_n5223Nr_barreoa = new boolean[] {false} ;
      P084710_A5222Nr_barcoda = new int[1] ;
      P084710_n5222Nr_barcoda = new boolean[] {false} ;
      P084710_A5209Nr_unidad = new String[] {""} ;
      P084710_n5209Nr_unidad = new boolean[] {false} ;
      P084710_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084710_n5208Nr_unidade = new boolean[] {false} ;
      P084710_A5207Nr_piezas = new int[1] ;
      P084710_n5207Nr_piezas = new boolean[] {false} ;
      P084710_A5204Nr_colnum = new int[1] ;
      P084710_n5204Nr_colnum = new boolean[] {false} ;
      P084710_A5203Nr_colnom = new String[] {""} ;
      P084710_n5203Nr_colnom = new boolean[] {false} ;
      P084710_A5202Nr_artdsc = new String[] {""} ;
      P084710_n5202Nr_artdsc = new boolean[] {false} ;
      P084710_A5201Nr_artcod = new String[] {""} ;
      P084710_n5201Nr_artcod = new boolean[] {false} ;
      P084710_A5200Nr_refcli = new String[] {""} ;
      P084710_n5200Nr_refcli = new boolean[] {false} ;
      P084710_A5199Nr_albent = new String[] {""} ;
      P084710_n5199Nr_albent = new boolean[] {false} ;
      P084710_A5341Nr_CliNom = new String[] {""} ;
      P084710_n5341Nr_CliNom = new boolean[] {false} ;
      P084710_A5340Nr_CliCod = new int[1] ;
      P084710_n5340Nr_CliCod = new boolean[] {false} ;
      P084710_A5206Nr_albrecc = new int[1] ;
      P084710_n5206Nr_albrecc = new boolean[] {false} ;
      P084710_A5198Nr_codigo = new int[1] ;
      P084710_A396EmprCod = new String[] {""} ;
      P084711_A5215Nr_user = new String[] {""} ;
      P084711_n5215Nr_user = new boolean[] {false} ;
      P084711_A5210Nr_barcod = new int[1] ;
      P084711_n5210Nr_barcod = new boolean[] {false} ;
      P084711_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P084711_n5217Nr_fecent = new boolean[] {false} ;
      P084711_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P084711_n5216Nr_fecreg = new boolean[] {false} ;
      P084711_A5214Nr_local = new String[] {""} ;
      P084711_n5214Nr_local = new boolean[] {false} ;
      P084711_A12235Nr_NAlb = new long[1] ;
      P084711_n12235Nr_NAlb = new boolean[] {false} ;
      P084711_A5224Nr_barpara = new String[] {""} ;
      P084711_n5224Nr_barpara = new boolean[] {false} ;
      P084711_A5223Nr_barreoa = new byte[1] ;
      P084711_n5223Nr_barreoa = new boolean[] {false} ;
      P084711_A5222Nr_barcoda = new int[1] ;
      P084711_n5222Nr_barcoda = new boolean[] {false} ;
      P084711_A5209Nr_unidad = new String[] {""} ;
      P084711_n5209Nr_unidad = new boolean[] {false} ;
      P084711_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084711_n5208Nr_unidade = new boolean[] {false} ;
      P084711_A5207Nr_piezas = new int[1] ;
      P084711_n5207Nr_piezas = new boolean[] {false} ;
      P084711_A5204Nr_colnum = new int[1] ;
      P084711_n5204Nr_colnum = new boolean[] {false} ;
      P084711_A5203Nr_colnom = new String[] {""} ;
      P084711_n5203Nr_colnom = new boolean[] {false} ;
      P084711_A5202Nr_artdsc = new String[] {""} ;
      P084711_n5202Nr_artdsc = new boolean[] {false} ;
      P084711_A5201Nr_artcod = new String[] {""} ;
      P084711_n5201Nr_artcod = new boolean[] {false} ;
      P084711_A5200Nr_refcli = new String[] {""} ;
      P084711_n5200Nr_refcli = new boolean[] {false} ;
      P084711_A5199Nr_albent = new String[] {""} ;
      P084711_n5199Nr_albent = new boolean[] {false} ;
      P084711_A5341Nr_CliNom = new String[] {""} ;
      P084711_n5341Nr_CliNom = new boolean[] {false} ;
      P084711_A5340Nr_CliCod = new int[1] ;
      P084711_n5340Nr_CliCod = new boolean[] {false} ;
      P084711_A5206Nr_albrecc = new int[1] ;
      P084711_n5206Nr_albrecc = new boolean[] {false} ;
      P084711_A5198Nr_codigo = new int[1] ;
      P084711_A396EmprCod = new String[] {""} ;
      AV61OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrecwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08472_A5341Nr_CliNom, P08472_n5341Nr_CliNom, P08472_A5210Nr_barcod, P08472_n5210Nr_barcod, P08472_A5217Nr_fecent, P08472_n5217Nr_fecent, P08472_A5216Nr_fecreg, P08472_n5216Nr_fecreg, P08472_A5215Nr_user, P08472_n5215Nr_user,
            P08472_A5214Nr_local, P08472_n5214Nr_local, P08472_A12235Nr_NAlb, P08472_n12235Nr_NAlb, P08472_A5224Nr_barpara, P08472_n5224Nr_barpara, P08472_A5223Nr_barreoa, P08472_n5223Nr_barreoa, P08472_A5222Nr_barcoda, P08472_n5222Nr_barcoda,
            P08472_A5209Nr_unidad, P08472_n5209Nr_unidad, P08472_A5208Nr_unidade, P08472_n5208Nr_unidade, P08472_A5207Nr_piezas, P08472_n5207Nr_piezas, P08472_A5204Nr_colnum, P08472_n5204Nr_colnum, P08472_A5203Nr_colnom, P08472_n5203Nr_colnom,
            P08472_A5202Nr_artdsc, P08472_n5202Nr_artdsc, P08472_A5201Nr_artcod, P08472_n5201Nr_artcod, P08472_A5200Nr_refcli, P08472_n5200Nr_refcli, P08472_A5199Nr_albent, P08472_n5199Nr_albent, P08472_A5340Nr_CliCod, P08472_n5340Nr_CliCod,
            P08472_A5206Nr_albrecc, P08472_n5206Nr_albrecc, P08472_A5198Nr_codigo, P08472_A396EmprCod
            }
            , new Object[] {
            P08473_A5199Nr_albent, P08473_n5199Nr_albent, P08473_A5210Nr_barcod, P08473_n5210Nr_barcod, P08473_A5217Nr_fecent, P08473_n5217Nr_fecent, P08473_A5216Nr_fecreg, P08473_n5216Nr_fecreg, P08473_A5215Nr_user, P08473_n5215Nr_user,
            P08473_A5214Nr_local, P08473_n5214Nr_local, P08473_A12235Nr_NAlb, P08473_n12235Nr_NAlb, P08473_A5224Nr_barpara, P08473_n5224Nr_barpara, P08473_A5223Nr_barreoa, P08473_n5223Nr_barreoa, P08473_A5222Nr_barcoda, P08473_n5222Nr_barcoda,
            P08473_A5209Nr_unidad, P08473_n5209Nr_unidad, P08473_A5208Nr_unidade, P08473_n5208Nr_unidade, P08473_A5207Nr_piezas, P08473_n5207Nr_piezas, P08473_A5204Nr_colnum, P08473_n5204Nr_colnum, P08473_A5203Nr_colnom, P08473_n5203Nr_colnom,
            P08473_A5202Nr_artdsc, P08473_n5202Nr_artdsc, P08473_A5201Nr_artcod, P08473_n5201Nr_artcod, P08473_A5200Nr_refcli, P08473_n5200Nr_refcli, P08473_A5341Nr_CliNom, P08473_n5341Nr_CliNom, P08473_A5340Nr_CliCod, P08473_n5340Nr_CliCod,
            P08473_A5206Nr_albrecc, P08473_n5206Nr_albrecc, P08473_A5198Nr_codigo, P08473_A396EmprCod
            }
            , new Object[] {
            P08474_A5200Nr_refcli, P08474_n5200Nr_refcli, P08474_A5210Nr_barcod, P08474_n5210Nr_barcod, P08474_A5217Nr_fecent, P08474_n5217Nr_fecent, P08474_A5216Nr_fecreg, P08474_n5216Nr_fecreg, P08474_A5215Nr_user, P08474_n5215Nr_user,
            P08474_A5214Nr_local, P08474_n5214Nr_local, P08474_A12235Nr_NAlb, P08474_n12235Nr_NAlb, P08474_A5224Nr_barpara, P08474_n5224Nr_barpara, P08474_A5223Nr_barreoa, P08474_n5223Nr_barreoa, P08474_A5222Nr_barcoda, P08474_n5222Nr_barcoda,
            P08474_A5209Nr_unidad, P08474_n5209Nr_unidad, P08474_A5208Nr_unidade, P08474_n5208Nr_unidade, P08474_A5207Nr_piezas, P08474_n5207Nr_piezas, P08474_A5204Nr_colnum, P08474_n5204Nr_colnum, P08474_A5203Nr_colnom, P08474_n5203Nr_colnom,
            P08474_A5202Nr_artdsc, P08474_n5202Nr_artdsc, P08474_A5201Nr_artcod, P08474_n5201Nr_artcod, P08474_A5199Nr_albent, P08474_n5199Nr_albent, P08474_A5341Nr_CliNom, P08474_n5341Nr_CliNom, P08474_A5340Nr_CliCod, P08474_n5340Nr_CliCod,
            P08474_A5206Nr_albrecc, P08474_n5206Nr_albrecc, P08474_A5198Nr_codigo, P08474_A396EmprCod
            }
            , new Object[] {
            P08475_A5201Nr_artcod, P08475_n5201Nr_artcod, P08475_A5210Nr_barcod, P08475_n5210Nr_barcod, P08475_A5217Nr_fecent, P08475_n5217Nr_fecent, P08475_A5216Nr_fecreg, P08475_n5216Nr_fecreg, P08475_A5215Nr_user, P08475_n5215Nr_user,
            P08475_A5214Nr_local, P08475_n5214Nr_local, P08475_A12235Nr_NAlb, P08475_n12235Nr_NAlb, P08475_A5224Nr_barpara, P08475_n5224Nr_barpara, P08475_A5223Nr_barreoa, P08475_n5223Nr_barreoa, P08475_A5222Nr_barcoda, P08475_n5222Nr_barcoda,
            P08475_A5209Nr_unidad, P08475_n5209Nr_unidad, P08475_A5208Nr_unidade, P08475_n5208Nr_unidade, P08475_A5207Nr_piezas, P08475_n5207Nr_piezas, P08475_A5204Nr_colnum, P08475_n5204Nr_colnum, P08475_A5203Nr_colnom, P08475_n5203Nr_colnom,
            P08475_A5202Nr_artdsc, P08475_n5202Nr_artdsc, P08475_A5200Nr_refcli, P08475_n5200Nr_refcli, P08475_A5199Nr_albent, P08475_n5199Nr_albent, P08475_A5341Nr_CliNom, P08475_n5341Nr_CliNom, P08475_A5340Nr_CliCod, P08475_n5340Nr_CliCod,
            P08475_A5206Nr_albrecc, P08475_n5206Nr_albrecc, P08475_A5198Nr_codigo, P08475_A396EmprCod
            }
            , new Object[] {
            P08476_A5202Nr_artdsc, P08476_n5202Nr_artdsc, P08476_A5210Nr_barcod, P08476_n5210Nr_barcod, P08476_A5217Nr_fecent, P08476_n5217Nr_fecent, P08476_A5216Nr_fecreg, P08476_n5216Nr_fecreg, P08476_A5215Nr_user, P08476_n5215Nr_user,
            P08476_A5214Nr_local, P08476_n5214Nr_local, P08476_A12235Nr_NAlb, P08476_n12235Nr_NAlb, P08476_A5224Nr_barpara, P08476_n5224Nr_barpara, P08476_A5223Nr_barreoa, P08476_n5223Nr_barreoa, P08476_A5222Nr_barcoda, P08476_n5222Nr_barcoda,
            P08476_A5209Nr_unidad, P08476_n5209Nr_unidad, P08476_A5208Nr_unidade, P08476_n5208Nr_unidade, P08476_A5207Nr_piezas, P08476_n5207Nr_piezas, P08476_A5204Nr_colnum, P08476_n5204Nr_colnum, P08476_A5203Nr_colnom, P08476_n5203Nr_colnom,
            P08476_A5201Nr_artcod, P08476_n5201Nr_artcod, P08476_A5200Nr_refcli, P08476_n5200Nr_refcli, P08476_A5199Nr_albent, P08476_n5199Nr_albent, P08476_A5341Nr_CliNom, P08476_n5341Nr_CliNom, P08476_A5340Nr_CliCod, P08476_n5340Nr_CliCod,
            P08476_A5206Nr_albrecc, P08476_n5206Nr_albrecc, P08476_A5198Nr_codigo, P08476_A396EmprCod
            }
            , new Object[] {
            P08477_A5203Nr_colnom, P08477_n5203Nr_colnom, P08477_A5210Nr_barcod, P08477_n5210Nr_barcod, P08477_A5217Nr_fecent, P08477_n5217Nr_fecent, P08477_A5216Nr_fecreg, P08477_n5216Nr_fecreg, P08477_A5215Nr_user, P08477_n5215Nr_user,
            P08477_A5214Nr_local, P08477_n5214Nr_local, P08477_A12235Nr_NAlb, P08477_n12235Nr_NAlb, P08477_A5224Nr_barpara, P08477_n5224Nr_barpara, P08477_A5223Nr_barreoa, P08477_n5223Nr_barreoa, P08477_A5222Nr_barcoda, P08477_n5222Nr_barcoda,
            P08477_A5209Nr_unidad, P08477_n5209Nr_unidad, P08477_A5208Nr_unidade, P08477_n5208Nr_unidade, P08477_A5207Nr_piezas, P08477_n5207Nr_piezas, P08477_A5204Nr_colnum, P08477_n5204Nr_colnum, P08477_A5202Nr_artdsc, P08477_n5202Nr_artdsc,
            P08477_A5201Nr_artcod, P08477_n5201Nr_artcod, P08477_A5200Nr_refcli, P08477_n5200Nr_refcli, P08477_A5199Nr_albent, P08477_n5199Nr_albent, P08477_A5341Nr_CliNom, P08477_n5341Nr_CliNom, P08477_A5340Nr_CliCod, P08477_n5340Nr_CliCod,
            P08477_A5206Nr_albrecc, P08477_n5206Nr_albrecc, P08477_A5198Nr_codigo, P08477_A396EmprCod
            }
            , new Object[] {
            P08478_A5209Nr_unidad, P08478_n5209Nr_unidad, P08478_A5210Nr_barcod, P08478_n5210Nr_barcod, P08478_A5217Nr_fecent, P08478_n5217Nr_fecent, P08478_A5216Nr_fecreg, P08478_n5216Nr_fecreg, P08478_A5215Nr_user, P08478_n5215Nr_user,
            P08478_A5214Nr_local, P08478_n5214Nr_local, P08478_A12235Nr_NAlb, P08478_n12235Nr_NAlb, P08478_A5224Nr_barpara, P08478_n5224Nr_barpara, P08478_A5223Nr_barreoa, P08478_n5223Nr_barreoa, P08478_A5222Nr_barcoda, P08478_n5222Nr_barcoda,
            P08478_A5208Nr_unidade, P08478_n5208Nr_unidade, P08478_A5207Nr_piezas, P08478_n5207Nr_piezas, P08478_A5204Nr_colnum, P08478_n5204Nr_colnum, P08478_A5203Nr_colnom, P08478_n5203Nr_colnom, P08478_A5202Nr_artdsc, P08478_n5202Nr_artdsc,
            P08478_A5201Nr_artcod, P08478_n5201Nr_artcod, P08478_A5200Nr_refcli, P08478_n5200Nr_refcli, P08478_A5199Nr_albent, P08478_n5199Nr_albent, P08478_A5341Nr_CliNom, P08478_n5341Nr_CliNom, P08478_A5340Nr_CliCod, P08478_n5340Nr_CliCod,
            P08478_A5206Nr_albrecc, P08478_n5206Nr_albrecc, P08478_A5198Nr_codigo, P08478_A396EmprCod
            }
            , new Object[] {
            P08479_A5224Nr_barpara, P08479_n5224Nr_barpara, P08479_A5210Nr_barcod, P08479_n5210Nr_barcod, P08479_A5217Nr_fecent, P08479_n5217Nr_fecent, P08479_A5216Nr_fecreg, P08479_n5216Nr_fecreg, P08479_A5215Nr_user, P08479_n5215Nr_user,
            P08479_A5214Nr_local, P08479_n5214Nr_local, P08479_A12235Nr_NAlb, P08479_n12235Nr_NAlb, P08479_A5223Nr_barreoa, P08479_n5223Nr_barreoa, P08479_A5222Nr_barcoda, P08479_n5222Nr_barcoda, P08479_A5209Nr_unidad, P08479_n5209Nr_unidad,
            P08479_A5208Nr_unidade, P08479_n5208Nr_unidade, P08479_A5207Nr_piezas, P08479_n5207Nr_piezas, P08479_A5204Nr_colnum, P08479_n5204Nr_colnum, P08479_A5203Nr_colnom, P08479_n5203Nr_colnom, P08479_A5202Nr_artdsc, P08479_n5202Nr_artdsc,
            P08479_A5201Nr_artcod, P08479_n5201Nr_artcod, P08479_A5200Nr_refcli, P08479_n5200Nr_refcli, P08479_A5199Nr_albent, P08479_n5199Nr_albent, P08479_A5341Nr_CliNom, P08479_n5341Nr_CliNom, P08479_A5340Nr_CliCod, P08479_n5340Nr_CliCod,
            P08479_A5206Nr_albrecc, P08479_n5206Nr_albrecc, P08479_A5198Nr_codigo, P08479_A396EmprCod
            }
            , new Object[] {
            P084710_A5214Nr_local, P084710_n5214Nr_local, P084710_A5210Nr_barcod, P084710_n5210Nr_barcod, P084710_A5217Nr_fecent, P084710_n5217Nr_fecent, P084710_A5216Nr_fecreg, P084710_n5216Nr_fecreg, P084710_A5215Nr_user, P084710_n5215Nr_user,
            P084710_A12235Nr_NAlb, P084710_n12235Nr_NAlb, P084710_A5224Nr_barpara, P084710_n5224Nr_barpara, P084710_A5223Nr_barreoa, P084710_n5223Nr_barreoa, P084710_A5222Nr_barcoda, P084710_n5222Nr_barcoda, P084710_A5209Nr_unidad, P084710_n5209Nr_unidad,
            P084710_A5208Nr_unidade, P084710_n5208Nr_unidade, P084710_A5207Nr_piezas, P084710_n5207Nr_piezas, P084710_A5204Nr_colnum, P084710_n5204Nr_colnum, P084710_A5203Nr_colnom, P084710_n5203Nr_colnom, P084710_A5202Nr_artdsc, P084710_n5202Nr_artdsc,
            P084710_A5201Nr_artcod, P084710_n5201Nr_artcod, P084710_A5200Nr_refcli, P084710_n5200Nr_refcli, P084710_A5199Nr_albent, P084710_n5199Nr_albent, P084710_A5341Nr_CliNom, P084710_n5341Nr_CliNom, P084710_A5340Nr_CliCod, P084710_n5340Nr_CliCod,
            P084710_A5206Nr_albrecc, P084710_n5206Nr_albrecc, P084710_A5198Nr_codigo, P084710_A396EmprCod
            }
            , new Object[] {
            P084711_A5215Nr_user, P084711_n5215Nr_user, P084711_A5210Nr_barcod, P084711_n5210Nr_barcod, P084711_A5217Nr_fecent, P084711_n5217Nr_fecent, P084711_A5216Nr_fecreg, P084711_n5216Nr_fecreg, P084711_A5214Nr_local, P084711_n5214Nr_local,
            P084711_A12235Nr_NAlb, P084711_n12235Nr_NAlb, P084711_A5224Nr_barpara, P084711_n5224Nr_barpara, P084711_A5223Nr_barreoa, P084711_n5223Nr_barreoa, P084711_A5222Nr_barcoda, P084711_n5222Nr_barcoda, P084711_A5209Nr_unidad, P084711_n5209Nr_unidad,
            P084711_A5208Nr_unidade, P084711_n5208Nr_unidade, P084711_A5207Nr_piezas, P084711_n5207Nr_piezas, P084711_A5204Nr_colnum, P084711_n5204Nr_colnum, P084711_A5203Nr_colnom, P084711_n5203Nr_colnom, P084711_A5202Nr_artdsc, P084711_n5202Nr_artdsc,
            P084711_A5201Nr_artcod, P084711_n5201Nr_artcod, P084711_A5200Nr_refcli, P084711_n5200Nr_refcli, P084711_A5199Nr_albent, P084711_n5199Nr_albent, P084711_A5341Nr_CliNom, P084711_n5341Nr_CliNom, P084711_A5340Nr_CliCod, P084711_n5340Nr_CliCod,
            P084711_A5206Nr_albrecc, P084711_n5206Nr_albrecc, P084711_A5198Nr_codigo, P084711_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38TFNr_barreoa ;
   private byte AV39TFNr_barreoa_To ;
   private byte AV120Tnotrecwwds_30_tfnr_barreoa ;
   private byte AV121Tnotrecwwds_31_tfnr_barreoa_to ;
   private byte A5223Nr_barreoa ;
   private short Gx_err ;
   private int AV89GXV1 ;
   private int AV10TFNr_codigo ;
   private int AV11TFNr_codigo_To ;
   private int AV12TFNr_albreccod ;
   private int AV13TFNr_albreccod_To ;
   private int AV14TFNr_CliCod ;
   private int AV15TFNr_CliCod_To ;
   private int AV28TFNr_colnum ;
   private int AV29TFNr_colnum_To ;
   private int AV30TFNr_piezas ;
   private int AV31TFNr_piezas_To ;
   private int AV36TFNr_barcoda ;
   private int AV37TFNr_barcoda_To ;
   private int AV52TFNr_barcod ;
   private int AV53TFNr_barcod_To ;
   private int AV92Tnotrecwwds_2_tfnr_codigo ;
   private int AV93Tnotrecwwds_3_tfnr_codigo_to ;
   private int AV94Tnotrecwwds_4_tfnr_albreccod ;
   private int AV95Tnotrecwwds_5_tfnr_albreccod_to ;
   private int AV96Tnotrecwwds_6_tfnr_clicod ;
   private int AV97Tnotrecwwds_7_tfnr_clicod_to ;
   private int AV110Tnotrecwwds_20_tfnr_colnum ;
   private int AV111Tnotrecwwds_21_tfnr_colnum_to ;
   private int AV112Tnotrecwwds_22_tfnr_piezas ;
   private int AV113Tnotrecwwds_23_tfnr_piezas_to ;
   private int AV118Tnotrecwwds_28_tfnr_barcoda ;
   private int AV119Tnotrecwwds_29_tfnr_barcoda_to ;
   private int AV132Tnotrecwwds_42_tfnr_barcod ;
   private int AV133Tnotrecwwds_43_tfnr_barcod_to ;
   private int A5198Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5204Nr_colnum ;
   private int A5207Nr_piezas ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private long AV42TFNr_NAlb ;
   private long AV43TFNr_NAlb_To ;
   private long AV124Tnotrecwwds_34_tfnr_nalb ;
   private long AV125Tnotrecwwds_35_tfnr_nalb_to ;
   private long A12235Nr_NAlb ;
   private long AV66count ;
   private java.math.BigDecimal AV32TFNr_unidades ;
   private java.math.BigDecimal AV33TFNr_unidades_To ;
   private java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ;
   private java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ;
   private java.math.BigDecimal A5208Nr_unidade ;
   private String AV16TFNr_CliNom ;
   private String AV17TFNr_CliNom_Sel ;
   private String AV18TFNr_albent ;
   private String AV19TFNr_albent_Sel ;
   private String AV20TFNr_refcli ;
   private String AV21TFNr_refcli_Sel ;
   private String AV22TFNr_artcod ;
   private String AV23TFNr_artcod_Sel ;
   private String AV24TFNr_artdsc ;
   private String AV25TFNr_artdsc_Sel ;
   private String AV26TFNr_colnom ;
   private String AV27TFNr_colnom_Sel ;
   private String AV34TFNr_unidad ;
   private String AV35TFNr_unidad_Sel ;
   private String AV40TFNr_barpara ;
   private String AV41TFNr_barpara_Sel ;
   private String AV44TFNr_local ;
   private String AV45TFNr_local_Sel ;
   private String AV46TFNr_user ;
   private String AV47TFNr_user_Sel ;
   private String A5341Nr_CliNom ;
   private String AV98Tnotrecwwds_8_tfnr_clinom ;
   private String AV99Tnotrecwwds_9_tfnr_clinom_sel ;
   private String AV100Tnotrecwwds_10_tfnr_albent ;
   private String AV101Tnotrecwwds_11_tfnr_albent_sel ;
   private String AV102Tnotrecwwds_12_tfnr_refcli ;
   private String AV103Tnotrecwwds_13_tfnr_refcli_sel ;
   private String AV104Tnotrecwwds_14_tfnr_artcod ;
   private String AV105Tnotrecwwds_15_tfnr_artcod_sel ;
   private String AV106Tnotrecwwds_16_tfnr_artdsc ;
   private String AV107Tnotrecwwds_17_tfnr_artdsc_sel ;
   private String AV108Tnotrecwwds_18_tfnr_colnom ;
   private String AV109Tnotrecwwds_19_tfnr_colnom_sel ;
   private String AV116Tnotrecwwds_26_tfnr_unidad ;
   private String AV117Tnotrecwwds_27_tfnr_unidad_sel ;
   private String AV122Tnotrecwwds_32_tfnr_barpara ;
   private String AV123Tnotrecwwds_33_tfnr_barpara_sel ;
   private String AV126Tnotrecwwds_36_tfnr_local ;
   private String AV127Tnotrecwwds_37_tfnr_local_sel ;
   private String AV128Tnotrecwwds_38_tfnr_user ;
   private String AV129Tnotrecwwds_39_tfnr_user_sel ;
   private String scmdbuf ;
   private String lV98Tnotrecwwds_8_tfnr_clinom ;
   private String lV100Tnotrecwwds_10_tfnr_albent ;
   private String lV102Tnotrecwwds_12_tfnr_refcli ;
   private String lV104Tnotrecwwds_14_tfnr_artcod ;
   private String lV106Tnotrecwwds_16_tfnr_artdsc ;
   private String lV108Tnotrecwwds_18_tfnr_colnom ;
   private String lV116Tnotrecwwds_26_tfnr_unidad ;
   private String lV122Tnotrecwwds_32_tfnr_barpara ;
   private String lV126Tnotrecwwds_36_tfnr_local ;
   private String lV128Tnotrecwwds_38_tfnr_user ;
   private String A5199Nr_albent ;
   private String A5200Nr_refcli ;
   private String A5201Nr_artcod ;
   private String A5202Nr_artdsc ;
   private String A5203Nr_colnom ;
   private String A5209Nr_unidad ;
   private String A5224Nr_barpara ;
   private String A5214Nr_local ;
   private String A5215Nr_user ;
   private String A396EmprCod ;
   private java.util.Date AV48TFNr_fecreg ;
   private java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date AV50TFNr_fecent ;
   private java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ;
   private java.util.Date A5217Nr_fecent ;
   private boolean returnInSub ;
   private boolean brk8472 ;
   private boolean n5341Nr_CliNom ;
   private boolean n5210Nr_barcod ;
   private boolean n5217Nr_fecent ;
   private boolean n5216Nr_fecreg ;
   private boolean n5215Nr_user ;
   private boolean n5214Nr_local ;
   private boolean n12235Nr_NAlb ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n5209Nr_unidad ;
   private boolean n5208Nr_unidade ;
   private boolean n5207Nr_piezas ;
   private boolean n5204Nr_colnum ;
   private boolean n5203Nr_colnom ;
   private boolean n5202Nr_artdsc ;
   private boolean n5201Nr_artcod ;
   private boolean n5200Nr_refcli ;
   private boolean n5199Nr_albent ;
   private boolean n5340Nr_CliCod ;
   private boolean n5206Nr_albrecc ;
   private boolean brk8474 ;
   private boolean brk8476 ;
   private boolean brk8478 ;
   private boolean brk84710 ;
   private boolean brk84712 ;
   private boolean brk84714 ;
   private boolean brk84716 ;
   private boolean brk84718 ;
   private boolean brk84720 ;
   private String AV60OptionsJson ;
   private String AV63OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV56DDOName ;
   private String AV54SearchTxt ;
   private String AV55SearchTxtTo ;
   private String AV86FilterFullText ;
   private String AV91Tnotrecwwds_1_filterfulltext ;
   private String lV91Tnotrecwwds_1_filterfulltext ;
   private String AV58Option ;
   private String AV61OptionDesc ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08472_A5341Nr_CliNom ;
   private boolean[] P08472_n5341Nr_CliNom ;
   private int[] P08472_A5210Nr_barcod ;
   private boolean[] P08472_n5210Nr_barcod ;
   private java.util.Date[] P08472_A5217Nr_fecent ;
   private boolean[] P08472_n5217Nr_fecent ;
   private java.util.Date[] P08472_A5216Nr_fecreg ;
   private boolean[] P08472_n5216Nr_fecreg ;
   private String[] P08472_A5215Nr_user ;
   private boolean[] P08472_n5215Nr_user ;
   private String[] P08472_A5214Nr_local ;
   private boolean[] P08472_n5214Nr_local ;
   private long[] P08472_A12235Nr_NAlb ;
   private boolean[] P08472_n12235Nr_NAlb ;
   private String[] P08472_A5224Nr_barpara ;
   private boolean[] P08472_n5224Nr_barpara ;
   private byte[] P08472_A5223Nr_barreoa ;
   private boolean[] P08472_n5223Nr_barreoa ;
   private int[] P08472_A5222Nr_barcoda ;
   private boolean[] P08472_n5222Nr_barcoda ;
   private String[] P08472_A5209Nr_unidad ;
   private boolean[] P08472_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08472_A5208Nr_unidade ;
   private boolean[] P08472_n5208Nr_unidade ;
   private int[] P08472_A5207Nr_piezas ;
   private boolean[] P08472_n5207Nr_piezas ;
   private int[] P08472_A5204Nr_colnum ;
   private boolean[] P08472_n5204Nr_colnum ;
   private String[] P08472_A5203Nr_colnom ;
   private boolean[] P08472_n5203Nr_colnom ;
   private String[] P08472_A5202Nr_artdsc ;
   private boolean[] P08472_n5202Nr_artdsc ;
   private String[] P08472_A5201Nr_artcod ;
   private boolean[] P08472_n5201Nr_artcod ;
   private String[] P08472_A5200Nr_refcli ;
   private boolean[] P08472_n5200Nr_refcli ;
   private String[] P08472_A5199Nr_albent ;
   private boolean[] P08472_n5199Nr_albent ;
   private int[] P08472_A5340Nr_CliCod ;
   private boolean[] P08472_n5340Nr_CliCod ;
   private int[] P08472_A5206Nr_albrecc ;
   private boolean[] P08472_n5206Nr_albrecc ;
   private int[] P08472_A5198Nr_codigo ;
   private String[] P08472_A396EmprCod ;
   private String[] P08473_A5199Nr_albent ;
   private boolean[] P08473_n5199Nr_albent ;
   private int[] P08473_A5210Nr_barcod ;
   private boolean[] P08473_n5210Nr_barcod ;
   private java.util.Date[] P08473_A5217Nr_fecent ;
   private boolean[] P08473_n5217Nr_fecent ;
   private java.util.Date[] P08473_A5216Nr_fecreg ;
   private boolean[] P08473_n5216Nr_fecreg ;
   private String[] P08473_A5215Nr_user ;
   private boolean[] P08473_n5215Nr_user ;
   private String[] P08473_A5214Nr_local ;
   private boolean[] P08473_n5214Nr_local ;
   private long[] P08473_A12235Nr_NAlb ;
   private boolean[] P08473_n12235Nr_NAlb ;
   private String[] P08473_A5224Nr_barpara ;
   private boolean[] P08473_n5224Nr_barpara ;
   private byte[] P08473_A5223Nr_barreoa ;
   private boolean[] P08473_n5223Nr_barreoa ;
   private int[] P08473_A5222Nr_barcoda ;
   private boolean[] P08473_n5222Nr_barcoda ;
   private String[] P08473_A5209Nr_unidad ;
   private boolean[] P08473_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08473_A5208Nr_unidade ;
   private boolean[] P08473_n5208Nr_unidade ;
   private int[] P08473_A5207Nr_piezas ;
   private boolean[] P08473_n5207Nr_piezas ;
   private int[] P08473_A5204Nr_colnum ;
   private boolean[] P08473_n5204Nr_colnum ;
   private String[] P08473_A5203Nr_colnom ;
   private boolean[] P08473_n5203Nr_colnom ;
   private String[] P08473_A5202Nr_artdsc ;
   private boolean[] P08473_n5202Nr_artdsc ;
   private String[] P08473_A5201Nr_artcod ;
   private boolean[] P08473_n5201Nr_artcod ;
   private String[] P08473_A5200Nr_refcli ;
   private boolean[] P08473_n5200Nr_refcli ;
   private String[] P08473_A5341Nr_CliNom ;
   private boolean[] P08473_n5341Nr_CliNom ;
   private int[] P08473_A5340Nr_CliCod ;
   private boolean[] P08473_n5340Nr_CliCod ;
   private int[] P08473_A5206Nr_albrecc ;
   private boolean[] P08473_n5206Nr_albrecc ;
   private int[] P08473_A5198Nr_codigo ;
   private String[] P08473_A396EmprCod ;
   private String[] P08474_A5200Nr_refcli ;
   private boolean[] P08474_n5200Nr_refcli ;
   private int[] P08474_A5210Nr_barcod ;
   private boolean[] P08474_n5210Nr_barcod ;
   private java.util.Date[] P08474_A5217Nr_fecent ;
   private boolean[] P08474_n5217Nr_fecent ;
   private java.util.Date[] P08474_A5216Nr_fecreg ;
   private boolean[] P08474_n5216Nr_fecreg ;
   private String[] P08474_A5215Nr_user ;
   private boolean[] P08474_n5215Nr_user ;
   private String[] P08474_A5214Nr_local ;
   private boolean[] P08474_n5214Nr_local ;
   private long[] P08474_A12235Nr_NAlb ;
   private boolean[] P08474_n12235Nr_NAlb ;
   private String[] P08474_A5224Nr_barpara ;
   private boolean[] P08474_n5224Nr_barpara ;
   private byte[] P08474_A5223Nr_barreoa ;
   private boolean[] P08474_n5223Nr_barreoa ;
   private int[] P08474_A5222Nr_barcoda ;
   private boolean[] P08474_n5222Nr_barcoda ;
   private String[] P08474_A5209Nr_unidad ;
   private boolean[] P08474_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08474_A5208Nr_unidade ;
   private boolean[] P08474_n5208Nr_unidade ;
   private int[] P08474_A5207Nr_piezas ;
   private boolean[] P08474_n5207Nr_piezas ;
   private int[] P08474_A5204Nr_colnum ;
   private boolean[] P08474_n5204Nr_colnum ;
   private String[] P08474_A5203Nr_colnom ;
   private boolean[] P08474_n5203Nr_colnom ;
   private String[] P08474_A5202Nr_artdsc ;
   private boolean[] P08474_n5202Nr_artdsc ;
   private String[] P08474_A5201Nr_artcod ;
   private boolean[] P08474_n5201Nr_artcod ;
   private String[] P08474_A5199Nr_albent ;
   private boolean[] P08474_n5199Nr_albent ;
   private String[] P08474_A5341Nr_CliNom ;
   private boolean[] P08474_n5341Nr_CliNom ;
   private int[] P08474_A5340Nr_CliCod ;
   private boolean[] P08474_n5340Nr_CliCod ;
   private int[] P08474_A5206Nr_albrecc ;
   private boolean[] P08474_n5206Nr_albrecc ;
   private int[] P08474_A5198Nr_codigo ;
   private String[] P08474_A396EmprCod ;
   private String[] P08475_A5201Nr_artcod ;
   private boolean[] P08475_n5201Nr_artcod ;
   private int[] P08475_A5210Nr_barcod ;
   private boolean[] P08475_n5210Nr_barcod ;
   private java.util.Date[] P08475_A5217Nr_fecent ;
   private boolean[] P08475_n5217Nr_fecent ;
   private java.util.Date[] P08475_A5216Nr_fecreg ;
   private boolean[] P08475_n5216Nr_fecreg ;
   private String[] P08475_A5215Nr_user ;
   private boolean[] P08475_n5215Nr_user ;
   private String[] P08475_A5214Nr_local ;
   private boolean[] P08475_n5214Nr_local ;
   private long[] P08475_A12235Nr_NAlb ;
   private boolean[] P08475_n12235Nr_NAlb ;
   private String[] P08475_A5224Nr_barpara ;
   private boolean[] P08475_n5224Nr_barpara ;
   private byte[] P08475_A5223Nr_barreoa ;
   private boolean[] P08475_n5223Nr_barreoa ;
   private int[] P08475_A5222Nr_barcoda ;
   private boolean[] P08475_n5222Nr_barcoda ;
   private String[] P08475_A5209Nr_unidad ;
   private boolean[] P08475_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08475_A5208Nr_unidade ;
   private boolean[] P08475_n5208Nr_unidade ;
   private int[] P08475_A5207Nr_piezas ;
   private boolean[] P08475_n5207Nr_piezas ;
   private int[] P08475_A5204Nr_colnum ;
   private boolean[] P08475_n5204Nr_colnum ;
   private String[] P08475_A5203Nr_colnom ;
   private boolean[] P08475_n5203Nr_colnom ;
   private String[] P08475_A5202Nr_artdsc ;
   private boolean[] P08475_n5202Nr_artdsc ;
   private String[] P08475_A5200Nr_refcli ;
   private boolean[] P08475_n5200Nr_refcli ;
   private String[] P08475_A5199Nr_albent ;
   private boolean[] P08475_n5199Nr_albent ;
   private String[] P08475_A5341Nr_CliNom ;
   private boolean[] P08475_n5341Nr_CliNom ;
   private int[] P08475_A5340Nr_CliCod ;
   private boolean[] P08475_n5340Nr_CliCod ;
   private int[] P08475_A5206Nr_albrecc ;
   private boolean[] P08475_n5206Nr_albrecc ;
   private int[] P08475_A5198Nr_codigo ;
   private String[] P08475_A396EmprCod ;
   private String[] P08476_A5202Nr_artdsc ;
   private boolean[] P08476_n5202Nr_artdsc ;
   private int[] P08476_A5210Nr_barcod ;
   private boolean[] P08476_n5210Nr_barcod ;
   private java.util.Date[] P08476_A5217Nr_fecent ;
   private boolean[] P08476_n5217Nr_fecent ;
   private java.util.Date[] P08476_A5216Nr_fecreg ;
   private boolean[] P08476_n5216Nr_fecreg ;
   private String[] P08476_A5215Nr_user ;
   private boolean[] P08476_n5215Nr_user ;
   private String[] P08476_A5214Nr_local ;
   private boolean[] P08476_n5214Nr_local ;
   private long[] P08476_A12235Nr_NAlb ;
   private boolean[] P08476_n12235Nr_NAlb ;
   private String[] P08476_A5224Nr_barpara ;
   private boolean[] P08476_n5224Nr_barpara ;
   private byte[] P08476_A5223Nr_barreoa ;
   private boolean[] P08476_n5223Nr_barreoa ;
   private int[] P08476_A5222Nr_barcoda ;
   private boolean[] P08476_n5222Nr_barcoda ;
   private String[] P08476_A5209Nr_unidad ;
   private boolean[] P08476_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08476_A5208Nr_unidade ;
   private boolean[] P08476_n5208Nr_unidade ;
   private int[] P08476_A5207Nr_piezas ;
   private boolean[] P08476_n5207Nr_piezas ;
   private int[] P08476_A5204Nr_colnum ;
   private boolean[] P08476_n5204Nr_colnum ;
   private String[] P08476_A5203Nr_colnom ;
   private boolean[] P08476_n5203Nr_colnom ;
   private String[] P08476_A5201Nr_artcod ;
   private boolean[] P08476_n5201Nr_artcod ;
   private String[] P08476_A5200Nr_refcli ;
   private boolean[] P08476_n5200Nr_refcli ;
   private String[] P08476_A5199Nr_albent ;
   private boolean[] P08476_n5199Nr_albent ;
   private String[] P08476_A5341Nr_CliNom ;
   private boolean[] P08476_n5341Nr_CliNom ;
   private int[] P08476_A5340Nr_CliCod ;
   private boolean[] P08476_n5340Nr_CliCod ;
   private int[] P08476_A5206Nr_albrecc ;
   private boolean[] P08476_n5206Nr_albrecc ;
   private int[] P08476_A5198Nr_codigo ;
   private String[] P08476_A396EmprCod ;
   private String[] P08477_A5203Nr_colnom ;
   private boolean[] P08477_n5203Nr_colnom ;
   private int[] P08477_A5210Nr_barcod ;
   private boolean[] P08477_n5210Nr_barcod ;
   private java.util.Date[] P08477_A5217Nr_fecent ;
   private boolean[] P08477_n5217Nr_fecent ;
   private java.util.Date[] P08477_A5216Nr_fecreg ;
   private boolean[] P08477_n5216Nr_fecreg ;
   private String[] P08477_A5215Nr_user ;
   private boolean[] P08477_n5215Nr_user ;
   private String[] P08477_A5214Nr_local ;
   private boolean[] P08477_n5214Nr_local ;
   private long[] P08477_A12235Nr_NAlb ;
   private boolean[] P08477_n12235Nr_NAlb ;
   private String[] P08477_A5224Nr_barpara ;
   private boolean[] P08477_n5224Nr_barpara ;
   private byte[] P08477_A5223Nr_barreoa ;
   private boolean[] P08477_n5223Nr_barreoa ;
   private int[] P08477_A5222Nr_barcoda ;
   private boolean[] P08477_n5222Nr_barcoda ;
   private String[] P08477_A5209Nr_unidad ;
   private boolean[] P08477_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08477_A5208Nr_unidade ;
   private boolean[] P08477_n5208Nr_unidade ;
   private int[] P08477_A5207Nr_piezas ;
   private boolean[] P08477_n5207Nr_piezas ;
   private int[] P08477_A5204Nr_colnum ;
   private boolean[] P08477_n5204Nr_colnum ;
   private String[] P08477_A5202Nr_artdsc ;
   private boolean[] P08477_n5202Nr_artdsc ;
   private String[] P08477_A5201Nr_artcod ;
   private boolean[] P08477_n5201Nr_artcod ;
   private String[] P08477_A5200Nr_refcli ;
   private boolean[] P08477_n5200Nr_refcli ;
   private String[] P08477_A5199Nr_albent ;
   private boolean[] P08477_n5199Nr_albent ;
   private String[] P08477_A5341Nr_CliNom ;
   private boolean[] P08477_n5341Nr_CliNom ;
   private int[] P08477_A5340Nr_CliCod ;
   private boolean[] P08477_n5340Nr_CliCod ;
   private int[] P08477_A5206Nr_albrecc ;
   private boolean[] P08477_n5206Nr_albrecc ;
   private int[] P08477_A5198Nr_codigo ;
   private String[] P08477_A396EmprCod ;
   private String[] P08478_A5209Nr_unidad ;
   private boolean[] P08478_n5209Nr_unidad ;
   private int[] P08478_A5210Nr_barcod ;
   private boolean[] P08478_n5210Nr_barcod ;
   private java.util.Date[] P08478_A5217Nr_fecent ;
   private boolean[] P08478_n5217Nr_fecent ;
   private java.util.Date[] P08478_A5216Nr_fecreg ;
   private boolean[] P08478_n5216Nr_fecreg ;
   private String[] P08478_A5215Nr_user ;
   private boolean[] P08478_n5215Nr_user ;
   private String[] P08478_A5214Nr_local ;
   private boolean[] P08478_n5214Nr_local ;
   private long[] P08478_A12235Nr_NAlb ;
   private boolean[] P08478_n12235Nr_NAlb ;
   private String[] P08478_A5224Nr_barpara ;
   private boolean[] P08478_n5224Nr_barpara ;
   private byte[] P08478_A5223Nr_barreoa ;
   private boolean[] P08478_n5223Nr_barreoa ;
   private int[] P08478_A5222Nr_barcoda ;
   private boolean[] P08478_n5222Nr_barcoda ;
   private java.math.BigDecimal[] P08478_A5208Nr_unidade ;
   private boolean[] P08478_n5208Nr_unidade ;
   private int[] P08478_A5207Nr_piezas ;
   private boolean[] P08478_n5207Nr_piezas ;
   private int[] P08478_A5204Nr_colnum ;
   private boolean[] P08478_n5204Nr_colnum ;
   private String[] P08478_A5203Nr_colnom ;
   private boolean[] P08478_n5203Nr_colnom ;
   private String[] P08478_A5202Nr_artdsc ;
   private boolean[] P08478_n5202Nr_artdsc ;
   private String[] P08478_A5201Nr_artcod ;
   private boolean[] P08478_n5201Nr_artcod ;
   private String[] P08478_A5200Nr_refcli ;
   private boolean[] P08478_n5200Nr_refcli ;
   private String[] P08478_A5199Nr_albent ;
   private boolean[] P08478_n5199Nr_albent ;
   private String[] P08478_A5341Nr_CliNom ;
   private boolean[] P08478_n5341Nr_CliNom ;
   private int[] P08478_A5340Nr_CliCod ;
   private boolean[] P08478_n5340Nr_CliCod ;
   private int[] P08478_A5206Nr_albrecc ;
   private boolean[] P08478_n5206Nr_albrecc ;
   private int[] P08478_A5198Nr_codigo ;
   private String[] P08478_A396EmprCod ;
   private String[] P08479_A5224Nr_barpara ;
   private boolean[] P08479_n5224Nr_barpara ;
   private int[] P08479_A5210Nr_barcod ;
   private boolean[] P08479_n5210Nr_barcod ;
   private java.util.Date[] P08479_A5217Nr_fecent ;
   private boolean[] P08479_n5217Nr_fecent ;
   private java.util.Date[] P08479_A5216Nr_fecreg ;
   private boolean[] P08479_n5216Nr_fecreg ;
   private String[] P08479_A5215Nr_user ;
   private boolean[] P08479_n5215Nr_user ;
   private String[] P08479_A5214Nr_local ;
   private boolean[] P08479_n5214Nr_local ;
   private long[] P08479_A12235Nr_NAlb ;
   private boolean[] P08479_n12235Nr_NAlb ;
   private byte[] P08479_A5223Nr_barreoa ;
   private boolean[] P08479_n5223Nr_barreoa ;
   private int[] P08479_A5222Nr_barcoda ;
   private boolean[] P08479_n5222Nr_barcoda ;
   private String[] P08479_A5209Nr_unidad ;
   private boolean[] P08479_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08479_A5208Nr_unidade ;
   private boolean[] P08479_n5208Nr_unidade ;
   private int[] P08479_A5207Nr_piezas ;
   private boolean[] P08479_n5207Nr_piezas ;
   private int[] P08479_A5204Nr_colnum ;
   private boolean[] P08479_n5204Nr_colnum ;
   private String[] P08479_A5203Nr_colnom ;
   private boolean[] P08479_n5203Nr_colnom ;
   private String[] P08479_A5202Nr_artdsc ;
   private boolean[] P08479_n5202Nr_artdsc ;
   private String[] P08479_A5201Nr_artcod ;
   private boolean[] P08479_n5201Nr_artcod ;
   private String[] P08479_A5200Nr_refcli ;
   private boolean[] P08479_n5200Nr_refcli ;
   private String[] P08479_A5199Nr_albent ;
   private boolean[] P08479_n5199Nr_albent ;
   private String[] P08479_A5341Nr_CliNom ;
   private boolean[] P08479_n5341Nr_CliNom ;
   private int[] P08479_A5340Nr_CliCod ;
   private boolean[] P08479_n5340Nr_CliCod ;
   private int[] P08479_A5206Nr_albrecc ;
   private boolean[] P08479_n5206Nr_albrecc ;
   private int[] P08479_A5198Nr_codigo ;
   private String[] P08479_A396EmprCod ;
   private String[] P084710_A5214Nr_local ;
   private boolean[] P084710_n5214Nr_local ;
   private int[] P084710_A5210Nr_barcod ;
   private boolean[] P084710_n5210Nr_barcod ;
   private java.util.Date[] P084710_A5217Nr_fecent ;
   private boolean[] P084710_n5217Nr_fecent ;
   private java.util.Date[] P084710_A5216Nr_fecreg ;
   private boolean[] P084710_n5216Nr_fecreg ;
   private String[] P084710_A5215Nr_user ;
   private boolean[] P084710_n5215Nr_user ;
   private long[] P084710_A12235Nr_NAlb ;
   private boolean[] P084710_n12235Nr_NAlb ;
   private String[] P084710_A5224Nr_barpara ;
   private boolean[] P084710_n5224Nr_barpara ;
   private byte[] P084710_A5223Nr_barreoa ;
   private boolean[] P084710_n5223Nr_barreoa ;
   private int[] P084710_A5222Nr_barcoda ;
   private boolean[] P084710_n5222Nr_barcoda ;
   private String[] P084710_A5209Nr_unidad ;
   private boolean[] P084710_n5209Nr_unidad ;
   private java.math.BigDecimal[] P084710_A5208Nr_unidade ;
   private boolean[] P084710_n5208Nr_unidade ;
   private int[] P084710_A5207Nr_piezas ;
   private boolean[] P084710_n5207Nr_piezas ;
   private int[] P084710_A5204Nr_colnum ;
   private boolean[] P084710_n5204Nr_colnum ;
   private String[] P084710_A5203Nr_colnom ;
   private boolean[] P084710_n5203Nr_colnom ;
   private String[] P084710_A5202Nr_artdsc ;
   private boolean[] P084710_n5202Nr_artdsc ;
   private String[] P084710_A5201Nr_artcod ;
   private boolean[] P084710_n5201Nr_artcod ;
   private String[] P084710_A5200Nr_refcli ;
   private boolean[] P084710_n5200Nr_refcli ;
   private String[] P084710_A5199Nr_albent ;
   private boolean[] P084710_n5199Nr_albent ;
   private String[] P084710_A5341Nr_CliNom ;
   private boolean[] P084710_n5341Nr_CliNom ;
   private int[] P084710_A5340Nr_CliCod ;
   private boolean[] P084710_n5340Nr_CliCod ;
   private int[] P084710_A5206Nr_albrecc ;
   private boolean[] P084710_n5206Nr_albrecc ;
   private int[] P084710_A5198Nr_codigo ;
   private String[] P084710_A396EmprCod ;
   private String[] P084711_A5215Nr_user ;
   private boolean[] P084711_n5215Nr_user ;
   private int[] P084711_A5210Nr_barcod ;
   private boolean[] P084711_n5210Nr_barcod ;
   private java.util.Date[] P084711_A5217Nr_fecent ;
   private boolean[] P084711_n5217Nr_fecent ;
   private java.util.Date[] P084711_A5216Nr_fecreg ;
   private boolean[] P084711_n5216Nr_fecreg ;
   private String[] P084711_A5214Nr_local ;
   private boolean[] P084711_n5214Nr_local ;
   private long[] P084711_A12235Nr_NAlb ;
   private boolean[] P084711_n12235Nr_NAlb ;
   private String[] P084711_A5224Nr_barpara ;
   private boolean[] P084711_n5224Nr_barpara ;
   private byte[] P084711_A5223Nr_barreoa ;
   private boolean[] P084711_n5223Nr_barreoa ;
   private int[] P084711_A5222Nr_barcoda ;
   private boolean[] P084711_n5222Nr_barcoda ;
   private String[] P084711_A5209Nr_unidad ;
   private boolean[] P084711_n5209Nr_unidad ;
   private java.math.BigDecimal[] P084711_A5208Nr_unidade ;
   private boolean[] P084711_n5208Nr_unidade ;
   private int[] P084711_A5207Nr_piezas ;
   private boolean[] P084711_n5207Nr_piezas ;
   private int[] P084711_A5204Nr_colnum ;
   private boolean[] P084711_n5204Nr_colnum ;
   private String[] P084711_A5203Nr_colnom ;
   private boolean[] P084711_n5203Nr_colnom ;
   private String[] P084711_A5202Nr_artdsc ;
   private boolean[] P084711_n5202Nr_artdsc ;
   private String[] P084711_A5201Nr_artcod ;
   private boolean[] P084711_n5201Nr_artcod ;
   private String[] P084711_A5200Nr_refcli ;
   private boolean[] P084711_n5200Nr_refcli ;
   private String[] P084711_A5199Nr_albent ;
   private boolean[] P084711_n5199Nr_albent ;
   private String[] P084711_A5341Nr_CliNom ;
   private boolean[] P084711_n5341Nr_CliNom ;
   private int[] P084711_A5340Nr_CliCod ;
   private boolean[] P084711_n5340Nr_CliCod ;
   private int[] P084711_A5206Nr_albrecc ;
   private boolean[] P084711_n5206Nr_albrecc ;
   private int[] P084711_A5198Nr_codigo ;
   private String[] P084711_A396EmprCod ;
   private GXSimpleCollection<String> AV59Options ;
   private GXSimpleCollection<String> AV62OptionsDesc ;
   private GXSimpleCollection<String> AV64OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class tnotrecwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08472( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[62];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Nr_CliNom, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom," ;
      scmdbuf += " Nr_artdsc, Nr_artcod, Nr_refcli, Nr_albent, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
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
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08473( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[62];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT Nr_albent, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom," ;
      scmdbuf += " Nr_artdsc, Nr_artcod, Nr_refcli, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
         GXv_int4[18] = (byte)(1) ;
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int4[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int4[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int4[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int4[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int4[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int4[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int4[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int4[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_albent" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08474( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[62];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT Nr_refcli, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom," ;
      scmdbuf += " Nr_artdsc, Nr_artcod, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_refcli" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08475( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[62];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT Nr_artcod, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom," ;
      scmdbuf += " Nr_artdsc, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
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
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_artcod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08476( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[62];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT Nr_artdsc, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
         GXv_int10[12] = (byte)(1) ;
         GXv_int10[13] = (byte)(1) ;
         GXv_int10[14] = (byte)(1) ;
         GXv_int10[15] = (byte)(1) ;
         GXv_int10[16] = (byte)(1) ;
         GXv_int10[17] = (byte)(1) ;
         GXv_int10[18] = (byte)(1) ;
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_artdsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08477( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[62];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT Nr_colnom, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
         GXv_int12[10] = (byte)(1) ;
         GXv_int12[11] = (byte)(1) ;
         GXv_int12[12] = (byte)(1) ;
         GXv_int12[13] = (byte)(1) ;
         GXv_int12[14] = (byte)(1) ;
         GXv_int12[15] = (byte)(1) ;
         GXv_int12[16] = (byte)(1) ;
         GXv_int12[17] = (byte)(1) ;
         GXv_int12[18] = (byte)(1) ;
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int12[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int12[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int12[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int12[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int12[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int12[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_colnom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08478( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[62];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT Nr_unidad, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
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
         GXv_int14[16] = (byte)(1) ;
         GXv_int14[17] = (byte)(1) ;
         GXv_int14[18] = (byte)(1) ;
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_unidad" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08479( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Tnotrecwwds_1_filterfulltext ,
                                          int AV92Tnotrecwwds_2_tfnr_codigo ,
                                          int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV96Tnotrecwwds_6_tfnr_clicod ,
                                          int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV98Tnotrecwwds_8_tfnr_clinom ,
                                          String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV100Tnotrecwwds_10_tfnr_albent ,
                                          String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV102Tnotrecwwds_12_tfnr_refcli ,
                                          String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV104Tnotrecwwds_14_tfnr_artcod ,
                                          String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV108Tnotrecwwds_18_tfnr_colnom ,
                                          int AV110Tnotrecwwds_20_tfnr_colnum ,
                                          int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV112Tnotrecwwds_22_tfnr_piezas ,
                                          int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV116Tnotrecwwds_26_tfnr_unidad ,
                                          int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV122Tnotrecwwds_32_tfnr_barpara ,
                                          long AV124Tnotrecwwds_34_tfnr_nalb ,
                                          long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV126Tnotrecwwds_36_tfnr_local ,
                                          String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV128Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                          int AV132Tnotrecwwds_42_tfnr_barcod ,
                                          int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[62];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT Nr_barpara, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
         GXv_int16[15] = (byte)(1) ;
         GXv_int16[16] = (byte)(1) ;
         GXv_int16[17] = (byte)(1) ;
         GXv_int16[18] = (byte)(1) ;
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int16[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int16[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int16[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int16[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int16[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int16[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_barpara" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P084710( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV91Tnotrecwwds_1_filterfulltext ,
                                           int AV92Tnotrecwwds_2_tfnr_codigo ,
                                           int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                           int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                           int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                           int AV96Tnotrecwwds_6_tfnr_clicod ,
                                           int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                           String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           String AV98Tnotrecwwds_8_tfnr_clinom ,
                                           String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           String AV100Tnotrecwwds_10_tfnr_albent ,
                                           String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           String AV102Tnotrecwwds_12_tfnr_refcli ,
                                           String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           String AV104Tnotrecwwds_14_tfnr_artcod ,
                                           String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           String AV108Tnotrecwwds_18_tfnr_colnom ,
                                           int AV110Tnotrecwwds_20_tfnr_colnum ,
                                           int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                           int AV112Tnotrecwwds_22_tfnr_piezas ,
                                           int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                           java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                           java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           String AV116Tnotrecwwds_26_tfnr_unidad ,
                                           int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                           int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                           byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                           byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                           String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           String AV122Tnotrecwwds_32_tfnr_barpara ,
                                           long AV124Tnotrecwwds_34_tfnr_nalb ,
                                           long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                           String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           String AV126Tnotrecwwds_36_tfnr_local ,
                                           String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           String AV128Tnotrecwwds_38_tfnr_user ,
                                           java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                           int AV132Tnotrecwwds_42_tfnr_barcod ,
                                           int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                           int A5198Nr_codigo ,
                                           int A5206Nr_albrecc ,
                                           int A5340Nr_CliCod ,
                                           String A5341Nr_CliNom ,
                                           String A5199Nr_albent ,
                                           String A5200Nr_refcli ,
                                           String A5201Nr_artcod ,
                                           String A5202Nr_artdsc ,
                                           String A5203Nr_colnom ,
                                           int A5204Nr_colnum ,
                                           int A5207Nr_piezas ,
                                           java.math.BigDecimal A5208Nr_unidade ,
                                           String A5209Nr_unidad ,
                                           int A5222Nr_barcoda ,
                                           byte A5223Nr_barreoa ,
                                           String A5224Nr_barpara ,
                                           long A12235Nr_NAlb ,
                                           String A5214Nr_local ,
                                           String A5215Nr_user ,
                                           int A5210Nr_barcod ,
                                           java.util.Date A5216Nr_fecreg ,
                                           java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[62];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT Nr_local, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
         GXv_int18[9] = (byte)(1) ;
         GXv_int18[10] = (byte)(1) ;
         GXv_int18[11] = (byte)(1) ;
         GXv_int18[12] = (byte)(1) ;
         GXv_int18[13] = (byte)(1) ;
         GXv_int18[14] = (byte)(1) ;
         GXv_int18[15] = (byte)(1) ;
         GXv_int18[16] = (byte)(1) ;
         GXv_int18[17] = (byte)(1) ;
         GXv_int18[18] = (byte)(1) ;
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int18[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int18[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int18[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int18[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int18[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int18[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int18[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int18[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int18[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int18[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int18[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_local" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P084711( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV91Tnotrecwwds_1_filterfulltext ,
                                           int AV92Tnotrecwwds_2_tfnr_codigo ,
                                           int AV93Tnotrecwwds_3_tfnr_codigo_to ,
                                           int AV94Tnotrecwwds_4_tfnr_albreccod ,
                                           int AV95Tnotrecwwds_5_tfnr_albreccod_to ,
                                           int AV96Tnotrecwwds_6_tfnr_clicod ,
                                           int AV97Tnotrecwwds_7_tfnr_clicod_to ,
                                           String AV99Tnotrecwwds_9_tfnr_clinom_sel ,
                                           String AV98Tnotrecwwds_8_tfnr_clinom ,
                                           String AV101Tnotrecwwds_11_tfnr_albent_sel ,
                                           String AV100Tnotrecwwds_10_tfnr_albent ,
                                           String AV103Tnotrecwwds_13_tfnr_refcli_sel ,
                                           String AV102Tnotrecwwds_12_tfnr_refcli ,
                                           String AV105Tnotrecwwds_15_tfnr_artcod_sel ,
                                           String AV104Tnotrecwwds_14_tfnr_artcod ,
                                           String AV107Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           String AV106Tnotrecwwds_16_tfnr_artdsc ,
                                           String AV109Tnotrecwwds_19_tfnr_colnom_sel ,
                                           String AV108Tnotrecwwds_18_tfnr_colnom ,
                                           int AV110Tnotrecwwds_20_tfnr_colnum ,
                                           int AV111Tnotrecwwds_21_tfnr_colnum_to ,
                                           int AV112Tnotrecwwds_22_tfnr_piezas ,
                                           int AV113Tnotrecwwds_23_tfnr_piezas_to ,
                                           java.math.BigDecimal AV114Tnotrecwwds_24_tfnr_unidades ,
                                           java.math.BigDecimal AV115Tnotrecwwds_25_tfnr_unidades_to ,
                                           String AV117Tnotrecwwds_27_tfnr_unidad_sel ,
                                           String AV116Tnotrecwwds_26_tfnr_unidad ,
                                           int AV118Tnotrecwwds_28_tfnr_barcoda ,
                                           int AV119Tnotrecwwds_29_tfnr_barcoda_to ,
                                           byte AV120Tnotrecwwds_30_tfnr_barreoa ,
                                           byte AV121Tnotrecwwds_31_tfnr_barreoa_to ,
                                           String AV123Tnotrecwwds_33_tfnr_barpara_sel ,
                                           String AV122Tnotrecwwds_32_tfnr_barpara ,
                                           long AV124Tnotrecwwds_34_tfnr_nalb ,
                                           long AV125Tnotrecwwds_35_tfnr_nalb_to ,
                                           String AV127Tnotrecwwds_37_tfnr_local_sel ,
                                           String AV126Tnotrecwwds_36_tfnr_local ,
                                           String AV129Tnotrecwwds_39_tfnr_user_sel ,
                                           String AV128Tnotrecwwds_38_tfnr_user ,
                                           java.util.Date AV130Tnotrecwwds_40_tfnr_fecreg ,
                                           java.util.Date AV131Tnotrecwwds_41_tfnr_fecent ,
                                           int AV132Tnotrecwwds_42_tfnr_barcod ,
                                           int AV133Tnotrecwwds_43_tfnr_barcod_to ,
                                           int A5198Nr_codigo ,
                                           int A5206Nr_albrecc ,
                                           int A5340Nr_CliCod ,
                                           String A5341Nr_CliNom ,
                                           String A5199Nr_albent ,
                                           String A5200Nr_refcli ,
                                           String A5201Nr_artcod ,
                                           String A5202Nr_artdsc ,
                                           String A5203Nr_colnom ,
                                           int A5204Nr_colnum ,
                                           int A5207Nr_piezas ,
                                           java.math.BigDecimal A5208Nr_unidade ,
                                           String A5209Nr_unidad ,
                                           int A5222Nr_barcoda ,
                                           byte A5223Nr_barreoa ,
                                           String A5224Nr_barpara ,
                                           long A12235Nr_NAlb ,
                                           String A5214Nr_local ,
                                           String A5215Nr_user ,
                                           int A5210Nr_barcod ,
                                           java.util.Date A5216Nr_fecreg ,
                                           java.util.Date A5217Nr_fecent )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[62];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT Nr_user, Nr_barcod, Nr_fecent, Nr_fecreg, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV91Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
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
         GXv_int20[16] = (byte)(1) ;
         GXv_int20[17] = (byte)(1) ;
         GXv_int20[18] = (byte)(1) ;
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV92Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV93Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV94Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV95Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV100Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV102Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV110Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (0==AV111Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (0==AV112Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (0==AV113Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV116Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( ! (0==AV118Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( ! (0==AV119Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( ! (0==AV120Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV122Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV126Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int20[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV128Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int20[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int20[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int20[59] = (byte)(1) ;
      }
      if ( ! (0==AV132Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int20[60] = (byte)(1) ;
      }
      if ( ! (0==AV133Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int20[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Nr_user" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P08472(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 1 :
                  return conditional_P08473(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 2 :
                  return conditional_P08474(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 3 :
                  return conditional_P08475(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 4 :
                  return conditional_P08476(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 5 :
                  return conditional_P08477(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 6 :
                  return conditional_P08478(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 7 :
                  return conditional_P08479(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 8 :
                  return conditional_P084710(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
            case 9 :
                  return conditional_P084711(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08472", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08473", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08474", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08475", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08476", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08477", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08478", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08479", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084710", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084711", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
      }
   }

}

