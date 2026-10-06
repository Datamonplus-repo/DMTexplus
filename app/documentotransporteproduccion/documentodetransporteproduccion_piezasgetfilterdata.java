package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_piezasgetfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_piezasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_piezasgetfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_piezasgetfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_piezasgetfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_piezasgetfilterdata.this.AV34DDOName = aP0;
      documentodetransporteproduccion_piezasgetfilterdata.this.AV35SearchTxt = aP1;
      documentodetransporteproduccion_piezasgetfilterdata.this.AV36SearchTxtTo = aP2;
      documentodetransporteproduccion_piezasgetfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_piezasgetfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_piezasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_METPIECOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIECODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_METPIECTR") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIECTROPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_PiezasGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_PiezasGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_PiezasGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV10TFMetPieCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV11TFMetPieCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV12TFMetPieKil = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV13TFMetPieKil_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV14TFMetPieMet = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFMetPieMet_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV16TFMetPieAnc = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFMetPieAnc_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV18TFMetPieMtD = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFMetPieMtD_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECTR") == 0 )
         {
            AV20TFMetPiectr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECTR_SEL") == 0 )
         {
            AV21TFMetPiectr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMetPieCod = AV35SearchTxt ;
      AV11TFMetPieCod_Sel = "" ;
      AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV10TFMetPieCod ;
      AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV11TFMetPieCod_Sel ;
      AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV12TFMetPieKil ;
      AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV13TFMetPieKil_To ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV14TFMetPieMet ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV16TFMetPieAnc ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV17TFMetPieAnc_To ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV18TFMetPieMtD ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV19TFMetPieMtD_To ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV20TFMetPiectr ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV21TFMetPiectr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                           AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                           AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                           AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                           AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                           AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                           Short.valueOf(AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) ,
                                           Short.valueOf(AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) ,
                                           AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                           AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                           AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                           AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           A10780MetPiectr ,
                                           AV40EmprCod ,
                                           AV41MetTerCod ,
                                           Integer.valueOf(AV42BarCod) ,
                                           Byte.valueOf(AV43BarCodReo) ,
                                           AV44BarCodPar ,
                                           A396EmprCod ,
                                           A2809MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod), 9, "%") ;
      lV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = GXutil.padr( GXutil.rtrim( AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr), 40, "%") ;
      /* Using cursor P0AKX2 */
      pr_default.execute(0, new Object[] {AV40EmprCod, AV41MetTerCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV43BarCodReo), AV44BarCodPar, lV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod, AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel, AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil, AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to, AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet, AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to, Short.valueOf(AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc), Short.valueOf(AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to), AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd, AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to, lV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr, AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAKX2 = false ;
         A130BarCodPar = P0AKX2_A130BarCodPar[0] ;
         A132BarCodReo = P0AKX2_A132BarCodReo[0] ;
         A129BarCod = P0AKX2_A129BarCod[0] ;
         A2809MetTerCod = P0AKX2_A2809MetTerCod[0] ;
         A396EmprCod = P0AKX2_A396EmprCod[0] ;
         A2813MetPieCod = P0AKX2_A2813MetPieCod[0] ;
         A10780MetPiectr = P0AKX2_A10780MetPiectr[0] ;
         A4910MetPieMtD = P0AKX2_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AKX2_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AKX2_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AKX2_A2814MetPieKil[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AKX2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AKX2_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P0AKX2_A129BarCod[0] == A129BarCod ) && ( P0AKX2_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AKX2_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P0AKX2_A2813MetPieCod[0], A2813MetPieCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkAKX2 = false ;
            AV28count = (long)(AV28count+1) ;
            brkAKX2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
         {
            AV23Option = A2813MetPieCod ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAKX2 )
         {
            brkAKX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMETPIECTROPTIONS' Routine */
      returnInSub = false ;
      AV20TFMetPiectr = AV35SearchTxt ;
      AV21TFMetPiectr_Sel = "" ;
      AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = AV10TFMetPieCod ;
      AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = AV11TFMetPieCod_Sel ;
      AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = AV12TFMetPieKil ;
      AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = AV13TFMetPieKil_To ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = AV14TFMetPieMet ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc = AV16TFMetPieAnc ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to = AV17TFMetPieAnc_To ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = AV18TFMetPieMtD ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = AV19TFMetPieMtD_To ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = AV20TFMetPiectr ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = AV21TFMetPiectr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                           AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                           AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                           AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                           AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                           AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                           Short.valueOf(AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) ,
                                           Short.valueOf(AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) ,
                                           AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                           AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                           AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                           AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           A10780MetPiectr ,
                                           A396EmprCod ,
                                           AV40EmprCod ,
                                           A2809MetTerCod ,
                                           AV41MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV42BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV43BarCodReo) ,
                                           A130BarCodPar ,
                                           AV44BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod), 9, "%") ;
      lV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = GXutil.padr( GXutil.rtrim( AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr), 40, "%") ;
      /* Using cursor P0AKX3 */
      pr_default.execute(1, new Object[] {AV40EmprCod, AV41MetTerCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV43BarCodReo), AV44BarCodPar, lV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod, AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel, AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil, AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to, AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet, AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to, Short.valueOf(AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc), Short.valueOf(AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to), AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd, AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to, lV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr, AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAKX4 = false ;
         A396EmprCod = P0AKX3_A396EmprCod[0] ;
         A2809MetTerCod = P0AKX3_A2809MetTerCod[0] ;
         A129BarCod = P0AKX3_A129BarCod[0] ;
         A132BarCodReo = P0AKX3_A132BarCodReo[0] ;
         A130BarCodPar = P0AKX3_A130BarCodPar[0] ;
         A10780MetPiectr = P0AKX3_A10780MetPiectr[0] ;
         A4910MetPieMtD = P0AKX3_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AKX3_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AKX3_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AKX3_A2814MetPieKil[0] ;
         A2813MetPieCod = P0AKX3_A2813MetPieCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AKX3_A10780MetPiectr[0], A10780MetPiectr) == 0 ) )
         {
            brkAKX4 = false ;
            A396EmprCod = P0AKX3_A396EmprCod[0] ;
            A2809MetTerCod = P0AKX3_A2809MetTerCod[0] ;
            A129BarCod = P0AKX3_A129BarCod[0] ;
            A132BarCodReo = P0AKX3_A132BarCodReo[0] ;
            A130BarCodPar = P0AKX3_A130BarCodPar[0] ;
            A2813MetPieCod = P0AKX3_A2813MetPieCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAKX4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10780MetPiectr)==0) )
         {
            AV23Option = A10780MetPiectr ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAKX4 )
         {
            brkAKX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_piezasgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_piezasgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_piezasgetfilterdata.this.AV39OptionIndexesJson;
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
      AV10TFMetPieCod = "" ;
      AV11TFMetPieCod_Sel = "" ;
      AV12TFMetPieKil = DecimalUtil.ZERO ;
      AV13TFMetPieKil_To = DecimalUtil.ZERO ;
      AV14TFMetPieMet = DecimalUtil.ZERO ;
      AV15TFMetPieMet_To = DecimalUtil.ZERO ;
      AV18TFMetPieMtD = DecimalUtil.ZERO ;
      AV19TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV20TFMetPiectr = "" ;
      AV21TFMetPiectr_Sel = "" ;
      A2813MetPieCod = "" ;
      AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = "" ;
      AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel = "" ;
      AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil = DecimalUtil.ZERO ;
      AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet = DecimalUtil.ZERO ;
      AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd = DecimalUtil.ZERO ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = "" ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel = "" ;
      scmdbuf = "" ;
      lV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod = "" ;
      lV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A10780MetPiectr = "" ;
      AV40EmprCod = "" ;
      AV41MetTerCod = "" ;
      AV44BarCodPar = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      P0AKX2_A130BarCodPar = new String[] {""} ;
      P0AKX2_A132BarCodReo = new byte[1] ;
      P0AKX2_A129BarCod = new int[1] ;
      P0AKX2_A2809MetTerCod = new String[] {""} ;
      P0AKX2_A396EmprCod = new String[] {""} ;
      P0AKX2_A2813MetPieCod = new String[] {""} ;
      P0AKX2_A10780MetPiectr = new String[] {""} ;
      P0AKX2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKX2_A6635MetPieAnc = new short[1] ;
      P0AKX2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKX2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV23Option = "" ;
      P0AKX3_A396EmprCod = new String[] {""} ;
      P0AKX3_A2809MetTerCod = new String[] {""} ;
      P0AKX3_A129BarCod = new int[1] ;
      P0AKX3_A132BarCodReo = new byte[1] ;
      P0AKX3_A130BarCodPar = new String[] {""} ;
      P0AKX3_A10780MetPiectr = new String[] {""} ;
      P0AKX3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKX3_A6635MetPieAnc = new short[1] ;
      P0AKX3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKX3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKX3_A2813MetPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_piezasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AKX2_A130BarCodPar, P0AKX2_A132BarCodReo, P0AKX2_A129BarCod, P0AKX2_A2809MetTerCod, P0AKX2_A396EmprCod, P0AKX2_A2813MetPieCod, P0AKX2_A10780MetPiectr, P0AKX2_A4910MetPieMtD, P0AKX2_A6635MetPieAnc, P0AKX2_A2815MetPieMet,
            P0AKX2_A2814MetPieKil
            }
            , new Object[] {
            P0AKX3_A396EmprCod, P0AKX3_A2809MetTerCod, P0AKX3_A129BarCod, P0AKX3_A132BarCodReo, P0AKX3_A130BarCodPar, P0AKX3_A10780MetPiectr, P0AKX3_A4910MetPieMtD, P0AKX3_A6635MetPieAnc, P0AKX3_A2815MetPieMet, P0AKX3_A2814MetPieKil,
            P0AKX3_A2813MetPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV43BarCodReo ;
   private byte A132BarCodReo ;
   private short AV16TFMetPieAnc ;
   private short AV17TFMetPieAnc_To ;
   private short AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ;
   private short AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV42BarCod ;
   private int A129BarCod ;
   private long AV28count ;
   private java.math.BigDecimal AV12TFMetPieKil ;
   private java.math.BigDecimal AV13TFMetPieKil_To ;
   private java.math.BigDecimal AV14TFMetPieMet ;
   private java.math.BigDecimal AV15TFMetPieMet_To ;
   private java.math.BigDecimal AV18TFMetPieMtD ;
   private java.math.BigDecimal AV19TFMetPieMtD_To ;
   private java.math.BigDecimal AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ;
   private java.math.BigDecimal AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ;
   private java.math.BigDecimal AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ;
   private java.math.BigDecimal AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ;
   private java.math.BigDecimal AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ;
   private java.math.BigDecimal AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String AV10TFMetPieCod ;
   private String AV11TFMetPieCod_Sel ;
   private String AV20TFMetPiectr ;
   private String AV21TFMetPiectr_Sel ;
   private String A2813MetPieCod ;
   private String AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ;
   private String AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ;
   private String AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ;
   private String AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ;
   private String scmdbuf ;
   private String lV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ;
   private String lV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ;
   private String A10780MetPiectr ;
   private String AV40EmprCod ;
   private String AV41MetTerCod ;
   private String AV44BarCodPar ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brkAKX2 ;
   private boolean brkAKX4 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKX2_A130BarCodPar ;
   private byte[] P0AKX2_A132BarCodReo ;
   private int[] P0AKX2_A129BarCod ;
   private String[] P0AKX2_A2809MetTerCod ;
   private String[] P0AKX2_A396EmprCod ;
   private String[] P0AKX2_A2813MetPieCod ;
   private String[] P0AKX2_A10780MetPiectr ;
   private java.math.BigDecimal[] P0AKX2_A4910MetPieMtD ;
   private short[] P0AKX2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AKX2_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AKX2_A2814MetPieKil ;
   private String[] P0AKX3_A396EmprCod ;
   private String[] P0AKX3_A2809MetTerCod ;
   private int[] P0AKX3_A129BarCod ;
   private byte[] P0AKX3_A132BarCodReo ;
   private String[] P0AKX3_A130BarCodPar ;
   private String[] P0AKX3_A10780MetPiectr ;
   private java.math.BigDecimal[] P0AKX3_A4910MetPieMtD ;
   private short[] P0AKX3_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AKX3_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AKX3_A2814MetPieKil ;
   private String[] P0AKX3_A2813MetPieCod ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class documentodetransporteproduccion_piezasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AKX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                          String AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                          java.math.BigDecimal AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                          java.math.BigDecimal AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                          java.math.BigDecimal AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                          java.math.BigDecimal AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                          short AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ,
                                          short AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ,
                                          java.math.BigDecimal AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                          java.math.BigDecimal AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                          String AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                          String AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          String A10780MetPiectr ,
                                          String AV40EmprCod ,
                                          String AV41MetTerCod ,
                                          int AV42BarCod ,
                                          byte AV43BarCodReo ,
                                          String AV44BarCodPar ,
                                          String A396EmprCod ,
                                          String A2809MetTerCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, MetTerCod, EmprCod, MetPieCod, MetPiectr, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) && ( ! (GXutil.strcmp("", AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPiectr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) )
      {
         addWhere(sWhereString, "(MetPiectr = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AKX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel ,
                                          String AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod ,
                                          java.math.BigDecimal AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil ,
                                          java.math.BigDecimal AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to ,
                                          java.math.BigDecimal AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet ,
                                          java.math.BigDecimal AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to ,
                                          short AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc ,
                                          short AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to ,
                                          java.math.BigDecimal AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd ,
                                          java.math.BigDecimal AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to ,
                                          String AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel ,
                                          String AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          String A10780MetPiectr ,
                                          String A396EmprCod ,
                                          String AV40EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV41MetTerCod ,
                                          int A129BarCod ,
                                          int AV42BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV43BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV44BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[17];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MetTerCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV49Documentotransporteproduccion_documentodetransporteproduccion_piezasds_1_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Documentotransporteproduccion_documentodetransporteproduccion_piezasds_2_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Documentotransporteproduccion_documentodetransporteproduccion_piezasds_3_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Documentotransporteproduccion_documentodetransporteproduccion_piezasds_4_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Documentotransporteproduccion_documentodetransporteproduccion_piezasds_5_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Documentotransporteproduccion_documentodetransporteproduccion_piezasds_6_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Documentotransporteproduccion_documentodetransporteproduccion_piezasds_7_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Documentotransporteproduccion_documentodetransporteproduccion_piezasds_8_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Documentotransporteproduccion_documentodetransporteproduccion_piezasds_9_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Documentotransporteproduccion_documentodetransporteproduccion_piezasds_10_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) && ( ! (GXutil.strcmp("", AV59Documentotransporteproduccion_documentodetransporteproduccion_piezasds_11_tfmetpiectr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPiectr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Documentotransporteproduccion_documentodetransporteproduccion_piezasds_12_tfmetpiectr_sel)==0) )
      {
         addWhere(sWhereString, "(MetPiectr = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MetPiectr" ;
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
                  return conditional_P0AKX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P0AKX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AKX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 40);
               }
               return;
      }
   }

}

