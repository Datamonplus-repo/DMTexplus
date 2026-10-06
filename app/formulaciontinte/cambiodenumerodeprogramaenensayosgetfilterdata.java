package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiodenumerodeprogramaenensayosgetfilterdata extends GXProcedure
{
   public cambiodenumerodeprogramaenensayosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiodenumerodeprogramaenensayosgetfilterdata.class ), "" );
   }

   public cambiodenumerodeprogramaenensayosgetfilterdata( int remoteHandle ,
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
      cambiodenumerodeprogramaenensayosgetfilterdata.this.aP5 = new String[] {""};
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
      cambiodenumerodeprogramaenensayosgetfilterdata.this.AV34DDOName = aP0;
      cambiodenumerodeprogramaenensayosgetfilterdata.this.AV32SearchTxt = aP1;
      cambiodenumerodeprogramaenensayosgetfilterdata.this.AV33SearchTxtTo = aP2;
      cambiodenumerodeprogramaenensayosgetfilterdata.this.aP3 = aP3;
      cambiodenumerodeprogramaenensayosgetfilterdata.this.aP4 = aP4;
      cambiodenumerodeprogramaenensayosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_LB_ARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_LB_ARTDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_LB_TIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_TIPARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_LB_COLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_TIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPCOLDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("FormulacionTinte.CambiodeNumerodeProgramaenEnsayosGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CambiodeNumerodeProgramaenEnsayosGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("FormulacionTinte.CambiodeNumerodeProgramaenEnsayosGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV10TFLb_numero = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLb_numero_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV16TFLb_ArtCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV17TFLb_ArtCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV18TFLb_ArtDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV19TFLb_ArtDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPART") == 0 )
         {
            AV20TFLb_TipArt = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFLb_TipArt_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPARTDSC") == 0 )
         {
            AV22TFLb_TipArtDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPARTDSC_SEL") == 0 )
         {
            AV23TFLb_TipArtDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV24TFLb_ColNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV25TFLb_ColNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV26TFLb_ColNum = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFLb_ColNum_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV28TFTipColCod = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFTipColCod_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV30TFTipColDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV31TFTipColDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV32SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV50FilterFullText ;
      AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV12TFCliCod ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV14TFCliNom ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV20TFLb_TipArt ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV21TFLb_TipArt_To ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV22TFLb_TipArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV23TFLb_TipArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV24TFLb_ColNom ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV26TFLb_ColNum ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV28TFTipColCod ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV29TFTipColCod_To ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV30TFTipColDsc ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV51MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor P09CJ2 */
      pr_default.execute(0, new Object[] {AV51MacProCod, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9CJ2 = false ;
         A396EmprCod = P09CJ2_A396EmprCod[0] ;
         A1514MacProCod = P09CJ2_A1514MacProCod[0] ;
         n1514MacProCod = P09CJ2_n1514MacProCod[0] ;
         A279CliNom = P09CJ2_A279CliNom[0] ;
         A832TipColDsc = P09CJ2_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ2_n832TipColDsc[0] ;
         A831TipColCod = P09CJ2_A831TipColCod[0] ;
         n831TipColCod = P09CJ2_n831TipColCod[0] ;
         A5537Lb_ColNum = P09CJ2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09CJ2_A5536Lb_ColNom[0] ;
         A5552Lb_TipArtD = P09CJ2_A5552Lb_TipArtD[0] ;
         A5535Lb_TipArt = P09CJ2_A5535Lb_TipArt[0] ;
         A5534Lb_ArtDsc = P09CJ2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09CJ2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09CJ2_A252CliCod[0] ;
         A5532Lb_numero = P09CJ2_A5532Lb_numero[0] ;
         A832TipColDsc = P09CJ2_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ2_n832TipColDsc[0] ;
         A279CliNom = P09CJ2_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09CJ2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9CJ2 = false ;
            A396EmprCod = P09CJ2_A396EmprCod[0] ;
            A252CliCod = P09CJ2_A252CliCod[0] ;
            A5532Lb_numero = P09CJ2_A5532Lb_numero[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9CJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV36Option = A279CliNom ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CJ2 )
         {
            brk9CJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLb_ArtCod = AV32SearchTxt ;
      AV17TFLb_ArtCod_Sel = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV50FilterFullText ;
      AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV12TFCliCod ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV14TFCliNom ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV20TFLb_TipArt ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV21TFLb_TipArt_To ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV22TFLb_TipArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV23TFLb_TipArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV24TFLb_ColNom ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV26TFLb_ColNum ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV28TFTipColCod ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV29TFTipColCod_To ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV30TFTipColDsc ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV51MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor P09CJ3 */
      pr_default.execute(1, new Object[] {AV51MacProCod, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9CJ4 = false ;
         A396EmprCod = P09CJ3_A396EmprCod[0] ;
         A1514MacProCod = P09CJ3_A1514MacProCod[0] ;
         n1514MacProCod = P09CJ3_n1514MacProCod[0] ;
         A5533Lb_ArtCod = P09CJ3_A5533Lb_ArtCod[0] ;
         A832TipColDsc = P09CJ3_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ3_n832TipColDsc[0] ;
         A831TipColCod = P09CJ3_A831TipColCod[0] ;
         n831TipColCod = P09CJ3_n831TipColCod[0] ;
         A5537Lb_ColNum = P09CJ3_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09CJ3_A5536Lb_ColNom[0] ;
         A5552Lb_TipArtD = P09CJ3_A5552Lb_TipArtD[0] ;
         A5535Lb_TipArt = P09CJ3_A5535Lb_TipArt[0] ;
         A5534Lb_ArtDsc = P09CJ3_A5534Lb_ArtDsc[0] ;
         A279CliNom = P09CJ3_A279CliNom[0] ;
         A252CliCod = P09CJ3_A252CliCod[0] ;
         A5532Lb_numero = P09CJ3_A5532Lb_numero[0] ;
         A832TipColDsc = P09CJ3_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ3_n832TipColDsc[0] ;
         A279CliNom = P09CJ3_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09CJ3_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9CJ4 = false ;
            A396EmprCod = P09CJ3_A396EmprCod[0] ;
            A5532Lb_numero = P09CJ3_A5532Lb_numero[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9CJ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV36Option = A5533Lb_ArtCod ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CJ4 )
         {
            brk9CJ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_ARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFLb_ArtDsc = AV32SearchTxt ;
      AV19TFLb_ArtDsc_Sel = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV50FilterFullText ;
      AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV12TFCliCod ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV14TFCliNom ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV20TFLb_TipArt ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV21TFLb_TipArt_To ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV22TFLb_TipArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV23TFLb_TipArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV24TFLb_ColNom ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV26TFLb_ColNum ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV28TFTipColCod ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV29TFTipColCod_To ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV30TFTipColDsc ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV51MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor P09CJ4 */
      pr_default.execute(2, new Object[] {AV51MacProCod, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9CJ6 = false ;
         A396EmprCod = P09CJ4_A396EmprCod[0] ;
         A1514MacProCod = P09CJ4_A1514MacProCod[0] ;
         n1514MacProCod = P09CJ4_n1514MacProCod[0] ;
         A5534Lb_ArtDsc = P09CJ4_A5534Lb_ArtDsc[0] ;
         A832TipColDsc = P09CJ4_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ4_n832TipColDsc[0] ;
         A831TipColCod = P09CJ4_A831TipColCod[0] ;
         n831TipColCod = P09CJ4_n831TipColCod[0] ;
         A5537Lb_ColNum = P09CJ4_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09CJ4_A5536Lb_ColNom[0] ;
         A5552Lb_TipArtD = P09CJ4_A5552Lb_TipArtD[0] ;
         A5535Lb_TipArt = P09CJ4_A5535Lb_TipArt[0] ;
         A5533Lb_ArtCod = P09CJ4_A5533Lb_ArtCod[0] ;
         A279CliNom = P09CJ4_A279CliNom[0] ;
         A252CliCod = P09CJ4_A252CliCod[0] ;
         A5532Lb_numero = P09CJ4_A5532Lb_numero[0] ;
         A832TipColDsc = P09CJ4_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ4_n832TipColDsc[0] ;
         A279CliNom = P09CJ4_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09CJ4_A5534Lb_ArtDsc[0], A5534Lb_ArtDsc) == 0 ) )
         {
            brk9CJ6 = false ;
            A396EmprCod = P09CJ4_A396EmprCod[0] ;
            A5532Lb_numero = P09CJ4_A5532Lb_numero[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9CJ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5534Lb_ArtDsc)==0) )
         {
            AV36Option = A5534Lb_ArtDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CJ6 )
         {
            brk9CJ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_TIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLb_TipArtDsc = AV32SearchTxt ;
      AV23TFLb_TipArtDsc_Sel = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV50FilterFullText ;
      AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV12TFCliCod ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV14TFCliNom ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV20TFLb_TipArt ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV21TFLb_TipArt_To ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV22TFLb_TipArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV23TFLb_TipArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV24TFLb_ColNom ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV26TFLb_ColNum ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV28TFTipColCod ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV29TFTipColCod_To ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV30TFTipColDsc ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV51MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor P09CJ5 */
      pr_default.execute(3, new Object[] {AV51MacProCod, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9CJ8 = false ;
         A396EmprCod = P09CJ5_A396EmprCod[0] ;
         A1514MacProCod = P09CJ5_A1514MacProCod[0] ;
         n1514MacProCod = P09CJ5_n1514MacProCod[0] ;
         A5552Lb_TipArtD = P09CJ5_A5552Lb_TipArtD[0] ;
         A832TipColDsc = P09CJ5_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ5_n832TipColDsc[0] ;
         A831TipColCod = P09CJ5_A831TipColCod[0] ;
         n831TipColCod = P09CJ5_n831TipColCod[0] ;
         A5537Lb_ColNum = P09CJ5_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09CJ5_A5536Lb_ColNom[0] ;
         A5535Lb_TipArt = P09CJ5_A5535Lb_TipArt[0] ;
         A5534Lb_ArtDsc = P09CJ5_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09CJ5_A5533Lb_ArtCod[0] ;
         A279CliNom = P09CJ5_A279CliNom[0] ;
         A252CliCod = P09CJ5_A252CliCod[0] ;
         A5532Lb_numero = P09CJ5_A5532Lb_numero[0] ;
         A832TipColDsc = P09CJ5_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ5_n832TipColDsc[0] ;
         A279CliNom = P09CJ5_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09CJ5_A5552Lb_TipArtD[0], A5552Lb_TipArtD) == 0 ) )
         {
            brk9CJ8 = false ;
            A396EmprCod = P09CJ5_A396EmprCod[0] ;
            A5532Lb_numero = P09CJ5_A5532Lb_numero[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9CJ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5552Lb_TipArtD)==0) )
         {
            AV36Option = A5552Lb_TipArtD ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CJ8 )
         {
            brk9CJ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_COLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFLb_ColNom = AV32SearchTxt ;
      AV25TFLb_ColNom_Sel = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV50FilterFullText ;
      AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV12TFCliCod ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV14TFCliNom ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV20TFLb_TipArt ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV21TFLb_TipArt_To ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV22TFLb_TipArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV23TFLb_TipArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV24TFLb_ColNom ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV26TFLb_ColNum ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV28TFTipColCod ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV29TFTipColCod_To ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV30TFTipColDsc ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV51MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor P09CJ6 */
      pr_default.execute(4, new Object[] {AV51MacProCod, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9CJ10 = false ;
         A396EmprCod = P09CJ6_A396EmprCod[0] ;
         A1514MacProCod = P09CJ6_A1514MacProCod[0] ;
         n1514MacProCod = P09CJ6_n1514MacProCod[0] ;
         A5536Lb_ColNom = P09CJ6_A5536Lb_ColNom[0] ;
         A832TipColDsc = P09CJ6_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ6_n832TipColDsc[0] ;
         A831TipColCod = P09CJ6_A831TipColCod[0] ;
         n831TipColCod = P09CJ6_n831TipColCod[0] ;
         A5537Lb_ColNum = P09CJ6_A5537Lb_ColNum[0] ;
         A5552Lb_TipArtD = P09CJ6_A5552Lb_TipArtD[0] ;
         A5535Lb_TipArt = P09CJ6_A5535Lb_TipArt[0] ;
         A5534Lb_ArtDsc = P09CJ6_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09CJ6_A5533Lb_ArtCod[0] ;
         A279CliNom = P09CJ6_A279CliNom[0] ;
         A252CliCod = P09CJ6_A252CliCod[0] ;
         A5532Lb_numero = P09CJ6_A5532Lb_numero[0] ;
         A832TipColDsc = P09CJ6_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ6_n832TipColDsc[0] ;
         A279CliNom = P09CJ6_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09CJ6_A5536Lb_ColNom[0], A5536Lb_ColNom) == 0 ) )
         {
            brk9CJ10 = false ;
            A396EmprCod = P09CJ6_A396EmprCod[0] ;
            A5532Lb_numero = P09CJ6_A5532Lb_numero[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9CJ10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5536Lb_ColNom)==0) )
         {
            AV36Option = A5536Lb_ColNom ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CJ10 )
         {
            brk9CJ10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFTipColDsc = AV32SearchTxt ;
      AV31TFTipColDsc_Sel = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = AV50FilterFullText ;
      AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero = AV10TFLb_numero ;
      AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod = AV12TFCliCod ;
      AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to = AV13TFCliCod_To ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = AV14TFCliNom ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = AV15TFCliNom_Sel ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = AV16TFLb_ArtCod ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = AV17TFLb_ArtCod_Sel ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = AV18TFLb_ArtDsc ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = AV19TFLb_ArtDsc_Sel ;
      AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart = AV20TFLb_TipArt ;
      AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to = AV21TFLb_TipArt_To ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = AV22TFLb_TipArtDsc ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = AV23TFLb_TipArtDsc_Sel ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = AV24TFLb_ColNom ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = AV25TFLb_ColNom_Sel ;
      AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum = AV26TFLb_ColNum ;
      AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to = AV27TFLb_ColNum_To ;
      AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod = AV28TFTipColCod ;
      AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to = AV29TFTipColCod_To ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = AV30TFTipColDsc ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = AV31TFTipColDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) ,
                                           AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                           AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                           AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                           AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                           AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                           AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                           Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) ,
                                           Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) ,
                                           AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                           AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                           AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                           AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                           Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) ,
                                           Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) ,
                                           Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) ,
                                           AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                           AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           Short.valueOf(A5535Lb_TipArt) ,
                                           A5552Lb_TipArtD ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A1514MacProCod ,
                                           AV51MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom), 30, "%") ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod), 16, "%") ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc), 26, "%") ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc), 30, "%") ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom), 13, "%") ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc), 30, "%") ;
      /* Using cursor P09CJ7 */
      pr_default.execute(5, new Object[] {AV51MacProCod, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext, Integer.valueOf(AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero), Integer.valueOf(AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to), Integer.valueOf(AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod), Integer.valueOf(AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to), lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom, AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel, lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod, AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel, lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc, AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel, Short.valueOf(AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart), Short.valueOf(AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to), lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc, AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel, lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom, AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel, Integer.valueOf(AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum), Integer.valueOf(AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to), Byte.valueOf(AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod), Byte.valueOf(AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to), lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc, AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9CJ12 = false ;
         A831TipColCod = P09CJ7_A831TipColCod[0] ;
         n831TipColCod = P09CJ7_n831TipColCod[0] ;
         A396EmprCod = P09CJ7_A396EmprCod[0] ;
         A1514MacProCod = P09CJ7_A1514MacProCod[0] ;
         n1514MacProCod = P09CJ7_n1514MacProCod[0] ;
         A832TipColDsc = P09CJ7_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ7_n832TipColDsc[0] ;
         A5537Lb_ColNum = P09CJ7_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09CJ7_A5536Lb_ColNom[0] ;
         A5552Lb_TipArtD = P09CJ7_A5552Lb_TipArtD[0] ;
         A5535Lb_TipArt = P09CJ7_A5535Lb_TipArt[0] ;
         A5534Lb_ArtDsc = P09CJ7_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09CJ7_A5533Lb_ArtCod[0] ;
         A279CliNom = P09CJ7_A279CliNom[0] ;
         A252CliCod = P09CJ7_A252CliCod[0] ;
         A5532Lb_numero = P09CJ7_A5532Lb_numero[0] ;
         A832TipColDsc = P09CJ7_A832TipColDsc[0] ;
         n832TipColDsc = P09CJ7_n832TipColDsc[0] ;
         A279CliNom = P09CJ7_A279CliNom[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09CJ7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09CJ7_A831TipColCod[0] == A831TipColCod ) )
         {
            brk9CJ12 = false ;
            A5532Lb_numero = P09CJ7_A5532Lb_numero[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9CJ12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV36Option = A832TipColDsc ;
            AV35InsertIndex = 1 ;
            while ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) < 0 ) )
            {
               AV35InsertIndex = (int)(AV35InsertIndex+1) ;
            }
            AV37Options.add(AV36Option, AV35InsertIndex);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV35InsertIndex);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CJ12 )
         {
            brk9CJ12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cambiodenumerodeprogramaenensayosgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = cambiodenumerodeprogramaenensayosgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = cambiodenumerodeprogramaenensayosgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV16TFLb_ArtCod = "" ;
      AV17TFLb_ArtCod_Sel = "" ;
      AV18TFLb_ArtDsc = "" ;
      AV19TFLb_ArtDsc_Sel = "" ;
      AV22TFLb_TipArtDsc = "" ;
      AV23TFLb_TipArtDsc_Sel = "" ;
      AV24TFLb_ColNom = "" ;
      AV25TFLb_ColNom_Sel = "" ;
      AV30TFTipColDsc = "" ;
      AV31TFTipColDsc_Sel = "" ;
      A279CliNom = "" ;
      AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = "" ;
      AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = "" ;
      AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel = "" ;
      AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = "" ;
      AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel = "" ;
      AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = "" ;
      AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel = "" ;
      AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = "" ;
      AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel = "" ;
      AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = "" ;
      AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel = "" ;
      AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = "" ;
      AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext = "" ;
      lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom = "" ;
      lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod = "" ;
      lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc = "" ;
      lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc = "" ;
      lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom = "" ;
      lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5552Lb_TipArtD = "" ;
      A5536Lb_ColNom = "" ;
      A832TipColDsc = "" ;
      A1514MacProCod = "" ;
      AV51MacProCod = "" ;
      P09CJ2_A396EmprCod = new String[] {""} ;
      P09CJ2_A1514MacProCod = new String[] {""} ;
      P09CJ2_n1514MacProCod = new boolean[] {false} ;
      P09CJ2_A279CliNom = new String[] {""} ;
      P09CJ2_A832TipColDsc = new String[] {""} ;
      P09CJ2_n832TipColDsc = new boolean[] {false} ;
      P09CJ2_A831TipColCod = new byte[1] ;
      P09CJ2_n831TipColCod = new boolean[] {false} ;
      P09CJ2_A5537Lb_ColNum = new int[1] ;
      P09CJ2_A5536Lb_ColNom = new String[] {""} ;
      P09CJ2_A5552Lb_TipArtD = new String[] {""} ;
      P09CJ2_A5535Lb_TipArt = new short[1] ;
      P09CJ2_A5534Lb_ArtDsc = new String[] {""} ;
      P09CJ2_A5533Lb_ArtCod = new String[] {""} ;
      P09CJ2_A252CliCod = new int[1] ;
      P09CJ2_A5532Lb_numero = new int[1] ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      P09CJ3_A396EmprCod = new String[] {""} ;
      P09CJ3_A1514MacProCod = new String[] {""} ;
      P09CJ3_n1514MacProCod = new boolean[] {false} ;
      P09CJ3_A5533Lb_ArtCod = new String[] {""} ;
      P09CJ3_A832TipColDsc = new String[] {""} ;
      P09CJ3_n832TipColDsc = new boolean[] {false} ;
      P09CJ3_A831TipColCod = new byte[1] ;
      P09CJ3_n831TipColCod = new boolean[] {false} ;
      P09CJ3_A5537Lb_ColNum = new int[1] ;
      P09CJ3_A5536Lb_ColNom = new String[] {""} ;
      P09CJ3_A5552Lb_TipArtD = new String[] {""} ;
      P09CJ3_A5535Lb_TipArt = new short[1] ;
      P09CJ3_A5534Lb_ArtDsc = new String[] {""} ;
      P09CJ3_A279CliNom = new String[] {""} ;
      P09CJ3_A252CliCod = new int[1] ;
      P09CJ3_A5532Lb_numero = new int[1] ;
      P09CJ4_A396EmprCod = new String[] {""} ;
      P09CJ4_A1514MacProCod = new String[] {""} ;
      P09CJ4_n1514MacProCod = new boolean[] {false} ;
      P09CJ4_A5534Lb_ArtDsc = new String[] {""} ;
      P09CJ4_A832TipColDsc = new String[] {""} ;
      P09CJ4_n832TipColDsc = new boolean[] {false} ;
      P09CJ4_A831TipColCod = new byte[1] ;
      P09CJ4_n831TipColCod = new boolean[] {false} ;
      P09CJ4_A5537Lb_ColNum = new int[1] ;
      P09CJ4_A5536Lb_ColNom = new String[] {""} ;
      P09CJ4_A5552Lb_TipArtD = new String[] {""} ;
      P09CJ4_A5535Lb_TipArt = new short[1] ;
      P09CJ4_A5533Lb_ArtCod = new String[] {""} ;
      P09CJ4_A279CliNom = new String[] {""} ;
      P09CJ4_A252CliCod = new int[1] ;
      P09CJ4_A5532Lb_numero = new int[1] ;
      P09CJ5_A396EmprCod = new String[] {""} ;
      P09CJ5_A1514MacProCod = new String[] {""} ;
      P09CJ5_n1514MacProCod = new boolean[] {false} ;
      P09CJ5_A5552Lb_TipArtD = new String[] {""} ;
      P09CJ5_A832TipColDsc = new String[] {""} ;
      P09CJ5_n832TipColDsc = new boolean[] {false} ;
      P09CJ5_A831TipColCod = new byte[1] ;
      P09CJ5_n831TipColCod = new boolean[] {false} ;
      P09CJ5_A5537Lb_ColNum = new int[1] ;
      P09CJ5_A5536Lb_ColNom = new String[] {""} ;
      P09CJ5_A5535Lb_TipArt = new short[1] ;
      P09CJ5_A5534Lb_ArtDsc = new String[] {""} ;
      P09CJ5_A5533Lb_ArtCod = new String[] {""} ;
      P09CJ5_A279CliNom = new String[] {""} ;
      P09CJ5_A252CliCod = new int[1] ;
      P09CJ5_A5532Lb_numero = new int[1] ;
      P09CJ6_A396EmprCod = new String[] {""} ;
      P09CJ6_A1514MacProCod = new String[] {""} ;
      P09CJ6_n1514MacProCod = new boolean[] {false} ;
      P09CJ6_A5536Lb_ColNom = new String[] {""} ;
      P09CJ6_A832TipColDsc = new String[] {""} ;
      P09CJ6_n832TipColDsc = new boolean[] {false} ;
      P09CJ6_A831TipColCod = new byte[1] ;
      P09CJ6_n831TipColCod = new boolean[] {false} ;
      P09CJ6_A5537Lb_ColNum = new int[1] ;
      P09CJ6_A5552Lb_TipArtD = new String[] {""} ;
      P09CJ6_A5535Lb_TipArt = new short[1] ;
      P09CJ6_A5534Lb_ArtDsc = new String[] {""} ;
      P09CJ6_A5533Lb_ArtCod = new String[] {""} ;
      P09CJ6_A279CliNom = new String[] {""} ;
      P09CJ6_A252CliCod = new int[1] ;
      P09CJ6_A5532Lb_numero = new int[1] ;
      P09CJ7_A831TipColCod = new byte[1] ;
      P09CJ7_n831TipColCod = new boolean[] {false} ;
      P09CJ7_A396EmprCod = new String[] {""} ;
      P09CJ7_A1514MacProCod = new String[] {""} ;
      P09CJ7_n1514MacProCod = new boolean[] {false} ;
      P09CJ7_A832TipColDsc = new String[] {""} ;
      P09CJ7_n832TipColDsc = new boolean[] {false} ;
      P09CJ7_A5537Lb_ColNum = new int[1] ;
      P09CJ7_A5536Lb_ColNom = new String[] {""} ;
      P09CJ7_A5552Lb_TipArtD = new String[] {""} ;
      P09CJ7_A5535Lb_TipArt = new short[1] ;
      P09CJ7_A5534Lb_ArtDsc = new String[] {""} ;
      P09CJ7_A5533Lb_ArtCod = new String[] {""} ;
      P09CJ7_A279CliNom = new String[] {""} ;
      P09CJ7_A252CliCod = new int[1] ;
      P09CJ7_A5532Lb_numero = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiodenumerodeprogramaenensayosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09CJ2_A396EmprCod, P09CJ2_A1514MacProCod, P09CJ2_n1514MacProCod, P09CJ2_A279CliNom, P09CJ2_A832TipColDsc, P09CJ2_n832TipColDsc, P09CJ2_A831TipColCod, P09CJ2_n831TipColCod, P09CJ2_A5537Lb_ColNum, P09CJ2_A5536Lb_ColNom,
            P09CJ2_A5552Lb_TipArtD, P09CJ2_A5535Lb_TipArt, P09CJ2_A5534Lb_ArtDsc, P09CJ2_A5533Lb_ArtCod, P09CJ2_A252CliCod, P09CJ2_A5532Lb_numero
            }
            , new Object[] {
            P09CJ3_A396EmprCod, P09CJ3_A1514MacProCod, P09CJ3_n1514MacProCod, P09CJ3_A5533Lb_ArtCod, P09CJ3_A832TipColDsc, P09CJ3_n832TipColDsc, P09CJ3_A831TipColCod, P09CJ3_n831TipColCod, P09CJ3_A5537Lb_ColNum, P09CJ3_A5536Lb_ColNom,
            P09CJ3_A5552Lb_TipArtD, P09CJ3_A5535Lb_TipArt, P09CJ3_A5534Lb_ArtDsc, P09CJ3_A279CliNom, P09CJ3_A252CliCod, P09CJ3_A5532Lb_numero
            }
            , new Object[] {
            P09CJ4_A396EmprCod, P09CJ4_A1514MacProCod, P09CJ4_n1514MacProCod, P09CJ4_A5534Lb_ArtDsc, P09CJ4_A832TipColDsc, P09CJ4_n832TipColDsc, P09CJ4_A831TipColCod, P09CJ4_n831TipColCod, P09CJ4_A5537Lb_ColNum, P09CJ4_A5536Lb_ColNom,
            P09CJ4_A5552Lb_TipArtD, P09CJ4_A5535Lb_TipArt, P09CJ4_A5533Lb_ArtCod, P09CJ4_A279CliNom, P09CJ4_A252CliCod, P09CJ4_A5532Lb_numero
            }
            , new Object[] {
            P09CJ5_A396EmprCod, P09CJ5_A1514MacProCod, P09CJ5_n1514MacProCod, P09CJ5_A5552Lb_TipArtD, P09CJ5_A832TipColDsc, P09CJ5_n832TipColDsc, P09CJ5_A831TipColCod, P09CJ5_n831TipColCod, P09CJ5_A5537Lb_ColNum, P09CJ5_A5536Lb_ColNom,
            P09CJ5_A5535Lb_TipArt, P09CJ5_A5534Lb_ArtDsc, P09CJ5_A5533Lb_ArtCod, P09CJ5_A279CliNom, P09CJ5_A252CliCod, P09CJ5_A5532Lb_numero
            }
            , new Object[] {
            P09CJ6_A396EmprCod, P09CJ6_A1514MacProCod, P09CJ6_n1514MacProCod, P09CJ6_A5536Lb_ColNom, P09CJ6_A832TipColDsc, P09CJ6_n832TipColDsc, P09CJ6_A831TipColCod, P09CJ6_n831TipColCod, P09CJ6_A5537Lb_ColNum, P09CJ6_A5552Lb_TipArtD,
            P09CJ6_A5535Lb_TipArt, P09CJ6_A5534Lb_ArtDsc, P09CJ6_A5533Lb_ArtCod, P09CJ6_A279CliNom, P09CJ6_A252CliCod, P09CJ6_A5532Lb_numero
            }
            , new Object[] {
            P09CJ7_A831TipColCod, P09CJ7_n831TipColCod, P09CJ7_A396EmprCod, P09CJ7_A1514MacProCod, P09CJ7_n1514MacProCod, P09CJ7_A832TipColDsc, P09CJ7_n832TipColDsc, P09CJ7_A5537Lb_ColNum, P09CJ7_A5536Lb_ColNom, P09CJ7_A5552Lb_TipArtD,
            P09CJ7_A5535Lb_TipArt, P09CJ7_A5534Lb_ArtDsc, P09CJ7_A5533Lb_ArtCod, P09CJ7_A279CliNom, P09CJ7_A252CliCod, P09CJ7_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28TFTipColCod ;
   private byte AV29TFTipColCod_To ;
   private byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ;
   private byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short AV20TFLb_TipArt ;
   private short AV21TFLb_TipArt_To ;
   private short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ;
   private short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ;
   private short A5535Lb_TipArt ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV10TFLb_numero ;
   private int AV11TFLb_numero_To ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV26TFLb_ColNum ;
   private int AV27TFLb_ColNum_To ;
   private int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ;
   private int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ;
   private int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ;
   private int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ;
   private int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ;
   private int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV35InsertIndex ;
   private long AV44count ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV16TFLb_ArtCod ;
   private String AV17TFLb_ArtCod_Sel ;
   private String AV18TFLb_ArtDsc ;
   private String AV19TFLb_ArtDsc_Sel ;
   private String AV22TFLb_TipArtDsc ;
   private String AV23TFLb_TipArtDsc_Sel ;
   private String AV24TFLb_ColNom ;
   private String AV25TFLb_ColNom_Sel ;
   private String AV30TFTipColDsc ;
   private String AV31TFTipColDsc_Sel ;
   private String A279CliNom ;
   private String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ;
   private String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ;
   private String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ;
   private String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ;
   private String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ;
   private String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ;
   private String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ;
   private String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ;
   private String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ;
   private String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ;
   private String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ;
   private String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ;
   private String lV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ;
   private String lV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ;
   private String lV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ;
   private String lV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ;
   private String lV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5552Lb_TipArtD ;
   private String A5536Lb_ColNom ;
   private String A832TipColDsc ;
   private String A1514MacProCod ;
   private String AV51MacProCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9CJ2 ;
   private boolean n1514MacProCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean brk9CJ4 ;
   private boolean brk9CJ6 ;
   private boolean brk9CJ8 ;
   private boolean brk9CJ10 ;
   private boolean brk9CJ12 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ;
   private String lV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09CJ2_A396EmprCod ;
   private String[] P09CJ2_A1514MacProCod ;
   private boolean[] P09CJ2_n1514MacProCod ;
   private String[] P09CJ2_A279CliNom ;
   private String[] P09CJ2_A832TipColDsc ;
   private boolean[] P09CJ2_n832TipColDsc ;
   private byte[] P09CJ2_A831TipColCod ;
   private boolean[] P09CJ2_n831TipColCod ;
   private int[] P09CJ2_A5537Lb_ColNum ;
   private String[] P09CJ2_A5536Lb_ColNom ;
   private String[] P09CJ2_A5552Lb_TipArtD ;
   private short[] P09CJ2_A5535Lb_TipArt ;
   private String[] P09CJ2_A5534Lb_ArtDsc ;
   private String[] P09CJ2_A5533Lb_ArtCod ;
   private int[] P09CJ2_A252CliCod ;
   private int[] P09CJ2_A5532Lb_numero ;
   private String[] P09CJ3_A396EmprCod ;
   private String[] P09CJ3_A1514MacProCod ;
   private boolean[] P09CJ3_n1514MacProCod ;
   private String[] P09CJ3_A5533Lb_ArtCod ;
   private String[] P09CJ3_A832TipColDsc ;
   private boolean[] P09CJ3_n832TipColDsc ;
   private byte[] P09CJ3_A831TipColCod ;
   private boolean[] P09CJ3_n831TipColCod ;
   private int[] P09CJ3_A5537Lb_ColNum ;
   private String[] P09CJ3_A5536Lb_ColNom ;
   private String[] P09CJ3_A5552Lb_TipArtD ;
   private short[] P09CJ3_A5535Lb_TipArt ;
   private String[] P09CJ3_A5534Lb_ArtDsc ;
   private String[] P09CJ3_A279CliNom ;
   private int[] P09CJ3_A252CliCod ;
   private int[] P09CJ3_A5532Lb_numero ;
   private String[] P09CJ4_A396EmprCod ;
   private String[] P09CJ4_A1514MacProCod ;
   private boolean[] P09CJ4_n1514MacProCod ;
   private String[] P09CJ4_A5534Lb_ArtDsc ;
   private String[] P09CJ4_A832TipColDsc ;
   private boolean[] P09CJ4_n832TipColDsc ;
   private byte[] P09CJ4_A831TipColCod ;
   private boolean[] P09CJ4_n831TipColCod ;
   private int[] P09CJ4_A5537Lb_ColNum ;
   private String[] P09CJ4_A5536Lb_ColNom ;
   private String[] P09CJ4_A5552Lb_TipArtD ;
   private short[] P09CJ4_A5535Lb_TipArt ;
   private String[] P09CJ4_A5533Lb_ArtCod ;
   private String[] P09CJ4_A279CliNom ;
   private int[] P09CJ4_A252CliCod ;
   private int[] P09CJ4_A5532Lb_numero ;
   private String[] P09CJ5_A396EmprCod ;
   private String[] P09CJ5_A1514MacProCod ;
   private boolean[] P09CJ5_n1514MacProCod ;
   private String[] P09CJ5_A5552Lb_TipArtD ;
   private String[] P09CJ5_A832TipColDsc ;
   private boolean[] P09CJ5_n832TipColDsc ;
   private byte[] P09CJ5_A831TipColCod ;
   private boolean[] P09CJ5_n831TipColCod ;
   private int[] P09CJ5_A5537Lb_ColNum ;
   private String[] P09CJ5_A5536Lb_ColNom ;
   private short[] P09CJ5_A5535Lb_TipArt ;
   private String[] P09CJ5_A5534Lb_ArtDsc ;
   private String[] P09CJ5_A5533Lb_ArtCod ;
   private String[] P09CJ5_A279CliNom ;
   private int[] P09CJ5_A252CliCod ;
   private int[] P09CJ5_A5532Lb_numero ;
   private String[] P09CJ6_A396EmprCod ;
   private String[] P09CJ6_A1514MacProCod ;
   private boolean[] P09CJ6_n1514MacProCod ;
   private String[] P09CJ6_A5536Lb_ColNom ;
   private String[] P09CJ6_A832TipColDsc ;
   private boolean[] P09CJ6_n832TipColDsc ;
   private byte[] P09CJ6_A831TipColCod ;
   private boolean[] P09CJ6_n831TipColCod ;
   private int[] P09CJ6_A5537Lb_ColNum ;
   private String[] P09CJ6_A5552Lb_TipArtD ;
   private short[] P09CJ6_A5535Lb_TipArt ;
   private String[] P09CJ6_A5534Lb_ArtDsc ;
   private String[] P09CJ6_A5533Lb_ArtCod ;
   private String[] P09CJ6_A279CliNom ;
   private int[] P09CJ6_A252CliCod ;
   private int[] P09CJ6_A5532Lb_numero ;
   private byte[] P09CJ7_A831TipColCod ;
   private boolean[] P09CJ7_n831TipColCod ;
   private String[] P09CJ7_A396EmprCod ;
   private String[] P09CJ7_A1514MacProCod ;
   private boolean[] P09CJ7_n1514MacProCod ;
   private String[] P09CJ7_A832TipColDsc ;
   private boolean[] P09CJ7_n832TipColDsc ;
   private int[] P09CJ7_A5537Lb_ColNum ;
   private String[] P09CJ7_A5536Lb_ColNom ;
   private String[] P09CJ7_A5552Lb_TipArtD ;
   private short[] P09CJ7_A5535Lb_TipArt ;
   private String[] P09CJ7_A5534Lb_ArtDsc ;
   private String[] P09CJ7_A5533Lb_ArtCod ;
   private String[] P09CJ7_A279CliNom ;
   private int[] P09CJ7_A252CliCod ;
   private int[] P09CJ7_A5532Lb_numero ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class cambiodenumerodeprogramaenensayosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV51MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T3.CliNom, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_TipArt, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.CliCod," ;
      scmdbuf += " T1.Lb_numero FROM ((TXPENS001 T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
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

   protected Object[] conditional_P09CJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV51MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[34];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_ArtCod, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_TipArt, T1.Lb_ArtDsc, T3.CliNom, T1.CliCod," ;
      scmdbuf += " T1.Lb_numero FROM ((TXPENS001 T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      }
      if ( ! (0==AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09CJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV51MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_ArtDsc, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_TipArt, T1.Lb_ArtCod, T3.CliNom, T1.CliCod," ;
      scmdbuf += " T1.Lb_numero FROM ((TXPENS001 T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      }
      if ( ! (0==AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09CJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV51MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_TipArtD, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArt, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod," ;
      scmdbuf += " T1.Lb_numero FROM ((TXPENS001 T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_TipArtD" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09CJ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV51MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[34];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.Lb_ColNom, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_TipArtD, T1.Lb_TipArt, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod," ;
      scmdbuf += " T1.Lb_numero FROM ((TXPENS001 T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      }
      if ( ! (0==AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09CJ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext ,
                                          int AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero ,
                                          int AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to ,
                                          int AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod ,
                                          int AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to ,
                                          String AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel ,
                                          String AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom ,
                                          String AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel ,
                                          String AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod ,
                                          String AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel ,
                                          String AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc ,
                                          short AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart ,
                                          short AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to ,
                                          String AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel ,
                                          String AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc ,
                                          String AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel ,
                                          String AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom ,
                                          int AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum ,
                                          int AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to ,
                                          byte AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod ,
                                          byte AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to ,
                                          String AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel ,
                                          String AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          short A5535Lb_TipArt ,
                                          String A5552Lb_TipArtD ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          String A1514MacProCod ,
                                          String AV51MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[34];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.TipColCod, T1.EmprCod, T1.MacProCod, T2.TipColDsc, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_TipArt, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod," ;
      scmdbuf += " T1.Lb_numero FROM ((TXPENS001 T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_cambiodenumerodeprogramaenensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_TipArt,'9990'), 2) like '%' || ?) or ( UPPER(T1.Lb_TipArtD) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
      }
      if ( ! (0==AV57Formulaciontinte_cambiodenumerodeprogramaenensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_cambiodenumerodeprogramaenensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_cambiodenumerodeprogramaenensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_cambiodenumerodeprogramaenensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_cambiodenumerodeprogramaenensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cambiodenumerodeprogramaenensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_cambiodenumerodeprogramaenensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_cambiodenumerodeprogramaenensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_cambiodenumerodeprogramaenensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_cambiodenumerodeprogramaenensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_cambiodenumerodeprogramaenensayosds_12_tflb_tipart) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_cambiodenumerodeprogramaenensayosds_13_tflb_tipart_to) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArt <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cambiodenumerodeprogramaenensayosds_14_tflb_tipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_TipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cambiodenumerodeprogramaenensayosds_15_tflb_tipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_TipArtD = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Formulaciontinte_cambiodenumerodeprogramaenensayosds_16_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Formulaciontinte_cambiodenumerodeprogramaenensayosds_17_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_cambiodenumerodeprogramaenensayosds_18_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_cambiodenumerodeprogramaenensayosds_19_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_cambiodenumerodeprogramaenensayosds_20_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_cambiodenumerodeprogramaenensayosds_21_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_cambiodenumerodeprogramaenensayosds_22_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_cambiodenumerodeprogramaenensayosds_23_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipColCod" ;
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
                  return conditional_P09CJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_P09CJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 2 :
                  return conditional_P09CJ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 3 :
                  return conditional_P09CJ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 4 :
                  return conditional_P09CJ6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 5 :
                  return conditional_P09CJ7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CJ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CJ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
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
                  stmt.setString(sIdx, (String)parms[34], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               return;
      }
   }

}

