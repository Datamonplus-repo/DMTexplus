package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticu_wwgetfilterdata extends GXProcedure
{
   public tarticu_wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_wwgetfilterdata.class ), "" );
   }

   public tarticu_wwgetfilterdata( int remoteHandle ,
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
      tarticu_wwgetfilterdata.this.aP5 = new String[] {""};
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
      tarticu_wwgetfilterdata.this.AV44DDOName = aP0;
      tarticu_wwgetfilterdata.this.AV45SearchTxt = aP1;
      tarticu_wwgetfilterdata.this.AV46SearchTxtTo = aP2;
      tarticu_wwgetfilterdata.this.aP3 = aP3;
      tarticu_wwgetfilterdata.this.aP4 = aP4;
      tarticu_wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV37OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_TIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ARTCOMER") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCOMEROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV47OptionsJson = AV34Options.toJSonString(false) ;
      AV48OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV49OptionIndexesJson = AV37OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("Tarticu_WWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Tarticu_WWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("Tarticu_WWGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV16TFArtDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV17TFArtDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV18TFTipArtCod = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFTipArtCod_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV20TFTipArtDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV21TFTipArtDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV22TFArtPml = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFArtPml_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV24TFArtGraAca = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFArtGraAca_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV26TFArtRen = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFArtRen_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV28TFArtAcaMin = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFArtAcaMin_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV30TFArtComer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV31TFArtComer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACTIVO_SEL") == 0 )
         {
            AV51TFArtActivo_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV45SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV56Tarticu_wwds_1_filterfulltext = AV50FilterFullText ;
      AV57Tarticu_wwds_2_tfclicod = AV10TFCliCod ;
      AV58Tarticu_wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Tarticu_wwds_4_tfclinom = AV12TFCliNom ;
      AV60Tarticu_wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV61Tarticu_wwds_6_tfartcod = AV14TFArtCod ;
      AV62Tarticu_wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV63Tarticu_wwds_8_tfartdsc = AV16TFArtDsc ;
      AV64Tarticu_wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV65Tarticu_wwds_10_tftipartcod = AV18TFTipArtCod ;
      AV66Tarticu_wwds_11_tftipartcod_to = AV19TFTipArtCod_To ;
      AV67Tarticu_wwds_12_tftipartdsc = AV20TFTipArtDsc ;
      AV68Tarticu_wwds_13_tftipartdsc_sel = AV21TFTipArtDsc_Sel ;
      AV69Tarticu_wwds_14_tfartpml = AV22TFArtPml ;
      AV70Tarticu_wwds_15_tfartpml_to = AV23TFArtPml_To ;
      AV71Tarticu_wwds_16_tfartgraaca = AV24TFArtGraAca ;
      AV72Tarticu_wwds_17_tfartgraaca_to = AV25TFArtGraAca_To ;
      AV73Tarticu_wwds_18_tfartren = AV26TFArtRen ;
      AV74Tarticu_wwds_19_tfartren_to = AV27TFArtRen_To ;
      AV75Tarticu_wwds_20_tfartacamin = AV28TFArtAcaMin ;
      AV76Tarticu_wwds_21_tfartacamin_to = AV29TFArtAcaMin_To ;
      AV77Tarticu_wwds_22_tfartcomer = AV30TFArtComer ;
      AV78Tarticu_wwds_23_tfartcomer_sel = AV31TFArtComer_Sel ;
      AV79Tarticu_wwds_24_tfartactivo_sel = AV51TFArtActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to) ,
                                           AV60Tarticu_wwds_5_tfclinom_sel ,
                                           AV59Tarticu_wwds_4_tfclinom ,
                                           AV62Tarticu_wwds_7_tfartcod_sel ,
                                           AV61Tarticu_wwds_6_tfartcod ,
                                           AV64Tarticu_wwds_9_tfartdsc_sel ,
                                           AV63Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV65Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to) ,
                                           AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV67Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV69Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV73Tarticu_wwds_18_tfartren ,
                                           AV74Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV75Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to) ,
                                           AV78Tarticu_wwds_23_tfartcomer_sel ,
                                           AV77Tarticu_wwds_22_tfartcomer ,
                                           AV79Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV59Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV59Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV61Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV61Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV63Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV63Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV67Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV67Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV77Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV77Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9A2 */
      pr_default.execute(0, new Object[] {lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV57Tarticu_wwds_2_tfclicod), Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to), lV59Tarticu_wwds_4_tfclinom, AV60Tarticu_wwds_5_tfclinom_sel, lV61Tarticu_wwds_6_tfartcod, AV62Tarticu_wwds_7_tfartcod_sel, lV63Tarticu_wwds_8_tfartdsc, AV64Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV65Tarticu_wwds_10_tftipartcod), Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to), lV67Tarticu_wwds_12_tftipartdsc, AV68Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV69Tarticu_wwds_14_tfartpml), Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to), AV73Tarticu_wwds_18_tfartren, AV74Tarticu_wwds_19_tfartren_to, Short.valueOf(AV75Tarticu_wwds_20_tfartacamin), Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to), lV77Tarticu_wwds_22_tfartcomer, AV78Tarticu_wwds_23_tfartcomer_sel, AV79Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA9A2 = false ;
         A396EmprCod = P0A9A2_A396EmprCod[0] ;
         A10045CliAct = P0A9A2_A10045CliAct[0] ;
         A279CliNom = P0A9A2_A279CliNom[0] ;
         A14295ArtActivo = P0A9A2_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9A2_A5741ArtComer[0] ;
         n5741ArtComer = P0A9A2_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9A2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9A2_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9A2_A95ArtRen[0] ;
         n95ArtRen = P0A9A2_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9A2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9A2_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9A2_A1148ArtPml[0] ;
         n1148ArtPml = P0A9A2_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9A2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A2_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9A2_A829TipArtCod[0] ;
         A69ArtDsc = P0A9A2_A69ArtDsc[0] ;
         n69ArtDsc = P0A9A2_n69ArtDsc[0] ;
         A65ArtCod = P0A9A2_A65ArtCod[0] ;
         A252CliCod = P0A9A2_A252CliCod[0] ;
         A830TipArtDsc = P0A9A2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A2_n830TipArtDsc[0] ;
         A10045CliAct = P0A9A2_A10045CliAct[0] ;
         A279CliNom = P0A9A2_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A9A2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkA9A2 = false ;
            A396EmprCod = P0A9A2_A396EmprCod[0] ;
            A65ArtCod = P0A9A2_A65ArtCod[0] ;
            A252CliCod = P0A9A2_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkA9A2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV33Option = A279CliNom ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9A2 )
         {
            brkA9A2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV45SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV56Tarticu_wwds_1_filterfulltext = AV50FilterFullText ;
      AV57Tarticu_wwds_2_tfclicod = AV10TFCliCod ;
      AV58Tarticu_wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Tarticu_wwds_4_tfclinom = AV12TFCliNom ;
      AV60Tarticu_wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV61Tarticu_wwds_6_tfartcod = AV14TFArtCod ;
      AV62Tarticu_wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV63Tarticu_wwds_8_tfartdsc = AV16TFArtDsc ;
      AV64Tarticu_wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV65Tarticu_wwds_10_tftipartcod = AV18TFTipArtCod ;
      AV66Tarticu_wwds_11_tftipartcod_to = AV19TFTipArtCod_To ;
      AV67Tarticu_wwds_12_tftipartdsc = AV20TFTipArtDsc ;
      AV68Tarticu_wwds_13_tftipartdsc_sel = AV21TFTipArtDsc_Sel ;
      AV69Tarticu_wwds_14_tfartpml = AV22TFArtPml ;
      AV70Tarticu_wwds_15_tfartpml_to = AV23TFArtPml_To ;
      AV71Tarticu_wwds_16_tfartgraaca = AV24TFArtGraAca ;
      AV72Tarticu_wwds_17_tfartgraaca_to = AV25TFArtGraAca_To ;
      AV73Tarticu_wwds_18_tfartren = AV26TFArtRen ;
      AV74Tarticu_wwds_19_tfartren_to = AV27TFArtRen_To ;
      AV75Tarticu_wwds_20_tfartacamin = AV28TFArtAcaMin ;
      AV76Tarticu_wwds_21_tfartacamin_to = AV29TFArtAcaMin_To ;
      AV77Tarticu_wwds_22_tfartcomer = AV30TFArtComer ;
      AV78Tarticu_wwds_23_tfartcomer_sel = AV31TFArtComer_Sel ;
      AV79Tarticu_wwds_24_tfartactivo_sel = AV51TFArtActivo_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to) ,
                                           AV60Tarticu_wwds_5_tfclinom_sel ,
                                           AV59Tarticu_wwds_4_tfclinom ,
                                           AV62Tarticu_wwds_7_tfartcod_sel ,
                                           AV61Tarticu_wwds_6_tfartcod ,
                                           AV64Tarticu_wwds_9_tfartdsc_sel ,
                                           AV63Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV65Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to) ,
                                           AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV67Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV69Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV73Tarticu_wwds_18_tfartren ,
                                           AV74Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV75Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to) ,
                                           AV78Tarticu_wwds_23_tfartcomer_sel ,
                                           AV77Tarticu_wwds_22_tfartcomer ,
                                           AV79Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV59Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV59Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV61Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV61Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV63Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV63Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV67Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV67Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV77Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV77Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9A3 */
      pr_default.execute(1, new Object[] {lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV57Tarticu_wwds_2_tfclicod), Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to), lV59Tarticu_wwds_4_tfclinom, AV60Tarticu_wwds_5_tfclinom_sel, lV61Tarticu_wwds_6_tfartcod, AV62Tarticu_wwds_7_tfartcod_sel, lV63Tarticu_wwds_8_tfartdsc, AV64Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV65Tarticu_wwds_10_tftipartcod), Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to), lV67Tarticu_wwds_12_tftipartdsc, AV68Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV69Tarticu_wwds_14_tfartpml), Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to), AV73Tarticu_wwds_18_tfartren, AV74Tarticu_wwds_19_tfartren_to, Short.valueOf(AV75Tarticu_wwds_20_tfartacamin), Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to), lV77Tarticu_wwds_22_tfartcomer, AV78Tarticu_wwds_23_tfartcomer_sel, AV79Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA9A4 = false ;
         A396EmprCod = P0A9A3_A396EmprCod[0] ;
         A10045CliAct = P0A9A3_A10045CliAct[0] ;
         A65ArtCod = P0A9A3_A65ArtCod[0] ;
         A14295ArtActivo = P0A9A3_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9A3_A5741ArtComer[0] ;
         n5741ArtComer = P0A9A3_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9A3_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9A3_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9A3_A95ArtRen[0] ;
         n95ArtRen = P0A9A3_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9A3_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9A3_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9A3_A1148ArtPml[0] ;
         n1148ArtPml = P0A9A3_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9A3_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A3_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9A3_A829TipArtCod[0] ;
         A69ArtDsc = P0A9A3_A69ArtDsc[0] ;
         n69ArtDsc = P0A9A3_n69ArtDsc[0] ;
         A279CliNom = P0A9A3_A279CliNom[0] ;
         A252CliCod = P0A9A3_A252CliCod[0] ;
         A830TipArtDsc = P0A9A3_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A3_n830TipArtDsc[0] ;
         A10045CliAct = P0A9A3_A10045CliAct[0] ;
         A279CliNom = P0A9A3_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A9A3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkA9A4 = false ;
            A396EmprCod = P0A9A3_A396EmprCod[0] ;
            A252CliCod = P0A9A3_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkA9A4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV33Option = A65ArtCod ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9A4 )
         {
            brkA9A4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFArtDsc = AV45SearchTxt ;
      AV17TFArtDsc_Sel = "" ;
      AV56Tarticu_wwds_1_filterfulltext = AV50FilterFullText ;
      AV57Tarticu_wwds_2_tfclicod = AV10TFCliCod ;
      AV58Tarticu_wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Tarticu_wwds_4_tfclinom = AV12TFCliNom ;
      AV60Tarticu_wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV61Tarticu_wwds_6_tfartcod = AV14TFArtCod ;
      AV62Tarticu_wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV63Tarticu_wwds_8_tfartdsc = AV16TFArtDsc ;
      AV64Tarticu_wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV65Tarticu_wwds_10_tftipartcod = AV18TFTipArtCod ;
      AV66Tarticu_wwds_11_tftipartcod_to = AV19TFTipArtCod_To ;
      AV67Tarticu_wwds_12_tftipartdsc = AV20TFTipArtDsc ;
      AV68Tarticu_wwds_13_tftipartdsc_sel = AV21TFTipArtDsc_Sel ;
      AV69Tarticu_wwds_14_tfartpml = AV22TFArtPml ;
      AV70Tarticu_wwds_15_tfartpml_to = AV23TFArtPml_To ;
      AV71Tarticu_wwds_16_tfartgraaca = AV24TFArtGraAca ;
      AV72Tarticu_wwds_17_tfartgraaca_to = AV25TFArtGraAca_To ;
      AV73Tarticu_wwds_18_tfartren = AV26TFArtRen ;
      AV74Tarticu_wwds_19_tfartren_to = AV27TFArtRen_To ;
      AV75Tarticu_wwds_20_tfartacamin = AV28TFArtAcaMin ;
      AV76Tarticu_wwds_21_tfartacamin_to = AV29TFArtAcaMin_To ;
      AV77Tarticu_wwds_22_tfartcomer = AV30TFArtComer ;
      AV78Tarticu_wwds_23_tfartcomer_sel = AV31TFArtComer_Sel ;
      AV79Tarticu_wwds_24_tfartactivo_sel = AV51TFArtActivo_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to) ,
                                           AV60Tarticu_wwds_5_tfclinom_sel ,
                                           AV59Tarticu_wwds_4_tfclinom ,
                                           AV62Tarticu_wwds_7_tfartcod_sel ,
                                           AV61Tarticu_wwds_6_tfartcod ,
                                           AV64Tarticu_wwds_9_tfartdsc_sel ,
                                           AV63Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV65Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to) ,
                                           AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV67Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV69Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV73Tarticu_wwds_18_tfartren ,
                                           AV74Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV75Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to) ,
                                           AV78Tarticu_wwds_23_tfartcomer_sel ,
                                           AV77Tarticu_wwds_22_tfartcomer ,
                                           AV79Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV59Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV59Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV61Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV61Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV63Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV63Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV67Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV67Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV77Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV77Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9A4 */
      pr_default.execute(2, new Object[] {lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV57Tarticu_wwds_2_tfclicod), Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to), lV59Tarticu_wwds_4_tfclinom, AV60Tarticu_wwds_5_tfclinom_sel, lV61Tarticu_wwds_6_tfartcod, AV62Tarticu_wwds_7_tfartcod_sel, lV63Tarticu_wwds_8_tfartdsc, AV64Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV65Tarticu_wwds_10_tftipartcod), Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to), lV67Tarticu_wwds_12_tftipartdsc, AV68Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV69Tarticu_wwds_14_tfartpml), Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to), AV73Tarticu_wwds_18_tfartren, AV74Tarticu_wwds_19_tfartren_to, Short.valueOf(AV75Tarticu_wwds_20_tfartacamin), Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to), lV77Tarticu_wwds_22_tfartcomer, AV78Tarticu_wwds_23_tfartcomer_sel, AV79Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA9A6 = false ;
         A396EmprCod = P0A9A4_A396EmprCod[0] ;
         A10045CliAct = P0A9A4_A10045CliAct[0] ;
         A69ArtDsc = P0A9A4_A69ArtDsc[0] ;
         n69ArtDsc = P0A9A4_n69ArtDsc[0] ;
         A14295ArtActivo = P0A9A4_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9A4_A5741ArtComer[0] ;
         n5741ArtComer = P0A9A4_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9A4_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9A4_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9A4_A95ArtRen[0] ;
         n95ArtRen = P0A9A4_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9A4_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9A4_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9A4_A1148ArtPml[0] ;
         n1148ArtPml = P0A9A4_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9A4_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A4_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9A4_A829TipArtCod[0] ;
         A65ArtCod = P0A9A4_A65ArtCod[0] ;
         A279CliNom = P0A9A4_A279CliNom[0] ;
         A252CliCod = P0A9A4_A252CliCod[0] ;
         A830TipArtDsc = P0A9A4_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A4_n830TipArtDsc[0] ;
         A10045CliAct = P0A9A4_A10045CliAct[0] ;
         A279CliNom = P0A9A4_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A9A4_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brkA9A6 = false ;
            A396EmprCod = P0A9A4_A396EmprCod[0] ;
            A65ArtCod = P0A9A4_A65ArtCod[0] ;
            A252CliCod = P0A9A4_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkA9A6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV33Option = A69ArtDsc ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9A6 )
         {
            brkA9A6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFTipArtDsc = AV45SearchTxt ;
      AV21TFTipArtDsc_Sel = "" ;
      AV56Tarticu_wwds_1_filterfulltext = AV50FilterFullText ;
      AV57Tarticu_wwds_2_tfclicod = AV10TFCliCod ;
      AV58Tarticu_wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Tarticu_wwds_4_tfclinom = AV12TFCliNom ;
      AV60Tarticu_wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV61Tarticu_wwds_6_tfartcod = AV14TFArtCod ;
      AV62Tarticu_wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV63Tarticu_wwds_8_tfartdsc = AV16TFArtDsc ;
      AV64Tarticu_wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV65Tarticu_wwds_10_tftipartcod = AV18TFTipArtCod ;
      AV66Tarticu_wwds_11_tftipartcod_to = AV19TFTipArtCod_To ;
      AV67Tarticu_wwds_12_tftipartdsc = AV20TFTipArtDsc ;
      AV68Tarticu_wwds_13_tftipartdsc_sel = AV21TFTipArtDsc_Sel ;
      AV69Tarticu_wwds_14_tfartpml = AV22TFArtPml ;
      AV70Tarticu_wwds_15_tfartpml_to = AV23TFArtPml_To ;
      AV71Tarticu_wwds_16_tfartgraaca = AV24TFArtGraAca ;
      AV72Tarticu_wwds_17_tfartgraaca_to = AV25TFArtGraAca_To ;
      AV73Tarticu_wwds_18_tfartren = AV26TFArtRen ;
      AV74Tarticu_wwds_19_tfartren_to = AV27TFArtRen_To ;
      AV75Tarticu_wwds_20_tfartacamin = AV28TFArtAcaMin ;
      AV76Tarticu_wwds_21_tfartacamin_to = AV29TFArtAcaMin_To ;
      AV77Tarticu_wwds_22_tfartcomer = AV30TFArtComer ;
      AV78Tarticu_wwds_23_tfartcomer_sel = AV31TFArtComer_Sel ;
      AV79Tarticu_wwds_24_tfartactivo_sel = AV51TFArtActivo_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV56Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to) ,
                                           AV60Tarticu_wwds_5_tfclinom_sel ,
                                           AV59Tarticu_wwds_4_tfclinom ,
                                           AV62Tarticu_wwds_7_tfartcod_sel ,
                                           AV61Tarticu_wwds_6_tfartcod ,
                                           AV64Tarticu_wwds_9_tfartdsc_sel ,
                                           AV63Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV65Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to) ,
                                           AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV67Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV69Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV73Tarticu_wwds_18_tfartren ,
                                           AV74Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV75Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to) ,
                                           AV78Tarticu_wwds_23_tfartcomer_sel ,
                                           AV77Tarticu_wwds_22_tfartcomer ,
                                           AV79Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV59Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV59Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV61Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV61Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV63Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV63Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV67Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV67Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV77Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV77Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9A5 */
      pr_default.execute(3, new Object[] {lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV57Tarticu_wwds_2_tfclicod), Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to), lV59Tarticu_wwds_4_tfclinom, AV60Tarticu_wwds_5_tfclinom_sel, lV61Tarticu_wwds_6_tfartcod, AV62Tarticu_wwds_7_tfartcod_sel, lV63Tarticu_wwds_8_tfartdsc, AV64Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV65Tarticu_wwds_10_tftipartcod), Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to), lV67Tarticu_wwds_12_tftipartdsc, AV68Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV69Tarticu_wwds_14_tfartpml), Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to), AV73Tarticu_wwds_18_tfartren, AV74Tarticu_wwds_19_tfartren_to, Short.valueOf(AV75Tarticu_wwds_20_tfartacamin), Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to), lV77Tarticu_wwds_22_tfartcomer, AV78Tarticu_wwds_23_tfartcomer_sel, AV79Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA9A8 = false ;
         A829TipArtCod = P0A9A5_A829TipArtCod[0] ;
         A396EmprCod = P0A9A5_A396EmprCod[0] ;
         A10045CliAct = P0A9A5_A10045CliAct[0] ;
         A14295ArtActivo = P0A9A5_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9A5_A5741ArtComer[0] ;
         n5741ArtComer = P0A9A5_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9A5_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9A5_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9A5_A95ArtRen[0] ;
         n95ArtRen = P0A9A5_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9A5_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9A5_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9A5_A1148ArtPml[0] ;
         n1148ArtPml = P0A9A5_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9A5_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A5_n830TipArtDsc[0] ;
         A69ArtDsc = P0A9A5_A69ArtDsc[0] ;
         n69ArtDsc = P0A9A5_n69ArtDsc[0] ;
         A65ArtCod = P0A9A5_A65ArtCod[0] ;
         A279CliNom = P0A9A5_A279CliNom[0] ;
         A252CliCod = P0A9A5_A252CliCod[0] ;
         A830TipArtDsc = P0A9A5_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A5_n830TipArtDsc[0] ;
         A10045CliAct = P0A9A5_A10045CliAct[0] ;
         A279CliNom = P0A9A5_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A9A5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A9A5_A829TipArtCod[0] == A829TipArtCod ) )
         {
            brkA9A8 = false ;
            A65ArtCod = P0A9A5_A65ArtCod[0] ;
            A252CliCod = P0A9A5_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkA9A8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A830TipArtDsc)==0) )
         {
            AV33Option = A830TipArtDsc ;
            AV32InsertIndex = 1 ;
            while ( ( AV32InsertIndex <= AV34Options.size() ) && ( GXutil.strcmp((String)AV34Options.elementAt(-1+AV32InsertIndex), AV33Option) < 0 ) )
            {
               AV32InsertIndex = (int)(AV32InsertIndex+1) ;
            }
            AV34Options.add(AV33Option, AV32InsertIndex);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV32InsertIndex);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9A8 )
         {
            brkA9A8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADARTCOMEROPTIONS' Routine */
      returnInSub = false ;
      AV30TFArtComer = AV45SearchTxt ;
      AV31TFArtComer_Sel = "" ;
      AV56Tarticu_wwds_1_filterfulltext = AV50FilterFullText ;
      AV57Tarticu_wwds_2_tfclicod = AV10TFCliCod ;
      AV58Tarticu_wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV59Tarticu_wwds_4_tfclinom = AV12TFCliNom ;
      AV60Tarticu_wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV61Tarticu_wwds_6_tfartcod = AV14TFArtCod ;
      AV62Tarticu_wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV63Tarticu_wwds_8_tfartdsc = AV16TFArtDsc ;
      AV64Tarticu_wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV65Tarticu_wwds_10_tftipartcod = AV18TFTipArtCod ;
      AV66Tarticu_wwds_11_tftipartcod_to = AV19TFTipArtCod_To ;
      AV67Tarticu_wwds_12_tftipartdsc = AV20TFTipArtDsc ;
      AV68Tarticu_wwds_13_tftipartdsc_sel = AV21TFTipArtDsc_Sel ;
      AV69Tarticu_wwds_14_tfartpml = AV22TFArtPml ;
      AV70Tarticu_wwds_15_tfartpml_to = AV23TFArtPml_To ;
      AV71Tarticu_wwds_16_tfartgraaca = AV24TFArtGraAca ;
      AV72Tarticu_wwds_17_tfartgraaca_to = AV25TFArtGraAca_To ;
      AV73Tarticu_wwds_18_tfartren = AV26TFArtRen ;
      AV74Tarticu_wwds_19_tfartren_to = AV27TFArtRen_To ;
      AV75Tarticu_wwds_20_tfartacamin = AV28TFArtAcaMin ;
      AV76Tarticu_wwds_21_tfartacamin_to = AV29TFArtAcaMin_To ;
      AV77Tarticu_wwds_22_tfartcomer = AV30TFArtComer ;
      AV78Tarticu_wwds_23_tfartcomer_sel = AV31TFArtComer_Sel ;
      AV79Tarticu_wwds_24_tfartactivo_sel = AV51TFArtActivo_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV56Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV57Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to) ,
                                           AV60Tarticu_wwds_5_tfclinom_sel ,
                                           AV59Tarticu_wwds_4_tfclinom ,
                                           AV62Tarticu_wwds_7_tfartcod_sel ,
                                           AV61Tarticu_wwds_6_tfartcod ,
                                           AV64Tarticu_wwds_9_tfartdsc_sel ,
                                           AV63Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV65Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to) ,
                                           AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV67Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV69Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV73Tarticu_wwds_18_tfartren ,
                                           AV74Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV75Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to) ,
                                           AV78Tarticu_wwds_23_tfartcomer_sel ,
                                           AV77Tarticu_wwds_22_tfartcomer ,
                                           AV79Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV56Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV59Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV59Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV61Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV61Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV63Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV63Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV67Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV67Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV77Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV77Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9A6 */
      pr_default.execute(4, new Object[] {lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, lV56Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV57Tarticu_wwds_2_tfclicod), Integer.valueOf(AV58Tarticu_wwds_3_tfclicod_to), lV59Tarticu_wwds_4_tfclinom, AV60Tarticu_wwds_5_tfclinom_sel, lV61Tarticu_wwds_6_tfartcod, AV62Tarticu_wwds_7_tfartcod_sel, lV63Tarticu_wwds_8_tfartdsc, AV64Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV65Tarticu_wwds_10_tftipartcod), Short.valueOf(AV66Tarticu_wwds_11_tftipartcod_to), lV67Tarticu_wwds_12_tftipartdsc, AV68Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV69Tarticu_wwds_14_tfartpml), Short.valueOf(AV70Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV71Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV72Tarticu_wwds_17_tfartgraaca_to), AV73Tarticu_wwds_18_tfartren, AV74Tarticu_wwds_19_tfartren_to, Short.valueOf(AV75Tarticu_wwds_20_tfartacamin), Short.valueOf(AV76Tarticu_wwds_21_tfartacamin_to), lV77Tarticu_wwds_22_tfartcomer, AV78Tarticu_wwds_23_tfartcomer_sel, AV79Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA9A10 = false ;
         A396EmprCod = P0A9A6_A396EmprCod[0] ;
         A10045CliAct = P0A9A6_A10045CliAct[0] ;
         A5741ArtComer = P0A9A6_A5741ArtComer[0] ;
         n5741ArtComer = P0A9A6_n5741ArtComer[0] ;
         A14295ArtActivo = P0A9A6_A14295ArtActivo[0] ;
         A63ArtAcaMin = P0A9A6_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9A6_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9A6_A95ArtRen[0] ;
         n95ArtRen = P0A9A6_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9A6_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9A6_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9A6_A1148ArtPml[0] ;
         n1148ArtPml = P0A9A6_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9A6_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A6_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9A6_A829TipArtCod[0] ;
         A69ArtDsc = P0A9A6_A69ArtDsc[0] ;
         n69ArtDsc = P0A9A6_n69ArtDsc[0] ;
         A65ArtCod = P0A9A6_A65ArtCod[0] ;
         A279CliNom = P0A9A6_A279CliNom[0] ;
         A252CliCod = P0A9A6_A252CliCod[0] ;
         A830TipArtDsc = P0A9A6_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9A6_n830TipArtDsc[0] ;
         A10045CliAct = P0A9A6_A10045CliAct[0] ;
         A279CliNom = P0A9A6_A279CliNom[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A9A6_A5741ArtComer[0], A5741ArtComer) == 0 ) )
         {
            brkA9A10 = false ;
            A396EmprCod = P0A9A6_A396EmprCod[0] ;
            A65ArtCod = P0A9A6_A65ArtCod[0] ;
            A252CliCod = P0A9A6_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brkA9A10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5741ArtComer)==0) )
         {
            AV33Option = A5741ArtComer ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9A10 )
         {
            brkA9A10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tarticu_wwgetfilterdata.this.AV47OptionsJson;
      this.aP4[0] = tarticu_wwgetfilterdata.this.AV48OptionsDescJson;
      this.aP5[0] = tarticu_wwgetfilterdata.this.AV49OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47OptionsJson = "" ;
      AV48OptionsDescJson = "" ;
      AV49OptionIndexesJson = "" ;
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV16TFArtDsc = "" ;
      AV17TFArtDsc_Sel = "" ;
      AV20TFTipArtDsc = "" ;
      AV21TFTipArtDsc_Sel = "" ;
      AV26TFArtRen = DecimalUtil.ZERO ;
      AV27TFArtRen_To = DecimalUtil.ZERO ;
      AV30TFArtComer = "" ;
      AV31TFArtComer_Sel = "" ;
      AV51TFArtActivo_Sel = "" ;
      A279CliNom = "" ;
      AV56Tarticu_wwds_1_filterfulltext = "" ;
      AV59Tarticu_wwds_4_tfclinom = "" ;
      AV60Tarticu_wwds_5_tfclinom_sel = "" ;
      AV61Tarticu_wwds_6_tfartcod = "" ;
      AV62Tarticu_wwds_7_tfartcod_sel = "" ;
      AV63Tarticu_wwds_8_tfartdsc = "" ;
      AV64Tarticu_wwds_9_tfartdsc_sel = "" ;
      AV67Tarticu_wwds_12_tftipartdsc = "" ;
      AV68Tarticu_wwds_13_tftipartdsc_sel = "" ;
      AV73Tarticu_wwds_18_tfartren = DecimalUtil.ZERO ;
      AV74Tarticu_wwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV77Tarticu_wwds_22_tfartcomer = "" ;
      AV78Tarticu_wwds_23_tfartcomer_sel = "" ;
      AV79Tarticu_wwds_24_tfartactivo_sel = "" ;
      scmdbuf = "" ;
      lV56Tarticu_wwds_1_filterfulltext = "" ;
      lV59Tarticu_wwds_4_tfclinom = "" ;
      lV61Tarticu_wwds_6_tfartcod = "" ;
      lV63Tarticu_wwds_8_tfartdsc = "" ;
      lV67Tarticu_wwds_12_tftipartdsc = "" ;
      lV77Tarticu_wwds_22_tfartcomer = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      A14295ArtActivo = "" ;
      A10045CliAct = "" ;
      P0A9A2_A396EmprCod = new String[] {""} ;
      P0A9A2_A10045CliAct = new String[] {""} ;
      P0A9A2_A279CliNom = new String[] {""} ;
      P0A9A2_A14295ArtActivo = new String[] {""} ;
      P0A9A2_A5741ArtComer = new String[] {""} ;
      P0A9A2_n5741ArtComer = new boolean[] {false} ;
      P0A9A2_A63ArtAcaMin = new short[1] ;
      P0A9A2_n63ArtAcaMin = new boolean[] {false} ;
      P0A9A2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9A2_n95ArtRen = new boolean[] {false} ;
      P0A9A2_A1903ArtGraAca = new short[1] ;
      P0A9A2_n1903ArtGraAca = new boolean[] {false} ;
      P0A9A2_A1148ArtPml = new short[1] ;
      P0A9A2_n1148ArtPml = new boolean[] {false} ;
      P0A9A2_A830TipArtDsc = new String[] {""} ;
      P0A9A2_n830TipArtDsc = new boolean[] {false} ;
      P0A9A2_A829TipArtCod = new short[1] ;
      P0A9A2_A69ArtDsc = new String[] {""} ;
      P0A9A2_n69ArtDsc = new boolean[] {false} ;
      P0A9A2_A65ArtCod = new String[] {""} ;
      P0A9A2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV33Option = "" ;
      P0A9A3_A396EmprCod = new String[] {""} ;
      P0A9A3_A10045CliAct = new String[] {""} ;
      P0A9A3_A65ArtCod = new String[] {""} ;
      P0A9A3_A14295ArtActivo = new String[] {""} ;
      P0A9A3_A5741ArtComer = new String[] {""} ;
      P0A9A3_n5741ArtComer = new boolean[] {false} ;
      P0A9A3_A63ArtAcaMin = new short[1] ;
      P0A9A3_n63ArtAcaMin = new boolean[] {false} ;
      P0A9A3_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9A3_n95ArtRen = new boolean[] {false} ;
      P0A9A3_A1903ArtGraAca = new short[1] ;
      P0A9A3_n1903ArtGraAca = new boolean[] {false} ;
      P0A9A3_A1148ArtPml = new short[1] ;
      P0A9A3_n1148ArtPml = new boolean[] {false} ;
      P0A9A3_A830TipArtDsc = new String[] {""} ;
      P0A9A3_n830TipArtDsc = new boolean[] {false} ;
      P0A9A3_A829TipArtCod = new short[1] ;
      P0A9A3_A69ArtDsc = new String[] {""} ;
      P0A9A3_n69ArtDsc = new boolean[] {false} ;
      P0A9A3_A279CliNom = new String[] {""} ;
      P0A9A3_A252CliCod = new int[1] ;
      P0A9A4_A396EmprCod = new String[] {""} ;
      P0A9A4_A10045CliAct = new String[] {""} ;
      P0A9A4_A69ArtDsc = new String[] {""} ;
      P0A9A4_n69ArtDsc = new boolean[] {false} ;
      P0A9A4_A14295ArtActivo = new String[] {""} ;
      P0A9A4_A5741ArtComer = new String[] {""} ;
      P0A9A4_n5741ArtComer = new boolean[] {false} ;
      P0A9A4_A63ArtAcaMin = new short[1] ;
      P0A9A4_n63ArtAcaMin = new boolean[] {false} ;
      P0A9A4_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9A4_n95ArtRen = new boolean[] {false} ;
      P0A9A4_A1903ArtGraAca = new short[1] ;
      P0A9A4_n1903ArtGraAca = new boolean[] {false} ;
      P0A9A4_A1148ArtPml = new short[1] ;
      P0A9A4_n1148ArtPml = new boolean[] {false} ;
      P0A9A4_A830TipArtDsc = new String[] {""} ;
      P0A9A4_n830TipArtDsc = new boolean[] {false} ;
      P0A9A4_A829TipArtCod = new short[1] ;
      P0A9A4_A65ArtCod = new String[] {""} ;
      P0A9A4_A279CliNom = new String[] {""} ;
      P0A9A4_A252CliCod = new int[1] ;
      P0A9A5_A829TipArtCod = new short[1] ;
      P0A9A5_A396EmprCod = new String[] {""} ;
      P0A9A5_A10045CliAct = new String[] {""} ;
      P0A9A5_A14295ArtActivo = new String[] {""} ;
      P0A9A5_A5741ArtComer = new String[] {""} ;
      P0A9A5_n5741ArtComer = new boolean[] {false} ;
      P0A9A5_A63ArtAcaMin = new short[1] ;
      P0A9A5_n63ArtAcaMin = new boolean[] {false} ;
      P0A9A5_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9A5_n95ArtRen = new boolean[] {false} ;
      P0A9A5_A1903ArtGraAca = new short[1] ;
      P0A9A5_n1903ArtGraAca = new boolean[] {false} ;
      P0A9A5_A1148ArtPml = new short[1] ;
      P0A9A5_n1148ArtPml = new boolean[] {false} ;
      P0A9A5_A830TipArtDsc = new String[] {""} ;
      P0A9A5_n830TipArtDsc = new boolean[] {false} ;
      P0A9A5_A69ArtDsc = new String[] {""} ;
      P0A9A5_n69ArtDsc = new boolean[] {false} ;
      P0A9A5_A65ArtCod = new String[] {""} ;
      P0A9A5_A279CliNom = new String[] {""} ;
      P0A9A5_A252CliCod = new int[1] ;
      P0A9A6_A396EmprCod = new String[] {""} ;
      P0A9A6_A10045CliAct = new String[] {""} ;
      P0A9A6_A5741ArtComer = new String[] {""} ;
      P0A9A6_n5741ArtComer = new boolean[] {false} ;
      P0A9A6_A14295ArtActivo = new String[] {""} ;
      P0A9A6_A63ArtAcaMin = new short[1] ;
      P0A9A6_n63ArtAcaMin = new boolean[] {false} ;
      P0A9A6_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9A6_n95ArtRen = new boolean[] {false} ;
      P0A9A6_A1903ArtGraAca = new short[1] ;
      P0A9A6_n1903ArtGraAca = new boolean[] {false} ;
      P0A9A6_A1148ArtPml = new short[1] ;
      P0A9A6_n1148ArtPml = new boolean[] {false} ;
      P0A9A6_A830TipArtDsc = new String[] {""} ;
      P0A9A6_n830TipArtDsc = new boolean[] {false} ;
      P0A9A6_A829TipArtCod = new short[1] ;
      P0A9A6_A69ArtDsc = new String[] {""} ;
      P0A9A6_n69ArtDsc = new boolean[] {false} ;
      P0A9A6_A65ArtCod = new String[] {""} ;
      P0A9A6_A279CliNom = new String[] {""} ;
      P0A9A6_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A9A2_A396EmprCod, P0A9A2_A10045CliAct, P0A9A2_A279CliNom, P0A9A2_A14295ArtActivo, P0A9A2_A5741ArtComer, P0A9A2_n5741ArtComer, P0A9A2_A63ArtAcaMin, P0A9A2_n63ArtAcaMin, P0A9A2_A95ArtRen, P0A9A2_n95ArtRen,
            P0A9A2_A1903ArtGraAca, P0A9A2_n1903ArtGraAca, P0A9A2_A1148ArtPml, P0A9A2_n1148ArtPml, P0A9A2_A830TipArtDsc, P0A9A2_n830TipArtDsc, P0A9A2_A829TipArtCod, P0A9A2_A69ArtDsc, P0A9A2_n69ArtDsc, P0A9A2_A65ArtCod,
            P0A9A2_A252CliCod
            }
            , new Object[] {
            P0A9A3_A396EmprCod, P0A9A3_A10045CliAct, P0A9A3_A65ArtCod, P0A9A3_A14295ArtActivo, P0A9A3_A5741ArtComer, P0A9A3_n5741ArtComer, P0A9A3_A63ArtAcaMin, P0A9A3_n63ArtAcaMin, P0A9A3_A95ArtRen, P0A9A3_n95ArtRen,
            P0A9A3_A1903ArtGraAca, P0A9A3_n1903ArtGraAca, P0A9A3_A1148ArtPml, P0A9A3_n1148ArtPml, P0A9A3_A830TipArtDsc, P0A9A3_n830TipArtDsc, P0A9A3_A829TipArtCod, P0A9A3_A69ArtDsc, P0A9A3_n69ArtDsc, P0A9A3_A279CliNom,
            P0A9A3_A252CliCod
            }
            , new Object[] {
            P0A9A4_A396EmprCod, P0A9A4_A10045CliAct, P0A9A4_A69ArtDsc, P0A9A4_n69ArtDsc, P0A9A4_A14295ArtActivo, P0A9A4_A5741ArtComer, P0A9A4_n5741ArtComer, P0A9A4_A63ArtAcaMin, P0A9A4_n63ArtAcaMin, P0A9A4_A95ArtRen,
            P0A9A4_n95ArtRen, P0A9A4_A1903ArtGraAca, P0A9A4_n1903ArtGraAca, P0A9A4_A1148ArtPml, P0A9A4_n1148ArtPml, P0A9A4_A830TipArtDsc, P0A9A4_n830TipArtDsc, P0A9A4_A829TipArtCod, P0A9A4_A65ArtCod, P0A9A4_A279CliNom,
            P0A9A4_A252CliCod
            }
            , new Object[] {
            P0A9A5_A829TipArtCod, P0A9A5_A396EmprCod, P0A9A5_A10045CliAct, P0A9A5_A14295ArtActivo, P0A9A5_A5741ArtComer, P0A9A5_n5741ArtComer, P0A9A5_A63ArtAcaMin, P0A9A5_n63ArtAcaMin, P0A9A5_A95ArtRen, P0A9A5_n95ArtRen,
            P0A9A5_A1903ArtGraAca, P0A9A5_n1903ArtGraAca, P0A9A5_A1148ArtPml, P0A9A5_n1148ArtPml, P0A9A5_A830TipArtDsc, P0A9A5_n830TipArtDsc, P0A9A5_A69ArtDsc, P0A9A5_n69ArtDsc, P0A9A5_A65ArtCod, P0A9A5_A279CliNom,
            P0A9A5_A252CliCod
            }
            , new Object[] {
            P0A9A6_A396EmprCod, P0A9A6_A10045CliAct, P0A9A6_A5741ArtComer, P0A9A6_n5741ArtComer, P0A9A6_A14295ArtActivo, P0A9A6_A63ArtAcaMin, P0A9A6_n63ArtAcaMin, P0A9A6_A95ArtRen, P0A9A6_n95ArtRen, P0A9A6_A1903ArtGraAca,
            P0A9A6_n1903ArtGraAca, P0A9A6_A1148ArtPml, P0A9A6_n1148ArtPml, P0A9A6_A830TipArtDsc, P0A9A6_n830TipArtDsc, P0A9A6_A829TipArtCod, P0A9A6_A69ArtDsc, P0A9A6_n69ArtDsc, P0A9A6_A65ArtCod, P0A9A6_A279CliNom,
            P0A9A6_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18TFTipArtCod ;
   private short AV19TFTipArtCod_To ;
   private short AV22TFArtPml ;
   private short AV23TFArtPml_To ;
   private short AV24TFArtGraAca ;
   private short AV25TFArtGraAca_To ;
   private short AV28TFArtAcaMin ;
   private short AV29TFArtAcaMin_To ;
   private short AV65Tarticu_wwds_10_tftipartcod ;
   private short AV66Tarticu_wwds_11_tftipartcod_to ;
   private short AV69Tarticu_wwds_14_tfartpml ;
   private short AV70Tarticu_wwds_15_tfartpml_to ;
   private short AV71Tarticu_wwds_16_tfartgraaca ;
   private short AV72Tarticu_wwds_17_tfartgraaca_to ;
   private short AV75Tarticu_wwds_20_tfartacamin ;
   private short AV76Tarticu_wwds_21_tfartacamin_to ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV57Tarticu_wwds_2_tfclicod ;
   private int AV58Tarticu_wwds_3_tfclicod_to ;
   private int A252CliCod ;
   private int AV32InsertIndex ;
   private long AV38count ;
   private java.math.BigDecimal AV26TFArtRen ;
   private java.math.BigDecimal AV27TFArtRen_To ;
   private java.math.BigDecimal AV73Tarticu_wwds_18_tfartren ;
   private java.math.BigDecimal AV74Tarticu_wwds_19_tfartren_to ;
   private java.math.BigDecimal A95ArtRen ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV16TFArtDsc ;
   private String AV17TFArtDsc_Sel ;
   private String AV20TFTipArtDsc ;
   private String AV21TFTipArtDsc_Sel ;
   private String AV30TFArtComer ;
   private String AV31TFArtComer_Sel ;
   private String AV51TFArtActivo_Sel ;
   private String A279CliNom ;
   private String AV59Tarticu_wwds_4_tfclinom ;
   private String AV60Tarticu_wwds_5_tfclinom_sel ;
   private String AV61Tarticu_wwds_6_tfartcod ;
   private String AV62Tarticu_wwds_7_tfartcod_sel ;
   private String AV63Tarticu_wwds_8_tfartdsc ;
   private String AV64Tarticu_wwds_9_tfartdsc_sel ;
   private String AV67Tarticu_wwds_12_tftipartdsc ;
   private String AV68Tarticu_wwds_13_tftipartdsc_sel ;
   private String AV77Tarticu_wwds_22_tfartcomer ;
   private String AV78Tarticu_wwds_23_tfartcomer_sel ;
   private String AV79Tarticu_wwds_24_tfartactivo_sel ;
   private String scmdbuf ;
   private String lV59Tarticu_wwds_4_tfclinom ;
   private String lV61Tarticu_wwds_6_tfartcod ;
   private String lV63Tarticu_wwds_8_tfartdsc ;
   private String lV67Tarticu_wwds_12_tftipartdsc ;
   private String lV77Tarticu_wwds_22_tfartcomer ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String A14295ArtActivo ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA9A2 ;
   private boolean n5741ArtComer ;
   private boolean n63ArtAcaMin ;
   private boolean n95ArtRen ;
   private boolean n1903ArtGraAca ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean brkA9A4 ;
   private boolean brkA9A6 ;
   private boolean brkA9A8 ;
   private boolean brkA9A10 ;
   private String AV47OptionsJson ;
   private String AV48OptionsDescJson ;
   private String AV49OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV45SearchTxt ;
   private String AV46SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV56Tarticu_wwds_1_filterfulltext ;
   private String lV56Tarticu_wwds_1_filterfulltext ;
   private String AV33Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9A2_A396EmprCod ;
   private String[] P0A9A2_A10045CliAct ;
   private String[] P0A9A2_A279CliNom ;
   private String[] P0A9A2_A14295ArtActivo ;
   private String[] P0A9A2_A5741ArtComer ;
   private boolean[] P0A9A2_n5741ArtComer ;
   private short[] P0A9A2_A63ArtAcaMin ;
   private boolean[] P0A9A2_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9A2_A95ArtRen ;
   private boolean[] P0A9A2_n95ArtRen ;
   private short[] P0A9A2_A1903ArtGraAca ;
   private boolean[] P0A9A2_n1903ArtGraAca ;
   private short[] P0A9A2_A1148ArtPml ;
   private boolean[] P0A9A2_n1148ArtPml ;
   private String[] P0A9A2_A830TipArtDsc ;
   private boolean[] P0A9A2_n830TipArtDsc ;
   private short[] P0A9A2_A829TipArtCod ;
   private String[] P0A9A2_A69ArtDsc ;
   private boolean[] P0A9A2_n69ArtDsc ;
   private String[] P0A9A2_A65ArtCod ;
   private int[] P0A9A2_A252CliCod ;
   private String[] P0A9A3_A396EmprCod ;
   private String[] P0A9A3_A10045CliAct ;
   private String[] P0A9A3_A65ArtCod ;
   private String[] P0A9A3_A14295ArtActivo ;
   private String[] P0A9A3_A5741ArtComer ;
   private boolean[] P0A9A3_n5741ArtComer ;
   private short[] P0A9A3_A63ArtAcaMin ;
   private boolean[] P0A9A3_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9A3_A95ArtRen ;
   private boolean[] P0A9A3_n95ArtRen ;
   private short[] P0A9A3_A1903ArtGraAca ;
   private boolean[] P0A9A3_n1903ArtGraAca ;
   private short[] P0A9A3_A1148ArtPml ;
   private boolean[] P0A9A3_n1148ArtPml ;
   private String[] P0A9A3_A830TipArtDsc ;
   private boolean[] P0A9A3_n830TipArtDsc ;
   private short[] P0A9A3_A829TipArtCod ;
   private String[] P0A9A3_A69ArtDsc ;
   private boolean[] P0A9A3_n69ArtDsc ;
   private String[] P0A9A3_A279CliNom ;
   private int[] P0A9A3_A252CliCod ;
   private String[] P0A9A4_A396EmprCod ;
   private String[] P0A9A4_A10045CliAct ;
   private String[] P0A9A4_A69ArtDsc ;
   private boolean[] P0A9A4_n69ArtDsc ;
   private String[] P0A9A4_A14295ArtActivo ;
   private String[] P0A9A4_A5741ArtComer ;
   private boolean[] P0A9A4_n5741ArtComer ;
   private short[] P0A9A4_A63ArtAcaMin ;
   private boolean[] P0A9A4_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9A4_A95ArtRen ;
   private boolean[] P0A9A4_n95ArtRen ;
   private short[] P0A9A4_A1903ArtGraAca ;
   private boolean[] P0A9A4_n1903ArtGraAca ;
   private short[] P0A9A4_A1148ArtPml ;
   private boolean[] P0A9A4_n1148ArtPml ;
   private String[] P0A9A4_A830TipArtDsc ;
   private boolean[] P0A9A4_n830TipArtDsc ;
   private short[] P0A9A4_A829TipArtCod ;
   private String[] P0A9A4_A65ArtCod ;
   private String[] P0A9A4_A279CliNom ;
   private int[] P0A9A4_A252CliCod ;
   private short[] P0A9A5_A829TipArtCod ;
   private String[] P0A9A5_A396EmprCod ;
   private String[] P0A9A5_A10045CliAct ;
   private String[] P0A9A5_A14295ArtActivo ;
   private String[] P0A9A5_A5741ArtComer ;
   private boolean[] P0A9A5_n5741ArtComer ;
   private short[] P0A9A5_A63ArtAcaMin ;
   private boolean[] P0A9A5_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9A5_A95ArtRen ;
   private boolean[] P0A9A5_n95ArtRen ;
   private short[] P0A9A5_A1903ArtGraAca ;
   private boolean[] P0A9A5_n1903ArtGraAca ;
   private short[] P0A9A5_A1148ArtPml ;
   private boolean[] P0A9A5_n1148ArtPml ;
   private String[] P0A9A5_A830TipArtDsc ;
   private boolean[] P0A9A5_n830TipArtDsc ;
   private String[] P0A9A5_A69ArtDsc ;
   private boolean[] P0A9A5_n69ArtDsc ;
   private String[] P0A9A5_A65ArtCod ;
   private String[] P0A9A5_A279CliNom ;
   private int[] P0A9A5_A252CliCod ;
   private String[] P0A9A6_A396EmprCod ;
   private String[] P0A9A6_A10045CliAct ;
   private String[] P0A9A6_A5741ArtComer ;
   private boolean[] P0A9A6_n5741ArtComer ;
   private String[] P0A9A6_A14295ArtActivo ;
   private short[] P0A9A6_A63ArtAcaMin ;
   private boolean[] P0A9A6_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9A6_A95ArtRen ;
   private boolean[] P0A9A6_n95ArtRen ;
   private short[] P0A9A6_A1903ArtGraAca ;
   private boolean[] P0A9A6_n1903ArtGraAca ;
   private short[] P0A9A6_A1148ArtPml ;
   private boolean[] P0A9A6_n1148ArtPml ;
   private String[] P0A9A6_A830TipArtDsc ;
   private boolean[] P0A9A6_n830TipArtDsc ;
   private short[] P0A9A6_A829TipArtCod ;
   private String[] P0A9A6_A69ArtDsc ;
   private boolean[] P0A9A6_n69ArtDsc ;
   private String[] P0A9A6_A65ArtCod ;
   private String[] P0A9A6_A279CliNom ;
   private int[] P0A9A6_A252CliCod ;
   private GXSimpleCollection<String> AV34Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV37OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class tarticu_wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Tarticu_wwds_1_filterfulltext ,
                                          int AV57Tarticu_wwds_2_tfclicod ,
                                          int AV58Tarticu_wwds_3_tfclicod_to ,
                                          String AV60Tarticu_wwds_5_tfclinom_sel ,
                                          String AV59Tarticu_wwds_4_tfclinom ,
                                          String AV62Tarticu_wwds_7_tfartcod_sel ,
                                          String AV61Tarticu_wwds_6_tfartcod ,
                                          String AV64Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV63Tarticu_wwds_8_tfartdsc ,
                                          short AV65Tarticu_wwds_10_tftipartcod ,
                                          short AV66Tarticu_wwds_11_tftipartcod_to ,
                                          String AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV67Tarticu_wwds_12_tftipartdsc ,
                                          short AV69Tarticu_wwds_14_tfartpml ,
                                          short AV70Tarticu_wwds_15_tfartpml_to ,
                                          short AV71Tarticu_wwds_16_tfartgraaca ,
                                          short AV72Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV73Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV74Tarticu_wwds_19_tfartren_to ,
                                          short AV75Tarticu_wwds_20_tfartacamin ,
                                          short AV76Tarticu_wwds_21_tfartacamin_to ,
                                          String AV78Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV77Tarticu_wwds_22_tfartcomer ,
                                          String AV79Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T3.CliNom, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod," ;
      scmdbuf += " T1.CliCod FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV56Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV70Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV71Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV75Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A9A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Tarticu_wwds_1_filterfulltext ,
                                          int AV57Tarticu_wwds_2_tfclicod ,
                                          int AV58Tarticu_wwds_3_tfclicod_to ,
                                          String AV60Tarticu_wwds_5_tfclinom_sel ,
                                          String AV59Tarticu_wwds_4_tfclinom ,
                                          String AV62Tarticu_wwds_7_tfartcod_sel ,
                                          String AV61Tarticu_wwds_6_tfartcod ,
                                          String AV64Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV63Tarticu_wwds_8_tfartdsc ,
                                          short AV65Tarticu_wwds_10_tftipartcod ,
                                          short AV66Tarticu_wwds_11_tftipartcod_to ,
                                          String AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV67Tarticu_wwds_12_tftipartdsc ,
                                          short AV69Tarticu_wwds_14_tfartpml ,
                                          short AV70Tarticu_wwds_15_tfartpml_to ,
                                          short AV71Tarticu_wwds_16_tfartgraaca ,
                                          short AV72Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV73Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV74Tarticu_wwds_19_tfartren_to ,
                                          short AV75Tarticu_wwds_20_tfartacamin ,
                                          short AV76Tarticu_wwds_21_tfartacamin_to ,
                                          String AV78Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV77Tarticu_wwds_22_tfartcomer ,
                                          String AV79Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[34];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtCod, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T3.CliNom," ;
      scmdbuf += " T1.CliCod FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV56Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV70Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV71Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV75Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A9A4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Tarticu_wwds_1_filterfulltext ,
                                          int AV57Tarticu_wwds_2_tfclicod ,
                                          int AV58Tarticu_wwds_3_tfclicod_to ,
                                          String AV60Tarticu_wwds_5_tfclinom_sel ,
                                          String AV59Tarticu_wwds_4_tfclinom ,
                                          String AV62Tarticu_wwds_7_tfartcod_sel ,
                                          String AV61Tarticu_wwds_6_tfartcod ,
                                          String AV64Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV63Tarticu_wwds_8_tfartdsc ,
                                          short AV65Tarticu_wwds_10_tftipartcod ,
                                          short AV66Tarticu_wwds_11_tftipartcod_to ,
                                          String AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV67Tarticu_wwds_12_tftipartdsc ,
                                          short AV69Tarticu_wwds_14_tfartpml ,
                                          short AV70Tarticu_wwds_15_tfartpml_to ,
                                          short AV71Tarticu_wwds_16_tfartgraaca ,
                                          short AV72Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV73Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV74Tarticu_wwds_19_tfartren_to ,
                                          short AV75Tarticu_wwds_20_tfartacamin ,
                                          short AV76Tarticu_wwds_21_tfartacamin_to ,
                                          String AV78Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV77Tarticu_wwds_22_tfartcomer ,
                                          String AV79Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtDsc, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtCod, T3.CliNom," ;
      scmdbuf += " T1.CliCod FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV56Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV70Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV71Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV75Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A9A5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Tarticu_wwds_1_filterfulltext ,
                                          int AV57Tarticu_wwds_2_tfclicod ,
                                          int AV58Tarticu_wwds_3_tfclicod_to ,
                                          String AV60Tarticu_wwds_5_tfclinom_sel ,
                                          String AV59Tarticu_wwds_4_tfclinom ,
                                          String AV62Tarticu_wwds_7_tfartcod_sel ,
                                          String AV61Tarticu_wwds_6_tfartcod ,
                                          String AV64Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV63Tarticu_wwds_8_tfartdsc ,
                                          short AV65Tarticu_wwds_10_tftipartcod ,
                                          short AV66Tarticu_wwds_11_tftipartcod_to ,
                                          String AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV67Tarticu_wwds_12_tftipartdsc ,
                                          short AV69Tarticu_wwds_14_tfartpml ,
                                          short AV70Tarticu_wwds_15_tfartpml_to ,
                                          short AV71Tarticu_wwds_16_tfartgraaca ,
                                          short AV72Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV73Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV74Tarticu_wwds_19_tfartren_to ,
                                          short AV75Tarticu_wwds_20_tfartacamin ,
                                          short AV76Tarticu_wwds_21_tfartacamin_to ,
                                          String AV78Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV77Tarticu_wwds_22_tfartcomer ,
                                          String AV79Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TipArtCod, T1.EmprCod, T3.CliAct, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.ArtDsc, T1.ArtCod, T3.CliNom," ;
      scmdbuf += " T1.CliCod FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV56Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV70Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV71Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV75Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipArtCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A9A6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Tarticu_wwds_1_filterfulltext ,
                                          int AV57Tarticu_wwds_2_tfclicod ,
                                          int AV58Tarticu_wwds_3_tfclicod_to ,
                                          String AV60Tarticu_wwds_5_tfclinom_sel ,
                                          String AV59Tarticu_wwds_4_tfclinom ,
                                          String AV62Tarticu_wwds_7_tfartcod_sel ,
                                          String AV61Tarticu_wwds_6_tfartcod ,
                                          String AV64Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV63Tarticu_wwds_8_tfartdsc ,
                                          short AV65Tarticu_wwds_10_tftipartcod ,
                                          short AV66Tarticu_wwds_11_tftipartcod_to ,
                                          String AV68Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV67Tarticu_wwds_12_tftipartdsc ,
                                          short AV69Tarticu_wwds_14_tfartpml ,
                                          short AV70Tarticu_wwds_15_tfartpml_to ,
                                          short AV71Tarticu_wwds_16_tfartgraaca ,
                                          short AV72Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV73Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV74Tarticu_wwds_19_tfartren_to ,
                                          short AV75Tarticu_wwds_20_tfartacamin ,
                                          short AV76Tarticu_wwds_21_tfartacamin_to ,
                                          String AV78Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV77Tarticu_wwds_22_tfartcomer ,
                                          String AV79Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[34];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtComer, T1.ArtActivo, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T3.CliNom," ;
      scmdbuf += " T1.CliCod FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV56Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV70Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV71Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV72Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV75Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV77Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtComer" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P0A9A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P0A9A3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P0A9A4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 3 :
                  return conditional_P0A9A5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 4 :
                  return conditional_P0A9A6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9A4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9A5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9A6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 16);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 16);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 16);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((int[]) buf[20])[0] = rslt.getInt(14);
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
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
      }
   }

}

