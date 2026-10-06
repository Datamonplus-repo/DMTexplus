package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class analisiscostesbasicosdetalle_wcgetfilterdata extends GXProcedure
{
   public analisiscostesbasicosdetalle_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscostesbasicosdetalle_wcgetfilterdata.class ), "" );
   }

   public analisiscostesbasicosdetalle_wcgetfilterdata( int remoteHandle ,
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
      analisiscostesbasicosdetalle_wcgetfilterdata.this.aP5 = new String[] {""};
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
      analisiscostesbasicosdetalle_wcgetfilterdata.this.AV22DDOName = aP0;
      analisiscostesbasicosdetalle_wcgetfilterdata.this.AV20SearchTxt = aP1;
      analisiscostesbasicosdetalle_wcgetfilterdata.this.AV21SearchTxtTo = aP2;
      analisiscostesbasicosdetalle_wcgetfilterdata.this.aP3 = aP3;
      analisiscostesbasicosdetalle_wcgetfilterdata.this.aP4 = aP4;
      analisiscostesbasicosdetalle_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_MAQCODBIS") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARUNIMED") == 0 )
      {
         /* Execute user subroutine: 'LOADBARUNIMEDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("AnalisisCostesBasicosDetalle_WCGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnalisisCostesBasicosDetalle_WCGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("AnalisisCostesBasicosDetalle_WCGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV10TFBarOrdLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarOrdLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV16TFMaqCodBis = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV17TFMaqCodBis_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED") == 0 )
         {
            AV18TFBarUniMed = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED_SEL") == 0 )
         {
            AV19TFBarUniMed_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV39TFBarTieRea = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFBarTieRea_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV41TFBarTieTeo = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFBarTieTeo_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV56Barcod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV57Barcodreo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV58BarCodpar = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV20SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV63Analisiscostesbasicosdetalle_wcds_1_emprcod = AV55Emprcod ;
      AV64Analisiscostesbasicosdetalle_wcds_2_barcod = AV56Barcod ;
      AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV57Barcodreo ;
      AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV58BarCodpar ;
      AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV38FilterFullText ;
      AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV70Analisiscostesbasicosdetalle_wcds_8_tffascod = AV12TFFasCod ;
      AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV18TFBarUniMed ;
      AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV19TFBarUniMed_Sel ;
      AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV39TFBarTieRea ;
      AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV40TFBarTieRea_To ;
      AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV41TFBarTieTeo ;
      AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV42TFBarTieTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV70Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor P093H2 */
      pr_default.execute(0, new Object[] {AV63Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV70Analisiscostesbasicosdetalle_wcds_8_tffascod, AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk93H2 = false ;
         A396EmprCod = P093H2_A396EmprCod[0] ;
         A129BarCod = P093H2_A129BarCod[0] ;
         A132BarCodReo = P093H2_A132BarCodReo[0] ;
         A130BarCodPar = P093H2_A130BarCodPar[0] ;
         A457FasCod = P093H2_A457FasCod[0] ;
         A216BarTieTeo = P093H2_A216BarTieTeo[0] ;
         A215BarTieRea = P093H2_A215BarTieRea[0] ;
         A228BarUniMed = P093H2_A228BarUniMed[0] ;
         A603MaqCodBis = P093H2_A603MaqCodBis[0] ;
         A460FasDsc = P093H2_A460FasDsc[0] ;
         A194BarOrdLin = P093H2_A194BarOrdLin[0] ;
         A758ProCod = P093H2_A758ProCod[0] ;
         A228BarUniMed = P093H2_A228BarUniMed[0] ;
         A460FasDsc = P093H2_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P093H2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P093H2_A129BarCod[0] == A129BarCod ) && ( P093H2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P093H2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P093H2_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk93H2 = false ;
            A194BarOrdLin = P093H2_A194BarOrdLin[0] ;
            A758ProCod = P093H2_A758ProCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk93H2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV24Option = A457FasCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93H2 )
         {
            brk93H2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV20SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV63Analisiscostesbasicosdetalle_wcds_1_emprcod = AV55Emprcod ;
      AV64Analisiscostesbasicosdetalle_wcds_2_barcod = AV56Barcod ;
      AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV57Barcodreo ;
      AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV58BarCodpar ;
      AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV38FilterFullText ;
      AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV70Analisiscostesbasicosdetalle_wcds_8_tffascod = AV12TFFasCod ;
      AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV18TFBarUniMed ;
      AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV19TFBarUniMed_Sel ;
      AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV39TFBarTieRea ;
      AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV40TFBarTieRea_To ;
      AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV41TFBarTieTeo ;
      AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV42TFBarTieTeo_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV70Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor P093H3 */
      pr_default.execute(1, new Object[] {AV63Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV70Analisiscostesbasicosdetalle_wcds_8_tffascod, AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk93H4 = false ;
         A396EmprCod = P093H3_A396EmprCod[0] ;
         A129BarCod = P093H3_A129BarCod[0] ;
         A132BarCodReo = P093H3_A132BarCodReo[0] ;
         A130BarCodPar = P093H3_A130BarCodPar[0] ;
         A460FasDsc = P093H3_A460FasDsc[0] ;
         A216BarTieTeo = P093H3_A216BarTieTeo[0] ;
         A215BarTieRea = P093H3_A215BarTieRea[0] ;
         A228BarUniMed = P093H3_A228BarUniMed[0] ;
         A603MaqCodBis = P093H3_A603MaqCodBis[0] ;
         A457FasCod = P093H3_A457FasCod[0] ;
         A194BarOrdLin = P093H3_A194BarOrdLin[0] ;
         A758ProCod = P093H3_A758ProCod[0] ;
         A228BarUniMed = P093H3_A228BarUniMed[0] ;
         A460FasDsc = P093H3_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P093H3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P093H3_A129BarCod[0] == A129BarCod ) && ( P093H3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P093H3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P093H3_A460FasDsc[0], A460FasDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brk93H4 = false ;
            A457FasCod = P093H3_A457FasCod[0] ;
            A194BarOrdLin = P093H3_A194BarOrdLin[0] ;
            A758ProCod = P093H3_A758ProCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk93H4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV24Option = A460FasDsc ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93H4 )
         {
            brk93H4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCodBis = AV20SearchTxt ;
      AV17TFMaqCodBis_Sel = "" ;
      AV63Analisiscostesbasicosdetalle_wcds_1_emprcod = AV55Emprcod ;
      AV64Analisiscostesbasicosdetalle_wcds_2_barcod = AV56Barcod ;
      AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV57Barcodreo ;
      AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV58BarCodpar ;
      AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV38FilterFullText ;
      AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV70Analisiscostesbasicosdetalle_wcds_8_tffascod = AV12TFFasCod ;
      AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV18TFBarUniMed ;
      AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV19TFBarUniMed_Sel ;
      AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV39TFBarTieRea ;
      AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV40TFBarTieRea_To ;
      AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV41TFBarTieTeo ;
      AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV42TFBarTieTeo_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV70Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor P093H4 */
      pr_default.execute(2, new Object[] {AV63Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV70Analisiscostesbasicosdetalle_wcds_8_tffascod, AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk93H6 = false ;
         A396EmprCod = P093H4_A396EmprCod[0] ;
         A129BarCod = P093H4_A129BarCod[0] ;
         A132BarCodReo = P093H4_A132BarCodReo[0] ;
         A130BarCodPar = P093H4_A130BarCodPar[0] ;
         A603MaqCodBis = P093H4_A603MaqCodBis[0] ;
         A216BarTieTeo = P093H4_A216BarTieTeo[0] ;
         A215BarTieRea = P093H4_A215BarTieRea[0] ;
         A228BarUniMed = P093H4_A228BarUniMed[0] ;
         A460FasDsc = P093H4_A460FasDsc[0] ;
         A457FasCod = P093H4_A457FasCod[0] ;
         A194BarOrdLin = P093H4_A194BarOrdLin[0] ;
         A758ProCod = P093H4_A758ProCod[0] ;
         A228BarUniMed = P093H4_A228BarUniMed[0] ;
         A460FasDsc = P093H4_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P093H4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P093H4_A129BarCod[0] == A129BarCod ) && ( P093H4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P093H4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P093H4_A603MaqCodBis[0], A603MaqCodBis) == 0 ) ) )
            {
               if (true) break;
            }
            brk93H6 = false ;
            A194BarOrdLin = P093H4_A194BarOrdLin[0] ;
            A758ProCod = P093H4_A758ProCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk93H6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV24Option = A603MaqCodBis ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93H6 )
         {
            brk93H6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARUNIMEDOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarUniMed = AV20SearchTxt ;
      AV19TFBarUniMed_Sel = "" ;
      AV63Analisiscostesbasicosdetalle_wcds_1_emprcod = AV55Emprcod ;
      AV64Analisiscostesbasicosdetalle_wcds_2_barcod = AV56Barcod ;
      AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV57Barcodreo ;
      AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV58BarCodpar ;
      AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV38FilterFullText ;
      AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV10TFBarOrdLin ;
      AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV70Analisiscostesbasicosdetalle_wcds_8_tffascod = AV12TFFasCod ;
      AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV13TFFasCod_Sel ;
      AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV14TFFasDsc ;
      AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV16TFMaqCodBis ;
      AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV18TFBarUniMed ;
      AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV19TFBarUniMed_Sel ;
      AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV39TFBarTieRea ;
      AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV40TFBarTieRea_To ;
      AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV41TFBarTieTeo ;
      AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV42TFBarTieTeo_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV70Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor P093H5 */
      pr_default.execute(3, new Object[] {AV63Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV64Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV70Analisiscostesbasicosdetalle_wcds_8_tffascod, AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk93H8 = false ;
         A396EmprCod = P093H5_A396EmprCod[0] ;
         A129BarCod = P093H5_A129BarCod[0] ;
         A132BarCodReo = P093H5_A132BarCodReo[0] ;
         A130BarCodPar = P093H5_A130BarCodPar[0] ;
         A228BarUniMed = P093H5_A228BarUniMed[0] ;
         A216BarTieTeo = P093H5_A216BarTieTeo[0] ;
         A215BarTieRea = P093H5_A215BarTieRea[0] ;
         A603MaqCodBis = P093H5_A603MaqCodBis[0] ;
         A460FasDsc = P093H5_A460FasDsc[0] ;
         A457FasCod = P093H5_A457FasCod[0] ;
         A194BarOrdLin = P093H5_A194BarOrdLin[0] ;
         A758ProCod = P093H5_A758ProCod[0] ;
         A228BarUniMed = P093H5_A228BarUniMed[0] ;
         A460FasDsc = P093H5_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P093H5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P093H5_A129BarCod[0] == A129BarCod ) && ( P093H5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P093H5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P093H5_A228BarUniMed[0], A228BarUniMed) == 0 ) ) )
            {
               if (true) break;
            }
            brk93H8 = false ;
            A194BarOrdLin = P093H5_A194BarOrdLin[0] ;
            A758ProCod = P093H5_A758ProCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk93H8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A228BarUniMed)==0) )
         {
            AV24Option = A228BarUniMed ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A228BarUniMed, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93H8 )
         {
            brk93H8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = analisiscostesbasicosdetalle_wcgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = analisiscostesbasicosdetalle_wcgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = analisiscostesbasicosdetalle_wcgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFMaqCodBis = "" ;
      AV17TFMaqCodBis_Sel = "" ;
      AV18TFBarUniMed = "" ;
      AV19TFBarUniMed_Sel = "" ;
      AV39TFBarTieRea = DecimalUtil.ZERO ;
      AV40TFBarTieRea_To = DecimalUtil.ZERO ;
      AV41TFBarTieTeo = DecimalUtil.ZERO ;
      AV42TFBarTieTeo_To = DecimalUtil.ZERO ;
      AV55Emprcod = "" ;
      AV58BarCodpar = "" ;
      A457FasCod = "" ;
      AV63Analisiscostesbasicosdetalle_wcds_1_emprcod = "" ;
      AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar = "" ;
      AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      AV70Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = "" ;
      AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = "" ;
      AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = "" ;
      AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = "" ;
      AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea = DecimalUtil.ZERO ;
      AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = DecimalUtil.ZERO ;
      AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = DecimalUtil.ZERO ;
      AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      lV70Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A228BarUniMed = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P093H2_A396EmprCod = new String[] {""} ;
      P093H2_A129BarCod = new int[1] ;
      P093H2_A132BarCodReo = new byte[1] ;
      P093H2_A130BarCodPar = new String[] {""} ;
      P093H2_A457FasCod = new String[] {""} ;
      P093H2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H2_A228BarUniMed = new String[] {""} ;
      P093H2_A603MaqCodBis = new String[] {""} ;
      P093H2_A460FasDsc = new String[] {""} ;
      P093H2_A194BarOrdLin = new short[1] ;
      P093H2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV24Option = "" ;
      AV27OptionDesc = "" ;
      P093H3_A396EmprCod = new String[] {""} ;
      P093H3_A129BarCod = new int[1] ;
      P093H3_A132BarCodReo = new byte[1] ;
      P093H3_A130BarCodPar = new String[] {""} ;
      P093H3_A460FasDsc = new String[] {""} ;
      P093H3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H3_A228BarUniMed = new String[] {""} ;
      P093H3_A603MaqCodBis = new String[] {""} ;
      P093H3_A457FasCod = new String[] {""} ;
      P093H3_A194BarOrdLin = new short[1] ;
      P093H3_A758ProCod = new String[] {""} ;
      P093H4_A396EmprCod = new String[] {""} ;
      P093H4_A129BarCod = new int[1] ;
      P093H4_A132BarCodReo = new byte[1] ;
      P093H4_A130BarCodPar = new String[] {""} ;
      P093H4_A603MaqCodBis = new String[] {""} ;
      P093H4_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H4_A228BarUniMed = new String[] {""} ;
      P093H4_A460FasDsc = new String[] {""} ;
      P093H4_A457FasCod = new String[] {""} ;
      P093H4_A194BarOrdLin = new short[1] ;
      P093H4_A758ProCod = new String[] {""} ;
      P093H5_A396EmprCod = new String[] {""} ;
      P093H5_A129BarCod = new int[1] ;
      P093H5_A132BarCodReo = new byte[1] ;
      P093H5_A130BarCodPar = new String[] {""} ;
      P093H5_A228BarUniMed = new String[] {""} ;
      P093H5_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H5_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093H5_A603MaqCodBis = new String[] {""} ;
      P093H5_A460FasDsc = new String[] {""} ;
      P093H5_A457FasCod = new String[] {""} ;
      P093H5_A194BarOrdLin = new short[1] ;
      P093H5_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicosdetalle_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P093H2_A396EmprCod, P093H2_A129BarCod, P093H2_A132BarCodReo, P093H2_A130BarCodPar, P093H2_A457FasCod, P093H2_A216BarTieTeo, P093H2_A215BarTieRea, P093H2_A228BarUniMed, P093H2_A603MaqCodBis, P093H2_A460FasDsc,
            P093H2_A194BarOrdLin, P093H2_A758ProCod
            }
            , new Object[] {
            P093H3_A396EmprCod, P093H3_A129BarCod, P093H3_A132BarCodReo, P093H3_A130BarCodPar, P093H3_A460FasDsc, P093H3_A216BarTieTeo, P093H3_A215BarTieRea, P093H3_A228BarUniMed, P093H3_A603MaqCodBis, P093H3_A457FasCod,
            P093H3_A194BarOrdLin, P093H3_A758ProCod
            }
            , new Object[] {
            P093H4_A396EmprCod, P093H4_A129BarCod, P093H4_A132BarCodReo, P093H4_A130BarCodPar, P093H4_A603MaqCodBis, P093H4_A216BarTieTeo, P093H4_A215BarTieRea, P093H4_A228BarUniMed, P093H4_A460FasDsc, P093H4_A457FasCod,
            P093H4_A194BarOrdLin, P093H4_A758ProCod
            }
            , new Object[] {
            P093H5_A396EmprCod, P093H5_A129BarCod, P093H5_A132BarCodReo, P093H5_A130BarCodPar, P093H5_A228BarUniMed, P093H5_A216BarTieTeo, P093H5_A215BarTieRea, P093H5_A603MaqCodBis, P093H5_A460FasDsc, P093H5_A457FasCod,
            P093H5_A194BarOrdLin, P093H5_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV57Barcodreo ;
   private byte AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ;
   private short AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV56Barcod ;
   private int AV64Analisiscostesbasicosdetalle_wcds_2_barcod ;
   private int A129BarCod ;
   private long AV32count ;
   private java.math.BigDecimal AV39TFBarTieRea ;
   private java.math.BigDecimal AV40TFBarTieRea_To ;
   private java.math.BigDecimal AV41TFBarTieTeo ;
   private java.math.BigDecimal AV42TFBarTieTeo_To ;
   private java.math.BigDecimal AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ;
   private java.math.BigDecimal AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ;
   private java.math.BigDecimal AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ;
   private java.math.BigDecimal AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A216BarTieTeo ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFMaqCodBis ;
   private String AV17TFMaqCodBis_Sel ;
   private String AV18TFBarUniMed ;
   private String AV19TFBarUniMed_Sel ;
   private String AV55Emprcod ;
   private String AV58BarCodpar ;
   private String A457FasCod ;
   private String AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ;
   private String AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ;
   private String AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ;
   private String AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ;
   private String AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ;
   private String AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ;
   private String scmdbuf ;
   private String lV70Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String lV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String lV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String lV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A228BarUniMed ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private boolean brk93H2 ;
   private boolean brk93H4 ;
   private boolean brk93H6 ;
   private boolean brk93H8 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String lV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String AV24Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P093H2_A396EmprCod ;
   private int[] P093H2_A129BarCod ;
   private byte[] P093H2_A132BarCodReo ;
   private String[] P093H2_A130BarCodPar ;
   private String[] P093H2_A457FasCod ;
   private java.math.BigDecimal[] P093H2_A216BarTieTeo ;
   private java.math.BigDecimal[] P093H2_A215BarTieRea ;
   private String[] P093H2_A228BarUniMed ;
   private String[] P093H2_A603MaqCodBis ;
   private String[] P093H2_A460FasDsc ;
   private short[] P093H2_A194BarOrdLin ;
   private String[] P093H2_A758ProCod ;
   private String[] P093H3_A396EmprCod ;
   private int[] P093H3_A129BarCod ;
   private byte[] P093H3_A132BarCodReo ;
   private String[] P093H3_A130BarCodPar ;
   private String[] P093H3_A460FasDsc ;
   private java.math.BigDecimal[] P093H3_A216BarTieTeo ;
   private java.math.BigDecimal[] P093H3_A215BarTieRea ;
   private String[] P093H3_A228BarUniMed ;
   private String[] P093H3_A603MaqCodBis ;
   private String[] P093H3_A457FasCod ;
   private short[] P093H3_A194BarOrdLin ;
   private String[] P093H3_A758ProCod ;
   private String[] P093H4_A396EmprCod ;
   private int[] P093H4_A129BarCod ;
   private byte[] P093H4_A132BarCodReo ;
   private String[] P093H4_A130BarCodPar ;
   private String[] P093H4_A603MaqCodBis ;
   private java.math.BigDecimal[] P093H4_A216BarTieTeo ;
   private java.math.BigDecimal[] P093H4_A215BarTieRea ;
   private String[] P093H4_A228BarUniMed ;
   private String[] P093H4_A460FasDsc ;
   private String[] P093H4_A457FasCod ;
   private short[] P093H4_A194BarOrdLin ;
   private String[] P093H4_A758ProCod ;
   private String[] P093H5_A396EmprCod ;
   private int[] P093H5_A129BarCod ;
   private byte[] P093H5_A132BarCodReo ;
   private String[] P093H5_A130BarCodPar ;
   private String[] P093H5_A228BarUniMed ;
   private java.math.BigDecimal[] P093H5_A216BarTieTeo ;
   private java.math.BigDecimal[] P093H5_A215BarTieRea ;
   private String[] P093H5_A603MaqCodBis ;
   private String[] P093H5_A460FasDsc ;
   private String[] P093H5_A457FasCod ;
   private short[] P093H5_A194BarOrdLin ;
   private String[] P093H5_A758ProCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class analisiscostesbasicosdetalle_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          String AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV64Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.BarTieTeo, T1.BarTieRea, T2.BarUniMed, T1.MaqCodBis, T3.FasDsc, T1.BarOrdLin, T1.ProCod FROM" ;
      scmdbuf += " ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER" ;
      scmdbuf += " JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV70Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P093H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          String AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV64Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[25];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc, T1.BarTieTeo, T1.BarTieRea, T2.BarUniMed, T1.MaqCodBis, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM" ;
      scmdbuf += " ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER" ;
      scmdbuf += " JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV70Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P093H4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          String AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV64Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T1.BarTieTeo, T1.BarTieRea, T2.BarUniMed, T3.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM" ;
      scmdbuf += " ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER" ;
      scmdbuf += " JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV70Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P093H5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV70Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          String AV63Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV64Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV65Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV66Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarUniMed, T1.BarTieTeo, T1.BarTieRea, T1.MaqCodBis, T3.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM" ;
      scmdbuf += " ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER" ;
      scmdbuf += " JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV67Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV70Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV74Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV76Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarUniMed" ;
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
                  return conditional_P093H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P093H3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P093H4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P093H5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093H4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093H5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 28);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
      }
   }

}

