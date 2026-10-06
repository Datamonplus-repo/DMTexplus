package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaqui1wwgetfilterdata extends GXProcedure
{
   public tmaqui1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqui1wwgetfilterdata.class ), "" );
   }

   public tmaqui1wwgetfilterdata( int remoteHandle ,
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
      tmaqui1wwgetfilterdata.this.aP5 = new String[] {""};
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
      tmaqui1wwgetfilterdata.this.AV54DDOName = aP0;
      tmaqui1wwgetfilterdata.this.AV52SearchTxt = aP1;
      tmaqui1wwgetfilterdata.this.AV53SearchTxtTo = aP2;
      tmaqui1wwgetfilterdata.this.aP3 = aP3;
      tmaqui1wwgetfilterdata.this.aP4 = aP4;
      tmaqui1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV57Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MAQEST") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQESTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MAQTINTIP") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQTINTIPOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_TIPMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMAQCODOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_TIPMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMAQDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV58OptionsJson = AV57Options.toJSonString(false) ;
      AV61OptionsDescJson = AV60OptionsDesc.toJSonString(false) ;
      AV63OptionIndexesJson = AV62OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV65Session.getValue("TMAQUI1WWGridState"), "") == 0 )
      {
         AV67GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUI1WWGridState"), null, null);
      }
      else
      {
         AV67GridState.fromxml(AV65Session.getValue("TMAQUI1WWGridState"), null, null);
      }
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV67GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV68GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV67GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV84FilterFullText = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV12TFMaqDsc = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV13TFMaqDsc_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV24TFMaqEst = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV25TFMaqEst_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV85TFMaqTinTip = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV86TFMaqTinTip_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV87TFMaqVolMin = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV88TFMaqVolMin_To = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV89TFMaqVolMed = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV90TFMaqVolMed_To = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV91TFMaqVolTop = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV92TFMaqVolTop_To = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV93TFMaqVolRes = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFMaqVolRes_To = (int)(GXutil.lval( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV42TFMaqKgsMax = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFMaqKgsMax_To = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV40TFMaqKgsMed = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFMaqKgsMed_To = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV38TFMaqKgsMin = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFMaqKgsMin_To = CommonUtil.decimalVal( AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV32TFTipMaqCod = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV33TFTipMaqCod_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV34TFTipMaqDsc = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV35TFTipMaqDsc_Sel = AV68GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV52SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = AV84FilterFullText ;
      AV100Tmaqui1wwds_2_tfmaqcod = AV10TFMaqCod ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV102Tmaqui1wwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV104Tmaqui1wwds_6_tfmaqest = AV24TFMaqEst ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = AV25TFMaqEst_Sel ;
      AV106Tmaqui1wwds_8_tfmaqtintip = AV85TFMaqTinTip ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = AV86TFMaqTinTip_Sel ;
      AV108Tmaqui1wwds_10_tfmaqvolmin = AV87TFMaqVolMin ;
      AV109Tmaqui1wwds_11_tfmaqvolmin_to = AV88TFMaqVolMin_To ;
      AV110Tmaqui1wwds_12_tfmaqvolmed = AV89TFMaqVolMed ;
      AV111Tmaqui1wwds_13_tfmaqvolmed_to = AV90TFMaqVolMed_To ;
      AV112Tmaqui1wwds_14_tfmaqvoltop = AV91TFMaqVolTop ;
      AV113Tmaqui1wwds_15_tfmaqvoltop_to = AV92TFMaqVolTop_To ;
      AV114Tmaqui1wwds_16_tfmaqvolres = AV93TFMaqVolRes ;
      AV115Tmaqui1wwds_17_tfmaqvolres_to = AV94TFMaqVolRes_To ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = AV40TFMaqKgsMed ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = AV41TFMaqKgsMed_To ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = AV38TFMaqKgsMin ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = AV39TFMaqKgsMin_To ;
      AV122Tmaqui1wwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV99Tmaqui1wwds_1_filterfulltext ,
                                           AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV100Tmaqui1wwds_2_tfmaqcod ,
                                           AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV102Tmaqui1wwds_4_tfmaqdsc ,
                                           AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV104Tmaqui1wwds_6_tfmaqest ,
                                           AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV106Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV122Tmaqui1wwds_24_tftipmaqcod ,
                                           AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV100Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV102Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV104Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV104Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV106Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV122Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV122Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV124Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08302 */
      pr_default.execute(0, new Object[] {lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV100Tmaqui1wwds_2_tfmaqcod, AV101Tmaqui1wwds_3_tfmaqcod_sel, lV102Tmaqui1wwds_4_tfmaqdsc, AV103Tmaqui1wwds_5_tfmaqdsc_sel, lV104Tmaqui1wwds_6_tfmaqest, AV105Tmaqui1wwds_7_tfmaqest_sel, lV106Tmaqui1wwds_8_tfmaqtintip, AV107Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to), AV116Tmaqui1wwds_18_tfmaqkgsmax, AV117Tmaqui1wwds_19_tfmaqkgsmax_to, AV118Tmaqui1wwds_20_tfmaqkgsmed, AV119Tmaqui1wwds_21_tfmaqkgsmed_to, AV120Tmaqui1wwds_22_tfmaqkgsmin, AV121Tmaqui1wwds_23_tfmaqkgsmin_to, lV122Tmaqui1wwds_24_tftipmaqcod, AV123Tmaqui1wwds_25_tftipmaqcod_sel, lV124Tmaqui1wwds_26_tftipmaqdsc, AV125Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8302 = false ;
         A396EmprCod = P08302_A396EmprCod[0] ;
         A602MaqCod = P08302_A602MaqCod[0] ;
         A1012TipMaqDsc = P08302_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08302_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08302_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08302_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08302_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08302_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08302_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08302_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08302_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08302_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08302_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08302_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08302_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08302_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08302_A624MaqVolMed[0] ;
         n624MaqVolMed = P08302_n624MaqVolMed[0] ;
         A625MaqVolMin = P08302_A625MaqVolMin[0] ;
         n625MaqVolMin = P08302_n625MaqVolMin[0] ;
         A619MaqTinTip = P08302_A619MaqTinTip[0] ;
         n619MaqTinTip = P08302_n619MaqTinTip[0] ;
         A607MaqEst = P08302_A607MaqEst[0] ;
         n607MaqEst = P08302_n607MaqEst[0] ;
         A606MaqDsc = P08302_A606MaqDsc[0] ;
         n606MaqDsc = P08302_n606MaqDsc[0] ;
         A1012TipMaqDsc = P08302_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08302_n1012TipMaqDsc[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08302_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8302 = false ;
            A396EmprCod = P08302_A396EmprCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8302 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV56Option = A602MaqCod ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8302 )
         {
            brk8302 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqDsc = AV52SearchTxt ;
      AV13TFMaqDsc_Sel = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = AV84FilterFullText ;
      AV100Tmaqui1wwds_2_tfmaqcod = AV10TFMaqCod ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV102Tmaqui1wwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV104Tmaqui1wwds_6_tfmaqest = AV24TFMaqEst ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = AV25TFMaqEst_Sel ;
      AV106Tmaqui1wwds_8_tfmaqtintip = AV85TFMaqTinTip ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = AV86TFMaqTinTip_Sel ;
      AV108Tmaqui1wwds_10_tfmaqvolmin = AV87TFMaqVolMin ;
      AV109Tmaqui1wwds_11_tfmaqvolmin_to = AV88TFMaqVolMin_To ;
      AV110Tmaqui1wwds_12_tfmaqvolmed = AV89TFMaqVolMed ;
      AV111Tmaqui1wwds_13_tfmaqvolmed_to = AV90TFMaqVolMed_To ;
      AV112Tmaqui1wwds_14_tfmaqvoltop = AV91TFMaqVolTop ;
      AV113Tmaqui1wwds_15_tfmaqvoltop_to = AV92TFMaqVolTop_To ;
      AV114Tmaqui1wwds_16_tfmaqvolres = AV93TFMaqVolRes ;
      AV115Tmaqui1wwds_17_tfmaqvolres_to = AV94TFMaqVolRes_To ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = AV40TFMaqKgsMed ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = AV41TFMaqKgsMed_To ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = AV38TFMaqKgsMin ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = AV39TFMaqKgsMin_To ;
      AV122Tmaqui1wwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV99Tmaqui1wwds_1_filterfulltext ,
                                           AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV100Tmaqui1wwds_2_tfmaqcod ,
                                           AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV102Tmaqui1wwds_4_tfmaqdsc ,
                                           AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV104Tmaqui1wwds_6_tfmaqest ,
                                           AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV106Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV122Tmaqui1wwds_24_tftipmaqcod ,
                                           AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV100Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV102Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV104Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV104Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV106Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV122Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV122Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV124Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08303 */
      pr_default.execute(1, new Object[] {lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV100Tmaqui1wwds_2_tfmaqcod, AV101Tmaqui1wwds_3_tfmaqcod_sel, lV102Tmaqui1wwds_4_tfmaqdsc, AV103Tmaqui1wwds_5_tfmaqdsc_sel, lV104Tmaqui1wwds_6_tfmaqest, AV105Tmaqui1wwds_7_tfmaqest_sel, lV106Tmaqui1wwds_8_tfmaqtintip, AV107Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to), AV116Tmaqui1wwds_18_tfmaqkgsmax, AV117Tmaqui1wwds_19_tfmaqkgsmax_to, AV118Tmaqui1wwds_20_tfmaqkgsmed, AV119Tmaqui1wwds_21_tfmaqkgsmed_to, AV120Tmaqui1wwds_22_tfmaqkgsmin, AV121Tmaqui1wwds_23_tfmaqkgsmin_to, lV122Tmaqui1wwds_24_tftipmaqcod, AV123Tmaqui1wwds_25_tftipmaqcod_sel, lV124Tmaqui1wwds_26_tftipmaqdsc, AV125Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8304 = false ;
         A396EmprCod = P08303_A396EmprCod[0] ;
         A606MaqDsc = P08303_A606MaqDsc[0] ;
         n606MaqDsc = P08303_n606MaqDsc[0] ;
         A1012TipMaqDsc = P08303_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08303_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08303_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08303_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08303_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08303_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08303_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08303_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08303_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08303_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08303_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08303_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08303_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08303_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08303_A624MaqVolMed[0] ;
         n624MaqVolMed = P08303_n624MaqVolMed[0] ;
         A625MaqVolMin = P08303_A625MaqVolMin[0] ;
         n625MaqVolMin = P08303_n625MaqVolMin[0] ;
         A619MaqTinTip = P08303_A619MaqTinTip[0] ;
         n619MaqTinTip = P08303_n619MaqTinTip[0] ;
         A607MaqEst = P08303_A607MaqEst[0] ;
         n607MaqEst = P08303_n607MaqEst[0] ;
         A602MaqCod = P08303_A602MaqCod[0] ;
         A1012TipMaqDsc = P08303_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08303_n1012TipMaqDsc[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08303_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8304 = false ;
            A396EmprCod = P08303_A396EmprCod[0] ;
            A602MaqCod = P08303_A602MaqCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8304 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV56Option = A606MaqDsc ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8304 )
         {
            brk8304 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQESTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFMaqEst = AV52SearchTxt ;
      AV25TFMaqEst_Sel = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = AV84FilterFullText ;
      AV100Tmaqui1wwds_2_tfmaqcod = AV10TFMaqCod ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV102Tmaqui1wwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV104Tmaqui1wwds_6_tfmaqest = AV24TFMaqEst ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = AV25TFMaqEst_Sel ;
      AV106Tmaqui1wwds_8_tfmaqtintip = AV85TFMaqTinTip ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = AV86TFMaqTinTip_Sel ;
      AV108Tmaqui1wwds_10_tfmaqvolmin = AV87TFMaqVolMin ;
      AV109Tmaqui1wwds_11_tfmaqvolmin_to = AV88TFMaqVolMin_To ;
      AV110Tmaqui1wwds_12_tfmaqvolmed = AV89TFMaqVolMed ;
      AV111Tmaqui1wwds_13_tfmaqvolmed_to = AV90TFMaqVolMed_To ;
      AV112Tmaqui1wwds_14_tfmaqvoltop = AV91TFMaqVolTop ;
      AV113Tmaqui1wwds_15_tfmaqvoltop_to = AV92TFMaqVolTop_To ;
      AV114Tmaqui1wwds_16_tfmaqvolres = AV93TFMaqVolRes ;
      AV115Tmaqui1wwds_17_tfmaqvolres_to = AV94TFMaqVolRes_To ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = AV40TFMaqKgsMed ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = AV41TFMaqKgsMed_To ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = AV38TFMaqKgsMin ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = AV39TFMaqKgsMin_To ;
      AV122Tmaqui1wwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV99Tmaqui1wwds_1_filterfulltext ,
                                           AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV100Tmaqui1wwds_2_tfmaqcod ,
                                           AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV102Tmaqui1wwds_4_tfmaqdsc ,
                                           AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV104Tmaqui1wwds_6_tfmaqest ,
                                           AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV106Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV122Tmaqui1wwds_24_tftipmaqcod ,
                                           AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV100Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV102Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV104Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV104Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV106Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV122Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV122Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV124Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08304 */
      pr_default.execute(2, new Object[] {lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV100Tmaqui1wwds_2_tfmaqcod, AV101Tmaqui1wwds_3_tfmaqcod_sel, lV102Tmaqui1wwds_4_tfmaqdsc, AV103Tmaqui1wwds_5_tfmaqdsc_sel, lV104Tmaqui1wwds_6_tfmaqest, AV105Tmaqui1wwds_7_tfmaqest_sel, lV106Tmaqui1wwds_8_tfmaqtintip, AV107Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to), AV116Tmaqui1wwds_18_tfmaqkgsmax, AV117Tmaqui1wwds_19_tfmaqkgsmax_to, AV118Tmaqui1wwds_20_tfmaqkgsmed, AV119Tmaqui1wwds_21_tfmaqkgsmed_to, AV120Tmaqui1wwds_22_tfmaqkgsmin, AV121Tmaqui1wwds_23_tfmaqkgsmin_to, lV122Tmaqui1wwds_24_tftipmaqcod, AV123Tmaqui1wwds_25_tftipmaqcod_sel, lV124Tmaqui1wwds_26_tftipmaqdsc, AV125Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8306 = false ;
         A396EmprCod = P08304_A396EmprCod[0] ;
         A607MaqEst = P08304_A607MaqEst[0] ;
         n607MaqEst = P08304_n607MaqEst[0] ;
         A1012TipMaqDsc = P08304_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08304_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08304_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08304_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08304_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08304_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08304_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08304_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08304_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08304_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08304_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08304_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08304_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08304_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08304_A624MaqVolMed[0] ;
         n624MaqVolMed = P08304_n624MaqVolMed[0] ;
         A625MaqVolMin = P08304_A625MaqVolMin[0] ;
         n625MaqVolMin = P08304_n625MaqVolMin[0] ;
         A619MaqTinTip = P08304_A619MaqTinTip[0] ;
         n619MaqTinTip = P08304_n619MaqTinTip[0] ;
         A606MaqDsc = P08304_A606MaqDsc[0] ;
         n606MaqDsc = P08304_n606MaqDsc[0] ;
         A602MaqCod = P08304_A602MaqCod[0] ;
         A1012TipMaqDsc = P08304_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08304_n1012TipMaqDsc[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08304_A607MaqEst[0], A607MaqEst) == 0 ) )
         {
            brk8306 = false ;
            A396EmprCod = P08304_A396EmprCod[0] ;
            A602MaqCod = P08304_A602MaqCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8306 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A607MaqEst)==0) )
         {
            AV56Option = A607MaqEst ;
            AV59OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A607MaqEst, "@!"))) ;
            AV57Options.add(AV56Option, 0);
            AV60OptionsDesc.add(AV59OptionDesc, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8306 )
         {
            brk8306 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQTINTIPOPTIONS' Routine */
      returnInSub = false ;
      AV85TFMaqTinTip = AV52SearchTxt ;
      AV86TFMaqTinTip_Sel = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = AV84FilterFullText ;
      AV100Tmaqui1wwds_2_tfmaqcod = AV10TFMaqCod ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV102Tmaqui1wwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV104Tmaqui1wwds_6_tfmaqest = AV24TFMaqEst ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = AV25TFMaqEst_Sel ;
      AV106Tmaqui1wwds_8_tfmaqtintip = AV85TFMaqTinTip ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = AV86TFMaqTinTip_Sel ;
      AV108Tmaqui1wwds_10_tfmaqvolmin = AV87TFMaqVolMin ;
      AV109Tmaqui1wwds_11_tfmaqvolmin_to = AV88TFMaqVolMin_To ;
      AV110Tmaqui1wwds_12_tfmaqvolmed = AV89TFMaqVolMed ;
      AV111Tmaqui1wwds_13_tfmaqvolmed_to = AV90TFMaqVolMed_To ;
      AV112Tmaqui1wwds_14_tfmaqvoltop = AV91TFMaqVolTop ;
      AV113Tmaqui1wwds_15_tfmaqvoltop_to = AV92TFMaqVolTop_To ;
      AV114Tmaqui1wwds_16_tfmaqvolres = AV93TFMaqVolRes ;
      AV115Tmaqui1wwds_17_tfmaqvolres_to = AV94TFMaqVolRes_To ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = AV40TFMaqKgsMed ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = AV41TFMaqKgsMed_To ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = AV38TFMaqKgsMin ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = AV39TFMaqKgsMin_To ;
      AV122Tmaqui1wwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV99Tmaqui1wwds_1_filterfulltext ,
                                           AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV100Tmaqui1wwds_2_tfmaqcod ,
                                           AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV102Tmaqui1wwds_4_tfmaqdsc ,
                                           AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV104Tmaqui1wwds_6_tfmaqest ,
                                           AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV106Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV122Tmaqui1wwds_24_tftipmaqcod ,
                                           AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV100Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV102Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV104Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV104Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV106Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV122Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV122Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV124Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08305 */
      pr_default.execute(3, new Object[] {lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV100Tmaqui1wwds_2_tfmaqcod, AV101Tmaqui1wwds_3_tfmaqcod_sel, lV102Tmaqui1wwds_4_tfmaqdsc, AV103Tmaqui1wwds_5_tfmaqdsc_sel, lV104Tmaqui1wwds_6_tfmaqest, AV105Tmaqui1wwds_7_tfmaqest_sel, lV106Tmaqui1wwds_8_tfmaqtintip, AV107Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to), AV116Tmaqui1wwds_18_tfmaqkgsmax, AV117Tmaqui1wwds_19_tfmaqkgsmax_to, AV118Tmaqui1wwds_20_tfmaqkgsmed, AV119Tmaqui1wwds_21_tfmaqkgsmed_to, AV120Tmaqui1wwds_22_tfmaqkgsmin, AV121Tmaqui1wwds_23_tfmaqkgsmin_to, lV122Tmaqui1wwds_24_tftipmaqcod, AV123Tmaqui1wwds_25_tftipmaqcod_sel, lV124Tmaqui1wwds_26_tftipmaqdsc, AV125Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8308 = false ;
         A396EmprCod = P08305_A396EmprCod[0] ;
         A619MaqTinTip = P08305_A619MaqTinTip[0] ;
         n619MaqTinTip = P08305_n619MaqTinTip[0] ;
         A1012TipMaqDsc = P08305_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08305_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08305_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08305_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08305_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08305_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08305_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08305_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08305_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08305_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08305_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08305_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08305_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08305_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08305_A624MaqVolMed[0] ;
         n624MaqVolMed = P08305_n624MaqVolMed[0] ;
         A625MaqVolMin = P08305_A625MaqVolMin[0] ;
         n625MaqVolMin = P08305_n625MaqVolMin[0] ;
         A607MaqEst = P08305_A607MaqEst[0] ;
         n607MaqEst = P08305_n607MaqEst[0] ;
         A606MaqDsc = P08305_A606MaqDsc[0] ;
         n606MaqDsc = P08305_n606MaqDsc[0] ;
         A602MaqCod = P08305_A602MaqCod[0] ;
         A1012TipMaqDsc = P08305_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08305_n1012TipMaqDsc[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08305_A619MaqTinTip[0], A619MaqTinTip) == 0 ) )
         {
            brk8308 = false ;
            A396EmprCod = P08305_A396EmprCod[0] ;
            A602MaqCod = P08305_A602MaqCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk8308 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A619MaqTinTip)==0) )
         {
            AV56Option = A619MaqTinTip ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8308 )
         {
            brk8308 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTIPMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFTipMaqCod = AV52SearchTxt ;
      AV33TFTipMaqCod_Sel = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = AV84FilterFullText ;
      AV100Tmaqui1wwds_2_tfmaqcod = AV10TFMaqCod ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV102Tmaqui1wwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV104Tmaqui1wwds_6_tfmaqest = AV24TFMaqEst ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = AV25TFMaqEst_Sel ;
      AV106Tmaqui1wwds_8_tfmaqtintip = AV85TFMaqTinTip ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = AV86TFMaqTinTip_Sel ;
      AV108Tmaqui1wwds_10_tfmaqvolmin = AV87TFMaqVolMin ;
      AV109Tmaqui1wwds_11_tfmaqvolmin_to = AV88TFMaqVolMin_To ;
      AV110Tmaqui1wwds_12_tfmaqvolmed = AV89TFMaqVolMed ;
      AV111Tmaqui1wwds_13_tfmaqvolmed_to = AV90TFMaqVolMed_To ;
      AV112Tmaqui1wwds_14_tfmaqvoltop = AV91TFMaqVolTop ;
      AV113Tmaqui1wwds_15_tfmaqvoltop_to = AV92TFMaqVolTop_To ;
      AV114Tmaqui1wwds_16_tfmaqvolres = AV93TFMaqVolRes ;
      AV115Tmaqui1wwds_17_tfmaqvolres_to = AV94TFMaqVolRes_To ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = AV40TFMaqKgsMed ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = AV41TFMaqKgsMed_To ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = AV38TFMaqKgsMin ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = AV39TFMaqKgsMin_To ;
      AV122Tmaqui1wwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV99Tmaqui1wwds_1_filterfulltext ,
                                           AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV100Tmaqui1wwds_2_tfmaqcod ,
                                           AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV102Tmaqui1wwds_4_tfmaqdsc ,
                                           AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV104Tmaqui1wwds_6_tfmaqest ,
                                           AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV106Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV122Tmaqui1wwds_24_tftipmaqcod ,
                                           AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV100Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV102Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV104Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV104Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV106Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV122Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV122Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV124Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08306 */
      pr_default.execute(4, new Object[] {lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV100Tmaqui1wwds_2_tfmaqcod, AV101Tmaqui1wwds_3_tfmaqcod_sel, lV102Tmaqui1wwds_4_tfmaqdsc, AV103Tmaqui1wwds_5_tfmaqdsc_sel, lV104Tmaqui1wwds_6_tfmaqest, AV105Tmaqui1wwds_7_tfmaqest_sel, lV106Tmaqui1wwds_8_tfmaqtintip, AV107Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to), AV116Tmaqui1wwds_18_tfmaqkgsmax, AV117Tmaqui1wwds_19_tfmaqkgsmax_to, AV118Tmaqui1wwds_20_tfmaqkgsmed, AV119Tmaqui1wwds_21_tfmaqkgsmed_to, AV120Tmaqui1wwds_22_tfmaqkgsmin, AV121Tmaqui1wwds_23_tfmaqkgsmin_to, lV122Tmaqui1wwds_24_tftipmaqcod, AV123Tmaqui1wwds_25_tftipmaqcod_sel, lV124Tmaqui1wwds_26_tftipmaqdsc, AV125Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk83010 = false ;
         A396EmprCod = P08306_A396EmprCod[0] ;
         A1011TipMaqCod = P08306_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08306_n1011TipMaqCod[0] ;
         A1012TipMaqDsc = P08306_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08306_n1012TipMaqDsc[0] ;
         A4283MaqKgsMin = P08306_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08306_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08306_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08306_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08306_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08306_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08306_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08306_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08306_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08306_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08306_A624MaqVolMed[0] ;
         n624MaqVolMed = P08306_n624MaqVolMed[0] ;
         A625MaqVolMin = P08306_A625MaqVolMin[0] ;
         n625MaqVolMin = P08306_n625MaqVolMin[0] ;
         A619MaqTinTip = P08306_A619MaqTinTip[0] ;
         n619MaqTinTip = P08306_n619MaqTinTip[0] ;
         A607MaqEst = P08306_A607MaqEst[0] ;
         n607MaqEst = P08306_n607MaqEst[0] ;
         A606MaqDsc = P08306_A606MaqDsc[0] ;
         n606MaqDsc = P08306_n606MaqDsc[0] ;
         A602MaqCod = P08306_A602MaqCod[0] ;
         A1012TipMaqDsc = P08306_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08306_n1012TipMaqDsc[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08306_A1011TipMaqCod[0], A1011TipMaqCod) == 0 ) )
         {
            brk83010 = false ;
            A396EmprCod = P08306_A396EmprCod[0] ;
            A602MaqCod = P08306_A602MaqCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk83010 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1011TipMaqCod)==0) )
         {
            AV56Option = A1011TipMaqCod ;
            AV57Options.add(AV56Option, 0);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83010 )
         {
            brk83010 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADTIPMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFTipMaqDsc = AV52SearchTxt ;
      AV35TFTipMaqDsc_Sel = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = AV84FilterFullText ;
      AV100Tmaqui1wwds_2_tfmaqcod = AV10TFMaqCod ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV102Tmaqui1wwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV104Tmaqui1wwds_6_tfmaqest = AV24TFMaqEst ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = AV25TFMaqEst_Sel ;
      AV106Tmaqui1wwds_8_tfmaqtintip = AV85TFMaqTinTip ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = AV86TFMaqTinTip_Sel ;
      AV108Tmaqui1wwds_10_tfmaqvolmin = AV87TFMaqVolMin ;
      AV109Tmaqui1wwds_11_tfmaqvolmin_to = AV88TFMaqVolMin_To ;
      AV110Tmaqui1wwds_12_tfmaqvolmed = AV89TFMaqVolMed ;
      AV111Tmaqui1wwds_13_tfmaqvolmed_to = AV90TFMaqVolMed_To ;
      AV112Tmaqui1wwds_14_tfmaqvoltop = AV91TFMaqVolTop ;
      AV113Tmaqui1wwds_15_tfmaqvoltop_to = AV92TFMaqVolTop_To ;
      AV114Tmaqui1wwds_16_tfmaqvolres = AV93TFMaqVolRes ;
      AV115Tmaqui1wwds_17_tfmaqvolres_to = AV94TFMaqVolRes_To ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = AV40TFMaqKgsMed ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = AV41TFMaqKgsMed_To ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = AV38TFMaqKgsMin ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = AV39TFMaqKgsMin_To ;
      AV122Tmaqui1wwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV99Tmaqui1wwds_1_filterfulltext ,
                                           AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV100Tmaqui1wwds_2_tfmaqcod ,
                                           AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV102Tmaqui1wwds_4_tfmaqdsc ,
                                           AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV104Tmaqui1wwds_6_tfmaqest ,
                                           AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV106Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV122Tmaqui1wwds_24_tftipmaqcod ,
                                           AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV99Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV99Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV100Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV100Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV102Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV102Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV104Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV104Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV106Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV106Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV122Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV122Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV124Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08307 */
      pr_default.execute(5, new Object[] {lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV99Tmaqui1wwds_1_filterfulltext, lV100Tmaqui1wwds_2_tfmaqcod, AV101Tmaqui1wwds_3_tfmaqcod_sel, lV102Tmaqui1wwds_4_tfmaqdsc, AV103Tmaqui1wwds_5_tfmaqdsc_sel, lV104Tmaqui1wwds_6_tfmaqest, AV105Tmaqui1wwds_7_tfmaqest_sel, lV106Tmaqui1wwds_8_tfmaqtintip, AV107Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV108Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV109Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV110Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV111Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV112Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV113Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV114Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV115Tmaqui1wwds_17_tfmaqvolres_to), AV116Tmaqui1wwds_18_tfmaqkgsmax, AV117Tmaqui1wwds_19_tfmaqkgsmax_to, AV118Tmaqui1wwds_20_tfmaqkgsmed, AV119Tmaqui1wwds_21_tfmaqkgsmed_to, AV120Tmaqui1wwds_22_tfmaqkgsmin, AV121Tmaqui1wwds_23_tfmaqkgsmin_to, lV122Tmaqui1wwds_24_tftipmaqcod, AV123Tmaqui1wwds_25_tftipmaqcod_sel, lV124Tmaqui1wwds_26_tftipmaqdsc, AV125Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk83012 = false ;
         A1011TipMaqCod = P08307_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08307_n1011TipMaqCod[0] ;
         A396EmprCod = P08307_A396EmprCod[0] ;
         A1012TipMaqDsc = P08307_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08307_n1012TipMaqDsc[0] ;
         A4283MaqKgsMin = P08307_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08307_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08307_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08307_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08307_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08307_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08307_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08307_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08307_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08307_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08307_A624MaqVolMed[0] ;
         n624MaqVolMed = P08307_n624MaqVolMed[0] ;
         A625MaqVolMin = P08307_A625MaqVolMin[0] ;
         n625MaqVolMin = P08307_n625MaqVolMin[0] ;
         A619MaqTinTip = P08307_A619MaqTinTip[0] ;
         n619MaqTinTip = P08307_n619MaqTinTip[0] ;
         A607MaqEst = P08307_A607MaqEst[0] ;
         n607MaqEst = P08307_n607MaqEst[0] ;
         A606MaqDsc = P08307_A606MaqDsc[0] ;
         n606MaqDsc = P08307_n606MaqDsc[0] ;
         A602MaqCod = P08307_A602MaqCod[0] ;
         A1012TipMaqDsc = P08307_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08307_n1012TipMaqDsc[0] ;
         AV64count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08307_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08307_A1011TipMaqCod[0], A1011TipMaqCod) == 0 ) )
         {
            brk83012 = false ;
            A602MaqCod = P08307_A602MaqCod[0] ;
            AV64count = (long)(AV64count+1) ;
            brk83012 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A1012TipMaqDsc)==0) )
         {
            AV56Option = A1012TipMaqDsc ;
            AV55InsertIndex = 1 ;
            while ( ( AV55InsertIndex <= AV57Options.size() ) && ( GXutil.strcmp((String)AV57Options.elementAt(-1+AV55InsertIndex), AV56Option) < 0 ) )
            {
               AV55InsertIndex = (int)(AV55InsertIndex+1) ;
            }
            AV57Options.add(AV56Option, AV55InsertIndex);
            AV62OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV64count), "Z,ZZZ,ZZZ,ZZ9")), AV55InsertIndex);
         }
         if ( AV57Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83012 )
         {
            brk83012 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmaqui1wwgetfilterdata.this.AV58OptionsJson;
      this.aP4[0] = tmaqui1wwgetfilterdata.this.AV61OptionsDescJson;
      this.aP5[0] = tmaqui1wwgetfilterdata.this.AV63OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV58OptionsJson = "" ;
      AV61OptionsDescJson = "" ;
      AV63OptionIndexesJson = "" ;
      AV57Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV65Session = httpContext.getWebSession();
      AV67GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV68GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV84FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFMaqDsc = "" ;
      AV13TFMaqDsc_Sel = "" ;
      AV24TFMaqEst = "" ;
      AV25TFMaqEst_Sel = "" ;
      AV85TFMaqTinTip = "" ;
      AV86TFMaqTinTip_Sel = "" ;
      AV42TFMaqKgsMax = DecimalUtil.ZERO ;
      AV43TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV40TFMaqKgsMed = DecimalUtil.ZERO ;
      AV41TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV38TFMaqKgsMin = DecimalUtil.ZERO ;
      AV39TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV32TFTipMaqCod = "" ;
      AV33TFTipMaqCod_Sel = "" ;
      AV34TFTipMaqDsc = "" ;
      AV35TFTipMaqDsc_Sel = "" ;
      A602MaqCod = "" ;
      AV99Tmaqui1wwds_1_filterfulltext = "" ;
      AV100Tmaqui1wwds_2_tfmaqcod = "" ;
      AV101Tmaqui1wwds_3_tfmaqcod_sel = "" ;
      AV102Tmaqui1wwds_4_tfmaqdsc = "" ;
      AV103Tmaqui1wwds_5_tfmaqdsc_sel = "" ;
      AV104Tmaqui1wwds_6_tfmaqest = "" ;
      AV105Tmaqui1wwds_7_tfmaqest_sel = "" ;
      AV106Tmaqui1wwds_8_tfmaqtintip = "" ;
      AV107Tmaqui1wwds_9_tfmaqtintip_sel = "" ;
      AV116Tmaqui1wwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV117Tmaqui1wwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV118Tmaqui1wwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV119Tmaqui1wwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV120Tmaqui1wwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV121Tmaqui1wwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV122Tmaqui1wwds_24_tftipmaqcod = "" ;
      AV123Tmaqui1wwds_25_tftipmaqcod_sel = "" ;
      AV124Tmaqui1wwds_26_tftipmaqdsc = "" ;
      AV125Tmaqui1wwds_27_tftipmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV99Tmaqui1wwds_1_filterfulltext = "" ;
      lV100Tmaqui1wwds_2_tfmaqcod = "" ;
      lV102Tmaqui1wwds_4_tfmaqdsc = "" ;
      lV104Tmaqui1wwds_6_tfmaqest = "" ;
      lV106Tmaqui1wwds_8_tfmaqtintip = "" ;
      lV122Tmaqui1wwds_24_tftipmaqcod = "" ;
      lV124Tmaqui1wwds_26_tftipmaqdsc = "" ;
      A606MaqDsc = "" ;
      A607MaqEst = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      P08302_A396EmprCod = new String[] {""} ;
      P08302_A602MaqCod = new String[] {""} ;
      P08302_A1012TipMaqDsc = new String[] {""} ;
      P08302_n1012TipMaqDsc = new boolean[] {false} ;
      P08302_A1011TipMaqCod = new String[] {""} ;
      P08302_n1011TipMaqCod = new boolean[] {false} ;
      P08302_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08302_n4283MaqKgsMin = new boolean[] {false} ;
      P08302_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08302_n4284MaqKgsMed = new boolean[] {false} ;
      P08302_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08302_n4285MaqKgsMax = new boolean[] {false} ;
      P08302_A2801MaqVolRes = new int[1] ;
      P08302_n2801MaqVolRes = new boolean[] {false} ;
      P08302_A2802MaqVolTop = new int[1] ;
      P08302_n2802MaqVolTop = new boolean[] {false} ;
      P08302_A624MaqVolMed = new int[1] ;
      P08302_n624MaqVolMed = new boolean[] {false} ;
      P08302_A625MaqVolMin = new int[1] ;
      P08302_n625MaqVolMin = new boolean[] {false} ;
      P08302_A619MaqTinTip = new String[] {""} ;
      P08302_n619MaqTinTip = new boolean[] {false} ;
      P08302_A607MaqEst = new String[] {""} ;
      P08302_n607MaqEst = new boolean[] {false} ;
      P08302_A606MaqDsc = new String[] {""} ;
      P08302_n606MaqDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV56Option = "" ;
      P08303_A396EmprCod = new String[] {""} ;
      P08303_A606MaqDsc = new String[] {""} ;
      P08303_n606MaqDsc = new boolean[] {false} ;
      P08303_A1012TipMaqDsc = new String[] {""} ;
      P08303_n1012TipMaqDsc = new boolean[] {false} ;
      P08303_A1011TipMaqCod = new String[] {""} ;
      P08303_n1011TipMaqCod = new boolean[] {false} ;
      P08303_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08303_n4283MaqKgsMin = new boolean[] {false} ;
      P08303_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08303_n4284MaqKgsMed = new boolean[] {false} ;
      P08303_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08303_n4285MaqKgsMax = new boolean[] {false} ;
      P08303_A2801MaqVolRes = new int[1] ;
      P08303_n2801MaqVolRes = new boolean[] {false} ;
      P08303_A2802MaqVolTop = new int[1] ;
      P08303_n2802MaqVolTop = new boolean[] {false} ;
      P08303_A624MaqVolMed = new int[1] ;
      P08303_n624MaqVolMed = new boolean[] {false} ;
      P08303_A625MaqVolMin = new int[1] ;
      P08303_n625MaqVolMin = new boolean[] {false} ;
      P08303_A619MaqTinTip = new String[] {""} ;
      P08303_n619MaqTinTip = new boolean[] {false} ;
      P08303_A607MaqEst = new String[] {""} ;
      P08303_n607MaqEst = new boolean[] {false} ;
      P08303_A602MaqCod = new String[] {""} ;
      P08304_A396EmprCod = new String[] {""} ;
      P08304_A607MaqEst = new String[] {""} ;
      P08304_n607MaqEst = new boolean[] {false} ;
      P08304_A1012TipMaqDsc = new String[] {""} ;
      P08304_n1012TipMaqDsc = new boolean[] {false} ;
      P08304_A1011TipMaqCod = new String[] {""} ;
      P08304_n1011TipMaqCod = new boolean[] {false} ;
      P08304_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08304_n4283MaqKgsMin = new boolean[] {false} ;
      P08304_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08304_n4284MaqKgsMed = new boolean[] {false} ;
      P08304_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08304_n4285MaqKgsMax = new boolean[] {false} ;
      P08304_A2801MaqVolRes = new int[1] ;
      P08304_n2801MaqVolRes = new boolean[] {false} ;
      P08304_A2802MaqVolTop = new int[1] ;
      P08304_n2802MaqVolTop = new boolean[] {false} ;
      P08304_A624MaqVolMed = new int[1] ;
      P08304_n624MaqVolMed = new boolean[] {false} ;
      P08304_A625MaqVolMin = new int[1] ;
      P08304_n625MaqVolMin = new boolean[] {false} ;
      P08304_A619MaqTinTip = new String[] {""} ;
      P08304_n619MaqTinTip = new boolean[] {false} ;
      P08304_A606MaqDsc = new String[] {""} ;
      P08304_n606MaqDsc = new boolean[] {false} ;
      P08304_A602MaqCod = new String[] {""} ;
      AV59OptionDesc = "" ;
      P08305_A396EmprCod = new String[] {""} ;
      P08305_A619MaqTinTip = new String[] {""} ;
      P08305_n619MaqTinTip = new boolean[] {false} ;
      P08305_A1012TipMaqDsc = new String[] {""} ;
      P08305_n1012TipMaqDsc = new boolean[] {false} ;
      P08305_A1011TipMaqCod = new String[] {""} ;
      P08305_n1011TipMaqCod = new boolean[] {false} ;
      P08305_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08305_n4283MaqKgsMin = new boolean[] {false} ;
      P08305_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08305_n4284MaqKgsMed = new boolean[] {false} ;
      P08305_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08305_n4285MaqKgsMax = new boolean[] {false} ;
      P08305_A2801MaqVolRes = new int[1] ;
      P08305_n2801MaqVolRes = new boolean[] {false} ;
      P08305_A2802MaqVolTop = new int[1] ;
      P08305_n2802MaqVolTop = new boolean[] {false} ;
      P08305_A624MaqVolMed = new int[1] ;
      P08305_n624MaqVolMed = new boolean[] {false} ;
      P08305_A625MaqVolMin = new int[1] ;
      P08305_n625MaqVolMin = new boolean[] {false} ;
      P08305_A607MaqEst = new String[] {""} ;
      P08305_n607MaqEst = new boolean[] {false} ;
      P08305_A606MaqDsc = new String[] {""} ;
      P08305_n606MaqDsc = new boolean[] {false} ;
      P08305_A602MaqCod = new String[] {""} ;
      P08306_A396EmprCod = new String[] {""} ;
      P08306_A1011TipMaqCod = new String[] {""} ;
      P08306_n1011TipMaqCod = new boolean[] {false} ;
      P08306_A1012TipMaqDsc = new String[] {""} ;
      P08306_n1012TipMaqDsc = new boolean[] {false} ;
      P08306_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08306_n4283MaqKgsMin = new boolean[] {false} ;
      P08306_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08306_n4284MaqKgsMed = new boolean[] {false} ;
      P08306_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08306_n4285MaqKgsMax = new boolean[] {false} ;
      P08306_A2801MaqVolRes = new int[1] ;
      P08306_n2801MaqVolRes = new boolean[] {false} ;
      P08306_A2802MaqVolTop = new int[1] ;
      P08306_n2802MaqVolTop = new boolean[] {false} ;
      P08306_A624MaqVolMed = new int[1] ;
      P08306_n624MaqVolMed = new boolean[] {false} ;
      P08306_A625MaqVolMin = new int[1] ;
      P08306_n625MaqVolMin = new boolean[] {false} ;
      P08306_A619MaqTinTip = new String[] {""} ;
      P08306_n619MaqTinTip = new boolean[] {false} ;
      P08306_A607MaqEst = new String[] {""} ;
      P08306_n607MaqEst = new boolean[] {false} ;
      P08306_A606MaqDsc = new String[] {""} ;
      P08306_n606MaqDsc = new boolean[] {false} ;
      P08306_A602MaqCod = new String[] {""} ;
      P08307_A1011TipMaqCod = new String[] {""} ;
      P08307_n1011TipMaqCod = new boolean[] {false} ;
      P08307_A396EmprCod = new String[] {""} ;
      P08307_A1012TipMaqDsc = new String[] {""} ;
      P08307_n1012TipMaqDsc = new boolean[] {false} ;
      P08307_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08307_n4283MaqKgsMin = new boolean[] {false} ;
      P08307_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08307_n4284MaqKgsMed = new boolean[] {false} ;
      P08307_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08307_n4285MaqKgsMax = new boolean[] {false} ;
      P08307_A2801MaqVolRes = new int[1] ;
      P08307_n2801MaqVolRes = new boolean[] {false} ;
      P08307_A2802MaqVolTop = new int[1] ;
      P08307_n2802MaqVolTop = new boolean[] {false} ;
      P08307_A624MaqVolMed = new int[1] ;
      P08307_n624MaqVolMed = new boolean[] {false} ;
      P08307_A625MaqVolMin = new int[1] ;
      P08307_n625MaqVolMin = new boolean[] {false} ;
      P08307_A619MaqTinTip = new String[] {""} ;
      P08307_n619MaqTinTip = new boolean[] {false} ;
      P08307_A607MaqEst = new String[] {""} ;
      P08307_n607MaqEst = new boolean[] {false} ;
      P08307_A606MaqDsc = new String[] {""} ;
      P08307_n606MaqDsc = new boolean[] {false} ;
      P08307_A602MaqCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08302_A396EmprCod, P08302_A602MaqCod, P08302_A1012TipMaqDsc, P08302_n1012TipMaqDsc, P08302_A1011TipMaqCod, P08302_n1011TipMaqCod, P08302_A4283MaqKgsMin, P08302_n4283MaqKgsMin, P08302_A4284MaqKgsMed, P08302_n4284MaqKgsMed,
            P08302_A4285MaqKgsMax, P08302_n4285MaqKgsMax, P08302_A2801MaqVolRes, P08302_n2801MaqVolRes, P08302_A2802MaqVolTop, P08302_n2802MaqVolTop, P08302_A624MaqVolMed, P08302_n624MaqVolMed, P08302_A625MaqVolMin, P08302_n625MaqVolMin,
            P08302_A619MaqTinTip, P08302_n619MaqTinTip, P08302_A607MaqEst, P08302_n607MaqEst, P08302_A606MaqDsc, P08302_n606MaqDsc
            }
            , new Object[] {
            P08303_A396EmprCod, P08303_A606MaqDsc, P08303_n606MaqDsc, P08303_A1012TipMaqDsc, P08303_n1012TipMaqDsc, P08303_A1011TipMaqCod, P08303_n1011TipMaqCod, P08303_A4283MaqKgsMin, P08303_n4283MaqKgsMin, P08303_A4284MaqKgsMed,
            P08303_n4284MaqKgsMed, P08303_A4285MaqKgsMax, P08303_n4285MaqKgsMax, P08303_A2801MaqVolRes, P08303_n2801MaqVolRes, P08303_A2802MaqVolTop, P08303_n2802MaqVolTop, P08303_A624MaqVolMed, P08303_n624MaqVolMed, P08303_A625MaqVolMin,
            P08303_n625MaqVolMin, P08303_A619MaqTinTip, P08303_n619MaqTinTip, P08303_A607MaqEst, P08303_n607MaqEst, P08303_A602MaqCod
            }
            , new Object[] {
            P08304_A396EmprCod, P08304_A607MaqEst, P08304_n607MaqEst, P08304_A1012TipMaqDsc, P08304_n1012TipMaqDsc, P08304_A1011TipMaqCod, P08304_n1011TipMaqCod, P08304_A4283MaqKgsMin, P08304_n4283MaqKgsMin, P08304_A4284MaqKgsMed,
            P08304_n4284MaqKgsMed, P08304_A4285MaqKgsMax, P08304_n4285MaqKgsMax, P08304_A2801MaqVolRes, P08304_n2801MaqVolRes, P08304_A2802MaqVolTop, P08304_n2802MaqVolTop, P08304_A624MaqVolMed, P08304_n624MaqVolMed, P08304_A625MaqVolMin,
            P08304_n625MaqVolMin, P08304_A619MaqTinTip, P08304_n619MaqTinTip, P08304_A606MaqDsc, P08304_n606MaqDsc, P08304_A602MaqCod
            }
            , new Object[] {
            P08305_A396EmprCod, P08305_A619MaqTinTip, P08305_n619MaqTinTip, P08305_A1012TipMaqDsc, P08305_n1012TipMaqDsc, P08305_A1011TipMaqCod, P08305_n1011TipMaqCod, P08305_A4283MaqKgsMin, P08305_n4283MaqKgsMin, P08305_A4284MaqKgsMed,
            P08305_n4284MaqKgsMed, P08305_A4285MaqKgsMax, P08305_n4285MaqKgsMax, P08305_A2801MaqVolRes, P08305_n2801MaqVolRes, P08305_A2802MaqVolTop, P08305_n2802MaqVolTop, P08305_A624MaqVolMed, P08305_n624MaqVolMed, P08305_A625MaqVolMin,
            P08305_n625MaqVolMin, P08305_A607MaqEst, P08305_n607MaqEst, P08305_A606MaqDsc, P08305_n606MaqDsc, P08305_A602MaqCod
            }
            , new Object[] {
            P08306_A396EmprCod, P08306_A1011TipMaqCod, P08306_n1011TipMaqCod, P08306_A1012TipMaqDsc, P08306_n1012TipMaqDsc, P08306_A4283MaqKgsMin, P08306_n4283MaqKgsMin, P08306_A4284MaqKgsMed, P08306_n4284MaqKgsMed, P08306_A4285MaqKgsMax,
            P08306_n4285MaqKgsMax, P08306_A2801MaqVolRes, P08306_n2801MaqVolRes, P08306_A2802MaqVolTop, P08306_n2802MaqVolTop, P08306_A624MaqVolMed, P08306_n624MaqVolMed, P08306_A625MaqVolMin, P08306_n625MaqVolMin, P08306_A619MaqTinTip,
            P08306_n619MaqTinTip, P08306_A607MaqEst, P08306_n607MaqEst, P08306_A606MaqDsc, P08306_n606MaqDsc, P08306_A602MaqCod
            }
            , new Object[] {
            P08307_A1011TipMaqCod, P08307_n1011TipMaqCod, P08307_A396EmprCod, P08307_A1012TipMaqDsc, P08307_n1012TipMaqDsc, P08307_A4283MaqKgsMin, P08307_n4283MaqKgsMin, P08307_A4284MaqKgsMed, P08307_n4284MaqKgsMed, P08307_A4285MaqKgsMax,
            P08307_n4285MaqKgsMax, P08307_A2801MaqVolRes, P08307_n2801MaqVolRes, P08307_A2802MaqVolTop, P08307_n2802MaqVolTop, P08307_A624MaqVolMed, P08307_n624MaqVolMed, P08307_A625MaqVolMin, P08307_n625MaqVolMin, P08307_A619MaqTinTip,
            P08307_n619MaqTinTip, P08307_A607MaqEst, P08307_n607MaqEst, P08307_A606MaqDsc, P08307_n606MaqDsc, P08307_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV97GXV1 ;
   private int AV87TFMaqVolMin ;
   private int AV88TFMaqVolMin_To ;
   private int AV89TFMaqVolMed ;
   private int AV90TFMaqVolMed_To ;
   private int AV91TFMaqVolTop ;
   private int AV92TFMaqVolTop_To ;
   private int AV93TFMaqVolRes ;
   private int AV94TFMaqVolRes_To ;
   private int AV108Tmaqui1wwds_10_tfmaqvolmin ;
   private int AV109Tmaqui1wwds_11_tfmaqvolmin_to ;
   private int AV110Tmaqui1wwds_12_tfmaqvolmed ;
   private int AV111Tmaqui1wwds_13_tfmaqvolmed_to ;
   private int AV112Tmaqui1wwds_14_tfmaqvoltop ;
   private int AV113Tmaqui1wwds_15_tfmaqvoltop_to ;
   private int AV114Tmaqui1wwds_16_tfmaqvolres ;
   private int AV115Tmaqui1wwds_17_tfmaqvolres_to ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV55InsertIndex ;
   private long AV64count ;
   private java.math.BigDecimal AV42TFMaqKgsMax ;
   private java.math.BigDecimal AV43TFMaqKgsMax_To ;
   private java.math.BigDecimal AV40TFMaqKgsMed ;
   private java.math.BigDecimal AV41TFMaqKgsMed_To ;
   private java.math.BigDecimal AV38TFMaqKgsMin ;
   private java.math.BigDecimal AV39TFMaqKgsMin_To ;
   private java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV12TFMaqDsc ;
   private String AV13TFMaqDsc_Sel ;
   private String AV24TFMaqEst ;
   private String AV25TFMaqEst_Sel ;
   private String AV85TFMaqTinTip ;
   private String AV86TFMaqTinTip_Sel ;
   private String AV32TFTipMaqCod ;
   private String AV33TFTipMaqCod_Sel ;
   private String AV34TFTipMaqDsc ;
   private String AV35TFTipMaqDsc_Sel ;
   private String A602MaqCod ;
   private String AV100Tmaqui1wwds_2_tfmaqcod ;
   private String AV101Tmaqui1wwds_3_tfmaqcod_sel ;
   private String AV102Tmaqui1wwds_4_tfmaqdsc ;
   private String AV103Tmaqui1wwds_5_tfmaqdsc_sel ;
   private String AV104Tmaqui1wwds_6_tfmaqest ;
   private String AV105Tmaqui1wwds_7_tfmaqest_sel ;
   private String AV106Tmaqui1wwds_8_tfmaqtintip ;
   private String AV107Tmaqui1wwds_9_tfmaqtintip_sel ;
   private String AV122Tmaqui1wwds_24_tftipmaqcod ;
   private String AV123Tmaqui1wwds_25_tftipmaqcod_sel ;
   private String AV124Tmaqui1wwds_26_tftipmaqdsc ;
   private String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV100Tmaqui1wwds_2_tfmaqcod ;
   private String lV102Tmaqui1wwds_4_tfmaqdsc ;
   private String lV104Tmaqui1wwds_6_tfmaqest ;
   private String lV106Tmaqui1wwds_8_tfmaqtintip ;
   private String lV122Tmaqui1wwds_24_tftipmaqcod ;
   private String lV124Tmaqui1wwds_26_tftipmaqdsc ;
   private String A606MaqDsc ;
   private String A607MaqEst ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8302 ;
   private boolean n1012TipMaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n4283MaqKgsMin ;
   private boolean n4284MaqKgsMed ;
   private boolean n4285MaqKgsMax ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n619MaqTinTip ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private boolean brk8304 ;
   private boolean brk8306 ;
   private boolean brk8308 ;
   private boolean brk83010 ;
   private boolean brk83012 ;
   private String AV58OptionsJson ;
   private String AV61OptionsDescJson ;
   private String AV63OptionIndexesJson ;
   private String AV54DDOName ;
   private String AV52SearchTxt ;
   private String AV53SearchTxtTo ;
   private String AV84FilterFullText ;
   private String AV99Tmaqui1wwds_1_filterfulltext ;
   private String lV99Tmaqui1wwds_1_filterfulltext ;
   private String AV56Option ;
   private String AV59OptionDesc ;
   private com.genexus.webpanels.WebSession AV65Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08302_A396EmprCod ;
   private String[] P08302_A602MaqCod ;
   private String[] P08302_A1012TipMaqDsc ;
   private boolean[] P08302_n1012TipMaqDsc ;
   private String[] P08302_A1011TipMaqCod ;
   private boolean[] P08302_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08302_A4283MaqKgsMin ;
   private boolean[] P08302_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08302_A4284MaqKgsMed ;
   private boolean[] P08302_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08302_A4285MaqKgsMax ;
   private boolean[] P08302_n4285MaqKgsMax ;
   private int[] P08302_A2801MaqVolRes ;
   private boolean[] P08302_n2801MaqVolRes ;
   private int[] P08302_A2802MaqVolTop ;
   private boolean[] P08302_n2802MaqVolTop ;
   private int[] P08302_A624MaqVolMed ;
   private boolean[] P08302_n624MaqVolMed ;
   private int[] P08302_A625MaqVolMin ;
   private boolean[] P08302_n625MaqVolMin ;
   private String[] P08302_A619MaqTinTip ;
   private boolean[] P08302_n619MaqTinTip ;
   private String[] P08302_A607MaqEst ;
   private boolean[] P08302_n607MaqEst ;
   private String[] P08302_A606MaqDsc ;
   private boolean[] P08302_n606MaqDsc ;
   private String[] P08303_A396EmprCod ;
   private String[] P08303_A606MaqDsc ;
   private boolean[] P08303_n606MaqDsc ;
   private String[] P08303_A1012TipMaqDsc ;
   private boolean[] P08303_n1012TipMaqDsc ;
   private String[] P08303_A1011TipMaqCod ;
   private boolean[] P08303_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08303_A4283MaqKgsMin ;
   private boolean[] P08303_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08303_A4284MaqKgsMed ;
   private boolean[] P08303_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08303_A4285MaqKgsMax ;
   private boolean[] P08303_n4285MaqKgsMax ;
   private int[] P08303_A2801MaqVolRes ;
   private boolean[] P08303_n2801MaqVolRes ;
   private int[] P08303_A2802MaqVolTop ;
   private boolean[] P08303_n2802MaqVolTop ;
   private int[] P08303_A624MaqVolMed ;
   private boolean[] P08303_n624MaqVolMed ;
   private int[] P08303_A625MaqVolMin ;
   private boolean[] P08303_n625MaqVolMin ;
   private String[] P08303_A619MaqTinTip ;
   private boolean[] P08303_n619MaqTinTip ;
   private String[] P08303_A607MaqEst ;
   private boolean[] P08303_n607MaqEst ;
   private String[] P08303_A602MaqCod ;
   private String[] P08304_A396EmprCod ;
   private String[] P08304_A607MaqEst ;
   private boolean[] P08304_n607MaqEst ;
   private String[] P08304_A1012TipMaqDsc ;
   private boolean[] P08304_n1012TipMaqDsc ;
   private String[] P08304_A1011TipMaqCod ;
   private boolean[] P08304_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08304_A4283MaqKgsMin ;
   private boolean[] P08304_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08304_A4284MaqKgsMed ;
   private boolean[] P08304_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08304_A4285MaqKgsMax ;
   private boolean[] P08304_n4285MaqKgsMax ;
   private int[] P08304_A2801MaqVolRes ;
   private boolean[] P08304_n2801MaqVolRes ;
   private int[] P08304_A2802MaqVolTop ;
   private boolean[] P08304_n2802MaqVolTop ;
   private int[] P08304_A624MaqVolMed ;
   private boolean[] P08304_n624MaqVolMed ;
   private int[] P08304_A625MaqVolMin ;
   private boolean[] P08304_n625MaqVolMin ;
   private String[] P08304_A619MaqTinTip ;
   private boolean[] P08304_n619MaqTinTip ;
   private String[] P08304_A606MaqDsc ;
   private boolean[] P08304_n606MaqDsc ;
   private String[] P08304_A602MaqCod ;
   private String[] P08305_A396EmprCod ;
   private String[] P08305_A619MaqTinTip ;
   private boolean[] P08305_n619MaqTinTip ;
   private String[] P08305_A1012TipMaqDsc ;
   private boolean[] P08305_n1012TipMaqDsc ;
   private String[] P08305_A1011TipMaqCod ;
   private boolean[] P08305_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08305_A4283MaqKgsMin ;
   private boolean[] P08305_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08305_A4284MaqKgsMed ;
   private boolean[] P08305_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08305_A4285MaqKgsMax ;
   private boolean[] P08305_n4285MaqKgsMax ;
   private int[] P08305_A2801MaqVolRes ;
   private boolean[] P08305_n2801MaqVolRes ;
   private int[] P08305_A2802MaqVolTop ;
   private boolean[] P08305_n2802MaqVolTop ;
   private int[] P08305_A624MaqVolMed ;
   private boolean[] P08305_n624MaqVolMed ;
   private int[] P08305_A625MaqVolMin ;
   private boolean[] P08305_n625MaqVolMin ;
   private String[] P08305_A607MaqEst ;
   private boolean[] P08305_n607MaqEst ;
   private String[] P08305_A606MaqDsc ;
   private boolean[] P08305_n606MaqDsc ;
   private String[] P08305_A602MaqCod ;
   private String[] P08306_A396EmprCod ;
   private String[] P08306_A1011TipMaqCod ;
   private boolean[] P08306_n1011TipMaqCod ;
   private String[] P08306_A1012TipMaqDsc ;
   private boolean[] P08306_n1012TipMaqDsc ;
   private java.math.BigDecimal[] P08306_A4283MaqKgsMin ;
   private boolean[] P08306_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08306_A4284MaqKgsMed ;
   private boolean[] P08306_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08306_A4285MaqKgsMax ;
   private boolean[] P08306_n4285MaqKgsMax ;
   private int[] P08306_A2801MaqVolRes ;
   private boolean[] P08306_n2801MaqVolRes ;
   private int[] P08306_A2802MaqVolTop ;
   private boolean[] P08306_n2802MaqVolTop ;
   private int[] P08306_A624MaqVolMed ;
   private boolean[] P08306_n624MaqVolMed ;
   private int[] P08306_A625MaqVolMin ;
   private boolean[] P08306_n625MaqVolMin ;
   private String[] P08306_A619MaqTinTip ;
   private boolean[] P08306_n619MaqTinTip ;
   private String[] P08306_A607MaqEst ;
   private boolean[] P08306_n607MaqEst ;
   private String[] P08306_A606MaqDsc ;
   private boolean[] P08306_n606MaqDsc ;
   private String[] P08306_A602MaqCod ;
   private String[] P08307_A1011TipMaqCod ;
   private boolean[] P08307_n1011TipMaqCod ;
   private String[] P08307_A396EmprCod ;
   private String[] P08307_A1012TipMaqDsc ;
   private boolean[] P08307_n1012TipMaqDsc ;
   private java.math.BigDecimal[] P08307_A4283MaqKgsMin ;
   private boolean[] P08307_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08307_A4284MaqKgsMed ;
   private boolean[] P08307_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08307_A4285MaqKgsMax ;
   private boolean[] P08307_n4285MaqKgsMax ;
   private int[] P08307_A2801MaqVolRes ;
   private boolean[] P08307_n2801MaqVolRes ;
   private int[] P08307_A2802MaqVolTop ;
   private boolean[] P08307_n2802MaqVolTop ;
   private int[] P08307_A624MaqVolMed ;
   private boolean[] P08307_n624MaqVolMed ;
   private int[] P08307_A625MaqVolMin ;
   private boolean[] P08307_n625MaqVolMin ;
   private String[] P08307_A619MaqTinTip ;
   private boolean[] P08307_n619MaqTinTip ;
   private String[] P08307_A607MaqEst ;
   private boolean[] P08307_n607MaqEst ;
   private String[] P08307_A606MaqDsc ;
   private boolean[] P08307_n606MaqDsc ;
   private String[] P08307_A602MaqCod ;
   private GXSimpleCollection<String> AV57Options ;
   private GXSimpleCollection<String> AV60OptionsDesc ;
   private GXSimpleCollection<String> AV62OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV67GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV68GridStateFilterValue ;
}

