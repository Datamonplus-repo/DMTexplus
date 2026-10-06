package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmformulaswwgetfilterdata extends GXProcedure
{
   public tmformulaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmformulaswwgetfilterdata.class ), "" );
   }

   public tmformulaswwgetfilterdata( int remoteHandle ,
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
      tmformulaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tmformulaswwgetfilterdata.this.AV58DDOName = aP0;
      tmformulaswwgetfilterdata.this.AV56SearchTxt = aP1;
      tmformulaswwgetfilterdata.this.AV57SearchTxtTo = aP2;
      tmformulaswwgetfilterdata.this.aP3 = aP3;
      tmformulaswwgetfilterdata.this.aP4 = aP4;
      tmformulaswwgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_FORSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_FORSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_FORNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADFORNOMCLIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_TIPCOLDSC") == 0 )
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
      AV62OptionsJson = AV61Options.toJSonString(false) ;
      AV65OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV67OptionIndexesJson = AV66OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Session.getValue("TMFormulasWWGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMFormulasWWGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("TMFormulasWWGridState"), null, null);
      }
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FORFEC") == 0 )
         {
            AV108ForFec = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV109ForFec_To = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV118FilterFullText = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV16TFForSerDsc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV17TFForSerDsc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV18TFForColNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV19TFForColNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV20TFForColNum = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFForColNum_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV50TFForNomCli = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV51TFForNomCli_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV22TFTipColCod = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTipColCod_To = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV24TFTipColDsc = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV25TFTipColDsc_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV110TFForFec = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV112TFForUltUti = localUtil.ctod( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV114TFForNumCol = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV115TFForNumCol_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV116TFForRelBan = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV117TFForRelBan_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV56SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV123Tmformulaswwds_1_forfec = AV108ForFec ;
      AV124Tmformulaswwds_2_forfec_to = AV109ForFec_To ;
      AV125Tmformulaswwds_3_filterfulltext = AV118FilterFullText ;
      AV126Tmformulaswwds_4_tfclicod = AV10TFCliCod ;
      AV127Tmformulaswwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV128Tmformulaswwds_6_tfclinom = AV12TFCliNom ;
      AV129Tmformulaswwds_7_tfclinom_sel = AV13TFCliNom_Sel ;
      AV130Tmformulaswwds_8_tfforser = AV14TFForSer ;
      AV131Tmformulaswwds_9_tfforser_sel = AV15TFForSer_Sel ;
      AV132Tmformulaswwds_10_tfforserdsc = AV16TFForSerDsc ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV134Tmformulaswwds_12_tfforcolnom = AV18TFForColNom ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV136Tmformulaswwds_14_tfforcolnum = AV20TFForColNum ;
      AV137Tmformulaswwds_15_tfforcolnum_to = AV21TFForColNum_To ;
      AV138Tmformulaswwds_16_tffornomcli = AV50TFForNomCli ;
      AV139Tmformulaswwds_17_tffornomcli_sel = AV51TFForNomCli_Sel ;
      AV140Tmformulaswwds_18_tftipcolcod = AV22TFTipColCod ;
      AV141Tmformulaswwds_19_tftipcolcod_to = AV23TFTipColCod_To ;
      AV142Tmformulaswwds_20_tftipcoldsc = AV24TFTipColDsc ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV144Tmformulaswwds_22_tfforfec = AV110TFForFec ;
      AV145Tmformulaswwds_23_tfforultuti = AV112TFForUltUti ;
      AV146Tmformulaswwds_24_tffornumcol = AV114TFForNumCol ;
      AV147Tmformulaswwds_25_tffornumcol_to = AV115TFForNumCol_To ;
      AV148Tmformulaswwds_26_tfforrelban = AV116TFForRelBan ;
      AV149Tmformulaswwds_27_tfforrelban_to = AV117TFForRelBan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV123Tmformulaswwds_1_forfec ,
                                           AV124Tmformulaswwds_2_forfec_to ,
                                           AV125Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV126Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to) ,
                                           AV129Tmformulaswwds_7_tfclinom_sel ,
                                           AV128Tmformulaswwds_6_tfclinom ,
                                           AV131Tmformulaswwds_9_tfforser_sel ,
                                           AV130Tmformulaswwds_8_tfforser ,
                                           AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV132Tmformulaswwds_10_tfforserdsc ,
                                           AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV134Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV139Tmformulaswwds_17_tffornomcli_sel ,
                                           AV138Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV142Tmformulaswwds_20_tftipcoldsc ,
                                           AV144Tmformulaswwds_22_tfforfec ,
                                           AV145Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to) ,
                                           AV148Tmformulaswwds_26_tfforrelban ,
                                           AV149Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV128Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV130Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV130Tmformulaswwds_8_tfforser), 16, "%") ;
      lV132Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV132Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV134Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV134Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV138Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV138Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV142Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV142Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JO2 */
      pr_default.execute(0, new Object[] {AV123Tmformulaswwds_1_forfec, AV124Tmformulaswwds_2_forfec_to, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV126Tmformulaswwds_4_tfclicod), Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to), lV128Tmformulaswwds_6_tfclinom, AV129Tmformulaswwds_7_tfclinom_sel, lV130Tmformulaswwds_8_tfforser, AV131Tmformulaswwds_9_tfforser_sel, lV132Tmformulaswwds_10_tfforserdsc, AV133Tmformulaswwds_11_tfforserdsc_sel, lV134Tmformulaswwds_12_tfforcolnom, AV135Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to), lV138Tmformulaswwds_16_tffornomcli, AV139Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to), lV142Tmformulaswwds_20_tftipcoldsc, AV143Tmformulaswwds_21_tftipcoldsc_sel, AV144Tmformulaswwds_22_tfforfec, AV145Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to), AV148Tmformulaswwds_26_tfforrelban, AV149Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8JO2 = false ;
         A396EmprCod = P08JO2_A396EmprCod[0] ;
         A279CliNom = P08JO2_A279CliNom[0] ;
         A2838ForRelBan = P08JO2_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JO2_n2838ForRelBan[0] ;
         A486ForNumCol = P08JO2_A486ForNumCol[0] ;
         A496ForUltUti = P08JO2_A496ForUltUti[0] ;
         n496ForUltUti = P08JO2_n496ForUltUti[0] ;
         A832TipColDsc = P08JO2_A832TipColDsc[0] ;
         n832TipColDsc = P08JO2_n832TipColDsc[0] ;
         A831TipColCod = P08JO2_A831TipColCod[0] ;
         A1191ForNomCli = P08JO2_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JO2_n1191ForNomCli[0] ;
         A483ForColNum = P08JO2_A483ForColNum[0] ;
         A482ForColNom = P08JO2_A482ForColNom[0] ;
         A5742ForSerDsc = P08JO2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JO2_n5742ForSerDsc[0] ;
         A494ForSer = P08JO2_A494ForSer[0] ;
         A252CliCod = P08JO2_A252CliCod[0] ;
         A485ForFec = P08JO2_A485ForFec[0] ;
         n485ForFec = P08JO2_n485ForFec[0] ;
         A832TipColDsc = P08JO2_A832TipColDsc[0] ;
         n832TipColDsc = P08JO2_n832TipColDsc[0] ;
         A279CliNom = P08JO2_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08JO2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8JO2 = false ;
            A396EmprCod = P08JO2_A396EmprCod[0] ;
            A831TipColCod = P08JO2_A831TipColCod[0] ;
            A483ForColNum = P08JO2_A483ForColNum[0] ;
            A482ForColNom = P08JO2_A482ForColNom[0] ;
            A494ForSer = P08JO2_A494ForSer[0] ;
            A252CliCod = P08JO2_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8JO2 = true ;
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
         if ( ! brk8JO2 )
         {
            brk8JO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV56SearchTxt ;
      AV15TFForSer_Sel = "" ;
      AV123Tmformulaswwds_1_forfec = AV108ForFec ;
      AV124Tmformulaswwds_2_forfec_to = AV109ForFec_To ;
      AV125Tmformulaswwds_3_filterfulltext = AV118FilterFullText ;
      AV126Tmformulaswwds_4_tfclicod = AV10TFCliCod ;
      AV127Tmformulaswwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV128Tmformulaswwds_6_tfclinom = AV12TFCliNom ;
      AV129Tmformulaswwds_7_tfclinom_sel = AV13TFCliNom_Sel ;
      AV130Tmformulaswwds_8_tfforser = AV14TFForSer ;
      AV131Tmformulaswwds_9_tfforser_sel = AV15TFForSer_Sel ;
      AV132Tmformulaswwds_10_tfforserdsc = AV16TFForSerDsc ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV134Tmformulaswwds_12_tfforcolnom = AV18TFForColNom ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV136Tmformulaswwds_14_tfforcolnum = AV20TFForColNum ;
      AV137Tmformulaswwds_15_tfforcolnum_to = AV21TFForColNum_To ;
      AV138Tmformulaswwds_16_tffornomcli = AV50TFForNomCli ;
      AV139Tmformulaswwds_17_tffornomcli_sel = AV51TFForNomCli_Sel ;
      AV140Tmformulaswwds_18_tftipcolcod = AV22TFTipColCod ;
      AV141Tmformulaswwds_19_tftipcolcod_to = AV23TFTipColCod_To ;
      AV142Tmformulaswwds_20_tftipcoldsc = AV24TFTipColDsc ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV144Tmformulaswwds_22_tfforfec = AV110TFForFec ;
      AV145Tmformulaswwds_23_tfforultuti = AV112TFForUltUti ;
      AV146Tmformulaswwds_24_tffornumcol = AV114TFForNumCol ;
      AV147Tmformulaswwds_25_tffornumcol_to = AV115TFForNumCol_To ;
      AV148Tmformulaswwds_26_tfforrelban = AV116TFForRelBan ;
      AV149Tmformulaswwds_27_tfforrelban_to = AV117TFForRelBan_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV123Tmformulaswwds_1_forfec ,
                                           AV124Tmformulaswwds_2_forfec_to ,
                                           AV125Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV126Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to) ,
                                           AV129Tmformulaswwds_7_tfclinom_sel ,
                                           AV128Tmformulaswwds_6_tfclinom ,
                                           AV131Tmformulaswwds_9_tfforser_sel ,
                                           AV130Tmformulaswwds_8_tfforser ,
                                           AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV132Tmformulaswwds_10_tfforserdsc ,
                                           AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV134Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV139Tmformulaswwds_17_tffornomcli_sel ,
                                           AV138Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV142Tmformulaswwds_20_tftipcoldsc ,
                                           AV144Tmformulaswwds_22_tfforfec ,
                                           AV145Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to) ,
                                           AV148Tmformulaswwds_26_tfforrelban ,
                                           AV149Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV128Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV130Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV130Tmformulaswwds_8_tfforser), 16, "%") ;
      lV132Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV132Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV134Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV134Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV138Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV138Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV142Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV142Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JO3 */
      pr_default.execute(1, new Object[] {AV123Tmformulaswwds_1_forfec, AV124Tmformulaswwds_2_forfec_to, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV126Tmformulaswwds_4_tfclicod), Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to), lV128Tmformulaswwds_6_tfclinom, AV129Tmformulaswwds_7_tfclinom_sel, lV130Tmformulaswwds_8_tfforser, AV131Tmformulaswwds_9_tfforser_sel, lV132Tmformulaswwds_10_tfforserdsc, AV133Tmformulaswwds_11_tfforserdsc_sel, lV134Tmformulaswwds_12_tfforcolnom, AV135Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to), lV138Tmformulaswwds_16_tffornomcli, AV139Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to), lV142Tmformulaswwds_20_tftipcoldsc, AV143Tmformulaswwds_21_tftipcoldsc_sel, AV144Tmformulaswwds_22_tfforfec, AV145Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to), AV148Tmformulaswwds_26_tfforrelban, AV149Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8JO4 = false ;
         A396EmprCod = P08JO3_A396EmprCod[0] ;
         A494ForSer = P08JO3_A494ForSer[0] ;
         A2838ForRelBan = P08JO3_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JO3_n2838ForRelBan[0] ;
         A486ForNumCol = P08JO3_A486ForNumCol[0] ;
         A496ForUltUti = P08JO3_A496ForUltUti[0] ;
         n496ForUltUti = P08JO3_n496ForUltUti[0] ;
         A832TipColDsc = P08JO3_A832TipColDsc[0] ;
         n832TipColDsc = P08JO3_n832TipColDsc[0] ;
         A831TipColCod = P08JO3_A831TipColCod[0] ;
         A1191ForNomCli = P08JO3_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JO3_n1191ForNomCli[0] ;
         A483ForColNum = P08JO3_A483ForColNum[0] ;
         A482ForColNom = P08JO3_A482ForColNom[0] ;
         A5742ForSerDsc = P08JO3_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JO3_n5742ForSerDsc[0] ;
         A279CliNom = P08JO3_A279CliNom[0] ;
         A252CliCod = P08JO3_A252CliCod[0] ;
         A485ForFec = P08JO3_A485ForFec[0] ;
         n485ForFec = P08JO3_n485ForFec[0] ;
         A832TipColDsc = P08JO3_A832TipColDsc[0] ;
         n832TipColDsc = P08JO3_n832TipColDsc[0] ;
         A279CliNom = P08JO3_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08JO3_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk8JO4 = false ;
            A396EmprCod = P08JO3_A396EmprCod[0] ;
            A831TipColCod = P08JO3_A831TipColCod[0] ;
            A483ForColNum = P08JO3_A483ForColNum[0] ;
            A482ForColNom = P08JO3_A482ForColNom[0] ;
            A252CliCod = P08JO3_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8JO4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV60Option = A494ForSer ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JO4 )
         {
            brk8JO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForSerDsc = AV56SearchTxt ;
      AV17TFForSerDsc_Sel = "" ;
      AV123Tmformulaswwds_1_forfec = AV108ForFec ;
      AV124Tmformulaswwds_2_forfec_to = AV109ForFec_To ;
      AV125Tmformulaswwds_3_filterfulltext = AV118FilterFullText ;
      AV126Tmformulaswwds_4_tfclicod = AV10TFCliCod ;
      AV127Tmformulaswwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV128Tmformulaswwds_6_tfclinom = AV12TFCliNom ;
      AV129Tmformulaswwds_7_tfclinom_sel = AV13TFCliNom_Sel ;
      AV130Tmformulaswwds_8_tfforser = AV14TFForSer ;
      AV131Tmformulaswwds_9_tfforser_sel = AV15TFForSer_Sel ;
      AV132Tmformulaswwds_10_tfforserdsc = AV16TFForSerDsc ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV134Tmformulaswwds_12_tfforcolnom = AV18TFForColNom ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV136Tmformulaswwds_14_tfforcolnum = AV20TFForColNum ;
      AV137Tmformulaswwds_15_tfforcolnum_to = AV21TFForColNum_To ;
      AV138Tmformulaswwds_16_tffornomcli = AV50TFForNomCli ;
      AV139Tmformulaswwds_17_tffornomcli_sel = AV51TFForNomCli_Sel ;
      AV140Tmformulaswwds_18_tftipcolcod = AV22TFTipColCod ;
      AV141Tmformulaswwds_19_tftipcolcod_to = AV23TFTipColCod_To ;
      AV142Tmformulaswwds_20_tftipcoldsc = AV24TFTipColDsc ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV144Tmformulaswwds_22_tfforfec = AV110TFForFec ;
      AV145Tmformulaswwds_23_tfforultuti = AV112TFForUltUti ;
      AV146Tmformulaswwds_24_tffornumcol = AV114TFForNumCol ;
      AV147Tmformulaswwds_25_tffornumcol_to = AV115TFForNumCol_To ;
      AV148Tmformulaswwds_26_tfforrelban = AV116TFForRelBan ;
      AV149Tmformulaswwds_27_tfforrelban_to = AV117TFForRelBan_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV123Tmformulaswwds_1_forfec ,
                                           AV124Tmformulaswwds_2_forfec_to ,
                                           AV125Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV126Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to) ,
                                           AV129Tmformulaswwds_7_tfclinom_sel ,
                                           AV128Tmformulaswwds_6_tfclinom ,
                                           AV131Tmformulaswwds_9_tfforser_sel ,
                                           AV130Tmformulaswwds_8_tfforser ,
                                           AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV132Tmformulaswwds_10_tfforserdsc ,
                                           AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV134Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV139Tmformulaswwds_17_tffornomcli_sel ,
                                           AV138Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV142Tmformulaswwds_20_tftipcoldsc ,
                                           AV144Tmformulaswwds_22_tfforfec ,
                                           AV145Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to) ,
                                           AV148Tmformulaswwds_26_tfforrelban ,
                                           AV149Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV128Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV130Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV130Tmformulaswwds_8_tfforser), 16, "%") ;
      lV132Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV132Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV134Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV134Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV138Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV138Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV142Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV142Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JO4 */
      pr_default.execute(2, new Object[] {AV123Tmformulaswwds_1_forfec, AV124Tmformulaswwds_2_forfec_to, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV126Tmformulaswwds_4_tfclicod), Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to), lV128Tmformulaswwds_6_tfclinom, AV129Tmformulaswwds_7_tfclinom_sel, lV130Tmformulaswwds_8_tfforser, AV131Tmformulaswwds_9_tfforser_sel, lV132Tmformulaswwds_10_tfforserdsc, AV133Tmformulaswwds_11_tfforserdsc_sel, lV134Tmformulaswwds_12_tfforcolnom, AV135Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to), lV138Tmformulaswwds_16_tffornomcli, AV139Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to), lV142Tmformulaswwds_20_tftipcoldsc, AV143Tmformulaswwds_21_tftipcoldsc_sel, AV144Tmformulaswwds_22_tfforfec, AV145Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to), AV148Tmformulaswwds_26_tfforrelban, AV149Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8JO6 = false ;
         A396EmprCod = P08JO4_A396EmprCod[0] ;
         A5742ForSerDsc = P08JO4_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JO4_n5742ForSerDsc[0] ;
         A2838ForRelBan = P08JO4_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JO4_n2838ForRelBan[0] ;
         A486ForNumCol = P08JO4_A486ForNumCol[0] ;
         A496ForUltUti = P08JO4_A496ForUltUti[0] ;
         n496ForUltUti = P08JO4_n496ForUltUti[0] ;
         A832TipColDsc = P08JO4_A832TipColDsc[0] ;
         n832TipColDsc = P08JO4_n832TipColDsc[0] ;
         A831TipColCod = P08JO4_A831TipColCod[0] ;
         A1191ForNomCli = P08JO4_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JO4_n1191ForNomCli[0] ;
         A483ForColNum = P08JO4_A483ForColNum[0] ;
         A482ForColNom = P08JO4_A482ForColNom[0] ;
         A494ForSer = P08JO4_A494ForSer[0] ;
         A279CliNom = P08JO4_A279CliNom[0] ;
         A252CliCod = P08JO4_A252CliCod[0] ;
         A485ForFec = P08JO4_A485ForFec[0] ;
         n485ForFec = P08JO4_n485ForFec[0] ;
         A832TipColDsc = P08JO4_A832TipColDsc[0] ;
         n832TipColDsc = P08JO4_n832TipColDsc[0] ;
         A279CliNom = P08JO4_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08JO4_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk8JO6 = false ;
            A396EmprCod = P08JO4_A396EmprCod[0] ;
            A831TipColCod = P08JO4_A831TipColCod[0] ;
            A483ForColNum = P08JO4_A483ForColNum[0] ;
            A482ForColNom = P08JO4_A482ForColNom[0] ;
            A494ForSer = P08JO4_A494ForSer[0] ;
            A252CliCod = P08JO4_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8JO6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV60Option = A5742ForSerDsc ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JO6 )
         {
            brk8JO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForColNom = AV56SearchTxt ;
      AV19TFForColNom_Sel = "" ;
      AV123Tmformulaswwds_1_forfec = AV108ForFec ;
      AV124Tmformulaswwds_2_forfec_to = AV109ForFec_To ;
      AV125Tmformulaswwds_3_filterfulltext = AV118FilterFullText ;
      AV126Tmformulaswwds_4_tfclicod = AV10TFCliCod ;
      AV127Tmformulaswwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV128Tmformulaswwds_6_tfclinom = AV12TFCliNom ;
      AV129Tmformulaswwds_7_tfclinom_sel = AV13TFCliNom_Sel ;
      AV130Tmformulaswwds_8_tfforser = AV14TFForSer ;
      AV131Tmformulaswwds_9_tfforser_sel = AV15TFForSer_Sel ;
      AV132Tmformulaswwds_10_tfforserdsc = AV16TFForSerDsc ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV134Tmformulaswwds_12_tfforcolnom = AV18TFForColNom ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV136Tmformulaswwds_14_tfforcolnum = AV20TFForColNum ;
      AV137Tmformulaswwds_15_tfforcolnum_to = AV21TFForColNum_To ;
      AV138Tmformulaswwds_16_tffornomcli = AV50TFForNomCli ;
      AV139Tmformulaswwds_17_tffornomcli_sel = AV51TFForNomCli_Sel ;
      AV140Tmformulaswwds_18_tftipcolcod = AV22TFTipColCod ;
      AV141Tmformulaswwds_19_tftipcolcod_to = AV23TFTipColCod_To ;
      AV142Tmformulaswwds_20_tftipcoldsc = AV24TFTipColDsc ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV144Tmformulaswwds_22_tfforfec = AV110TFForFec ;
      AV145Tmformulaswwds_23_tfforultuti = AV112TFForUltUti ;
      AV146Tmformulaswwds_24_tffornumcol = AV114TFForNumCol ;
      AV147Tmformulaswwds_25_tffornumcol_to = AV115TFForNumCol_To ;
      AV148Tmformulaswwds_26_tfforrelban = AV116TFForRelBan ;
      AV149Tmformulaswwds_27_tfforrelban_to = AV117TFForRelBan_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV123Tmformulaswwds_1_forfec ,
                                           AV124Tmformulaswwds_2_forfec_to ,
                                           AV125Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV126Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to) ,
                                           AV129Tmformulaswwds_7_tfclinom_sel ,
                                           AV128Tmformulaswwds_6_tfclinom ,
                                           AV131Tmformulaswwds_9_tfforser_sel ,
                                           AV130Tmformulaswwds_8_tfforser ,
                                           AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV132Tmformulaswwds_10_tfforserdsc ,
                                           AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV134Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV139Tmformulaswwds_17_tffornomcli_sel ,
                                           AV138Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV142Tmformulaswwds_20_tftipcoldsc ,
                                           AV144Tmformulaswwds_22_tfforfec ,
                                           AV145Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to) ,
                                           AV148Tmformulaswwds_26_tfforrelban ,
                                           AV149Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV128Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV130Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV130Tmformulaswwds_8_tfforser), 16, "%") ;
      lV132Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV132Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV134Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV134Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV138Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV138Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV142Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV142Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JO5 */
      pr_default.execute(3, new Object[] {AV123Tmformulaswwds_1_forfec, AV124Tmformulaswwds_2_forfec_to, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV126Tmformulaswwds_4_tfclicod), Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to), lV128Tmformulaswwds_6_tfclinom, AV129Tmformulaswwds_7_tfclinom_sel, lV130Tmformulaswwds_8_tfforser, AV131Tmformulaswwds_9_tfforser_sel, lV132Tmformulaswwds_10_tfforserdsc, AV133Tmformulaswwds_11_tfforserdsc_sel, lV134Tmformulaswwds_12_tfforcolnom, AV135Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to), lV138Tmformulaswwds_16_tffornomcli, AV139Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to), lV142Tmformulaswwds_20_tftipcoldsc, AV143Tmformulaswwds_21_tftipcoldsc_sel, AV144Tmformulaswwds_22_tfforfec, AV145Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to), AV148Tmformulaswwds_26_tfforrelban, AV149Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8JO8 = false ;
         A396EmprCod = P08JO5_A396EmprCod[0] ;
         A482ForColNom = P08JO5_A482ForColNom[0] ;
         A2838ForRelBan = P08JO5_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JO5_n2838ForRelBan[0] ;
         A486ForNumCol = P08JO5_A486ForNumCol[0] ;
         A496ForUltUti = P08JO5_A496ForUltUti[0] ;
         n496ForUltUti = P08JO5_n496ForUltUti[0] ;
         A832TipColDsc = P08JO5_A832TipColDsc[0] ;
         n832TipColDsc = P08JO5_n832TipColDsc[0] ;
         A831TipColCod = P08JO5_A831TipColCod[0] ;
         A1191ForNomCli = P08JO5_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JO5_n1191ForNomCli[0] ;
         A483ForColNum = P08JO5_A483ForColNum[0] ;
         A5742ForSerDsc = P08JO5_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JO5_n5742ForSerDsc[0] ;
         A494ForSer = P08JO5_A494ForSer[0] ;
         A279CliNom = P08JO5_A279CliNom[0] ;
         A252CliCod = P08JO5_A252CliCod[0] ;
         A485ForFec = P08JO5_A485ForFec[0] ;
         n485ForFec = P08JO5_n485ForFec[0] ;
         A832TipColDsc = P08JO5_A832TipColDsc[0] ;
         n832TipColDsc = P08JO5_n832TipColDsc[0] ;
         A279CliNom = P08JO5_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08JO5_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk8JO8 = false ;
            A396EmprCod = P08JO5_A396EmprCod[0] ;
            A831TipColCod = P08JO5_A831TipColCod[0] ;
            A483ForColNum = P08JO5_A483ForColNum[0] ;
            A494ForSer = P08JO5_A494ForSer[0] ;
            A252CliCod = P08JO5_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8JO8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV60Option = A482ForColNom ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JO8 )
         {
            brk8JO8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV50TFForNomCli = AV56SearchTxt ;
      AV51TFForNomCli_Sel = "" ;
      AV123Tmformulaswwds_1_forfec = AV108ForFec ;
      AV124Tmformulaswwds_2_forfec_to = AV109ForFec_To ;
      AV125Tmformulaswwds_3_filterfulltext = AV118FilterFullText ;
      AV126Tmformulaswwds_4_tfclicod = AV10TFCliCod ;
      AV127Tmformulaswwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV128Tmformulaswwds_6_tfclinom = AV12TFCliNom ;
      AV129Tmformulaswwds_7_tfclinom_sel = AV13TFCliNom_Sel ;
      AV130Tmformulaswwds_8_tfforser = AV14TFForSer ;
      AV131Tmformulaswwds_9_tfforser_sel = AV15TFForSer_Sel ;
      AV132Tmformulaswwds_10_tfforserdsc = AV16TFForSerDsc ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV134Tmformulaswwds_12_tfforcolnom = AV18TFForColNom ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV136Tmformulaswwds_14_tfforcolnum = AV20TFForColNum ;
      AV137Tmformulaswwds_15_tfforcolnum_to = AV21TFForColNum_To ;
      AV138Tmformulaswwds_16_tffornomcli = AV50TFForNomCli ;
      AV139Tmformulaswwds_17_tffornomcli_sel = AV51TFForNomCli_Sel ;
      AV140Tmformulaswwds_18_tftipcolcod = AV22TFTipColCod ;
      AV141Tmformulaswwds_19_tftipcolcod_to = AV23TFTipColCod_To ;
      AV142Tmformulaswwds_20_tftipcoldsc = AV24TFTipColDsc ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV144Tmformulaswwds_22_tfforfec = AV110TFForFec ;
      AV145Tmformulaswwds_23_tfforultuti = AV112TFForUltUti ;
      AV146Tmformulaswwds_24_tffornumcol = AV114TFForNumCol ;
      AV147Tmformulaswwds_25_tffornumcol_to = AV115TFForNumCol_To ;
      AV148Tmformulaswwds_26_tfforrelban = AV116TFForRelBan ;
      AV149Tmformulaswwds_27_tfforrelban_to = AV117TFForRelBan_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV123Tmformulaswwds_1_forfec ,
                                           AV124Tmformulaswwds_2_forfec_to ,
                                           AV125Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV126Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to) ,
                                           AV129Tmformulaswwds_7_tfclinom_sel ,
                                           AV128Tmformulaswwds_6_tfclinom ,
                                           AV131Tmformulaswwds_9_tfforser_sel ,
                                           AV130Tmformulaswwds_8_tfforser ,
                                           AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV132Tmformulaswwds_10_tfforserdsc ,
                                           AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV134Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV139Tmformulaswwds_17_tffornomcli_sel ,
                                           AV138Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV142Tmformulaswwds_20_tftipcoldsc ,
                                           AV144Tmformulaswwds_22_tfforfec ,
                                           AV145Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to) ,
                                           AV148Tmformulaswwds_26_tfforrelban ,
                                           AV149Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV128Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV130Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV130Tmformulaswwds_8_tfforser), 16, "%") ;
      lV132Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV132Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV134Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV134Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV138Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV138Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV142Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV142Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JO6 */
      pr_default.execute(4, new Object[] {AV123Tmformulaswwds_1_forfec, AV124Tmformulaswwds_2_forfec_to, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV126Tmformulaswwds_4_tfclicod), Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to), lV128Tmformulaswwds_6_tfclinom, AV129Tmformulaswwds_7_tfclinom_sel, lV130Tmformulaswwds_8_tfforser, AV131Tmformulaswwds_9_tfforser_sel, lV132Tmformulaswwds_10_tfforserdsc, AV133Tmformulaswwds_11_tfforserdsc_sel, lV134Tmformulaswwds_12_tfforcolnom, AV135Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to), lV138Tmformulaswwds_16_tffornomcli, AV139Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to), lV142Tmformulaswwds_20_tftipcoldsc, AV143Tmformulaswwds_21_tftipcoldsc_sel, AV144Tmformulaswwds_22_tfforfec, AV145Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to), AV148Tmformulaswwds_26_tfforrelban, AV149Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8JO10 = false ;
         A396EmprCod = P08JO6_A396EmprCod[0] ;
         A1191ForNomCli = P08JO6_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JO6_n1191ForNomCli[0] ;
         A2838ForRelBan = P08JO6_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JO6_n2838ForRelBan[0] ;
         A486ForNumCol = P08JO6_A486ForNumCol[0] ;
         A496ForUltUti = P08JO6_A496ForUltUti[0] ;
         n496ForUltUti = P08JO6_n496ForUltUti[0] ;
         A832TipColDsc = P08JO6_A832TipColDsc[0] ;
         n832TipColDsc = P08JO6_n832TipColDsc[0] ;
         A831TipColCod = P08JO6_A831TipColCod[0] ;
         A483ForColNum = P08JO6_A483ForColNum[0] ;
         A482ForColNom = P08JO6_A482ForColNom[0] ;
         A5742ForSerDsc = P08JO6_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JO6_n5742ForSerDsc[0] ;
         A494ForSer = P08JO6_A494ForSer[0] ;
         A279CliNom = P08JO6_A279CliNom[0] ;
         A252CliCod = P08JO6_A252CliCod[0] ;
         A485ForFec = P08JO6_A485ForFec[0] ;
         n485ForFec = P08JO6_n485ForFec[0] ;
         A832TipColDsc = P08JO6_A832TipColDsc[0] ;
         n832TipColDsc = P08JO6_n832TipColDsc[0] ;
         A279CliNom = P08JO6_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08JO6_A1191ForNomCli[0], A1191ForNomCli) == 0 ) )
         {
            brk8JO10 = false ;
            A396EmprCod = P08JO6_A396EmprCod[0] ;
            A831TipColCod = P08JO6_A831TipColCod[0] ;
            A483ForColNum = P08JO6_A483ForColNum[0] ;
            A482ForColNom = P08JO6_A482ForColNom[0] ;
            A494ForSer = P08JO6_A494ForSer[0] ;
            A252CliCod = P08JO6_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8JO10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1191ForNomCli)==0) )
         {
            AV60Option = A1191ForNomCli ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JO10 )
         {
            brk8JO10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFTipColDsc = AV56SearchTxt ;
      AV25TFTipColDsc_Sel = "" ;
      AV123Tmformulaswwds_1_forfec = AV108ForFec ;
      AV124Tmformulaswwds_2_forfec_to = AV109ForFec_To ;
      AV125Tmformulaswwds_3_filterfulltext = AV118FilterFullText ;
      AV126Tmformulaswwds_4_tfclicod = AV10TFCliCod ;
      AV127Tmformulaswwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV128Tmformulaswwds_6_tfclinom = AV12TFCliNom ;
      AV129Tmformulaswwds_7_tfclinom_sel = AV13TFCliNom_Sel ;
      AV130Tmformulaswwds_8_tfforser = AV14TFForSer ;
      AV131Tmformulaswwds_9_tfforser_sel = AV15TFForSer_Sel ;
      AV132Tmformulaswwds_10_tfforserdsc = AV16TFForSerDsc ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = AV17TFForSerDsc_Sel ;
      AV134Tmformulaswwds_12_tfforcolnom = AV18TFForColNom ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = AV19TFForColNom_Sel ;
      AV136Tmformulaswwds_14_tfforcolnum = AV20TFForColNum ;
      AV137Tmformulaswwds_15_tfforcolnum_to = AV21TFForColNum_To ;
      AV138Tmformulaswwds_16_tffornomcli = AV50TFForNomCli ;
      AV139Tmformulaswwds_17_tffornomcli_sel = AV51TFForNomCli_Sel ;
      AV140Tmformulaswwds_18_tftipcolcod = AV22TFTipColCod ;
      AV141Tmformulaswwds_19_tftipcolcod_to = AV23TFTipColCod_To ;
      AV142Tmformulaswwds_20_tftipcoldsc = AV24TFTipColDsc ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = AV25TFTipColDsc_Sel ;
      AV144Tmformulaswwds_22_tfforfec = AV110TFForFec ;
      AV145Tmformulaswwds_23_tfforultuti = AV112TFForUltUti ;
      AV146Tmformulaswwds_24_tffornumcol = AV114TFForNumCol ;
      AV147Tmformulaswwds_25_tffornumcol_to = AV115TFForNumCol_To ;
      AV148Tmformulaswwds_26_tfforrelban = AV116TFForRelBan ;
      AV149Tmformulaswwds_27_tfforrelban_to = AV117TFForRelBan_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV123Tmformulaswwds_1_forfec ,
                                           AV124Tmformulaswwds_2_forfec_to ,
                                           AV125Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV126Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to) ,
                                           AV129Tmformulaswwds_7_tfclinom_sel ,
                                           AV128Tmformulaswwds_6_tfclinom ,
                                           AV131Tmformulaswwds_9_tfforser_sel ,
                                           AV130Tmformulaswwds_8_tfforser ,
                                           AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV132Tmformulaswwds_10_tfforserdsc ,
                                           AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV134Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV139Tmformulaswwds_17_tffornomcli_sel ,
                                           AV138Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV142Tmformulaswwds_20_tftipcoldsc ,
                                           AV144Tmformulaswwds_22_tfforfec ,
                                           AV145Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to) ,
                                           AV148Tmformulaswwds_26_tfforrelban ,
                                           AV149Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV125Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV128Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV130Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV130Tmformulaswwds_8_tfforser), 16, "%") ;
      lV132Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV132Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV134Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV134Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV138Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV138Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV142Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV142Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JO7 */
      pr_default.execute(5, new Object[] {AV123Tmformulaswwds_1_forfec, AV124Tmformulaswwds_2_forfec_to, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, lV125Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV126Tmformulaswwds_4_tfclicod), Integer.valueOf(AV127Tmformulaswwds_5_tfclicod_to), lV128Tmformulaswwds_6_tfclinom, AV129Tmformulaswwds_7_tfclinom_sel, lV130Tmformulaswwds_8_tfforser, AV131Tmformulaswwds_9_tfforser_sel, lV132Tmformulaswwds_10_tfforserdsc, AV133Tmformulaswwds_11_tfforserdsc_sel, lV134Tmformulaswwds_12_tfforcolnom, AV135Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV136Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV137Tmformulaswwds_15_tfforcolnum_to), lV138Tmformulaswwds_16_tffornomcli, AV139Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV140Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV141Tmformulaswwds_19_tftipcolcod_to), lV142Tmformulaswwds_20_tftipcoldsc, AV143Tmformulaswwds_21_tftipcoldsc_sel, AV144Tmformulaswwds_22_tfforfec, AV145Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV146Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV147Tmformulaswwds_25_tffornumcol_to), AV148Tmformulaswwds_26_tfforrelban, AV149Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8JO12 = false ;
         A831TipColCod = P08JO7_A831TipColCod[0] ;
         A396EmprCod = P08JO7_A396EmprCod[0] ;
         A2838ForRelBan = P08JO7_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JO7_n2838ForRelBan[0] ;
         A486ForNumCol = P08JO7_A486ForNumCol[0] ;
         A496ForUltUti = P08JO7_A496ForUltUti[0] ;
         n496ForUltUti = P08JO7_n496ForUltUti[0] ;
         A832TipColDsc = P08JO7_A832TipColDsc[0] ;
         n832TipColDsc = P08JO7_n832TipColDsc[0] ;
         A1191ForNomCli = P08JO7_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JO7_n1191ForNomCli[0] ;
         A483ForColNum = P08JO7_A483ForColNum[0] ;
         A482ForColNom = P08JO7_A482ForColNom[0] ;
         A5742ForSerDsc = P08JO7_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JO7_n5742ForSerDsc[0] ;
         A494ForSer = P08JO7_A494ForSer[0] ;
         A279CliNom = P08JO7_A279CliNom[0] ;
         A252CliCod = P08JO7_A252CliCod[0] ;
         A485ForFec = P08JO7_A485ForFec[0] ;
         n485ForFec = P08JO7_n485ForFec[0] ;
         A832TipColDsc = P08JO7_A832TipColDsc[0] ;
         n832TipColDsc = P08JO7_n832TipColDsc[0] ;
         A279CliNom = P08JO7_A279CliNom[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08JO7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08JO7_A831TipColCod[0] == A831TipColCod ) )
         {
            brk8JO12 = false ;
            A483ForColNum = P08JO7_A483ForColNum[0] ;
            A482ForColNom = P08JO7_A482ForColNom[0] ;
            A494ForSer = P08JO7_A494ForSer[0] ;
            A252CliCod = P08JO7_A252CliCod[0] ;
            AV68count = (long)(AV68count+1) ;
            brk8JO12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A832TipColDsc)==0) )
         {
            AV60Option = A832TipColDsc ;
            AV59InsertIndex = 1 ;
            while ( ( AV59InsertIndex <= AV61Options.size() ) && ( GXutil.strcmp((String)AV61Options.elementAt(-1+AV59InsertIndex), AV60Option) < 0 ) )
            {
               AV59InsertIndex = (int)(AV59InsertIndex+1) ;
            }
            AV61Options.add(AV60Option, AV59InsertIndex);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), AV59InsertIndex);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8JO12 )
         {
            brk8JO12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmformulaswwgetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = tmformulaswwgetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = tmformulaswwgetfilterdata.this.AV67OptionIndexesJson;
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
      AV108ForFec = GXutil.nullDate() ;
      AV109ForFec_To = GXutil.nullDate() ;
      AV118FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFForSer = "" ;
      AV15TFForSer_Sel = "" ;
      AV16TFForSerDsc = "" ;
      AV17TFForSerDsc_Sel = "" ;
      AV18TFForColNom = "" ;
      AV19TFForColNom_Sel = "" ;
      AV50TFForNomCli = "" ;
      AV51TFForNomCli_Sel = "" ;
      AV24TFTipColDsc = "" ;
      AV25TFTipColDsc_Sel = "" ;
      AV110TFForFec = GXutil.nullDate() ;
      AV112TFForUltUti = GXutil.nullDate() ;
      AV116TFForRelBan = DecimalUtil.ZERO ;
      AV117TFForRelBan_To = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV123Tmformulaswwds_1_forfec = GXutil.nullDate() ;
      AV124Tmformulaswwds_2_forfec_to = GXutil.nullDate() ;
      AV125Tmformulaswwds_3_filterfulltext = "" ;
      AV128Tmformulaswwds_6_tfclinom = "" ;
      AV129Tmformulaswwds_7_tfclinom_sel = "" ;
      AV130Tmformulaswwds_8_tfforser = "" ;
      AV131Tmformulaswwds_9_tfforser_sel = "" ;
      AV132Tmformulaswwds_10_tfforserdsc = "" ;
      AV133Tmformulaswwds_11_tfforserdsc_sel = "" ;
      AV134Tmformulaswwds_12_tfforcolnom = "" ;
      AV135Tmformulaswwds_13_tfforcolnom_sel = "" ;
      AV138Tmformulaswwds_16_tffornomcli = "" ;
      AV139Tmformulaswwds_17_tffornomcli_sel = "" ;
      AV142Tmformulaswwds_20_tftipcoldsc = "" ;
      AV143Tmformulaswwds_21_tftipcoldsc_sel = "" ;
      AV144Tmformulaswwds_22_tfforfec = GXutil.nullDate() ;
      AV145Tmformulaswwds_23_tfforultuti = GXutil.nullDate() ;
      AV148Tmformulaswwds_26_tfforrelban = DecimalUtil.ZERO ;
      AV149Tmformulaswwds_27_tfforrelban_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV125Tmformulaswwds_3_filterfulltext = "" ;
      lV128Tmformulaswwds_6_tfclinom = "" ;
      lV130Tmformulaswwds_8_tfforser = "" ;
      lV132Tmformulaswwds_10_tfforserdsc = "" ;
      lV134Tmformulaswwds_12_tfforcolnom = "" ;
      lV138Tmformulaswwds_16_tffornomcli = "" ;
      lV142Tmformulaswwds_20_tftipcoldsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A496ForUltUti = GXutil.nullDate() ;
      P08JO2_A396EmprCod = new String[] {""} ;
      P08JO2_A279CliNom = new String[] {""} ;
      P08JO2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JO2_n2838ForRelBan = new boolean[] {false} ;
      P08JO2_A486ForNumCol = new int[1] ;
      P08JO2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO2_n496ForUltUti = new boolean[] {false} ;
      P08JO2_A832TipColDsc = new String[] {""} ;
      P08JO2_n832TipColDsc = new boolean[] {false} ;
      P08JO2_A831TipColCod = new byte[1] ;
      P08JO2_A1191ForNomCli = new String[] {""} ;
      P08JO2_n1191ForNomCli = new boolean[] {false} ;
      P08JO2_A483ForColNum = new int[1] ;
      P08JO2_A482ForColNom = new String[] {""} ;
      P08JO2_A5742ForSerDsc = new String[] {""} ;
      P08JO2_n5742ForSerDsc = new boolean[] {false} ;
      P08JO2_A494ForSer = new String[] {""} ;
      P08JO2_A252CliCod = new int[1] ;
      P08JO2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO2_n485ForFec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV60Option = "" ;
      P08JO3_A396EmprCod = new String[] {""} ;
      P08JO3_A494ForSer = new String[] {""} ;
      P08JO3_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JO3_n2838ForRelBan = new boolean[] {false} ;
      P08JO3_A486ForNumCol = new int[1] ;
      P08JO3_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO3_n496ForUltUti = new boolean[] {false} ;
      P08JO3_A832TipColDsc = new String[] {""} ;
      P08JO3_n832TipColDsc = new boolean[] {false} ;
      P08JO3_A831TipColCod = new byte[1] ;
      P08JO3_A1191ForNomCli = new String[] {""} ;
      P08JO3_n1191ForNomCli = new boolean[] {false} ;
      P08JO3_A483ForColNum = new int[1] ;
      P08JO3_A482ForColNom = new String[] {""} ;
      P08JO3_A5742ForSerDsc = new String[] {""} ;
      P08JO3_n5742ForSerDsc = new boolean[] {false} ;
      P08JO3_A279CliNom = new String[] {""} ;
      P08JO3_A252CliCod = new int[1] ;
      P08JO3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO3_n485ForFec = new boolean[] {false} ;
      P08JO4_A396EmprCod = new String[] {""} ;
      P08JO4_A5742ForSerDsc = new String[] {""} ;
      P08JO4_n5742ForSerDsc = new boolean[] {false} ;
      P08JO4_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JO4_n2838ForRelBan = new boolean[] {false} ;
      P08JO4_A486ForNumCol = new int[1] ;
      P08JO4_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO4_n496ForUltUti = new boolean[] {false} ;
      P08JO4_A832TipColDsc = new String[] {""} ;
      P08JO4_n832TipColDsc = new boolean[] {false} ;
      P08JO4_A831TipColCod = new byte[1] ;
      P08JO4_A1191ForNomCli = new String[] {""} ;
      P08JO4_n1191ForNomCli = new boolean[] {false} ;
      P08JO4_A483ForColNum = new int[1] ;
      P08JO4_A482ForColNom = new String[] {""} ;
      P08JO4_A494ForSer = new String[] {""} ;
      P08JO4_A279CliNom = new String[] {""} ;
      P08JO4_A252CliCod = new int[1] ;
      P08JO4_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO4_n485ForFec = new boolean[] {false} ;
      P08JO5_A396EmprCod = new String[] {""} ;
      P08JO5_A482ForColNom = new String[] {""} ;
      P08JO5_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JO5_n2838ForRelBan = new boolean[] {false} ;
      P08JO5_A486ForNumCol = new int[1] ;
      P08JO5_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO5_n496ForUltUti = new boolean[] {false} ;
      P08JO5_A832TipColDsc = new String[] {""} ;
      P08JO5_n832TipColDsc = new boolean[] {false} ;
      P08JO5_A831TipColCod = new byte[1] ;
      P08JO5_A1191ForNomCli = new String[] {""} ;
      P08JO5_n1191ForNomCli = new boolean[] {false} ;
      P08JO5_A483ForColNum = new int[1] ;
      P08JO5_A5742ForSerDsc = new String[] {""} ;
      P08JO5_n5742ForSerDsc = new boolean[] {false} ;
      P08JO5_A494ForSer = new String[] {""} ;
      P08JO5_A279CliNom = new String[] {""} ;
      P08JO5_A252CliCod = new int[1] ;
      P08JO5_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO5_n485ForFec = new boolean[] {false} ;
      P08JO6_A396EmprCod = new String[] {""} ;
      P08JO6_A1191ForNomCli = new String[] {""} ;
      P08JO6_n1191ForNomCli = new boolean[] {false} ;
      P08JO6_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JO6_n2838ForRelBan = new boolean[] {false} ;
      P08JO6_A486ForNumCol = new int[1] ;
      P08JO6_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO6_n496ForUltUti = new boolean[] {false} ;
      P08JO6_A832TipColDsc = new String[] {""} ;
      P08JO6_n832TipColDsc = new boolean[] {false} ;
      P08JO6_A831TipColCod = new byte[1] ;
      P08JO6_A483ForColNum = new int[1] ;
      P08JO6_A482ForColNom = new String[] {""} ;
      P08JO6_A5742ForSerDsc = new String[] {""} ;
      P08JO6_n5742ForSerDsc = new boolean[] {false} ;
      P08JO6_A494ForSer = new String[] {""} ;
      P08JO6_A279CliNom = new String[] {""} ;
      P08JO6_A252CliCod = new int[1] ;
      P08JO6_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO6_n485ForFec = new boolean[] {false} ;
      P08JO7_A831TipColCod = new byte[1] ;
      P08JO7_A396EmprCod = new String[] {""} ;
      P08JO7_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JO7_n2838ForRelBan = new boolean[] {false} ;
      P08JO7_A486ForNumCol = new int[1] ;
      P08JO7_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO7_n496ForUltUti = new boolean[] {false} ;
      P08JO7_A832TipColDsc = new String[] {""} ;
      P08JO7_n832TipColDsc = new boolean[] {false} ;
      P08JO7_A1191ForNomCli = new String[] {""} ;
      P08JO7_n1191ForNomCli = new boolean[] {false} ;
      P08JO7_A483ForColNum = new int[1] ;
      P08JO7_A482ForColNom = new String[] {""} ;
      P08JO7_A5742ForSerDsc = new String[] {""} ;
      P08JO7_n5742ForSerDsc = new boolean[] {false} ;
      P08JO7_A494ForSer = new String[] {""} ;
      P08JO7_A279CliNom = new String[] {""} ;
      P08JO7_A252CliCod = new int[1] ;
      P08JO7_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JO7_n485ForFec = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmformulaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08JO2_A396EmprCod, P08JO2_A279CliNom, P08JO2_A2838ForRelBan, P08JO2_n2838ForRelBan, P08JO2_A486ForNumCol, P08JO2_A496ForUltUti, P08JO2_n496ForUltUti, P08JO2_A832TipColDsc, P08JO2_n832TipColDsc, P08JO2_A831TipColCod,
            P08JO2_A1191ForNomCli, P08JO2_n1191ForNomCli, P08JO2_A483ForColNum, P08JO2_A482ForColNom, P08JO2_A5742ForSerDsc, P08JO2_n5742ForSerDsc, P08JO2_A494ForSer, P08JO2_A252CliCod, P08JO2_A485ForFec, P08JO2_n485ForFec
            }
            , new Object[] {
            P08JO3_A396EmprCod, P08JO3_A494ForSer, P08JO3_A2838ForRelBan, P08JO3_n2838ForRelBan, P08JO3_A486ForNumCol, P08JO3_A496ForUltUti, P08JO3_n496ForUltUti, P08JO3_A832TipColDsc, P08JO3_n832TipColDsc, P08JO3_A831TipColCod,
            P08JO3_A1191ForNomCli, P08JO3_n1191ForNomCli, P08JO3_A483ForColNum, P08JO3_A482ForColNom, P08JO3_A5742ForSerDsc, P08JO3_n5742ForSerDsc, P08JO3_A279CliNom, P08JO3_A252CliCod, P08JO3_A485ForFec, P08JO3_n485ForFec
            }
            , new Object[] {
            P08JO4_A396EmprCod, P08JO4_A5742ForSerDsc, P08JO4_n5742ForSerDsc, P08JO4_A2838ForRelBan, P08JO4_n2838ForRelBan, P08JO4_A486ForNumCol, P08JO4_A496ForUltUti, P08JO4_n496ForUltUti, P08JO4_A832TipColDsc, P08JO4_n832TipColDsc,
            P08JO4_A831TipColCod, P08JO4_A1191ForNomCli, P08JO4_n1191ForNomCli, P08JO4_A483ForColNum, P08JO4_A482ForColNom, P08JO4_A494ForSer, P08JO4_A279CliNom, P08JO4_A252CliCod, P08JO4_A485ForFec, P08JO4_n485ForFec
            }
            , new Object[] {
            P08JO5_A396EmprCod, P08JO5_A482ForColNom, P08JO5_A2838ForRelBan, P08JO5_n2838ForRelBan, P08JO5_A486ForNumCol, P08JO5_A496ForUltUti, P08JO5_n496ForUltUti, P08JO5_A832TipColDsc, P08JO5_n832TipColDsc, P08JO5_A831TipColCod,
            P08JO5_A1191ForNomCli, P08JO5_n1191ForNomCli, P08JO5_A483ForColNum, P08JO5_A5742ForSerDsc, P08JO5_n5742ForSerDsc, P08JO5_A494ForSer, P08JO5_A279CliNom, P08JO5_A252CliCod, P08JO5_A485ForFec, P08JO5_n485ForFec
            }
            , new Object[] {
            P08JO6_A396EmprCod, P08JO6_A1191ForNomCli, P08JO6_n1191ForNomCli, P08JO6_A2838ForRelBan, P08JO6_n2838ForRelBan, P08JO6_A486ForNumCol, P08JO6_A496ForUltUti, P08JO6_n496ForUltUti, P08JO6_A832TipColDsc, P08JO6_n832TipColDsc,
            P08JO6_A831TipColCod, P08JO6_A483ForColNum, P08JO6_A482ForColNom, P08JO6_A5742ForSerDsc, P08JO6_n5742ForSerDsc, P08JO6_A494ForSer, P08JO6_A279CliNom, P08JO6_A252CliCod, P08JO6_A485ForFec, P08JO6_n485ForFec
            }
            , new Object[] {
            P08JO7_A831TipColCod, P08JO7_A396EmprCod, P08JO7_A2838ForRelBan, P08JO7_n2838ForRelBan, P08JO7_A486ForNumCol, P08JO7_A496ForUltUti, P08JO7_n496ForUltUti, P08JO7_A832TipColDsc, P08JO7_n832TipColDsc, P08JO7_A1191ForNomCli,
            P08JO7_n1191ForNomCli, P08JO7_A483ForColNum, P08JO7_A482ForColNom, P08JO7_A5742ForSerDsc, P08JO7_n5742ForSerDsc, P08JO7_A494ForSer, P08JO7_A279CliNom, P08JO7_A252CliCod, P08JO7_A485ForFec, P08JO7_n485ForFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFTipColCod ;
   private byte AV23TFTipColCod_To ;
   private byte AV140Tmformulaswwds_18_tftipcolcod ;
   private byte AV141Tmformulaswwds_19_tftipcolcod_to ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV121GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFForColNum ;
   private int AV21TFForColNum_To ;
   private int AV114TFForNumCol ;
   private int AV115TFForNumCol_To ;
   private int AV126Tmformulaswwds_4_tfclicod ;
   private int AV127Tmformulaswwds_5_tfclicod_to ;
   private int AV136Tmformulaswwds_14_tfforcolnum ;
   private int AV137Tmformulaswwds_15_tfforcolnum_to ;
   private int AV146Tmformulaswwds_24_tffornumcol ;
   private int AV147Tmformulaswwds_25_tffornumcol_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV59InsertIndex ;
   private long AV68count ;
   private java.math.BigDecimal AV116TFForRelBan ;
   private java.math.BigDecimal AV117TFForRelBan_To ;
   private java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ;
   private java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFForSer ;
   private String AV15TFForSer_Sel ;
   private String AV16TFForSerDsc ;
   private String AV17TFForSerDsc_Sel ;
   private String AV18TFForColNom ;
   private String AV19TFForColNom_Sel ;
   private String AV50TFForNomCli ;
   private String AV51TFForNomCli_Sel ;
   private String AV24TFTipColDsc ;
   private String AV25TFTipColDsc_Sel ;
   private String A279CliNom ;
   private String AV128Tmformulaswwds_6_tfclinom ;
   private String AV129Tmformulaswwds_7_tfclinom_sel ;
   private String AV130Tmformulaswwds_8_tfforser ;
   private String AV131Tmformulaswwds_9_tfforser_sel ;
   private String AV132Tmformulaswwds_10_tfforserdsc ;
   private String AV133Tmformulaswwds_11_tfforserdsc_sel ;
   private String AV134Tmformulaswwds_12_tfforcolnom ;
   private String AV135Tmformulaswwds_13_tfforcolnom_sel ;
   private String AV138Tmformulaswwds_16_tffornomcli ;
   private String AV139Tmformulaswwds_17_tffornomcli_sel ;
   private String AV142Tmformulaswwds_20_tftipcoldsc ;
   private String AV143Tmformulaswwds_21_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV128Tmformulaswwds_6_tfclinom ;
   private String lV130Tmformulaswwds_8_tfforser ;
   private String lV132Tmformulaswwds_10_tfforserdsc ;
   private String lV134Tmformulaswwds_12_tfforcolnom ;
   private String lV138Tmformulaswwds_16_tffornomcli ;
   private String lV142Tmformulaswwds_20_tftipcoldsc ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A832TipColDsc ;
   private String A396EmprCod ;
   private java.util.Date AV108ForFec ;
   private java.util.Date AV109ForFec_To ;
   private java.util.Date AV110TFForFec ;
   private java.util.Date AV112TFForUltUti ;
   private java.util.Date AV123Tmformulaswwds_1_forfec ;
   private java.util.Date AV124Tmformulaswwds_2_forfec_to ;
   private java.util.Date AV144Tmformulaswwds_22_tfforfec ;
   private java.util.Date AV145Tmformulaswwds_23_tfforultuti ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private boolean returnInSub ;
   private boolean brk8JO2 ;
   private boolean n2838ForRelBan ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n485ForFec ;
   private boolean brk8JO4 ;
   private boolean brk8JO6 ;
   private boolean brk8JO8 ;
   private boolean brk8JO10 ;
   private boolean brk8JO12 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV118FilterFullText ;
   private String AV125Tmformulaswwds_3_filterfulltext ;
   private String lV125Tmformulaswwds_3_filterfulltext ;
   private String AV60Option ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08JO2_A396EmprCod ;
   private String[] P08JO2_A279CliNom ;
   private java.math.BigDecimal[] P08JO2_A2838ForRelBan ;
   private boolean[] P08JO2_n2838ForRelBan ;
   private int[] P08JO2_A486ForNumCol ;
   private java.util.Date[] P08JO2_A496ForUltUti ;
   private boolean[] P08JO2_n496ForUltUti ;
   private String[] P08JO2_A832TipColDsc ;
   private boolean[] P08JO2_n832TipColDsc ;
   private byte[] P08JO2_A831TipColCod ;
   private String[] P08JO2_A1191ForNomCli ;
   private boolean[] P08JO2_n1191ForNomCli ;
   private int[] P08JO2_A483ForColNum ;
   private String[] P08JO2_A482ForColNom ;
   private String[] P08JO2_A5742ForSerDsc ;
   private boolean[] P08JO2_n5742ForSerDsc ;
   private String[] P08JO2_A494ForSer ;
   private int[] P08JO2_A252CliCod ;
   private java.util.Date[] P08JO2_A485ForFec ;
   private boolean[] P08JO2_n485ForFec ;
   private String[] P08JO3_A396EmprCod ;
   private String[] P08JO3_A494ForSer ;
   private java.math.BigDecimal[] P08JO3_A2838ForRelBan ;
   private boolean[] P08JO3_n2838ForRelBan ;
   private int[] P08JO3_A486ForNumCol ;
   private java.util.Date[] P08JO3_A496ForUltUti ;
   private boolean[] P08JO3_n496ForUltUti ;
   private String[] P08JO3_A832TipColDsc ;
   private boolean[] P08JO3_n832TipColDsc ;
   private byte[] P08JO3_A831TipColCod ;
   private String[] P08JO3_A1191ForNomCli ;
   private boolean[] P08JO3_n1191ForNomCli ;
   private int[] P08JO3_A483ForColNum ;
   private String[] P08JO3_A482ForColNom ;
   private String[] P08JO3_A5742ForSerDsc ;
   private boolean[] P08JO3_n5742ForSerDsc ;
   private String[] P08JO3_A279CliNom ;
   private int[] P08JO3_A252CliCod ;
   private java.util.Date[] P08JO3_A485ForFec ;
   private boolean[] P08JO3_n485ForFec ;
   private String[] P08JO4_A396EmprCod ;
   private String[] P08JO4_A5742ForSerDsc ;
   private boolean[] P08JO4_n5742ForSerDsc ;
   private java.math.BigDecimal[] P08JO4_A2838ForRelBan ;
   private boolean[] P08JO4_n2838ForRelBan ;
   private int[] P08JO4_A486ForNumCol ;
   private java.util.Date[] P08JO4_A496ForUltUti ;
   private boolean[] P08JO4_n496ForUltUti ;
   private String[] P08JO4_A832TipColDsc ;
   private boolean[] P08JO4_n832TipColDsc ;
   private byte[] P08JO4_A831TipColCod ;
   private String[] P08JO4_A1191ForNomCli ;
   private boolean[] P08JO4_n1191ForNomCli ;
   private int[] P08JO4_A483ForColNum ;
   private String[] P08JO4_A482ForColNom ;
   private String[] P08JO4_A494ForSer ;
   private String[] P08JO4_A279CliNom ;
   private int[] P08JO4_A252CliCod ;
   private java.util.Date[] P08JO4_A485ForFec ;
   private boolean[] P08JO4_n485ForFec ;
   private String[] P08JO5_A396EmprCod ;
   private String[] P08JO5_A482ForColNom ;
   private java.math.BigDecimal[] P08JO5_A2838ForRelBan ;
   private boolean[] P08JO5_n2838ForRelBan ;
   private int[] P08JO5_A486ForNumCol ;
   private java.util.Date[] P08JO5_A496ForUltUti ;
   private boolean[] P08JO5_n496ForUltUti ;
   private String[] P08JO5_A832TipColDsc ;
   private boolean[] P08JO5_n832TipColDsc ;
   private byte[] P08JO5_A831TipColCod ;
   private String[] P08JO5_A1191ForNomCli ;
   private boolean[] P08JO5_n1191ForNomCli ;
   private int[] P08JO5_A483ForColNum ;
   private String[] P08JO5_A5742ForSerDsc ;
   private boolean[] P08JO5_n5742ForSerDsc ;
   private String[] P08JO5_A494ForSer ;
   private String[] P08JO5_A279CliNom ;
   private int[] P08JO5_A252CliCod ;
   private java.util.Date[] P08JO5_A485ForFec ;
   private boolean[] P08JO5_n485ForFec ;
   private String[] P08JO6_A396EmprCod ;
   private String[] P08JO6_A1191ForNomCli ;
   private boolean[] P08JO6_n1191ForNomCli ;
   private java.math.BigDecimal[] P08JO6_A2838ForRelBan ;
   private boolean[] P08JO6_n2838ForRelBan ;
   private int[] P08JO6_A486ForNumCol ;
   private java.util.Date[] P08JO6_A496ForUltUti ;
   private boolean[] P08JO6_n496ForUltUti ;
   private String[] P08JO6_A832TipColDsc ;
   private boolean[] P08JO6_n832TipColDsc ;
   private byte[] P08JO6_A831TipColCod ;
   private int[] P08JO6_A483ForColNum ;
   private String[] P08JO6_A482ForColNom ;
   private String[] P08JO6_A5742ForSerDsc ;
   private boolean[] P08JO6_n5742ForSerDsc ;
   private String[] P08JO6_A494ForSer ;
   private String[] P08JO6_A279CliNom ;
   private int[] P08JO6_A252CliCod ;
   private java.util.Date[] P08JO6_A485ForFec ;
   private boolean[] P08JO6_n485ForFec ;
   private byte[] P08JO7_A831TipColCod ;
   private String[] P08JO7_A396EmprCod ;
   private java.math.BigDecimal[] P08JO7_A2838ForRelBan ;
   private boolean[] P08JO7_n2838ForRelBan ;
   private int[] P08JO7_A486ForNumCol ;
   private java.util.Date[] P08JO7_A496ForUltUti ;
   private boolean[] P08JO7_n496ForUltUti ;
   private String[] P08JO7_A832TipColDsc ;
   private boolean[] P08JO7_n832TipColDsc ;
   private String[] P08JO7_A1191ForNomCli ;
   private boolean[] P08JO7_n1191ForNomCli ;
   private int[] P08JO7_A483ForColNum ;
   private String[] P08JO7_A482ForColNom ;
   private String[] P08JO7_A5742ForSerDsc ;
   private boolean[] P08JO7_n5742ForSerDsc ;
   private String[] P08JO7_A494ForSer ;
   private String[] P08JO7_A279CliNom ;
   private int[] P08JO7_A252CliCod ;
   private java.util.Date[] P08JO7_A485ForFec ;
   private boolean[] P08JO7_n485ForFec ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class tmformulaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV123Tmformulaswwds_1_forfec ,
                                          java.util.Date AV124Tmformulaswwds_2_forfec_to ,
                                          String AV125Tmformulaswwds_3_filterfulltext ,
                                          int AV126Tmformulaswwds_4_tfclicod ,
                                          int AV127Tmformulaswwds_5_tfclicod_to ,
                                          String AV129Tmformulaswwds_7_tfclinom_sel ,
                                          String AV128Tmformulaswwds_6_tfclinom ,
                                          String AV131Tmformulaswwds_9_tfforser_sel ,
                                          String AV130Tmformulaswwds_8_tfforser ,
                                          String AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV132Tmformulaswwds_10_tfforserdsc ,
                                          String AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV134Tmformulaswwds_12_tfforcolnom ,
                                          int AV136Tmformulaswwds_14_tfforcolnum ,
                                          int AV137Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV139Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV138Tmformulaswwds_16_tffornomcli ,
                                          byte AV140Tmformulaswwds_18_tftipcolcod ,
                                          byte AV141Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV142Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV144Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV145Tmformulaswwds_23_tfforultuti ,
                                          int AV146Tmformulaswwds_24_tffornumcol ,
                                          int AV147Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[37];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV126Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV127Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV141Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08JO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV123Tmformulaswwds_1_forfec ,
                                          java.util.Date AV124Tmformulaswwds_2_forfec_to ,
                                          String AV125Tmformulaswwds_3_filterfulltext ,
                                          int AV126Tmformulaswwds_4_tfclicod ,
                                          int AV127Tmformulaswwds_5_tfclicod_to ,
                                          String AV129Tmformulaswwds_7_tfclinom_sel ,
                                          String AV128Tmformulaswwds_6_tfclinom ,
                                          String AV131Tmformulaswwds_9_tfforser_sel ,
                                          String AV130Tmformulaswwds_8_tfforser ,
                                          String AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV132Tmformulaswwds_10_tfforserdsc ,
                                          String AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV134Tmformulaswwds_12_tfforcolnom ,
                                          int AV136Tmformulaswwds_14_tfforcolnum ,
                                          int AV137Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV139Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV138Tmformulaswwds_16_tffornomcli ,
                                          byte AV140Tmformulaswwds_18_tftipcolcod ,
                                          byte AV141Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV142Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV144Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV145Tmformulaswwds_23_tfforultuti ,
                                          int AV146Tmformulaswwds_24_tffornumcol ,
                                          int AV147Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[37];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSer, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV126Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV127Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV141Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08JO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV123Tmformulaswwds_1_forfec ,
                                          java.util.Date AV124Tmformulaswwds_2_forfec_to ,
                                          String AV125Tmformulaswwds_3_filterfulltext ,
                                          int AV126Tmformulaswwds_4_tfclicod ,
                                          int AV127Tmformulaswwds_5_tfclicod_to ,
                                          String AV129Tmformulaswwds_7_tfclinom_sel ,
                                          String AV128Tmformulaswwds_6_tfclinom ,
                                          String AV131Tmformulaswwds_9_tfforser_sel ,
                                          String AV130Tmformulaswwds_8_tfforser ,
                                          String AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV132Tmformulaswwds_10_tfforserdsc ,
                                          String AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV134Tmformulaswwds_12_tfforcolnom ,
                                          int AV136Tmformulaswwds_14_tfforcolnum ,
                                          int AV137Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV139Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV138Tmformulaswwds_16_tffornomcli ,
                                          byte AV140Tmformulaswwds_18_tftipcolcod ,
                                          byte AV141Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV142Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV144Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV145Tmformulaswwds_23_tfforultuti ,
                                          int AV146Tmformulaswwds_24_tffornumcol ,
                                          int AV147Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[37];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSerDsc, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV126Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV127Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV141Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08JO5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV123Tmformulaswwds_1_forfec ,
                                          java.util.Date AV124Tmformulaswwds_2_forfec_to ,
                                          String AV125Tmformulaswwds_3_filterfulltext ,
                                          int AV126Tmformulaswwds_4_tfclicod ,
                                          int AV127Tmformulaswwds_5_tfclicod_to ,
                                          String AV129Tmformulaswwds_7_tfclinom_sel ,
                                          String AV128Tmformulaswwds_6_tfclinom ,
                                          String AV131Tmformulaswwds_9_tfforser_sel ,
                                          String AV130Tmformulaswwds_8_tfforser ,
                                          String AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV132Tmformulaswwds_10_tfforserdsc ,
                                          String AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV134Tmformulaswwds_12_tfforcolnom ,
                                          int AV136Tmformulaswwds_14_tfforcolnum ,
                                          int AV137Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV139Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV138Tmformulaswwds_16_tffornomcli ,
                                          byte AV140Tmformulaswwds_18_tftipcolcod ,
                                          byte AV141Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV142Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV144Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV145Tmformulaswwds_23_tfforultuti ,
                                          int AV146Tmformulaswwds_24_tffornumcol ,
                                          int AV147Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[37];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForColNom, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV126Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV127Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV141Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08JO6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV123Tmformulaswwds_1_forfec ,
                                          java.util.Date AV124Tmformulaswwds_2_forfec_to ,
                                          String AV125Tmformulaswwds_3_filterfulltext ,
                                          int AV126Tmformulaswwds_4_tfclicod ,
                                          int AV127Tmformulaswwds_5_tfclicod_to ,
                                          String AV129Tmformulaswwds_7_tfclinom_sel ,
                                          String AV128Tmformulaswwds_6_tfclinom ,
                                          String AV131Tmformulaswwds_9_tfforser_sel ,
                                          String AV130Tmformulaswwds_8_tfforser ,
                                          String AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV132Tmformulaswwds_10_tfforserdsc ,
                                          String AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV134Tmformulaswwds_12_tfforcolnom ,
                                          int AV136Tmformulaswwds_14_tfforcolnum ,
                                          int AV137Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV139Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV138Tmformulaswwds_16_tffornomcli ,
                                          byte AV140Tmformulaswwds_18_tftipcolcod ,
                                          byte AV141Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV142Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV144Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV145Tmformulaswwds_23_tfforultuti ,
                                          int AV146Tmformulaswwds_24_tffornumcol ,
                                          int AV147Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[37];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForNomCli, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV126Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV127Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV141Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08JO7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV123Tmformulaswwds_1_forfec ,
                                          java.util.Date AV124Tmformulaswwds_2_forfec_to ,
                                          String AV125Tmformulaswwds_3_filterfulltext ,
                                          int AV126Tmformulaswwds_4_tfclicod ,
                                          int AV127Tmformulaswwds_5_tfclicod_to ,
                                          String AV129Tmformulaswwds_7_tfclinom_sel ,
                                          String AV128Tmformulaswwds_6_tfclinom ,
                                          String AV131Tmformulaswwds_9_tfforser_sel ,
                                          String AV130Tmformulaswwds_8_tfforser ,
                                          String AV133Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV132Tmformulaswwds_10_tfforserdsc ,
                                          String AV135Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV134Tmformulaswwds_12_tfforcolnom ,
                                          int AV136Tmformulaswwds_14_tfforcolnum ,
                                          int AV137Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV139Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV138Tmformulaswwds_16_tffornomcli ,
                                          byte AV140Tmformulaswwds_18_tftipcolcod ,
                                          byte AV141Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV143Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV142Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV144Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV145Tmformulaswwds_23_tfforultuti ,
                                          int AV146Tmformulaswwds_24_tffornumcol ,
                                          int AV147Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV148Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV149Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[37];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.TipColCod, T1.EmprCod, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      }
      if ( ! (0==AV126Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV127Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV130Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV140Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV141Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
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
                  return conditional_P08JO2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] );
            case 1 :
                  return conditional_P08JO3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] );
            case 2 :
                  return conditional_P08JO4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] );
            case 3 :
                  return conditional_P08JO5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] );
            case 4 :
                  return conditional_P08JO6(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] );
            case 5 :
                  return conditional_P08JO7(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JO5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JO6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08JO7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 13);
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
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
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
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
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
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
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
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
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
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
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
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
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
      }
   }

}

