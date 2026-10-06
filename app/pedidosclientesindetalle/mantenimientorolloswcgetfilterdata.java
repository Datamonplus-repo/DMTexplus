package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientorolloswcgetfilterdata extends GXProcedure
{
   public mantenimientorolloswcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorolloswcgetfilterdata.class ), "" );
   }

   public mantenimientorolloswcgetfilterdata( int remoteHandle ,
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
      mantenimientorolloswcgetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientorolloswcgetfilterdata.this.AV36DDOName = aP0;
      mantenimientorolloswcgetfilterdata.this.AV37SearchTxt = aP1;
      mantenimientorolloswcgetfilterdata.this.AV38SearchTxtTo = aP2;
      mantenimientorolloswcgetfilterdata.this.aP3 = aP3;
      mantenimientorolloswcgetfilterdata.this.aP4 = aP4;
      mantenimientorolloswcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_METTERCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_METPIECOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_METPIELOC") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIELOCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_METPIEDCP") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIEDCPOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("PedidosClienteSinDetalle.MantenimientoRollos_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.MantenimientoRollos_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("PedidosClienteSinDetalle.MantenimientoRollos_WCGridState"), null, null);
      }
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV10TFMetTerCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV11TFMetTerCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV12TFMetPieCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV13TFMetPieCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV16TFMetPieKil = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFMetPieKil_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV14TFMetPieMet = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFMetPieMet_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV18TFMetPieAnc = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMetPieAnc_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV20TFMetPieMtD = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFMetPieMtD_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV22TFMetPieEst = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFMetPieEst_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIELOC") == 0 )
         {
            AV71TFMetPieLoc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIELOC_SEL") == 0 )
         {
            AV72TFMetPieLoc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDCP") == 0 )
         {
            AV73TFMetPieDCP = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDCP_SEL") == 0 )
         {
            AV74TFMetPieDCP_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV57Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV58Barcod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV59Barcodreo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV60Barcodpar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&KMS") == 0 )
         {
            AV61Kms = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV62Maqcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV63Opecod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MENSAJE") == 0 )
         {
            AV64Mensaje = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARKGM") == 0 )
         {
            AV65Barkgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARMTR") == 0 )
         {
            AV66BarMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARANCACA1") == 0 )
         {
            AV67BarAncAca1 = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARRDT") == 0 )
         {
            AV68BarRdt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARPES") == 0 )
         {
            AV69Barpes = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARUNIMED") == 0 )
         {
            AV70BarUnimed = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETTERCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMetTerCod = AV37SearchTxt ;
      AV11TFMetTerCod_Sel = "" ;
      AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV10TFMetTerCod ;
      AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV12TFMetPieCod ;
      AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV16TFMetPieKil ;
      AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV14TFMetPieMet ;
      AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV18TFMetPieAnc ;
      AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV20TFMetPieMtD ;
      AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV22TFMetPieEst ;
      AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV71TFMetPieLoc ;
      AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV72TFMetPieLoc_Sel ;
      AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV73TFMetPieDCP ;
      AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV74TFMetPieDCP_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59Barcodreo) ,
                                           A130BarCodPar ,
                                           AV60Barcodpar ,
                                           AV57Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor P0AAT2 */
      pr_default.execute(0, new Object[] {AV57Emprcod, Integer.valueOf(AV58Barcod), Byte.valueOf(AV59Barcodreo), AV60Barcodpar, lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAAT2 = false ;
         A396EmprCod = P0AAT2_A396EmprCod[0] ;
         A2809MetTerCod = P0AAT2_A2809MetTerCod[0] ;
         A130BarCodPar = P0AAT2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAT2_A132BarCodReo[0] ;
         A129BarCod = P0AAT2_A129BarCod[0] ;
         A4915MetPieDCP = P0AAT2_A4915MetPieDCP[0] ;
         A4913MetPieLoc = P0AAT2_A4913MetPieLoc[0] ;
         A2816MetPieEst = P0AAT2_A2816MetPieEst[0] ;
         A4910MetPieMtD = P0AAT2_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AAT2_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AAT2_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AAT2_A2814MetPieKil[0] ;
         A2813MetPieCod = P0AAT2_A2813MetPieCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAT2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAT2_A2809MetTerCod[0], A2809MetTerCod) == 0 ) )
         {
            brkAAT2 = false ;
            A130BarCodPar = P0AAT2_A130BarCodPar[0] ;
            A132BarCodReo = P0AAT2_A132BarCodReo[0] ;
            A129BarCod = P0AAT2_A129BarCod[0] ;
            A2813MetPieCod = P0AAT2_A2813MetPieCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAAT2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2809MetTerCod)==0) )
         {
            AV25Option = A2809MetTerCod ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAT2 )
         {
            brkAAT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMETPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMetPieCod = AV37SearchTxt ;
      AV13TFMetPieCod_Sel = "" ;
      AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV10TFMetTerCod ;
      AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV12TFMetPieCod ;
      AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV16TFMetPieKil ;
      AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV14TFMetPieMet ;
      AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV18TFMetPieAnc ;
      AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV20TFMetPieMtD ;
      AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV22TFMetPieEst ;
      AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV71TFMetPieLoc ;
      AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV72TFMetPieLoc_Sel ;
      AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV73TFMetPieDCP ;
      AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV74TFMetPieDCP_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           AV57Emprcod ,
                                           Integer.valueOf(AV58Barcod) ,
                                           Byte.valueOf(AV59Barcodreo) ,
                                           AV60Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor P0AAT3 */
      pr_default.execute(1, new Object[] {AV57Emprcod, Integer.valueOf(AV58Barcod), Byte.valueOf(AV59Barcodreo), AV60Barcodpar, lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAAT4 = false ;
         A130BarCodPar = P0AAT3_A130BarCodPar[0] ;
         A132BarCodReo = P0AAT3_A132BarCodReo[0] ;
         A129BarCod = P0AAT3_A129BarCod[0] ;
         A396EmprCod = P0AAT3_A396EmprCod[0] ;
         A2813MetPieCod = P0AAT3_A2813MetPieCod[0] ;
         A4915MetPieDCP = P0AAT3_A4915MetPieDCP[0] ;
         A4913MetPieLoc = P0AAT3_A4913MetPieLoc[0] ;
         A2816MetPieEst = P0AAT3_A2816MetPieEst[0] ;
         A4910MetPieMtD = P0AAT3_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AAT3_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AAT3_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AAT3_A2814MetPieKil[0] ;
         A2809MetTerCod = P0AAT3_A2809MetTerCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AAT3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AAT3_A129BarCod[0] == A129BarCod ) && ( P0AAT3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AAT3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AAT3_A2813MetPieCod[0], A2813MetPieCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkAAT4 = false ;
            A2809MetTerCod = P0AAT3_A2809MetTerCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAAT4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
         {
            AV25Option = A2813MetPieCod ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAT4 )
         {
            brkAAT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMETPIELOCOPTIONS' Routine */
      returnInSub = false ;
      AV71TFMetPieLoc = AV37SearchTxt ;
      AV72TFMetPieLoc_Sel = "" ;
      AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV10TFMetTerCod ;
      AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV12TFMetPieCod ;
      AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV16TFMetPieKil ;
      AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV14TFMetPieMet ;
      AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV18TFMetPieAnc ;
      AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV20TFMetPieMtD ;
      AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV22TFMetPieEst ;
      AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV71TFMetPieLoc ;
      AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV72TFMetPieLoc_Sel ;
      AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV73TFMetPieDCP ;
      AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV74TFMetPieDCP_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59Barcodreo) ,
                                           A130BarCodPar ,
                                           AV60Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor P0AAT4 */
      pr_default.execute(2, new Object[] {AV57Emprcod, Integer.valueOf(AV58Barcod), Byte.valueOf(AV59Barcodreo), AV60Barcodpar, lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAAT6 = false ;
         A396EmprCod = P0AAT4_A396EmprCod[0] ;
         A129BarCod = P0AAT4_A129BarCod[0] ;
         A132BarCodReo = P0AAT4_A132BarCodReo[0] ;
         A130BarCodPar = P0AAT4_A130BarCodPar[0] ;
         A4913MetPieLoc = P0AAT4_A4913MetPieLoc[0] ;
         A4915MetPieDCP = P0AAT4_A4915MetPieDCP[0] ;
         A2816MetPieEst = P0AAT4_A2816MetPieEst[0] ;
         A4910MetPieMtD = P0AAT4_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AAT4_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AAT4_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AAT4_A2814MetPieKil[0] ;
         A2813MetPieCod = P0AAT4_A2813MetPieCod[0] ;
         A2809MetTerCod = P0AAT4_A2809MetTerCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AAT4_A4913MetPieLoc[0], A4913MetPieLoc) == 0 ) )
         {
            brkAAT6 = false ;
            A396EmprCod = P0AAT4_A396EmprCod[0] ;
            A129BarCod = P0AAT4_A129BarCod[0] ;
            A132BarCodReo = P0AAT4_A132BarCodReo[0] ;
            A130BarCodPar = P0AAT4_A130BarCodPar[0] ;
            A2813MetPieCod = P0AAT4_A2813MetPieCod[0] ;
            A2809MetTerCod = P0AAT4_A2809MetTerCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAAT6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4913MetPieLoc)==0) )
         {
            AV25Option = A4913MetPieLoc ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAT6 )
         {
            brkAAT6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMETPIEDCPOPTIONS' Routine */
      returnInSub = false ;
      AV73TFMetPieDCP = AV37SearchTxt ;
      AV74TFMetPieDCP_Sel = "" ;
      AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = AV10TFMetTerCod ;
      AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = AV11TFMetTerCod_Sel ;
      AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = AV12TFMetPieCod ;
      AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = AV13TFMetPieCod_Sel ;
      AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = AV16TFMetPieKil ;
      AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = AV17TFMetPieKil_To ;
      AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = AV14TFMetPieMet ;
      AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = AV15TFMetPieMet_To ;
      AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc = AV18TFMetPieAnc ;
      AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to = AV19TFMetPieAnc_To ;
      AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = AV20TFMetPieMtD ;
      AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = AV21TFMetPieMtD_To ;
      AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest = AV22TFMetPieEst ;
      AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to = AV23TFMetPieEst_To ;
      AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = AV71TFMetPieLoc ;
      AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = AV72TFMetPieLoc_Sel ;
      AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = AV73TFMetPieDCP ;
      AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = AV74TFMetPieDCP_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                           AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                           AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                           AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                           AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                           AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                           AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                           Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) ,
                                           Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) ,
                                           AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                           AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                           Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) ,
                                           Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) ,
                                           AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                           AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                           AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                           AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4913MetPieLoc ,
                                           A4915MetPieDCP ,
                                           A396EmprCod ,
                                           AV57Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV58Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV59Barcodreo) ,
                                           A130BarCodPar ,
                                           AV60Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod), 10, "%") ;
      lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod), 9, "%") ;
      lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = GXutil.padr( GXutil.rtrim( AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc), 10, "%") ;
      lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = GXutil.padr( GXutil.rtrim( AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp), 1, "%") ;
      /* Using cursor P0AAT5 */
      pr_default.execute(3, new Object[] {AV57Emprcod, Integer.valueOf(AV58Barcod), Byte.valueOf(AV59Barcodreo), AV60Barcodpar, lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod, AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel, lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod, AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to, Short.valueOf(AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc), Short.valueOf(AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to), AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to, Byte.valueOf(AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest), Byte.valueOf(AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to), lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc, AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel, lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp, AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAAT8 = false ;
         A396EmprCod = P0AAT5_A396EmprCod[0] ;
         A129BarCod = P0AAT5_A129BarCod[0] ;
         A132BarCodReo = P0AAT5_A132BarCodReo[0] ;
         A130BarCodPar = P0AAT5_A130BarCodPar[0] ;
         A4915MetPieDCP = P0AAT5_A4915MetPieDCP[0] ;
         A4913MetPieLoc = P0AAT5_A4913MetPieLoc[0] ;
         A2816MetPieEst = P0AAT5_A2816MetPieEst[0] ;
         A4910MetPieMtD = P0AAT5_A4910MetPieMtD[0] ;
         A6635MetPieAnc = P0AAT5_A6635MetPieAnc[0] ;
         A2815MetPieMet = P0AAT5_A2815MetPieMet[0] ;
         A2814MetPieKil = P0AAT5_A2814MetPieKil[0] ;
         A2813MetPieCod = P0AAT5_A2813MetPieCod[0] ;
         A2809MetTerCod = P0AAT5_A2809MetTerCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AAT5_A4915MetPieDCP[0], A4915MetPieDCP) == 0 ) )
         {
            brkAAT8 = false ;
            A396EmprCod = P0AAT5_A396EmprCod[0] ;
            A129BarCod = P0AAT5_A129BarCod[0] ;
            A132BarCodReo = P0AAT5_A132BarCodReo[0] ;
            A130BarCodPar = P0AAT5_A130BarCodPar[0] ;
            A2813MetPieCod = P0AAT5_A2813MetPieCod[0] ;
            A2809MetTerCod = P0AAT5_A2809MetTerCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAAT8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4915MetPieDCP)==0) )
         {
            AV25Option = A4915MetPieDCP ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4915MetPieDCP, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAT8 )
         {
            brkAAT8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientorolloswcgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = mantenimientorolloswcgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = mantenimientorolloswcgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFMetTerCod = "" ;
      AV11TFMetTerCod_Sel = "" ;
      AV12TFMetPieCod = "" ;
      AV13TFMetPieCod_Sel = "" ;
      AV16TFMetPieKil = DecimalUtil.ZERO ;
      AV17TFMetPieKil_To = DecimalUtil.ZERO ;
      AV14TFMetPieMet = DecimalUtil.ZERO ;
      AV15TFMetPieMet_To = DecimalUtil.ZERO ;
      AV20TFMetPieMtD = DecimalUtil.ZERO ;
      AV21TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV71TFMetPieLoc = "" ;
      AV72TFMetPieLoc_Sel = "" ;
      AV73TFMetPieDCP = "" ;
      AV74TFMetPieDCP_Sel = "" ;
      AV57Emprcod = "" ;
      AV60Barcodpar = "" ;
      AV61Kms = "" ;
      AV62Maqcod = "" ;
      AV64Mensaje = "" ;
      AV65Barkgm = DecimalUtil.ZERO ;
      AV66BarMtr = DecimalUtil.ZERO ;
      AV68BarRdt = DecimalUtil.ZERO ;
      AV70BarUnimed = "" ;
      A2809MetTerCod = "" ;
      AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = "" ;
      AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel = "" ;
      AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = "" ;
      AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel = "" ;
      AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil = DecimalUtil.ZERO ;
      AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet = DecimalUtil.ZERO ;
      AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd = DecimalUtil.ZERO ;
      AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = "" ;
      AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel = "" ;
      AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = "" ;
      AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel = "" ;
      scmdbuf = "" ;
      lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod = "" ;
      lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod = "" ;
      lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc = "" ;
      lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4913MetPieLoc = "" ;
      A4915MetPieDCP = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P0AAT2_A396EmprCod = new String[] {""} ;
      P0AAT2_A2809MetTerCod = new String[] {""} ;
      P0AAT2_A130BarCodPar = new String[] {""} ;
      P0AAT2_A132BarCodReo = new byte[1] ;
      P0AAT2_A129BarCod = new int[1] ;
      P0AAT2_A4915MetPieDCP = new String[] {""} ;
      P0AAT2_A4913MetPieLoc = new String[] {""} ;
      P0AAT2_A2816MetPieEst = new byte[1] ;
      P0AAT2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT2_A6635MetPieAnc = new short[1] ;
      P0AAT2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT2_A2813MetPieCod = new String[] {""} ;
      AV25Option = "" ;
      P0AAT3_A130BarCodPar = new String[] {""} ;
      P0AAT3_A132BarCodReo = new byte[1] ;
      P0AAT3_A129BarCod = new int[1] ;
      P0AAT3_A396EmprCod = new String[] {""} ;
      P0AAT3_A2813MetPieCod = new String[] {""} ;
      P0AAT3_A4915MetPieDCP = new String[] {""} ;
      P0AAT3_A4913MetPieLoc = new String[] {""} ;
      P0AAT3_A2816MetPieEst = new byte[1] ;
      P0AAT3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT3_A6635MetPieAnc = new short[1] ;
      P0AAT3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT3_A2809MetTerCod = new String[] {""} ;
      P0AAT4_A396EmprCod = new String[] {""} ;
      P0AAT4_A129BarCod = new int[1] ;
      P0AAT4_A132BarCodReo = new byte[1] ;
      P0AAT4_A130BarCodPar = new String[] {""} ;
      P0AAT4_A4913MetPieLoc = new String[] {""} ;
      P0AAT4_A4915MetPieDCP = new String[] {""} ;
      P0AAT4_A2816MetPieEst = new byte[1] ;
      P0AAT4_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT4_A6635MetPieAnc = new short[1] ;
      P0AAT4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT4_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT4_A2813MetPieCod = new String[] {""} ;
      P0AAT4_A2809MetTerCod = new String[] {""} ;
      P0AAT5_A396EmprCod = new String[] {""} ;
      P0AAT5_A129BarCod = new int[1] ;
      P0AAT5_A132BarCodReo = new byte[1] ;
      P0AAT5_A130BarCodPar = new String[] {""} ;
      P0AAT5_A4915MetPieDCP = new String[] {""} ;
      P0AAT5_A4913MetPieLoc = new String[] {""} ;
      P0AAT5_A2816MetPieEst = new byte[1] ;
      P0AAT5_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT5_A6635MetPieAnc = new short[1] ;
      P0AAT5_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT5_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAT5_A2813MetPieCod = new String[] {""} ;
      P0AAT5_A2809MetTerCod = new String[] {""} ;
      AV27OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.mantenimientorolloswcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AAT2_A396EmprCod, P0AAT2_A2809MetTerCod, P0AAT2_A130BarCodPar, P0AAT2_A132BarCodReo, P0AAT2_A129BarCod, P0AAT2_A4915MetPieDCP, P0AAT2_A4913MetPieLoc, P0AAT2_A2816MetPieEst, P0AAT2_A4910MetPieMtD, P0AAT2_A6635MetPieAnc,
            P0AAT2_A2815MetPieMet, P0AAT2_A2814MetPieKil, P0AAT2_A2813MetPieCod
            }
            , new Object[] {
            P0AAT3_A130BarCodPar, P0AAT3_A132BarCodReo, P0AAT3_A129BarCod, P0AAT3_A396EmprCod, P0AAT3_A2813MetPieCod, P0AAT3_A4915MetPieDCP, P0AAT3_A4913MetPieLoc, P0AAT3_A2816MetPieEst, P0AAT3_A4910MetPieMtD, P0AAT3_A6635MetPieAnc,
            P0AAT3_A2815MetPieMet, P0AAT3_A2814MetPieKil, P0AAT3_A2809MetTerCod
            }
            , new Object[] {
            P0AAT4_A396EmprCod, P0AAT4_A129BarCod, P0AAT4_A132BarCodReo, P0AAT4_A130BarCodPar, P0AAT4_A4913MetPieLoc, P0AAT4_A4915MetPieDCP, P0AAT4_A2816MetPieEst, P0AAT4_A4910MetPieMtD, P0AAT4_A6635MetPieAnc, P0AAT4_A2815MetPieMet,
            P0AAT4_A2814MetPieKil, P0AAT4_A2813MetPieCod, P0AAT4_A2809MetTerCod
            }
            , new Object[] {
            P0AAT5_A396EmprCod, P0AAT5_A129BarCod, P0AAT5_A132BarCodReo, P0AAT5_A130BarCodPar, P0AAT5_A4915MetPieDCP, P0AAT5_A4913MetPieLoc, P0AAT5_A2816MetPieEst, P0AAT5_A4910MetPieMtD, P0AAT5_A6635MetPieAnc, P0AAT5_A2815MetPieMet,
            P0AAT5_A2814MetPieKil, P0AAT5_A2813MetPieCod, P0AAT5_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFMetPieEst ;
   private byte AV23TFMetPieEst_To ;
   private byte AV59Barcodreo ;
   private byte AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ;
   private byte AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ;
   private byte A2816MetPieEst ;
   private byte A132BarCodReo ;
   private short AV18TFMetPieAnc ;
   private short AV19TFMetPieAnc_To ;
   private short AV67BarAncAca1 ;
   private short AV69Barpes ;
   private short AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ;
   private short AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV77GXV1 ;
   private int AV58Barcod ;
   private int AV63Opecod ;
   private int A129BarCod ;
   private long AV30count ;
   private java.math.BigDecimal AV16TFMetPieKil ;
   private java.math.BigDecimal AV17TFMetPieKil_To ;
   private java.math.BigDecimal AV14TFMetPieMet ;
   private java.math.BigDecimal AV15TFMetPieMet_To ;
   private java.math.BigDecimal AV20TFMetPieMtD ;
   private java.math.BigDecimal AV21TFMetPieMtD_To ;
   private java.math.BigDecimal AV65Barkgm ;
   private java.math.BigDecimal AV66BarMtr ;
   private java.math.BigDecimal AV68BarRdt ;
   private java.math.BigDecimal AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ;
   private java.math.BigDecimal AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ;
   private java.math.BigDecimal AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ;
   private java.math.BigDecimal AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ;
   private java.math.BigDecimal AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ;
   private java.math.BigDecimal AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String AV10TFMetTerCod ;
   private String AV11TFMetTerCod_Sel ;
   private String AV12TFMetPieCod ;
   private String AV13TFMetPieCod_Sel ;
   private String AV71TFMetPieLoc ;
   private String AV72TFMetPieLoc_Sel ;
   private String AV73TFMetPieDCP ;
   private String AV74TFMetPieDCP_Sel ;
   private String AV57Emprcod ;
   private String AV60Barcodpar ;
   private String AV61Kms ;
   private String AV62Maqcod ;
   private String AV70BarUnimed ;
   private String A2809MetTerCod ;
   private String AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ;
   private String AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ;
   private String AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ;
   private String AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ;
   private String AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ;
   private String AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ;
   private String AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ;
   private String AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ;
   private String scmdbuf ;
   private String lV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ;
   private String lV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ;
   private String lV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ;
   private String lV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ;
   private String A2813MetPieCod ;
   private String A4913MetPieLoc ;
   private String A4915MetPieDCP ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAAT2 ;
   private boolean brkAAT4 ;
   private boolean brkAAT6 ;
   private boolean brkAAT8 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV64Mensaje ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAT2_A396EmprCod ;
   private String[] P0AAT2_A2809MetTerCod ;
   private String[] P0AAT2_A130BarCodPar ;
   private byte[] P0AAT2_A132BarCodReo ;
   private int[] P0AAT2_A129BarCod ;
   private String[] P0AAT2_A4915MetPieDCP ;
   private String[] P0AAT2_A4913MetPieLoc ;
   private byte[] P0AAT2_A2816MetPieEst ;
   private java.math.BigDecimal[] P0AAT2_A4910MetPieMtD ;
   private short[] P0AAT2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AAT2_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AAT2_A2814MetPieKil ;
   private String[] P0AAT2_A2813MetPieCod ;
   private String[] P0AAT3_A130BarCodPar ;
   private byte[] P0AAT3_A132BarCodReo ;
   private int[] P0AAT3_A129BarCod ;
   private String[] P0AAT3_A396EmprCod ;
   private String[] P0AAT3_A2813MetPieCod ;
   private String[] P0AAT3_A4915MetPieDCP ;
   private String[] P0AAT3_A4913MetPieLoc ;
   private byte[] P0AAT3_A2816MetPieEst ;
   private java.math.BigDecimal[] P0AAT3_A4910MetPieMtD ;
   private short[] P0AAT3_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AAT3_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AAT3_A2814MetPieKil ;
   private String[] P0AAT3_A2809MetTerCod ;
   private String[] P0AAT4_A396EmprCod ;
   private int[] P0AAT4_A129BarCod ;
   private byte[] P0AAT4_A132BarCodReo ;
   private String[] P0AAT4_A130BarCodPar ;
   private String[] P0AAT4_A4913MetPieLoc ;
   private String[] P0AAT4_A4915MetPieDCP ;
   private byte[] P0AAT4_A2816MetPieEst ;
   private java.math.BigDecimal[] P0AAT4_A4910MetPieMtD ;
   private short[] P0AAT4_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AAT4_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AAT4_A2814MetPieKil ;
   private String[] P0AAT4_A2813MetPieCod ;
   private String[] P0AAT4_A2809MetTerCod ;
   private String[] P0AAT5_A396EmprCod ;
   private int[] P0AAT5_A129BarCod ;
   private byte[] P0AAT5_A132BarCodReo ;
   private String[] P0AAT5_A130BarCodPar ;
   private String[] P0AAT5_A4915MetPieDCP ;
   private String[] P0AAT5_A4913MetPieLoc ;
   private byte[] P0AAT5_A2816MetPieEst ;
   private java.math.BigDecimal[] P0AAT5_A4910MetPieMtD ;
   private short[] P0AAT5_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AAT5_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AAT5_A2814MetPieKil ;
   private String[] P0AAT5_A2813MetPieCod ;
   private String[] P0AAT5_A2809MetTerCod ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class mantenimientorolloswcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          int A129BarCod ,
                                          int AV58Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV59Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV60Barcodpar ,
                                          String AV57Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, MetTerCod, BarCodPar, BarCodReo, BarCod, MetPieDCP, MetPieLoc, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AAT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          String AV57Emprcod ,
                                          int AV58Barcod ,
                                          byte AV59Barcodreo ,
                                          String AV60Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, MetPieCod, MetPieDCP, MetPieLoc, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AAT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A129BarCod ,
                                          int AV58Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV59Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV60Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieLoc, MetPieDCP, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MetPieLoc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AAT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel ,
                                          String AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod ,
                                          String AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel ,
                                          String AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod ,
                                          java.math.BigDecimal AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil ,
                                          java.math.BigDecimal AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to ,
                                          java.math.BigDecimal AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet ,
                                          java.math.BigDecimal AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to ,
                                          short AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc ,
                                          short AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to ,
                                          java.math.BigDecimal AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd ,
                                          java.math.BigDecimal AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to ,
                                          byte AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest ,
                                          byte AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to ,
                                          String AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel ,
                                          String AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc ,
                                          String AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel ,
                                          String AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4913MetPieLoc ,
                                          String A4915MetPieDCP ,
                                          String A396EmprCod ,
                                          String AV57Emprcod ,
                                          int A129BarCod ,
                                          int AV58Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV59Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV60Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieDCP, MetPieLoc, MetPieEst, MetPieMtD, MetPieAnc, MetPieMet, MetPieKil, MetPieCod, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_mantenimientorollos_wcds_1_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_mantenimientorollos_wcds_2_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV81Pedidosclientesindetalle_mantenimientorollos_wcds_3_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Pedidosclientesindetalle_mantenimientorollos_wcds_4_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidosclientesindetalle_mantenimientorollos_wcds_5_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidosclientesindetalle_mantenimientorollos_wcds_6_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Pedidosclientesindetalle_mantenimientorollos_wcds_7_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Pedidosclientesindetalle_mantenimientorollos_wcds_8_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Pedidosclientesindetalle_mantenimientorollos_wcds_9_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Pedidosclientesindetalle_mantenimientorollos_wcds_10_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Pedidosclientesindetalle_mantenimientorollos_wcds_11_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Pedidosclientesindetalle_mantenimientorollos_wcds_12_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMtD <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_mantenimientorollos_wcds_13_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV92Pedidosclientesindetalle_mantenimientorollos_wcds_14_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_mantenimientorollos_wcds_15_tfmetpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_mantenimientorollos_wcds_16_tfmetpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieLoc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) && ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_mantenimientorollos_wcds_17_tfmetpiedcp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieDCP) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_mantenimientorollos_wcds_18_tfmetpiedcp_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieDCP = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MetPieDCP" ;
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
                  return conditional_P0AAT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_P0AAT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
            case 2 :
                  return conditional_P0AAT4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 3 :
                  return conditional_P0AAT5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
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
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
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
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
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
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
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
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

