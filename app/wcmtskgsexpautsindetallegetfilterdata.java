package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcmtskgsexpautsindetallegetfilterdata extends GXProcedure
{
   public wcmtskgsexpautsindetallegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcmtskgsexpautsindetallegetfilterdata.class ), "" );
   }

   public wcmtskgsexpautsindetallegetfilterdata( int remoteHandle ,
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
      wcmtskgsexpautsindetallegetfilterdata.this.aP5 = new String[] {""};
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
      wcmtskgsexpautsindetallegetfilterdata.this.AV26DDOName = aP0;
      wcmtskgsexpautsindetallegetfilterdata.this.AV24SearchTxt = aP1;
      wcmtskgsexpautsindetallegetfilterdata.this.AV25SearchTxtTo = aP2;
      wcmtskgsexpautsindetallegetfilterdata.this.aP3 = aP3;
      wcmtskgsexpautsindetallegetfilterdata.this.aP4 = aP4;
      wcmtskgsexpautsindetallegetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_METTERCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMETTERCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_METPIECOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIECODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_METPIECTR") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIECTROPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV37Session.getValue("WCMtsKgsExpAutsindetalleGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCMtsKgsExpAutsindetalleGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WCMtsKgsExpAutsindetalleGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV10TFMetTerCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV11TFMetTerCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV12TFMetPieCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV13TFMetPieCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV14TFMetPieMet = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFMetPieMet_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV16TFMetPieKil = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFMetPieKil_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV18TFMetPieAnc = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMetPieAnc_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEFCH") == 0 )
         {
            AV20TFMetPieFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEOPE") == 0 )
         {
            AV22TFMetPieOpe = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFMetPieOpe_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECTR") == 0 )
         {
            AV46TFMetPiectr = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECTR_SEL") == 0 )
         {
            AV47TFMetPiectr_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV42Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV43Barcod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV44Barcodreo = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV45Barcodpar = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETTERCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMetTerCod = AV24SearchTxt ;
      AV11TFMetTerCod_Sel = "" ;
      AV55Wcmtskgsexpautsindetalleds_1_emprcod = AV42Emprcod ;
      AV56Wcmtskgsexpautsindetalleds_2_barcod = AV43Barcod ;
      AV57Wcmtskgsexpautsindetalleds_3_barcodreo = AV44Barcodreo ;
      AV58Wcmtskgsexpautsindetalleds_4_barcodpar = AV45Barcodpar ;
      AV59Wcmtskgsexpautsindetalleds_5_filterfulltext = AV50FilterFullText ;
      AV60Wcmtskgsexpautsindetalleds_6_tfmettercod = AV10TFMetTerCod ;
      AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet = AV14TFMetPieMet ;
      AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil = AV16TFMetPieKil ;
      AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch = AV20TFMetPieFch ;
      AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope = AV22TFMetPieOpe ;
      AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to = AV23TFMetPieOpe_To ;
      AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr = AV46TFMetPiectr ;
      AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel = AV47TFMetPiectr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ,
                                           AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ,
                                           AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ,
                                           AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ,
                                           AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ,
                                           AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ,
                                           AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ,
                                           AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ,
                                           AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ,
                                           Short.valueOf(AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc) ,
                                           Short.valueOf(AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to) ,
                                           AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ,
                                           Integer.valueOf(AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope) ,
                                           Integer.valueOf(AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to) ,
                                           AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ,
                                           AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Integer.valueOf(A13005MetPieOpe) ,
                                           A10780MetPiectr ,
                                           A396EmprCod ,
                                           AV42Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45Barcodpar ,
                                           AV55Wcmtskgsexpautsindetalleds_1_emprcod ,
                                           Integer.valueOf(AV56Wcmtskgsexpautsindetalleds_2_barcod) ,
                                           Byte.valueOf(AV57Wcmtskgsexpautsindetalleds_3_barcodreo) ,
                                           AV58Wcmtskgsexpautsindetalleds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV60Wcmtskgsexpautsindetalleds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV60Wcmtskgsexpautsindetalleds_6_tfmettercod), 10, "%") ;
      /* Using cursor P08D32 */
      pr_default.execute(0, new Object[] {AV55Wcmtskgsexpautsindetalleds_1_emprcod, Integer.valueOf(AV56Wcmtskgsexpautsindetalleds_2_barcod), Byte.valueOf(AV57Wcmtskgsexpautsindetalleds_3_barcodreo), AV58Wcmtskgsexpautsindetalleds_4_barcodpar, AV42Emprcod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45Barcodpar, lV60Wcmtskgsexpautsindetalleds_6_tfmettercod, AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8D32 = false ;
         A396EmprCod = P08D32_A396EmprCod[0] ;
         A129BarCod = P08D32_A129BarCod[0] ;
         A132BarCodReo = P08D32_A132BarCodReo[0] ;
         A130BarCodPar = P08D32_A130BarCodPar[0] ;
         A2809MetTerCod = P08D32_A2809MetTerCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08D32_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08D32_A129BarCod[0] == A129BarCod ) && ( P08D32_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P08D32_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P08D32_A2809MetTerCod[0], A2809MetTerCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk8D32 = false ;
            AV36count = (long)(AV36count+1) ;
            brk8D32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2809MetTerCod)==0) )
         {
            AV28Option = A2809MetTerCod ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8D32 )
         {
            brk8D32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMETPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMetPieCod = AV24SearchTxt ;
      AV13TFMetPieCod_Sel = "" ;
      AV55Wcmtskgsexpautsindetalleds_1_emprcod = AV42Emprcod ;
      AV56Wcmtskgsexpautsindetalleds_2_barcod = AV43Barcod ;
      AV57Wcmtskgsexpautsindetalleds_3_barcodreo = AV44Barcodreo ;
      AV58Wcmtskgsexpautsindetalleds_4_barcodpar = AV45Barcodpar ;
      AV59Wcmtskgsexpautsindetalleds_5_filterfulltext = AV50FilterFullText ;
      AV60Wcmtskgsexpautsindetalleds_6_tfmettercod = AV10TFMetTerCod ;
      AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet = AV14TFMetPieMet ;
      AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil = AV16TFMetPieKil ;
      AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch = AV20TFMetPieFch ;
      AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope = AV22TFMetPieOpe ;
      AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to = AV23TFMetPieOpe_To ;
      AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr = AV46TFMetPiectr ;
      AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel = AV47TFMetPiectr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ,
                                           AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ,
                                           AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ,
                                           AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ,
                                           AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ,
                                           AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ,
                                           AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ,
                                           AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ,
                                           AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ,
                                           Short.valueOf(AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc) ,
                                           Short.valueOf(AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to) ,
                                           AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ,
                                           Integer.valueOf(AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope) ,
                                           Integer.valueOf(AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to) ,
                                           AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ,
                                           AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Integer.valueOf(A13005MetPieOpe) ,
                                           A10780MetPiectr ,
                                           A396EmprCod ,
                                           AV42Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45Barcodpar ,
                                           AV55Wcmtskgsexpautsindetalleds_1_emprcod ,
                                           Integer.valueOf(AV56Wcmtskgsexpautsindetalleds_2_barcod) ,
                                           Byte.valueOf(AV57Wcmtskgsexpautsindetalleds_3_barcodreo) ,
                                           AV58Wcmtskgsexpautsindetalleds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV60Wcmtskgsexpautsindetalleds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV60Wcmtskgsexpautsindetalleds_6_tfmettercod), 10, "%") ;
      /* Using cursor P08D33 */
      pr_default.execute(1, new Object[] {AV55Wcmtskgsexpautsindetalleds_1_emprcod, Integer.valueOf(AV56Wcmtskgsexpautsindetalleds_2_barcod), Byte.valueOf(AV57Wcmtskgsexpautsindetalleds_3_barcodreo), AV58Wcmtskgsexpautsindetalleds_4_barcodpar, AV42Emprcod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45Barcodpar, lV60Wcmtskgsexpautsindetalleds_6_tfmettercod, AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8D34 = false ;
         A396EmprCod = P08D33_A396EmprCod[0] ;
         A129BarCod = P08D33_A129BarCod[0] ;
         A132BarCodReo = P08D33_A132BarCodReo[0] ;
         A130BarCodPar = P08D33_A130BarCodPar[0] ;
         A2809MetTerCod = P08D33_A2809MetTerCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08D33_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08D33_A129BarCod[0] == A129BarCod ) && ( P08D33_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P08D33_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk8D34 = false ;
            A2809MetTerCod = P08D33_A2809MetTerCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8D34 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
         {
            AV28Option = A2813MetPieCod ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8D34 )
         {
            brk8D34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMETPIECTROPTIONS' Routine */
      returnInSub = false ;
      AV46TFMetPiectr = AV24SearchTxt ;
      AV47TFMetPiectr_Sel = "" ;
      AV55Wcmtskgsexpautsindetalleds_1_emprcod = AV42Emprcod ;
      AV56Wcmtskgsexpautsindetalleds_2_barcod = AV43Barcod ;
      AV57Wcmtskgsexpautsindetalleds_3_barcodreo = AV44Barcodreo ;
      AV58Wcmtskgsexpautsindetalleds_4_barcodpar = AV45Barcodpar ;
      AV59Wcmtskgsexpautsindetalleds_5_filterfulltext = AV50FilterFullText ;
      AV60Wcmtskgsexpautsindetalleds_6_tfmettercod = AV10TFMetTerCod ;
      AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod = AV12TFMetPieCod ;
      AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet = AV14TFMetPieMet ;
      AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil = AV16TFMetPieKil ;
      AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc = AV18TFMetPieAnc ;
      AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch = AV20TFMetPieFch ;
      AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope = AV22TFMetPieOpe ;
      AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to = AV23TFMetPieOpe_To ;
      AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr = AV46TFMetPiectr ;
      AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel = AV47TFMetPiectr_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ,
                                           AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ,
                                           AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ,
                                           AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ,
                                           AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ,
                                           AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ,
                                           AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ,
                                           AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ,
                                           AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ,
                                           Short.valueOf(AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc) ,
                                           Short.valueOf(AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to) ,
                                           AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ,
                                           Integer.valueOf(AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope) ,
                                           Integer.valueOf(AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to) ,
                                           AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ,
                                           AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Integer.valueOf(A13005MetPieOpe) ,
                                           A10780MetPiectr ,
                                           A396EmprCod ,
                                           AV42Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45Barcodpar ,
                                           AV55Wcmtskgsexpautsindetalleds_1_emprcod ,
                                           Integer.valueOf(AV56Wcmtskgsexpautsindetalleds_2_barcod) ,
                                           Byte.valueOf(AV57Wcmtskgsexpautsindetalleds_3_barcodreo) ,
                                           AV58Wcmtskgsexpautsindetalleds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV60Wcmtskgsexpautsindetalleds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV60Wcmtskgsexpautsindetalleds_6_tfmettercod), 10, "%") ;
      /* Using cursor P08D34 */
      pr_default.execute(2, new Object[] {AV55Wcmtskgsexpautsindetalleds_1_emprcod, Integer.valueOf(AV56Wcmtskgsexpautsindetalleds_2_barcod), Byte.valueOf(AV57Wcmtskgsexpautsindetalleds_3_barcodreo), AV58Wcmtskgsexpautsindetalleds_4_barcodpar, AV42Emprcod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45Barcodpar, lV60Wcmtskgsexpautsindetalleds_6_tfmettercod, AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8D36 = false ;
         A396EmprCod = P08D34_A396EmprCod[0] ;
         A129BarCod = P08D34_A129BarCod[0] ;
         A132BarCodReo = P08D34_A132BarCodReo[0] ;
         A130BarCodPar = P08D34_A130BarCodPar[0] ;
         A2809MetTerCod = P08D34_A2809MetTerCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08D34_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08D34_A129BarCod[0] == A129BarCod ) && ( P08D34_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P08D34_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk8D36 = false ;
            A2809MetTerCod = P08D34_A2809MetTerCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8D36 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A10780MetPiectr)==0) )
         {
            AV28Option = A10780MetPiectr ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8D36 )
         {
            brk8D36 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcmtskgsexpautsindetallegetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = wcmtskgsexpautsindetallegetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = wcmtskgsexpautsindetallegetfilterdata.this.AV35OptionIndexesJson;
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
      AV50FilterFullText = "" ;
      AV10TFMetTerCod = "" ;
      AV11TFMetTerCod_Sel = "" ;
      AV12TFMetPieCod = "" ;
      AV13TFMetPieCod_Sel = "" ;
      AV14TFMetPieMet = DecimalUtil.ZERO ;
      AV15TFMetPieMet_To = DecimalUtil.ZERO ;
      AV16TFMetPieKil = DecimalUtil.ZERO ;
      AV17TFMetPieKil_To = DecimalUtil.ZERO ;
      AV20TFMetPieFch = GXutil.nullDate() ;
      AV46TFMetPiectr = "" ;
      AV47TFMetPiectr_Sel = "" ;
      AV42Emprcod = "" ;
      AV45Barcodpar = "" ;
      A2809MetTerCod = "" ;
      AV55Wcmtskgsexpautsindetalleds_1_emprcod = "" ;
      AV58Wcmtskgsexpautsindetalleds_4_barcodpar = "" ;
      AV59Wcmtskgsexpautsindetalleds_5_filterfulltext = "" ;
      AV60Wcmtskgsexpautsindetalleds_6_tfmettercod = "" ;
      AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel = "" ;
      AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod = "" ;
      AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel = "" ;
      AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet = DecimalUtil.ZERO ;
      AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil = DecimalUtil.ZERO ;
      AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch = GXutil.nullDate() ;
      AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr = "" ;
      AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel = "" ;
      scmdbuf = "" ;
      lV60Wcmtskgsexpautsindetalleds_6_tfmettercod = "" ;
      A2813MetPieCod = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A10780MetPiectr = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P08D32_A396EmprCod = new String[] {""} ;
      P08D32_A129BarCod = new int[1] ;
      P08D32_A132BarCodReo = new byte[1] ;
      P08D32_A130BarCodPar = new String[] {""} ;
      P08D32_A2809MetTerCod = new String[] {""} ;
      AV28Option = "" ;
      P08D33_A396EmprCod = new String[] {""} ;
      P08D33_A129BarCod = new int[1] ;
      P08D33_A132BarCodReo = new byte[1] ;
      P08D33_A130BarCodPar = new String[] {""} ;
      P08D33_A2809MetTerCod = new String[] {""} ;
      P08D34_A396EmprCod = new String[] {""} ;
      P08D34_A129BarCod = new int[1] ;
      P08D34_A132BarCodReo = new byte[1] ;
      P08D34_A130BarCodPar = new String[] {""} ;
      P08D34_A2809MetTerCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcmtskgsexpautsindetallegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08D32_A396EmprCod, P08D32_A129BarCod, P08D32_A132BarCodReo, P08D32_A130BarCodPar, P08D32_A2809MetTerCod
            }
            , new Object[] {
            P08D33_A396EmprCod, P08D33_A129BarCod, P08D33_A132BarCodReo, P08D33_A130BarCodPar, P08D33_A2809MetTerCod
            }
            , new Object[] {
            P08D34_A396EmprCod, P08D34_A129BarCod, P08D34_A132BarCodReo, P08D34_A130BarCodPar, P08D34_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44Barcodreo ;
   private byte AV57Wcmtskgsexpautsindetalleds_3_barcodreo ;
   private byte A132BarCodReo ;
   private short AV18TFMetPieAnc ;
   private short AV19TFMetPieAnc_To ;
   private short AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc ;
   private short AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV22TFMetPieOpe ;
   private int AV23TFMetPieOpe_To ;
   private int AV43Barcod ;
   private int AV56Wcmtskgsexpautsindetalleds_2_barcod ;
   private int AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope ;
   private int AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to ;
   private int A13005MetPieOpe ;
   private int A129BarCod ;
   private long AV36count ;
   private java.math.BigDecimal AV14TFMetPieMet ;
   private java.math.BigDecimal AV15TFMetPieMet_To ;
   private java.math.BigDecimal AV16TFMetPieKil ;
   private java.math.BigDecimal AV17TFMetPieKil_To ;
   private java.math.BigDecimal AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ;
   private java.math.BigDecimal AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ;
   private java.math.BigDecimal AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ;
   private java.math.BigDecimal AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private String AV10TFMetTerCod ;
   private String AV11TFMetTerCod_Sel ;
   private String AV12TFMetPieCod ;
   private String AV13TFMetPieCod_Sel ;
   private String AV46TFMetPiectr ;
   private String AV47TFMetPiectr_Sel ;
   private String AV42Emprcod ;
   private String AV45Barcodpar ;
   private String A2809MetTerCod ;
   private String AV55Wcmtskgsexpautsindetalleds_1_emprcod ;
   private String AV58Wcmtskgsexpautsindetalleds_4_barcodpar ;
   private String AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ;
   private String AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ;
   private String AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ;
   private String AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ;
   private String AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ;
   private String AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ;
   private String scmdbuf ;
   private String lV60Wcmtskgsexpautsindetalleds_6_tfmettercod ;
   private String A2813MetPieCod ;
   private String A10780MetPiectr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV20TFMetPieFch ;
   private java.util.Date AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ;
   private boolean returnInSub ;
   private boolean brk8D32 ;
   private boolean brk8D34 ;
   private boolean brk8D36 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08D32_A396EmprCod ;
   private int[] P08D32_A129BarCod ;
   private byte[] P08D32_A132BarCodReo ;
   private String[] P08D32_A130BarCodPar ;
   private String[] P08D32_A2809MetTerCod ;
   private String[] P08D33_A396EmprCod ;
   private int[] P08D33_A129BarCod ;
   private byte[] P08D33_A132BarCodReo ;
   private String[] P08D33_A130BarCodPar ;
   private String[] P08D33_A2809MetTerCod ;
   private String[] P08D34_A396EmprCod ;
   private int[] P08D34_A129BarCod ;
   private byte[] P08D34_A132BarCodReo ;
   private String[] P08D34_A130BarCodPar ;
   private String[] P08D34_A2809MetTerCod ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class wcmtskgsexpautsindetallegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08D32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ,
                                          String AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ,
                                          String AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ,
                                          String AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ,
                                          String AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ,
                                          java.math.BigDecimal AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ,
                                          java.math.BigDecimal AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ,
                                          java.math.BigDecimal AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ,
                                          short AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc ,
                                          short AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to ,
                                          java.util.Date AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ,
                                          int AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope ,
                                          int AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to ,
                                          String AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ,
                                          String AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          int A13005MetPieOpe ,
                                          String A10780MetPiectr ,
                                          String A396EmprCod ,
                                          String AV42Emprcod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45Barcodpar ,
                                          String AV55Wcmtskgsexpautsindetalleds_1_emprcod ,
                                          int AV56Wcmtskgsexpautsindetalleds_2_barcod ,
                                          byte AV57Wcmtskgsexpautsindetalleds_3_barcodreo ,
                                          String AV58Wcmtskgsexpautsindetalleds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPCMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcmtskgsexpautsindetalleds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08D33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ,
                                          String AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ,
                                          String AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ,
                                          String AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ,
                                          String AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ,
                                          java.math.BigDecimal AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ,
                                          java.math.BigDecimal AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ,
                                          java.math.BigDecimal AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ,
                                          short AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc ,
                                          short AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to ,
                                          java.util.Date AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ,
                                          int AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope ,
                                          int AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to ,
                                          String AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ,
                                          String AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          int A13005MetPieOpe ,
                                          String A10780MetPiectr ,
                                          String A396EmprCod ,
                                          String AV42Emprcod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45Barcodpar ,
                                          String AV55Wcmtskgsexpautsindetalleds_1_emprcod ,
                                          int AV56Wcmtskgsexpautsindetalleds_2_barcod ,
                                          byte AV57Wcmtskgsexpautsindetalleds_3_barcodreo ,
                                          String AV58Wcmtskgsexpautsindetalleds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPCMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcmtskgsexpautsindetalleds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08D34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Wcmtskgsexpautsindetalleds_5_filterfulltext ,
                                          String AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel ,
                                          String AV60Wcmtskgsexpautsindetalleds_6_tfmettercod ,
                                          String AV63Wcmtskgsexpautsindetalleds_9_tfmetpiecod_sel ,
                                          String AV62Wcmtskgsexpautsindetalleds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV64Wcmtskgsexpautsindetalleds_10_tfmetpiemet ,
                                          java.math.BigDecimal AV65Wcmtskgsexpautsindetalleds_11_tfmetpiemet_to ,
                                          java.math.BigDecimal AV66Wcmtskgsexpautsindetalleds_12_tfmetpiekil ,
                                          java.math.BigDecimal AV67Wcmtskgsexpautsindetalleds_13_tfmetpiekil_to ,
                                          short AV68Wcmtskgsexpautsindetalleds_14_tfmetpieanc ,
                                          short AV69Wcmtskgsexpautsindetalleds_15_tfmetpieanc_to ,
                                          java.util.Date AV70Wcmtskgsexpautsindetalleds_16_tfmetpiefch ,
                                          int AV71Wcmtskgsexpautsindetalleds_17_tfmetpieope ,
                                          int AV72Wcmtskgsexpautsindetalleds_18_tfmetpieope_to ,
                                          String AV74Wcmtskgsexpautsindetalleds_20_tfmetpiectr_sel ,
                                          String AV73Wcmtskgsexpautsindetalleds_19_tfmetpiectr ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          int A13005MetPieOpe ,
                                          String A10780MetPiectr ,
                                          String A396EmprCod ,
                                          String AV42Emprcod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45Barcodpar ,
                                          String AV55Wcmtskgsexpautsindetalleds_1_emprcod ,
                                          int AV56Wcmtskgsexpautsindetalleds_2_barcod ,
                                          byte AV57Wcmtskgsexpautsindetalleds_3_barcodreo ,
                                          String AV58Wcmtskgsexpautsindetalleds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPCMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcmtskgsexpautsindetalleds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcmtskgsexpautsindetalleds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08D32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] );
            case 1 :
                  return conditional_P08D33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] );
            case 2 :
                  return conditional_P08D34(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08D32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08D33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08D34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 10);
               }
               return;
      }
   }

}