final  class tmaqui1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08302( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tmaqui1wwds_1_filterfulltext ,
                                          String AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV100Tmaqui1wwds_2_tfmaqcod ,
                                          String AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV102Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV104Tmaqui1wwds_6_tfmaqest ,
                                          String AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV106Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV108Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV109Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV110Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV111Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV112Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV113Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV114Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV115Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV122Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqEst, T1.MaqDsc FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV104Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV109Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08303( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tmaqui1wwds_1_filterfulltext ,
                                          String AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV100Tmaqui1wwds_2_tfmaqcod ,
                                          String AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV102Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV104Tmaqui1wwds_6_tfmaqest ,
                                          String AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV106Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV108Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV109Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV110Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV111Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV112Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV113Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV114Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV115Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV122Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[39];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqDsc, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqEst, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV104Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV109Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08304( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tmaqui1wwds_1_filterfulltext ,
                                          String AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV100Tmaqui1wwds_2_tfmaqcod ,
                                          String AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV102Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV104Tmaqui1wwds_6_tfmaqest ,
                                          String AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV106Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV108Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV109Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV110Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV111Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV112Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV113Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV114Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV115Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV122Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[39];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqEst, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV104Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV109Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqEst" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08305( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tmaqui1wwds_1_filterfulltext ,
                                          String AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV100Tmaqui1wwds_2_tfmaqcod ,
                                          String AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV102Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV104Tmaqui1wwds_6_tfmaqest ,
                                          String AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV106Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV108Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV109Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV110Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV111Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV112Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV113Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV114Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV115Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV122Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqTinTip, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqEst," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV104Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV109Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqTinTip" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08306( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tmaqui1wwds_1_filterfulltext ,
                                          String AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV100Tmaqui1wwds_2_tfmaqcod ,
                                          String AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV102Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV104Tmaqui1wwds_6_tfmaqest ,
                                          String AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV106Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV108Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV109Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV110Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV111Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV112Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV113Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV114Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV115Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV122Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[39];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TipMaqCod, T2.TipMaqDsc, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip, T1.MaqEst," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV104Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV109Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TipMaqCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08307( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV99Tmaqui1wwds_1_filterfulltext ,
                                          String AV101Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV100Tmaqui1wwds_2_tfmaqcod ,
                                          String AV103Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV102Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV105Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV104Tmaqui1wwds_6_tfmaqest ,
                                          String AV107Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV106Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV108Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV109Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV110Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV111Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV112Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV113Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV114Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV115Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV116Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV117Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV118Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV119Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV120Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV121Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV123Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV122Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV125Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV124Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[39];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.TipMaqCod, T1.EmprCod, T2.TipMaqDsc, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip, T1.MaqEst," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV99Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV100Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV104Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV106Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV109Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV112Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV122Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipMaqCod" ;
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
                  return conditional_P08302(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_P08303(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 2 :
                  return conditional_P08304(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 3 :
                  return conditional_P08305(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 4 :
                  return conditional_P08306(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 5 :
                  return conditional_P08307(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08302", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08303", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08304", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08305", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08306", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08307", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
      }
   }

}

