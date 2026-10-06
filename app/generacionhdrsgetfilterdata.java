package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generacionhdrsgetfilterdata extends GXProcedure
{
   public generacionhdrsgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionhdrsgetfilterdata.class ), "" );
   }

   public generacionhdrsgetfilterdata( int remoteHandle ,
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
      generacionhdrsgetfilterdata.this.aP5 = new String[] {""};
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
      generacionhdrsgetfilterdata.this.AV44DDOName = aP0;
      generacionhdrsgetfilterdata.this.AV42SearchTxt = aP1;
      generacionhdrsgetfilterdata.this.AV43SearchTxtTo = aP2;
      generacionhdrsgetfilterdata.this.aP3 = aP3;
      generacionhdrsgetfilterdata.this.aP4 = aP4;
      generacionhdrsgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_DISARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_DISARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_DISCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_DISNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADDISNOMCLIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_DISUNIMED") == 0 )
      {
         /* Execute user subroutine: 'LOADDISUNIMEDOPTIONS' */
         S171 ();
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
      if ( GXutil.strcmp(AV55Session.getValue("GeneracionHDRsGridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GeneracionHDRsGridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("GeneracionHDRsGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV10TFDisCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDisCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV12TFDisFec = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPART") == 0 )
         {
            AV20TFDisPart = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFDisPart_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV22TFDisArtCod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV23TFDisArtCod_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV24TFDisArtDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV25TFDisArtDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV26TFDisColNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV27TFDisColNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV28TFDisColNum = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFDisColNum_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV30TFDisTipCol = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFDisTipCol_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV32TFDisNomCli = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV33TFDisNomCli_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV34TFDisUniMed = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV35TFDisUniMed_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEPIE") == 0 )
         {
            AV36TFDisPiePie = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFDisPiePie_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEKGM") == 0 )
         {
            AV38TFDisPieKgm = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFDisPieKgm_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISPIEMTR") == 0 )
         {
            AV40TFDisPieMtr = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFDisPieMtr_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63Emprcod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISEST") == 0 )
         {
            AV64DisEst = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNHDR") == 0 )
         {
            AV65BarNHdr = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV42SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV70Generacionhdrsds_1_tfdiscod = AV10TFDisCod ;
      AV71Generacionhdrsds_2_tfdiscod_to = AV11TFDisCod_To ;
      AV72Generacionhdrsds_3_tfdisfec = AV12TFDisFec ;
      AV73Generacionhdrsds_4_tfclicod = AV14TFCliCod ;
      AV74Generacionhdrsds_5_tfclicod_to = AV15TFCliCod_To ;
      AV75Generacionhdrsds_6_tfclinom = AV16TFCliNom ;
      AV76Generacionhdrsds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Generacionhdrsds_8_tfdispart = AV20TFDisPart ;
      AV78Generacionhdrsds_9_tfdispart_to = AV21TFDisPart_To ;
      AV79Generacionhdrsds_10_tfdisartcod = AV22TFDisArtCod ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = AV23TFDisArtCod_Sel ;
      AV81Generacionhdrsds_12_tfdisartdsc = AV24TFDisArtDsc ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = AV25TFDisArtDsc_Sel ;
      AV83Generacionhdrsds_14_tfdiscolnom = AV26TFDisColNom ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = AV27TFDisColNom_Sel ;
      AV85Generacionhdrsds_16_tfdiscolnum = AV28TFDisColNum ;
      AV86Generacionhdrsds_17_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV87Generacionhdrsds_18_tfdistipcol = AV30TFDisTipCol ;
      AV88Generacionhdrsds_19_tfdistipcol_to = AV31TFDisTipCol_To ;
      AV89Generacionhdrsds_20_tfdisnomcli = AV32TFDisNomCli ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = AV33TFDisNomCli_Sel ;
      AV91Generacionhdrsds_22_tfdisunimed = AV34TFDisUniMed ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = AV35TFDisUniMed_Sel ;
      AV93Generacionhdrsds_24_tfdispiepie = AV36TFDisPiePie ;
      AV94Generacionhdrsds_25_tfdispiepie_to = AV37TFDisPiePie_To ;
      AV95Generacionhdrsds_26_tfdispiekgm = AV38TFDisPieKgm ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = AV39TFDisPieKgm_To ;
      AV97Generacionhdrsds_28_tfdispiemtr = AV40TFDisPieMtr ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = AV41TFDisPieMtr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to) ,
                                           AV72Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV73Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to) ,
                                           AV76Generacionhdrsds_7_tfclinom_sel ,
                                           AV75Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV77Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to) ,
                                           AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV79Generacionhdrsds_10_tfdisartcod ,
                                           AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV81Generacionhdrsds_12_tfdisartdsc ,
                                           AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV83Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV89Generacionhdrsds_20_tfdisnomcli ,
                                           AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV95Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV97Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV64DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV75Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV79Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV79Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV81Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV81Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV83Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV83Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV89Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV89Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV91Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV91Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor P09363 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), AV63Emprcod, Byte.valueOf(AV64DisEst), Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to), AV72Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV73Generacionhdrsds_4_tfclicod), Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to), lV75Generacionhdrsds_6_tfclinom, AV76Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV77Generacionhdrsds_8_tfdispart), Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to), lV79Generacionhdrsds_10_tfdisartcod, AV80Generacionhdrsds_11_tfdisartcod_sel, lV81Generacionhdrsds_12_tfdisartdsc, AV82Generacionhdrsds_13_tfdisartdsc_sel, lV83Generacionhdrsds_14_tfdiscolnom, AV84Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to), lV89Generacionhdrsds_20_tfdisnomcli, AV90Generacionhdrsds_21_tfdisnomcli_sel, lV91Generacionhdrsds_22_tfdisunimed, AV92Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9362 = false ;
         A396EmprCod = P09363_A396EmprCod[0] ;
         A367DisEst = P09363_A367DisEst[0] ;
         A279CliNom = P09363_A279CliNom[0] ;
         A392DisUniMed = P09363_A392DisUniMed[0] ;
         A1195DisNomCli = P09363_A1195DisNomCli[0] ;
         A390DisTipCol = P09363_A390DisTipCol[0] ;
         n390DisTipCol = P09363_n390DisTipCol[0] ;
         A363DisColNum = P09363_A363DisColNum[0] ;
         n363DisColNum = P09363_n363DisColNum[0] ;
         A362DisColNom = P09363_A362DisColNom[0] ;
         n362DisColNom = P09363_n362DisColNom[0] ;
         A337DisArtDsc = P09363_A337DisArtDsc[0] ;
         A335DisArtCod = P09363_A335DisArtCod[0] ;
         A1502DisPart = P09363_A1502DisPart[0] ;
         A252CliCod = P09363_A252CliCod[0] ;
         A369DisFec = P09363_A369DisFec[0] ;
         A361DisCod = P09363_A361DisCod[0] ;
         A387DisPiePie = P09363_A387DisPiePie[0] ;
         n387DisPiePie = P09363_n387DisPiePie[0] ;
         A365DisDes = P09363_A365DisDes[0] ;
         A279CliNom = P09363_A279CliNom[0] ;
         A387DisPiePie = P09363_A387DisPiePie[0] ;
         n387DisPiePie = P09363_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV95Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV96Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV97Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV98Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV54count = 0 ;
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09363_A279CliNom[0], A279CliNom) == 0 ) )
                     {
                        brk9362 = false ;
                        A396EmprCod = P09363_A396EmprCod[0] ;
                        A252CliCod = P09363_A252CliCod[0] ;
                        A361DisCod = P09363_A361DisCod[0] ;
                        AV54count = (long)(AV54count+1) ;
                        brk9362 = true ;
                        pr_default.readNext(0);
                     }
                     if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                     {
                        AV46Option = A279CliNom ;
                        AV47Options.add(AV46Option, 0);
                        AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV47Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9362 )
         {
            brk9362 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFDisArtCod = AV42SearchTxt ;
      AV23TFDisArtCod_Sel = "" ;
      AV70Generacionhdrsds_1_tfdiscod = AV10TFDisCod ;
      AV71Generacionhdrsds_2_tfdiscod_to = AV11TFDisCod_To ;
      AV72Generacionhdrsds_3_tfdisfec = AV12TFDisFec ;
      AV73Generacionhdrsds_4_tfclicod = AV14TFCliCod ;
      AV74Generacionhdrsds_5_tfclicod_to = AV15TFCliCod_To ;
      AV75Generacionhdrsds_6_tfclinom = AV16TFCliNom ;
      AV76Generacionhdrsds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Generacionhdrsds_8_tfdispart = AV20TFDisPart ;
      AV78Generacionhdrsds_9_tfdispart_to = AV21TFDisPart_To ;
      AV79Generacionhdrsds_10_tfdisartcod = AV22TFDisArtCod ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = AV23TFDisArtCod_Sel ;
      AV81Generacionhdrsds_12_tfdisartdsc = AV24TFDisArtDsc ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = AV25TFDisArtDsc_Sel ;
      AV83Generacionhdrsds_14_tfdiscolnom = AV26TFDisColNom ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = AV27TFDisColNom_Sel ;
      AV85Generacionhdrsds_16_tfdiscolnum = AV28TFDisColNum ;
      AV86Generacionhdrsds_17_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV87Generacionhdrsds_18_tfdistipcol = AV30TFDisTipCol ;
      AV88Generacionhdrsds_19_tfdistipcol_to = AV31TFDisTipCol_To ;
      AV89Generacionhdrsds_20_tfdisnomcli = AV32TFDisNomCli ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = AV33TFDisNomCli_Sel ;
      AV91Generacionhdrsds_22_tfdisunimed = AV34TFDisUniMed ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = AV35TFDisUniMed_Sel ;
      AV93Generacionhdrsds_24_tfdispiepie = AV36TFDisPiePie ;
      AV94Generacionhdrsds_25_tfdispiepie_to = AV37TFDisPiePie_To ;
      AV95Generacionhdrsds_26_tfdispiekgm = AV38TFDisPieKgm ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = AV39TFDisPieKgm_To ;
      AV97Generacionhdrsds_28_tfdispiemtr = AV40TFDisPieMtr ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = AV41TFDisPieMtr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to) ,
                                           AV72Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV73Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to) ,
                                           AV76Generacionhdrsds_7_tfclinom_sel ,
                                           AV75Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV77Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to) ,
                                           AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV79Generacionhdrsds_10_tfdisartcod ,
                                           AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV81Generacionhdrsds_12_tfdisartdsc ,
                                           AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV83Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV89Generacionhdrsds_20_tfdisnomcli ,
                                           AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV95Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV97Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV64DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV75Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV79Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV79Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV81Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV81Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV83Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV83Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV89Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV89Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV91Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV91Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor P09365 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), AV63Emprcod, Byte.valueOf(AV64DisEst), Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to), AV72Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV73Generacionhdrsds_4_tfclicod), Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to), lV75Generacionhdrsds_6_tfclinom, AV76Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV77Generacionhdrsds_8_tfdispart), Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to), lV79Generacionhdrsds_10_tfdisartcod, AV80Generacionhdrsds_11_tfdisartcod_sel, lV81Generacionhdrsds_12_tfdisartdsc, AV82Generacionhdrsds_13_tfdisartdsc_sel, lV83Generacionhdrsds_14_tfdiscolnom, AV84Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to), lV89Generacionhdrsds_20_tfdisnomcli, AV90Generacionhdrsds_21_tfdisnomcli_sel, lV91Generacionhdrsds_22_tfdisunimed, AV92Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9364 = false ;
         A396EmprCod = P09365_A396EmprCod[0] ;
         A367DisEst = P09365_A367DisEst[0] ;
         A335DisArtCod = P09365_A335DisArtCod[0] ;
         A392DisUniMed = P09365_A392DisUniMed[0] ;
         A1195DisNomCli = P09365_A1195DisNomCli[0] ;
         A390DisTipCol = P09365_A390DisTipCol[0] ;
         n390DisTipCol = P09365_n390DisTipCol[0] ;
         A363DisColNum = P09365_A363DisColNum[0] ;
         n363DisColNum = P09365_n363DisColNum[0] ;
         A362DisColNom = P09365_A362DisColNom[0] ;
         n362DisColNom = P09365_n362DisColNom[0] ;
         A337DisArtDsc = P09365_A337DisArtDsc[0] ;
         A1502DisPart = P09365_A1502DisPart[0] ;
         A279CliNom = P09365_A279CliNom[0] ;
         A252CliCod = P09365_A252CliCod[0] ;
         A369DisFec = P09365_A369DisFec[0] ;
         A361DisCod = P09365_A361DisCod[0] ;
         A387DisPiePie = P09365_A387DisPiePie[0] ;
         n387DisPiePie = P09365_n387DisPiePie[0] ;
         A365DisDes = P09365_A365DisDes[0] ;
         A279CliNom = P09365_A279CliNom[0] ;
         A387DisPiePie = P09365_A387DisPiePie[0] ;
         n387DisPiePie = P09365_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV95Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV96Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV97Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV98Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV54count = 0 ;
                     while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09365_A335DisArtCod[0], A335DisArtCod) == 0 ) )
                     {
                        brk9364 = false ;
                        A396EmprCod = P09365_A396EmprCod[0] ;
                        A361DisCod = P09365_A361DisCod[0] ;
                        AV54count = (long)(AV54count+1) ;
                        brk9364 = true ;
                        pr_default.readNext(1);
                     }
                     if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
                     {
                        AV46Option = A335DisArtCod ;
                        AV47Options.add(AV46Option, 0);
                        AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV47Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9364 )
         {
            brk9364 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDISARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFDisArtDsc = AV42SearchTxt ;
      AV25TFDisArtDsc_Sel = "" ;
      AV70Generacionhdrsds_1_tfdiscod = AV10TFDisCod ;
      AV71Generacionhdrsds_2_tfdiscod_to = AV11TFDisCod_To ;
      AV72Generacionhdrsds_3_tfdisfec = AV12TFDisFec ;
      AV73Generacionhdrsds_4_tfclicod = AV14TFCliCod ;
      AV74Generacionhdrsds_5_tfclicod_to = AV15TFCliCod_To ;
      AV75Generacionhdrsds_6_tfclinom = AV16TFCliNom ;
      AV76Generacionhdrsds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Generacionhdrsds_8_tfdispart = AV20TFDisPart ;
      AV78Generacionhdrsds_9_tfdispart_to = AV21TFDisPart_To ;
      AV79Generacionhdrsds_10_tfdisartcod = AV22TFDisArtCod ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = AV23TFDisArtCod_Sel ;
      AV81Generacionhdrsds_12_tfdisartdsc = AV24TFDisArtDsc ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = AV25TFDisArtDsc_Sel ;
      AV83Generacionhdrsds_14_tfdiscolnom = AV26TFDisColNom ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = AV27TFDisColNom_Sel ;
      AV85Generacionhdrsds_16_tfdiscolnum = AV28TFDisColNum ;
      AV86Generacionhdrsds_17_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV87Generacionhdrsds_18_tfdistipcol = AV30TFDisTipCol ;
      AV88Generacionhdrsds_19_tfdistipcol_to = AV31TFDisTipCol_To ;
      AV89Generacionhdrsds_20_tfdisnomcli = AV32TFDisNomCli ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = AV33TFDisNomCli_Sel ;
      AV91Generacionhdrsds_22_tfdisunimed = AV34TFDisUniMed ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = AV35TFDisUniMed_Sel ;
      AV93Generacionhdrsds_24_tfdispiepie = AV36TFDisPiePie ;
      AV94Generacionhdrsds_25_tfdispiepie_to = AV37TFDisPiePie_To ;
      AV95Generacionhdrsds_26_tfdispiekgm = AV38TFDisPieKgm ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = AV39TFDisPieKgm_To ;
      AV97Generacionhdrsds_28_tfdispiemtr = AV40TFDisPieMtr ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = AV41TFDisPieMtr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to) ,
                                           AV72Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV73Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to) ,
                                           AV76Generacionhdrsds_7_tfclinom_sel ,
                                           AV75Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV77Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to) ,
                                           AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV79Generacionhdrsds_10_tfdisartcod ,
                                           AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV81Generacionhdrsds_12_tfdisartdsc ,
                                           AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV83Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV89Generacionhdrsds_20_tfdisnomcli ,
                                           AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV95Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV97Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV64DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV75Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV79Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV79Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV81Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV81Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV83Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV83Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV89Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV89Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV91Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV91Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor P09367 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), AV63Emprcod, Byte.valueOf(AV64DisEst), Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to), AV72Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV73Generacionhdrsds_4_tfclicod), Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to), lV75Generacionhdrsds_6_tfclinom, AV76Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV77Generacionhdrsds_8_tfdispart), Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to), lV79Generacionhdrsds_10_tfdisartcod, AV80Generacionhdrsds_11_tfdisartcod_sel, lV81Generacionhdrsds_12_tfdisartdsc, AV82Generacionhdrsds_13_tfdisartdsc_sel, lV83Generacionhdrsds_14_tfdiscolnom, AV84Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to), lV89Generacionhdrsds_20_tfdisnomcli, AV90Generacionhdrsds_21_tfdisnomcli_sel, lV91Generacionhdrsds_22_tfdisunimed, AV92Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9366 = false ;
         A396EmprCod = P09367_A396EmprCod[0] ;
         A367DisEst = P09367_A367DisEst[0] ;
         A337DisArtDsc = P09367_A337DisArtDsc[0] ;
         A392DisUniMed = P09367_A392DisUniMed[0] ;
         A1195DisNomCli = P09367_A1195DisNomCli[0] ;
         A390DisTipCol = P09367_A390DisTipCol[0] ;
         n390DisTipCol = P09367_n390DisTipCol[0] ;
         A363DisColNum = P09367_A363DisColNum[0] ;
         n363DisColNum = P09367_n363DisColNum[0] ;
         A362DisColNom = P09367_A362DisColNom[0] ;
         n362DisColNom = P09367_n362DisColNom[0] ;
         A335DisArtCod = P09367_A335DisArtCod[0] ;
         A1502DisPart = P09367_A1502DisPart[0] ;
         A279CliNom = P09367_A279CliNom[0] ;
         A252CliCod = P09367_A252CliCod[0] ;
         A369DisFec = P09367_A369DisFec[0] ;
         A361DisCod = P09367_A361DisCod[0] ;
         A387DisPiePie = P09367_A387DisPiePie[0] ;
         n387DisPiePie = P09367_n387DisPiePie[0] ;
         A365DisDes = P09367_A365DisDes[0] ;
         A279CliNom = P09367_A279CliNom[0] ;
         A387DisPiePie = P09367_A387DisPiePie[0] ;
         n387DisPiePie = P09367_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV95Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV96Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV97Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV98Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV54count = 0 ;
                     while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09367_A337DisArtDsc[0], A337DisArtDsc) == 0 ) )
                     {
                        brk9366 = false ;
                        A396EmprCod = P09367_A396EmprCod[0] ;
                        A361DisCod = P09367_A361DisCod[0] ;
                        AV54count = (long)(AV54count+1) ;
                        brk9366 = true ;
                        pr_default.readNext(2);
                     }
                     if ( ! (GXutil.strcmp("", A337DisArtDsc)==0) )
                     {
                        AV46Option = A337DisArtDsc ;
                        AV47Options.add(AV46Option, 0);
                        AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV47Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9366 )
         {
            brk9366 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDISCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFDisColNom = AV42SearchTxt ;
      AV27TFDisColNom_Sel = "" ;
      AV70Generacionhdrsds_1_tfdiscod = AV10TFDisCod ;
      AV71Generacionhdrsds_2_tfdiscod_to = AV11TFDisCod_To ;
      AV72Generacionhdrsds_3_tfdisfec = AV12TFDisFec ;
      AV73Generacionhdrsds_4_tfclicod = AV14TFCliCod ;
      AV74Generacionhdrsds_5_tfclicod_to = AV15TFCliCod_To ;
      AV75Generacionhdrsds_6_tfclinom = AV16TFCliNom ;
      AV76Generacionhdrsds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Generacionhdrsds_8_tfdispart = AV20TFDisPart ;
      AV78Generacionhdrsds_9_tfdispart_to = AV21TFDisPart_To ;
      AV79Generacionhdrsds_10_tfdisartcod = AV22TFDisArtCod ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = AV23TFDisArtCod_Sel ;
      AV81Generacionhdrsds_12_tfdisartdsc = AV24TFDisArtDsc ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = AV25TFDisArtDsc_Sel ;
      AV83Generacionhdrsds_14_tfdiscolnom = AV26TFDisColNom ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = AV27TFDisColNom_Sel ;
      AV85Generacionhdrsds_16_tfdiscolnum = AV28TFDisColNum ;
      AV86Generacionhdrsds_17_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV87Generacionhdrsds_18_tfdistipcol = AV30TFDisTipCol ;
      AV88Generacionhdrsds_19_tfdistipcol_to = AV31TFDisTipCol_To ;
      AV89Generacionhdrsds_20_tfdisnomcli = AV32TFDisNomCli ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = AV33TFDisNomCli_Sel ;
      AV91Generacionhdrsds_22_tfdisunimed = AV34TFDisUniMed ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = AV35TFDisUniMed_Sel ;
      AV93Generacionhdrsds_24_tfdispiepie = AV36TFDisPiePie ;
      AV94Generacionhdrsds_25_tfdispiepie_to = AV37TFDisPiePie_To ;
      AV95Generacionhdrsds_26_tfdispiekgm = AV38TFDisPieKgm ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = AV39TFDisPieKgm_To ;
      AV97Generacionhdrsds_28_tfdispiemtr = AV40TFDisPieMtr ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = AV41TFDisPieMtr_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to) ,
                                           AV72Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV73Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to) ,
                                           AV76Generacionhdrsds_7_tfclinom_sel ,
                                           AV75Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV77Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to) ,
                                           AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV79Generacionhdrsds_10_tfdisartcod ,
                                           AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV81Generacionhdrsds_12_tfdisartdsc ,
                                           AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV83Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV89Generacionhdrsds_20_tfdisnomcli ,
                                           AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV95Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV97Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV64DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV75Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV79Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV79Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV81Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV81Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV83Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV83Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV89Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV89Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV91Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV91Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor P09369 */
      pr_default.execute(3, new Object[] {Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), AV63Emprcod, Byte.valueOf(AV64DisEst), Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to), AV72Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV73Generacionhdrsds_4_tfclicod), Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to), lV75Generacionhdrsds_6_tfclinom, AV76Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV77Generacionhdrsds_8_tfdispart), Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to), lV79Generacionhdrsds_10_tfdisartcod, AV80Generacionhdrsds_11_tfdisartcod_sel, lV81Generacionhdrsds_12_tfdisartdsc, AV82Generacionhdrsds_13_tfdisartdsc_sel, lV83Generacionhdrsds_14_tfdiscolnom, AV84Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to), lV89Generacionhdrsds_20_tfdisnomcli, AV90Generacionhdrsds_21_tfdisnomcli_sel, lV91Generacionhdrsds_22_tfdisunimed, AV92Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9368 = false ;
         A396EmprCod = P09369_A396EmprCod[0] ;
         A367DisEst = P09369_A367DisEst[0] ;
         A362DisColNom = P09369_A362DisColNom[0] ;
         n362DisColNom = P09369_n362DisColNom[0] ;
         A392DisUniMed = P09369_A392DisUniMed[0] ;
         A1195DisNomCli = P09369_A1195DisNomCli[0] ;
         A390DisTipCol = P09369_A390DisTipCol[0] ;
         n390DisTipCol = P09369_n390DisTipCol[0] ;
         A363DisColNum = P09369_A363DisColNum[0] ;
         n363DisColNum = P09369_n363DisColNum[0] ;
         A337DisArtDsc = P09369_A337DisArtDsc[0] ;
         A335DisArtCod = P09369_A335DisArtCod[0] ;
         A1502DisPart = P09369_A1502DisPart[0] ;
         A279CliNom = P09369_A279CliNom[0] ;
         A252CliCod = P09369_A252CliCod[0] ;
         A369DisFec = P09369_A369DisFec[0] ;
         A361DisCod = P09369_A361DisCod[0] ;
         A387DisPiePie = P09369_A387DisPiePie[0] ;
         n387DisPiePie = P09369_n387DisPiePie[0] ;
         A365DisDes = P09369_A365DisDes[0] ;
         A279CliNom = P09369_A279CliNom[0] ;
         A387DisPiePie = P09369_A387DisPiePie[0] ;
         n387DisPiePie = P09369_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV95Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV96Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV97Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV98Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV54count = 0 ;
                     while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09369_A362DisColNom[0], A362DisColNom) == 0 ) )
                     {
                        brk9368 = false ;
                        A396EmprCod = P09369_A396EmprCod[0] ;
                        A361DisCod = P09369_A361DisCod[0] ;
                        AV54count = (long)(AV54count+1) ;
                        brk9368 = true ;
                        pr_default.readNext(3);
                     }
                     if ( ! (GXutil.strcmp("", A362DisColNom)==0) )
                     {
                        AV46Option = A362DisColNom ;
                        AV47Options.add(AV46Option, 0);
                        AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV47Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9368 )
         {
            brk9368 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDISNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV32TFDisNomCli = AV42SearchTxt ;
      AV33TFDisNomCli_Sel = "" ;
      AV70Generacionhdrsds_1_tfdiscod = AV10TFDisCod ;
      AV71Generacionhdrsds_2_tfdiscod_to = AV11TFDisCod_To ;
      AV72Generacionhdrsds_3_tfdisfec = AV12TFDisFec ;
      AV73Generacionhdrsds_4_tfclicod = AV14TFCliCod ;
      AV74Generacionhdrsds_5_tfclicod_to = AV15TFCliCod_To ;
      AV75Generacionhdrsds_6_tfclinom = AV16TFCliNom ;
      AV76Generacionhdrsds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Generacionhdrsds_8_tfdispart = AV20TFDisPart ;
      AV78Generacionhdrsds_9_tfdispart_to = AV21TFDisPart_To ;
      AV79Generacionhdrsds_10_tfdisartcod = AV22TFDisArtCod ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = AV23TFDisArtCod_Sel ;
      AV81Generacionhdrsds_12_tfdisartdsc = AV24TFDisArtDsc ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = AV25TFDisArtDsc_Sel ;
      AV83Generacionhdrsds_14_tfdiscolnom = AV26TFDisColNom ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = AV27TFDisColNom_Sel ;
      AV85Generacionhdrsds_16_tfdiscolnum = AV28TFDisColNum ;
      AV86Generacionhdrsds_17_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV87Generacionhdrsds_18_tfdistipcol = AV30TFDisTipCol ;
      AV88Generacionhdrsds_19_tfdistipcol_to = AV31TFDisTipCol_To ;
      AV89Generacionhdrsds_20_tfdisnomcli = AV32TFDisNomCli ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = AV33TFDisNomCli_Sel ;
      AV91Generacionhdrsds_22_tfdisunimed = AV34TFDisUniMed ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = AV35TFDisUniMed_Sel ;
      AV93Generacionhdrsds_24_tfdispiepie = AV36TFDisPiePie ;
      AV94Generacionhdrsds_25_tfdispiepie_to = AV37TFDisPiePie_To ;
      AV95Generacionhdrsds_26_tfdispiekgm = AV38TFDisPieKgm ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = AV39TFDisPieKgm_To ;
      AV97Generacionhdrsds_28_tfdispiemtr = AV40TFDisPieMtr ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = AV41TFDisPieMtr_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to) ,
                                           AV72Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV73Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to) ,
                                           AV76Generacionhdrsds_7_tfclinom_sel ,
                                           AV75Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV77Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to) ,
                                           AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV79Generacionhdrsds_10_tfdisartcod ,
                                           AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV81Generacionhdrsds_12_tfdisartdsc ,
                                           AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV83Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV89Generacionhdrsds_20_tfdisnomcli ,
                                           AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV95Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV97Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV64DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV75Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV79Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV79Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV81Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV81Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV83Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV83Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV89Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV89Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV91Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV91Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor P093611 */
      pr_default.execute(4, new Object[] {Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), AV63Emprcod, Byte.valueOf(AV64DisEst), Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to), AV72Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV73Generacionhdrsds_4_tfclicod), Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to), lV75Generacionhdrsds_6_tfclinom, AV76Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV77Generacionhdrsds_8_tfdispart), Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to), lV79Generacionhdrsds_10_tfdisartcod, AV80Generacionhdrsds_11_tfdisartcod_sel, lV81Generacionhdrsds_12_tfdisartdsc, AV82Generacionhdrsds_13_tfdisartdsc_sel, lV83Generacionhdrsds_14_tfdiscolnom, AV84Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to), lV89Generacionhdrsds_20_tfdisnomcli, AV90Generacionhdrsds_21_tfdisnomcli_sel, lV91Generacionhdrsds_22_tfdisunimed, AV92Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk93610 = false ;
         A396EmprCod = P093611_A396EmprCod[0] ;
         A367DisEst = P093611_A367DisEst[0] ;
         A1195DisNomCli = P093611_A1195DisNomCli[0] ;
         A392DisUniMed = P093611_A392DisUniMed[0] ;
         A390DisTipCol = P093611_A390DisTipCol[0] ;
         n390DisTipCol = P093611_n390DisTipCol[0] ;
         A363DisColNum = P093611_A363DisColNum[0] ;
         n363DisColNum = P093611_n363DisColNum[0] ;
         A362DisColNom = P093611_A362DisColNom[0] ;
         n362DisColNom = P093611_n362DisColNom[0] ;
         A337DisArtDsc = P093611_A337DisArtDsc[0] ;
         A335DisArtCod = P093611_A335DisArtCod[0] ;
         A1502DisPart = P093611_A1502DisPart[0] ;
         A279CliNom = P093611_A279CliNom[0] ;
         A252CliCod = P093611_A252CliCod[0] ;
         A369DisFec = P093611_A369DisFec[0] ;
         A361DisCod = P093611_A361DisCod[0] ;
         A387DisPiePie = P093611_A387DisPiePie[0] ;
         n387DisPiePie = P093611_n387DisPiePie[0] ;
         A365DisDes = P093611_A365DisDes[0] ;
         A279CliNom = P093611_A279CliNom[0] ;
         A387DisPiePie = P093611_A387DisPiePie[0] ;
         n387DisPiePie = P093611_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV95Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV96Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV97Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV98Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV54count = 0 ;
                     while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P093611_A1195DisNomCli[0], A1195DisNomCli) == 0 ) )
                     {
                        brk93610 = false ;
                        A396EmprCod = P093611_A396EmprCod[0] ;
                        A361DisCod = P093611_A361DisCod[0] ;
                        AV54count = (long)(AV54count+1) ;
                        brk93610 = true ;
                        pr_default.readNext(4);
                     }
                     if ( ! (GXutil.strcmp("", A1195DisNomCli)==0) )
                     {
                        AV46Option = A1195DisNomCli ;
                        AV47Options.add(AV46Option, 0);
                        AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV47Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk93610 )
         {
            brk93610 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADDISUNIMEDOPTIONS' Routine */
      returnInSub = false ;
      AV34TFDisUniMed = AV42SearchTxt ;
      AV35TFDisUniMed_Sel = "" ;
      AV70Generacionhdrsds_1_tfdiscod = AV10TFDisCod ;
      AV71Generacionhdrsds_2_tfdiscod_to = AV11TFDisCod_To ;
      AV72Generacionhdrsds_3_tfdisfec = AV12TFDisFec ;
      AV73Generacionhdrsds_4_tfclicod = AV14TFCliCod ;
      AV74Generacionhdrsds_5_tfclicod_to = AV15TFCliCod_To ;
      AV75Generacionhdrsds_6_tfclinom = AV16TFCliNom ;
      AV76Generacionhdrsds_7_tfclinom_sel = AV17TFCliNom_Sel ;
      AV77Generacionhdrsds_8_tfdispart = AV20TFDisPart ;
      AV78Generacionhdrsds_9_tfdispart_to = AV21TFDisPart_To ;
      AV79Generacionhdrsds_10_tfdisartcod = AV22TFDisArtCod ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = AV23TFDisArtCod_Sel ;
      AV81Generacionhdrsds_12_tfdisartdsc = AV24TFDisArtDsc ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = AV25TFDisArtDsc_Sel ;
      AV83Generacionhdrsds_14_tfdiscolnom = AV26TFDisColNom ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = AV27TFDisColNom_Sel ;
      AV85Generacionhdrsds_16_tfdiscolnum = AV28TFDisColNum ;
      AV86Generacionhdrsds_17_tfdiscolnum_to = AV29TFDisColNum_To ;
      AV87Generacionhdrsds_18_tfdistipcol = AV30TFDisTipCol ;
      AV88Generacionhdrsds_19_tfdistipcol_to = AV31TFDisTipCol_To ;
      AV89Generacionhdrsds_20_tfdisnomcli = AV32TFDisNomCli ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = AV33TFDisNomCli_Sel ;
      AV91Generacionhdrsds_22_tfdisunimed = AV34TFDisUniMed ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = AV35TFDisUniMed_Sel ;
      AV93Generacionhdrsds_24_tfdispiepie = AV36TFDisPiePie ;
      AV94Generacionhdrsds_25_tfdispiepie_to = AV37TFDisPiePie_To ;
      AV95Generacionhdrsds_26_tfdispiekgm = AV38TFDisPieKgm ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = AV39TFDisPieKgm_To ;
      AV97Generacionhdrsds_28_tfdispiemtr = AV40TFDisPieMtr ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = AV41TFDisPieMtr_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod) ,
                                           Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to) ,
                                           AV72Generacionhdrsds_3_tfdisfec ,
                                           Integer.valueOf(AV73Generacionhdrsds_4_tfclicod) ,
                                           Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to) ,
                                           AV76Generacionhdrsds_7_tfclinom_sel ,
                                           AV75Generacionhdrsds_6_tfclinom ,
                                           Short.valueOf(AV77Generacionhdrsds_8_tfdispart) ,
                                           Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to) ,
                                           AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           AV79Generacionhdrsds_10_tfdisartcod ,
                                           AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           AV81Generacionhdrsds_12_tfdisartdsc ,
                                           AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           AV83Generacionhdrsds_14_tfdiscolnom ,
                                           Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum) ,
                                           Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to) ,
                                           Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol) ,
                                           Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to) ,
                                           AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           AV89Generacionhdrsds_20_tfdisnomcli ,
                                           AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie) ,
                                           Short.valueOf(A387DisPiePie) ,
                                           Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to) ,
                                           AV95Generacionhdrsds_26_tfdispiekgm ,
                                           A381DisPieKgm ,
                                           AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           AV97Generacionhdrsds_28_tfdispiemtr ,
                                           A385DisPieMtr ,
                                           AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           Byte.valueOf(A367DisEst) ,
                                           Byte.valueOf(AV64DisEst) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV75Generacionhdrsds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV75Generacionhdrsds_6_tfclinom), 30, "%") ;
      lV79Generacionhdrsds_10_tfdisartcod = GXutil.padr( GXutil.rtrim( AV79Generacionhdrsds_10_tfdisartcod), 16, "%") ;
      lV81Generacionhdrsds_12_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV81Generacionhdrsds_12_tfdisartdsc), 26, "%") ;
      lV83Generacionhdrsds_14_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV83Generacionhdrsds_14_tfdiscolnom), 13, "%") ;
      lV89Generacionhdrsds_20_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV89Generacionhdrsds_20_tfdisnomcli), 13, "%") ;
      lV91Generacionhdrsds_22_tfdisunimed = GXutil.padr( GXutil.rtrim( AV91Generacionhdrsds_22_tfdisunimed), 1, "%") ;
      /* Using cursor P093613 */
      pr_default.execute(5, new Object[] {Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV93Generacionhdrsds_24_tfdispiepie), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), Short.valueOf(AV94Generacionhdrsds_25_tfdispiepie_to), AV63Emprcod, Byte.valueOf(AV64DisEst), Integer.valueOf(AV70Generacionhdrsds_1_tfdiscod), Integer.valueOf(AV71Generacionhdrsds_2_tfdiscod_to), AV72Generacionhdrsds_3_tfdisfec, Integer.valueOf(AV73Generacionhdrsds_4_tfclicod), Integer.valueOf(AV74Generacionhdrsds_5_tfclicod_to), lV75Generacionhdrsds_6_tfclinom, AV76Generacionhdrsds_7_tfclinom_sel, Short.valueOf(AV77Generacionhdrsds_8_tfdispart), Short.valueOf(AV78Generacionhdrsds_9_tfdispart_to), lV79Generacionhdrsds_10_tfdisartcod, AV80Generacionhdrsds_11_tfdisartcod_sel, lV81Generacionhdrsds_12_tfdisartdsc, AV82Generacionhdrsds_13_tfdisartdsc_sel, lV83Generacionhdrsds_14_tfdiscolnom, AV84Generacionhdrsds_15_tfdiscolnom_sel, Integer.valueOf(AV85Generacionhdrsds_16_tfdiscolnum), Integer.valueOf(AV86Generacionhdrsds_17_tfdiscolnum_to), Byte.valueOf(AV87Generacionhdrsds_18_tfdistipcol), Byte.valueOf(AV88Generacionhdrsds_19_tfdistipcol_to), lV89Generacionhdrsds_20_tfdisnomcli, AV90Generacionhdrsds_21_tfdisnomcli_sel, lV91Generacionhdrsds_22_tfdisunimed, AV92Generacionhdrsds_23_tfdisunimed_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk93612 = false ;
         A396EmprCod = P093613_A396EmprCod[0] ;
         A367DisEst = P093613_A367DisEst[0] ;
         A392DisUniMed = P093613_A392DisUniMed[0] ;
         A1195DisNomCli = P093613_A1195DisNomCli[0] ;
         A390DisTipCol = P093613_A390DisTipCol[0] ;
         n390DisTipCol = P093613_n390DisTipCol[0] ;
         A363DisColNum = P093613_A363DisColNum[0] ;
         n363DisColNum = P093613_n363DisColNum[0] ;
         A362DisColNom = P093613_A362DisColNom[0] ;
         n362DisColNom = P093613_n362DisColNom[0] ;
         A337DisArtDsc = P093613_A337DisArtDsc[0] ;
         A335DisArtCod = P093613_A335DisArtCod[0] ;
         A1502DisPart = P093613_A1502DisPart[0] ;
         A279CliNom = P093613_A279CliNom[0] ;
         A252CliCod = P093613_A252CliCod[0] ;
         A369DisFec = P093613_A369DisFec[0] ;
         A361DisCod = P093613_A361DisCod[0] ;
         A387DisPiePie = P093613_A387DisPiePie[0] ;
         n387DisPiePie = P093613_n387DisPiePie[0] ;
         A365DisDes = P093613_A365DisDes[0] ;
         A279CliNom = P093613_A279CliNom[0] ;
         A387DisPiePie = P093613_A387DisPiePie[0] ;
         n387DisPiePie = P093613_n387DisPiePie[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Generacionhdrsds_26_tfdispiekgm)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV95Generacionhdrsds_26_tfdispiekgm) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Generacionhdrsds_27_tfdispiekgm_to)==0) || ( ( DecimalUtil.compareTo(A381DisPieKgm, AV96Generacionhdrsds_27_tfdispiekgm_to) <= 0 ) ) )
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Generacionhdrsds_28_tfdispiemtr)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV97Generacionhdrsds_28_tfdispiemtr) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Generacionhdrsds_29_tfdispiemtr_to)==0) || ( ( DecimalUtil.compareTo(A385DisPieMtr, AV98Generacionhdrsds_29_tfdispiemtr_to) <= 0 ) ) )
                  {
                     AV54count = 0 ;
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P093613_A392DisUniMed[0], A392DisUniMed) == 0 ) )
                     {
                        brk93612 = false ;
                        A396EmprCod = P093613_A396EmprCod[0] ;
                        A361DisCod = P093613_A361DisCod[0] ;
                        AV54count = (long)(AV54count+1) ;
                        brk93612 = true ;
                        pr_default.readNext(5);
                     }
                     if ( ! (GXutil.strcmp("", A392DisUniMed)==0) )
                     {
                        AV46Option = A392DisUniMed ;
                        AV49OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A392DisUniMed, "@!"))) ;
                        AV47Options.add(AV46Option, 0);
                        AV50OptionsDesc.add(AV49OptionDesc, 0);
                        AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV47Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk93612 )
         {
            brk93612 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = generacionhdrsgetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = generacionhdrsgetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = generacionhdrsgetfilterdata.this.AV53OptionIndexesJson;
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
      /* Using cursor P093614 */
      pr_default.execute(6, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         X631Metros = P093614_A631Metros[0] ;
      }
      pr_default.close(6);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P093615 */
      pr_default.execute(7, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         X384DisPieMet = P093615_A384DisPieMet[0] ;
      }
      pr_default.close(7);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P093616 */
      pr_default.execute(8, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         X595Kilos = P093616_A595Kilos[0] ;
      }
      pr_default.close(8);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P093617 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         X382DisPieKil = P093617_A382DisPieKil[0] ;
      }
      pr_default.close(9);
      return X382DisPieKil ;
   }

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
      AV12TFDisFec = GXutil.nullDate() ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV22TFDisArtCod = "" ;
      AV23TFDisArtCod_Sel = "" ;
      AV24TFDisArtDsc = "" ;
      AV25TFDisArtDsc_Sel = "" ;
      AV26TFDisColNom = "" ;
      AV27TFDisColNom_Sel = "" ;
      AV32TFDisNomCli = "" ;
      AV33TFDisNomCli_Sel = "" ;
      AV34TFDisUniMed = "" ;
      AV35TFDisUniMed_Sel = "" ;
      AV38TFDisPieKgm = DecimalUtil.ZERO ;
      AV39TFDisPieKgm_To = DecimalUtil.ZERO ;
      AV40TFDisPieMtr = DecimalUtil.ZERO ;
      AV41TFDisPieMtr_To = DecimalUtil.ZERO ;
      AV63Emprcod = "" ;
      AV65BarNHdr = "" ;
      A279CliNom = "" ;
      AV72Generacionhdrsds_3_tfdisfec = GXutil.nullDate() ;
      AV75Generacionhdrsds_6_tfclinom = "" ;
      AV76Generacionhdrsds_7_tfclinom_sel = "" ;
      AV79Generacionhdrsds_10_tfdisartcod = "" ;
      AV80Generacionhdrsds_11_tfdisartcod_sel = "" ;
      AV81Generacionhdrsds_12_tfdisartdsc = "" ;
      AV82Generacionhdrsds_13_tfdisartdsc_sel = "" ;
      AV83Generacionhdrsds_14_tfdiscolnom = "" ;
      AV84Generacionhdrsds_15_tfdiscolnom_sel = "" ;
      AV89Generacionhdrsds_20_tfdisnomcli = "" ;
      AV90Generacionhdrsds_21_tfdisnomcli_sel = "" ;
      AV91Generacionhdrsds_22_tfdisunimed = "" ;
      AV92Generacionhdrsds_23_tfdisunimed_sel = "" ;
      AV95Generacionhdrsds_26_tfdispiekgm = DecimalUtil.ZERO ;
      AV96Generacionhdrsds_27_tfdispiekgm_to = DecimalUtil.ZERO ;
      AV97Generacionhdrsds_28_tfdispiemtr = DecimalUtil.ZERO ;
      AV98Generacionhdrsds_29_tfdispiemtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV75Generacionhdrsds_6_tfclinom = "" ;
      lV79Generacionhdrsds_10_tfdisartcod = "" ;
      lV81Generacionhdrsds_12_tfdisartdsc = "" ;
      lV83Generacionhdrsds_14_tfdiscolnom = "" ;
      lV89Generacionhdrsds_20_tfdisnomcli = "" ;
      lV91Generacionhdrsds_22_tfdisunimed = "" ;
      A369DisFec = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A392DisUniMed = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P09363_A396EmprCod = new String[] {""} ;
      P09363_A367DisEst = new byte[1] ;
      P09363_A279CliNom = new String[] {""} ;
      P09363_A392DisUniMed = new String[] {""} ;
      P09363_A1195DisNomCli = new String[] {""} ;
      P09363_A390DisTipCol = new byte[1] ;
      P09363_n390DisTipCol = new boolean[] {false} ;
      P09363_A363DisColNum = new int[1] ;
      P09363_n363DisColNum = new boolean[] {false} ;
      P09363_A362DisColNom = new String[] {""} ;
      P09363_n362DisColNom = new boolean[] {false} ;
      P09363_A337DisArtDsc = new String[] {""} ;
      P09363_A335DisArtCod = new String[] {""} ;
      P09363_A1502DisPart = new short[1] ;
      P09363_A252CliCod = new int[1] ;
      P09363_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09363_A361DisCod = new int[1] ;
      P09363_A387DisPiePie = new short[1] ;
      P09363_n387DisPiePie = new boolean[] {false} ;
      P09363_A365DisDes = new String[] {""} ;
      A365DisDes = "" ;
      AV46Option = "" ;
      P09365_A396EmprCod = new String[] {""} ;
      P09365_A367DisEst = new byte[1] ;
      P09365_A335DisArtCod = new String[] {""} ;
      P09365_A392DisUniMed = new String[] {""} ;
      P09365_A1195DisNomCli = new String[] {""} ;
      P09365_A390DisTipCol = new byte[1] ;
      P09365_n390DisTipCol = new boolean[] {false} ;
      P09365_A363DisColNum = new int[1] ;
      P09365_n363DisColNum = new boolean[] {false} ;
      P09365_A362DisColNom = new String[] {""} ;
      P09365_n362DisColNom = new boolean[] {false} ;
      P09365_A337DisArtDsc = new String[] {""} ;
      P09365_A1502DisPart = new short[1] ;
      P09365_A279CliNom = new String[] {""} ;
      P09365_A252CliCod = new int[1] ;
      P09365_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09365_A361DisCod = new int[1] ;
      P09365_A387DisPiePie = new short[1] ;
      P09365_n387DisPiePie = new boolean[] {false} ;
      P09365_A365DisDes = new String[] {""} ;
      P09367_A396EmprCod = new String[] {""} ;
      P09367_A367DisEst = new byte[1] ;
      P09367_A337DisArtDsc = new String[] {""} ;
      P09367_A392DisUniMed = new String[] {""} ;
      P09367_A1195DisNomCli = new String[] {""} ;
      P09367_A390DisTipCol = new byte[1] ;
      P09367_n390DisTipCol = new boolean[] {false} ;
      P09367_A363DisColNum = new int[1] ;
      P09367_n363DisColNum = new boolean[] {false} ;
      P09367_A362DisColNom = new String[] {""} ;
      P09367_n362DisColNom = new boolean[] {false} ;
      P09367_A335DisArtCod = new String[] {""} ;
      P09367_A1502DisPart = new short[1] ;
      P09367_A279CliNom = new String[] {""} ;
      P09367_A252CliCod = new int[1] ;
      P09367_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09367_A361DisCod = new int[1] ;
      P09367_A387DisPiePie = new short[1] ;
      P09367_n387DisPiePie = new boolean[] {false} ;
      P09367_A365DisDes = new String[] {""} ;
      P09369_A396EmprCod = new String[] {""} ;
      P09369_A367DisEst = new byte[1] ;
      P09369_A362DisColNom = new String[] {""} ;
      P09369_n362DisColNom = new boolean[] {false} ;
      P09369_A392DisUniMed = new String[] {""} ;
      P09369_A1195DisNomCli = new String[] {""} ;
      P09369_A390DisTipCol = new byte[1] ;
      P09369_n390DisTipCol = new boolean[] {false} ;
      P09369_A363DisColNum = new int[1] ;
      P09369_n363DisColNum = new boolean[] {false} ;
      P09369_A337DisArtDsc = new String[] {""} ;
      P09369_A335DisArtCod = new String[] {""} ;
      P09369_A1502DisPart = new short[1] ;
      P09369_A279CliNom = new String[] {""} ;
      P09369_A252CliCod = new int[1] ;
      P09369_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09369_A361DisCod = new int[1] ;
      P09369_A387DisPiePie = new short[1] ;
      P09369_n387DisPiePie = new boolean[] {false} ;
      P09369_A365DisDes = new String[] {""} ;
      P093611_A396EmprCod = new String[] {""} ;
      P093611_A367DisEst = new byte[1] ;
      P093611_A1195DisNomCli = new String[] {""} ;
      P093611_A392DisUniMed = new String[] {""} ;
      P093611_A390DisTipCol = new byte[1] ;
      P093611_n390DisTipCol = new boolean[] {false} ;
      P093611_A363DisColNum = new int[1] ;
      P093611_n363DisColNum = new boolean[] {false} ;
      P093611_A362DisColNom = new String[] {""} ;
      P093611_n362DisColNom = new boolean[] {false} ;
      P093611_A337DisArtDsc = new String[] {""} ;
      P093611_A335DisArtCod = new String[] {""} ;
      P093611_A1502DisPart = new short[1] ;
      P093611_A279CliNom = new String[] {""} ;
      P093611_A252CliCod = new int[1] ;
      P093611_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093611_A361DisCod = new int[1] ;
      P093611_A387DisPiePie = new short[1] ;
      P093611_n387DisPiePie = new boolean[] {false} ;
      P093611_A365DisDes = new String[] {""} ;
      P093613_A396EmprCod = new String[] {""} ;
      P093613_A367DisEst = new byte[1] ;
      P093613_A392DisUniMed = new String[] {""} ;
      P093613_A1195DisNomCli = new String[] {""} ;
      P093613_A390DisTipCol = new byte[1] ;
      P093613_n390DisTipCol = new boolean[] {false} ;
      P093613_A363DisColNum = new int[1] ;
      P093613_n363DisColNum = new boolean[] {false} ;
      P093613_A362DisColNom = new String[] {""} ;
      P093613_n362DisColNom = new boolean[] {false} ;
      P093613_A337DisArtDsc = new String[] {""} ;
      P093613_A335DisArtCod = new String[] {""} ;
      P093613_A1502DisPart = new short[1] ;
      P093613_A279CliNom = new String[] {""} ;
      P093613_A252CliCod = new int[1] ;
      P093613_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093613_A361DisCod = new int[1] ;
      P093613_A387DisPiePie = new short[1] ;
      P093613_n387DisPiePie = new boolean[] {false} ;
      P093613_A365DisDes = new String[] {""} ;
      AV49OptionDesc = "" ;
      X631Metros = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P093614_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P093615_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      P093616_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P093617_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.generacionhdrsgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09363_A396EmprCod, P09363_A367DisEst, P09363_A279CliNom, P09363_A392DisUniMed, P09363_A1195DisNomCli, P09363_A390DisTipCol, P09363_n390DisTipCol, P09363_A363DisColNum, P09363_n363DisColNum, P09363_A362DisColNom,
            P09363_n362DisColNom, P09363_A337DisArtDsc, P09363_A335DisArtCod, P09363_A1502DisPart, P09363_A252CliCod, P09363_A369DisFec, P09363_A361DisCod, P09363_A387DisPiePie, P09363_n387DisPiePie, P09363_A365DisDes
            }
            , new Object[] {
            P09365_A396EmprCod, P09365_A367DisEst, P09365_A335DisArtCod, P09365_A392DisUniMed, P09365_A1195DisNomCli, P09365_A390DisTipCol, P09365_n390DisTipCol, P09365_A363DisColNum, P09365_n363DisColNum, P09365_A362DisColNom,
            P09365_n362DisColNom, P09365_A337DisArtDsc, P09365_A1502DisPart, P09365_A279CliNom, P09365_A252CliCod, P09365_A369DisFec, P09365_A361DisCod, P09365_A387DisPiePie, P09365_n387DisPiePie, P09365_A365DisDes
            }
            , new Object[] {
            P09367_A396EmprCod, P09367_A367DisEst, P09367_A337DisArtDsc, P09367_A392DisUniMed, P09367_A1195DisNomCli, P09367_A390DisTipCol, P09367_n390DisTipCol, P09367_A363DisColNum, P09367_n363DisColNum, P09367_A362DisColNom,
            P09367_n362DisColNom, P09367_A335DisArtCod, P09367_A1502DisPart, P09367_A279CliNom, P09367_A252CliCod, P09367_A369DisFec, P09367_A361DisCod, P09367_A387DisPiePie, P09367_n387DisPiePie, P09367_A365DisDes
            }
            , new Object[] {
            P09369_A396EmprCod, P09369_A367DisEst, P09369_A362DisColNom, P09369_n362DisColNom, P09369_A392DisUniMed, P09369_A1195DisNomCli, P09369_A390DisTipCol, P09369_n390DisTipCol, P09369_A363DisColNum, P09369_n363DisColNum,
            P09369_A337DisArtDsc, P09369_A335DisArtCod, P09369_A1502DisPart, P09369_A279CliNom, P09369_A252CliCod, P09369_A369DisFec, P09369_A361DisCod, P09369_A387DisPiePie, P09369_n387DisPiePie, P09369_A365DisDes
            }
            , new Object[] {
            P093611_A396EmprCod, P093611_A367DisEst, P093611_A1195DisNomCli, P093611_A392DisUniMed, P093611_A390DisTipCol, P093611_n390DisTipCol, P093611_A363DisColNum, P093611_n363DisColNum, P093611_A362DisColNom, P093611_n362DisColNom,
            P093611_A337DisArtDsc, P093611_A335DisArtCod, P093611_A1502DisPart, P093611_A279CliNom, P093611_A252CliCod, P093611_A369DisFec, P093611_A361DisCod, P093611_A387DisPiePie, P093611_n387DisPiePie, P093611_A365DisDes
            }
            , new Object[] {
            P093613_A396EmprCod, P093613_A367DisEst, P093613_A392DisUniMed, P093613_A1195DisNomCli, P093613_A390DisTipCol, P093613_n390DisTipCol, P093613_A363DisColNum, P093613_n363DisColNum, P093613_A362DisColNom, P093613_n362DisColNom,
            P093613_A337DisArtDsc, P093613_A335DisArtCod, P093613_A1502DisPart, P093613_A279CliNom, P093613_A252CliCod, P093613_A369DisFec, P093613_A361DisCod, P093613_A387DisPiePie, P093613_n387DisPiePie, P093613_A365DisDes
            }
            , new Object[] {
            P093614_A631Metros
            }
            , new Object[] {
            P093615_A384DisPieMet
            }
            , new Object[] {
            P093616_A595Kilos
            }
            , new Object[] {
            P093617_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30TFDisTipCol ;
   private byte AV31TFDisTipCol_To ;
   private byte AV64DisEst ;
   private byte AV87Generacionhdrsds_18_tfdistipcol ;
   private byte AV88Generacionhdrsds_19_tfdistipcol_to ;
   private byte A390DisTipCol ;
   private byte A367DisEst ;
   private short AV20TFDisPart ;
   private short AV21TFDisPart_To ;
   private short AV36TFDisPiePie ;
   private short AV37TFDisPiePie_To ;
   private short AV77Generacionhdrsds_8_tfdispart ;
   private short AV78Generacionhdrsds_9_tfdispart_to ;
   private short AV93Generacionhdrsds_24_tfdispiepie ;
   private short AV94Generacionhdrsds_25_tfdispiepie_to ;
   private short A1502DisPart ;
   private short A387DisPiePie ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV10TFDisCod ;
   private int AV11TFDisCod_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV28TFDisColNum ;
   private int AV29TFDisColNum_To ;
   private int AV70Generacionhdrsds_1_tfdiscod ;
   private int AV71Generacionhdrsds_2_tfdiscod_to ;
   private int AV73Generacionhdrsds_4_tfclicod ;
   private int AV74Generacionhdrsds_5_tfclicod_to ;
   private int AV85Generacionhdrsds_16_tfdiscolnum ;
   private int AV86Generacionhdrsds_17_tfdiscolnum_to ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int E361DisCod ;
   private long AV54count ;
   private java.math.BigDecimal AV38TFDisPieKgm ;
   private java.math.BigDecimal AV39TFDisPieKgm_To ;
   private java.math.BigDecimal AV40TFDisPieMtr ;
   private java.math.BigDecimal AV41TFDisPieMtr_To ;
   private java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ;
   private java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ;
   private java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ;
   private java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV22TFDisArtCod ;
   private String AV23TFDisArtCod_Sel ;
   private String AV24TFDisArtDsc ;
   private String AV25TFDisArtDsc_Sel ;
   private String AV26TFDisColNom ;
   private String AV27TFDisColNom_Sel ;
   private String AV32TFDisNomCli ;
   private String AV33TFDisNomCli_Sel ;
   private String AV34TFDisUniMed ;
   private String AV35TFDisUniMed_Sel ;
   private String AV63Emprcod ;
   private String AV65BarNHdr ;
   private String A279CliNom ;
   private String AV75Generacionhdrsds_6_tfclinom ;
   private String AV76Generacionhdrsds_7_tfclinom_sel ;
   private String AV79Generacionhdrsds_10_tfdisartcod ;
   private String AV80Generacionhdrsds_11_tfdisartcod_sel ;
   private String AV81Generacionhdrsds_12_tfdisartdsc ;
   private String AV82Generacionhdrsds_13_tfdisartdsc_sel ;
   private String AV83Generacionhdrsds_14_tfdiscolnom ;
   private String AV84Generacionhdrsds_15_tfdiscolnom_sel ;
   private String AV89Generacionhdrsds_20_tfdisnomcli ;
   private String AV90Generacionhdrsds_21_tfdisnomcli_sel ;
   private String AV91Generacionhdrsds_22_tfdisunimed ;
   private String AV92Generacionhdrsds_23_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV75Generacionhdrsds_6_tfclinom ;
   private String lV79Generacionhdrsds_10_tfdisartcod ;
   private String lV81Generacionhdrsds_12_tfdisartdsc ;
   private String lV83Generacionhdrsds_14_tfdiscolnom ;
   private String lV89Generacionhdrsds_20_tfdisnomcli ;
   private String lV91Generacionhdrsds_22_tfdisunimed ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A392DisUniMed ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String E396EmprCod ;
   private java.util.Date AV12TFDisFec ;
   private java.util.Date AV72Generacionhdrsds_3_tfdisfec ;
   private java.util.Date A369DisFec ;
   private boolean returnInSub ;
   private boolean brk9362 ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n387DisPiePie ;
   private boolean brk9364 ;
   private boolean brk9366 ;
   private boolean brk9368 ;
   private boolean brk93610 ;
   private boolean brk93612 ;
   private String AV48OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV46Option ;
   private String AV49OptionDesc ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09363_A396EmprCod ;
   private byte[] P09363_A367DisEst ;
   private String[] P09363_A279CliNom ;
   private String[] P09363_A392DisUniMed ;
   private String[] P09363_A1195DisNomCli ;
   private byte[] P09363_A390DisTipCol ;
   private boolean[] P09363_n390DisTipCol ;
   private int[] P09363_A363DisColNum ;
   private boolean[] P09363_n363DisColNum ;
   private String[] P09363_A362DisColNom ;
   private boolean[] P09363_n362DisColNom ;
   private String[] P09363_A337DisArtDsc ;
   private String[] P09363_A335DisArtCod ;
   private short[] P09363_A1502DisPart ;
   private int[] P09363_A252CliCod ;
   private java.util.Date[] P09363_A369DisFec ;
   private int[] P09363_A361DisCod ;
   private short[] P09363_A387DisPiePie ;
   private boolean[] P09363_n387DisPiePie ;
   private String[] P09363_A365DisDes ;
   private String[] P09365_A396EmprCod ;
   private byte[] P09365_A367DisEst ;
   private String[] P09365_A335DisArtCod ;
   private String[] P09365_A392DisUniMed ;
   private String[] P09365_A1195DisNomCli ;
   private byte[] P09365_A390DisTipCol ;
   private boolean[] P09365_n390DisTipCol ;
   private int[] P09365_A363DisColNum ;
   private boolean[] P09365_n363DisColNum ;
   private String[] P09365_A362DisColNom ;
   private boolean[] P09365_n362DisColNom ;
   private String[] P09365_A337DisArtDsc ;
   private short[] P09365_A1502DisPart ;
   private String[] P09365_A279CliNom ;
   private int[] P09365_A252CliCod ;
   private java.util.Date[] P09365_A369DisFec ;
   private int[] P09365_A361DisCod ;
   private short[] P09365_A387DisPiePie ;
   private boolean[] P09365_n387DisPiePie ;
   private String[] P09365_A365DisDes ;
   private String[] P09367_A396EmprCod ;
   private byte[] P09367_A367DisEst ;
   private String[] P09367_A337DisArtDsc ;
   private String[] P09367_A392DisUniMed ;
   private String[] P09367_A1195DisNomCli ;
   private byte[] P09367_A390DisTipCol ;
   private boolean[] P09367_n390DisTipCol ;
   private int[] P09367_A363DisColNum ;
   private boolean[] P09367_n363DisColNum ;
   private String[] P09367_A362DisColNom ;
   private boolean[] P09367_n362DisColNom ;
   private String[] P09367_A335DisArtCod ;
   private short[] P09367_A1502DisPart ;
   private String[] P09367_A279CliNom ;
   private int[] P09367_A252CliCod ;
   private java.util.Date[] P09367_A369DisFec ;
   private int[] P09367_A361DisCod ;
   private short[] P09367_A387DisPiePie ;
   private boolean[] P09367_n387DisPiePie ;
   private String[] P09367_A365DisDes ;
   private String[] P09369_A396EmprCod ;
   private byte[] P09369_A367DisEst ;
   private String[] P09369_A362DisColNom ;
   private boolean[] P09369_n362DisColNom ;
   private String[] P09369_A392DisUniMed ;
   private String[] P09369_A1195DisNomCli ;
   private byte[] P09369_A390DisTipCol ;
   private boolean[] P09369_n390DisTipCol ;
   private int[] P09369_A363DisColNum ;
   private boolean[] P09369_n363DisColNum ;
   private String[] P09369_A337DisArtDsc ;
   private String[] P09369_A335DisArtCod ;
   private short[] P09369_A1502DisPart ;
   private String[] P09369_A279CliNom ;
   private int[] P09369_A252CliCod ;
   private java.util.Date[] P09369_A369DisFec ;
   private int[] P09369_A361DisCod ;
   private short[] P09369_A387DisPiePie ;
   private boolean[] P09369_n387DisPiePie ;
   private String[] P09369_A365DisDes ;
   private String[] P093611_A396EmprCod ;
   private byte[] P093611_A367DisEst ;
   private String[] P093611_A1195DisNomCli ;
   private String[] P093611_A392DisUniMed ;
   private byte[] P093611_A390DisTipCol ;
   private boolean[] P093611_n390DisTipCol ;
   private int[] P093611_A363DisColNum ;
   private boolean[] P093611_n363DisColNum ;
   private String[] P093611_A362DisColNom ;
   private boolean[] P093611_n362DisColNom ;
   private String[] P093611_A337DisArtDsc ;
   private String[] P093611_A335DisArtCod ;
   private short[] P093611_A1502DisPart ;
   private String[] P093611_A279CliNom ;
   private int[] P093611_A252CliCod ;
   private java.util.Date[] P093611_A369DisFec ;
   private int[] P093611_A361DisCod ;
   private short[] P093611_A387DisPiePie ;
   private boolean[] P093611_n387DisPiePie ;
   private String[] P093611_A365DisDes ;
   private String[] P093613_A396EmprCod ;
   private byte[] P093613_A367DisEst ;
   private String[] P093613_A392DisUniMed ;
   private String[] P093613_A1195DisNomCli ;
   private byte[] P093613_A390DisTipCol ;
   private boolean[] P093613_n390DisTipCol ;
   private int[] P093613_A363DisColNum ;
   private boolean[] P093613_n363DisColNum ;
   private String[] P093613_A362DisColNom ;
   private boolean[] P093613_n362DisColNom ;
   private String[] P093613_A337DisArtDsc ;
   private String[] P093613_A335DisArtCod ;
   private short[] P093613_A1502DisPart ;
   private String[] P093613_A279CliNom ;
   private int[] P093613_A252CliCod ;
   private java.util.Date[] P093613_A369DisFec ;
   private int[] P093613_A361DisCod ;
   private short[] P093613_A387DisPiePie ;
   private boolean[] P093613_n387DisPiePie ;
   private String[] P093613_A365DisDes ;
   private java.math.BigDecimal[] P093614_A631Metros ;
   private java.math.BigDecimal[] P093615_A384DisPieMet ;
   private java.math.BigDecimal[] P093616_A595Kilos ;
   private java.math.BigDecimal[] P093617_A382DisPieKil ;
   private GXSimpleCollection<String> AV47Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV52OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class generacionhdrsgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09363( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV70Generacionhdrsds_1_tfdiscod ,
                                          int AV71Generacionhdrsds_2_tfdiscod_to ,
                                          java.util.Date AV72Generacionhdrsds_3_tfdisfec ,
                                          int AV73Generacionhdrsds_4_tfclicod ,
                                          int AV74Generacionhdrsds_5_tfclicod_to ,
                                          String AV76Generacionhdrsds_7_tfclinom_sel ,
                                          String AV75Generacionhdrsds_6_tfclinom ,
                                          short AV77Generacionhdrsds_8_tfdispart ,
                                          short AV78Generacionhdrsds_9_tfdispart_to ,
                                          String AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                          String AV79Generacionhdrsds_10_tfdisartcod ,
                                          String AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                          String AV81Generacionhdrsds_12_tfdisartdsc ,
                                          String AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                          String AV83Generacionhdrsds_14_tfdiscolnom ,
                                          int AV85Generacionhdrsds_16_tfdiscolnum ,
                                          int AV86Generacionhdrsds_17_tfdiscolnum_to ,
                                          byte AV87Generacionhdrsds_18_tfdistipcol ,
                                          byte AV88Generacionhdrsds_19_tfdistipcol_to ,
                                          String AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                          String AV89Generacionhdrsds_20_tfdisnomcli ,
                                          String AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                          String AV91Generacionhdrsds_22_tfdisunimed ,
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
                                          short AV93Generacionhdrsds_24_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV94Generacionhdrsds_25_tfdispiepie_to ,
                                          java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                          java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          byte A367DisEst ,
                                          byte AV64DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T2.CliNom, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( ! (0==AV70Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV89Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV91Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09365( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV70Generacionhdrsds_1_tfdiscod ,
                                          int AV71Generacionhdrsds_2_tfdiscod_to ,
                                          java.util.Date AV72Generacionhdrsds_3_tfdisfec ,
                                          int AV73Generacionhdrsds_4_tfclicod ,
                                          int AV74Generacionhdrsds_5_tfclicod_to ,
                                          String AV76Generacionhdrsds_7_tfclinom_sel ,
                                          String AV75Generacionhdrsds_6_tfclinom ,
                                          short AV77Generacionhdrsds_8_tfdispart ,
                                          short AV78Generacionhdrsds_9_tfdispart_to ,
                                          String AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                          String AV79Generacionhdrsds_10_tfdisartcod ,
                                          String AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                          String AV81Generacionhdrsds_12_tfdisartdsc ,
                                          String AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                          String AV83Generacionhdrsds_14_tfdiscolnom ,
                                          int AV85Generacionhdrsds_16_tfdiscolnum ,
                                          int AV86Generacionhdrsds_17_tfdiscolnum_to ,
                                          byte AV87Generacionhdrsds_18_tfdistipcol ,
                                          byte AV88Generacionhdrsds_19_tfdistipcol_to ,
                                          String AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                          String AV89Generacionhdrsds_20_tfdisnomcli ,
                                          String AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                          String AV91Generacionhdrsds_22_tfdisunimed ,
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
                                          short AV93Generacionhdrsds_24_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV94Generacionhdrsds_25_tfdispiepie_to ,
                                          java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                          java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          byte A367DisEst ,
                                          byte AV64DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisArtCod, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisPart, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( ! (0==AV70Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV89Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV91Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09367( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV70Generacionhdrsds_1_tfdiscod ,
                                          int AV71Generacionhdrsds_2_tfdiscod_to ,
                                          java.util.Date AV72Generacionhdrsds_3_tfdisfec ,
                                          int AV73Generacionhdrsds_4_tfclicod ,
                                          int AV74Generacionhdrsds_5_tfclicod_to ,
                                          String AV76Generacionhdrsds_7_tfclinom_sel ,
                                          String AV75Generacionhdrsds_6_tfclinom ,
                                          short AV77Generacionhdrsds_8_tfdispart ,
                                          short AV78Generacionhdrsds_9_tfdispart_to ,
                                          String AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                          String AV79Generacionhdrsds_10_tfdisartcod ,
                                          String AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                          String AV81Generacionhdrsds_12_tfdisartdsc ,
                                          String AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                          String AV83Generacionhdrsds_14_tfdiscolnom ,
                                          int AV85Generacionhdrsds_16_tfdiscolnum ,
                                          int AV86Generacionhdrsds_17_tfdiscolnum_to ,
                                          byte AV87Generacionhdrsds_18_tfdistipcol ,
                                          byte AV88Generacionhdrsds_19_tfdistipcol_to ,
                                          String AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                          String AV89Generacionhdrsds_20_tfdisnomcli ,
                                          String AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                          String AV91Generacionhdrsds_22_tfdisunimed ,
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
                                          short AV93Generacionhdrsds_24_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV94Generacionhdrsds_25_tfdispiepie_to ,
                                          java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                          java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          byte A367DisEst ,
                                          byte AV64DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisArtDsc, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.DisPart, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( ! (0==AV70Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV89Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV91Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09369( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV70Generacionhdrsds_1_tfdiscod ,
                                          int AV71Generacionhdrsds_2_tfdiscod_to ,
                                          java.util.Date AV72Generacionhdrsds_3_tfdisfec ,
                                          int AV73Generacionhdrsds_4_tfclicod ,
                                          int AV74Generacionhdrsds_5_tfclicod_to ,
                                          String AV76Generacionhdrsds_7_tfclinom_sel ,
                                          String AV75Generacionhdrsds_6_tfclinom ,
                                          short AV77Generacionhdrsds_8_tfdispart ,
                                          short AV78Generacionhdrsds_9_tfdispart_to ,
                                          String AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                          String AV79Generacionhdrsds_10_tfdisartcod ,
                                          String AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                          String AV81Generacionhdrsds_12_tfdisartdsc ,
                                          String AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                          String AV83Generacionhdrsds_14_tfdiscolnom ,
                                          int AV85Generacionhdrsds_16_tfdiscolnum ,
                                          int AV86Generacionhdrsds_17_tfdiscolnum_to ,
                                          byte AV87Generacionhdrsds_18_tfdistipcol ,
                                          byte AV88Generacionhdrsds_19_tfdistipcol_to ,
                                          String AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                          String AV89Generacionhdrsds_20_tfdisnomcli ,
                                          String AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                          String AV91Generacionhdrsds_22_tfdisunimed ,
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
                                          short AV93Generacionhdrsds_24_tfdispiepie ,
                                          short A387DisPiePie ,
                                          short AV94Generacionhdrsds_25_tfdispiepie_to ,
                                          java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ,
                                          java.math.BigDecimal A381DisPieKgm ,
                                          java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                          java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ,
                                          java.math.BigDecimal A385DisPieMtr ,
                                          java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          byte A367DisEst ,
                                          byte AV64DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisColNom, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( ! (0==AV70Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV89Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV91Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P093611( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV70Generacionhdrsds_1_tfdiscod ,
                                           int AV71Generacionhdrsds_2_tfdiscod_to ,
                                           java.util.Date AV72Generacionhdrsds_3_tfdisfec ,
                                           int AV73Generacionhdrsds_4_tfclicod ,
                                           int AV74Generacionhdrsds_5_tfclicod_to ,
                                           String AV76Generacionhdrsds_7_tfclinom_sel ,
                                           String AV75Generacionhdrsds_6_tfclinom ,
                                           short AV77Generacionhdrsds_8_tfdispart ,
                                           short AV78Generacionhdrsds_9_tfdispart_to ,
                                           String AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           String AV79Generacionhdrsds_10_tfdisartcod ,
                                           String AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           String AV81Generacionhdrsds_12_tfdisartdsc ,
                                           String AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           String AV83Generacionhdrsds_14_tfdiscolnom ,
                                           int AV85Generacionhdrsds_16_tfdiscolnum ,
                                           int AV86Generacionhdrsds_17_tfdiscolnum_to ,
                                           byte AV87Generacionhdrsds_18_tfdistipcol ,
                                           byte AV88Generacionhdrsds_19_tfdistipcol_to ,
                                           String AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           String AV89Generacionhdrsds_20_tfdisnomcli ,
                                           String AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           String AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           short AV93Generacionhdrsds_24_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV94Generacionhdrsds_25_tfdispiepie_to ,
                                           java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           String A396EmprCod ,
                                           String AV63Emprcod ,
                                           byte A367DisEst ,
                                           byte AV64DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[29];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisNomCli, T1.DisUniMed, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( ! (0==AV70Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV89Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV91Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P093613( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV70Generacionhdrsds_1_tfdiscod ,
                                           int AV71Generacionhdrsds_2_tfdiscod_to ,
                                           java.util.Date AV72Generacionhdrsds_3_tfdisfec ,
                                           int AV73Generacionhdrsds_4_tfclicod ,
                                           int AV74Generacionhdrsds_5_tfclicod_to ,
                                           String AV76Generacionhdrsds_7_tfclinom_sel ,
                                           String AV75Generacionhdrsds_6_tfclinom ,
                                           short AV77Generacionhdrsds_8_tfdispart ,
                                           short AV78Generacionhdrsds_9_tfdispart_to ,
                                           String AV80Generacionhdrsds_11_tfdisartcod_sel ,
                                           String AV79Generacionhdrsds_10_tfdisartcod ,
                                           String AV82Generacionhdrsds_13_tfdisartdsc_sel ,
                                           String AV81Generacionhdrsds_12_tfdisartdsc ,
                                           String AV84Generacionhdrsds_15_tfdiscolnom_sel ,
                                           String AV83Generacionhdrsds_14_tfdiscolnom ,
                                           int AV85Generacionhdrsds_16_tfdiscolnum ,
                                           int AV86Generacionhdrsds_17_tfdiscolnum_to ,
                                           byte AV87Generacionhdrsds_18_tfdistipcol ,
                                           byte AV88Generacionhdrsds_19_tfdistipcol_to ,
                                           String AV90Generacionhdrsds_21_tfdisnomcli_sel ,
                                           String AV89Generacionhdrsds_20_tfdisnomcli ,
                                           String AV92Generacionhdrsds_23_tfdisunimed_sel ,
                                           String AV91Generacionhdrsds_22_tfdisunimed ,
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
                                           short AV93Generacionhdrsds_24_tfdispiepie ,
                                           short A387DisPiePie ,
                                           short AV94Generacionhdrsds_25_tfdispiepie_to ,
                                           java.math.BigDecimal AV95Generacionhdrsds_26_tfdispiekgm ,
                                           java.math.BigDecimal A381DisPieKgm ,
                                           java.math.BigDecimal AV96Generacionhdrsds_27_tfdispiekgm_to ,
                                           java.math.BigDecimal AV97Generacionhdrsds_28_tfdispiemtr ,
                                           java.math.BigDecimal A385DisPieMtr ,
                                           java.math.BigDecimal AV98Generacionhdrsds_29_tfdispiemtr_to ,
                                           String A396EmprCod ,
                                           String AV63Emprcod ,
                                           byte A367DisEst ,
                                           byte AV64DisEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[29];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisEst, T1.DisUniMed, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisPart, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisFec, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod =" ;
      scmdbuf += " T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisPiePie, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DisEst = ?)");
      if ( ! (0==AV70Generacionhdrsds_1_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV71Generacionhdrsds_2_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Generacionhdrsds_3_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV73Generacionhdrsds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Generacionhdrsds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Generacionhdrsds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Generacionhdrsds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Generacionhdrsds_8_tfdispart) )
      {
         addWhere(sWhereString, "(T1.DisPart >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV78Generacionhdrsds_9_tfdispart_to) )
      {
         addWhere(sWhereString, "(T1.DisPart <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Generacionhdrsds_10_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Generacionhdrsds_11_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Generacionhdrsds_12_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Generacionhdrsds_13_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Generacionhdrsds_14_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Generacionhdrsds_15_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV85Generacionhdrsds_16_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Generacionhdrsds_17_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Generacionhdrsds_18_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV88Generacionhdrsds_19_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV89Generacionhdrsds_20_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Generacionhdrsds_21_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV91Generacionhdrsds_22_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Generacionhdrsds_23_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisUniMed" ;
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
                  return conditional_P09363(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() );
            case 1 :
                  return conditional_P09365(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() );
            case 2 :
                  return conditional_P09367(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() );
            case 3 :
                  return conditional_P09369(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() );
            case 4 :
                  return conditional_P093611(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() );
            case 5 :
                  return conditional_P093613(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09363", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09365", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09367", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09369", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093611", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093613", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093614", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093615", "SELECT SUM(DisPieMet) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093616", "SELECT SUM(Kilos) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093617", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 9 :
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
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

