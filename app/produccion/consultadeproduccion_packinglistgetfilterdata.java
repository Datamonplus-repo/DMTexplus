package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_packinglistgetfilterdata extends GXProcedure
{
   public consultadeproduccion_packinglistgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_packinglistgetfilterdata.class ), "" );
   }

   public consultadeproduccion_packinglistgetfilterdata( int remoteHandle ,
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
      consultadeproduccion_packinglistgetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion_packinglistgetfilterdata.this.AV30DDOName = aP0;
      consultadeproduccion_packinglistgetfilterdata.this.AV28SearchTxt = aP1;
      consultadeproduccion_packinglistgetfilterdata.this.AV29SearchTxtTo = aP2;
      consultadeproduccion_packinglistgetfilterdata.this.aP3 = aP3;
      consultadeproduccion_packinglistgetfilterdata.this.aP4 = aP4;
      consultadeproduccion_packinglistgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_METTERCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_METPIECOD") == 0 )
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
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("Produccion.ConsultadeProduccion_PackingListGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_PackingListGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("Produccion.ConsultadeProduccion_PackingListGridState"), null, null);
      }
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV14TFMetTerCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV15TFMetTerCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV47TFMetPieCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV48TFMetPieCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV49TFMetPieMet = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFMetPieMet_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV51TFMetPieKil = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFMetPieKil_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV53TFMetPieAnc = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFMetPieAnc_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV59TFMetPieEst = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFMetPieEst_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55EmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV56BarCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV57BarCodReo = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV58BarCodPar = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV61Clicod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV62CliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV63PedidoCliente = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV64Barser = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV65BarSerDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV66Barcolnom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV67Barcolnum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETTERCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMetTerCod = AV28SearchTxt ;
      AV15TFMetTerCod_Sel = "" ;
      AV72Produccion_consultadeproduccion_packinglistds_1_emprcod = AV55EmprCod ;
      AV73Produccion_consultadeproduccion_packinglistds_2_barcod = AV56BarCod ;
      AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV57BarCodReo ;
      AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV58BarCodPar ;
      AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV14TFMetTerCod ;
      AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV15TFMetTerCod_Sel ;
      AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV47TFMetPieCod ;
      AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV48TFMetPieCod_Sel ;
      AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV49TFMetPieMet ;
      AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV50TFMetPieMet_To ;
      AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV51TFMetPieKil ;
      AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV52TFMetPieKil_To ;
      AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV53TFMetPieAnc ;
      AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV54TFMetPieAnc_To ;
      AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV59TFMetPieEst ;
      AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV60TFMetPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                           AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                           AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                           AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                           AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                           AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                           AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                           AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                           Short.valueOf(AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                           Short.valueOf(AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                           Byte.valueOf(AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           AV72Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                           Integer.valueOf(AV73Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                           Byte.valueOf(AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                           AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
      lV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
      /* Using cursor P09LO2 */
      pr_default.execute(0, new Object[] {AV72Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV73Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09LO2_A396EmprCod[0] ;
         A129BarCod = P09LO2_A129BarCod[0] ;
         A132BarCodReo = P09LO2_A132BarCodReo[0] ;
         A130BarCodPar = P09LO2_A130BarCodPar[0] ;
         A2816MetPieEst = P09LO2_A2816MetPieEst[0] ;
         A6635MetPieAnc = P09LO2_A6635MetPieAnc[0] ;
         A2814MetPieKil = P09LO2_A2814MetPieKil[0] ;
         A2815MetPieMet = P09LO2_A2815MetPieMet[0] ;
         A2813MetPieCod = P09LO2_A2813MetPieCod[0] ;
         A2809MetTerCod = P09LO2_A2809MetTerCod[0] ;
         if ( ! (GXutil.strcmp("", A2809MetTerCod)==0) )
         {
            AV32Option = A2809MetTerCod ;
            AV33Options.add(AV32Option, 0);
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
      /* 'LOADMETPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV47TFMetPieCod = AV28SearchTxt ;
      AV48TFMetPieCod_Sel = "" ;
      AV72Produccion_consultadeproduccion_packinglistds_1_emprcod = AV55EmprCod ;
      AV73Produccion_consultadeproduccion_packinglistds_2_barcod = AV56BarCod ;
      AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV57BarCodReo ;
      AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV58BarCodPar ;
      AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV14TFMetTerCod ;
      AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV15TFMetTerCod_Sel ;
      AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV47TFMetPieCod ;
      AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV48TFMetPieCod_Sel ;
      AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV49TFMetPieMet ;
      AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV50TFMetPieMet_To ;
      AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV51TFMetPieKil ;
      AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV52TFMetPieKil_To ;
      AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV53TFMetPieAnc ;
      AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV54TFMetPieAnc_To ;
      AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV59TFMetPieEst ;
      AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV60TFMetPieEst_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                           AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                           AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                           AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                           AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                           AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                           AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                           AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                           Short.valueOf(AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                           Short.valueOf(AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                           Byte.valueOf(AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           AV72Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                           Integer.valueOf(AV73Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                           Byte.valueOf(AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                           AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
      lV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
      /* Using cursor P09LO3 */
      pr_default.execute(1, new Object[] {AV72Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV73Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9LO3 = false ;
         A2813MetPieCod = P09LO3_A2813MetPieCod[0] ;
         A130BarCodPar = P09LO3_A130BarCodPar[0] ;
         A132BarCodReo = P09LO3_A132BarCodReo[0] ;
         A129BarCod = P09LO3_A129BarCod[0] ;
         A396EmprCod = P09LO3_A396EmprCod[0] ;
         A2816MetPieEst = P09LO3_A2816MetPieEst[0] ;
         A6635MetPieAnc = P09LO3_A6635MetPieAnc[0] ;
         A2814MetPieKil = P09LO3_A2814MetPieKil[0] ;
         A2815MetPieMet = P09LO3_A2815MetPieMet[0] ;
         A2809MetTerCod = P09LO3_A2809MetTerCod[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09LO3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09LO3_A129BarCod[0] == A129BarCod ) && ( P09LO3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09LO3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P09LO3_A2813MetPieCod[0], A2813MetPieCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk9LO3 = false ;
            A2809MetTerCod = P09LO3_A2809MetTerCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk9LO3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
         {
            AV32Option = A2813MetPieCod ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LO3 )
         {
            brk9LO3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_packinglistgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = consultadeproduccion_packinglistgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = consultadeproduccion_packinglistgetfilterdata.this.AV39OptionIndexesJson;
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
      AV14TFMetTerCod = "" ;
      AV15TFMetTerCod_Sel = "" ;
      AV47TFMetPieCod = "" ;
      AV48TFMetPieCod_Sel = "" ;
      AV49TFMetPieMet = DecimalUtil.ZERO ;
      AV50TFMetPieMet_To = DecimalUtil.ZERO ;
      AV51TFMetPieKil = DecimalUtil.ZERO ;
      AV52TFMetPieKil_To = DecimalUtil.ZERO ;
      AV55EmprCod = "" ;
      AV58BarCodPar = "" ;
      AV62CliNom = "" ;
      AV63PedidoCliente = "" ;
      AV64Barser = "" ;
      AV65BarSerDsc = "" ;
      AV66Barcolnom = "" ;
      A2809MetTerCod = "" ;
      AV72Produccion_consultadeproduccion_packinglistds_1_emprcod = "" ;
      AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar = "" ;
      AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = "" ;
      AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = "" ;
      AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = DecimalUtil.ZERO ;
      AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = DecimalUtil.ZERO ;
      AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      lV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      A2813MetPieCod = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09LO2_A396EmprCod = new String[] {""} ;
      P09LO2_A129BarCod = new int[1] ;
      P09LO2_A132BarCodReo = new byte[1] ;
      P09LO2_A130BarCodPar = new String[] {""} ;
      P09LO2_A2816MetPieEst = new byte[1] ;
      P09LO2_A6635MetPieAnc = new short[1] ;
      P09LO2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LO2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LO2_A2813MetPieCod = new String[] {""} ;
      P09LO2_A2809MetTerCod = new String[] {""} ;
      AV32Option = "" ;
      P09LO3_A2813MetPieCod = new String[] {""} ;
      P09LO3_A130BarCodPar = new String[] {""} ;
      P09LO3_A132BarCodReo = new byte[1] ;
      P09LO3_A129BarCod = new int[1] ;
      P09LO3_A396EmprCod = new String[] {""} ;
      P09LO3_A2816MetPieEst = new byte[1] ;
      P09LO3_A6635MetPieAnc = new short[1] ;
      P09LO3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LO3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LO3_A2809MetTerCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_packinglistgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LO2_A396EmprCod, P09LO2_A129BarCod, P09LO2_A132BarCodReo, P09LO2_A130BarCodPar, P09LO2_A2816MetPieEst, P09LO2_A6635MetPieAnc, P09LO2_A2814MetPieKil, P09LO2_A2815MetPieMet, P09LO2_A2813MetPieCod, P09LO2_A2809MetTerCod
            }
            , new Object[] {
            P09LO3_A2813MetPieCod, P09LO3_A130BarCodPar, P09LO3_A132BarCodReo, P09LO3_A129BarCod, P09LO3_A396EmprCod, P09LO3_A2816MetPieEst, P09LO3_A6635MetPieAnc, P09LO3_A2814MetPieKil, P09LO3_A2815MetPieMet, P09LO3_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV59TFMetPieEst ;
   private byte AV60TFMetPieEst_To ;
   private byte AV57BarCodReo ;
   private byte AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo ;
   private byte AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ;
   private byte AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ;
   private byte A2816MetPieEst ;
   private byte A132BarCodReo ;
   private short AV53TFMetPieAnc ;
   private short AV54TFMetPieAnc_To ;
   private short AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ;
   private short AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV70GXV1 ;
   private int AV56BarCod ;
   private int AV61Clicod ;
   private int AV67Barcolnum ;
   private int AV73Produccion_consultadeproduccion_packinglistds_2_barcod ;
   private int A129BarCod ;
   private long AV40count ;
   private java.math.BigDecimal AV49TFMetPieMet ;
   private java.math.BigDecimal AV50TFMetPieMet_To ;
   private java.math.BigDecimal AV51TFMetPieKil ;
   private java.math.BigDecimal AV52TFMetPieKil_To ;
   private java.math.BigDecimal AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ;
   private java.math.BigDecimal AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ;
   private java.math.BigDecimal AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ;
   private java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private String AV14TFMetTerCod ;
   private String AV15TFMetTerCod_Sel ;
   private String AV47TFMetPieCod ;
   private String AV48TFMetPieCod_Sel ;
   private String AV55EmprCod ;
   private String AV58BarCodPar ;
   private String AV62CliNom ;
   private String AV63PedidoCliente ;
   private String AV64Barser ;
   private String AV65BarSerDsc ;
   private String AV66Barcolnom ;
   private String A2809MetTerCod ;
   private String AV72Produccion_consultadeproduccion_packinglistds_1_emprcod ;
   private String AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar ;
   private String AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ;
   private String AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ;
   private String scmdbuf ;
   private String lV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String lV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String A2813MetPieCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9LO3 ;
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
   private String[] P09LO2_A396EmprCod ;
   private int[] P09LO2_A129BarCod ;
   private byte[] P09LO2_A132BarCodReo ;
   private String[] P09LO2_A130BarCodPar ;
   private byte[] P09LO2_A2816MetPieEst ;
   private short[] P09LO2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09LO2_A2814MetPieKil ;
   private java.math.BigDecimal[] P09LO2_A2815MetPieMet ;
   private String[] P09LO2_A2813MetPieCod ;
   private String[] P09LO2_A2809MetTerCod ;
   private String[] P09LO3_A2813MetPieCod ;
   private String[] P09LO3_A130BarCodPar ;
   private byte[] P09LO3_A132BarCodReo ;
   private int[] P09LO3_A129BarCod ;
   private String[] P09LO3_A396EmprCod ;
   private byte[] P09LO3_A2816MetPieEst ;
   private short[] P09LO3_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09LO3_A2814MetPieKil ;
   private java.math.BigDecimal[] P09LO3_A2815MetPieMet ;
   private String[] P09LO3_A2809MetTerCod ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class consultadeproduccion_packinglistgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          String AV72Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV73Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS EmprCod, NULL AS BarCod, NULL AS BarCodReo, NULL AS BarCodPar, NULL AS MetPieEst, NULL AS MetPieAnc, NULL AS MetPieKil, NULL AS MetPieMet," ;
      scmdbuf += " NULL AS MetPieCod, MetTerCod FROM ( SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieEst, MetPieAnc, MetPieKil, MetPieMet, MetPieCod, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY MetTerCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09LO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          String AV72Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV73Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV74Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV75Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MetPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, MetPieEst, MetPieAnc, MetPieKil, MetPieMet, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV86Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
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
                  return conditional_P09LO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] );
            case 1 :
                  return conditional_P09LO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               return;
      }
   }

}

