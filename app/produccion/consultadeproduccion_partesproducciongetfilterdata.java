package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_partesproducciongetfilterdata extends GXProcedure
{
   public consultadeproduccion_partesproducciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_partesproducciongetfilterdata.class ), "" );
   }

   public consultadeproduccion_partesproducciongetfilterdata( int remoteHandle ,
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
      consultadeproduccion_partesproducciongetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion_partesproducciongetfilterdata.this.AV38DDOName = aP0;
      consultadeproduccion_partesproducciongetfilterdata.this.AV36SearchTxt = aP1;
      consultadeproduccion_partesproducciongetfilterdata.this.AV37SearchTxtTo = aP2;
      consultadeproduccion_partesproducciongetfilterdata.this.aP3 = aP3;
      consultadeproduccion_partesproducciongetfilterdata.this.aP4 = aP4;
      consultadeproduccion_partesproducciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FASE") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FASE_DSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASE_DSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_GRUOPECOD_NOMBRE") == 0 )
      {
         /* Execute user subroutine: 'LOADGRUOPECOD_NOMBREOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_PartesProduccionGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV10TFBarOrdLin = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarOrdLin_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV12TFFase = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV13TFFase_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC") == 0 )
         {
            AV14TFFase_Dsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC_SEL") == 0 )
         {
            AV15TFFase_Dsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV16TFMaqCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV17TFMaqCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV18TFMaqDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV19TFMaqDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV22TFGruOpeCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFGruOpeCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE") == 0 )
         {
            AV20TFGruopecod_Nombre = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE_SEL") == 0 )
         {
            AV21TFGruopecod_Nombre_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV24TFHisProKgr = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFHisProKgr_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV26TFHisProMtr = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFHisProMtr_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV28TFHisProDTI = localUtil.ctot( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV30TFHisProDTF = localUtil.ctot( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV32TFParCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFParCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV34TFParCodNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV35TFParCodNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55EmprCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV56BarCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV57BarCodReo = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV58BarCodPar = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV59Clicod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV60CliNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV61PedidoCliente = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV62Barser = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV63BarSerDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV64Barcolnom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV65Barcolnum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFase = AV36SearchTxt ;
      AV13TFFase_Sel = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV55EmprCod ;
      AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV56BarCod ;
      AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV57BarCodReo ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV58BarCodPar ;
      AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV12TFFase ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV13TFFase_Sel ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV14TFFase_Dsc ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV15TFFase_Dsc_Sel ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV16TFMaqCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV18TFMaqDsc ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV22TFGruOpeCod ;
      AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV23TFGruOpeCod_To ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV20TFGruopecod_Nombre ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV21TFGruopecod_Nombre_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV26TFHisProMtr ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV28TFHisProDTI ;
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV30TFHisProDTF ;
      AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV32TFParCod ;
      AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV33TFParCod_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV34TFParCodNom ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV35TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LL2 */
      pr_default.execute(0, new Object[] {AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LL2 = false ;
         A129BarCod = P09LL2_A129BarCod[0] ;
         A132BarCodReo = P09LL2_A132BarCodReo[0] ;
         A130BarCodPar = P09LL2_A130BarCodPar[0] ;
         A867ParCodNom = P09LL2_A867ParCodNom[0] ;
         n867ParCodNom = P09LL2_n867ParCodNom[0] ;
         A656ParCod = P09LL2_A656ParCod[0] ;
         n656ParCod = P09LL2_n656ParCod[0] ;
         A4441HisProDTF = P09LL2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LL2_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LL2_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LL2_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LL2_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LL2_A1525HisProKgr[0] ;
         A606MaqDsc = P09LL2_A606MaqDsc[0] ;
         n606MaqDsc = P09LL2_n606MaqDsc[0] ;
         A602MaqCod = P09LL2_A602MaqCod[0] ;
         A194BarOrdLin = P09LL2_A194BarOrdLin[0] ;
         A461Fase = P09LL2_A461Fase[0] ;
         A503GruOpeCod = P09LL2_A503GruOpeCod[0] ;
         A396EmprCod = P09LL2_A396EmprCod[0] ;
         A558HisProFec = P09LL2_A558HisProFec[0] ;
         A561HisProLin = P09LL2_A561HisProLin[0] ;
         A606MaqDsc = P09LL2_A606MaqDsc[0] ;
         n606MaqDsc = P09LL2_n606MaqDsc[0] ;
         A867ParCodNom = P09LL2_A867ParCodNom[0] ;
         n867ParCodNom = P09LL2_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     AV48count = 0 ;
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LL2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09LL2_A129BarCod[0] == A129BarCod ) && ( P09LL2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09LL2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                     {
                        if ( ! ( ( GXutil.strcmp(P09LL2_A461Fase[0], A461Fase) == 0 ) ) )
                        {
                           if (true) break;
                        }
                        brk9LL2 = false ;
                        A602MaqCod = P09LL2_A602MaqCod[0] ;
                        A558HisProFec = P09LL2_A558HisProFec[0] ;
                        A561HisProLin = P09LL2_A561HisProLin[0] ;
                        AV48count = (long)(AV48count+1) ;
                        brk9LL2 = true ;
                        pr_default.readNext(0);
                     }
                     if ( ! (GXutil.strcmp("", A461Fase)==0) )
                     {
                        AV40Option = A461Fase ;
                        AV41Options.add(AV40Option, 0);
                        AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV41Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9LL2 )
         {
            brk9LL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASE_DSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFase_Dsc = AV36SearchTxt ;
      AV15TFFase_Dsc_Sel = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV55EmprCod ;
      AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV56BarCod ;
      AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV57BarCodReo ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV58BarCodPar ;
      AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV12TFFase ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV13TFFase_Sel ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV14TFFase_Dsc ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV15TFFase_Dsc_Sel ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV16TFMaqCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV18TFMaqDsc ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV22TFGruOpeCod ;
      AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV23TFGruOpeCod_To ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV20TFGruopecod_Nombre ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV21TFGruopecod_Nombre_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV26TFHisProMtr ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV28TFHisProDTI ;
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV30TFHisProDTF ;
      AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV32TFParCod ;
      AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV33TFParCod_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV34TFParCodNom ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV35TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LL3 */
      pr_default.execute(1, new Object[] {AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A867ParCodNom = P09LL3_A867ParCodNom[0] ;
         n867ParCodNom = P09LL3_n867ParCodNom[0] ;
         A656ParCod = P09LL3_A656ParCod[0] ;
         n656ParCod = P09LL3_n656ParCod[0] ;
         A4441HisProDTF = P09LL3_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LL3_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LL3_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LL3_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LL3_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LL3_A1525HisProKgr[0] ;
         A606MaqDsc = P09LL3_A606MaqDsc[0] ;
         n606MaqDsc = P09LL3_n606MaqDsc[0] ;
         A602MaqCod = P09LL3_A602MaqCod[0] ;
         A194BarOrdLin = P09LL3_A194BarOrdLin[0] ;
         A130BarCodPar = P09LL3_A130BarCodPar[0] ;
         A132BarCodReo = P09LL3_A132BarCodReo[0] ;
         A129BarCod = P09LL3_A129BarCod[0] ;
         A461Fase = P09LL3_A461Fase[0] ;
         A503GruOpeCod = P09LL3_A503GruOpeCod[0] ;
         A396EmprCod = P09LL3_A396EmprCod[0] ;
         A558HisProFec = P09LL3_A558HisProFec[0] ;
         A561HisProLin = P09LL3_A561HisProLin[0] ;
         A606MaqDsc = P09LL3_A606MaqDsc[0] ;
         n606MaqDsc = P09LL3_n606MaqDsc[0] ;
         A867ParCodNom = P09LL3_A867ParCodNom[0] ;
         n867ParCodNom = P09LL3_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     if ( ! (GXutil.strcmp("", A14027Fase_Dsc)==0) )
                     {
                        AV40Option = A14027Fase_Dsc ;
                        AV39InsertIndex = 1 ;
                        while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) < 0 ) )
                        {
                           AV39InsertIndex = (int)(AV39InsertIndex+1) ;
                        }
                        if ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) == 0 ) )
                        {
                           AV48count = GXutil.lval( (String)AV46OptionIndexes.elementAt(-1+AV39InsertIndex)) ;
                           AV48count = (long)(AV48count+1) ;
                           AV46OptionIndexes.removeItem(AV39InsertIndex);
                           AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
                        }
                        else
                        {
                           AV41Options.add(AV40Option, AV39InsertIndex);
                           AV46OptionIndexes.add("1", AV39InsertIndex);
                        }
                     }
                     if ( AV41Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCod = AV36SearchTxt ;
      AV17TFMaqCod_Sel = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV55EmprCod ;
      AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV56BarCod ;
      AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV57BarCodReo ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV58BarCodPar ;
      AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV12TFFase ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV13TFFase_Sel ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV14TFFase_Dsc ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV15TFFase_Dsc_Sel ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV16TFMaqCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV18TFMaqDsc ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV22TFGruOpeCod ;
      AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV23TFGruOpeCod_To ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV20TFGruopecod_Nombre ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV21TFGruopecod_Nombre_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV26TFHisProMtr ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV28TFHisProDTI ;
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV30TFHisProDTF ;
      AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV32TFParCod ;
      AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV33TFParCod_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV34TFParCodNom ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV35TFParCodNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LL4 */
      pr_default.execute(2, new Object[] {AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9LL5 = false ;
         A129BarCod = P09LL4_A129BarCod[0] ;
         A132BarCodReo = P09LL4_A132BarCodReo[0] ;
         A130BarCodPar = P09LL4_A130BarCodPar[0] ;
         A602MaqCod = P09LL4_A602MaqCod[0] ;
         A867ParCodNom = P09LL4_A867ParCodNom[0] ;
         n867ParCodNom = P09LL4_n867ParCodNom[0] ;
         A656ParCod = P09LL4_A656ParCod[0] ;
         n656ParCod = P09LL4_n656ParCod[0] ;
         A4441HisProDTF = P09LL4_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LL4_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LL4_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LL4_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LL4_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LL4_A1525HisProKgr[0] ;
         A606MaqDsc = P09LL4_A606MaqDsc[0] ;
         n606MaqDsc = P09LL4_n606MaqDsc[0] ;
         A194BarOrdLin = P09LL4_A194BarOrdLin[0] ;
         A461Fase = P09LL4_A461Fase[0] ;
         A503GruOpeCod = P09LL4_A503GruOpeCod[0] ;
         A396EmprCod = P09LL4_A396EmprCod[0] ;
         A558HisProFec = P09LL4_A558HisProFec[0] ;
         A561HisProLin = P09LL4_A561HisProLin[0] ;
         A606MaqDsc = P09LL4_A606MaqDsc[0] ;
         n606MaqDsc = P09LL4_n606MaqDsc[0] ;
         A867ParCodNom = P09LL4_A867ParCodNom[0] ;
         n867ParCodNom = P09LL4_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     AV48count = 0 ;
                     while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09LL4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09LL4_A129BarCod[0] == A129BarCod ) && ( P09LL4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09LL4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                     {
                        if ( ! ( ( GXutil.strcmp(P09LL4_A602MaqCod[0], A602MaqCod) == 0 ) ) )
                        {
                           if (true) break;
                        }
                        brk9LL5 = false ;
                        A558HisProFec = P09LL4_A558HisProFec[0] ;
                        A561HisProLin = P09LL4_A561HisProLin[0] ;
                        AV48count = (long)(AV48count+1) ;
                        brk9LL5 = true ;
                        pr_default.readNext(2);
                     }
                     if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
                     {
                        AV40Option = A602MaqCod ;
                        AV41Options.add(AV40Option, 0);
                        AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV41Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9LL5 )
         {
            brk9LL5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFMaqDsc = AV36SearchTxt ;
      AV19TFMaqDsc_Sel = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV55EmprCod ;
      AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV56BarCod ;
      AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV57BarCodReo ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV58BarCodPar ;
      AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV12TFFase ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV13TFFase_Sel ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV14TFFase_Dsc ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV15TFFase_Dsc_Sel ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV16TFMaqCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV18TFMaqDsc ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV22TFGruOpeCod ;
      AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV23TFGruOpeCod_To ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV20TFGruopecod_Nombre ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV21TFGruopecod_Nombre_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV26TFHisProMtr ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV28TFHisProDTI ;
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV30TFHisProDTF ;
      AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV32TFParCod ;
      AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV33TFParCod_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV34TFParCodNom ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV35TFParCodNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LL5 */
      pr_default.execute(3, new Object[] {AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9LL7 = false ;
         A129BarCod = P09LL5_A129BarCod[0] ;
         A132BarCodReo = P09LL5_A132BarCodReo[0] ;
         A130BarCodPar = P09LL5_A130BarCodPar[0] ;
         A606MaqDsc = P09LL5_A606MaqDsc[0] ;
         n606MaqDsc = P09LL5_n606MaqDsc[0] ;
         A867ParCodNom = P09LL5_A867ParCodNom[0] ;
         n867ParCodNom = P09LL5_n867ParCodNom[0] ;
         A656ParCod = P09LL5_A656ParCod[0] ;
         n656ParCod = P09LL5_n656ParCod[0] ;
         A4441HisProDTF = P09LL5_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LL5_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LL5_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LL5_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LL5_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LL5_A1525HisProKgr[0] ;
         A602MaqCod = P09LL5_A602MaqCod[0] ;
         A194BarOrdLin = P09LL5_A194BarOrdLin[0] ;
         A461Fase = P09LL5_A461Fase[0] ;
         A503GruOpeCod = P09LL5_A503GruOpeCod[0] ;
         A396EmprCod = P09LL5_A396EmprCod[0] ;
         A558HisProFec = P09LL5_A558HisProFec[0] ;
         A561HisProLin = P09LL5_A561HisProLin[0] ;
         A606MaqDsc = P09LL5_A606MaqDsc[0] ;
         n606MaqDsc = P09LL5_n606MaqDsc[0] ;
         A867ParCodNom = P09LL5_A867ParCodNom[0] ;
         n867ParCodNom = P09LL5_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     AV48count = 0 ;
                     while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09LL5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09LL5_A129BarCod[0] == A129BarCod ) && ( P09LL5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09LL5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                     {
                        if ( ! ( ( GXutil.strcmp(P09LL5_A606MaqDsc[0], A606MaqDsc) == 0 ) ) )
                        {
                           if (true) break;
                        }
                        brk9LL7 = false ;
                        A602MaqCod = P09LL5_A602MaqCod[0] ;
                        A558HisProFec = P09LL5_A558HisProFec[0] ;
                        A561HisProLin = P09LL5_A561HisProLin[0] ;
                        AV48count = (long)(AV48count+1) ;
                        brk9LL7 = true ;
                        pr_default.readNext(3);
                     }
                     if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
                     {
                        AV40Option = A606MaqDsc ;
                        AV41Options.add(AV40Option, 0);
                        AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV41Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9LL7 )
         {
            brk9LL7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADGRUOPECOD_NOMBREOPTIONS' Routine */
      returnInSub = false ;
      AV20TFGruopecod_Nombre = AV36SearchTxt ;
      AV21TFGruopecod_Nombre_Sel = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV55EmprCod ;
      AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV56BarCod ;
      AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV57BarCodReo ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV58BarCodPar ;
      AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV12TFFase ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV13TFFase_Sel ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV14TFFase_Dsc ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV15TFFase_Dsc_Sel ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV16TFMaqCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV18TFMaqDsc ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV22TFGruOpeCod ;
      AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV23TFGruOpeCod_To ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV20TFGruopecod_Nombre ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV21TFGruopecod_Nombre_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV26TFHisProMtr ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV28TFHisProDTI ;
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV30TFHisProDTF ;
      AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV32TFParCod ;
      AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV33TFParCod_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV34TFParCodNom ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV35TFParCodNom_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LL6 */
      pr_default.execute(4, new Object[] {AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A867ParCodNom = P09LL6_A867ParCodNom[0] ;
         n867ParCodNom = P09LL6_n867ParCodNom[0] ;
         A656ParCod = P09LL6_A656ParCod[0] ;
         n656ParCod = P09LL6_n656ParCod[0] ;
         A4441HisProDTF = P09LL6_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LL6_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LL6_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LL6_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LL6_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LL6_A1525HisProKgr[0] ;
         A606MaqDsc = P09LL6_A606MaqDsc[0] ;
         n606MaqDsc = P09LL6_n606MaqDsc[0] ;
         A602MaqCod = P09LL6_A602MaqCod[0] ;
         A194BarOrdLin = P09LL6_A194BarOrdLin[0] ;
         A130BarCodPar = P09LL6_A130BarCodPar[0] ;
         A132BarCodReo = P09LL6_A132BarCodReo[0] ;
         A129BarCod = P09LL6_A129BarCod[0] ;
         A461Fase = P09LL6_A461Fase[0] ;
         A503GruOpeCod = P09LL6_A503GruOpeCod[0] ;
         A396EmprCod = P09LL6_A396EmprCod[0] ;
         A558HisProFec = P09LL6_A558HisProFec[0] ;
         A561HisProLin = P09LL6_A561HisProLin[0] ;
         A606MaqDsc = P09LL6_A606MaqDsc[0] ;
         n606MaqDsc = P09LL6_n606MaqDsc[0] ;
         A867ParCodNom = P09LL6_A867ParCodNom[0] ;
         n867ParCodNom = P09LL6_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     if ( ! (GXutil.strcmp("", A14028Gruopecod_)==0) )
                     {
                        AV40Option = A14028Gruopecod_ ;
                        AV39InsertIndex = 1 ;
                        while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) < 0 ) )
                        {
                           AV39InsertIndex = (int)(AV39InsertIndex+1) ;
                        }
                        if ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) == 0 ) )
                        {
                           AV48count = GXutil.lval( (String)AV46OptionIndexes.elementAt(-1+AV39InsertIndex)) ;
                           AV48count = (long)(AV48count+1) ;
                           AV46OptionIndexes.removeItem(AV39InsertIndex);
                           AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
                        }
                        else
                        {
                           AV41Options.add(AV40Option, AV39InsertIndex);
                           AV46OptionIndexes.add("1", AV39InsertIndex);
                        }
                     }
                     if ( AV41Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV34TFParCodNom = AV36SearchTxt ;
      AV35TFParCodNom_Sel = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV55EmprCod ;
      AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV56BarCod ;
      AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV57BarCodReo ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV58BarCodPar ;
      AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV10TFBarOrdLin ;
      AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV12TFFase ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV13TFFase_Sel ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV14TFFase_Dsc ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV15TFFase_Dsc_Sel ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV16TFMaqCod ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV17TFMaqCod_Sel ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV18TFMaqDsc ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV19TFMaqDsc_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV22TFGruOpeCod ;
      AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV23TFGruOpeCod_To ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV20TFGruopecod_Nombre ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV21TFGruopecod_Nombre_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV24TFHisProKgr ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV25TFHisProKgr_To ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV26TFHisProMtr ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV27TFHisProMtr_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV28TFHisProDTI ;
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV30TFHisProDTF ;
      AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV32TFParCod ;
      AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV33TFParCod_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV34TFParCodNom ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV35TFParCodNom_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LL7 */
      pr_default.execute(5, new Object[] {AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9LL10 = false ;
         A129BarCod = P09LL7_A129BarCod[0] ;
         A132BarCodReo = P09LL7_A132BarCodReo[0] ;
         A130BarCodPar = P09LL7_A130BarCodPar[0] ;
         A656ParCod = P09LL7_A656ParCod[0] ;
         n656ParCod = P09LL7_n656ParCod[0] ;
         A867ParCodNom = P09LL7_A867ParCodNom[0] ;
         n867ParCodNom = P09LL7_n867ParCodNom[0] ;
         A4441HisProDTF = P09LL7_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LL7_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LL7_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LL7_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LL7_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LL7_A1525HisProKgr[0] ;
         A606MaqDsc = P09LL7_A606MaqDsc[0] ;
         n606MaqDsc = P09LL7_n606MaqDsc[0] ;
         A602MaqCod = P09LL7_A602MaqCod[0] ;
         A194BarOrdLin = P09LL7_A194BarOrdLin[0] ;
         A461Fase = P09LL7_A461Fase[0] ;
         A503GruOpeCod = P09LL7_A503GruOpeCod[0] ;
         A396EmprCod = P09LL7_A396EmprCod[0] ;
         A558HisProFec = P09LL7_A558HisProFec[0] ;
         A561HisProLin = P09LL7_A561HisProLin[0] ;
         A606MaqDsc = P09LL7_A606MaqDsc[0] ;
         n606MaqDsc = P09LL7_n606MaqDsc[0] ;
         A867ParCodNom = P09LL7_A867ParCodNom[0] ;
         n867ParCodNom = P09LL7_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
                     AV48count = 0 ;
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09LL7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09LL7_A129BarCod[0] == A129BarCod ) && ( P09LL7_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09LL7_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                     {
                        if ( ! ( ( P09LL7_A656ParCod[0] == A656ParCod ) ) )
                        {
                           if (true) break;
                        }
                        brk9LL10 = false ;
                        A602MaqCod = P09LL7_A602MaqCod[0] ;
                        A558HisProFec = P09LL7_A558HisProFec[0] ;
                        A561HisProLin = P09LL7_A561HisProLin[0] ;
                        AV48count = (long)(AV48count+1) ;
                        brk9LL10 = true ;
                        pr_default.readNext(5);
                     }
                     if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
                     {
                        AV40Option = A867ParCodNom ;
                        AV39InsertIndex = 1 ;
                        while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) < 0 ) )
                        {
                           AV39InsertIndex = (int)(AV39InsertIndex+1) ;
                        }
                        AV41Options.add(AV40Option, AV39InsertIndex);
                        AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
                     }
                     if ( AV41Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9LL10 )
         {
            brk9LL10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_partesproducciongetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = consultadeproduccion_partesproducciongetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = consultadeproduccion_partesproducciongetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFase = "" ;
      AV13TFFase_Sel = "" ;
      AV14TFFase_Dsc = "" ;
      AV15TFFase_Dsc_Sel = "" ;
      AV16TFMaqCod = "" ;
      AV17TFMaqCod_Sel = "" ;
      AV18TFMaqDsc = "" ;
      AV19TFMaqDsc_Sel = "" ;
      AV20TFGruopecod_Nombre = "" ;
      AV21TFGruopecod_Nombre_Sel = "" ;
      AV24TFHisProKgr = DecimalUtil.ZERO ;
      AV25TFHisProKgr_To = DecimalUtil.ZERO ;
      AV26TFHisProMtr = DecimalUtil.ZERO ;
      AV27TFHisProMtr_To = DecimalUtil.ZERO ;
      AV28TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV30TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV34TFParCodNom = "" ;
      AV35TFParCodNom_Sel = "" ;
      AV55EmprCod = "" ;
      AV58BarCodPar = "" ;
      AV60CliNom = "" ;
      AV61PedidoCliente = "" ;
      AV62Barser = "" ;
      AV63BarSerDsc = "" ;
      AV64Barcolnom = "" ;
      A461Fase = "" ;
      AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod = "" ;
      AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = "" ;
      AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = "" ;
      AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = "" ;
      AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = "" ;
      AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = "" ;
      AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = "" ;
      AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = "" ;
      AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = "" ;
      AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A867ParCodNom = "" ;
      A14027Fase_Dsc = "" ;
      A14028Gruopecod_ = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09LL2_A129BarCod = new int[1] ;
      P09LL2_A132BarCodReo = new byte[1] ;
      P09LL2_A130BarCodPar = new String[] {""} ;
      P09LL2_A867ParCodNom = new String[] {""} ;
      P09LL2_n867ParCodNom = new boolean[] {false} ;
      P09LL2_A656ParCod = new short[1] ;
      P09LL2_n656ParCod = new boolean[] {false} ;
      P09LL2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL2_n4441HisProDTF = new boolean[] {false} ;
      P09LL2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL2_n4440HisProDTI = new boolean[] {false} ;
      P09LL2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL2_A606MaqDsc = new String[] {""} ;
      P09LL2_n606MaqDsc = new boolean[] {false} ;
      P09LL2_A602MaqCod = new String[] {""} ;
      P09LL2_A194BarOrdLin = new short[1] ;
      P09LL2_A461Fase = new String[] {""} ;
      P09LL2_A503GruOpeCod = new int[1] ;
      P09LL2_A396EmprCod = new String[] {""} ;
      P09LL2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL2_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      AV40Option = "" ;
      P09LL3_A867ParCodNom = new String[] {""} ;
      P09LL3_n867ParCodNom = new boolean[] {false} ;
      P09LL3_A656ParCod = new short[1] ;
      P09LL3_n656ParCod = new boolean[] {false} ;
      P09LL3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL3_n4441HisProDTF = new boolean[] {false} ;
      P09LL3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL3_n4440HisProDTI = new boolean[] {false} ;
      P09LL3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL3_A606MaqDsc = new String[] {""} ;
      P09LL3_n606MaqDsc = new boolean[] {false} ;
      P09LL3_A602MaqCod = new String[] {""} ;
      P09LL3_A194BarOrdLin = new short[1] ;
      P09LL3_A130BarCodPar = new String[] {""} ;
      P09LL3_A132BarCodReo = new byte[1] ;
      P09LL3_A129BarCod = new int[1] ;
      P09LL3_A461Fase = new String[] {""} ;
      P09LL3_A503GruOpeCod = new int[1] ;
      P09LL3_A396EmprCod = new String[] {""} ;
      P09LL3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL3_A561HisProLin = new int[1] ;
      P09LL4_A129BarCod = new int[1] ;
      P09LL4_A132BarCodReo = new byte[1] ;
      P09LL4_A130BarCodPar = new String[] {""} ;
      P09LL4_A602MaqCod = new String[] {""} ;
      P09LL4_A867ParCodNom = new String[] {""} ;
      P09LL4_n867ParCodNom = new boolean[] {false} ;
      P09LL4_A656ParCod = new short[1] ;
      P09LL4_n656ParCod = new boolean[] {false} ;
      P09LL4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL4_n4441HisProDTF = new boolean[] {false} ;
      P09LL4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL4_n4440HisProDTI = new boolean[] {false} ;
      P09LL4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL4_A606MaqDsc = new String[] {""} ;
      P09LL4_n606MaqDsc = new boolean[] {false} ;
      P09LL4_A194BarOrdLin = new short[1] ;
      P09LL4_A461Fase = new String[] {""} ;
      P09LL4_A503GruOpeCod = new int[1] ;
      P09LL4_A396EmprCod = new String[] {""} ;
      P09LL4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL4_A561HisProLin = new int[1] ;
      P09LL5_A129BarCod = new int[1] ;
      P09LL5_A132BarCodReo = new byte[1] ;
      P09LL5_A130BarCodPar = new String[] {""} ;
      P09LL5_A606MaqDsc = new String[] {""} ;
      P09LL5_n606MaqDsc = new boolean[] {false} ;
      P09LL5_A867ParCodNom = new String[] {""} ;
      P09LL5_n867ParCodNom = new boolean[] {false} ;
      P09LL5_A656ParCod = new short[1] ;
      P09LL5_n656ParCod = new boolean[] {false} ;
      P09LL5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL5_n4441HisProDTF = new boolean[] {false} ;
      P09LL5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL5_n4440HisProDTI = new boolean[] {false} ;
      P09LL5_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL5_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL5_A602MaqCod = new String[] {""} ;
      P09LL5_A194BarOrdLin = new short[1] ;
      P09LL5_A461Fase = new String[] {""} ;
      P09LL5_A503GruOpeCod = new int[1] ;
      P09LL5_A396EmprCod = new String[] {""} ;
      P09LL5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL5_A561HisProLin = new int[1] ;
      P09LL6_A867ParCodNom = new String[] {""} ;
      P09LL6_n867ParCodNom = new boolean[] {false} ;
      P09LL6_A656ParCod = new short[1] ;
      P09LL6_n656ParCod = new boolean[] {false} ;
      P09LL6_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL6_n4441HisProDTF = new boolean[] {false} ;
      P09LL6_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL6_n4440HisProDTI = new boolean[] {false} ;
      P09LL6_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL6_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL6_A606MaqDsc = new String[] {""} ;
      P09LL6_n606MaqDsc = new boolean[] {false} ;
      P09LL6_A602MaqCod = new String[] {""} ;
      P09LL6_A194BarOrdLin = new short[1] ;
      P09LL6_A130BarCodPar = new String[] {""} ;
      P09LL6_A132BarCodReo = new byte[1] ;
      P09LL6_A129BarCod = new int[1] ;
      P09LL6_A461Fase = new String[] {""} ;
      P09LL6_A503GruOpeCod = new int[1] ;
      P09LL6_A396EmprCod = new String[] {""} ;
      P09LL6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL6_A561HisProLin = new int[1] ;
      P09LL7_A129BarCod = new int[1] ;
      P09LL7_A132BarCodReo = new byte[1] ;
      P09LL7_A130BarCodPar = new String[] {""} ;
      P09LL7_A656ParCod = new short[1] ;
      P09LL7_n656ParCod = new boolean[] {false} ;
      P09LL7_A867ParCodNom = new String[] {""} ;
      P09LL7_n867ParCodNom = new boolean[] {false} ;
      P09LL7_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL7_n4441HisProDTF = new boolean[] {false} ;
      P09LL7_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL7_n4440HisProDTI = new boolean[] {false} ;
      P09LL7_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL7_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LL7_A606MaqDsc = new String[] {""} ;
      P09LL7_n606MaqDsc = new boolean[] {false} ;
      P09LL7_A602MaqCod = new String[] {""} ;
      P09LL7_A194BarOrdLin = new short[1] ;
      P09LL7_A461Fase = new String[] {""} ;
      P09LL7_A503GruOpeCod = new int[1] ;
      P09LL7_A396EmprCod = new String[] {""} ;
      P09LL7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LL7_A561HisProLin = new int[1] ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_partesproducciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LL2_A129BarCod, P09LL2_A132BarCodReo, P09LL2_A130BarCodPar, P09LL2_A867ParCodNom, P09LL2_n867ParCodNom, P09LL2_A656ParCod, P09LL2_n656ParCod, P09LL2_A4441HisProDTF, P09LL2_n4441HisProDTF, P09LL2_A4440HisProDTI,
            P09LL2_n4440HisProDTI, P09LL2_A1526HisProMtr, P09LL2_A1525HisProKgr, P09LL2_A606MaqDsc, P09LL2_n606MaqDsc, P09LL2_A602MaqCod, P09LL2_A194BarOrdLin, P09LL2_A461Fase, P09LL2_A503GruOpeCod, P09LL2_A396EmprCod,
            P09LL2_A558HisProFec, P09LL2_A561HisProLin
            }
            , new Object[] {
            P09LL3_A867ParCodNom, P09LL3_n867ParCodNom, P09LL3_A656ParCod, P09LL3_n656ParCod, P09LL3_A4441HisProDTF, P09LL3_n4441HisProDTF, P09LL3_A4440HisProDTI, P09LL3_n4440HisProDTI, P09LL3_A1526HisProMtr, P09LL3_A1525HisProKgr,
            P09LL3_A606MaqDsc, P09LL3_n606MaqDsc, P09LL3_A602MaqCod, P09LL3_A194BarOrdLin, P09LL3_A130BarCodPar, P09LL3_A132BarCodReo, P09LL3_A129BarCod, P09LL3_A461Fase, P09LL3_A503GruOpeCod, P09LL3_A396EmprCod,
            P09LL3_A558HisProFec, P09LL3_A561HisProLin
            }
            , new Object[] {
            P09LL4_A129BarCod, P09LL4_A132BarCodReo, P09LL4_A130BarCodPar, P09LL4_A602MaqCod, P09LL4_A867ParCodNom, P09LL4_n867ParCodNom, P09LL4_A656ParCod, P09LL4_n656ParCod, P09LL4_A4441HisProDTF, P09LL4_n4441HisProDTF,
            P09LL4_A4440HisProDTI, P09LL4_n4440HisProDTI, P09LL4_A1526HisProMtr, P09LL4_A1525HisProKgr, P09LL4_A606MaqDsc, P09LL4_n606MaqDsc, P09LL4_A194BarOrdLin, P09LL4_A461Fase, P09LL4_A503GruOpeCod, P09LL4_A396EmprCod,
            P09LL4_A558HisProFec, P09LL4_A561HisProLin
            }
            , new Object[] {
            P09LL5_A129BarCod, P09LL5_A132BarCodReo, P09LL5_A130BarCodPar, P09LL5_A606MaqDsc, P09LL5_n606MaqDsc, P09LL5_A867ParCodNom, P09LL5_n867ParCodNom, P09LL5_A656ParCod, P09LL5_n656ParCod, P09LL5_A4441HisProDTF,
            P09LL5_n4441HisProDTF, P09LL5_A4440HisProDTI, P09LL5_n4440HisProDTI, P09LL5_A1526HisProMtr, P09LL5_A1525HisProKgr, P09LL5_A602MaqCod, P09LL5_A194BarOrdLin, P09LL5_A461Fase, P09LL5_A503GruOpeCod, P09LL5_A396EmprCod,
            P09LL5_A558HisProFec, P09LL5_A561HisProLin
            }
            , new Object[] {
            P09LL6_A867ParCodNom, P09LL6_n867ParCodNom, P09LL6_A656ParCod, P09LL6_n656ParCod, P09LL6_A4441HisProDTF, P09LL6_n4441HisProDTF, P09LL6_A4440HisProDTI, P09LL6_n4440HisProDTI, P09LL6_A1526HisProMtr, P09LL6_A1525HisProKgr,
            P09LL6_A606MaqDsc, P09LL6_n606MaqDsc, P09LL6_A602MaqCod, P09LL6_A194BarOrdLin, P09LL6_A130BarCodPar, P09LL6_A132BarCodReo, P09LL6_A129BarCod, P09LL6_A461Fase, P09LL6_A503GruOpeCod, P09LL6_A396EmprCod,
            P09LL6_A558HisProFec, P09LL6_A561HisProLin
            }
            , new Object[] {
            P09LL7_A129BarCod, P09LL7_A132BarCodReo, P09LL7_A130BarCodPar, P09LL7_A656ParCod, P09LL7_n656ParCod, P09LL7_A867ParCodNom, P09LL7_n867ParCodNom, P09LL7_A4441HisProDTF, P09LL7_n4441HisProDTF, P09LL7_A4440HisProDTI,
            P09LL7_n4440HisProDTI, P09LL7_A1526HisProMtr, P09LL7_A1525HisProKgr, P09LL7_A606MaqDsc, P09LL7_n606MaqDsc, P09LL7_A602MaqCod, P09LL7_A194BarOrdLin, P09LL7_A461Fase, P09LL7_A503GruOpeCod, P09LL7_A396EmprCod,
            P09LL7_A558HisProFec, P09LL7_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV57BarCodReo ;
   private byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short AV32TFParCod ;
   private short AV33TFParCod_To ;
   private short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ;
   private short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ;
   private short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ;
   private short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV22TFGruOpeCod ;
   private int AV23TFGruOpeCod_To ;
   private int AV56BarCod ;
   private int AV59Clicod ;
   private int AV65Barcolnum ;
   private int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ;
   private int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ;
   private int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private java.math.BigDecimal AV24TFHisProKgr ;
   private java.math.BigDecimal AV25TFHisProKgr_To ;
   private java.math.BigDecimal AV26TFHisProMtr ;
   private java.math.BigDecimal AV27TFHisProMtr_To ;
   private java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ;
   private java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ;
   private java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV12TFFase ;
   private String AV13TFFase_Sel ;
   private String AV14TFFase_Dsc ;
   private String AV15TFFase_Dsc_Sel ;
   private String AV16TFMaqCod ;
   private String AV17TFMaqCod_Sel ;
   private String AV18TFMaqDsc ;
   private String AV19TFMaqDsc_Sel ;
   private String AV20TFGruopecod_Nombre ;
   private String AV21TFGruopecod_Nombre_Sel ;
   private String AV34TFParCodNom ;
   private String AV35TFParCodNom_Sel ;
   private String AV55EmprCod ;
   private String AV58BarCodPar ;
   private String AV60CliNom ;
   private String AV61PedidoCliente ;
   private String AV62Barser ;
   private String AV63BarSerDsc ;
   private String AV64Barcolnom ;
   private String A461Fase ;
   private String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ;
   private String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ;
   private String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ;
   private String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ;
   private String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ;
   private String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ;
   private String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ;
   private String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ;
   private String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ;
   private String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String lV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String lV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String lV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A867ParCodNom ;
   private String A14027Fase_Dsc ;
   private String A14028Gruopecod_ ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV28TFHisProDTI ;
   private java.util.Date AV30TFHisProDTF ;
   private java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ;
   private java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk9LL2 ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private boolean brk9LL5 ;
   private boolean brk9LL7 ;
   private boolean brk9LL10 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV40Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09LL2_A129BarCod ;
   private byte[] P09LL2_A132BarCodReo ;
   private String[] P09LL2_A130BarCodPar ;
   private String[] P09LL2_A867ParCodNom ;
   private boolean[] P09LL2_n867ParCodNom ;
   private short[] P09LL2_A656ParCod ;
   private boolean[] P09LL2_n656ParCod ;
   private java.util.Date[] P09LL2_A4441HisProDTF ;
   private boolean[] P09LL2_n4441HisProDTF ;
   private java.util.Date[] P09LL2_A4440HisProDTI ;
   private boolean[] P09LL2_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LL2_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LL2_A1525HisProKgr ;
   private String[] P09LL2_A606MaqDsc ;
   private boolean[] P09LL2_n606MaqDsc ;
   private String[] P09LL2_A602MaqCod ;
   private short[] P09LL2_A194BarOrdLin ;
   private String[] P09LL2_A461Fase ;
   private int[] P09LL2_A503GruOpeCod ;
   private String[] P09LL2_A396EmprCod ;
   private java.util.Date[] P09LL2_A558HisProFec ;
   private int[] P09LL2_A561HisProLin ;
   private String[] P09LL3_A867ParCodNom ;
   private boolean[] P09LL3_n867ParCodNom ;
   private short[] P09LL3_A656ParCod ;
   private boolean[] P09LL3_n656ParCod ;
   private java.util.Date[] P09LL3_A4441HisProDTF ;
   private boolean[] P09LL3_n4441HisProDTF ;
   private java.util.Date[] P09LL3_A4440HisProDTI ;
   private boolean[] P09LL3_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LL3_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LL3_A1525HisProKgr ;
   private String[] P09LL3_A606MaqDsc ;
   private boolean[] P09LL3_n606MaqDsc ;
   private String[] P09LL3_A602MaqCod ;
   private short[] P09LL3_A194BarOrdLin ;
   private String[] P09LL3_A130BarCodPar ;
   private byte[] P09LL3_A132BarCodReo ;
   private int[] P09LL3_A129BarCod ;
   private String[] P09LL3_A461Fase ;
   private int[] P09LL3_A503GruOpeCod ;
   private String[] P09LL3_A396EmprCod ;
   private java.util.Date[] P09LL3_A558HisProFec ;
   private int[] P09LL3_A561HisProLin ;
   private int[] P09LL4_A129BarCod ;
   private byte[] P09LL4_A132BarCodReo ;
   private String[] P09LL4_A130BarCodPar ;
   private String[] P09LL4_A602MaqCod ;
   private String[] P09LL4_A867ParCodNom ;
   private boolean[] P09LL4_n867ParCodNom ;
   private short[] P09LL4_A656ParCod ;
   private boolean[] P09LL4_n656ParCod ;
   private java.util.Date[] P09LL4_A4441HisProDTF ;
   private boolean[] P09LL4_n4441HisProDTF ;
   private java.util.Date[] P09LL4_A4440HisProDTI ;
   private boolean[] P09LL4_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LL4_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LL4_A1525HisProKgr ;
   private String[] P09LL4_A606MaqDsc ;
   private boolean[] P09LL4_n606MaqDsc ;
   private short[] P09LL4_A194BarOrdLin ;
   private String[] P09LL4_A461Fase ;
   private int[] P09LL4_A503GruOpeCod ;
   private String[] P09LL4_A396EmprCod ;
   private java.util.Date[] P09LL4_A558HisProFec ;
   private int[] P09LL4_A561HisProLin ;
   private int[] P09LL5_A129BarCod ;
   private byte[] P09LL5_A132BarCodReo ;
   private String[] P09LL5_A130BarCodPar ;
   private String[] P09LL5_A606MaqDsc ;
   private boolean[] P09LL5_n606MaqDsc ;
   private String[] P09LL5_A867ParCodNom ;
   private boolean[] P09LL5_n867ParCodNom ;
   private short[] P09LL5_A656ParCod ;
   private boolean[] P09LL5_n656ParCod ;
   private java.util.Date[] P09LL5_A4441HisProDTF ;
   private boolean[] P09LL5_n4441HisProDTF ;
   private java.util.Date[] P09LL5_A4440HisProDTI ;
   private boolean[] P09LL5_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LL5_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LL5_A1525HisProKgr ;
   private String[] P09LL5_A602MaqCod ;
   private short[] P09LL5_A194BarOrdLin ;
   private String[] P09LL5_A461Fase ;
   private int[] P09LL5_A503GruOpeCod ;
   private String[] P09LL5_A396EmprCod ;
   private java.util.Date[] P09LL5_A558HisProFec ;
   private int[] P09LL5_A561HisProLin ;
   private String[] P09LL6_A867ParCodNom ;
   private boolean[] P09LL6_n867ParCodNom ;
   private short[] P09LL6_A656ParCod ;
   private boolean[] P09LL6_n656ParCod ;
   private java.util.Date[] P09LL6_A4441HisProDTF ;
   private boolean[] P09LL6_n4441HisProDTF ;
   private java.util.Date[] P09LL6_A4440HisProDTI ;
   private boolean[] P09LL6_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LL6_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LL6_A1525HisProKgr ;
   private String[] P09LL6_A606MaqDsc ;
   private boolean[] P09LL6_n606MaqDsc ;
   private String[] P09LL6_A602MaqCod ;
   private short[] P09LL6_A194BarOrdLin ;
   private String[] P09LL6_A130BarCodPar ;
   private byte[] P09LL6_A132BarCodReo ;
   private int[] P09LL6_A129BarCod ;
   private String[] P09LL6_A461Fase ;
   private int[] P09LL6_A503GruOpeCod ;
   private String[] P09LL6_A396EmprCod ;
   private java.util.Date[] P09LL6_A558HisProFec ;
   private int[] P09LL6_A561HisProLin ;
   private int[] P09LL7_A129BarCod ;
   private byte[] P09LL7_A132BarCodReo ;
   private String[] P09LL7_A130BarCodPar ;
   private short[] P09LL7_A656ParCod ;
   private boolean[] P09LL7_n656ParCod ;
   private String[] P09LL7_A867ParCodNom ;
   private boolean[] P09LL7_n867ParCodNom ;
   private java.util.Date[] P09LL7_A4441HisProDTF ;
   private boolean[] P09LL7_n4441HisProDTF ;
   private java.util.Date[] P09LL7_A4440HisProDTI ;
   private boolean[] P09LL7_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LL7_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LL7_A1525HisProKgr ;
   private String[] P09LL7_A606MaqDsc ;
   private boolean[] P09LL7_n606MaqDsc ;
   private String[] P09LL7_A602MaqCod ;
   private short[] P09LL7_A194BarOrdLin ;
   private String[] P09LL7_A461Fase ;
   private int[] P09LL7_A503GruOpeCod ;
   private String[] P09LL7_A396EmprCod ;
   private java.util.Date[] P09LL7_A558HisProFec ;
   private int[] P09LL7_A561HisProLin ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class consultadeproduccion_partesproducciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.MaqCod, T1.BarOrdLin," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09LL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.MaqCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09LL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCod, T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.BarOrdLin," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09LL5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[24];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.MaqDsc, T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T1.MaqCod, T1.BarOrdLin," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.MaqDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09LL6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[24];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.MaqCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09LL7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV78Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV70Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV71Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV72Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV73Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[24];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod, T3.ParCodNom, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.MaqCod, T1.BarOrdLin," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV74Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV76Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P09LL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] );
            case 1 :
                  return conditional_P09LL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] );
            case 2 :
                  return conditional_P09LL4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] );
            case 3 :
                  return conditional_P09LL5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] );
            case 4 :
                  return conditional_P09LL6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] );
            case 5 :
                  return conditional_P09LL7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LL5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LL6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LL7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
      }
   }

}

