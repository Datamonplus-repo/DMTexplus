package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdetinte_agrupacion_wwgetfilterdata extends GXProcedure
{
   public recetasdetinte_agrupacion_wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdetinte_agrupacion_wwgetfilterdata.class ), "" );
   }

   public recetasdetinte_agrupacion_wwgetfilterdata( int remoteHandle ,
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
      recetasdetinte_agrupacion_wwgetfilterdata.this.aP5 = new String[] {""};
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
      recetasdetinte_agrupacion_wwgetfilterdata.this.AV30DDOName = aP0;
      recetasdetinte_agrupacion_wwgetfilterdata.this.AV28SearchTxt = aP1;
      recetasdetinte_agrupacion_wwgetfilterdata.this.AV29SearchTxtTo = aP2;
      recetasdetinte_agrupacion_wwgetfilterdata.this.aP3 = aP3;
      recetasdetinte_agrupacion_wwgetfilterdata.this.aP4 = aP4;
      recetasdetinte_agrupacion_wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARAGRNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARAGRSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_BARAGRDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_COLNOMAGR") == 0 )
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
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("RecetasdeTinte_Agrupacion_WWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeTinte_Agrupacion_WWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("RecetasdeTinte_Agrupacion_WWGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV10TFBarAgrNhdr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV11TFBarAgrNhdr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV12TFCliCodAgr = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCodAgr_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV14TFBarAgrSer = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV15TFBarAgrSer_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV16TFBarAgrDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV17TFBarAgrDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV18TFColNomAgr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV19TFColNomAgr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV20TFColNumAgr = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFColNumAgr_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV22TFKgmAgr = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFKgmAgr_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV24TFMtrAgr = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFMtrAgr_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV26TFPieAgr = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFPieAgr_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARAGRNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarAgrNhdr = AV28SearchTxt ;
      AV11TFBarAgrNhdr_Sel = "" ;
      AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV12TFCliCodAgr ;
      AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV13TFCliCodAgr_To ;
      AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV14TFBarAgrSer ;
      AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV15TFBarAgrSer_Sel ;
      AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV16TFBarAgrDsc ;
      AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV17TFBarAgrDsc_Sel ;
      AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV18TFColNomAgr ;
      AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV19TFColNomAgr_Sel ;
      AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV20TFColNumAgr ;
      AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV21TFColNumAgr_To ;
      AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV22TFKgmAgr ;
      AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV23TFKgmAgr_To ;
      AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV24TFMtrAgr ;
      AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV25TFMtrAgr_To ;
      AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV26TFPieAgr ;
      AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV27TFPieAgr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                           AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                           Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                           Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                           AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                           AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                           AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                           AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                           AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                           AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                           Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                           Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                           AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                           AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                           AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                           AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                           Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                           Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           AV47Emprcod ,
                                           Integer.valueOf(AV48Barcod) ,
                                           Byte.valueOf(AV49Barcodreo) ,
                                           AV50Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
      lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
      lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
      lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
      /* Using cursor P09C02 */
      pr_default.execute(0, new Object[] {AV47Emprcod, Integer.valueOf(AV48Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09C02_A130BarCodPar[0] ;
         A132BarCodReo = P09C02_A132BarCodReo[0] ;
         A129BarCod = P09C02_A129BarCod[0] ;
         A396EmprCod = P09C02_A396EmprCod[0] ;
         A671PieAgr = P09C02_A671PieAgr[0] ;
         A869MtrAgr = P09C02_A869MtrAgr[0] ;
         A590KgmAgr = P09C02_A590KgmAgr[0] ;
         A1512ColNumAgr = P09C02_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09C02_A1510ColNomAgr[0] ;
         A1507BarAgrDsc = P09C02_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09C02_A1245BarAgrSer[0] ;
         A1508CliCodAgr = P09C02_A1508CliCodAgr[0] ;
         A122BarAgrPar = P09C02_A122BarAgrPar[0] ;
         A124BarAgrReo = P09C02_A124BarAgrReo[0] ;
         A119BarAgrCod = P09C02_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         if ( ! (GXutil.strcmp("", A13792BarAgrNhdr)==0) )
         {
            AV32Option = A13792BarAgrNhdr ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
            {
               AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
               AV40count = (long)(AV40count+1) ;
               AV38OptionIndexes.removeItem(AV31InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
            }
            else
            {
               AV33Options.add(AV32Option, AV31InsertIndex);
               AV38OptionIndexes.add("1", AV31InsertIndex);
            }
         }
         if ( AV33Options.size() == 50 )
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
      AV14TFBarAgrSer = AV28SearchTxt ;
      AV15TFBarAgrSer_Sel = "" ;
      AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV12TFCliCodAgr ;
      AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV13TFCliCodAgr_To ;
      AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV14TFBarAgrSer ;
      AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV15TFBarAgrSer_Sel ;
      AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV16TFBarAgrDsc ;
      AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV17TFBarAgrDsc_Sel ;
      AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV18TFColNomAgr ;
      AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV19TFColNomAgr_Sel ;
      AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV20TFColNumAgr ;
      AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV21TFColNumAgr_To ;
      AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV22TFKgmAgr ;
      AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV23TFKgmAgr_To ;
      AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV24TFMtrAgr ;
      AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV25TFMtrAgr_To ;
      AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV26TFPieAgr ;
      AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV27TFPieAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                           AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                           Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                           Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                           AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                           AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                           AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                           AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                           AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                           AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                           Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                           Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                           AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                           AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                           AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                           AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                           Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                           Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49Barcodreo) ,
                                           A130BarCodPar ,
                                           AV50Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
      lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
      lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
      lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
      /* Using cursor P09C03 */
      pr_default.execute(1, new Object[] {AV47Emprcod, Integer.valueOf(AV48Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9C03 = false ;
         A396EmprCod = P09C03_A396EmprCod[0] ;
         A129BarCod = P09C03_A129BarCod[0] ;
         A132BarCodReo = P09C03_A132BarCodReo[0] ;
         A130BarCodPar = P09C03_A130BarCodPar[0] ;
         A1245BarAgrSer = P09C03_A1245BarAgrSer[0] ;
         A671PieAgr = P09C03_A671PieAgr[0] ;
         A869MtrAgr = P09C03_A869MtrAgr[0] ;
         A590KgmAgr = P09C03_A590KgmAgr[0] ;
         A1512ColNumAgr = P09C03_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09C03_A1510ColNomAgr[0] ;
         A1507BarAgrDsc = P09C03_A1507BarAgrDsc[0] ;
         A1508CliCodAgr = P09C03_A1508CliCodAgr[0] ;
         A122BarAgrPar = P09C03_A122BarAgrPar[0] ;
         A124BarAgrReo = P09C03_A124BarAgrReo[0] ;
         A119BarAgrCod = P09C03_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09C03_A1245BarAgrSer[0], A1245BarAgrSer) == 0 ) )
         {
            brk9C03 = false ;
            A396EmprCod = P09C03_A396EmprCod[0] ;
            A129BarCod = P09C03_A129BarCod[0] ;
            A132BarCodReo = P09C03_A132BarCodReo[0] ;
            A130BarCodPar = P09C03_A130BarCodPar[0] ;
            A122BarAgrPar = P09C03_A122BarAgrPar[0] ;
            A124BarAgrReo = P09C03_A124BarAgrReo[0] ;
            A119BarAgrCod = P09C03_A119BarAgrCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9C03 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1245BarAgrSer)==0) )
         {
            AV32Option = A1245BarAgrSer ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9C03 )
         {
            brk9C03 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARAGRDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarAgrDsc = AV28SearchTxt ;
      AV17TFBarAgrDsc_Sel = "" ;
      AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV12TFCliCodAgr ;
      AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV13TFCliCodAgr_To ;
      AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV14TFBarAgrSer ;
      AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV15TFBarAgrSer_Sel ;
      AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV16TFBarAgrDsc ;
      AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV17TFBarAgrDsc_Sel ;
      AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV18TFColNomAgr ;
      AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV19TFColNomAgr_Sel ;
      AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV20TFColNumAgr ;
      AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV21TFColNumAgr_To ;
      AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV22TFKgmAgr ;
      AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV23TFKgmAgr_To ;
      AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV24TFMtrAgr ;
      AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV25TFMtrAgr_To ;
      AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV26TFPieAgr ;
      AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV27TFPieAgr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                           AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                           Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                           Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                           AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                           AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                           AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                           AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                           AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                           AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                           Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                           Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                           AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                           AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                           AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                           AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                           Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                           Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49Barcodreo) ,
                                           A130BarCodPar ,
                                           AV50Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
      lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
      lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
      lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
      /* Using cursor P09C04 */
      pr_default.execute(2, new Object[] {AV47Emprcod, Integer.valueOf(AV48Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9C05 = false ;
         A396EmprCod = P09C04_A396EmprCod[0] ;
         A129BarCod = P09C04_A129BarCod[0] ;
         A132BarCodReo = P09C04_A132BarCodReo[0] ;
         A130BarCodPar = P09C04_A130BarCodPar[0] ;
         A1507BarAgrDsc = P09C04_A1507BarAgrDsc[0] ;
         A671PieAgr = P09C04_A671PieAgr[0] ;
         A869MtrAgr = P09C04_A869MtrAgr[0] ;
         A590KgmAgr = P09C04_A590KgmAgr[0] ;
         A1512ColNumAgr = P09C04_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09C04_A1510ColNomAgr[0] ;
         A1245BarAgrSer = P09C04_A1245BarAgrSer[0] ;
         A1508CliCodAgr = P09C04_A1508CliCodAgr[0] ;
         A122BarAgrPar = P09C04_A122BarAgrPar[0] ;
         A124BarAgrReo = P09C04_A124BarAgrReo[0] ;
         A119BarAgrCod = P09C04_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09C04_A1507BarAgrDsc[0], A1507BarAgrDsc) == 0 ) )
         {
            brk9C05 = false ;
            A396EmprCod = P09C04_A396EmprCod[0] ;
            A129BarCod = P09C04_A129BarCod[0] ;
            A132BarCodReo = P09C04_A132BarCodReo[0] ;
            A130BarCodPar = P09C04_A130BarCodPar[0] ;
            A122BarAgrPar = P09C04_A122BarAgrPar[0] ;
            A124BarAgrReo = P09C04_A124BarAgrReo[0] ;
            A119BarAgrCod = P09C04_A119BarAgrCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9C05 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1507BarAgrDsc)==0) )
         {
            AV32Option = A1507BarAgrDsc ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9C05 )
         {
            brk9C05 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCOLNOMAGROPTIONS' Routine */
      returnInSub = false ;
      AV18TFColNomAgr = AV28SearchTxt ;
      AV19TFColNomAgr_Sel = "" ;
      AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = AV10TFBarAgrNhdr ;
      AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = AV11TFBarAgrNhdr_Sel ;
      AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr = AV12TFCliCodAgr ;
      AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to = AV13TFCliCodAgr_To ;
      AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = AV14TFBarAgrSer ;
      AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = AV15TFBarAgrSer_Sel ;
      AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = AV16TFBarAgrDsc ;
      AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = AV17TFBarAgrDsc_Sel ;
      AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = AV18TFColNomAgr ;
      AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = AV19TFColNomAgr_Sel ;
      AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr = AV20TFColNumAgr ;
      AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to = AV21TFColNumAgr_To ;
      AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr = AV22TFKgmAgr ;
      AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = AV23TFKgmAgr_To ;
      AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr = AV24TFMtrAgr ;
      AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = AV25TFMtrAgr_To ;
      AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr = AV26TFPieAgr ;
      AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to = AV27TFPieAgr_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                           AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                           Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) ,
                                           Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) ,
                                           AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                           AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                           AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                           AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                           AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                           AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                           Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) ,
                                           Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) ,
                                           AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                           AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                           AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                           AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                           Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) ,
                                           Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49Barcodreo) ,
                                           A130BarCodPar ,
                                           AV50Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr), 11, "%") ;
      lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = GXutil.padr( GXutil.rtrim( AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser), 16, "%") ;
      lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc), 26, "%") ;
      lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr), 13, "%") ;
      /* Using cursor P09C05 */
      pr_default.execute(3, new Object[] {AV47Emprcod, Integer.valueOf(AV48Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr, AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel, Integer.valueOf(AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr), Integer.valueOf(AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to), lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser, AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel, lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc, AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel, lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr, AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel, Integer.valueOf(AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr), Integer.valueOf(AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to), AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to, Short.valueOf(AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr), Short.valueOf(AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9C07 = false ;
         A396EmprCod = P09C05_A396EmprCod[0] ;
         A129BarCod = P09C05_A129BarCod[0] ;
         A132BarCodReo = P09C05_A132BarCodReo[0] ;
         A130BarCodPar = P09C05_A130BarCodPar[0] ;
         A1510ColNomAgr = P09C05_A1510ColNomAgr[0] ;
         A671PieAgr = P09C05_A671PieAgr[0] ;
         A869MtrAgr = P09C05_A869MtrAgr[0] ;
         A590KgmAgr = P09C05_A590KgmAgr[0] ;
         A1512ColNumAgr = P09C05_A1512ColNumAgr[0] ;
         A1507BarAgrDsc = P09C05_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09C05_A1245BarAgrSer[0] ;
         A1508CliCodAgr = P09C05_A1508CliCodAgr[0] ;
         A122BarAgrPar = P09C05_A122BarAgrPar[0] ;
         A124BarAgrReo = P09C05_A124BarAgrReo[0] ;
         A119BarAgrCod = P09C05_A119BarAgrCod[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09C05_A1510ColNomAgr[0], A1510ColNomAgr) == 0 ) )
         {
            brk9C07 = false ;
            A396EmprCod = P09C05_A396EmprCod[0] ;
            A129BarCod = P09C05_A129BarCod[0] ;
            A132BarCodReo = P09C05_A132BarCodReo[0] ;
            A130BarCodPar = P09C05_A130BarCodPar[0] ;
            A122BarAgrPar = P09C05_A122BarAgrPar[0] ;
            A124BarAgrReo = P09C05_A124BarAgrReo[0] ;
            A119BarAgrCod = P09C05_A119BarAgrCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9C07 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1510ColNomAgr)==0) )
         {
            AV32Option = A1510ColNomAgr ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9C07 )
         {
            brk9C07 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetasdetinte_agrupacion_wwgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = recetasdetinte_agrupacion_wwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = recetasdetinte_agrupacion_wwgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarAgrNhdr = "" ;
      AV11TFBarAgrNhdr_Sel = "" ;
      AV14TFBarAgrSer = "" ;
      AV15TFBarAgrSer_Sel = "" ;
      AV16TFBarAgrDsc = "" ;
      AV17TFBarAgrDsc_Sel = "" ;
      AV18TFColNomAgr = "" ;
      AV19TFColNomAgr_Sel = "" ;
      AV22TFKgmAgr = DecimalUtil.ZERO ;
      AV23TFKgmAgr_To = DecimalUtil.ZERO ;
      AV24TFMtrAgr = DecimalUtil.ZERO ;
      AV25TFMtrAgr_To = DecimalUtil.ZERO ;
      A13792BarAgrNhdr = "" ;
      AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = "" ;
      AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel = "" ;
      AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = "" ;
      AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel = "" ;
      AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = "" ;
      AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel = "" ;
      AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = "" ;
      AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel = "" ;
      AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr = DecimalUtil.ZERO ;
      AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to = DecimalUtil.ZERO ;
      AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr = DecimalUtil.ZERO ;
      AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr = "" ;
      lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser = "" ;
      lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc = "" ;
      lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr = "" ;
      A122BarAgrPar = "" ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      AV47Emprcod = "" ;
      AV50Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09C02_A130BarCodPar = new String[] {""} ;
      P09C02_A132BarCodReo = new byte[1] ;
      P09C02_A129BarCod = new int[1] ;
      P09C02_A396EmprCod = new String[] {""} ;
      P09C02_A671PieAgr = new short[1] ;
      P09C02_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C02_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C02_A1512ColNumAgr = new int[1] ;
      P09C02_A1510ColNomAgr = new String[] {""} ;
      P09C02_A1507BarAgrDsc = new String[] {""} ;
      P09C02_A1245BarAgrSer = new String[] {""} ;
      P09C02_A1508CliCodAgr = new int[1] ;
      P09C02_A122BarAgrPar = new String[] {""} ;
      P09C02_A124BarAgrReo = new byte[1] ;
      P09C02_A119BarAgrCod = new int[1] ;
      AV32Option = "" ;
      P09C03_A396EmprCod = new String[] {""} ;
      P09C03_A129BarCod = new int[1] ;
      P09C03_A132BarCodReo = new byte[1] ;
      P09C03_A130BarCodPar = new String[] {""} ;
      P09C03_A1245BarAgrSer = new String[] {""} ;
      P09C03_A671PieAgr = new short[1] ;
      P09C03_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C03_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C03_A1512ColNumAgr = new int[1] ;
      P09C03_A1510ColNomAgr = new String[] {""} ;
      P09C03_A1507BarAgrDsc = new String[] {""} ;
      P09C03_A1508CliCodAgr = new int[1] ;
      P09C03_A122BarAgrPar = new String[] {""} ;
      P09C03_A124BarAgrReo = new byte[1] ;
      P09C03_A119BarAgrCod = new int[1] ;
      P09C04_A396EmprCod = new String[] {""} ;
      P09C04_A129BarCod = new int[1] ;
      P09C04_A132BarCodReo = new byte[1] ;
      P09C04_A130BarCodPar = new String[] {""} ;
      P09C04_A1507BarAgrDsc = new String[] {""} ;
      P09C04_A671PieAgr = new short[1] ;
      P09C04_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C04_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C04_A1512ColNumAgr = new int[1] ;
      P09C04_A1510ColNomAgr = new String[] {""} ;
      P09C04_A1245BarAgrSer = new String[] {""} ;
      P09C04_A1508CliCodAgr = new int[1] ;
      P09C04_A122BarAgrPar = new String[] {""} ;
      P09C04_A124BarAgrReo = new byte[1] ;
      P09C04_A119BarAgrCod = new int[1] ;
      P09C05_A396EmprCod = new String[] {""} ;
      P09C05_A129BarCod = new int[1] ;
      P09C05_A132BarCodReo = new byte[1] ;
      P09C05_A130BarCodPar = new String[] {""} ;
      P09C05_A1510ColNomAgr = new String[] {""} ;
      P09C05_A671PieAgr = new short[1] ;
      P09C05_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C05_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C05_A1512ColNumAgr = new int[1] ;
      P09C05_A1507BarAgrDsc = new String[] {""} ;
      P09C05_A1245BarAgrSer = new String[] {""} ;
      P09C05_A1508CliCodAgr = new int[1] ;
      P09C05_A122BarAgrPar = new String[] {""} ;
      P09C05_A124BarAgrReo = new byte[1] ;
      P09C05_A119BarAgrCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09C02_A130BarCodPar, P09C02_A132BarCodReo, P09C02_A129BarCod, P09C02_A396EmprCod, P09C02_A671PieAgr, P09C02_A869MtrAgr, P09C02_A590KgmAgr, P09C02_A1512ColNumAgr, P09C02_A1510ColNomAgr, P09C02_A1507BarAgrDsc,
            P09C02_A1245BarAgrSer, P09C02_A1508CliCodAgr, P09C02_A122BarAgrPar, P09C02_A124BarAgrReo, P09C02_A119BarAgrCod
            }
            , new Object[] {
            P09C03_A396EmprCod, P09C03_A129BarCod, P09C03_A132BarCodReo, P09C03_A130BarCodPar, P09C03_A1245BarAgrSer, P09C03_A671PieAgr, P09C03_A869MtrAgr, P09C03_A590KgmAgr, P09C03_A1512ColNumAgr, P09C03_A1510ColNomAgr,
            P09C03_A1507BarAgrDsc, P09C03_A1508CliCodAgr, P09C03_A122BarAgrPar, P09C03_A124BarAgrReo, P09C03_A119BarAgrCod
            }
            , new Object[] {
            P09C04_A396EmprCod, P09C04_A129BarCod, P09C04_A132BarCodReo, P09C04_A130BarCodPar, P09C04_A1507BarAgrDsc, P09C04_A671PieAgr, P09C04_A869MtrAgr, P09C04_A590KgmAgr, P09C04_A1512ColNumAgr, P09C04_A1510ColNomAgr,
            P09C04_A1245BarAgrSer, P09C04_A1508CliCodAgr, P09C04_A122BarAgrPar, P09C04_A124BarAgrReo, P09C04_A119BarAgrCod
            }
            , new Object[] {
            P09C05_A396EmprCod, P09C05_A129BarCod, P09C05_A132BarCodReo, P09C05_A130BarCodPar, P09C05_A1510ColNomAgr, P09C05_A671PieAgr, P09C05_A869MtrAgr, P09C05_A590KgmAgr, P09C05_A1512ColNumAgr, P09C05_A1507BarAgrDsc,
            P09C05_A1245BarAgrSer, P09C05_A1508CliCodAgr, P09C05_A122BarAgrPar, P09C05_A124BarAgrReo, P09C05_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte AV49Barcodreo ;
   private byte A132BarCodReo ;
   private short AV26TFPieAgr ;
   private short AV27TFPieAgr_To ;
   private short AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr ;
   private short AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV12TFCliCodAgr ;
   private int AV13TFCliCodAgr_To ;
   private int AV20TFColNumAgr ;
   private int AV21TFColNumAgr_To ;
   private int AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr ;
   private int AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ;
   private int AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ;
   private int AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int AV48Barcod ;
   private int A129BarCod ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV22TFKgmAgr ;
   private java.math.BigDecimal AV23TFKgmAgr_To ;
   private java.math.BigDecimal AV24TFMtrAgr ;
   private java.math.BigDecimal AV25TFMtrAgr_To ;
   private java.math.BigDecimal AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ;
   private java.math.BigDecimal AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ;
   private java.math.BigDecimal AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ;
   private java.math.BigDecimal AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String AV10TFBarAgrNhdr ;
   private String AV11TFBarAgrNhdr_Sel ;
   private String AV14TFBarAgrSer ;
   private String AV15TFBarAgrSer_Sel ;
   private String AV16TFBarAgrDsc ;
   private String AV17TFBarAgrDsc_Sel ;
   private String AV18TFColNomAgr ;
   private String AV19TFColNomAgr_Sel ;
   private String A13792BarAgrNhdr ;
   private String AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ;
   private String AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ;
   private String AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ;
   private String AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ;
   private String AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ;
   private String AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ;
   private String AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ;
   private String AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ;
   private String scmdbuf ;
   private String lV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ;
   private String lV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ;
   private String lV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ;
   private String lV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ;
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String AV47Emprcod ;
   private String AV50Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9C03 ;
   private boolean brk9C05 ;
   private boolean brk9C07 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09C02_A130BarCodPar ;
   private byte[] P09C02_A132BarCodReo ;
   private int[] P09C02_A129BarCod ;
   private String[] P09C02_A396EmprCod ;
   private short[] P09C02_A671PieAgr ;
   private java.math.BigDecimal[] P09C02_A869MtrAgr ;
   private java.math.BigDecimal[] P09C02_A590KgmAgr ;
   private int[] P09C02_A1512ColNumAgr ;
   private String[] P09C02_A1510ColNomAgr ;
   private String[] P09C02_A1507BarAgrDsc ;
   private String[] P09C02_A1245BarAgrSer ;
   private int[] P09C02_A1508CliCodAgr ;
   private String[] P09C02_A122BarAgrPar ;
   private byte[] P09C02_A124BarAgrReo ;
   private int[] P09C02_A119BarAgrCod ;
   private String[] P09C03_A396EmprCod ;
   private int[] P09C03_A129BarCod ;
   private byte[] P09C03_A132BarCodReo ;
   private String[] P09C03_A130BarCodPar ;
   private String[] P09C03_A1245BarAgrSer ;
   private short[] P09C03_A671PieAgr ;
   private java.math.BigDecimal[] P09C03_A869MtrAgr ;
   private java.math.BigDecimal[] P09C03_A590KgmAgr ;
   private int[] P09C03_A1512ColNumAgr ;
   private String[] P09C03_A1510ColNomAgr ;
   private String[] P09C03_A1507BarAgrDsc ;
   private int[] P09C03_A1508CliCodAgr ;
   private String[] P09C03_A122BarAgrPar ;
   private byte[] P09C03_A124BarAgrReo ;
   private int[] P09C03_A119BarAgrCod ;
   private String[] P09C04_A396EmprCod ;
   private int[] P09C04_A129BarCod ;
   private byte[] P09C04_A132BarCodReo ;
   private String[] P09C04_A130BarCodPar ;
   private String[] P09C04_A1507BarAgrDsc ;
   private short[] P09C04_A671PieAgr ;
   private java.math.BigDecimal[] P09C04_A869MtrAgr ;
   private java.math.BigDecimal[] P09C04_A590KgmAgr ;
   private int[] P09C04_A1512ColNumAgr ;
   private String[] P09C04_A1510ColNomAgr ;
   private String[] P09C04_A1245BarAgrSer ;
   private int[] P09C04_A1508CliCodAgr ;
   private String[] P09C04_A122BarAgrPar ;
   private byte[] P09C04_A124BarAgrReo ;
   private int[] P09C04_A119BarAgrCod ;
   private String[] P09C05_A396EmprCod ;
   private int[] P09C05_A129BarCod ;
   private byte[] P09C05_A132BarCodReo ;
   private String[] P09C05_A130BarCodPar ;
   private String[] P09C05_A1510ColNomAgr ;
   private short[] P09C05_A671PieAgr ;
   private java.math.BigDecimal[] P09C05_A869MtrAgr ;
   private java.math.BigDecimal[] P09C05_A590KgmAgr ;
   private int[] P09C05_A1512ColNumAgr ;
   private String[] P09C05_A1507BarAgrDsc ;
   private String[] P09C05_A1245BarAgrSer ;
   private int[] P09C05_A1508CliCodAgr ;
   private String[] P09C05_A122BarAgrPar ;
   private byte[] P09C05_A124BarAgrReo ;
   private int[] P09C05_A119BarAgrCod ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class recetasdetinte_agrupacion_wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09C02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String AV47Emprcod ,
                                          int AV48Barcod ,
                                          byte AV49Barcodreo ,
                                          String AV50Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, PieAgr, MtrAgr, KgmAgr, ColNumAgr, ColNomAgr, BarAgrDsc, BarAgrSer, CliCodAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM" ;
      scmdbuf += " TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09C03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          int A129BarCod ,
                                          int AV48Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrSer, PieAgr, MtrAgr, KgmAgr, ColNumAgr, ColNomAgr, BarAgrDsc, CliCodAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM" ;
      scmdbuf += " TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarAgrSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09C04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          int A129BarCod ,
                                          int AV48Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrDsc, PieAgr, MtrAgr, KgmAgr, ColNumAgr, ColNomAgr, BarAgrSer, CliCodAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM" ;
      scmdbuf += " TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarAgrDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09C05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel ,
                                          String AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr ,
                                          int AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr ,
                                          int AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to ,
                                          String AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel ,
                                          String AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser ,
                                          String AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel ,
                                          String AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc ,
                                          String AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel ,
                                          String AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr ,
                                          int AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr ,
                                          int AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to ,
                                          java.math.BigDecimal AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr ,
                                          java.math.BigDecimal AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to ,
                                          java.math.BigDecimal AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr ,
                                          java.math.BigDecimal AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to ,
                                          short AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr ,
                                          short AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          int A1508CliCodAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          int A129BarCod ,
                                          int AV48Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV49Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV50Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ColNomAgr, PieAgr, MtrAgr, KgmAgr, ColNumAgr, BarAgrDsc, BarAgrSer, CliCodAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM" ;
      scmdbuf += " TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdetinte_agrupacion_wwds_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdetinte_agrupacion_wwds_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdetinte_agrupacion_wwds_3_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdetinte_agrupacion_wwds_4_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV59Recetasdetinte_agrupacion_wwds_5_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Recetasdetinte_agrupacion_wwds_6_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdetinte_agrupacion_wwds_7_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdetinte_agrupacion_wwds_8_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdetinte_agrupacion_wwds_9_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdetinte_agrupacion_wwds_10_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Recetasdetinte_agrupacion_wwds_11_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Recetasdetinte_agrupacion_wwds_12_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Recetasdetinte_agrupacion_wwds_13_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Recetasdetinte_agrupacion_wwds_14_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Recetasdetinte_agrupacion_wwds_15_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Recetasdetinte_agrupacion_wwds_16_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Recetasdetinte_agrupacion_wwds_17_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Recetasdetinte_agrupacion_wwds_18_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ColNomAgr" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09C02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P09C03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P09C04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 3 :
                  return conditional_P09C05(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09C02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09C03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09C04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09C05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
      }
   }

}

