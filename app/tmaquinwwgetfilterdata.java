package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaquinwwgetfilterdata extends GXProcedure
{
   public tmaquinwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaquinwwgetfilterdata.class ), "" );
   }

   public tmaquinwwgetfilterdata( int remoteHandle ,
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
      tmaquinwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmaquinwwgetfilterdata.this.AV48DDOName = aP0;
      tmaquinwwgetfilterdata.this.AV49SearchTxt = aP1;
      tmaquinwwgetfilterdata.this.AV50SearchTxtTo = aP2;
      tmaquinwwgetfilterdata.this.aP3 = aP3;
      tmaquinwwgetfilterdata.this.aP4 = aP4;
      tmaquinwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_MAQCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_MAQDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_MAQTINTIP") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQTINTIPOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_TIPMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMAQCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_TIPMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMAQDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV51OptionsJson = AV38Options.toJSonString(false) ;
      AV52OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV41OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("TMAQUINWWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUINWWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("TMAQUINWWGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV12TFMaqDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV13TFMaqDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV14TFMaqTinTip = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV15TFMaqTinTip_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMAX") == 0 )
         {
            AV16TFMaqVolMax = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFMaqVolMax_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV18TFMaqVolMin = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMaqVolMin_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV20TFMaqVolMed = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFMaqVolMed_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV22TFMaqVolTop = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFMaqVolTop_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV24TFMaqVolRes = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFMaqVolRes_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV26TFMaqKgsMax = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFMaqKgsMax_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV28TFMaqKgsMed = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFMaqKgsMed_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV30TFMaqKgsMin = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFMaqKgsMin_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV32TFTipMaqCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV33TFTipMaqCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV34TFTipMaqDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV35TFTipMaqDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV49SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV59Tmaquinwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Tmaquinwwds_2_tfmaqcod = AV10TFMaqCod ;
      AV61Tmaquinwwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV62Tmaquinwwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV63Tmaquinwwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV64Tmaquinwwds_6_tfmaqtintip = AV14TFMaqTinTip ;
      AV65Tmaquinwwds_7_tfmaqtintip_sel = AV15TFMaqTinTip_Sel ;
      AV66Tmaquinwwds_8_tfmaqvolmax = AV16TFMaqVolMax ;
      AV67Tmaquinwwds_9_tfmaqvolmax_to = AV17TFMaqVolMax_To ;
      AV68Tmaquinwwds_10_tfmaqvolmin = AV18TFMaqVolMin ;
      AV69Tmaquinwwds_11_tfmaqvolmin_to = AV19TFMaqVolMin_To ;
      AV70Tmaquinwwds_12_tfmaqvolmed = AV20TFMaqVolMed ;
      AV71Tmaquinwwds_13_tfmaqvolmed_to = AV21TFMaqVolMed_To ;
      AV72Tmaquinwwds_14_tfmaqvoltop = AV22TFMaqVolTop ;
      AV73Tmaquinwwds_15_tfmaqvoltop_to = AV23TFMaqVolTop_To ;
      AV74Tmaquinwwds_16_tfmaqvolres = AV24TFMaqVolRes ;
      AV75Tmaquinwwds_17_tfmaqvolres_to = AV25TFMaqVolRes_To ;
      AV76Tmaquinwwds_18_tfmaqkgsmax = AV26TFMaqKgsMax ;
      AV77Tmaquinwwds_19_tfmaqkgsmax_to = AV27TFMaqKgsMax_To ;
      AV78Tmaquinwwds_20_tfmaqkgsmed = AV28TFMaqKgsMed ;
      AV79Tmaquinwwds_21_tfmaqkgsmed_to = AV29TFMaqKgsMed_To ;
      AV80Tmaquinwwds_22_tfmaqkgsmin = AV30TFMaqKgsMin ;
      AV81Tmaquinwwds_23_tfmaqkgsmin_to = AV31TFMaqKgsMin_To ;
      AV82Tmaquinwwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV83Tmaquinwwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV84Tmaquinwwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV85Tmaquinwwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Tmaquinwwds_1_filterfulltext ,
                                           AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV60Tmaquinwwds_2_tfmaqcod ,
                                           AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV62Tmaquinwwds_4_tfmaqdsc ,
                                           AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV64Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV82Tmaquinwwds_24_tftipmaqcod ,
                                           AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV84Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV60Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV60Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV62Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV62Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV64Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV64Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV82Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV82Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV84Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV84Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7R2 */
      pr_default.execute(0, new Object[] {lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV60Tmaquinwwds_2_tfmaqcod, AV61Tmaquinwwds_3_tfmaqcod_sel, lV62Tmaquinwwds_4_tfmaqdsc, AV63Tmaquinwwds_5_tfmaqdsc_sel, lV64Tmaquinwwds_6_tfmaqtintip, AV65Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to), AV76Tmaquinwwds_18_tfmaqkgsmax, AV77Tmaquinwwds_19_tfmaqkgsmax_to, AV78Tmaquinwwds_20_tfmaqkgsmed, AV79Tmaquinwwds_21_tfmaqkgsmed_to, AV80Tmaquinwwds_22_tfmaqkgsmin, AV81Tmaquinwwds_23_tfmaqkgsmin_to, lV82Tmaquinwwds_24_tftipmaqcod, AV83Tmaquinwwds_25_tftipmaqcod_sel, lV84Tmaquinwwds_26_tftipmaqdsc, AV85Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA7R2 = false ;
         A396EmprCod = P0A7R2_A396EmprCod[0] ;
         A602MaqCod = P0A7R2_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7R2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R2_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P0A7R2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7R2_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P0A7R2_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7R2_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7R2_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7R2_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7R2_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7R2_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7R2_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7R2_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7R2_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7R2_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7R2_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7R2_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7R2_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7R2_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7R2_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7R2_n623MaqVolMax[0] ;
         A619MaqTinTip = P0A7R2_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7R2_n619MaqTinTip[0] ;
         A606MaqDsc = P0A7R2_A606MaqDsc[0] ;
         n606MaqDsc = P0A7R2_n606MaqDsc[0] ;
         A1012TipMaqDsc = P0A7R2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R2_n1012TipMaqDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A7R2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkA7R2 = false ;
            A396EmprCod = P0A7R2_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA7R2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV37Option = A602MaqCod ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7R2 )
         {
            brkA7R2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqDsc = AV49SearchTxt ;
      AV13TFMaqDsc_Sel = "" ;
      AV59Tmaquinwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Tmaquinwwds_2_tfmaqcod = AV10TFMaqCod ;
      AV61Tmaquinwwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV62Tmaquinwwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV63Tmaquinwwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV64Tmaquinwwds_6_tfmaqtintip = AV14TFMaqTinTip ;
      AV65Tmaquinwwds_7_tfmaqtintip_sel = AV15TFMaqTinTip_Sel ;
      AV66Tmaquinwwds_8_tfmaqvolmax = AV16TFMaqVolMax ;
      AV67Tmaquinwwds_9_tfmaqvolmax_to = AV17TFMaqVolMax_To ;
      AV68Tmaquinwwds_10_tfmaqvolmin = AV18TFMaqVolMin ;
      AV69Tmaquinwwds_11_tfmaqvolmin_to = AV19TFMaqVolMin_To ;
      AV70Tmaquinwwds_12_tfmaqvolmed = AV20TFMaqVolMed ;
      AV71Tmaquinwwds_13_tfmaqvolmed_to = AV21TFMaqVolMed_To ;
      AV72Tmaquinwwds_14_tfmaqvoltop = AV22TFMaqVolTop ;
      AV73Tmaquinwwds_15_tfmaqvoltop_to = AV23TFMaqVolTop_To ;
      AV74Tmaquinwwds_16_tfmaqvolres = AV24TFMaqVolRes ;
      AV75Tmaquinwwds_17_tfmaqvolres_to = AV25TFMaqVolRes_To ;
      AV76Tmaquinwwds_18_tfmaqkgsmax = AV26TFMaqKgsMax ;
      AV77Tmaquinwwds_19_tfmaqkgsmax_to = AV27TFMaqKgsMax_To ;
      AV78Tmaquinwwds_20_tfmaqkgsmed = AV28TFMaqKgsMed ;
      AV79Tmaquinwwds_21_tfmaqkgsmed_to = AV29TFMaqKgsMed_To ;
      AV80Tmaquinwwds_22_tfmaqkgsmin = AV30TFMaqKgsMin ;
      AV81Tmaquinwwds_23_tfmaqkgsmin_to = AV31TFMaqKgsMin_To ;
      AV82Tmaquinwwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV83Tmaquinwwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV84Tmaquinwwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV85Tmaquinwwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV59Tmaquinwwds_1_filterfulltext ,
                                           AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV60Tmaquinwwds_2_tfmaqcod ,
                                           AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV62Tmaquinwwds_4_tfmaqdsc ,
                                           AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV64Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV82Tmaquinwwds_24_tftipmaqcod ,
                                           AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV84Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV60Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV60Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV62Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV62Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV64Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV64Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV82Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV82Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV84Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV84Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7R3 */
      pr_default.execute(1, new Object[] {lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV60Tmaquinwwds_2_tfmaqcod, AV61Tmaquinwwds_3_tfmaqcod_sel, lV62Tmaquinwwds_4_tfmaqdsc, AV63Tmaquinwwds_5_tfmaqdsc_sel, lV64Tmaquinwwds_6_tfmaqtintip, AV65Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to), AV76Tmaquinwwds_18_tfmaqkgsmax, AV77Tmaquinwwds_19_tfmaqkgsmax_to, AV78Tmaquinwwds_20_tfmaqkgsmed, AV79Tmaquinwwds_21_tfmaqkgsmed_to, AV80Tmaquinwwds_22_tfmaqkgsmin, AV81Tmaquinwwds_23_tfmaqkgsmin_to, lV82Tmaquinwwds_24_tftipmaqcod, AV83Tmaquinwwds_25_tftipmaqcod_sel, lV84Tmaquinwwds_26_tftipmaqdsc, AV85Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA7R4 = false ;
         A396EmprCod = P0A7R3_A396EmprCod[0] ;
         A606MaqDsc = P0A7R3_A606MaqDsc[0] ;
         n606MaqDsc = P0A7R3_n606MaqDsc[0] ;
         A1012TipMaqDsc = P0A7R3_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R3_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P0A7R3_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7R3_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P0A7R3_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7R3_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7R3_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7R3_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7R3_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7R3_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7R3_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7R3_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7R3_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7R3_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7R3_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7R3_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7R3_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7R3_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7R3_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7R3_n623MaqVolMax[0] ;
         A619MaqTinTip = P0A7R3_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7R3_n619MaqTinTip[0] ;
         A602MaqCod = P0A7R3_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7R3_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R3_n1012TipMaqDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A7R3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brkA7R4 = false ;
            A396EmprCod = P0A7R3_A396EmprCod[0] ;
            A602MaqCod = P0A7R3_A602MaqCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA7R4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV37Option = A606MaqDsc ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7R4 )
         {
            brkA7R4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQTINTIPOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMaqTinTip = AV49SearchTxt ;
      AV15TFMaqTinTip_Sel = "" ;
      AV59Tmaquinwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Tmaquinwwds_2_tfmaqcod = AV10TFMaqCod ;
      AV61Tmaquinwwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV62Tmaquinwwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV63Tmaquinwwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV64Tmaquinwwds_6_tfmaqtintip = AV14TFMaqTinTip ;
      AV65Tmaquinwwds_7_tfmaqtintip_sel = AV15TFMaqTinTip_Sel ;
      AV66Tmaquinwwds_8_tfmaqvolmax = AV16TFMaqVolMax ;
      AV67Tmaquinwwds_9_tfmaqvolmax_to = AV17TFMaqVolMax_To ;
      AV68Tmaquinwwds_10_tfmaqvolmin = AV18TFMaqVolMin ;
      AV69Tmaquinwwds_11_tfmaqvolmin_to = AV19TFMaqVolMin_To ;
      AV70Tmaquinwwds_12_tfmaqvolmed = AV20TFMaqVolMed ;
      AV71Tmaquinwwds_13_tfmaqvolmed_to = AV21TFMaqVolMed_To ;
      AV72Tmaquinwwds_14_tfmaqvoltop = AV22TFMaqVolTop ;
      AV73Tmaquinwwds_15_tfmaqvoltop_to = AV23TFMaqVolTop_To ;
      AV74Tmaquinwwds_16_tfmaqvolres = AV24TFMaqVolRes ;
      AV75Tmaquinwwds_17_tfmaqvolres_to = AV25TFMaqVolRes_To ;
      AV76Tmaquinwwds_18_tfmaqkgsmax = AV26TFMaqKgsMax ;
      AV77Tmaquinwwds_19_tfmaqkgsmax_to = AV27TFMaqKgsMax_To ;
      AV78Tmaquinwwds_20_tfmaqkgsmed = AV28TFMaqKgsMed ;
      AV79Tmaquinwwds_21_tfmaqkgsmed_to = AV29TFMaqKgsMed_To ;
      AV80Tmaquinwwds_22_tfmaqkgsmin = AV30TFMaqKgsMin ;
      AV81Tmaquinwwds_23_tfmaqkgsmin_to = AV31TFMaqKgsMin_To ;
      AV82Tmaquinwwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV83Tmaquinwwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV84Tmaquinwwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV85Tmaquinwwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV59Tmaquinwwds_1_filterfulltext ,
                                           AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV60Tmaquinwwds_2_tfmaqcod ,
                                           AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV62Tmaquinwwds_4_tfmaqdsc ,
                                           AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV64Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV82Tmaquinwwds_24_tftipmaqcod ,
                                           AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV84Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV60Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV60Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV62Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV62Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV64Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV64Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV82Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV82Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV84Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV84Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7R4 */
      pr_default.execute(2, new Object[] {lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV60Tmaquinwwds_2_tfmaqcod, AV61Tmaquinwwds_3_tfmaqcod_sel, lV62Tmaquinwwds_4_tfmaqdsc, AV63Tmaquinwwds_5_tfmaqdsc_sel, lV64Tmaquinwwds_6_tfmaqtintip, AV65Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to), AV76Tmaquinwwds_18_tfmaqkgsmax, AV77Tmaquinwwds_19_tfmaqkgsmax_to, AV78Tmaquinwwds_20_tfmaqkgsmed, AV79Tmaquinwwds_21_tfmaqkgsmed_to, AV80Tmaquinwwds_22_tfmaqkgsmin, AV81Tmaquinwwds_23_tfmaqkgsmin_to, lV82Tmaquinwwds_24_tftipmaqcod, AV83Tmaquinwwds_25_tftipmaqcod_sel, lV84Tmaquinwwds_26_tftipmaqdsc, AV85Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA7R6 = false ;
         A396EmprCod = P0A7R4_A396EmprCod[0] ;
         A619MaqTinTip = P0A7R4_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7R4_n619MaqTinTip[0] ;
         A1012TipMaqDsc = P0A7R4_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R4_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P0A7R4_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7R4_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P0A7R4_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7R4_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7R4_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7R4_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7R4_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7R4_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7R4_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7R4_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7R4_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7R4_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7R4_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7R4_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7R4_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7R4_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7R4_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7R4_n623MaqVolMax[0] ;
         A606MaqDsc = P0A7R4_A606MaqDsc[0] ;
         n606MaqDsc = P0A7R4_n606MaqDsc[0] ;
         A602MaqCod = P0A7R4_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7R4_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R4_n1012TipMaqDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A7R4_A619MaqTinTip[0], A619MaqTinTip) == 0 ) )
         {
            brkA7R6 = false ;
            A396EmprCod = P0A7R4_A396EmprCod[0] ;
            A602MaqCod = P0A7R4_A602MaqCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA7R6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A619MaqTinTip)==0) )
         {
            AV37Option = A619MaqTinTip ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7R6 )
         {
            brkA7R6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTIPMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFTipMaqCod = AV49SearchTxt ;
      AV33TFTipMaqCod_Sel = "" ;
      AV59Tmaquinwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Tmaquinwwds_2_tfmaqcod = AV10TFMaqCod ;
      AV61Tmaquinwwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV62Tmaquinwwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV63Tmaquinwwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV64Tmaquinwwds_6_tfmaqtintip = AV14TFMaqTinTip ;
      AV65Tmaquinwwds_7_tfmaqtintip_sel = AV15TFMaqTinTip_Sel ;
      AV66Tmaquinwwds_8_tfmaqvolmax = AV16TFMaqVolMax ;
      AV67Tmaquinwwds_9_tfmaqvolmax_to = AV17TFMaqVolMax_To ;
      AV68Tmaquinwwds_10_tfmaqvolmin = AV18TFMaqVolMin ;
      AV69Tmaquinwwds_11_tfmaqvolmin_to = AV19TFMaqVolMin_To ;
      AV70Tmaquinwwds_12_tfmaqvolmed = AV20TFMaqVolMed ;
      AV71Tmaquinwwds_13_tfmaqvolmed_to = AV21TFMaqVolMed_To ;
      AV72Tmaquinwwds_14_tfmaqvoltop = AV22TFMaqVolTop ;
      AV73Tmaquinwwds_15_tfmaqvoltop_to = AV23TFMaqVolTop_To ;
      AV74Tmaquinwwds_16_tfmaqvolres = AV24TFMaqVolRes ;
      AV75Tmaquinwwds_17_tfmaqvolres_to = AV25TFMaqVolRes_To ;
      AV76Tmaquinwwds_18_tfmaqkgsmax = AV26TFMaqKgsMax ;
      AV77Tmaquinwwds_19_tfmaqkgsmax_to = AV27TFMaqKgsMax_To ;
      AV78Tmaquinwwds_20_tfmaqkgsmed = AV28TFMaqKgsMed ;
      AV79Tmaquinwwds_21_tfmaqkgsmed_to = AV29TFMaqKgsMed_To ;
      AV80Tmaquinwwds_22_tfmaqkgsmin = AV30TFMaqKgsMin ;
      AV81Tmaquinwwds_23_tfmaqkgsmin_to = AV31TFMaqKgsMin_To ;
      AV82Tmaquinwwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV83Tmaquinwwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV84Tmaquinwwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV85Tmaquinwwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV59Tmaquinwwds_1_filterfulltext ,
                                           AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV60Tmaquinwwds_2_tfmaqcod ,
                                           AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV62Tmaquinwwds_4_tfmaqdsc ,
                                           AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV64Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV82Tmaquinwwds_24_tftipmaqcod ,
                                           AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV84Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV60Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV60Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV62Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV62Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV64Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV64Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV82Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV82Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV84Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV84Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7R5 */
      pr_default.execute(3, new Object[] {lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV60Tmaquinwwds_2_tfmaqcod, AV61Tmaquinwwds_3_tfmaqcod_sel, lV62Tmaquinwwds_4_tfmaqdsc, AV63Tmaquinwwds_5_tfmaqdsc_sel, lV64Tmaquinwwds_6_tfmaqtintip, AV65Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to), AV76Tmaquinwwds_18_tfmaqkgsmax, AV77Tmaquinwwds_19_tfmaqkgsmax_to, AV78Tmaquinwwds_20_tfmaqkgsmed, AV79Tmaquinwwds_21_tfmaqkgsmed_to, AV80Tmaquinwwds_22_tfmaqkgsmin, AV81Tmaquinwwds_23_tfmaqkgsmin_to, lV82Tmaquinwwds_24_tftipmaqcod, AV83Tmaquinwwds_25_tftipmaqcod_sel, lV84Tmaquinwwds_26_tftipmaqdsc, AV85Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA7R8 = false ;
         A396EmprCod = P0A7R5_A396EmprCod[0] ;
         A1011TipMaqCod = P0A7R5_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7R5_n1011TipMaqCod[0] ;
         A1012TipMaqDsc = P0A7R5_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R5_n1012TipMaqDsc[0] ;
         A4283MaqKgsMin = P0A7R5_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7R5_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7R5_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7R5_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7R5_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7R5_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7R5_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7R5_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7R5_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7R5_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7R5_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7R5_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7R5_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7R5_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7R5_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7R5_n623MaqVolMax[0] ;
         A619MaqTinTip = P0A7R5_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7R5_n619MaqTinTip[0] ;
         A606MaqDsc = P0A7R5_A606MaqDsc[0] ;
         n606MaqDsc = P0A7R5_n606MaqDsc[0] ;
         A602MaqCod = P0A7R5_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7R5_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R5_n1012TipMaqDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A7R5_A1011TipMaqCod[0], A1011TipMaqCod) == 0 ) )
         {
            brkA7R8 = false ;
            A396EmprCod = P0A7R5_A396EmprCod[0] ;
            A602MaqCod = P0A7R5_A602MaqCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA7R8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1011TipMaqCod)==0) )
         {
            AV37Option = A1011TipMaqCod ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7R8 )
         {
            brkA7R8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTIPMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFTipMaqDsc = AV49SearchTxt ;
      AV35TFTipMaqDsc_Sel = "" ;
      AV59Tmaquinwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Tmaquinwwds_2_tfmaqcod = AV10TFMaqCod ;
      AV61Tmaquinwwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV62Tmaquinwwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV63Tmaquinwwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV64Tmaquinwwds_6_tfmaqtintip = AV14TFMaqTinTip ;
      AV65Tmaquinwwds_7_tfmaqtintip_sel = AV15TFMaqTinTip_Sel ;
      AV66Tmaquinwwds_8_tfmaqvolmax = AV16TFMaqVolMax ;
      AV67Tmaquinwwds_9_tfmaqvolmax_to = AV17TFMaqVolMax_To ;
      AV68Tmaquinwwds_10_tfmaqvolmin = AV18TFMaqVolMin ;
      AV69Tmaquinwwds_11_tfmaqvolmin_to = AV19TFMaqVolMin_To ;
      AV70Tmaquinwwds_12_tfmaqvolmed = AV20TFMaqVolMed ;
      AV71Tmaquinwwds_13_tfmaqvolmed_to = AV21TFMaqVolMed_To ;
      AV72Tmaquinwwds_14_tfmaqvoltop = AV22TFMaqVolTop ;
      AV73Tmaquinwwds_15_tfmaqvoltop_to = AV23TFMaqVolTop_To ;
      AV74Tmaquinwwds_16_tfmaqvolres = AV24TFMaqVolRes ;
      AV75Tmaquinwwds_17_tfmaqvolres_to = AV25TFMaqVolRes_To ;
      AV76Tmaquinwwds_18_tfmaqkgsmax = AV26TFMaqKgsMax ;
      AV77Tmaquinwwds_19_tfmaqkgsmax_to = AV27TFMaqKgsMax_To ;
      AV78Tmaquinwwds_20_tfmaqkgsmed = AV28TFMaqKgsMed ;
      AV79Tmaquinwwds_21_tfmaqkgsmed_to = AV29TFMaqKgsMed_To ;
      AV80Tmaquinwwds_22_tfmaqkgsmin = AV30TFMaqKgsMin ;
      AV81Tmaquinwwds_23_tfmaqkgsmin_to = AV31TFMaqKgsMin_To ;
      AV82Tmaquinwwds_24_tftipmaqcod = AV32TFTipMaqCod ;
      AV83Tmaquinwwds_25_tftipmaqcod_sel = AV33TFTipMaqCod_Sel ;
      AV84Tmaquinwwds_26_tftipmaqdsc = AV34TFTipMaqDsc ;
      AV85Tmaquinwwds_27_tftipmaqdsc_sel = AV35TFTipMaqDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV59Tmaquinwwds_1_filterfulltext ,
                                           AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV60Tmaquinwwds_2_tfmaqcod ,
                                           AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV62Tmaquinwwds_4_tfmaqdsc ,
                                           AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV64Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV82Tmaquinwwds_24_tftipmaqcod ,
                                           AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV84Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV59Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV60Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV60Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV62Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV62Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV64Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV64Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV82Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV82Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV84Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV84Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7R6 */
      pr_default.execute(4, new Object[] {lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV59Tmaquinwwds_1_filterfulltext, lV60Tmaquinwwds_2_tfmaqcod, AV61Tmaquinwwds_3_tfmaqcod_sel, lV62Tmaquinwwds_4_tfmaqdsc, AV63Tmaquinwwds_5_tfmaqdsc_sel, lV64Tmaquinwwds_6_tfmaqtintip, AV65Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV66Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV67Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV68Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV69Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV70Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV71Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV72Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV73Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV74Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV75Tmaquinwwds_17_tfmaqvolres_to), AV76Tmaquinwwds_18_tfmaqkgsmax, AV77Tmaquinwwds_19_tfmaqkgsmax_to, AV78Tmaquinwwds_20_tfmaqkgsmed, AV79Tmaquinwwds_21_tfmaqkgsmed_to, AV80Tmaquinwwds_22_tfmaqkgsmin, AV81Tmaquinwwds_23_tfmaqkgsmin_to, lV82Tmaquinwwds_24_tftipmaqcod, AV83Tmaquinwwds_25_tftipmaqcod_sel, lV84Tmaquinwwds_26_tftipmaqdsc, AV85Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA7R10 = false ;
         A1011TipMaqCod = P0A7R6_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7R6_n1011TipMaqCod[0] ;
         A396EmprCod = P0A7R6_A396EmprCod[0] ;
         A1012TipMaqDsc = P0A7R6_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R6_n1012TipMaqDsc[0] ;
         A4283MaqKgsMin = P0A7R6_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7R6_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7R6_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7R6_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7R6_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7R6_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7R6_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7R6_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7R6_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7R6_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7R6_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7R6_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7R6_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7R6_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7R6_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7R6_n623MaqVolMax[0] ;
         A619MaqTinTip = P0A7R6_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7R6_n619MaqTinTip[0] ;
         A606MaqDsc = P0A7R6_A606MaqDsc[0] ;
         n606MaqDsc = P0A7R6_n606MaqDsc[0] ;
         A602MaqCod = P0A7R6_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7R6_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7R6_n1012TipMaqDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A7R6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A7R6_A1011TipMaqCod[0], A1011TipMaqCod) == 0 ) )
         {
            brkA7R10 = false ;
            A602MaqCod = P0A7R6_A602MaqCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brkA7R10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1012TipMaqDsc)==0) )
         {
            AV37Option = A1012TipMaqDsc ;
            AV36InsertIndex = 1 ;
            while ( ( AV36InsertIndex <= AV38Options.size() ) && ( GXutil.strcmp((String)AV38Options.elementAt(-1+AV36InsertIndex), AV37Option) < 0 ) )
            {
               AV36InsertIndex = (int)(AV36InsertIndex+1) ;
            }
            AV38Options.add(AV37Option, AV36InsertIndex);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV36InsertIndex);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7R10 )
         {
            brkA7R10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmaquinwwgetfilterdata.this.AV51OptionsJson;
      this.aP4[0] = tmaquinwwgetfilterdata.this.AV52OptionsDescJson;
      this.aP5[0] = tmaquinwwgetfilterdata.this.AV53OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51OptionsJson = "" ;
      AV52OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV38Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFMaqDsc = "" ;
      AV13TFMaqDsc_Sel = "" ;
      AV14TFMaqTinTip = "" ;
      AV15TFMaqTinTip_Sel = "" ;
      AV26TFMaqKgsMax = DecimalUtil.ZERO ;
      AV27TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV28TFMaqKgsMed = DecimalUtil.ZERO ;
      AV29TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV30TFMaqKgsMin = DecimalUtil.ZERO ;
      AV31TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV32TFTipMaqCod = "" ;
      AV33TFTipMaqCod_Sel = "" ;
      AV34TFTipMaqDsc = "" ;
      AV35TFTipMaqDsc_Sel = "" ;
      A602MaqCod = "" ;
      AV59Tmaquinwwds_1_filterfulltext = "" ;
      AV60Tmaquinwwds_2_tfmaqcod = "" ;
      AV61Tmaquinwwds_3_tfmaqcod_sel = "" ;
      AV62Tmaquinwwds_4_tfmaqdsc = "" ;
      AV63Tmaquinwwds_5_tfmaqdsc_sel = "" ;
      AV64Tmaquinwwds_6_tfmaqtintip = "" ;
      AV65Tmaquinwwds_7_tfmaqtintip_sel = "" ;
      AV76Tmaquinwwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV77Tmaquinwwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV78Tmaquinwwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV79Tmaquinwwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV80Tmaquinwwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV81Tmaquinwwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV82Tmaquinwwds_24_tftipmaqcod = "" ;
      AV83Tmaquinwwds_25_tftipmaqcod_sel = "" ;
      AV84Tmaquinwwds_26_tftipmaqdsc = "" ;
      AV85Tmaquinwwds_27_tftipmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV59Tmaquinwwds_1_filterfulltext = "" ;
      lV60Tmaquinwwds_2_tfmaqcod = "" ;
      lV62Tmaquinwwds_4_tfmaqdsc = "" ;
      lV64Tmaquinwwds_6_tfmaqtintip = "" ;
      lV82Tmaquinwwds_24_tftipmaqcod = "" ;
      lV84Tmaquinwwds_26_tftipmaqdsc = "" ;
      A606MaqDsc = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      P0A7R2_A396EmprCod = new String[] {""} ;
      P0A7R2_A602MaqCod = new String[] {""} ;
      P0A7R2_A1012TipMaqDsc = new String[] {""} ;
      P0A7R2_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7R2_A1011TipMaqCod = new String[] {""} ;
      P0A7R2_n1011TipMaqCod = new boolean[] {false} ;
      P0A7R2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R2_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7R2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R2_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7R2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R2_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7R2_A2801MaqVolRes = new int[1] ;
      P0A7R2_n2801MaqVolRes = new boolean[] {false} ;
      P0A7R2_A2802MaqVolTop = new int[1] ;
      P0A7R2_n2802MaqVolTop = new boolean[] {false} ;
      P0A7R2_A624MaqVolMed = new int[1] ;
      P0A7R2_n624MaqVolMed = new boolean[] {false} ;
      P0A7R2_A625MaqVolMin = new int[1] ;
      P0A7R2_n625MaqVolMin = new boolean[] {false} ;
      P0A7R2_A623MaqVolMax = new int[1] ;
      P0A7R2_n623MaqVolMax = new boolean[] {false} ;
      P0A7R2_A619MaqTinTip = new String[] {""} ;
      P0A7R2_n619MaqTinTip = new boolean[] {false} ;
      P0A7R2_A606MaqDsc = new String[] {""} ;
      P0A7R2_n606MaqDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV37Option = "" ;
      P0A7R3_A396EmprCod = new String[] {""} ;
      P0A7R3_A606MaqDsc = new String[] {""} ;
      P0A7R3_n606MaqDsc = new boolean[] {false} ;
      P0A7R3_A1012TipMaqDsc = new String[] {""} ;
      P0A7R3_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7R3_A1011TipMaqCod = new String[] {""} ;
      P0A7R3_n1011TipMaqCod = new boolean[] {false} ;
      P0A7R3_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R3_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7R3_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R3_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7R3_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R3_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7R3_A2801MaqVolRes = new int[1] ;
      P0A7R3_n2801MaqVolRes = new boolean[] {false} ;
      P0A7R3_A2802MaqVolTop = new int[1] ;
      P0A7R3_n2802MaqVolTop = new boolean[] {false} ;
      P0A7R3_A624MaqVolMed = new int[1] ;
      P0A7R3_n624MaqVolMed = new boolean[] {false} ;
      P0A7R3_A625MaqVolMin = new int[1] ;
      P0A7R3_n625MaqVolMin = new boolean[] {false} ;
      P0A7R3_A623MaqVolMax = new int[1] ;
      P0A7R3_n623MaqVolMax = new boolean[] {false} ;
      P0A7R3_A619MaqTinTip = new String[] {""} ;
      P0A7R3_n619MaqTinTip = new boolean[] {false} ;
      P0A7R3_A602MaqCod = new String[] {""} ;
      P0A7R4_A396EmprCod = new String[] {""} ;
      P0A7R4_A619MaqTinTip = new String[] {""} ;
      P0A7R4_n619MaqTinTip = new boolean[] {false} ;
      P0A7R4_A1012TipMaqDsc = new String[] {""} ;
      P0A7R4_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7R4_A1011TipMaqCod = new String[] {""} ;
      P0A7R4_n1011TipMaqCod = new boolean[] {false} ;
      P0A7R4_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R4_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7R4_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R4_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7R4_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R4_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7R4_A2801MaqVolRes = new int[1] ;
      P0A7R4_n2801MaqVolRes = new boolean[] {false} ;
      P0A7R4_A2802MaqVolTop = new int[1] ;
      P0A7R4_n2802MaqVolTop = new boolean[] {false} ;
      P0A7R4_A624MaqVolMed = new int[1] ;
      P0A7R4_n624MaqVolMed = new boolean[] {false} ;
      P0A7R4_A625MaqVolMin = new int[1] ;
      P0A7R4_n625MaqVolMin = new boolean[] {false} ;
      P0A7R4_A623MaqVolMax = new int[1] ;
      P0A7R4_n623MaqVolMax = new boolean[] {false} ;
      P0A7R4_A606MaqDsc = new String[] {""} ;
      P0A7R4_n606MaqDsc = new boolean[] {false} ;
      P0A7R4_A602MaqCod = new String[] {""} ;
      P0A7R5_A396EmprCod = new String[] {""} ;
      P0A7R5_A1011TipMaqCod = new String[] {""} ;
      P0A7R5_n1011TipMaqCod = new boolean[] {false} ;
      P0A7R5_A1012TipMaqDsc = new String[] {""} ;
      P0A7R5_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7R5_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R5_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7R5_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R5_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7R5_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R5_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7R5_A2801MaqVolRes = new int[1] ;
      P0A7R5_n2801MaqVolRes = new boolean[] {false} ;
      P0A7R5_A2802MaqVolTop = new int[1] ;
      P0A7R5_n2802MaqVolTop = new boolean[] {false} ;
      P0A7R5_A624MaqVolMed = new int[1] ;
      P0A7R5_n624MaqVolMed = new boolean[] {false} ;
      P0A7R5_A625MaqVolMin = new int[1] ;
      P0A7R5_n625MaqVolMin = new boolean[] {false} ;
      P0A7R5_A623MaqVolMax = new int[1] ;
      P0A7R5_n623MaqVolMax = new boolean[] {false} ;
      P0A7R5_A619MaqTinTip = new String[] {""} ;
      P0A7R5_n619MaqTinTip = new boolean[] {false} ;
      P0A7R5_A606MaqDsc = new String[] {""} ;
      P0A7R5_n606MaqDsc = new boolean[] {false} ;
      P0A7R5_A602MaqCod = new String[] {""} ;
      P0A7R6_A1011TipMaqCod = new String[] {""} ;
      P0A7R6_n1011TipMaqCod = new boolean[] {false} ;
      P0A7R6_A396EmprCod = new String[] {""} ;
      P0A7R6_A1012TipMaqDsc = new String[] {""} ;
      P0A7R6_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7R6_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R6_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7R6_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R6_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7R6_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7R6_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7R6_A2801MaqVolRes = new int[1] ;
      P0A7R6_n2801MaqVolRes = new boolean[] {false} ;
      P0A7R6_A2802MaqVolTop = new int[1] ;
      P0A7R6_n2802MaqVolTop = new boolean[] {false} ;
      P0A7R6_A624MaqVolMed = new int[1] ;
      P0A7R6_n624MaqVolMed = new boolean[] {false} ;
      P0A7R6_A625MaqVolMin = new int[1] ;
      P0A7R6_n625MaqVolMin = new boolean[] {false} ;
      P0A7R6_A623MaqVolMax = new int[1] ;
      P0A7R6_n623MaqVolMax = new boolean[] {false} ;
      P0A7R6_A619MaqTinTip = new String[] {""} ;
      P0A7R6_n619MaqTinTip = new boolean[] {false} ;
      P0A7R6_A606MaqDsc = new String[] {""} ;
      P0A7R6_n606MaqDsc = new boolean[] {false} ;
      P0A7R6_A602MaqCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaquinwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A7R2_A396EmprCod, P0A7R2_A602MaqCod, P0A7R2_A1012TipMaqDsc, P0A7R2_n1012TipMaqDsc, P0A7R2_A1011TipMaqCod, P0A7R2_n1011TipMaqCod, P0A7R2_A4283MaqKgsMin, P0A7R2_n4283MaqKgsMin, P0A7R2_A4284MaqKgsMed, P0A7R2_n4284MaqKgsMed,
            P0A7R2_A4285MaqKgsMax, P0A7R2_n4285MaqKgsMax, P0A7R2_A2801MaqVolRes, P0A7R2_n2801MaqVolRes, P0A7R2_A2802MaqVolTop, P0A7R2_n2802MaqVolTop, P0A7R2_A624MaqVolMed, P0A7R2_n624MaqVolMed, P0A7R2_A625MaqVolMin, P0A7R2_n625MaqVolMin,
            P0A7R2_A623MaqVolMax, P0A7R2_n623MaqVolMax, P0A7R2_A619MaqTinTip, P0A7R2_n619MaqTinTip, P0A7R2_A606MaqDsc, P0A7R2_n606MaqDsc
            }
            , new Object[] {
            P0A7R3_A396EmprCod, P0A7R3_A606MaqDsc, P0A7R3_n606MaqDsc, P0A7R3_A1012TipMaqDsc, P0A7R3_n1012TipMaqDsc, P0A7R3_A1011TipMaqCod, P0A7R3_n1011TipMaqCod, P0A7R3_A4283MaqKgsMin, P0A7R3_n4283MaqKgsMin, P0A7R3_A4284MaqKgsMed,
            P0A7R3_n4284MaqKgsMed, P0A7R3_A4285MaqKgsMax, P0A7R3_n4285MaqKgsMax, P0A7R3_A2801MaqVolRes, P0A7R3_n2801MaqVolRes, P0A7R3_A2802MaqVolTop, P0A7R3_n2802MaqVolTop, P0A7R3_A624MaqVolMed, P0A7R3_n624MaqVolMed, P0A7R3_A625MaqVolMin,
            P0A7R3_n625MaqVolMin, P0A7R3_A623MaqVolMax, P0A7R3_n623MaqVolMax, P0A7R3_A619MaqTinTip, P0A7R3_n619MaqTinTip, P0A7R3_A602MaqCod
            }
            , new Object[] {
            P0A7R4_A396EmprCod, P0A7R4_A619MaqTinTip, P0A7R4_n619MaqTinTip, P0A7R4_A1012TipMaqDsc, P0A7R4_n1012TipMaqDsc, P0A7R4_A1011TipMaqCod, P0A7R4_n1011TipMaqCod, P0A7R4_A4283MaqKgsMin, P0A7R4_n4283MaqKgsMin, P0A7R4_A4284MaqKgsMed,
            P0A7R4_n4284MaqKgsMed, P0A7R4_A4285MaqKgsMax, P0A7R4_n4285MaqKgsMax, P0A7R4_A2801MaqVolRes, P0A7R4_n2801MaqVolRes, P0A7R4_A2802MaqVolTop, P0A7R4_n2802MaqVolTop, P0A7R4_A624MaqVolMed, P0A7R4_n624MaqVolMed, P0A7R4_A625MaqVolMin,
            P0A7R4_n625MaqVolMin, P0A7R4_A623MaqVolMax, P0A7R4_n623MaqVolMax, P0A7R4_A606MaqDsc, P0A7R4_n606MaqDsc, P0A7R4_A602MaqCod
            }
            , new Object[] {
            P0A7R5_A396EmprCod, P0A7R5_A1011TipMaqCod, P0A7R5_n1011TipMaqCod, P0A7R5_A1012TipMaqDsc, P0A7R5_n1012TipMaqDsc, P0A7R5_A4283MaqKgsMin, P0A7R5_n4283MaqKgsMin, P0A7R5_A4284MaqKgsMed, P0A7R5_n4284MaqKgsMed, P0A7R5_A4285MaqKgsMax,
            P0A7R5_n4285MaqKgsMax, P0A7R5_A2801MaqVolRes, P0A7R5_n2801MaqVolRes, P0A7R5_A2802MaqVolTop, P0A7R5_n2802MaqVolTop, P0A7R5_A624MaqVolMed, P0A7R5_n624MaqVolMed, P0A7R5_A625MaqVolMin, P0A7R5_n625MaqVolMin, P0A7R5_A623MaqVolMax,
            P0A7R5_n623MaqVolMax, P0A7R5_A619MaqTinTip, P0A7R5_n619MaqTinTip, P0A7R5_A606MaqDsc, P0A7R5_n606MaqDsc, P0A7R5_A602MaqCod
            }
            , new Object[] {
            P0A7R6_A1011TipMaqCod, P0A7R6_n1011TipMaqCod, P0A7R6_A396EmprCod, P0A7R6_A1012TipMaqDsc, P0A7R6_n1012TipMaqDsc, P0A7R6_A4283MaqKgsMin, P0A7R6_n4283MaqKgsMin, P0A7R6_A4284MaqKgsMed, P0A7R6_n4284MaqKgsMed, P0A7R6_A4285MaqKgsMax,
            P0A7R6_n4285MaqKgsMax, P0A7R6_A2801MaqVolRes, P0A7R6_n2801MaqVolRes, P0A7R6_A2802MaqVolTop, P0A7R6_n2802MaqVolTop, P0A7R6_A624MaqVolMed, P0A7R6_n624MaqVolMed, P0A7R6_A625MaqVolMin, P0A7R6_n625MaqVolMin, P0A7R6_A623MaqVolMax,
            P0A7R6_n623MaqVolMax, P0A7R6_A619MaqTinTip, P0A7R6_n619MaqTinTip, P0A7R6_A606MaqDsc, P0A7R6_n606MaqDsc, P0A7R6_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV16TFMaqVolMax ;
   private int AV17TFMaqVolMax_To ;
   private int AV18TFMaqVolMin ;
   private int AV19TFMaqVolMin_To ;
   private int AV20TFMaqVolMed ;
   private int AV21TFMaqVolMed_To ;
   private int AV22TFMaqVolTop ;
   private int AV23TFMaqVolTop_To ;
   private int AV24TFMaqVolRes ;
   private int AV25TFMaqVolRes_To ;
   private int AV66Tmaquinwwds_8_tfmaqvolmax ;
   private int AV67Tmaquinwwds_9_tfmaqvolmax_to ;
   private int AV68Tmaquinwwds_10_tfmaqvolmin ;
   private int AV69Tmaquinwwds_11_tfmaqvolmin_to ;
   private int AV70Tmaquinwwds_12_tfmaqvolmed ;
   private int AV71Tmaquinwwds_13_tfmaqvolmed_to ;
   private int AV72Tmaquinwwds_14_tfmaqvoltop ;
   private int AV73Tmaquinwwds_15_tfmaqvoltop_to ;
   private int AV74Tmaquinwwds_16_tfmaqvolres ;
   private int AV75Tmaquinwwds_17_tfmaqvolres_to ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV36InsertIndex ;
   private long AV42count ;
   private java.math.BigDecimal AV26TFMaqKgsMax ;
   private java.math.BigDecimal AV27TFMaqKgsMax_To ;
   private java.math.BigDecimal AV28TFMaqKgsMed ;
   private java.math.BigDecimal AV29TFMaqKgsMed_To ;
   private java.math.BigDecimal AV30TFMaqKgsMin ;
   private java.math.BigDecimal AV31TFMaqKgsMin_To ;
   private java.math.BigDecimal AV76Tmaquinwwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV77Tmaquinwwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV78Tmaquinwwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV79Tmaquinwwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV80Tmaquinwwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV81Tmaquinwwds_23_tfmaqkgsmin_to ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV12TFMaqDsc ;
   private String AV13TFMaqDsc_Sel ;
   private String AV14TFMaqTinTip ;
   private String AV15TFMaqTinTip_Sel ;
   private String AV32TFTipMaqCod ;
   private String AV33TFTipMaqCod_Sel ;
   private String AV34TFTipMaqDsc ;
   private String AV35TFTipMaqDsc_Sel ;
   private String A602MaqCod ;
   private String AV60Tmaquinwwds_2_tfmaqcod ;
   private String AV61Tmaquinwwds_3_tfmaqcod_sel ;
   private String AV62Tmaquinwwds_4_tfmaqdsc ;
   private String AV63Tmaquinwwds_5_tfmaqdsc_sel ;
   private String AV64Tmaquinwwds_6_tfmaqtintip ;
   private String AV65Tmaquinwwds_7_tfmaqtintip_sel ;
   private String AV82Tmaquinwwds_24_tftipmaqcod ;
   private String AV83Tmaquinwwds_25_tftipmaqcod_sel ;
   private String AV84Tmaquinwwds_26_tftipmaqdsc ;
   private String AV85Tmaquinwwds_27_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV60Tmaquinwwds_2_tfmaqcod ;
   private String lV62Tmaquinwwds_4_tfmaqdsc ;
   private String lV64Tmaquinwwds_6_tfmaqtintip ;
   private String lV82Tmaquinwwds_24_tftipmaqcod ;
   private String lV84Tmaquinwwds_26_tftipmaqdsc ;
   private String A606MaqDsc ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA7R2 ;
   private boolean n1012TipMaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n4283MaqKgsMin ;
   private boolean n4284MaqKgsMed ;
   private boolean n4285MaqKgsMax ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
   private boolean n619MaqTinTip ;
   private boolean n606MaqDsc ;
   private boolean brkA7R4 ;
   private boolean brkA7R6 ;
   private boolean brkA7R8 ;
   private boolean brkA7R10 ;
   private String AV51OptionsJson ;
   private String AV52OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV48DDOName ;
   private String AV49SearchTxt ;
   private String AV50SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV59Tmaquinwwds_1_filterfulltext ;
   private String lV59Tmaquinwwds_1_filterfulltext ;
   private String AV37Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7R2_A396EmprCod ;
   private String[] P0A7R2_A602MaqCod ;
   private String[] P0A7R2_A1012TipMaqDsc ;
   private boolean[] P0A7R2_n1012TipMaqDsc ;
   private String[] P0A7R2_A1011TipMaqCod ;
   private boolean[] P0A7R2_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0A7R2_A4283MaqKgsMin ;
   private boolean[] P0A7R2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7R2_A4284MaqKgsMed ;
   private boolean[] P0A7R2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7R2_A4285MaqKgsMax ;
   private boolean[] P0A7R2_n4285MaqKgsMax ;
   private int[] P0A7R2_A2801MaqVolRes ;
   private boolean[] P0A7R2_n2801MaqVolRes ;
   private int[] P0A7R2_A2802MaqVolTop ;
   private boolean[] P0A7R2_n2802MaqVolTop ;
   private int[] P0A7R2_A624MaqVolMed ;
   private boolean[] P0A7R2_n624MaqVolMed ;
   private int[] P0A7R2_A625MaqVolMin ;
   private boolean[] P0A7R2_n625MaqVolMin ;
   private int[] P0A7R2_A623MaqVolMax ;
   private boolean[] P0A7R2_n623MaqVolMax ;
   private String[] P0A7R2_A619MaqTinTip ;
   private boolean[] P0A7R2_n619MaqTinTip ;
   private String[] P0A7R2_A606MaqDsc ;
   private boolean[] P0A7R2_n606MaqDsc ;
   private String[] P0A7R3_A396EmprCod ;
   private String[] P0A7R3_A606MaqDsc ;
   private boolean[] P0A7R3_n606MaqDsc ;
   private String[] P0A7R3_A1012TipMaqDsc ;
   private boolean[] P0A7R3_n1012TipMaqDsc ;
   private String[] P0A7R3_A1011TipMaqCod ;
   private boolean[] P0A7R3_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0A7R3_A4283MaqKgsMin ;
   private boolean[] P0A7R3_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7R3_A4284MaqKgsMed ;
   private boolean[] P0A7R3_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7R3_A4285MaqKgsMax ;
   private boolean[] P0A7R3_n4285MaqKgsMax ;
   private int[] P0A7R3_A2801MaqVolRes ;
   private boolean[] P0A7R3_n2801MaqVolRes ;
   private int[] P0A7R3_A2802MaqVolTop ;
   private boolean[] P0A7R3_n2802MaqVolTop ;
   private int[] P0A7R3_A624MaqVolMed ;
   private boolean[] P0A7R3_n624MaqVolMed ;
   private int[] P0A7R3_A625MaqVolMin ;
   private boolean[] P0A7R3_n625MaqVolMin ;
   private int[] P0A7R3_A623MaqVolMax ;
   private boolean[] P0A7R3_n623MaqVolMax ;
   private String[] P0A7R3_A619MaqTinTip ;
   private boolean[] P0A7R3_n619MaqTinTip ;
   private String[] P0A7R3_A602MaqCod ;
   private String[] P0A7R4_A396EmprCod ;
   private String[] P0A7R4_A619MaqTinTip ;
   private boolean[] P0A7R4_n619MaqTinTip ;
   private String[] P0A7R4_A1012TipMaqDsc ;
   private boolean[] P0A7R4_n1012TipMaqDsc ;
   private String[] P0A7R4_A1011TipMaqCod ;
   private boolean[] P0A7R4_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0A7R4_A4283MaqKgsMin ;
   private boolean[] P0A7R4_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7R4_A4284MaqKgsMed ;
   private boolean[] P0A7R4_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7R4_A4285MaqKgsMax ;
   private boolean[] P0A7R4_n4285MaqKgsMax ;
   private int[] P0A7R4_A2801MaqVolRes ;
   private boolean[] P0A7R4_n2801MaqVolRes ;
   private int[] P0A7R4_A2802MaqVolTop ;
   private boolean[] P0A7R4_n2802MaqVolTop ;
   private int[] P0A7R4_A624MaqVolMed ;
   private boolean[] P0A7R4_n624MaqVolMed ;
   private int[] P0A7R4_A625MaqVolMin ;
   private boolean[] P0A7R4_n625MaqVolMin ;
   private int[] P0A7R4_A623MaqVolMax ;
   private boolean[] P0A7R4_n623MaqVolMax ;
   private String[] P0A7R4_A606MaqDsc ;
   private boolean[] P0A7R4_n606MaqDsc ;
   private String[] P0A7R4_A602MaqCod ;
   private String[] P0A7R5_A396EmprCod ;
   private String[] P0A7R5_A1011TipMaqCod ;
   private boolean[] P0A7R5_n1011TipMaqCod ;
   private String[] P0A7R5_A1012TipMaqDsc ;
   private boolean[] P0A7R5_n1012TipMaqDsc ;
   private java.math.BigDecimal[] P0A7R5_A4283MaqKgsMin ;
   private boolean[] P0A7R5_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7R5_A4284MaqKgsMed ;
   private boolean[] P0A7R5_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7R5_A4285MaqKgsMax ;
   private boolean[] P0A7R5_n4285MaqKgsMax ;
   private int[] P0A7R5_A2801MaqVolRes ;
   private boolean[] P0A7R5_n2801MaqVolRes ;
   private int[] P0A7R5_A2802MaqVolTop ;
   private boolean[] P0A7R5_n2802MaqVolTop ;
   private int[] P0A7R5_A624MaqVolMed ;
   private boolean[] P0A7R5_n624MaqVolMed ;
   private int[] P0A7R5_A625MaqVolMin ;
   private boolean[] P0A7R5_n625MaqVolMin ;
   private int[] P0A7R5_A623MaqVolMax ;
   private boolean[] P0A7R5_n623MaqVolMax ;
   private String[] P0A7R5_A619MaqTinTip ;
   private boolean[] P0A7R5_n619MaqTinTip ;
   private String[] P0A7R5_A606MaqDsc ;
   private boolean[] P0A7R5_n606MaqDsc ;
   private String[] P0A7R5_A602MaqCod ;
   private String[] P0A7R6_A1011TipMaqCod ;
   private boolean[] P0A7R6_n1011TipMaqCod ;
   private String[] P0A7R6_A396EmprCod ;
   private String[] P0A7R6_A1012TipMaqDsc ;
   private boolean[] P0A7R6_n1012TipMaqDsc ;
   private java.math.BigDecimal[] P0A7R6_A4283MaqKgsMin ;
   private boolean[] P0A7R6_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7R6_A4284MaqKgsMed ;
   private boolean[] P0A7R6_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7R6_A4285MaqKgsMax ;
   private boolean[] P0A7R6_n4285MaqKgsMax ;
   private int[] P0A7R6_A2801MaqVolRes ;
   private boolean[] P0A7R6_n2801MaqVolRes ;
   private int[] P0A7R6_A2802MaqVolTop ;
   private boolean[] P0A7R6_n2802MaqVolTop ;
   private int[] P0A7R6_A624MaqVolMed ;
   private boolean[] P0A7R6_n624MaqVolMed ;
   private int[] P0A7R6_A625MaqVolMin ;
   private boolean[] P0A7R6_n625MaqVolMin ;
   private int[] P0A7R6_A623MaqVolMax ;
   private boolean[] P0A7R6_n623MaqVolMax ;
   private String[] P0A7R6_A619MaqTinTip ;
   private boolean[] P0A7R6_n619MaqTinTip ;
   private String[] P0A7R6_A606MaqDsc ;
   private boolean[] P0A7R6_n606MaqDsc ;
   private String[] P0A7R6_A602MaqCod ;
   private GXSimpleCollection<String> AV38Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV41OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class tmaquinwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A7R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Tmaquinwwds_1_filterfulltext ,
                                          String AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV60Tmaquinwwds_2_tfmaqcod ,
                                          String AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV62Tmaquinwwds_4_tfmaqdsc ,
                                          String AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV64Tmaquinwwds_6_tfmaqtintip ,
                                          int AV66Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV67Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV68Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV69Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV70Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV71Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV72Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV73Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV74Tmaquinwwds_16_tfmaqvolres ,
                                          int AV75Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV82Tmaquinwwds_24_tftipmaqcod ,
                                          String AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV84Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax," ;
      scmdbuf += " T1.MaqTinTip, T1.MaqDsc FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV59Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV64Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
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

   protected Object[] conditional_P0A7R3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Tmaquinwwds_1_filterfulltext ,
                                          String AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV60Tmaquinwwds_2_tfmaqcod ,
                                          String AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV62Tmaquinwwds_4_tfmaqdsc ,
                                          String AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV64Tmaquinwwds_6_tfmaqtintip ,
                                          int AV66Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV67Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV68Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV69Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV70Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV71Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV72Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV73Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV74Tmaquinwwds_16_tfmaqvolres ,
                                          int AV75Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV82Tmaquinwwds_24_tftipmaqcod ,
                                          String AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV84Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.EmprCod, T1.MaqDsc, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax," ;
      scmdbuf += " T1.MaqTinTip, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV59Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV64Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
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

   protected Object[] conditional_P0A7R4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Tmaquinwwds_1_filterfulltext ,
                                          String AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV60Tmaquinwwds_2_tfmaqcod ,
                                          String AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV62Tmaquinwwds_4_tfmaqdsc ,
                                          String AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV64Tmaquinwwds_6_tfmaqtintip ,
                                          int AV66Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV67Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV68Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV69Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV70Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV71Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV72Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV73Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV74Tmaquinwwds_16_tfmaqvolres ,
                                          int AV75Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV82Tmaquinwwds_24_tftipmaqcod ,
                                          String AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV84Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.EmprCod, T1.MaqTinTip, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV59Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV64Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqTinTip" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A7R5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Tmaquinwwds_1_filterfulltext ,
                                          String AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV60Tmaquinwwds_2_tfmaqcod ,
                                          String AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV62Tmaquinwwds_4_tfmaqdsc ,
                                          String AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV64Tmaquinwwds_6_tfmaqtintip ,
                                          int AV66Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV67Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV68Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV69Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV70Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV71Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV72Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV73Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV74Tmaquinwwds_16_tfmaqvolres ,
                                          int AV75Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV82Tmaquinwwds_24_tftipmaqcod ,
                                          String AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV84Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.EmprCod, T1.TipMaqCod, T2.TipMaqDsc, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV59Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV64Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TipMaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A7R6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Tmaquinwwds_1_filterfulltext ,
                                          String AV61Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV60Tmaquinwwds_2_tfmaqcod ,
                                          String AV63Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV62Tmaquinwwds_4_tfmaqdsc ,
                                          String AV65Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV64Tmaquinwwds_6_tfmaqtintip ,
                                          int AV66Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV67Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV68Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV69Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV70Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV71Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV72Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV73Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV74Tmaquinwwds_16_tfmaqvolres ,
                                          int AV75Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV76Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV77Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV78Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV79Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV80Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV81Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV83Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV82Tmaquinwwds_24_tftipmaqcod ,
                                          String AV85Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV84Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.TipMaqCod, T1.EmprCod, T2.TipMaqDsc, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV59Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV64Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV67Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV68Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV69Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV82Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipMaqCod" ;
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
                  return conditional_P0A7R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_P0A7R3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 2 :
                  return conditional_P0A7R4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 3 :
                  return conditional_P0A7R5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 4 :
                  return conditional_P0A7R6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7R3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7R4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7R5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7R6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 2);
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
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 2 :
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
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 3 :
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
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               return;
            case 4 :
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
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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

