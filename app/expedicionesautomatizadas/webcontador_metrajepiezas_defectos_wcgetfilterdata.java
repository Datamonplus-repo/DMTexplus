package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_defectos_wcgetfilterdata extends GXProcedure
{
   public webcontador_metrajepiezas_defectos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_metrajepiezas_defectos_wcgetfilterdata.class ), "" );
   }

   public webcontador_metrajepiezas_defectos_wcgetfilterdata( int remoteHandle ,
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
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.AV34DDOName = aP0;
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.AV35SearchTxt = aP1;
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.AV36SearchTxtTo = aP2;
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.aP3 = aP3;
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.aP4 = aP4;
      webcontador_metrajepiezas_defectos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_METPIEDFDC") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIEDFDCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_METPIEDFFASE") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIEDFFASEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFLIN") == 0 )
         {
            AV10TFMetPieDfLin = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFMetPieDfLin_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFID") == 0 )
         {
            AV12TFMetPieDfID = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFMetPieDfID_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC") == 0 )
         {
            AV14TFMetPieDfDc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC_SEL") == 0 )
         {
            AV15TFMetPieDfDc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMIN") == 0 )
         {
            AV16TFMetPieDfMin = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFMetPieDfMin_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMAX") == 0 )
         {
            AV18TFMetPieDfMax = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFMetPieDfMax_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE") == 0 )
         {
            AV20TFMetPieDfFase = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE_SEL") == 0 )
         {
            AV21TFMetPieDfFase_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41EmprCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METTERCOD") == 0 )
         {
            AV42MetTerCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV43BarCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV44BarCodReo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV45BarCodPar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METPIECOD") == 0 )
         {
            AV46MetPieCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETPIEDFDCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMetPieDfDc = AV35SearchTxt ;
      AV15TFMetPieDfDc_Sel = "" ;
      AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV41EmprCod ;
      AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV42MetTerCod ;
      AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV43BarCod ;
      AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV44BarCodReo ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV45BarCodPar ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV46MetPieCod ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV40FilterFullText ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV10TFMetPieDfLin ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV11TFMetPieDfLin_To ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV12TFMetPieDfID ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV13TFMetPieDfID_To ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV14TFMetPieDfDc ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV15TFMetPieDfDc_Sel ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV16TFMetPieDfMin ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV17TFMetPieDfMin_To ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV18TFMetPieDfMax ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV19TFMetPieDfMax_To ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV20TFMetPieDfFase ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV21TFMetPieDfFase_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                           Short.valueOf(AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                           Short.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                           Short.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                           Short.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                           Short.valueOf(A12995MetPieDfLi) ,
                                           Short.valueOf(A12996MetPieDfID) ,
                                           A12997MetPieDfDc ,
                                           A12998MetPieDfMi ,
                                           A12999MetPieDfMa ,
                                           A13000MetPieDfFa ,
                                           A396EmprCod ,
                                           AV41EmprCod ,
                                           A2809MetTerCod ,
                                           AV42MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A2813MetPieCod ,
                                           AV46MetPieCod ,
                                           AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                           AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                           Integer.valueOf(AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                           Byte.valueOf(AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                           AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                           AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
      /* Using cursor P09AU2 */
      pr_default.execute(0, new Object[] {AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV41EmprCod, AV42MetTerCod, Integer.valueOf(AV43BarCod), Byte.valueOf(AV44BarCodReo), AV45BarCodPar, AV46MetPieCod, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9AU2 = false ;
         A396EmprCod = P09AU2_A396EmprCod[0] ;
         A2809MetTerCod = P09AU2_A2809MetTerCod[0] ;
         A129BarCod = P09AU2_A129BarCod[0] ;
         A132BarCodReo = P09AU2_A132BarCodReo[0] ;
         A130BarCodPar = P09AU2_A130BarCodPar[0] ;
         A2813MetPieCod = P09AU2_A2813MetPieCod[0] ;
         A12996MetPieDfID = P09AU2_A12996MetPieDfID[0] ;
         A13000MetPieDfFa = P09AU2_A13000MetPieDfFa[0] ;
         A12999MetPieDfMa = P09AU2_A12999MetPieDfMa[0] ;
         A12998MetPieDfMi = P09AU2_A12998MetPieDfMi[0] ;
         A12997MetPieDfDc = P09AU2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AU2_n12997MetPieDfDc[0] ;
         A12995MetPieDfLi = P09AU2_A12995MetPieDfLi[0] ;
         A12997MetPieDfDc = P09AU2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AU2_n12997MetPieDfDc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09AU2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09AU2_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P09AU2_A129BarCod[0] == A129BarCod ) && ( P09AU2_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P09AU2_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P09AU2_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( P09AU2_A12996MetPieDfID[0] == A12996MetPieDfID ) ) )
            {
               if (true) break;
            }
            brk9AU2 = false ;
            A12995MetPieDfLi = P09AU2_A12995MetPieDfLi[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9AU2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A12997MetPieDfDc)==0) )
         {
            AV23Option = A12997MetPieDfDc ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AU2 )
         {
            brk9AU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMETPIEDFFASEOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMetPieDfFase = AV35SearchTxt ;
      AV21TFMetPieDfFase_Sel = "" ;
      AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV41EmprCod ;
      AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV42MetTerCod ;
      AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV43BarCod ;
      AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV44BarCodReo ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV45BarCodPar ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV46MetPieCod ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV40FilterFullText ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV10TFMetPieDfLin ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV11TFMetPieDfLin_To ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV12TFMetPieDfID ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV13TFMetPieDfID_To ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV14TFMetPieDfDc ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV15TFMetPieDfDc_Sel ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV16TFMetPieDfMin ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV17TFMetPieDfMin_To ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV18TFMetPieDfMax ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV19TFMetPieDfMax_To ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV20TFMetPieDfFase ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV21TFMetPieDfFase_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                           Short.valueOf(AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                           Short.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                           Short.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                           Short.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                           AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                           AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                           Short.valueOf(A12995MetPieDfLi) ,
                                           Short.valueOf(A12996MetPieDfID) ,
                                           A12997MetPieDfDc ,
                                           A12998MetPieDfMi ,
                                           A12999MetPieDfMa ,
                                           A13000MetPieDfFa ,
                                           A396EmprCod ,
                                           AV41EmprCod ,
                                           A2809MetTerCod ,
                                           AV42MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A2813MetPieCod ,
                                           AV46MetPieCod ,
                                           AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                           AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                           Integer.valueOf(AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                           Byte.valueOf(AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                           AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                           AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
      /* Using cursor P09AU3 */
      pr_default.execute(1, new Object[] {AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV41EmprCod, AV42MetTerCod, Integer.valueOf(AV43BarCod), Byte.valueOf(AV44BarCodReo), AV45BarCodPar, AV46MetPieCod, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9AU4 = false ;
         A396EmprCod = P09AU3_A396EmprCod[0] ;
         A2809MetTerCod = P09AU3_A2809MetTerCod[0] ;
         A129BarCod = P09AU3_A129BarCod[0] ;
         A132BarCodReo = P09AU3_A132BarCodReo[0] ;
         A130BarCodPar = P09AU3_A130BarCodPar[0] ;
         A2813MetPieCod = P09AU3_A2813MetPieCod[0] ;
         A13000MetPieDfFa = P09AU3_A13000MetPieDfFa[0] ;
         A12999MetPieDfMa = P09AU3_A12999MetPieDfMa[0] ;
         A12998MetPieDfMi = P09AU3_A12998MetPieDfMi[0] ;
         A12997MetPieDfDc = P09AU3_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AU3_n12997MetPieDfDc[0] ;
         A12996MetPieDfID = P09AU3_A12996MetPieDfID[0] ;
         A12995MetPieDfLi = P09AU3_A12995MetPieDfLi[0] ;
         A12997MetPieDfDc = P09AU3_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AU3_n12997MetPieDfDc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09AU3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09AU3_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P09AU3_A129BarCod[0] == A129BarCod ) && ( P09AU3_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P09AU3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P09AU3_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(P09AU3_A13000MetPieDfFa[0], A13000MetPieDfFa) == 0 ) ) )
            {
               if (true) break;
            }
            brk9AU4 = false ;
            A12995MetPieDfLi = P09AU3_A12995MetPieDfLi[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9AU4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13000MetPieDfFa)==0) )
         {
            AV23Option = A13000MetPieDfFa ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9AU4 )
         {
            brk9AU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webcontador_metrajepiezas_defectos_wcgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = webcontador_metrajepiezas_defectos_wcgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = webcontador_metrajepiezas_defectos_wcgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV14TFMetPieDfDc = "" ;
      AV15TFMetPieDfDc_Sel = "" ;
      AV16TFMetPieDfMin = DecimalUtil.ZERO ;
      AV17TFMetPieDfMin_To = DecimalUtil.ZERO ;
      AV18TFMetPieDfMax = DecimalUtil.ZERO ;
      AV19TFMetPieDfMax_To = DecimalUtil.ZERO ;
      AV20TFMetPieDfFase = "" ;
      AV21TFMetPieDfFase_Sel = "" ;
      AV41EmprCod = "" ;
      AV42MetTerCod = "" ;
      AV45BarCodPar = "" ;
      AV46MetPieCod = "" ;
      A12997MetPieDfDc = "" ;
      AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = "" ;
      AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = "" ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = "" ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = "" ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = "" ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = DecimalUtil.ZERO ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = DecimalUtil.ZERO ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = DecimalUtil.ZERO ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = DecimalUtil.ZERO ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = "" ;
      scmdbuf = "" ;
      lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      lV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      P09AU2_A396EmprCod = new String[] {""} ;
      P09AU2_A2809MetTerCod = new String[] {""} ;
      P09AU2_A129BarCod = new int[1] ;
      P09AU2_A132BarCodReo = new byte[1] ;
      P09AU2_A130BarCodPar = new String[] {""} ;
      P09AU2_A2813MetPieCod = new String[] {""} ;
      P09AU2_A12996MetPieDfID = new short[1] ;
      P09AU2_A13000MetPieDfFa = new String[] {""} ;
      P09AU2_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AU2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AU2_A12997MetPieDfDc = new String[] {""} ;
      P09AU2_n12997MetPieDfDc = new boolean[] {false} ;
      P09AU2_A12995MetPieDfLi = new short[1] ;
      AV23Option = "" ;
      P09AU3_A396EmprCod = new String[] {""} ;
      P09AU3_A2809MetTerCod = new String[] {""} ;
      P09AU3_A129BarCod = new int[1] ;
      P09AU3_A132BarCodReo = new byte[1] ;
      P09AU3_A130BarCodPar = new String[] {""} ;
      P09AU3_A2813MetPieCod = new String[] {""} ;
      P09AU3_A13000MetPieDfFa = new String[] {""} ;
      P09AU3_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AU3_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AU3_A12997MetPieDfDc = new String[] {""} ;
      P09AU3_n12997MetPieDfDc = new boolean[] {false} ;
      P09AU3_A12996MetPieDfID = new short[1] ;
      P09AU3_A12995MetPieDfLi = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09AU2_A396EmprCod, P09AU2_A2809MetTerCod, P09AU2_A129BarCod, P09AU2_A132BarCodReo, P09AU2_A130BarCodPar, P09AU2_A2813MetPieCod, P09AU2_A12996MetPieDfID, P09AU2_A13000MetPieDfFa, P09AU2_A12999MetPieDfMa, P09AU2_A12998MetPieDfMi,
            P09AU2_A12997MetPieDfDc, P09AU2_n12997MetPieDfDc, P09AU2_A12995MetPieDfLi
            }
            , new Object[] {
            P09AU3_A396EmprCod, P09AU3_A2809MetTerCod, P09AU3_A129BarCod, P09AU3_A132BarCodReo, P09AU3_A130BarCodPar, P09AU3_A2813MetPieCod, P09AU3_A13000MetPieDfFa, P09AU3_A12999MetPieDfMa, P09AU3_A12998MetPieDfMi, P09AU3_A12997MetPieDfDc,
            P09AU3_n12997MetPieDfDc, P09AU3_A12996MetPieDfID, P09AU3_A12995MetPieDfLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44BarCodReo ;
   private byte AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ;
   private byte A132BarCodReo ;
   private short AV10TFMetPieDfLin ;
   private short AV11TFMetPieDfLin_To ;
   private short AV12TFMetPieDfID ;
   private short AV13TFMetPieDfID_To ;
   private short AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ;
   private short AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ;
   private short AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ;
   private short AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ;
   private short A12995MetPieDfLi ;
   private short A12996MetPieDfID ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV43BarCod ;
   private int AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ;
   private int A129BarCod ;
   private int AV22InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV16TFMetPieDfMin ;
   private java.math.BigDecimal AV17TFMetPieDfMin_To ;
   private java.math.BigDecimal AV18TFMetPieDfMax ;
   private java.math.BigDecimal AV19TFMetPieDfMax_To ;
   private java.math.BigDecimal AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ;
   private java.math.BigDecimal AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ;
   private java.math.BigDecimal AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ;
   private java.math.BigDecimal AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal A12999MetPieDfMa ;
   private String AV14TFMetPieDfDc ;
   private String AV15TFMetPieDfDc_Sel ;
   private String AV20TFMetPieDfFase ;
   private String AV21TFMetPieDfFase_Sel ;
   private String AV41EmprCod ;
   private String AV42MetTerCod ;
   private String AV45BarCodPar ;
   private String AV46MetPieCod ;
   private String A12997MetPieDfDc ;
   private String AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ;
   private String AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ;
   private String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ;
   private String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod ;
   private String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ;
   private String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ;
   private String scmdbuf ;
   private String lV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String A13000MetPieDfFa ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private boolean returnInSub ;
   private boolean brk9AU2 ;
   private boolean n12997MetPieDfDc ;
   private boolean brk9AU4 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String lV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09AU2_A396EmprCod ;
   private String[] P09AU2_A2809MetTerCod ;
   private int[] P09AU2_A129BarCod ;
   private byte[] P09AU2_A132BarCodReo ;
   private String[] P09AU2_A130BarCodPar ;
   private String[] P09AU2_A2813MetPieCod ;
   private short[] P09AU2_A12996MetPieDfID ;
   private String[] P09AU2_A13000MetPieDfFa ;
   private java.math.BigDecimal[] P09AU2_A12999MetPieDfMa ;
   private java.math.BigDecimal[] P09AU2_A12998MetPieDfMi ;
   private String[] P09AU2_A12997MetPieDfDc ;
   private boolean[] P09AU2_n12997MetPieDfDc ;
   private short[] P09AU2_A12995MetPieDfLi ;
   private String[] P09AU3_A396EmprCod ;
   private String[] P09AU3_A2809MetTerCod ;
   private int[] P09AU3_A129BarCod ;
   private byte[] P09AU3_A132BarCodReo ;
   private String[] P09AU3_A130BarCodPar ;
   private String[] P09AU3_A2813MetPieCod ;
   private String[] P09AU3_A13000MetPieDfFa ;
   private java.math.BigDecimal[] P09AU3_A12999MetPieDfMa ;
   private java.math.BigDecimal[] P09AU3_A12998MetPieDfMi ;
   private String[] P09AU3_A12997MetPieDfDc ;
   private boolean[] P09AU3_n12997MetPieDfDc ;
   private short[] P09AU3_A12996MetPieDfID ;
   private short[] P09AU3_A12995MetPieDfLi ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class webcontador_metrajepiezas_defectos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          String A396EmprCod ,
                                          String AV41EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV42MetTerCod ,
                                          int A129BarCod ,
                                          int AV43BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV44BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV46MetPieCod ,
                                          String AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfID AS MetPieDfID, T1.MetPieDfFa, T1.MetPieDfMa, T1.MetPieDfMi, T2.TipDefDsc" ;
      scmdbuf += " AS MetPieDfDc, T1.MetPieDfLi FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09AU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          String A396EmprCod ,
                                          String AV41EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV42MetTerCod ,
                                          int A129BarCod ,
                                          int AV43BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV44BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV46MetPieCod ,
                                          String AV51Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV52Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV53Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV54Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfFa, T1.MetPieDfMa, T1.MetPieDfMi, T2.TipDefDsc AS MetPieDfDc, T1.MetPieDfID" ;
      scmdbuf += " AS MetPieDfID, T1.MetPieDfLi FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfFa" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P09AU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P09AU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

