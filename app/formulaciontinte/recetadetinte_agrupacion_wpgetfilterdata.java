package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_agrupacion_wpgetfilterdata extends GXProcedure
{
   public recetadetinte_agrupacion_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_agrupacion_wpgetfilterdata.class ), "" );
   }

   public recetadetinte_agrupacion_wpgetfilterdata( int remoteHandle ,
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
      recetadetinte_agrupacion_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte_agrupacion_wpgetfilterdata.this.AV68DDOName = aP0;
      recetadetinte_agrupacion_wpgetfilterdata.this.AV66SearchTxt = aP1;
      recetadetinte_agrupacion_wpgetfilterdata.this.AV67SearchTxtTo = aP2;
      recetadetinte_agrupacion_wpgetfilterdata.this.aP3 = aP3;
      recetadetinte_agrupacion_wpgetfilterdata.this.aP4 = aP4;
      recetadetinte_agrupacion_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV71Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV74OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV76OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_BARAGRNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_BARAGRSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_BARAGRDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_COLNOMAGR") == 0 )
      {
         /* Execute user subroutine: 'LOADCOLNOMAGROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV68DDOName), "DDO_COLNOCAGR") == 0 )
      {
         /* Execute user subroutine: 'LOADCOLNOCAGROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV72OptionsJson = AV71Options.toJSonString(false) ;
      AV75OptionsDescJson = AV74OptionsDesc.toJSonString(false) ;
      AV77OptionIndexesJson = AV76OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV79Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), "") == 0 )
      {
         AV81GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), null, null);
      }
      else
      {
         AV81GridState.fromxml(AV79Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), null, null);
      }
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV81GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV82GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV81GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV84FilterFullText = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV64TFBarAgrNhdr = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV65TFBarAgrNhdr_Sel = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV38TFKgmAgr = CommonUtil.decimalVal( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFKgmAgr_To = CommonUtil.decimalVal( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV42TFMtrAgr = CommonUtil.decimalVal( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFMtrAgr_To = CommonUtil.decimalVal( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV40TFPieAgr = (short)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFPieAgr_To = (short)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV44TFBarAgrSer = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV45TFBarAgrSer_Sel = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV46TFBarAgrDsc = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV47TFBarAgrDsc_Sel = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV48TFCliCodAgr = (int)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFCliCodAgr_To = (int)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV52TFColNomAgr = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV53TFColNomAgr_Sel = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV54TFColNumAgr = (int)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFColNumAgr_To = (int)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR") == 0 )
         {
            AV56TFColNoCAgr = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR_SEL") == 0 )
         {
            AV57TFColNoCAgr_Sel = AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUCAGR") == 0 )
         {
            AV58TFColNuCAgr = (int)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFColNuCAgr_To = (int)(GXutil.lval( AV82GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARAGRNHDROPTIONS' Routine */
      returnInSub = false ;
      AV64TFBarAgrNhdr = AV66SearchTxt ;
      AV65TFBarAgrNhdr_Sel = "" ;
      AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV84FilterFullText ;
      AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV64TFBarAgrNhdr ;
      AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV65TFBarAgrNhdr_Sel ;
      AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV38TFKgmAgr ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV39TFKgmAgr_To ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV42TFMtrAgr ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV43TFMtrAgr_To ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV40TFPieAgr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV41TFPieAgr_To ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV44TFBarAgrSer ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV45TFBarAgrSer_Sel ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV46TFBarAgrDsc ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV47TFBarAgrDsc_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV48TFCliCodAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV49TFCliCodAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV52TFColNomAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV53TFColNomAgr_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV54TFColNumAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV55TFColNumAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV56TFColNoCAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV57TFColNoCAgr_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV58TFColNuCAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV59TFColNuCAgr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09HA2 */
      pr_default.execute(0, new Object[] {lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1511ColNuCAgr = P09HA2_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P09HA2_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P09HA2_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09HA2_A1510ColNomAgr[0] ;
         A1508CliCodAgr = P09HA2_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P09HA2_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09HA2_A1245BarAgrSer[0] ;
         A671PieAgr = P09HA2_A671PieAgr[0] ;
         A869MtrAgr = P09HA2_A869MtrAgr[0] ;
         A590KgmAgr = P09HA2_A590KgmAgr[0] ;
         A122BarAgrPar = P09HA2_A122BarAgrPar[0] ;
         A124BarAgrReo = P09HA2_A124BarAgrReo[0] ;
         A119BarAgrCod = P09HA2_A119BarAgrCod[0] ;
         A396EmprCod = P09HA2_A396EmprCod[0] ;
         A129BarCod = P09HA2_A129BarCod[0] ;
         A132BarCodReo = P09HA2_A132BarCodReo[0] ;
         A130BarCodPar = P09HA2_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         if ( ! (GXutil.strcmp("", A13792BarAgrNhdr)==0) )
         {
            AV70Option = A13792BarAgrNhdr ;
            AV69InsertIndex = 1 ;
            while ( ( AV69InsertIndex <= AV71Options.size() ) && ( GXutil.strcmp((String)AV71Options.elementAt(-1+AV69InsertIndex), AV70Option) < 0 ) )
            {
               AV69InsertIndex = (int)(AV69InsertIndex+1) ;
            }
            if ( ( AV69InsertIndex <= AV71Options.size() ) && ( GXutil.strcmp((String)AV71Options.elementAt(-1+AV69InsertIndex), AV70Option) == 0 ) )
            {
               AV78count = GXutil.lval( (String)AV76OptionIndexes.elementAt(-1+AV69InsertIndex)) ;
               AV78count = (long)(AV78count+1) ;
               AV76OptionIndexes.removeItem(AV69InsertIndex);
               AV76OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV78count), "Z,ZZZ,ZZZ,ZZ9")), AV69InsertIndex);
            }
            else
            {
               AV71Options.add(AV70Option, AV69InsertIndex);
               AV76OptionIndexes.add("1", AV69InsertIndex);
            }
         }
         if ( AV71Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARAGRSEROPTIONS' Routine */
      returnInSub = false ;
      AV44TFBarAgrSer = AV66SearchTxt ;
      AV45TFBarAgrSer_Sel = "" ;
      AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV84FilterFullText ;
      AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV64TFBarAgrNhdr ;
      AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV65TFBarAgrNhdr_Sel ;
      AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV38TFKgmAgr ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV39TFKgmAgr_To ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV42TFMtrAgr ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV43TFMtrAgr_To ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV40TFPieAgr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV41TFPieAgr_To ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV44TFBarAgrSer ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV45TFBarAgrSer_Sel ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV46TFBarAgrDsc ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV47TFBarAgrDsc_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV48TFCliCodAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV49TFCliCodAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV52TFColNomAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV53TFColNomAgr_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV54TFColNumAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV55TFColNumAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV56TFColNoCAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV57TFColNoCAgr_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV58TFColNuCAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV59TFColNuCAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09HA3 */
      pr_default.execute(1, new Object[] {lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9HA3 = false ;
         A1245BarAgrSer = P09HA3_A1245BarAgrSer[0] ;
         A1511ColNuCAgr = P09HA3_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P09HA3_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P09HA3_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09HA3_A1510ColNomAgr[0] ;
         A1508CliCodAgr = P09HA3_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P09HA3_A1507BarAgrDsc[0] ;
         A671PieAgr = P09HA3_A671PieAgr[0] ;
         A869MtrAgr = P09HA3_A869MtrAgr[0] ;
         A590KgmAgr = P09HA3_A590KgmAgr[0] ;
         A122BarAgrPar = P09HA3_A122BarAgrPar[0] ;
         A124BarAgrReo = P09HA3_A124BarAgrReo[0] ;
         A119BarAgrCod = P09HA3_A119BarAgrCod[0] ;
         A396EmprCod = P09HA3_A396EmprCod[0] ;
         A129BarCod = P09HA3_A129BarCod[0] ;
         A132BarCodReo = P09HA3_A132BarCodReo[0] ;
         A130BarCodPar = P09HA3_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV78count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09HA3_A1245BarAgrSer[0], A1245BarAgrSer) == 0 ) )
         {
            brk9HA3 = false ;
            A122BarAgrPar = P09HA3_A122BarAgrPar[0] ;
            A124BarAgrReo = P09HA3_A124BarAgrReo[0] ;
            A119BarAgrCod = P09HA3_A119BarAgrCod[0] ;
            A396EmprCod = P09HA3_A396EmprCod[0] ;
            A129BarCod = P09HA3_A129BarCod[0] ;
            A132BarCodReo = P09HA3_A132BarCodReo[0] ;
            A130BarCodPar = P09HA3_A130BarCodPar[0] ;
            AV78count = (long)(AV78count+1) ;
            brk9HA3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1245BarAgrSer)==0) )
         {
            AV70Option = A1245BarAgrSer ;
            AV71Options.add(AV70Option, 0);
            AV76OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV78count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV71Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HA3 )
         {
            brk9HA3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARAGRDSCOPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarAgrDsc = AV66SearchTxt ;
      AV47TFBarAgrDsc_Sel = "" ;
      AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV84FilterFullText ;
      AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV64TFBarAgrNhdr ;
      AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV65TFBarAgrNhdr_Sel ;
      AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV38TFKgmAgr ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV39TFKgmAgr_To ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV42TFMtrAgr ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV43TFMtrAgr_To ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV40TFPieAgr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV41TFPieAgr_To ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV44TFBarAgrSer ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV45TFBarAgrSer_Sel ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV46TFBarAgrDsc ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV47TFBarAgrDsc_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV48TFCliCodAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV49TFCliCodAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV52TFColNomAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV53TFColNomAgr_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV54TFColNumAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV55TFColNumAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV56TFColNoCAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV57TFColNoCAgr_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV58TFColNuCAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV59TFColNuCAgr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09HA4 */
      pr_default.execute(2, new Object[] {lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9HA5 = false ;
         A1507BarAgrDsc = P09HA4_A1507BarAgrDsc[0] ;
         A1511ColNuCAgr = P09HA4_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P09HA4_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P09HA4_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09HA4_A1510ColNomAgr[0] ;
         A1508CliCodAgr = P09HA4_A1508CliCodAgr[0] ;
         A1245BarAgrSer = P09HA4_A1245BarAgrSer[0] ;
         A671PieAgr = P09HA4_A671PieAgr[0] ;
         A869MtrAgr = P09HA4_A869MtrAgr[0] ;
         A590KgmAgr = P09HA4_A590KgmAgr[0] ;
         A122BarAgrPar = P09HA4_A122BarAgrPar[0] ;
         A124BarAgrReo = P09HA4_A124BarAgrReo[0] ;
         A119BarAgrCod = P09HA4_A119BarAgrCod[0] ;
         A396EmprCod = P09HA4_A396EmprCod[0] ;
         A129BarCod = P09HA4_A129BarCod[0] ;
         A132BarCodReo = P09HA4_A132BarCodReo[0] ;
         A130BarCodPar = P09HA4_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV78count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09HA4_A1507BarAgrDsc[0], A1507BarAgrDsc) == 0 ) )
         {
            brk9HA5 = false ;
            A122BarAgrPar = P09HA4_A122BarAgrPar[0] ;
            A124BarAgrReo = P09HA4_A124BarAgrReo[0] ;
            A119BarAgrCod = P09HA4_A119BarAgrCod[0] ;
            A396EmprCod = P09HA4_A396EmprCod[0] ;
            A129BarCod = P09HA4_A129BarCod[0] ;
            A132BarCodReo = P09HA4_A132BarCodReo[0] ;
            A130BarCodPar = P09HA4_A130BarCodPar[0] ;
            AV78count = (long)(AV78count+1) ;
            brk9HA5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1507BarAgrDsc)==0) )
         {
            AV70Option = A1507BarAgrDsc ;
            AV71Options.add(AV70Option, 0);
            AV76OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV78count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV71Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HA5 )
         {
            brk9HA5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCOLNOMAGROPTIONS' Routine */
      returnInSub = false ;
      AV52TFColNomAgr = AV66SearchTxt ;
      AV53TFColNomAgr_Sel = "" ;
      AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV84FilterFullText ;
      AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV64TFBarAgrNhdr ;
      AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV65TFBarAgrNhdr_Sel ;
      AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV38TFKgmAgr ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV39TFKgmAgr_To ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV42TFMtrAgr ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV43TFMtrAgr_To ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV40TFPieAgr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV41TFPieAgr_To ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV44TFBarAgrSer ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV45TFBarAgrSer_Sel ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV46TFBarAgrDsc ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV47TFBarAgrDsc_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV48TFCliCodAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV49TFCliCodAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV52TFColNomAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV53TFColNomAgr_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV54TFColNumAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV55TFColNumAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV56TFColNoCAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV57TFColNoCAgr_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV58TFColNuCAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV59TFColNuCAgr_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09HA5 */
      pr_default.execute(3, new Object[] {lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9HA7 = false ;
         A1510ColNomAgr = P09HA5_A1510ColNomAgr[0] ;
         A1511ColNuCAgr = P09HA5_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P09HA5_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P09HA5_A1512ColNumAgr[0] ;
         A1508CliCodAgr = P09HA5_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P09HA5_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09HA5_A1245BarAgrSer[0] ;
         A671PieAgr = P09HA5_A671PieAgr[0] ;
         A869MtrAgr = P09HA5_A869MtrAgr[0] ;
         A590KgmAgr = P09HA5_A590KgmAgr[0] ;
         A122BarAgrPar = P09HA5_A122BarAgrPar[0] ;
         A124BarAgrReo = P09HA5_A124BarAgrReo[0] ;
         A119BarAgrCod = P09HA5_A119BarAgrCod[0] ;
         A396EmprCod = P09HA5_A396EmprCod[0] ;
         A129BarCod = P09HA5_A129BarCod[0] ;
         A132BarCodReo = P09HA5_A132BarCodReo[0] ;
         A130BarCodPar = P09HA5_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV78count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09HA5_A1510ColNomAgr[0], A1510ColNomAgr) == 0 ) )
         {
            brk9HA7 = false ;
            A122BarAgrPar = P09HA5_A122BarAgrPar[0] ;
            A124BarAgrReo = P09HA5_A124BarAgrReo[0] ;
            A119BarAgrCod = P09HA5_A119BarAgrCod[0] ;
            A396EmprCod = P09HA5_A396EmprCod[0] ;
            A129BarCod = P09HA5_A129BarCod[0] ;
            A132BarCodReo = P09HA5_A132BarCodReo[0] ;
            A130BarCodPar = P09HA5_A130BarCodPar[0] ;
            AV78count = (long)(AV78count+1) ;
            brk9HA7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1510ColNomAgr)==0) )
         {
            AV70Option = A1510ColNomAgr ;
            AV71Options.add(AV70Option, 0);
            AV76OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV78count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV71Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HA7 )
         {
            brk9HA7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCOLNOCAGROPTIONS' Routine */
      returnInSub = false ;
      AV56TFColNoCAgr = AV66SearchTxt ;
      AV57TFColNoCAgr_Sel = "" ;
      AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV84FilterFullText ;
      AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV64TFBarAgrNhdr ;
      AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV65TFBarAgrNhdr_Sel ;
      AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV38TFKgmAgr ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV39TFKgmAgr_To ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV42TFMtrAgr ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV43TFMtrAgr_To ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV40TFPieAgr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV41TFPieAgr_To ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV44TFBarAgrSer ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV45TFBarAgrSer_Sel ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV46TFBarAgrDsc ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV47TFBarAgrDsc_Sel ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV48TFCliCodAgr ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV49TFCliCodAgr_To ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV52TFColNomAgr ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV53TFColNomAgr_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV54TFColNumAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV55TFColNumAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV56TFColNoCAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV57TFColNoCAgr_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV58TFColNuCAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV59TFColNuCAgr_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09HA6 */
      pr_default.execute(4, new Object[] {lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9HA9 = false ;
         A1509ColNoCAgr = P09HA6_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = P09HA6_A1511ColNuCAgr[0] ;
         A1512ColNumAgr = P09HA6_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09HA6_A1510ColNomAgr[0] ;
         A1508CliCodAgr = P09HA6_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P09HA6_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09HA6_A1245BarAgrSer[0] ;
         A671PieAgr = P09HA6_A671PieAgr[0] ;
         A869MtrAgr = P09HA6_A869MtrAgr[0] ;
         A590KgmAgr = P09HA6_A590KgmAgr[0] ;
         A122BarAgrPar = P09HA6_A122BarAgrPar[0] ;
         A124BarAgrReo = P09HA6_A124BarAgrReo[0] ;
         A119BarAgrCod = P09HA6_A119BarAgrCod[0] ;
         A396EmprCod = P09HA6_A396EmprCod[0] ;
         A129BarCod = P09HA6_A129BarCod[0] ;
         A132BarCodReo = P09HA6_A132BarCodReo[0] ;
         A130BarCodPar = P09HA6_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV78count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09HA6_A1509ColNoCAgr[0], A1509ColNoCAgr) == 0 ) )
         {
            brk9HA9 = false ;
            A122BarAgrPar = P09HA6_A122BarAgrPar[0] ;
            A124BarAgrReo = P09HA6_A124BarAgrReo[0] ;
            A119BarAgrCod = P09HA6_A119BarAgrCod[0] ;
            A396EmprCod = P09HA6_A396EmprCod[0] ;
            A129BarCod = P09HA6_A129BarCod[0] ;
            A132BarCodReo = P09HA6_A132BarCodReo[0] ;
            A130BarCodPar = P09HA6_A130BarCodPar[0] ;
            AV78count = (long)(AV78count+1) ;
            brk9HA9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1509ColNoCAgr)==0) )
         {
            AV70Option = A1509ColNoCAgr ;
            AV71Options.add(AV70Option, 0);
            AV76OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV78count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV71Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HA9 )
         {
            brk9HA9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte_agrupacion_wpgetfilterdata.this.AV72OptionsJson;
      this.aP4[0] = recetadetinte_agrupacion_wpgetfilterdata.this.AV75OptionsDescJson;
      this.aP5[0] = recetadetinte_agrupacion_wpgetfilterdata.this.AV77OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV72OptionsJson = "" ;
      AV75OptionsDescJson = "" ;
      AV77OptionIndexesJson = "" ;
      AV71Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV74OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV76OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV79Session = httpContext.getWebSession();
      AV81GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV82GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV84FilterFullText = "" ;
      AV64TFBarAgrNhdr = "" ;
      AV65TFBarAgrNhdr_Sel = "" ;
      AV38TFKgmAgr = DecimalUtil.ZERO ;
      AV39TFKgmAgr_To = DecimalUtil.ZERO ;
      AV42TFMtrAgr = DecimalUtil.ZERO ;
      AV43TFMtrAgr_To = DecimalUtil.ZERO ;
      AV44TFBarAgrSer = "" ;
      AV45TFBarAgrSer_Sel = "" ;
      AV46TFBarAgrDsc = "" ;
      AV47TFBarAgrDsc_Sel = "" ;
      AV52TFColNomAgr = "" ;
      AV53TFColNomAgr_Sel = "" ;
      AV56TFColNoCAgr = "" ;
      AV57TFColNoCAgr_Sel = "" ;
      A13792BarAgrNhdr = "" ;
      AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = "" ;
      AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = DecimalUtil.ZERO ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = DecimalUtil.ZERO ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = DecimalUtil.ZERO ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = DecimalUtil.ZERO ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = "" ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = "" ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = "" ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = "" ;
      scmdbuf = "" ;
      lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      P09HA2_A1511ColNuCAgr = new int[1] ;
      P09HA2_A1509ColNoCAgr = new String[] {""} ;
      P09HA2_A1512ColNumAgr = new int[1] ;
      P09HA2_A1510ColNomAgr = new String[] {""} ;
      P09HA2_A1508CliCodAgr = new int[1] ;
      P09HA2_A1507BarAgrDsc = new String[] {""} ;
      P09HA2_A1245BarAgrSer = new String[] {""} ;
      P09HA2_A671PieAgr = new short[1] ;
      P09HA2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA2_A122BarAgrPar = new String[] {""} ;
      P09HA2_A124BarAgrReo = new byte[1] ;
      P09HA2_A119BarAgrCod = new int[1] ;
      P09HA2_A396EmprCod = new String[] {""} ;
      P09HA2_A129BarCod = new int[1] ;
      P09HA2_A132BarCodReo = new byte[1] ;
      P09HA2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV70Option = "" ;
      P09HA3_A1245BarAgrSer = new String[] {""} ;
      P09HA3_A1511ColNuCAgr = new int[1] ;
      P09HA3_A1509ColNoCAgr = new String[] {""} ;
      P09HA3_A1512ColNumAgr = new int[1] ;
      P09HA3_A1510ColNomAgr = new String[] {""} ;
      P09HA3_A1508CliCodAgr = new int[1] ;
      P09HA3_A1507BarAgrDsc = new String[] {""} ;
      P09HA3_A671PieAgr = new short[1] ;
      P09HA3_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA3_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA3_A122BarAgrPar = new String[] {""} ;
      P09HA3_A124BarAgrReo = new byte[1] ;
      P09HA3_A119BarAgrCod = new int[1] ;
      P09HA3_A396EmprCod = new String[] {""} ;
      P09HA3_A129BarCod = new int[1] ;
      P09HA3_A132BarCodReo = new byte[1] ;
      P09HA3_A130BarCodPar = new String[] {""} ;
      P09HA4_A1507BarAgrDsc = new String[] {""} ;
      P09HA4_A1511ColNuCAgr = new int[1] ;
      P09HA4_A1509ColNoCAgr = new String[] {""} ;
      P09HA4_A1512ColNumAgr = new int[1] ;
      P09HA4_A1510ColNomAgr = new String[] {""} ;
      P09HA4_A1508CliCodAgr = new int[1] ;
      P09HA4_A1245BarAgrSer = new String[] {""} ;
      P09HA4_A671PieAgr = new short[1] ;
      P09HA4_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA4_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA4_A122BarAgrPar = new String[] {""} ;
      P09HA4_A124BarAgrReo = new byte[1] ;
      P09HA4_A119BarAgrCod = new int[1] ;
      P09HA4_A396EmprCod = new String[] {""} ;
      P09HA4_A129BarCod = new int[1] ;
      P09HA4_A132BarCodReo = new byte[1] ;
      P09HA4_A130BarCodPar = new String[] {""} ;
      P09HA5_A1510ColNomAgr = new String[] {""} ;
      P09HA5_A1511ColNuCAgr = new int[1] ;
      P09HA5_A1509ColNoCAgr = new String[] {""} ;
      P09HA5_A1512ColNumAgr = new int[1] ;
      P09HA5_A1508CliCodAgr = new int[1] ;
      P09HA5_A1507BarAgrDsc = new String[] {""} ;
      P09HA5_A1245BarAgrSer = new String[] {""} ;
      P09HA5_A671PieAgr = new short[1] ;
      P09HA5_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA5_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA5_A122BarAgrPar = new String[] {""} ;
      P09HA5_A124BarAgrReo = new byte[1] ;
      P09HA5_A119BarAgrCod = new int[1] ;
      P09HA5_A396EmprCod = new String[] {""} ;
      P09HA5_A129BarCod = new int[1] ;
      P09HA5_A132BarCodReo = new byte[1] ;
      P09HA5_A130BarCodPar = new String[] {""} ;
      P09HA6_A1509ColNoCAgr = new String[] {""} ;
      P09HA6_A1511ColNuCAgr = new int[1] ;
      P09HA6_A1512ColNumAgr = new int[1] ;
      P09HA6_A1510ColNomAgr = new String[] {""} ;
      P09HA6_A1508CliCodAgr = new int[1] ;
      P09HA6_A1507BarAgrDsc = new String[] {""} ;
      P09HA6_A1245BarAgrSer = new String[] {""} ;
      P09HA6_A671PieAgr = new short[1] ;
      P09HA6_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA6_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09HA6_A122BarAgrPar = new String[] {""} ;
      P09HA6_A124BarAgrReo = new byte[1] ;
      P09HA6_A119BarAgrCod = new int[1] ;
      P09HA6_A396EmprCod = new String[] {""} ;
      P09HA6_A129BarCod = new int[1] ;
      P09HA6_A132BarCodReo = new byte[1] ;
      P09HA6_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09HA2_A1511ColNuCAgr, P09HA2_A1509ColNoCAgr, P09HA2_A1512ColNumAgr, P09HA2_A1510ColNomAgr, P09HA2_A1508CliCodAgr, P09HA2_A1507BarAgrDsc, P09HA2_A1245BarAgrSer, P09HA2_A671PieAgr, P09HA2_A869MtrAgr, P09HA2_A590KgmAgr,
            P09HA2_A122BarAgrPar, P09HA2_A124BarAgrReo, P09HA2_A119BarAgrCod, P09HA2_A396EmprCod, P09HA2_A129BarCod, P09HA2_A132BarCodReo, P09HA2_A130BarCodPar
            }
            , new Object[] {
            P09HA3_A1245BarAgrSer, P09HA3_A1511ColNuCAgr, P09HA3_A1509ColNoCAgr, P09HA3_A1512ColNumAgr, P09HA3_A1510ColNomAgr, P09HA3_A1508CliCodAgr, P09HA3_A1507BarAgrDsc, P09HA3_A671PieAgr, P09HA3_A869MtrAgr, P09HA3_A590KgmAgr,
            P09HA3_A122BarAgrPar, P09HA3_A124BarAgrReo, P09HA3_A119BarAgrCod, P09HA3_A396EmprCod, P09HA3_A129BarCod, P09HA3_A132BarCodReo, P09HA3_A130BarCodPar
            }
            , new Object[] {
            P09HA4_A1507BarAgrDsc, P09HA4_A1511ColNuCAgr, P09HA4_A1509ColNoCAgr, P09HA4_A1512ColNumAgr, P09HA4_A1510ColNomAgr, P09HA4_A1508CliCodAgr, P09HA4_A1245BarAgrSer, P09HA4_A671PieAgr, P09HA4_A869MtrAgr, P09HA4_A590KgmAgr,
            P09HA4_A122BarAgrPar, P09HA4_A124BarAgrReo, P09HA4_A119BarAgrCod, P09HA4_A396EmprCod, P09HA4_A129BarCod, P09HA4_A132BarCodReo, P09HA4_A130BarCodPar
            }
            , new Object[] {
            P09HA5_A1510ColNomAgr, P09HA5_A1511ColNuCAgr, P09HA5_A1509ColNoCAgr, P09HA5_A1512ColNumAgr, P09HA5_A1508CliCodAgr, P09HA5_A1507BarAgrDsc, P09HA5_A1245BarAgrSer, P09HA5_A671PieAgr, P09HA5_A869MtrAgr, P09HA5_A590KgmAgr,
            P09HA5_A122BarAgrPar, P09HA5_A124BarAgrReo, P09HA5_A119BarAgrCod, P09HA5_A396EmprCod, P09HA5_A129BarCod, P09HA5_A132BarCodReo, P09HA5_A130BarCodPar
            }
            , new Object[] {
            P09HA6_A1509ColNoCAgr, P09HA6_A1511ColNuCAgr, P09HA6_A1512ColNumAgr, P09HA6_A1510ColNomAgr, P09HA6_A1508CliCodAgr, P09HA6_A1507BarAgrDsc, P09HA6_A1245BarAgrSer, P09HA6_A671PieAgr, P09HA6_A869MtrAgr, P09HA6_A590KgmAgr,
            P09HA6_A122BarAgrPar, P09HA6_A124BarAgrReo, P09HA6_A119BarAgrCod, P09HA6_A396EmprCod, P09HA6_A129BarCod, P09HA6_A132BarCodReo, P09HA6_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short AV40TFPieAgr ;
   private short AV41TFPieAgr_To ;
   private short AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ;
   private short AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int AV87GXV1 ;
   private int AV48TFCliCodAgr ;
   private int AV49TFCliCodAgr_To ;
   private int AV54TFColNumAgr ;
   private int AV55TFColNumAgr_To ;
   private int AV58TFColNuCAgr ;
   private int AV59TFColNuCAgr_To ;
   private int AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ;
   private int AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ;
   private int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ;
   private int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ;
   private int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ;
   private int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int A129BarCod ;
   private int AV69InsertIndex ;
   private long AV78count ;
   private java.math.BigDecimal AV38TFKgmAgr ;
   private java.math.BigDecimal AV39TFKgmAgr_To ;
   private java.math.BigDecimal AV42TFMtrAgr ;
   private java.math.BigDecimal AV43TFMtrAgr_To ;
   private java.math.BigDecimal AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ;
   private java.math.BigDecimal AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ;
   private java.math.BigDecimal AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ;
   private java.math.BigDecimal AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String AV64TFBarAgrNhdr ;
   private String AV65TFBarAgrNhdr_Sel ;
   private String AV44TFBarAgrSer ;
   private String AV45TFBarAgrSer_Sel ;
   private String AV46TFBarAgrDsc ;
   private String AV47TFBarAgrDsc_Sel ;
   private String AV52TFColNomAgr ;
   private String AV53TFColNomAgr_Sel ;
   private String AV56TFColNoCAgr ;
   private String AV57TFColNoCAgr_Sel ;
   private String A13792BarAgrNhdr ;
   private String AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ;
   private String AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ;
   private String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ;
   private String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ;
   private String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ;
   private String scmdbuf ;
   private String lV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String lV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String lV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String lV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String lV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9HA3 ;
   private boolean brk9HA5 ;
   private boolean brk9HA7 ;
   private boolean brk9HA9 ;
   private String AV72OptionsJson ;
   private String AV75OptionsDescJson ;
   private String AV77OptionIndexesJson ;
   private String AV68DDOName ;
   private String AV66SearchTxt ;
   private String AV67SearchTxtTo ;
   private String AV84FilterFullText ;
   private String AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String lV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String AV70Option ;
   private com.genexus.webpanels.WebSession AV79Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09HA2_A1511ColNuCAgr ;
   private String[] P09HA2_A1509ColNoCAgr ;
   private int[] P09HA2_A1512ColNumAgr ;
   private String[] P09HA2_A1510ColNomAgr ;
   private int[] P09HA2_A1508CliCodAgr ;
   private String[] P09HA2_A1507BarAgrDsc ;
   private String[] P09HA2_A1245BarAgrSer ;
   private short[] P09HA2_A671PieAgr ;
   private java.math.BigDecimal[] P09HA2_A869MtrAgr ;
   private java.math.BigDecimal[] P09HA2_A590KgmAgr ;
   private String[] P09HA2_A122BarAgrPar ;
   private byte[] P09HA2_A124BarAgrReo ;
   private int[] P09HA2_A119BarAgrCod ;
   private String[] P09HA2_A396EmprCod ;
   private int[] P09HA2_A129BarCod ;
   private byte[] P09HA2_A132BarCodReo ;
   private String[] P09HA2_A130BarCodPar ;
   private String[] P09HA3_A1245BarAgrSer ;
   private int[] P09HA3_A1511ColNuCAgr ;
   private String[] P09HA3_A1509ColNoCAgr ;
   private int[] P09HA3_A1512ColNumAgr ;
   private String[] P09HA3_A1510ColNomAgr ;
   private int[] P09HA3_A1508CliCodAgr ;
   private String[] P09HA3_A1507BarAgrDsc ;
   private short[] P09HA3_A671PieAgr ;
   private java.math.BigDecimal[] P09HA3_A869MtrAgr ;
   private java.math.BigDecimal[] P09HA3_A590KgmAgr ;
   private String[] P09HA3_A122BarAgrPar ;
   private byte[] P09HA3_A124BarAgrReo ;
   private int[] P09HA3_A119BarAgrCod ;
   private String[] P09HA3_A396EmprCod ;
   private int[] P09HA3_A129BarCod ;
   private byte[] P09HA3_A132BarCodReo ;
   private String[] P09HA3_A130BarCodPar ;
   private String[] P09HA4_A1507BarAgrDsc ;
   private int[] P09HA4_A1511ColNuCAgr ;
   private String[] P09HA4_A1509ColNoCAgr ;
   private int[] P09HA4_A1512ColNumAgr ;
   private String[] P09HA4_A1510ColNomAgr ;
   private int[] P09HA4_A1508CliCodAgr ;
   private String[] P09HA4_A1245BarAgrSer ;
   private short[] P09HA4_A671PieAgr ;
   private java.math.BigDecimal[] P09HA4_A869MtrAgr ;
   private java.math.BigDecimal[] P09HA4_A590KgmAgr ;
   private String[] P09HA4_A122BarAgrPar ;
   private byte[] P09HA4_A124BarAgrReo ;
   private int[] P09HA4_A119BarAgrCod ;
   private String[] P09HA4_A396EmprCod ;
   private int[] P09HA4_A129BarCod ;
   private byte[] P09HA4_A132BarCodReo ;
   private String[] P09HA4_A130BarCodPar ;
   private String[] P09HA5_A1510ColNomAgr ;
   private int[] P09HA5_A1511ColNuCAgr ;
   private String[] P09HA5_A1509ColNoCAgr ;
   private int[] P09HA5_A1512ColNumAgr ;
   private int[] P09HA5_A1508CliCodAgr ;
   private String[] P09HA5_A1507BarAgrDsc ;
   private String[] P09HA5_A1245BarAgrSer ;
   private short[] P09HA5_A671PieAgr ;
   private java.math.BigDecimal[] P09HA5_A869MtrAgr ;
   private java.math.BigDecimal[] P09HA5_A590KgmAgr ;
   private String[] P09HA5_A122BarAgrPar ;
   private byte[] P09HA5_A124BarAgrReo ;
   private int[] P09HA5_A119BarAgrCod ;
   private String[] P09HA5_A396EmprCod ;
   private int[] P09HA5_A129BarCod ;
   private byte[] P09HA5_A132BarCodReo ;
   private String[] P09HA5_A130BarCodPar ;
   private String[] P09HA6_A1509ColNoCAgr ;
   private int[] P09HA6_A1511ColNuCAgr ;
   private int[] P09HA6_A1512ColNumAgr ;
   private String[] P09HA6_A1510ColNomAgr ;
   private int[] P09HA6_A1508CliCodAgr ;
   private String[] P09HA6_A1507BarAgrDsc ;
   private String[] P09HA6_A1245BarAgrSer ;
   private short[] P09HA6_A671PieAgr ;
   private java.math.BigDecimal[] P09HA6_A869MtrAgr ;
   private java.math.BigDecimal[] P09HA6_A590KgmAgr ;
   private String[] P09HA6_A122BarAgrPar ;
   private byte[] P09HA6_A124BarAgrReo ;
   private int[] P09HA6_A119BarAgrCod ;
   private String[] P09HA6_A396EmprCod ;
   private int[] P09HA6_A129BarCod ;
   private byte[] P09HA6_A132BarCodReo ;
   private String[] P09HA6_A130BarCodPar ;
   private GXSimpleCollection<String> AV71Options ;
   private GXSimpleCollection<String> AV74OptionsDesc ;
   private GXSimpleCollection<String> AV76OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV81GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV82GridStateFilterValue ;
}

final  class recetadetinte_agrupacion_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09HA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT BarAgrSer, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarAgrSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09HA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT BarAgrDsc, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarAgrDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09HA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ColNomAgr, ColNuCAgr, ColNoCAgr, ColNumAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ColNomAgr" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09HA6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT ColNoCAgr, ColNuCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ColNoCAgr" ;
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
                  return conditional_P09HA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
            case 1 :
                  return conditional_P09HA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
            case 2 :
                  return conditional_P09HA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
            case 3 :
                  return conditional_P09HA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
            case 4 :
                  return conditional_P09HA6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HA6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
      }
   }

}

