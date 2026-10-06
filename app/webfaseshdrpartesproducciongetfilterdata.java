package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webfaseshdrpartesproducciongetfilterdata extends GXProcedure
{
   public webfaseshdrpartesproducciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webfaseshdrpartesproducciongetfilterdata.class ), "" );
   }

   public webfaseshdrpartesproducciongetfilterdata( int remoteHandle ,
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
      webfaseshdrpartesproducciongetfilterdata.this.aP5 = new String[] {""};
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
      webfaseshdrpartesproducciongetfilterdata.this.AV26DDOName = aP0;
      webfaseshdrpartesproducciongetfilterdata.this.AV24SearchTxt = aP1;
      webfaseshdrpartesproducciongetfilterdata.this.AV25SearchTxtTo = aP2;
      webfaseshdrpartesproducciongetfilterdata.this.aP3 = aP3;
      webfaseshdrpartesproducciongetfilterdata.this.aP4 = aP4;
      webfaseshdrpartesproducciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WebFasesHdrPartesProduccionGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebFasesHdrPartesProduccionGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WebFasesHdrPartesProduccionGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV10TFProCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV11TFProCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV12TFProDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV13TFProDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV14TFBarOrdLin = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarOrdLin_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV16TFMaqCodBis = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV17TFMaqCodBis_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV18TFFasCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV19TFFasCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV20TFFasDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV21TFFasDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV43TFBarFasEst_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV44TFBarFasEst_Sels.fromJSonString(AV43TFBarFasEst_SelsJson, null);
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProCod = AV24SearchTxt ;
      AV11TFProCod_Sel = "" ;
      AV49Webfaseshdrpartesproduccionds_1_filterfulltext = AV42FilterFullText ;
      AV50Webfaseshdrpartesproduccionds_2_tfprocod = AV10TFProCod ;
      AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV52Webfaseshdrpartesproduccionds_4_tfprodsc = AV12TFProDsc ;
      AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV54Webfaseshdrpartesproduccionds_6_tfbarordlin = AV14TFBarOrdLin ;
      AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to = AV15TFBarOrdLin_To ;
      AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis = AV16TFMaqCodBis ;
      AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV58Webfaseshdrpartesproduccionds_10_tffascod = AV18TFFasCod ;
      AV59Webfaseshdrpartesproduccionds_11_tffascod_sel = AV19TFFasCod_Sel ;
      AV60Webfaseshdrpartesproduccionds_12_tffasdsc = AV20TFFasDsc ;
      AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels = AV44TFBarFasEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                           AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                           AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                           AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                           AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                           AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                           Short.valueOf(AV54Webfaseshdrpartesproduccionds_6_tfbarordlin) ,
                                           Short.valueOf(AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to) ,
                                           AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                           AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                           AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                           AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                           AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                           AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                           Integer.valueOf(AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P08BI2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8BI2 = false ;
         A396EmprCod = P08BI2_A396EmprCod[0] ;
         A129BarCod = P08BI2_A129BarCod[0] ;
         A132BarCodReo = P08BI2_A132BarCodReo[0] ;
         A130BarCodPar = P08BI2_A130BarCodPar[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk8BI2 = false ;
            A396EmprCod = P08BI2_A396EmprCod[0] ;
            A129BarCod = P08BI2_A129BarCod[0] ;
            A132BarCodReo = P08BI2_A132BarCodReo[0] ;
            A130BarCodPar = P08BI2_A130BarCodPar[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BI2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV28Option = A758ProCod ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BI2 )
         {
            brk8BI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProDsc = AV24SearchTxt ;
      AV13TFProDsc_Sel = "" ;
      AV49Webfaseshdrpartesproduccionds_1_filterfulltext = AV42FilterFullText ;
      AV50Webfaseshdrpartesproduccionds_2_tfprocod = AV10TFProCod ;
      AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV52Webfaseshdrpartesproduccionds_4_tfprodsc = AV12TFProDsc ;
      AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV54Webfaseshdrpartesproduccionds_6_tfbarordlin = AV14TFBarOrdLin ;
      AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to = AV15TFBarOrdLin_To ;
      AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis = AV16TFMaqCodBis ;
      AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV58Webfaseshdrpartesproduccionds_10_tffascod = AV18TFFasCod ;
      AV59Webfaseshdrpartesproduccionds_11_tffascod_sel = AV19TFFasCod_Sel ;
      AV60Webfaseshdrpartesproduccionds_12_tffasdsc = AV20TFFasDsc ;
      AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels = AV44TFBarFasEst_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                           AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                           AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                           AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                           AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                           AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                           Short.valueOf(AV54Webfaseshdrpartesproduccionds_6_tfbarordlin) ,
                                           Short.valueOf(AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to) ,
                                           AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                           AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                           AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                           AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                           AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                           AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                           Integer.valueOf(AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P08BI3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8BI4 = false ;
         A396EmprCod = P08BI3_A396EmprCod[0] ;
         A129BarCod = P08BI3_A129BarCod[0] ;
         A132BarCodReo = P08BI3_A132BarCodReo[0] ;
         A130BarCodPar = P08BI3_A130BarCodPar[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08BI3_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8BI4 = false ;
            A129BarCod = P08BI3_A129BarCod[0] ;
            A132BarCodReo = P08BI3_A132BarCodReo[0] ;
            A130BarCodPar = P08BI3_A130BarCodPar[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BI4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV28Option = A759ProDsc ;
            AV27InsertIndex = 1 ;
            while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
            {
               AV27InsertIndex = (int)(AV27InsertIndex+1) ;
            }
            AV29Options.add(AV28Option, AV27InsertIndex);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BI4 )
         {
            brk8BI4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCodBis = AV24SearchTxt ;
      AV17TFMaqCodBis_Sel = "" ;
      AV49Webfaseshdrpartesproduccionds_1_filterfulltext = AV42FilterFullText ;
      AV50Webfaseshdrpartesproduccionds_2_tfprocod = AV10TFProCod ;
      AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV52Webfaseshdrpartesproduccionds_4_tfprodsc = AV12TFProDsc ;
      AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV54Webfaseshdrpartesproduccionds_6_tfbarordlin = AV14TFBarOrdLin ;
      AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to = AV15TFBarOrdLin_To ;
      AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis = AV16TFMaqCodBis ;
      AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV58Webfaseshdrpartesproduccionds_10_tffascod = AV18TFFasCod ;
      AV59Webfaseshdrpartesproduccionds_11_tffascod_sel = AV19TFFasCod_Sel ;
      AV60Webfaseshdrpartesproduccionds_12_tffasdsc = AV20TFFasDsc ;
      AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels = AV44TFBarFasEst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                           AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                           AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                           AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                           AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                           AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                           Short.valueOf(AV54Webfaseshdrpartesproduccionds_6_tfbarordlin) ,
                                           Short.valueOf(AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to) ,
                                           AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                           AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                           AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                           AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                           AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                           AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                           Integer.valueOf(AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P08BI4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8BI6 = false ;
         A396EmprCod = P08BI4_A396EmprCod[0] ;
         A129BarCod = P08BI4_A129BarCod[0] ;
         A132BarCodReo = P08BI4_A132BarCodReo[0] ;
         A130BarCodPar = P08BI4_A130BarCodPar[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk8BI6 = false ;
            A396EmprCod = P08BI4_A396EmprCod[0] ;
            A129BarCod = P08BI4_A129BarCod[0] ;
            A132BarCodReo = P08BI4_A132BarCodReo[0] ;
            A130BarCodPar = P08BI4_A130BarCodPar[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BI6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV28Option = A603MaqCodBis ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BI6 )
         {
            brk8BI6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFFasCod = AV24SearchTxt ;
      AV19TFFasCod_Sel = "" ;
      AV49Webfaseshdrpartesproduccionds_1_filterfulltext = AV42FilterFullText ;
      AV50Webfaseshdrpartesproduccionds_2_tfprocod = AV10TFProCod ;
      AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV52Webfaseshdrpartesproduccionds_4_tfprodsc = AV12TFProDsc ;
      AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV54Webfaseshdrpartesproduccionds_6_tfbarordlin = AV14TFBarOrdLin ;
      AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to = AV15TFBarOrdLin_To ;
      AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis = AV16TFMaqCodBis ;
      AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV58Webfaseshdrpartesproduccionds_10_tffascod = AV18TFFasCod ;
      AV59Webfaseshdrpartesproduccionds_11_tffascod_sel = AV19TFFasCod_Sel ;
      AV60Webfaseshdrpartesproduccionds_12_tffasdsc = AV20TFFasDsc ;
      AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels = AV44TFBarFasEst_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                           AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                           AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                           AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                           AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                           AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                           Short.valueOf(AV54Webfaseshdrpartesproduccionds_6_tfbarordlin) ,
                                           Short.valueOf(AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to) ,
                                           AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                           AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                           AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                           AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                           AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                           AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                           Integer.valueOf(AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P08BI5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8BI8 = false ;
         A396EmprCod = P08BI5_A396EmprCod[0] ;
         A129BarCod = P08BI5_A129BarCod[0] ;
         A132BarCodReo = P08BI5_A132BarCodReo[0] ;
         A130BarCodPar = P08BI5_A130BarCodPar[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) )
         {
            brk8BI8 = false ;
            A396EmprCod = P08BI5_A396EmprCod[0] ;
            A129BarCod = P08BI5_A129BarCod[0] ;
            A132BarCodReo = P08BI5_A132BarCodReo[0] ;
            A130BarCodPar = P08BI5_A130BarCodPar[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BI8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV28Option = A457FasCod ;
            AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV29Options.add(AV28Option, 0);
            AV32OptionsDesc.add(AV31OptionDesc, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BI8 )
         {
            brk8BI8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFFasDsc = AV24SearchTxt ;
      AV21TFFasDsc_Sel = "" ;
      AV49Webfaseshdrpartesproduccionds_1_filterfulltext = AV42FilterFullText ;
      AV50Webfaseshdrpartesproduccionds_2_tfprocod = AV10TFProCod ;
      AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel = AV11TFProCod_Sel ;
      AV52Webfaseshdrpartesproduccionds_4_tfprodsc = AV12TFProDsc ;
      AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV54Webfaseshdrpartesproduccionds_6_tfbarordlin = AV14TFBarOrdLin ;
      AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to = AV15TFBarOrdLin_To ;
      AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis = AV16TFMaqCodBis ;
      AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV58Webfaseshdrpartesproduccionds_10_tffascod = AV18TFFasCod ;
      AV59Webfaseshdrpartesproduccionds_11_tffascod_sel = AV19TFFasCod_Sel ;
      AV60Webfaseshdrpartesproduccionds_12_tffasdsc = AV20TFFasDsc ;
      AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel = AV21TFFasDsc_Sel ;
      AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels = AV44TFBarFasEst_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                           AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                           AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                           AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                           AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                           AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                           Short.valueOf(AV54Webfaseshdrpartesproduccionds_6_tfbarordlin) ,
                                           Short.valueOf(AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to) ,
                                           AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                           AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                           AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                           AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                           AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                           AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                           Integer.valueOf(AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels.size()) ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P08BI6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8BI10 = false ;
         A396EmprCod = P08BI6_A396EmprCod[0] ;
         A129BarCod = P08BI6_A129BarCod[0] ;
         A132BarCodReo = P08BI6_A132BarCodReo[0] ;
         A130BarCodPar = P08BI6_A130BarCodPar[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk8BI10 = false ;
            A396EmprCod = P08BI6_A396EmprCod[0] ;
            A129BarCod = P08BI6_A129BarCod[0] ;
            A132BarCodReo = P08BI6_A132BarCodReo[0] ;
            A130BarCodPar = P08BI6_A130BarCodPar[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8BI10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV28Option = A460FasDsc ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BI10 )
         {
            brk8BI10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webfaseshdrpartesproducciongetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = webfaseshdrpartesproducciongetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = webfaseshdrpartesproducciongetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV10TFProCod = "" ;
      AV11TFProCod_Sel = "" ;
      AV12TFProDsc = "" ;
      AV13TFProDsc_Sel = "" ;
      AV16TFMaqCodBis = "" ;
      AV17TFMaqCodBis_Sel = "" ;
      AV18TFFasCod = "" ;
      AV19TFFasCod_Sel = "" ;
      AV20TFFasDsc = "" ;
      AV21TFFasDsc_Sel = "" ;
      AV43TFBarFasEst_SelsJson = "" ;
      AV44TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      A758ProCod = "" ;
      AV49Webfaseshdrpartesproduccionds_1_filterfulltext = "" ;
      AV50Webfaseshdrpartesproduccionds_2_tfprocod = "" ;
      AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel = "" ;
      AV52Webfaseshdrpartesproduccionds_4_tfprodsc = "" ;
      AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel = "" ;
      AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis = "" ;
      AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel = "" ;
      AV58Webfaseshdrpartesproduccionds_10_tffascod = "" ;
      AV59Webfaseshdrpartesproduccionds_11_tffascod_sel = "" ;
      AV60Webfaseshdrpartesproduccionds_12_tffasdsc = "" ;
      AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel = "" ;
      AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      A759ProDsc = "" ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P08BI2_A396EmprCod = new String[] {""} ;
      P08BI2_A129BarCod = new int[1] ;
      P08BI2_A132BarCodReo = new byte[1] ;
      P08BI2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV28Option = "" ;
      P08BI3_A396EmprCod = new String[] {""} ;
      P08BI3_A129BarCod = new int[1] ;
      P08BI3_A132BarCodReo = new byte[1] ;
      P08BI3_A130BarCodPar = new String[] {""} ;
      P08BI4_A396EmprCod = new String[] {""} ;
      P08BI4_A129BarCod = new int[1] ;
      P08BI4_A132BarCodReo = new byte[1] ;
      P08BI4_A130BarCodPar = new String[] {""} ;
      P08BI5_A396EmprCod = new String[] {""} ;
      P08BI5_A129BarCod = new int[1] ;
      P08BI5_A132BarCodReo = new byte[1] ;
      P08BI5_A130BarCodPar = new String[] {""} ;
      AV31OptionDesc = "" ;
      P08BI6_A396EmprCod = new String[] {""} ;
      P08BI6_A129BarCod = new int[1] ;
      P08BI6_A132BarCodReo = new byte[1] ;
      P08BI6_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webfaseshdrpartesproducciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BI2_A396EmprCod, P08BI2_A129BarCod, P08BI2_A132BarCodReo, P08BI2_A130BarCodPar
            }
            , new Object[] {
            P08BI3_A396EmprCod, P08BI3_A129BarCod, P08BI3_A132BarCodReo, P08BI3_A130BarCodPar
            }
            , new Object[] {
            P08BI4_A396EmprCod, P08BI4_A129BarCod, P08BI4_A132BarCodReo, P08BI4_A130BarCodPar
            }
            , new Object[] {
            P08BI5_A396EmprCod, P08BI5_A129BarCod, P08BI5_A132BarCodReo, P08BI5_A130BarCodPar
            }
            , new Object[] {
            P08BI6_A396EmprCod, P08BI6_A129BarCod, P08BI6_A132BarCodReo, P08BI6_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private short AV14TFBarOrdLin ;
   private short AV15TFBarOrdLin_To ;
   private short AV54Webfaseshdrpartesproduccionds_6_tfbarordlin ;
   private short AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels_size ;
   private int A129BarCod ;
   private int AV27InsertIndex ;
   private long AV36count ;
   private String AV10TFProCod ;
   private String AV11TFProCod_Sel ;
   private String AV12TFProDsc ;
   private String AV13TFProDsc_Sel ;
   private String AV16TFMaqCodBis ;
   private String AV17TFMaqCodBis_Sel ;
   private String AV18TFFasCod ;
   private String AV19TFFasCod_Sel ;
   private String AV20TFFasDsc ;
   private String AV21TFFasDsc_Sel ;
   private String A758ProCod ;
   private String AV50Webfaseshdrpartesproduccionds_2_tfprocod ;
   private String AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ;
   private String AV52Webfaseshdrpartesproduccionds_4_tfprodsc ;
   private String AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ;
   private String AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ;
   private String AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ;
   private String AV58Webfaseshdrpartesproduccionds_10_tffascod ;
   private String AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ;
   private String AV60Webfaseshdrpartesproduccionds_12_tffasdsc ;
   private String AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ;
   private String scmdbuf ;
   private String A759ProDsc ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk8BI2 ;
   private boolean brk8BI4 ;
   private boolean brk8BI6 ;
   private boolean brk8BI8 ;
   private boolean brk8BI10 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV43TFBarFasEst_SelsJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV49Webfaseshdrpartesproduccionds_1_filterfulltext ;
   private String AV28Option ;
   private String AV31OptionDesc ;
   private GXSimpleCollection<Byte> AV44TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BI2_A396EmprCod ;
   private int[] P08BI2_A129BarCod ;
   private byte[] P08BI2_A132BarCodReo ;
   private String[] P08BI2_A130BarCodPar ;
   private String[] P08BI3_A396EmprCod ;
   private int[] P08BI3_A129BarCod ;
   private byte[] P08BI3_A132BarCodReo ;
   private String[] P08BI3_A130BarCodPar ;
   private String[] P08BI4_A396EmprCod ;
   private int[] P08BI4_A129BarCod ;
   private byte[] P08BI4_A132BarCodReo ;
   private String[] P08BI4_A130BarCodPar ;
   private String[] P08BI5_A396EmprCod ;
   private int[] P08BI5_A129BarCod ;
   private byte[] P08BI5_A132BarCodReo ;
   private String[] P08BI5_A130BarCodPar ;
   private String[] P08BI6_A396EmprCod ;
   private int[] P08BI6_A129BarCod ;
   private byte[] P08BI6_A132BarCodReo ;
   private String[] P08BI6_A130BarCodPar ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class webfaseshdrpartesproducciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                          String AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                          String AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                          String AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                          String AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                          String AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                          short AV54Webfaseshdrpartesproduccionds_6_tfbarordlin ,
                                          short AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to ,
                                          String AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                          String AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                          String AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                          String AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                          String AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                          String AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                          int AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      scmdbuf += sWhereString ;
      GXv_Object2[0] = scmdbuf ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_P08BI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                          String AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                          String AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                          String AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                          String AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                          String AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                          short AV54Webfaseshdrpartesproduccionds_6_tfbarordlin ,
                                          short AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to ,
                                          String AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                          String AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                          String AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                          String AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                          String AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                          String AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                          int AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object4[0] = scmdbuf ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P08BI4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                          String AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                          String AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                          String AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                          String AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                          String AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                          short AV54Webfaseshdrpartesproduccionds_6_tfbarordlin ,
                                          short AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to ,
                                          String AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                          String AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                          String AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                          String AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                          String AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                          String AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                          int AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      scmdbuf += sWhereString ;
      GXv_Object6[0] = scmdbuf ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08BI5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                          String AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                          String AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                          String AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                          String AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                          String AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                          short AV54Webfaseshdrpartesproduccionds_6_tfbarordlin ,
                                          short AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to ,
                                          String AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                          String AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                          String AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                          String AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                          String AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                          String AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                          int AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      scmdbuf += sWhereString ;
      GXv_Object8[0] = scmdbuf ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P08BI6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels ,
                                          String AV49Webfaseshdrpartesproduccionds_1_filterfulltext ,
                                          String AV51Webfaseshdrpartesproduccionds_3_tfprocod_sel ,
                                          String AV50Webfaseshdrpartesproduccionds_2_tfprocod ,
                                          String AV53Webfaseshdrpartesproduccionds_5_tfprodsc_sel ,
                                          String AV52Webfaseshdrpartesproduccionds_4_tfprodsc ,
                                          short AV54Webfaseshdrpartesproduccionds_6_tfbarordlin ,
                                          short AV55Webfaseshdrpartesproduccionds_7_tfbarordlin_to ,
                                          String AV57Webfaseshdrpartesproduccionds_9_tfmaqcodbis_sel ,
                                          String AV56Webfaseshdrpartesproduccionds_8_tfmaqcodbis ,
                                          String AV59Webfaseshdrpartesproduccionds_11_tffascod_sel ,
                                          String AV58Webfaseshdrpartesproduccionds_10_tffascod ,
                                          String AV61Webfaseshdrpartesproduccionds_13_tffasdsc_sel ,
                                          String AV60Webfaseshdrpartesproduccionds_12_tffasdsc ,
                                          int AV62Webfaseshdrpartesproduccionds_14_tfbarfasest_sels_size ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD" ;
      scmdbuf += sWhereString ;
      GXv_Object10[0] = scmdbuf ;
      return GXv_Object10 ;
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
                  return conditional_P08BI2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 1 :
                  return conditional_P08BI3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 2 :
                  return conditional_P08BI4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 3 :
                  return conditional_P08BI5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
            case 4 :
                  return conditional_P08BI6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BI4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BI5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BI6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
      }
   }

}

