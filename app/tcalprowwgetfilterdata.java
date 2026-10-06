package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcalprowwgetfilterdata extends GXProcedure
{
   public tcalprowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcalprowwgetfilterdata.class ), "" );
   }

   public tcalprowwgetfilterdata( int remoteHandle ,
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
      tcalprowwgetfilterdata.this.aP5 = new String[] {""};
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
      tcalprowwgetfilterdata.this.AV44DDOName = aP0;
      tcalprowwgetfilterdata.this.AV42SearchTxt = aP1;
      tcalprowwgetfilterdata.this.AV43SearchTxtTo = aP2;
      tcalprowwgetfilterdata.this.aP3 = aP3;
      tcalprowwgetfilterdata.this.aP4 = aP4;
      tcalprowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_CATDOCNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCATDOCNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ALBPROPRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROPRVNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ALBPROCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ALBPROMATRICULA") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROMATRICULAOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ALBPROOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROOBSOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_ALBPROIDAT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROIDATOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV48OptionsJson = AV47Options.toJSonString(false) ;
      AV51OptionsDescJson = AV50OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV52OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue("TCALPROWWGridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCALPROWWGridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("TCALPROWWGridState"), null, null);
      }
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROID") == 0 )
         {
            AV10TFAlbProID = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbProID_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROINEX_SEL") == 0 )
         {
            AV12TFAlbProInEx_SelsJson = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV13TFAlbProInEx_Sels.fromJSonString(AV12TFAlbProInEx_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROTIPO_SEL") == 0 )
         {
            AV14TFAlbProTipo_SelsJson = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV15TFAlbProTipo_Sels.fromJSonString(AV14TFAlbProTipo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODATE") == 0 )
         {
            AV16TFAlbProDate = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV18TFAlbProSal = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCID") == 0 )
         {
            AV20TFCatDocID = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCatDocID_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM") == 0 )
         {
            AV22TFCatDocNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM_SEL") == 0 )
         {
            AV23TFCatDocNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVID") == 0 )
         {
            AV24TFAlbProPrvID = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFAlbProPrvID_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV26TFAlbProPrvNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV27TFAlbProPrvNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLICOD") == 0 )
         {
            AV28TFAlbProCliCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFAlbProCliCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM") == 0 )
         {
            AV30TFAlbProCliNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM_SEL") == 0 )
         {
            AV31TFAlbProCliNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODOMENV") == 0 )
         {
            AV32TFAlbProDomEnv = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFAlbProDomEnv_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV34TFTrnCod = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFTrnCod_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV36TFTrnNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV37TFTrnNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA") == 0 )
         {
            AV38TFAlbProMatricula = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA_SEL") == 0 )
         {
            AV39TFAlbProMatricula_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS") == 0 )
         {
            AV40TFAlbProObs = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS_SEL") == 0 )
         {
            AV41TFAlbProObs_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV65TFAlbProIDAT = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV66TFAlbProIDAT_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV69TFAlbProStAT_SelsJson = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV70TFAlbProStAT_Sels.fromJSonString(AV69TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROANULADO_SEL") == 0 )
         {
            AV63TFAlbProAnulado_SelsJson = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFAlbProAnulado_Sels.fromJSonString(AV63TFAlbProAnulado_SelsJson, null);
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCATDOCNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCatDocNom = AV42SearchTxt ;
      AV23TFCatDocNom_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk91Q2 = false ;
         A13453CatDocID = P091Q2_A13453CatDocID[0] ;
         n13453CatDocID = P091Q2_n13453CatDocID[0] ;
         A396EmprCod = P091Q2_A396EmprCod[0] ;
         A13440AlbProAnul = P091Q2_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q2_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091Q2_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091Q2_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091Q2_A13424AlbProMatr[0] ;
         A841TrnNom = P091Q2_A841TrnNom[0] ;
         n841TrnNom = P091Q2_n841TrnNom[0] ;
         A840TrnCod = P091Q2_A840TrnCod[0] ;
         n840TrnCod = P091Q2_n840TrnCod[0] ;
         A13427AlbProDomE = P091Q2_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091Q2_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091Q2_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q2_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091Q2_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091Q2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q2_n13454CatDocNom[0] ;
         A13429AlbProSal = P091Q2_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q2_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q2_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q2_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q2_A13452AlbProInEx[0] ;
         A13454CatDocNom = P091Q2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q2_n13454CatDocNom[0] ;
         A841TrnNom = P091Q2_A841TrnNom[0] ;
         n841TrnNom = P091Q2_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q2_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091Q2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q2_n13420AlbProPrvN[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P091Q2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P091Q2_A13453CatDocID[0] == A13453CatDocID ) )
            {
               brk91Q2 = false ;
               A13418AlbProID = P091Q2_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A13454CatDocNom)==0) )
            {
               AV46Option = A13454CatDocNom ;
               AV45InsertIndex = 1 ;
               while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
               {
                  AV45InsertIndex = (int)(AV45InsertIndex+1) ;
               }
               AV47Options.add(AV46Option, AV45InsertIndex);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q2 )
         {
            brk91Q2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBPROPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbProPrvNom = AV42SearchTxt ;
      AV27TFAlbProPrvNom_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk91Q4 = false ;
         A13419AlbProPrvI = P091Q3_A13419AlbProPrvI[0] ;
         A396EmprCod = P091Q3_A396EmprCod[0] ;
         A13440AlbProAnul = P091Q3_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q3_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091Q3_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091Q3_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091Q3_A13424AlbProMatr[0] ;
         A841TrnNom = P091Q3_A841TrnNom[0] ;
         n841TrnNom = P091Q3_n841TrnNom[0] ;
         A840TrnCod = P091Q3_A840TrnCod[0] ;
         n840TrnCod = P091Q3_n840TrnCod[0] ;
         A13427AlbProDomE = P091Q3_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091Q3_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091Q3_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q3_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q3_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091Q3_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q3_n13454CatDocNom[0] ;
         A13453CatDocID = P091Q3_A13453CatDocID[0] ;
         n13453CatDocID = P091Q3_n13453CatDocID[0] ;
         A13429AlbProSal = P091Q3_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q3_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q3_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q3_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q3_A13452AlbProInEx[0] ;
         A13420AlbProPrvN = P091Q3_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q3_n13420AlbProPrvN[0] ;
         A841TrnNom = P091Q3_A841TrnNom[0] ;
         n841TrnNom = P091Q3_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q3_A13426AlbProCliN[0] ;
         A13454CatDocNom = P091Q3_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q3_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P091Q3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P091Q3_A13419AlbProPrvI[0] == A13419AlbProPrvI ) )
            {
               brk91Q4 = false ;
               A13418AlbProID = P091Q3_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A13420AlbProPrvN)==0) )
            {
               AV46Option = A13420AlbProPrvN ;
               AV45InsertIndex = 1 ;
               while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
               {
                  AV45InsertIndex = (int)(AV45InsertIndex+1) ;
               }
               AV47Options.add(AV46Option, AV45InsertIndex);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q4 )
         {
            brk91Q4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBPROCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV30TFAlbProCliNom = AV42SearchTxt ;
      AV31TFAlbProCliNom_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk91Q6 = false ;
         A396EmprCod = P091Q4_A396EmprCod[0] ;
         A13426AlbProCliN = P091Q4_A13426AlbProCliN[0] ;
         A13440AlbProAnul = P091Q4_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q4_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091Q4_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091Q4_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091Q4_A13424AlbProMatr[0] ;
         A841TrnNom = P091Q4_A841TrnNom[0] ;
         n841TrnNom = P091Q4_n841TrnNom[0] ;
         A840TrnCod = P091Q4_A840TrnCod[0] ;
         n840TrnCod = P091Q4_n840TrnCod[0] ;
         A13427AlbProDomE = P091Q4_A13427AlbProDomE[0] ;
         A13425AlbProCliC = P091Q4_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q4_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q4_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091Q4_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091Q4_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q4_n13454CatDocNom[0] ;
         A13453CatDocID = P091Q4_A13453CatDocID[0] ;
         n13453CatDocID = P091Q4_n13453CatDocID[0] ;
         A13429AlbProSal = P091Q4_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q4_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q4_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q4_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q4_A13452AlbProInEx[0] ;
         A841TrnNom = P091Q4_A841TrnNom[0] ;
         n841TrnNom = P091Q4_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q4_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091Q4_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q4_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091Q4_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q4_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P091Q4_A13426AlbProCliN[0], A13426AlbProCliN) == 0 ) )
            {
               brk91Q6 = false ;
               A396EmprCod = P091Q4_A396EmprCod[0] ;
               A13425AlbProCliC = P091Q4_A13425AlbProCliC[0] ;
               A13418AlbProID = P091Q4_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A13426AlbProCliN)==0) )
            {
               AV46Option = A13426AlbProCliN ;
               AV47Options.add(AV46Option, 0);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q6 )
         {
            brk91Q6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV36TFTrnNom = AV42SearchTxt ;
      AV37TFTrnNom_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk91Q8 = false ;
         A840TrnCod = P091Q5_A840TrnCod[0] ;
         n840TrnCod = P091Q5_n840TrnCod[0] ;
         A396EmprCod = P091Q5_A396EmprCod[0] ;
         A13440AlbProAnul = P091Q5_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q5_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091Q5_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091Q5_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091Q5_A13424AlbProMatr[0] ;
         A841TrnNom = P091Q5_A841TrnNom[0] ;
         n841TrnNom = P091Q5_n841TrnNom[0] ;
         A13427AlbProDomE = P091Q5_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091Q5_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091Q5_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q5_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q5_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091Q5_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091Q5_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q5_n13454CatDocNom[0] ;
         A13453CatDocID = P091Q5_A13453CatDocID[0] ;
         n13453CatDocID = P091Q5_n13453CatDocID[0] ;
         A13429AlbProSal = P091Q5_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q5_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q5_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q5_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q5_A13452AlbProInEx[0] ;
         A841TrnNom = P091Q5_A841TrnNom[0] ;
         n841TrnNom = P091Q5_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q5_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091Q5_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q5_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091Q5_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q5_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P091Q5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P091Q5_A840TrnCod[0] == A840TrnCod ) )
            {
               brk91Q8 = false ;
               A13418AlbProID = P091Q5_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
            {
               AV46Option = A841TrnNom ;
               AV45InsertIndex = 1 ;
               while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
               {
                  AV45InsertIndex = (int)(AV45InsertIndex+1) ;
               }
               AV47Options.add(AV46Option, AV45InsertIndex);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q8 )
         {
            brk91Q8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBPROMATRICULAOPTIONS' Routine */
      returnInSub = false ;
      AV38TFAlbProMatricula = AV42SearchTxt ;
      AV39TFAlbProMatricula_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk91Q10 = false ;
         A396EmprCod = P091Q6_A396EmprCod[0] ;
         A13424AlbProMatr = P091Q6_A13424AlbProMatr[0] ;
         A13440AlbProAnul = P091Q6_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q6_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091Q6_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091Q6_A13439AlbProObs[0] ;
         A841TrnNom = P091Q6_A841TrnNom[0] ;
         n841TrnNom = P091Q6_n841TrnNom[0] ;
         A840TrnCod = P091Q6_A840TrnCod[0] ;
         n840TrnCod = P091Q6_n840TrnCod[0] ;
         A13427AlbProDomE = P091Q6_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091Q6_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091Q6_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q6_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q6_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091Q6_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091Q6_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q6_n13454CatDocNom[0] ;
         A13453CatDocID = P091Q6_A13453CatDocID[0] ;
         n13453CatDocID = P091Q6_n13453CatDocID[0] ;
         A13429AlbProSal = P091Q6_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q6_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q6_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q6_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q6_A13452AlbProInEx[0] ;
         A841TrnNom = P091Q6_A841TrnNom[0] ;
         n841TrnNom = P091Q6_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q6_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091Q6_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q6_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091Q6_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q6_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P091Q6_A13424AlbProMatr[0], A13424AlbProMatr) == 0 ) )
            {
               brk91Q10 = false ;
               A396EmprCod = P091Q6_A396EmprCod[0] ;
               A13418AlbProID = P091Q6_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A13424AlbProMatr)==0) )
            {
               AV46Option = A13424AlbProMatr ;
               AV47Options.add(AV46Option, 0);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q10 )
         {
            brk91Q10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBPROOBSOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbProObs = AV42SearchTxt ;
      AV41TFAlbProObs_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk91Q12 = false ;
         A396EmprCod = P091Q7_A396EmprCod[0] ;
         A13439AlbProObs = P091Q7_A13439AlbProObs[0] ;
         A13440AlbProAnul = P091Q7_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q7_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091Q7_A13436AlbProIDAT[0] ;
         A13424AlbProMatr = P091Q7_A13424AlbProMatr[0] ;
         A841TrnNom = P091Q7_A841TrnNom[0] ;
         n841TrnNom = P091Q7_n841TrnNom[0] ;
         A840TrnCod = P091Q7_A840TrnCod[0] ;
         n840TrnCod = P091Q7_n840TrnCod[0] ;
         A13427AlbProDomE = P091Q7_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091Q7_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091Q7_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q7_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q7_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091Q7_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091Q7_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q7_n13454CatDocNom[0] ;
         A13453CatDocID = P091Q7_A13453CatDocID[0] ;
         n13453CatDocID = P091Q7_n13453CatDocID[0] ;
         A13429AlbProSal = P091Q7_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q7_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q7_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q7_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q7_A13452AlbProInEx[0] ;
         A841TrnNom = P091Q7_A841TrnNom[0] ;
         n841TrnNom = P091Q7_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q7_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091Q7_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q7_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091Q7_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q7_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P091Q7_A13439AlbProObs[0], A13439AlbProObs) == 0 ) )
            {
               brk91Q12 = false ;
               A396EmprCod = P091Q7_A396EmprCod[0] ;
               A13418AlbProID = P091Q7_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A13439AlbProObs)==0) )
            {
               AV46Option = A13439AlbProObs ;
               AV47Options.add(AV46Option, 0);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q12 )
         {
            brk91Q12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBPROIDATOPTIONS' Routine */
      returnInSub = false ;
      AV65TFAlbProIDAT = AV42SearchTxt ;
      AV66TFAlbProIDAT_Sel = "" ;
      AV75Tcalprowwds_1_filterfulltext = AV60FilterFullText ;
      AV76Tcalprowwds_2_tfalbproid = AV10TFAlbProID ;
      AV77Tcalprowwds_3_tfalbproid_to = AV11TFAlbProID_To ;
      AV78Tcalprowwds_4_tfalbproinex_sels = AV13TFAlbProInEx_Sels ;
      AV79Tcalprowwds_5_tfalbprotipo_sels = AV15TFAlbProTipo_Sels ;
      AV80Tcalprowwds_6_tfalbprodate = AV16TFAlbProDate ;
      AV81Tcalprowwds_7_tfalbprosal = AV18TFAlbProSal ;
      AV82Tcalprowwds_8_tfcatdocid = AV20TFCatDocID ;
      AV83Tcalprowwds_9_tfcatdocid_to = AV21TFCatDocID_To ;
      AV84Tcalprowwds_10_tfcatdocnom = AV22TFCatDocNom ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = AV23TFCatDocNom_Sel ;
      AV86Tcalprowwds_12_tfalbproprvid = AV24TFAlbProPrvID ;
      AV87Tcalprowwds_13_tfalbproprvid_to = AV25TFAlbProPrvID_To ;
      AV88Tcalprowwds_14_tfalbproprvnom = AV26TFAlbProPrvNom ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = AV27TFAlbProPrvNom_Sel ;
      AV90Tcalprowwds_16_tfalbproclicod = AV28TFAlbProCliCod ;
      AV91Tcalprowwds_17_tfalbproclicod_to = AV29TFAlbProCliCod_To ;
      AV92Tcalprowwds_18_tfalbproclinom = AV30TFAlbProCliNom ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = AV31TFAlbProCliNom_Sel ;
      AV94Tcalprowwds_20_tfalbprodomenv = AV32TFAlbProDomEnv ;
      AV95Tcalprowwds_21_tfalbprodomenv_to = AV33TFAlbProDomEnv_To ;
      AV96Tcalprowwds_22_tftrncod = AV34TFTrnCod ;
      AV97Tcalprowwds_23_tftrncod_to = AV35TFTrnCod_To ;
      AV98Tcalprowwds_24_tftrnnom = AV36TFTrnNom ;
      AV99Tcalprowwds_25_tftrnnom_sel = AV37TFTrnNom_Sel ;
      AV100Tcalprowwds_26_tfalbpromatricula = AV38TFAlbProMatricula ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = AV39TFAlbProMatricula_Sel ;
      AV102Tcalprowwds_28_tfalbproobs = AV40TFAlbProObs ;
      AV103Tcalprowwds_29_tfalbproobs_sel = AV41TFAlbProObs_Sel ;
      AV104Tcalprowwds_30_tfalbproidat = AV65TFAlbProIDAT ;
      AV105Tcalprowwds_31_tfalbproidat_sel = AV66TFAlbProIDAT_Sel ;
      AV106Tcalprowwds_32_tfalbprostat_sels = AV70TFAlbProStAT_Sels ;
      AV107Tcalprowwds_33_tfalbproanulado_sels = AV64TFAlbProAnulado_Sels ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV78Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV106Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV76Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV78Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV79Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV80Tcalprowwds_6_tfalbprodate ,
                                           AV81Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV82Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to) ,
                                           AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV84Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV88Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV92Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV96Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV97Tcalprowwds_23_tftrncod_to) ,
                                           AV99Tcalprowwds_25_tftrnnom_sel ,
                                           AV98Tcalprowwds_24_tftrnnom ,
                                           AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV100Tcalprowwds_26_tfalbpromatricula ,
                                           AV103Tcalprowwds_29_tfalbproobs_sel ,
                                           AV102Tcalprowwds_28_tfalbproobs ,
                                           AV105Tcalprowwds_31_tfalbproidat_sel ,
                                           AV104Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV106Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV107Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           AV75Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV84Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV84Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV88Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV88Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV92Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV92Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV98Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV98Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV100Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV100Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV102Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV102Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV104Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV104Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091Q8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV76Tcalprowwds_2_tfalbproid), Integer.valueOf(AV77Tcalprowwds_3_tfalbproid_to), AV80Tcalprowwds_6_tfalbprodate, AV81Tcalprowwds_7_tfalbprosal, Short.valueOf(AV82Tcalprowwds_8_tfcatdocid), Short.valueOf(AV83Tcalprowwds_9_tfcatdocid_to), lV84Tcalprowwds_10_tfcatdocnom, AV85Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV86Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV87Tcalprowwds_13_tfalbproprvid_to), lV88Tcalprowwds_14_tfalbproprvnom, AV89Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV90Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV91Tcalprowwds_17_tfalbproclicod_to), lV92Tcalprowwds_18_tfalbproclinom, AV93Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV94Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV95Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV96Tcalprowwds_22_tftrncod), Short.valueOf(AV97Tcalprowwds_23_tftrncod_to), lV98Tcalprowwds_24_tftrnnom, AV99Tcalprowwds_25_tftrnnom_sel, lV100Tcalprowwds_26_tfalbpromatricula, AV101Tcalprowwds_27_tfalbpromatricula_sel, lV102Tcalprowwds_28_tfalbproobs, AV103Tcalprowwds_29_tfalbproobs_sel, lV104Tcalprowwds_30_tfalbproidat, AV105Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk91Q14 = false ;
         A396EmprCod = P091Q8_A396EmprCod[0] ;
         A13436AlbProIDAT = P091Q8_A13436AlbProIDAT[0] ;
         A13440AlbProAnul = P091Q8_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091Q8_A13438AlbProStAT[0] ;
         A13439AlbProObs = P091Q8_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091Q8_A13424AlbProMatr[0] ;
         A841TrnNom = P091Q8_A841TrnNom[0] ;
         n841TrnNom = P091Q8_n841TrnNom[0] ;
         A840TrnCod = P091Q8_A840TrnCod[0] ;
         n840TrnCod = P091Q8_n840TrnCod[0] ;
         A13427AlbProDomE = P091Q8_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091Q8_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091Q8_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091Q8_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q8_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091Q8_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091Q8_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q8_n13454CatDocNom[0] ;
         A13453CatDocID = P091Q8_A13453CatDocID[0] ;
         n13453CatDocID = P091Q8_n13453CatDocID[0] ;
         A13429AlbProSal = P091Q8_A13429AlbProSal[0] ;
         A13430AlbProDate = P091Q8_A13430AlbProDate[0] ;
         A13418AlbProID = P091Q8_A13418AlbProID[0] ;
         A13417AlbProTipo = P091Q8_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091Q8_A13452AlbProInEx[0] ;
         A841TrnNom = P091Q8_A841TrnNom[0] ;
         n841TrnNom = P091Q8_n841TrnNom[0] ;
         A13426AlbProCliN = P091Q8_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091Q8_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091Q8_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091Q8_A13454CatDocNom[0] ;
         n13454CatDocNom = P091Q8_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV75Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV75Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV75Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P091Q8_A13436AlbProIDAT[0], A13436AlbProIDAT) == 0 ) )
            {
               brk91Q14 = false ;
               A396EmprCod = P091Q8_A396EmprCod[0] ;
               A13418AlbProID = P091Q8_A13418AlbProID[0] ;
               AV54count = (long)(AV54count+1) ;
               brk91Q14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A13436AlbProIDAT)==0) )
            {
               AV46Option = A13436AlbProIDAT ;
               AV47Options.add(AV46Option, 0);
               AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV47Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk91Q14 )
         {
            brk91Q14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tcalprowwgetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = tcalprowwgetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = tcalprowwgetfilterdata.this.AV53OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48OptionsJson = "" ;
      AV51OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Session = httpContext.getWebSession();
      AV57GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV58GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60FilterFullText = "" ;
      AV12TFAlbProInEx_SelsJson = "" ;
      AV13TFAlbProInEx_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV14TFAlbProTipo_SelsJson = "" ;
      AV15TFAlbProTipo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16TFAlbProDate = GXutil.nullDate() ;
      AV18TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV22TFCatDocNom = "" ;
      AV23TFCatDocNom_Sel = "" ;
      AV26TFAlbProPrvNom = "" ;
      AV27TFAlbProPrvNom_Sel = "" ;
      AV30TFAlbProCliNom = "" ;
      AV31TFAlbProCliNom_Sel = "" ;
      AV36TFTrnNom = "" ;
      AV37TFTrnNom_Sel = "" ;
      AV38TFAlbProMatricula = "" ;
      AV39TFAlbProMatricula_Sel = "" ;
      AV40TFAlbProObs = "" ;
      AV41TFAlbProObs_Sel = "" ;
      AV65TFAlbProIDAT = "" ;
      AV66TFAlbProIDAT_Sel = "" ;
      AV69TFAlbProStAT_SelsJson = "" ;
      AV70TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV63TFAlbProAnulado_SelsJson = "" ;
      AV64TFAlbProAnulado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A13454CatDocNom = "" ;
      AV75Tcalprowwds_1_filterfulltext = "" ;
      AV78Tcalprowwds_4_tfalbproinex_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV79Tcalprowwds_5_tfalbprotipo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80Tcalprowwds_6_tfalbprodate = GXutil.nullDate() ;
      AV81Tcalprowwds_7_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV84Tcalprowwds_10_tfcatdocnom = "" ;
      AV85Tcalprowwds_11_tfcatdocnom_sel = "" ;
      AV88Tcalprowwds_14_tfalbproprvnom = "" ;
      AV89Tcalprowwds_15_tfalbproprvnom_sel = "" ;
      AV92Tcalprowwds_18_tfalbproclinom = "" ;
      AV93Tcalprowwds_19_tfalbproclinom_sel = "" ;
      AV98Tcalprowwds_24_tftrnnom = "" ;
      AV99Tcalprowwds_25_tftrnnom_sel = "" ;
      AV100Tcalprowwds_26_tfalbpromatricula = "" ;
      AV101Tcalprowwds_27_tfalbpromatricula_sel = "" ;
      AV102Tcalprowwds_28_tfalbproobs = "" ;
      AV103Tcalprowwds_29_tfalbproobs_sel = "" ;
      AV104Tcalprowwds_30_tfalbproidat = "" ;
      AV105Tcalprowwds_31_tfalbproidat_sel = "" ;
      AV106Tcalprowwds_32_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV107Tcalprowwds_33_tfalbproanulado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV75Tcalprowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV84Tcalprowwds_10_tfcatdocnom = "" ;
      lV88Tcalprowwds_14_tfalbproprvnom = "" ;
      lV92Tcalprowwds_18_tfalbproclinom = "" ;
      lV98Tcalprowwds_24_tftrnnom = "" ;
      lV100Tcalprowwds_26_tfalbpromatricula = "" ;
      lV102Tcalprowwds_28_tfalbproobs = "" ;
      lV104Tcalprowwds_30_tfalbproidat = "" ;
      A13417AlbProTipo = "" ;
      A13440AlbProAnul = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13420AlbProPrvN = "" ;
      A13426AlbProCliN = "" ;
      A841TrnNom = "" ;
      A13424AlbProMatr = "" ;
      A13439AlbProObs = "" ;
      A13436AlbProIDAT = "" ;
      P091Q2_A13453CatDocID = new short[1] ;
      P091Q2_n13453CatDocID = new boolean[] {false} ;
      P091Q2_A396EmprCod = new String[] {""} ;
      P091Q2_A13440AlbProAnul = new String[] {""} ;
      P091Q2_A13438AlbProStAT = new byte[1] ;
      P091Q2_A13436AlbProIDAT = new String[] {""} ;
      P091Q2_A13439AlbProObs = new String[] {""} ;
      P091Q2_A13424AlbProMatr = new String[] {""} ;
      P091Q2_A841TrnNom = new String[] {""} ;
      P091Q2_n841TrnNom = new boolean[] {false} ;
      P091Q2_A840TrnCod = new short[1] ;
      P091Q2_n840TrnCod = new boolean[] {false} ;
      P091Q2_A13427AlbProDomE = new byte[1] ;
      P091Q2_A13426AlbProCliN = new String[] {""} ;
      P091Q2_A13425AlbProCliC = new int[1] ;
      P091Q2_A13420AlbProPrvN = new String[] {""} ;
      P091Q2_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q2_A13419AlbProPrvI = new int[1] ;
      P091Q2_A13454CatDocNom = new String[] {""} ;
      P091Q2_n13454CatDocNom = new boolean[] {false} ;
      P091Q2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q2_A13418AlbProID = new int[1] ;
      P091Q2_A13417AlbProTipo = new String[] {""} ;
      P091Q2_A13452AlbProInEx = new byte[1] ;
      A396EmprCod = "" ;
      AV46Option = "" ;
      P091Q3_A13419AlbProPrvI = new int[1] ;
      P091Q3_A396EmprCod = new String[] {""} ;
      P091Q3_A13440AlbProAnul = new String[] {""} ;
      P091Q3_A13438AlbProStAT = new byte[1] ;
      P091Q3_A13436AlbProIDAT = new String[] {""} ;
      P091Q3_A13439AlbProObs = new String[] {""} ;
      P091Q3_A13424AlbProMatr = new String[] {""} ;
      P091Q3_A841TrnNom = new String[] {""} ;
      P091Q3_n841TrnNom = new boolean[] {false} ;
      P091Q3_A840TrnCod = new short[1] ;
      P091Q3_n840TrnCod = new boolean[] {false} ;
      P091Q3_A13427AlbProDomE = new byte[1] ;
      P091Q3_A13426AlbProCliN = new String[] {""} ;
      P091Q3_A13425AlbProCliC = new int[1] ;
      P091Q3_A13420AlbProPrvN = new String[] {""} ;
      P091Q3_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q3_A13454CatDocNom = new String[] {""} ;
      P091Q3_n13454CatDocNom = new boolean[] {false} ;
      P091Q3_A13453CatDocID = new short[1] ;
      P091Q3_n13453CatDocID = new boolean[] {false} ;
      P091Q3_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q3_A13418AlbProID = new int[1] ;
      P091Q3_A13417AlbProTipo = new String[] {""} ;
      P091Q3_A13452AlbProInEx = new byte[1] ;
      P091Q4_A396EmprCod = new String[] {""} ;
      P091Q4_A13426AlbProCliN = new String[] {""} ;
      P091Q4_A13440AlbProAnul = new String[] {""} ;
      P091Q4_A13438AlbProStAT = new byte[1] ;
      P091Q4_A13436AlbProIDAT = new String[] {""} ;
      P091Q4_A13439AlbProObs = new String[] {""} ;
      P091Q4_A13424AlbProMatr = new String[] {""} ;
      P091Q4_A841TrnNom = new String[] {""} ;
      P091Q4_n841TrnNom = new boolean[] {false} ;
      P091Q4_A840TrnCod = new short[1] ;
      P091Q4_n840TrnCod = new boolean[] {false} ;
      P091Q4_A13427AlbProDomE = new byte[1] ;
      P091Q4_A13425AlbProCliC = new int[1] ;
      P091Q4_A13420AlbProPrvN = new String[] {""} ;
      P091Q4_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q4_A13419AlbProPrvI = new int[1] ;
      P091Q4_A13454CatDocNom = new String[] {""} ;
      P091Q4_n13454CatDocNom = new boolean[] {false} ;
      P091Q4_A13453CatDocID = new short[1] ;
      P091Q4_n13453CatDocID = new boolean[] {false} ;
      P091Q4_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q4_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q4_A13418AlbProID = new int[1] ;
      P091Q4_A13417AlbProTipo = new String[] {""} ;
      P091Q4_A13452AlbProInEx = new byte[1] ;
      P091Q5_A840TrnCod = new short[1] ;
      P091Q5_n840TrnCod = new boolean[] {false} ;
      P091Q5_A396EmprCod = new String[] {""} ;
      P091Q5_A13440AlbProAnul = new String[] {""} ;
      P091Q5_A13438AlbProStAT = new byte[1] ;
      P091Q5_A13436AlbProIDAT = new String[] {""} ;
      P091Q5_A13439AlbProObs = new String[] {""} ;
      P091Q5_A13424AlbProMatr = new String[] {""} ;
      P091Q5_A841TrnNom = new String[] {""} ;
      P091Q5_n841TrnNom = new boolean[] {false} ;
      P091Q5_A13427AlbProDomE = new byte[1] ;
      P091Q5_A13426AlbProCliN = new String[] {""} ;
      P091Q5_A13425AlbProCliC = new int[1] ;
      P091Q5_A13420AlbProPrvN = new String[] {""} ;
      P091Q5_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q5_A13419AlbProPrvI = new int[1] ;
      P091Q5_A13454CatDocNom = new String[] {""} ;
      P091Q5_n13454CatDocNom = new boolean[] {false} ;
      P091Q5_A13453CatDocID = new short[1] ;
      P091Q5_n13453CatDocID = new boolean[] {false} ;
      P091Q5_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q5_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q5_A13418AlbProID = new int[1] ;
      P091Q5_A13417AlbProTipo = new String[] {""} ;
      P091Q5_A13452AlbProInEx = new byte[1] ;
      P091Q6_A396EmprCod = new String[] {""} ;
      P091Q6_A13424AlbProMatr = new String[] {""} ;
      P091Q6_A13440AlbProAnul = new String[] {""} ;
      P091Q6_A13438AlbProStAT = new byte[1] ;
      P091Q6_A13436AlbProIDAT = new String[] {""} ;
      P091Q6_A13439AlbProObs = new String[] {""} ;
      P091Q6_A841TrnNom = new String[] {""} ;
      P091Q6_n841TrnNom = new boolean[] {false} ;
      P091Q6_A840TrnCod = new short[1] ;
      P091Q6_n840TrnCod = new boolean[] {false} ;
      P091Q6_A13427AlbProDomE = new byte[1] ;
      P091Q6_A13426AlbProCliN = new String[] {""} ;
      P091Q6_A13425AlbProCliC = new int[1] ;
      P091Q6_A13420AlbProPrvN = new String[] {""} ;
      P091Q6_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q6_A13419AlbProPrvI = new int[1] ;
      P091Q6_A13454CatDocNom = new String[] {""} ;
      P091Q6_n13454CatDocNom = new boolean[] {false} ;
      P091Q6_A13453CatDocID = new short[1] ;
      P091Q6_n13453CatDocID = new boolean[] {false} ;
      P091Q6_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q6_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q6_A13418AlbProID = new int[1] ;
      P091Q6_A13417AlbProTipo = new String[] {""} ;
      P091Q6_A13452AlbProInEx = new byte[1] ;
      P091Q7_A396EmprCod = new String[] {""} ;
      P091Q7_A13439AlbProObs = new String[] {""} ;
      P091Q7_A13440AlbProAnul = new String[] {""} ;
      P091Q7_A13438AlbProStAT = new byte[1] ;
      P091Q7_A13436AlbProIDAT = new String[] {""} ;
      P091Q7_A13424AlbProMatr = new String[] {""} ;
      P091Q7_A841TrnNom = new String[] {""} ;
      P091Q7_n841TrnNom = new boolean[] {false} ;
      P091Q7_A840TrnCod = new short[1] ;
      P091Q7_n840TrnCod = new boolean[] {false} ;
      P091Q7_A13427AlbProDomE = new byte[1] ;
      P091Q7_A13426AlbProCliN = new String[] {""} ;
      P091Q7_A13425AlbProCliC = new int[1] ;
      P091Q7_A13420AlbProPrvN = new String[] {""} ;
      P091Q7_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q7_A13419AlbProPrvI = new int[1] ;
      P091Q7_A13454CatDocNom = new String[] {""} ;
      P091Q7_n13454CatDocNom = new boolean[] {false} ;
      P091Q7_A13453CatDocID = new short[1] ;
      P091Q7_n13453CatDocID = new boolean[] {false} ;
      P091Q7_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q7_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q7_A13418AlbProID = new int[1] ;
      P091Q7_A13417AlbProTipo = new String[] {""} ;
      P091Q7_A13452AlbProInEx = new byte[1] ;
      P091Q8_A396EmprCod = new String[] {""} ;
      P091Q8_A13436AlbProIDAT = new String[] {""} ;
      P091Q8_A13440AlbProAnul = new String[] {""} ;
      P091Q8_A13438AlbProStAT = new byte[1] ;
      P091Q8_A13439AlbProObs = new String[] {""} ;
      P091Q8_A13424AlbProMatr = new String[] {""} ;
      P091Q8_A841TrnNom = new String[] {""} ;
      P091Q8_n841TrnNom = new boolean[] {false} ;
      P091Q8_A840TrnCod = new short[1] ;
      P091Q8_n840TrnCod = new boolean[] {false} ;
      P091Q8_A13427AlbProDomE = new byte[1] ;
      P091Q8_A13426AlbProCliN = new String[] {""} ;
      P091Q8_A13425AlbProCliC = new int[1] ;
      P091Q8_A13420AlbProPrvN = new String[] {""} ;
      P091Q8_n13420AlbProPrvN = new boolean[] {false} ;
      P091Q8_A13419AlbProPrvI = new int[1] ;
      P091Q8_A13454CatDocNom = new String[] {""} ;
      P091Q8_n13454CatDocNom = new boolean[] {false} ;
      P091Q8_A13453CatDocID = new short[1] ;
      P091Q8_n13453CatDocID = new boolean[] {false} ;
      P091Q8_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q8_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091Q8_A13418AlbProID = new int[1] ;
      P091Q8_A13417AlbProTipo = new String[] {""} ;
      P091Q8_A13452AlbProInEx = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcalprowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P091Q2_A13453CatDocID, P091Q2_n13453CatDocID, P091Q2_A396EmprCod, P091Q2_A13440AlbProAnul, P091Q2_A13438AlbProStAT, P091Q2_A13436AlbProIDAT, P091Q2_A13439AlbProObs, P091Q2_A13424AlbProMatr, P091Q2_A841TrnNom, P091Q2_n841TrnNom,
            P091Q2_A840TrnCod, P091Q2_n840TrnCod, P091Q2_A13427AlbProDomE, P091Q2_A13426AlbProCliN, P091Q2_A13425AlbProCliC, P091Q2_A13420AlbProPrvN, P091Q2_n13420AlbProPrvN, P091Q2_A13419AlbProPrvI, P091Q2_A13454CatDocNom, P091Q2_n13454CatDocNom,
            P091Q2_A13429AlbProSal, P091Q2_A13430AlbProDate, P091Q2_A13418AlbProID, P091Q2_A13417AlbProTipo, P091Q2_A13452AlbProInEx
            }
            , new Object[] {
            P091Q3_A13419AlbProPrvI, P091Q3_A396EmprCod, P091Q3_A13440AlbProAnul, P091Q3_A13438AlbProStAT, P091Q3_A13436AlbProIDAT, P091Q3_A13439AlbProObs, P091Q3_A13424AlbProMatr, P091Q3_A841TrnNom, P091Q3_n841TrnNom, P091Q3_A840TrnCod,
            P091Q3_n840TrnCod, P091Q3_A13427AlbProDomE, P091Q3_A13426AlbProCliN, P091Q3_A13425AlbProCliC, P091Q3_A13420AlbProPrvN, P091Q3_n13420AlbProPrvN, P091Q3_A13454CatDocNom, P091Q3_n13454CatDocNom, P091Q3_A13453CatDocID, P091Q3_n13453CatDocID,
            P091Q3_A13429AlbProSal, P091Q3_A13430AlbProDate, P091Q3_A13418AlbProID, P091Q3_A13417AlbProTipo, P091Q3_A13452AlbProInEx
            }
            , new Object[] {
            P091Q4_A396EmprCod, P091Q4_A13426AlbProCliN, P091Q4_A13440AlbProAnul, P091Q4_A13438AlbProStAT, P091Q4_A13436AlbProIDAT, P091Q4_A13439AlbProObs, P091Q4_A13424AlbProMatr, P091Q4_A841TrnNom, P091Q4_n841TrnNom, P091Q4_A840TrnCod,
            P091Q4_n840TrnCod, P091Q4_A13427AlbProDomE, P091Q4_A13425AlbProCliC, P091Q4_A13420AlbProPrvN, P091Q4_n13420AlbProPrvN, P091Q4_A13419AlbProPrvI, P091Q4_A13454CatDocNom, P091Q4_n13454CatDocNom, P091Q4_A13453CatDocID, P091Q4_n13453CatDocID,
            P091Q4_A13429AlbProSal, P091Q4_A13430AlbProDate, P091Q4_A13418AlbProID, P091Q4_A13417AlbProTipo, P091Q4_A13452AlbProInEx
            }
            , new Object[] {
            P091Q5_A840TrnCod, P091Q5_n840TrnCod, P091Q5_A396EmprCod, P091Q5_A13440AlbProAnul, P091Q5_A13438AlbProStAT, P091Q5_A13436AlbProIDAT, P091Q5_A13439AlbProObs, P091Q5_A13424AlbProMatr, P091Q5_A841TrnNom, P091Q5_n841TrnNom,
            P091Q5_A13427AlbProDomE, P091Q5_A13426AlbProCliN, P091Q5_A13425AlbProCliC, P091Q5_A13420AlbProPrvN, P091Q5_n13420AlbProPrvN, P091Q5_A13419AlbProPrvI, P091Q5_A13454CatDocNom, P091Q5_n13454CatDocNom, P091Q5_A13453CatDocID, P091Q5_n13453CatDocID,
            P091Q5_A13429AlbProSal, P091Q5_A13430AlbProDate, P091Q5_A13418AlbProID, P091Q5_A13417AlbProTipo, P091Q5_A13452AlbProInEx
            }
            , new Object[] {
            P091Q6_A396EmprCod, P091Q6_A13424AlbProMatr, P091Q6_A13440AlbProAnul, P091Q6_A13438AlbProStAT, P091Q6_A13436AlbProIDAT, P091Q6_A13439AlbProObs, P091Q6_A841TrnNom, P091Q6_n841TrnNom, P091Q6_A840TrnCod, P091Q6_n840TrnCod,
            P091Q6_A13427AlbProDomE, P091Q6_A13426AlbProCliN, P091Q6_A13425AlbProCliC, P091Q6_A13420AlbProPrvN, P091Q6_n13420AlbProPrvN, P091Q6_A13419AlbProPrvI, P091Q6_A13454CatDocNom, P091Q6_n13454CatDocNom, P091Q6_A13453CatDocID, P091Q6_n13453CatDocID,
            P091Q6_A13429AlbProSal, P091Q6_A13430AlbProDate, P091Q6_A13418AlbProID, P091Q6_A13417AlbProTipo, P091Q6_A13452AlbProInEx
            }
            , new Object[] {
            P091Q7_A396EmprCod, P091Q7_A13439AlbProObs, P091Q7_A13440AlbProAnul, P091Q7_A13438AlbProStAT, P091Q7_A13436AlbProIDAT, P091Q7_A13424AlbProMatr, P091Q7_A841TrnNom, P091Q7_n841TrnNom, P091Q7_A840TrnCod, P091Q7_n840TrnCod,
            P091Q7_A13427AlbProDomE, P091Q7_A13426AlbProCliN, P091Q7_A13425AlbProCliC, P091Q7_A13420AlbProPrvN, P091Q7_n13420AlbProPrvN, P091Q7_A13419AlbProPrvI, P091Q7_A13454CatDocNom, P091Q7_n13454CatDocNom, P091Q7_A13453CatDocID, P091Q7_n13453CatDocID,
            P091Q7_A13429AlbProSal, P091Q7_A13430AlbProDate, P091Q7_A13418AlbProID, P091Q7_A13417AlbProTipo, P091Q7_A13452AlbProInEx
            }
            , new Object[] {
            P091Q8_A396EmprCod, P091Q8_A13436AlbProIDAT, P091Q8_A13440AlbProAnul, P091Q8_A13438AlbProStAT, P091Q8_A13439AlbProObs, P091Q8_A13424AlbProMatr, P091Q8_A841TrnNom, P091Q8_n841TrnNom, P091Q8_A840TrnCod, P091Q8_n840TrnCod,
            P091Q8_A13427AlbProDomE, P091Q8_A13426AlbProCliN, P091Q8_A13425AlbProCliC, P091Q8_A13420AlbProPrvN, P091Q8_n13420AlbProPrvN, P091Q8_A13419AlbProPrvI, P091Q8_A13454CatDocNom, P091Q8_n13454CatDocNom, P091Q8_A13453CatDocID, P091Q8_n13453CatDocID,
            P091Q8_A13429AlbProSal, P091Q8_A13430AlbProDate, P091Q8_A13418AlbProID, P091Q8_A13417AlbProTipo, P091Q8_A13452AlbProInEx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32TFAlbProDomEnv ;
   private byte AV33TFAlbProDomEnv_To ;
   private byte AV94Tcalprowwds_20_tfalbprodomenv ;
   private byte AV95Tcalprowwds_21_tfalbprodomenv_to ;
   private byte A13452AlbProInEx ;
   private byte A13438AlbProStAT ;
   private byte A13427AlbProDomE ;
   private short AV20TFCatDocID ;
   private short AV21TFCatDocID_To ;
   private short AV34TFTrnCod ;
   private short AV35TFTrnCod_To ;
   private short AV82Tcalprowwds_8_tfcatdocid ;
   private short AV83Tcalprowwds_9_tfcatdocid_to ;
   private short AV96Tcalprowwds_22_tftrncod ;
   private short AV97Tcalprowwds_23_tftrncod_to ;
   private short A13453CatDocID ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV73GXV1 ;
   private int AV10TFAlbProID ;
   private int AV11TFAlbProID_To ;
   private int AV24TFAlbProPrvID ;
   private int AV25TFAlbProPrvID_To ;
   private int AV28TFAlbProCliCod ;
   private int AV29TFAlbProCliCod_To ;
   private int AV76Tcalprowwds_2_tfalbproid ;
   private int AV77Tcalprowwds_3_tfalbproid_to ;
   private int AV86Tcalprowwds_12_tfalbproprvid ;
   private int AV87Tcalprowwds_13_tfalbproprvid_to ;
   private int AV90Tcalprowwds_16_tfalbproclicod ;
   private int AV91Tcalprowwds_17_tfalbproclicod_to ;
   private int AV78Tcalprowwds_4_tfalbproinex_sels_size ;
   private int AV79Tcalprowwds_5_tfalbprotipo_sels_size ;
   private int AV106Tcalprowwds_32_tfalbprostat_sels_size ;
   private int AV107Tcalprowwds_33_tfalbproanulado_sels_size ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int A13425AlbProCliC ;
   private int AV45InsertIndex ;
   private long AV54count ;
   private String AV22TFCatDocNom ;
   private String AV23TFCatDocNom_Sel ;
   private String AV26TFAlbProPrvNom ;
   private String AV27TFAlbProPrvNom_Sel ;
   private String AV30TFAlbProCliNom ;
   private String AV31TFAlbProCliNom_Sel ;
   private String AV36TFTrnNom ;
   private String AV37TFTrnNom_Sel ;
   private String AV38TFAlbProMatricula ;
   private String AV39TFAlbProMatricula_Sel ;
   private String AV65TFAlbProIDAT ;
   private String AV66TFAlbProIDAT_Sel ;
   private String A13454CatDocNom ;
   private String AV84Tcalprowwds_10_tfcatdocnom ;
   private String AV85Tcalprowwds_11_tfcatdocnom_sel ;
   private String AV88Tcalprowwds_14_tfalbproprvnom ;
   private String AV89Tcalprowwds_15_tfalbproprvnom_sel ;
   private String AV92Tcalprowwds_18_tfalbproclinom ;
   private String AV93Tcalprowwds_19_tfalbproclinom_sel ;
   private String AV98Tcalprowwds_24_tftrnnom ;
   private String AV99Tcalprowwds_25_tftrnnom_sel ;
   private String AV100Tcalprowwds_26_tfalbpromatricula ;
   private String AV101Tcalprowwds_27_tfalbpromatricula_sel ;
   private String AV104Tcalprowwds_30_tfalbproidat ;
   private String AV105Tcalprowwds_31_tfalbproidat_sel ;
   private String scmdbuf ;
   private String lV84Tcalprowwds_10_tfcatdocnom ;
   private String lV88Tcalprowwds_14_tfalbproprvnom ;
   private String lV92Tcalprowwds_18_tfalbproclinom ;
   private String lV98Tcalprowwds_24_tftrnnom ;
   private String lV100Tcalprowwds_26_tfalbpromatricula ;
   private String lV104Tcalprowwds_30_tfalbproidat ;
   private String A13417AlbProTipo ;
   private String A13440AlbProAnul ;
   private String A13420AlbProPrvN ;
   private String A13426AlbProCliN ;
   private String A841TrnNom ;
   private String A13424AlbProMatr ;
   private String A13436AlbProIDAT ;
   private String A396EmprCod ;
   private java.util.Date AV18TFAlbProSal ;
   private java.util.Date AV81Tcalprowwds_7_tfalbprosal ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date AV16TFAlbProDate ;
   private java.util.Date AV80Tcalprowwds_6_tfalbprodate ;
   private java.util.Date A13430AlbProDate ;
   private boolean returnInSub ;
   private boolean brk91Q2 ;
   private boolean n13453CatDocID ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n13420AlbProPrvN ;
   private boolean n13454CatDocNom ;
   private boolean brk91Q4 ;
   private boolean brk91Q6 ;
   private boolean brk91Q8 ;
   private boolean brk91Q10 ;
   private boolean brk91Q12 ;
   private boolean brk91Q14 ;
   private String AV48OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV12TFAlbProInEx_SelsJson ;
   private String AV14TFAlbProTipo_SelsJson ;
   private String AV69TFAlbProStAT_SelsJson ;
   private String AV63TFAlbProAnulado_SelsJson ;
   private String AV44DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV60FilterFullText ;
   private String AV40TFAlbProObs ;
   private String AV41TFAlbProObs_Sel ;
   private String AV75Tcalprowwds_1_filterfulltext ;
   private String AV102Tcalprowwds_28_tfalbproobs ;
   private String AV103Tcalprowwds_29_tfalbproobs_sel ;
   private String lV75Tcalprowwds_1_filterfulltext ;
   private String lV102Tcalprowwds_28_tfalbproobs ;
   private String A13439AlbProObs ;
   private String AV46Option ;
   private GXSimpleCollection<Byte> AV13TFAlbProInEx_Sels ;
   private GXSimpleCollection<Byte> AV70TFAlbProStAT_Sels ;
   private GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ;
   private GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P091Q2_A13453CatDocID ;
   private boolean[] P091Q2_n13453CatDocID ;
   private String[] P091Q2_A396EmprCod ;
   private String[] P091Q2_A13440AlbProAnul ;
   private byte[] P091Q2_A13438AlbProStAT ;
   private String[] P091Q2_A13436AlbProIDAT ;
   private String[] P091Q2_A13439AlbProObs ;
   private String[] P091Q2_A13424AlbProMatr ;
   private String[] P091Q2_A841TrnNom ;
   private boolean[] P091Q2_n841TrnNom ;
   private short[] P091Q2_A840TrnCod ;
   private boolean[] P091Q2_n840TrnCod ;
   private byte[] P091Q2_A13427AlbProDomE ;
   private String[] P091Q2_A13426AlbProCliN ;
   private int[] P091Q2_A13425AlbProCliC ;
   private String[] P091Q2_A13420AlbProPrvN ;
   private boolean[] P091Q2_n13420AlbProPrvN ;
   private int[] P091Q2_A13419AlbProPrvI ;
   private String[] P091Q2_A13454CatDocNom ;
   private boolean[] P091Q2_n13454CatDocNom ;
   private java.util.Date[] P091Q2_A13429AlbProSal ;
   private java.util.Date[] P091Q2_A13430AlbProDate ;
   private int[] P091Q2_A13418AlbProID ;
   private String[] P091Q2_A13417AlbProTipo ;
   private byte[] P091Q2_A13452AlbProInEx ;
   private int[] P091Q3_A13419AlbProPrvI ;
   private String[] P091Q3_A396EmprCod ;
   private String[] P091Q3_A13440AlbProAnul ;
   private byte[] P091Q3_A13438AlbProStAT ;
   private String[] P091Q3_A13436AlbProIDAT ;
   private String[] P091Q3_A13439AlbProObs ;
   private String[] P091Q3_A13424AlbProMatr ;
   private String[] P091Q3_A841TrnNom ;
   private boolean[] P091Q3_n841TrnNom ;
   private short[] P091Q3_A840TrnCod ;
   private boolean[] P091Q3_n840TrnCod ;
   private byte[] P091Q3_A13427AlbProDomE ;
   private String[] P091Q3_A13426AlbProCliN ;
   private int[] P091Q3_A13425AlbProCliC ;
   private String[] P091Q3_A13420AlbProPrvN ;
   private boolean[] P091Q3_n13420AlbProPrvN ;
   private String[] P091Q3_A13454CatDocNom ;
   private boolean[] P091Q3_n13454CatDocNom ;
   private short[] P091Q3_A13453CatDocID ;
   private boolean[] P091Q3_n13453CatDocID ;
   private java.util.Date[] P091Q3_A13429AlbProSal ;
   private java.util.Date[] P091Q3_A13430AlbProDate ;
   private int[] P091Q3_A13418AlbProID ;
   private String[] P091Q3_A13417AlbProTipo ;
   private byte[] P091Q3_A13452AlbProInEx ;
   private String[] P091Q4_A396EmprCod ;
   private String[] P091Q4_A13426AlbProCliN ;
   private String[] P091Q4_A13440AlbProAnul ;
   private byte[] P091Q4_A13438AlbProStAT ;
   private String[] P091Q4_A13436AlbProIDAT ;
   private String[] P091Q4_A13439AlbProObs ;
   private String[] P091Q4_A13424AlbProMatr ;
   private String[] P091Q4_A841TrnNom ;
   private boolean[] P091Q4_n841TrnNom ;
   private short[] P091Q4_A840TrnCod ;
   private boolean[] P091Q4_n840TrnCod ;
   private byte[] P091Q4_A13427AlbProDomE ;
   private int[] P091Q4_A13425AlbProCliC ;
   private String[] P091Q4_A13420AlbProPrvN ;
   private boolean[] P091Q4_n13420AlbProPrvN ;
   private int[] P091Q4_A13419AlbProPrvI ;
   private String[] P091Q4_A13454CatDocNom ;
   private boolean[] P091Q4_n13454CatDocNom ;
   private short[] P091Q4_A13453CatDocID ;
   private boolean[] P091Q4_n13453CatDocID ;
   private java.util.Date[] P091Q4_A13429AlbProSal ;
   private java.util.Date[] P091Q4_A13430AlbProDate ;
   private int[] P091Q4_A13418AlbProID ;
   private String[] P091Q4_A13417AlbProTipo ;
   private byte[] P091Q4_A13452AlbProInEx ;
   private short[] P091Q5_A840TrnCod ;
   private boolean[] P091Q5_n840TrnCod ;
   private String[] P091Q5_A396EmprCod ;
   private String[] P091Q5_A13440AlbProAnul ;
   private byte[] P091Q5_A13438AlbProStAT ;
   private String[] P091Q5_A13436AlbProIDAT ;
   private String[] P091Q5_A13439AlbProObs ;
   private String[] P091Q5_A13424AlbProMatr ;
   private String[] P091Q5_A841TrnNom ;
   private boolean[] P091Q5_n841TrnNom ;
   private byte[] P091Q5_A13427AlbProDomE ;
   private String[] P091Q5_A13426AlbProCliN ;
   private int[] P091Q5_A13425AlbProCliC ;
   private String[] P091Q5_A13420AlbProPrvN ;
   private boolean[] P091Q5_n13420AlbProPrvN ;
   private int[] P091Q5_A13419AlbProPrvI ;
   private String[] P091Q5_A13454CatDocNom ;
   private boolean[] P091Q5_n13454CatDocNom ;
   private short[] P091Q5_A13453CatDocID ;
   private boolean[] P091Q5_n13453CatDocID ;
   private java.util.Date[] P091Q5_A13429AlbProSal ;
   private java.util.Date[] P091Q5_A13430AlbProDate ;
   private int[] P091Q5_A13418AlbProID ;
   private String[] P091Q5_A13417AlbProTipo ;
   private byte[] P091Q5_A13452AlbProInEx ;
   private String[] P091Q6_A396EmprCod ;
   private String[] P091Q6_A13424AlbProMatr ;
   private String[] P091Q6_A13440AlbProAnul ;
   private byte[] P091Q6_A13438AlbProStAT ;
   private String[] P091Q6_A13436AlbProIDAT ;
   private String[] P091Q6_A13439AlbProObs ;
   private String[] P091Q6_A841TrnNom ;
   private boolean[] P091Q6_n841TrnNom ;
   private short[] P091Q6_A840TrnCod ;
   private boolean[] P091Q6_n840TrnCod ;
   private byte[] P091Q6_A13427AlbProDomE ;
   private String[] P091Q6_A13426AlbProCliN ;
   private int[] P091Q6_A13425AlbProCliC ;
   private String[] P091Q6_A13420AlbProPrvN ;
   private boolean[] P091Q6_n13420AlbProPrvN ;
   private int[] P091Q6_A13419AlbProPrvI ;
   private String[] P091Q6_A13454CatDocNom ;
   private boolean[] P091Q6_n13454CatDocNom ;
   private short[] P091Q6_A13453CatDocID ;
   private boolean[] P091Q6_n13453CatDocID ;
   private java.util.Date[] P091Q6_A13429AlbProSal ;
   private java.util.Date[] P091Q6_A13430AlbProDate ;
   private int[] P091Q6_A13418AlbProID ;
   private String[] P091Q6_A13417AlbProTipo ;
   private byte[] P091Q6_A13452AlbProInEx ;
   private String[] P091Q7_A396EmprCod ;
   private String[] P091Q7_A13439AlbProObs ;
   private String[] P091Q7_A13440AlbProAnul ;
   private byte[] P091Q7_A13438AlbProStAT ;
   private String[] P091Q7_A13436AlbProIDAT ;
   private String[] P091Q7_A13424AlbProMatr ;
   private String[] P091Q7_A841TrnNom ;
   private boolean[] P091Q7_n841TrnNom ;
   private short[] P091Q7_A840TrnCod ;
   private boolean[] P091Q7_n840TrnCod ;
   private byte[] P091Q7_A13427AlbProDomE ;
   private String[] P091Q7_A13426AlbProCliN ;
   private int[] P091Q7_A13425AlbProCliC ;
   private String[] P091Q7_A13420AlbProPrvN ;
   private boolean[] P091Q7_n13420AlbProPrvN ;
   private int[] P091Q7_A13419AlbProPrvI ;
   private String[] P091Q7_A13454CatDocNom ;
   private boolean[] P091Q7_n13454CatDocNom ;
   private short[] P091Q7_A13453CatDocID ;
   private boolean[] P091Q7_n13453CatDocID ;
   private java.util.Date[] P091Q7_A13429AlbProSal ;
   private java.util.Date[] P091Q7_A13430AlbProDate ;
   private int[] P091Q7_A13418AlbProID ;
   private String[] P091Q7_A13417AlbProTipo ;
   private byte[] P091Q7_A13452AlbProInEx ;
   private String[] P091Q8_A396EmprCod ;
   private String[] P091Q8_A13436AlbProIDAT ;
   private String[] P091Q8_A13440AlbProAnul ;
   private byte[] P091Q8_A13438AlbProStAT ;
   private String[] P091Q8_A13439AlbProObs ;
   private String[] P091Q8_A13424AlbProMatr ;
   private String[] P091Q8_A841TrnNom ;
   private boolean[] P091Q8_n841TrnNom ;
   private short[] P091Q8_A840TrnCod ;
   private boolean[] P091Q8_n840TrnCod ;
   private byte[] P091Q8_A13427AlbProDomE ;
   private String[] P091Q8_A13426AlbProCliN ;
   private int[] P091Q8_A13425AlbProCliC ;
   private String[] P091Q8_A13420AlbProPrvN ;
   private boolean[] P091Q8_n13420AlbProPrvN ;
   private int[] P091Q8_A13419AlbProPrvI ;
   private String[] P091Q8_A13454CatDocNom ;
   private boolean[] P091Q8_n13454CatDocNom ;
   private short[] P091Q8_A13453CatDocID ;
   private boolean[] P091Q8_n13453CatDocID ;
   private java.util.Date[] P091Q8_A13429AlbProSal ;
   private java.util.Date[] P091Q8_A13430AlbProDate ;
   private int[] P091Q8_A13418AlbProID ;
   private String[] P091Q8_A13417AlbProTipo ;
   private byte[] P091Q8_A13452AlbProInEx ;
   private GXSimpleCollection<String> AV15TFAlbProTipo_Sels ;
   private GXSimpleCollection<String> AV64TFAlbProAnulado_Sels ;
   private GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ;
   private GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ;
   private GXSimpleCollection<String> AV47Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV52OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class tcalprowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CatDocID, T1.EmprCod, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T3.TrnNom, T1.TrnCod, T1.AlbProDomE, T4.CliNom AS AlbProCliN," ;
      scmdbuf += " T1.AlbProCliC AS AlbProCliC, T5.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T2.CatDocNom, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPCATDOC T2 ON T2.EmprCod = T1.EmprCod AND T2.CatDocID = T1.CatDocID) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.AlbProCliC) INNER JOIN TXPPRVGEN T5 ON T5.EmprCod = T1.EmprCod AND T5.PrvNum" ;
      scmdbuf += " = T1.AlbProPrvI)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CatDocNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.PrvNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CatDocID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P091Q3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[28];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.AlbProPrvI AS AlbProPrvI, T1.EmprCod, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T3.TrnNom, T1.TrnCod, T1.AlbProDomE, T4.CliNom" ;
      scmdbuf += " AS AlbProCliN, T1.AlbProCliC AS AlbProCliC, T2.PrvNom AS AlbProPrvN, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.AlbProCliC) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProPrvI" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P091Q4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[28];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom AS AlbProCliN, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P091Q5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[28];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.EmprCod, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T2.TrnNom, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TrnCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P091Q6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[28];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProMatr, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProMatr" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P091Q7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[28];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProObs, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProMatr, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProObs" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P091Q8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV78Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV79Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV106Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV107Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV76Tcalprowwds_2_tfalbproid ,
                                          int AV77Tcalprowwds_3_tfalbproid_to ,
                                          int AV78Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV79Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV80Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV81Tcalprowwds_7_tfalbprosal ,
                                          short AV82Tcalprowwds_8_tfcatdocid ,
                                          short AV83Tcalprowwds_9_tfcatdocid_to ,
                                          String AV85Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV84Tcalprowwds_10_tfcatdocnom ,
                                          int AV86Tcalprowwds_12_tfalbproprvid ,
                                          int AV87Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV89Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV88Tcalprowwds_14_tfalbproprvnom ,
                                          int AV90Tcalprowwds_16_tfalbproclicod ,
                                          int AV91Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV93Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV92Tcalprowwds_18_tfalbproclinom ,
                                          byte AV94Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV95Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV96Tcalprowwds_22_tftrncod ,
                                          short AV97Tcalprowwds_23_tftrncod_to ,
                                          String AV99Tcalprowwds_25_tftrnnom_sel ,
                                          String AV98Tcalprowwds_24_tftrnnom ,
                                          String AV101Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV100Tcalprowwds_26_tfalbpromatricula ,
                                          String AV103Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV102Tcalprowwds_28_tfalbproobs ,
                                          String AV105Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV104Tcalprowwds_30_tfalbproidat ,
                                          int AV106Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV107Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          String AV75Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[28];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProIDAT, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProObs, T1.AlbProMatr, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV76Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV77Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( AV78Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV79Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (0==AV83Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV86Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV92Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV97Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV100Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV104Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( AV106Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV107Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProIDAT" ;
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
                  return conditional_P091Q2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 1 :
                  return conditional_P091Q3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 2 :
                  return conditional_P091Q4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 3 :
                  return conditional_P091Q5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 4 :
                  return conditional_P091Q6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 5 :
                  return conditional_P091Q7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
            case 6 :
                  return conditional_P091Q8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091Q3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091Q4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091Q5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091Q6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091Q7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091Q8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
      }
   }

}

