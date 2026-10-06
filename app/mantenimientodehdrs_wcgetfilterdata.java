package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientodehdrs_wcgetfilterdata extends GXProcedure
{
   public mantenimientodehdrs_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientodehdrs_wcgetfilterdata.class ), "" );
   }

   public mantenimientodehdrs_wcgetfilterdata( int remoteHandle ,
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
      mantenimientodehdrs_wcgetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientodehdrs_wcgetfilterdata.this.AV39DDOName = aP0;
      mantenimientodehdrs_wcgetfilterdata.this.AV37SearchTxt = aP1;
      mantenimientodehdrs_wcgetfilterdata.this.AV38SearchTxtTo = aP2;
      mantenimientodehdrs_wcgetfilterdata.this.aP3 = aP3;
      mantenimientodehdrs_wcgetfilterdata.this.aP4 = aP4;
      mantenimientodehdrs_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV42Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV45OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV47OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_BARTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPARTDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV39DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV43OptionsJson = AV42Options.toJSonString(false) ;
      AV46OptionsDescJson = AV45OptionsDesc.toJSonString(false) ;
      AV48OptionIndexesJson = AV47OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV50Session.getValue("MantenimientodeHDRs_WCGridState"), "") == 0 )
      {
         AV52GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientodeHDRs_WCGridState"), null, null);
      }
      else
      {
         AV52GridState.fromxml(AV50Session.getValue("MantenimientodeHDRs_WCGridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV52GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV53GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV52GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV65TFPedidoCliente = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV66TFPedidoCliente_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV16TFBarSer = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV17TFBarSer_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV18TFBarSerDsc = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV19TFBarSerDsc_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV20TFBarTipArtDsc = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV21TFBarTipArtDsc_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV24TFBarColNom = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV25TFBarColNom_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV26TFBarColNum = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFBarColNum_To = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV28TFBarFecGen = localUtil.ctod( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV30TFBarFecCli = localUtil.ctod( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV32TFBarFecSal = localUtil.ctod( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV34TFBarSit = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFBarSit_To = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV36TFHayRec_Sel = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV70TFBarPart = (short)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFBarPart_To = (short)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV57Clicod = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV58Barfecgen = localUtil.ctod( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV59BarFecGen_to = localUtil.ctod( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV60Barsit = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV61BarSit_to = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI") == 0 )
         {
            AV62BarEnccli = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUM") == 0 )
         {
            AV63BarDisnum = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV67Barcod = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV68BarCodReo = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV69BarCodPar = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV37SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D2 */
      pr_default.execute(0, new Object[] {AV56Emprcod, Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P097D2_A217BarTipArt[0] ;
         n217BarTipArt = P097D2_n217BarTipArt[0] ;
         A252CliCod = P097D2_A252CliCod[0] ;
         n252CliCod = P097D2_n252CliCod[0] ;
         A1503BarPart = P097D2_A1503BarPart[0] ;
         A213BarSit = P097D2_A213BarSit[0] ;
         A161BarFecSal = P097D2_A161BarFecSal[0] ;
         A155BarFecCli = P097D2_A155BarFecCli[0] ;
         A159BarFecGen = P097D2_A159BarFecGen[0] ;
         A136BarColNum = P097D2_A136BarColNum[0] ;
         A135BarColNom = P097D2_A135BarColNom[0] ;
         A13711BarTipArtD = P097D2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097D2_A1652BarSerDsc[0] ;
         A212BarSer = P097D2_A212BarSer[0] ;
         A279CliNom = P097D2_A279CliNom[0] ;
         A13696BarNHdr = P097D2_A13696BarNHdr[0] ;
         A143BarDisNum = P097D2_A143BarDisNum[0] ;
         A4812BarEncCli = P097D2_A4812BarEncCli[0] ;
         A130BarCodPar = P097D2_A130BarCodPar[0] ;
         A132BarCodReo = P097D2_A132BarCodReo[0] ;
         A129BarCod = P097D2_A129BarCod[0] ;
         A396EmprCod = P097D2_A396EmprCod[0] ;
         A13711BarTipArtD = P097D2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D2_n13711BarTipArtD[0] ;
         A279CliNom = P097D2_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                        {
                           AV41Option = A13696BarNHdr ;
                           AV40InsertIndex = 1 ;
                           while ( ( AV40InsertIndex <= AV42Options.size() ) && ( GXutil.strcmp((String)AV42Options.elementAt(-1+AV40InsertIndex), AV41Option) < 0 ) )
                           {
                              AV40InsertIndex = (int)(AV40InsertIndex+1) ;
                           }
                           if ( ( AV40InsertIndex <= AV42Options.size() ) && ( GXutil.strcmp((String)AV42Options.elementAt(-1+AV40InsertIndex), AV41Option) == 0 ) )
                           {
                              AV49count = GXutil.lval( (String)AV47OptionIndexes.elementAt(-1+AV40InsertIndex)) ;
                              AV49count = (long)(AV49count+1) ;
                              AV47OptionIndexes.removeItem(AV40InsertIndex);
                              AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), AV40InsertIndex);
                           }
                           else
                           {
                              AV42Options.add(AV41Option, AV40InsertIndex);
                              AV47OptionIndexes.add("1", AV40InsertIndex);
                           }
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV37SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, AV56Emprcod, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk97D3 = false ;
         A217BarTipArt = P097D3_A217BarTipArt[0] ;
         n217BarTipArt = P097D3_n217BarTipArt[0] ;
         A279CliNom = P097D3_A279CliNom[0] ;
         A252CliCod = P097D3_A252CliCod[0] ;
         n252CliCod = P097D3_n252CliCod[0] ;
         A1503BarPart = P097D3_A1503BarPart[0] ;
         A213BarSit = P097D3_A213BarSit[0] ;
         A161BarFecSal = P097D3_A161BarFecSal[0] ;
         A155BarFecCli = P097D3_A155BarFecCli[0] ;
         A159BarFecGen = P097D3_A159BarFecGen[0] ;
         A136BarColNum = P097D3_A136BarColNum[0] ;
         A135BarColNom = P097D3_A135BarColNom[0] ;
         A13711BarTipArtD = P097D3_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D3_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097D3_A1652BarSerDsc[0] ;
         A212BarSer = P097D3_A212BarSer[0] ;
         A13696BarNHdr = P097D3_A13696BarNHdr[0] ;
         A143BarDisNum = P097D3_A143BarDisNum[0] ;
         A4812BarEncCli = P097D3_A4812BarEncCli[0] ;
         A130BarCodPar = P097D3_A130BarCodPar[0] ;
         A132BarCodReo = P097D3_A132BarCodReo[0] ;
         A129BarCod = P097D3_A129BarCod[0] ;
         A396EmprCod = P097D3_A396EmprCod[0] ;
         A13711BarTipArtD = P097D3_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D3_n13711BarTipArtD[0] ;
         A279CliNom = P097D3_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV49count = 0 ;
                        while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P097D3_A279CliNom[0], A279CliNom) == 0 ) )
                        {
                           brk97D3 = false ;
                           A252CliCod = P097D3_A252CliCod[0] ;
                           n252CliCod = P097D3_n252CliCod[0] ;
                           A130BarCodPar = P097D3_A130BarCodPar[0] ;
                           A132BarCodReo = P097D3_A132BarCodReo[0] ;
                           A129BarCod = P097D3_A129BarCod[0] ;
                           A396EmprCod = P097D3_A396EmprCod[0] ;
                           AV49count = (long)(AV49count+1) ;
                           brk97D3 = true ;
                           pr_default.readNext(1);
                        }
                        if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                        {
                           AV41Option = A279CliNom ;
                           AV42Options.add(AV41Option, 0);
                           AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk97D3 )
         {
            brk97D3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV65TFPedidoCliente = AV37SearchTxt ;
      AV66TFPedidoCliente_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D4 */
      pr_default.execute(2, new Object[] {AV56Emprcod, Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A217BarTipArt = P097D4_A217BarTipArt[0] ;
         n217BarTipArt = P097D4_n217BarTipArt[0] ;
         A252CliCod = P097D4_A252CliCod[0] ;
         n252CliCod = P097D4_n252CliCod[0] ;
         A1503BarPart = P097D4_A1503BarPart[0] ;
         A213BarSit = P097D4_A213BarSit[0] ;
         A161BarFecSal = P097D4_A161BarFecSal[0] ;
         A155BarFecCli = P097D4_A155BarFecCli[0] ;
         A159BarFecGen = P097D4_A159BarFecGen[0] ;
         A136BarColNum = P097D4_A136BarColNum[0] ;
         A135BarColNom = P097D4_A135BarColNom[0] ;
         A13711BarTipArtD = P097D4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D4_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097D4_A1652BarSerDsc[0] ;
         A212BarSer = P097D4_A212BarSer[0] ;
         A279CliNom = P097D4_A279CliNom[0] ;
         A13696BarNHdr = P097D4_A13696BarNHdr[0] ;
         A143BarDisNum = P097D4_A143BarDisNum[0] ;
         A4812BarEncCli = P097D4_A4812BarEncCli[0] ;
         A130BarCodPar = P097D4_A130BarCodPar[0] ;
         A132BarCodReo = P097D4_A132BarCodReo[0] ;
         A129BarCod = P097D4_A129BarCod[0] ;
         A396EmprCod = P097D4_A396EmprCod[0] ;
         A13711BarTipArtD = P097D4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D4_n13711BarTipArtD[0] ;
         A279CliNom = P097D4_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                        {
                           AV41Option = A13878PedidoClie ;
                           AV40InsertIndex = 1 ;
                           while ( ( AV40InsertIndex <= AV42Options.size() ) && ( GXutil.strcmp((String)AV42Options.elementAt(-1+AV40InsertIndex), AV41Option) < 0 ) )
                           {
                              AV40InsertIndex = (int)(AV40InsertIndex+1) ;
                           }
                           if ( ( AV40InsertIndex <= AV42Options.size() ) && ( GXutil.strcmp((String)AV42Options.elementAt(-1+AV40InsertIndex), AV41Option) == 0 ) )
                           {
                              AV49count = GXutil.lval( (String)AV47OptionIndexes.elementAt(-1+AV40InsertIndex)) ;
                              AV49count = (long)(AV49count+1) ;
                              AV47OptionIndexes.removeItem(AV40InsertIndex);
                              AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), AV40InsertIndex);
                           }
                           else
                           {
                              AV42Options.add(AV41Option, AV40InsertIndex);
                              AV47OptionIndexes.add("1", AV40InsertIndex);
                           }
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarSer = AV37SearchTxt ;
      AV17TFBarSer_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D5 */
      pr_default.execute(3, new Object[] {AV56Emprcod, Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk97D6 = false ;
         A217BarTipArt = P097D5_A217BarTipArt[0] ;
         n217BarTipArt = P097D5_n217BarTipArt[0] ;
         A212BarSer = P097D5_A212BarSer[0] ;
         A252CliCod = P097D5_A252CliCod[0] ;
         n252CliCod = P097D5_n252CliCod[0] ;
         A1503BarPart = P097D5_A1503BarPart[0] ;
         A213BarSit = P097D5_A213BarSit[0] ;
         A161BarFecSal = P097D5_A161BarFecSal[0] ;
         A155BarFecCli = P097D5_A155BarFecCli[0] ;
         A159BarFecGen = P097D5_A159BarFecGen[0] ;
         A136BarColNum = P097D5_A136BarColNum[0] ;
         A135BarColNom = P097D5_A135BarColNom[0] ;
         A13711BarTipArtD = P097D5_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D5_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097D5_A1652BarSerDsc[0] ;
         A279CliNom = P097D5_A279CliNom[0] ;
         A13696BarNHdr = P097D5_A13696BarNHdr[0] ;
         A143BarDisNum = P097D5_A143BarDisNum[0] ;
         A4812BarEncCli = P097D5_A4812BarEncCli[0] ;
         A130BarCodPar = P097D5_A130BarCodPar[0] ;
         A132BarCodReo = P097D5_A132BarCodReo[0] ;
         A129BarCod = P097D5_A129BarCod[0] ;
         A396EmprCod = P097D5_A396EmprCod[0] ;
         A13711BarTipArtD = P097D5_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D5_n13711BarTipArtD[0] ;
         A279CliNom = P097D5_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV49count = 0 ;
                        while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P097D5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P097D5_A212BarSer[0], A212BarSer) == 0 ) )
                        {
                           brk97D6 = false ;
                           A130BarCodPar = P097D5_A130BarCodPar[0] ;
                           A132BarCodReo = P097D5_A132BarCodReo[0] ;
                           A129BarCod = P097D5_A129BarCod[0] ;
                           AV49count = (long)(AV49count+1) ;
                           brk97D6 = true ;
                           pr_default.readNext(3);
                        }
                        if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                        {
                           AV41Option = A212BarSer ;
                           AV42Options.add(AV41Option, 0);
                           AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk97D6 )
         {
            brk97D6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarSerDsc = AV37SearchTxt ;
      AV19TFBarSerDsc_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, AV56Emprcod, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk97D8 = false ;
         A217BarTipArt = P097D6_A217BarTipArt[0] ;
         n217BarTipArt = P097D6_n217BarTipArt[0] ;
         A1652BarSerDsc = P097D6_A1652BarSerDsc[0] ;
         A252CliCod = P097D6_A252CliCod[0] ;
         n252CliCod = P097D6_n252CliCod[0] ;
         A1503BarPart = P097D6_A1503BarPart[0] ;
         A213BarSit = P097D6_A213BarSit[0] ;
         A161BarFecSal = P097D6_A161BarFecSal[0] ;
         A155BarFecCli = P097D6_A155BarFecCli[0] ;
         A159BarFecGen = P097D6_A159BarFecGen[0] ;
         A136BarColNum = P097D6_A136BarColNum[0] ;
         A135BarColNom = P097D6_A135BarColNom[0] ;
         A13711BarTipArtD = P097D6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D6_n13711BarTipArtD[0] ;
         A212BarSer = P097D6_A212BarSer[0] ;
         A279CliNom = P097D6_A279CliNom[0] ;
         A13696BarNHdr = P097D6_A13696BarNHdr[0] ;
         A143BarDisNum = P097D6_A143BarDisNum[0] ;
         A4812BarEncCli = P097D6_A4812BarEncCli[0] ;
         A130BarCodPar = P097D6_A130BarCodPar[0] ;
         A132BarCodReo = P097D6_A132BarCodReo[0] ;
         A129BarCod = P097D6_A129BarCod[0] ;
         A396EmprCod = P097D6_A396EmprCod[0] ;
         A13711BarTipArtD = P097D6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D6_n13711BarTipArtD[0] ;
         A279CliNom = P097D6_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV49count = 0 ;
                        while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P097D6_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                        {
                           brk97D8 = false ;
                           A130BarCodPar = P097D6_A130BarCodPar[0] ;
                           A132BarCodReo = P097D6_A132BarCodReo[0] ;
                           A129BarCod = P097D6_A129BarCod[0] ;
                           A396EmprCod = P097D6_A396EmprCod[0] ;
                           AV49count = (long)(AV49count+1) ;
                           brk97D8 = true ;
                           pr_default.readNext(4);
                        }
                        if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                        {
                           AV41Option = A1652BarSerDsc ;
                           AV42Options.add(AV41Option, 0);
                           AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk97D8 )
         {
            brk97D8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarTipArtDsc = AV37SearchTxt ;
      AV21TFBarTipArtDsc_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           AV56Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D7 */
      pr_default.execute(5, new Object[] {AV56Emprcod, Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk97D10 = false ;
         A217BarTipArt = P097D7_A217BarTipArt[0] ;
         n217BarTipArt = P097D7_n217BarTipArt[0] ;
         A252CliCod = P097D7_A252CliCod[0] ;
         n252CliCod = P097D7_n252CliCod[0] ;
         A1503BarPart = P097D7_A1503BarPart[0] ;
         A213BarSit = P097D7_A213BarSit[0] ;
         A161BarFecSal = P097D7_A161BarFecSal[0] ;
         A155BarFecCli = P097D7_A155BarFecCli[0] ;
         A159BarFecGen = P097D7_A159BarFecGen[0] ;
         A136BarColNum = P097D7_A136BarColNum[0] ;
         A135BarColNom = P097D7_A135BarColNom[0] ;
         A13711BarTipArtD = P097D7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D7_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097D7_A1652BarSerDsc[0] ;
         A212BarSer = P097D7_A212BarSer[0] ;
         A279CliNom = P097D7_A279CliNom[0] ;
         A13696BarNHdr = P097D7_A13696BarNHdr[0] ;
         A143BarDisNum = P097D7_A143BarDisNum[0] ;
         A4812BarEncCli = P097D7_A4812BarEncCli[0] ;
         A130BarCodPar = P097D7_A130BarCodPar[0] ;
         A132BarCodReo = P097D7_A132BarCodReo[0] ;
         A129BarCod = P097D7_A129BarCod[0] ;
         A396EmprCod = P097D7_A396EmprCod[0] ;
         A13711BarTipArtD = P097D7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D7_n13711BarTipArtD[0] ;
         A279CliNom = P097D7_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV49count = 0 ;
                        while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P097D7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P097D7_A217BarTipArt[0] == A217BarTipArt ) )
                        {
                           brk97D10 = false ;
                           A130BarCodPar = P097D7_A130BarCodPar[0] ;
                           A132BarCodReo = P097D7_A132BarCodReo[0] ;
                           A129BarCod = P097D7_A129BarCod[0] ;
                           AV49count = (long)(AV49count+1) ;
                           brk97D10 = true ;
                           pr_default.readNext(5);
                        }
                        if ( ! (GXutil.strcmp("", A13711BarTipArtD)==0) )
                        {
                           AV41Option = A13711BarTipArtD ;
                           AV40InsertIndex = 1 ;
                           while ( ( AV40InsertIndex <= AV42Options.size() ) && ( GXutil.strcmp((String)AV42Options.elementAt(-1+AV40InsertIndex), AV41Option) < 0 ) )
                           {
                              AV40InsertIndex = (int)(AV40InsertIndex+1) ;
                           }
                           AV42Options.add(AV41Option, AV40InsertIndex);
                           AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), AV40InsertIndex);
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk97D10 )
         {
            brk97D10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarColNom = AV37SearchTxt ;
      AV25TFBarColNom_Sel = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = AV55FilterFullText ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = AV65TFPedidoCliente ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV66TFPedidoCliente_Sel ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = AV16TFBarSer ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = AV24TFBarColNom ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV91Mantenimientodehdrs_wcds_16_tfbarcolnum = AV26TFBarColNum ;
      AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = AV28TFBarFecGen ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = AV30TFBarFecCli ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = AV32TFBarFecSal ;
      AV96Mantenimientodehdrs_wcds_21_tfbarsit = AV34TFBarSit ;
      AV97Mantenimientodehdrs_wcds_22_tfbarsit_to = AV35TFBarSit_To ;
      AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV36TFHayRec_Sel ;
      AV99Mantenimientodehdrs_wcds_24_tfbarpart = AV70TFBarPart ;
      AV100Mantenimientodehdrs_wcds_25_tfbarpart_to = AV71TFBarPart_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58Barfecgen ,
                                           AV59BarFecGen_to ,
                                           Byte.valueOf(AV60Barsit) ,
                                           Byte.valueOf(AV61BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV62BarEnccli ,
                                           Short.valueOf(AV64Enc20c) ,
                                           A143BarDisNum ,
                                           AV63BarDisnum ,
                                           Integer.valueOf(AV67Barcod) ,
                                           Byte.valueOf(AV68BarCodReo) ,
                                           AV69BarCodPar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV77Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV79Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV85Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097D8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV57Clicod), Integer.valueOf(AV57Clicod), AV58Barfecgen, AV59BarFecGen_to, Byte.valueOf(AV60Barsit), Byte.valueOf(AV61BarSit_to), AV62BarEnccli, Short.valueOf(AV64Enc20c), AV62BarEnccli, AV63BarDisnum, Short.valueOf(AV64Enc20c), AV63BarDisnum, Integer.valueOf(AV67Barcod), Integer.valueOf(AV67Barcod), Byte.valueOf(AV68BarCodReo), Byte.valueOf(AV68BarCodReo), AV69BarCodPar, AV69BarCodPar, AV56Emprcod, lV77Mantenimientodehdrs_wcds_2_tfbarnhdr, AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV79Mantenimientodehdrs_wcds_4_tfclinom, AV80Mantenimientodehdrs_wcds_5_tfclinom_sel, lV83Mantenimientodehdrs_wcds_8_tfbarser, AV84Mantenimientodehdrs_wcds_9_tfbarser_sel, lV85Mantenimientodehdrs_wcds_10_tfbarserdsc, AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV89Mantenimientodehdrs_wcds_14_tfbarcolnom, AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV91Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV93Mantenimientodehdrs_wcds_18_tfbarfecgen, AV94Mantenimientodehdrs_wcds_19_tfbarfeccli, AV95Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV96Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV97Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV99Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV100Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk97D12 = false ;
         A217BarTipArt = P097D8_A217BarTipArt[0] ;
         n217BarTipArt = P097D8_n217BarTipArt[0] ;
         A135BarColNom = P097D8_A135BarColNom[0] ;
         A252CliCod = P097D8_A252CliCod[0] ;
         n252CliCod = P097D8_n252CliCod[0] ;
         A1503BarPart = P097D8_A1503BarPart[0] ;
         A213BarSit = P097D8_A213BarSit[0] ;
         A161BarFecSal = P097D8_A161BarFecSal[0] ;
         A155BarFecCli = P097D8_A155BarFecCli[0] ;
         A159BarFecGen = P097D8_A159BarFecGen[0] ;
         A136BarColNum = P097D8_A136BarColNum[0] ;
         A13711BarTipArtD = P097D8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D8_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097D8_A1652BarSerDsc[0] ;
         A212BarSer = P097D8_A212BarSer[0] ;
         A279CliNom = P097D8_A279CliNom[0] ;
         A13696BarNHdr = P097D8_A13696BarNHdr[0] ;
         A143BarDisNum = P097D8_A143BarDisNum[0] ;
         A4812BarEncCli = P097D8_A4812BarEncCli[0] ;
         A130BarCodPar = P097D8_A130BarCodPar[0] ;
         A132BarCodReo = P097D8_A132BarCodReo[0] ;
         A129BarCod = P097D8_A129BarCod[0] ;
         A396EmprCod = P097D8_A396EmprCod[0] ;
         A13711BarTipArtD = P097D8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097D8_n13711BarTipArtD[0] ;
         A279CliNom = P097D8_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         mantenimientodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         mantenimientodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV76Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV76Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV76Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV49count = 0 ;
                        while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P097D8_A135BarColNom[0], A135BarColNom) == 0 ) )
                        {
                           brk97D12 = false ;
                           A130BarCodPar = P097D8_A130BarCodPar[0] ;
                           A132BarCodReo = P097D8_A132BarCodReo[0] ;
                           A129BarCod = P097D8_A129BarCod[0] ;
                           A396EmprCod = P097D8_A396EmprCod[0] ;
                           AV49count = (long)(AV49count+1) ;
                           brk97D12 = true ;
                           pr_default.readNext(6);
                        }
                        if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                        {
                           AV41Option = A135BarColNom ;
                           AV42Options.add(AV41Option, 0);
                           AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV49count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV42Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk97D12 )
         {
            brk97D12 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientodehdrs_wcgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = mantenimientodehdrs_wcgetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = mantenimientodehdrs_wcgetfilterdata.this.AV48OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV46OptionsDescJson = "" ;
      AV48OptionIndexesJson = "" ;
      AV42Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV50Session = httpContext.getWebSession();
      AV52GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV53GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV65TFPedidoCliente = "" ;
      AV66TFPedidoCliente_Sel = "" ;
      AV16TFBarSer = "" ;
      AV17TFBarSer_Sel = "" ;
      AV18TFBarSerDsc = "" ;
      AV19TFBarSerDsc_Sel = "" ;
      AV20TFBarTipArtDsc = "" ;
      AV21TFBarTipArtDsc_Sel = "" ;
      AV24TFBarColNom = "" ;
      AV25TFBarColNom_Sel = "" ;
      AV28TFBarFecGen = GXutil.nullDate() ;
      AV30TFBarFecCli = GXutil.nullDate() ;
      AV32TFBarFecSal = GXutil.nullDate() ;
      AV56Emprcod = "" ;
      AV58Barfecgen = GXutil.nullDate() ;
      AV59BarFecGen_to = GXutil.nullDate() ;
      AV62BarEnccli = "" ;
      AV63BarDisnum = "" ;
      AV69BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV76Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      AV77Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = "" ;
      AV79Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      AV80Mantenimientodehdrs_wcds_5_tfclinom_sel = "" ;
      AV81Mantenimientodehdrs_wcds_6_tfpedidocliente = "" ;
      AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV83Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      AV84Mantenimientodehdrs_wcds_9_tfbarser_sel = "" ;
      AV85Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = "" ;
      AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = "" ;
      AV89Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = "" ;
      AV93Mantenimientodehdrs_wcds_18_tfbarfecgen = GXutil.nullDate() ;
      AV94Mantenimientodehdrs_wcds_19_tfbarfeccli = GXutil.nullDate() ;
      AV95Mantenimientodehdrs_wcds_20_tfbarfecsal = GXutil.nullDate() ;
      lV76Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV77Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      lV79Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      lV83Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      lV85Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      lV89Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A13878PedidoClie = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A396EmprCod = "" ;
      P097D2_A217BarTipArt = new short[1] ;
      P097D2_n217BarTipArt = new boolean[] {false} ;
      P097D2_A252CliCod = new int[1] ;
      P097D2_n252CliCod = new boolean[] {false} ;
      P097D2_A1503BarPart = new short[1] ;
      P097D2_A213BarSit = new byte[1] ;
      P097D2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D2_A136BarColNum = new int[1] ;
      P097D2_A135BarColNom = new String[] {""} ;
      P097D2_A13711BarTipArtD = new String[] {""} ;
      P097D2_n13711BarTipArtD = new boolean[] {false} ;
      P097D2_A1652BarSerDsc = new String[] {""} ;
      P097D2_A212BarSer = new String[] {""} ;
      P097D2_A279CliNom = new String[] {""} ;
      P097D2_A13696BarNHdr = new String[] {""} ;
      P097D2_A143BarDisNum = new String[] {""} ;
      P097D2_A4812BarEncCli = new String[] {""} ;
      P097D2_A130BarCodPar = new String[] {""} ;
      P097D2_A132BarCodReo = new byte[1] ;
      P097D2_A129BarCod = new int[1] ;
      P097D2_A396EmprCod = new String[] {""} ;
      AV41Option = "" ;
      P097D3_A217BarTipArt = new short[1] ;
      P097D3_n217BarTipArt = new boolean[] {false} ;
      P097D3_A279CliNom = new String[] {""} ;
      P097D3_A252CliCod = new int[1] ;
      P097D3_n252CliCod = new boolean[] {false} ;
      P097D3_A1503BarPart = new short[1] ;
      P097D3_A213BarSit = new byte[1] ;
      P097D3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D3_A136BarColNum = new int[1] ;
      P097D3_A135BarColNom = new String[] {""} ;
      P097D3_A13711BarTipArtD = new String[] {""} ;
      P097D3_n13711BarTipArtD = new boolean[] {false} ;
      P097D3_A1652BarSerDsc = new String[] {""} ;
      P097D3_A212BarSer = new String[] {""} ;
      P097D3_A13696BarNHdr = new String[] {""} ;
      P097D3_A143BarDisNum = new String[] {""} ;
      P097D3_A4812BarEncCli = new String[] {""} ;
      P097D3_A130BarCodPar = new String[] {""} ;
      P097D3_A132BarCodReo = new byte[1] ;
      P097D3_A129BarCod = new int[1] ;
      P097D3_A396EmprCod = new String[] {""} ;
      P097D4_A217BarTipArt = new short[1] ;
      P097D4_n217BarTipArt = new boolean[] {false} ;
      P097D4_A252CliCod = new int[1] ;
      P097D4_n252CliCod = new boolean[] {false} ;
      P097D4_A1503BarPart = new short[1] ;
      P097D4_A213BarSit = new byte[1] ;
      P097D4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D4_A136BarColNum = new int[1] ;
      P097D4_A135BarColNom = new String[] {""} ;
      P097D4_A13711BarTipArtD = new String[] {""} ;
      P097D4_n13711BarTipArtD = new boolean[] {false} ;
      P097D4_A1652BarSerDsc = new String[] {""} ;
      P097D4_A212BarSer = new String[] {""} ;
      P097D4_A279CliNom = new String[] {""} ;
      P097D4_A13696BarNHdr = new String[] {""} ;
      P097D4_A143BarDisNum = new String[] {""} ;
      P097D4_A4812BarEncCli = new String[] {""} ;
      P097D4_A130BarCodPar = new String[] {""} ;
      P097D4_A132BarCodReo = new byte[1] ;
      P097D4_A129BarCod = new int[1] ;
      P097D4_A396EmprCod = new String[] {""} ;
      P097D5_A217BarTipArt = new short[1] ;
      P097D5_n217BarTipArt = new boolean[] {false} ;
      P097D5_A212BarSer = new String[] {""} ;
      P097D5_A252CliCod = new int[1] ;
      P097D5_n252CliCod = new boolean[] {false} ;
      P097D5_A1503BarPart = new short[1] ;
      P097D5_A213BarSit = new byte[1] ;
      P097D5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D5_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D5_A136BarColNum = new int[1] ;
      P097D5_A135BarColNom = new String[] {""} ;
      P097D5_A13711BarTipArtD = new String[] {""} ;
      P097D5_n13711BarTipArtD = new boolean[] {false} ;
      P097D5_A1652BarSerDsc = new String[] {""} ;
      P097D5_A279CliNom = new String[] {""} ;
      P097D5_A13696BarNHdr = new String[] {""} ;
      P097D5_A143BarDisNum = new String[] {""} ;
      P097D5_A4812BarEncCli = new String[] {""} ;
      P097D5_A130BarCodPar = new String[] {""} ;
      P097D5_A132BarCodReo = new byte[1] ;
      P097D5_A129BarCod = new int[1] ;
      P097D5_A396EmprCod = new String[] {""} ;
      P097D6_A217BarTipArt = new short[1] ;
      P097D6_n217BarTipArt = new boolean[] {false} ;
      P097D6_A1652BarSerDsc = new String[] {""} ;
      P097D6_A252CliCod = new int[1] ;
      P097D6_n252CliCod = new boolean[] {false} ;
      P097D6_A1503BarPart = new short[1] ;
      P097D6_A213BarSit = new byte[1] ;
      P097D6_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D6_A136BarColNum = new int[1] ;
      P097D6_A135BarColNom = new String[] {""} ;
      P097D6_A13711BarTipArtD = new String[] {""} ;
      P097D6_n13711BarTipArtD = new boolean[] {false} ;
      P097D6_A212BarSer = new String[] {""} ;
      P097D6_A279CliNom = new String[] {""} ;
      P097D6_A13696BarNHdr = new String[] {""} ;
      P097D6_A143BarDisNum = new String[] {""} ;
      P097D6_A4812BarEncCli = new String[] {""} ;
      P097D6_A130BarCodPar = new String[] {""} ;
      P097D6_A132BarCodReo = new byte[1] ;
      P097D6_A129BarCod = new int[1] ;
      P097D6_A396EmprCod = new String[] {""} ;
      P097D7_A217BarTipArt = new short[1] ;
      P097D7_n217BarTipArt = new boolean[] {false} ;
      P097D7_A252CliCod = new int[1] ;
      P097D7_n252CliCod = new boolean[] {false} ;
      P097D7_A1503BarPart = new short[1] ;
      P097D7_A213BarSit = new byte[1] ;
      P097D7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D7_A136BarColNum = new int[1] ;
      P097D7_A135BarColNom = new String[] {""} ;
      P097D7_A13711BarTipArtD = new String[] {""} ;
      P097D7_n13711BarTipArtD = new boolean[] {false} ;
      P097D7_A1652BarSerDsc = new String[] {""} ;
      P097D7_A212BarSer = new String[] {""} ;
      P097D7_A279CliNom = new String[] {""} ;
      P097D7_A13696BarNHdr = new String[] {""} ;
      P097D7_A143BarDisNum = new String[] {""} ;
      P097D7_A4812BarEncCli = new String[] {""} ;
      P097D7_A130BarCodPar = new String[] {""} ;
      P097D7_A132BarCodReo = new byte[1] ;
      P097D7_A129BarCod = new int[1] ;
      P097D7_A396EmprCod = new String[] {""} ;
      P097D8_A217BarTipArt = new short[1] ;
      P097D8_n217BarTipArt = new boolean[] {false} ;
      P097D8_A135BarColNom = new String[] {""} ;
      P097D8_A252CliCod = new int[1] ;
      P097D8_n252CliCod = new boolean[] {false} ;
      P097D8_A1503BarPart = new short[1] ;
      P097D8_A213BarSit = new byte[1] ;
      P097D8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097D8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097D8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097D8_A136BarColNum = new int[1] ;
      P097D8_A13711BarTipArtD = new String[] {""} ;
      P097D8_n13711BarTipArtD = new boolean[] {false} ;
      P097D8_A1652BarSerDsc = new String[] {""} ;
      P097D8_A212BarSer = new String[] {""} ;
      P097D8_A279CliNom = new String[] {""} ;
      P097D8_A13696BarNHdr = new String[] {""} ;
      P097D8_A143BarDisNum = new String[] {""} ;
      P097D8_A4812BarEncCli = new String[] {""} ;
      P097D8_A130BarCodPar = new String[] {""} ;
      P097D8_A132BarCodReo = new byte[1] ;
      P097D8_A129BarCod = new int[1] ;
      P097D8_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientodehdrs_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P097D2_A217BarTipArt, P097D2_n217BarTipArt, P097D2_A252CliCod, P097D2_n252CliCod, P097D2_A1503BarPart, P097D2_A213BarSit, P097D2_A161BarFecSal, P097D2_A155BarFecCli, P097D2_A159BarFecGen, P097D2_A136BarColNum,
            P097D2_A135BarColNom, P097D2_A13711BarTipArtD, P097D2_n13711BarTipArtD, P097D2_A1652BarSerDsc, P097D2_A212BarSer, P097D2_A279CliNom, P097D2_A13696BarNHdr, P097D2_A143BarDisNum, P097D2_A4812BarEncCli, P097D2_A130BarCodPar,
            P097D2_A132BarCodReo, P097D2_A129BarCod, P097D2_A396EmprCod
            }
            , new Object[] {
            P097D3_A217BarTipArt, P097D3_n217BarTipArt, P097D3_A279CliNom, P097D3_A252CliCod, P097D3_n252CliCod, P097D3_A1503BarPart, P097D3_A213BarSit, P097D3_A161BarFecSal, P097D3_A155BarFecCli, P097D3_A159BarFecGen,
            P097D3_A136BarColNum, P097D3_A135BarColNom, P097D3_A13711BarTipArtD, P097D3_n13711BarTipArtD, P097D3_A1652BarSerDsc, P097D3_A212BarSer, P097D3_A13696BarNHdr, P097D3_A143BarDisNum, P097D3_A4812BarEncCli, P097D3_A130BarCodPar,
            P097D3_A132BarCodReo, P097D3_A129BarCod, P097D3_A396EmprCod
            }
            , new Object[] {
            P097D4_A217BarTipArt, P097D4_n217BarTipArt, P097D4_A252CliCod, P097D4_n252CliCod, P097D4_A1503BarPart, P097D4_A213BarSit, P097D4_A161BarFecSal, P097D4_A155BarFecCli, P097D4_A159BarFecGen, P097D4_A136BarColNum,
            P097D4_A135BarColNom, P097D4_A13711BarTipArtD, P097D4_n13711BarTipArtD, P097D4_A1652BarSerDsc, P097D4_A212BarSer, P097D4_A279CliNom, P097D4_A13696BarNHdr, P097D4_A143BarDisNum, P097D4_A4812BarEncCli, P097D4_A130BarCodPar,
            P097D4_A132BarCodReo, P097D4_A129BarCod, P097D4_A396EmprCod
            }
            , new Object[] {
            P097D5_A217BarTipArt, P097D5_n217BarTipArt, P097D5_A212BarSer, P097D5_A252CliCod, P097D5_n252CliCod, P097D5_A1503BarPart, P097D5_A213BarSit, P097D5_A161BarFecSal, P097D5_A155BarFecCli, P097D5_A159BarFecGen,
            P097D5_A136BarColNum, P097D5_A135BarColNom, P097D5_A13711BarTipArtD, P097D5_n13711BarTipArtD, P097D5_A1652BarSerDsc, P097D5_A279CliNom, P097D5_A13696BarNHdr, P097D5_A143BarDisNum, P097D5_A4812BarEncCli, P097D5_A130BarCodPar,
            P097D5_A132BarCodReo, P097D5_A129BarCod, P097D5_A396EmprCod
            }
            , new Object[] {
            P097D6_A217BarTipArt, P097D6_n217BarTipArt, P097D6_A1652BarSerDsc, P097D6_A252CliCod, P097D6_n252CliCod, P097D6_A1503BarPart, P097D6_A213BarSit, P097D6_A161BarFecSal, P097D6_A155BarFecCli, P097D6_A159BarFecGen,
            P097D6_A136BarColNum, P097D6_A135BarColNom, P097D6_A13711BarTipArtD, P097D6_n13711BarTipArtD, P097D6_A212BarSer, P097D6_A279CliNom, P097D6_A13696BarNHdr, P097D6_A143BarDisNum, P097D6_A4812BarEncCli, P097D6_A130BarCodPar,
            P097D6_A132BarCodReo, P097D6_A129BarCod, P097D6_A396EmprCod
            }
            , new Object[] {
            P097D7_A217BarTipArt, P097D7_n217BarTipArt, P097D7_A252CliCod, P097D7_n252CliCod, P097D7_A1503BarPart, P097D7_A213BarSit, P097D7_A161BarFecSal, P097D7_A155BarFecCli, P097D7_A159BarFecGen, P097D7_A136BarColNum,
            P097D7_A135BarColNom, P097D7_A13711BarTipArtD, P097D7_n13711BarTipArtD, P097D7_A1652BarSerDsc, P097D7_A212BarSer, P097D7_A279CliNom, P097D7_A13696BarNHdr, P097D7_A143BarDisNum, P097D7_A4812BarEncCli, P097D7_A130BarCodPar,
            P097D7_A132BarCodReo, P097D7_A129BarCod, P097D7_A396EmprCod
            }
            , new Object[] {
            P097D8_A217BarTipArt, P097D8_n217BarTipArt, P097D8_A135BarColNom, P097D8_A252CliCod, P097D8_n252CliCod, P097D8_A1503BarPart, P097D8_A213BarSit, P097D8_A161BarFecSal, P097D8_A155BarFecCli, P097D8_A159BarFecGen,
            P097D8_A136BarColNum, P097D8_A13711BarTipArtD, P097D8_n13711BarTipArtD, P097D8_A1652BarSerDsc, P097D8_A212BarSer, P097D8_A279CliNom, P097D8_A13696BarNHdr, P097D8_A143BarDisNum, P097D8_A4812BarEncCli, P097D8_A130BarCodPar,
            P097D8_A132BarCodReo, P097D8_A129BarCod, P097D8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34TFBarSit ;
   private byte AV35TFBarSit_To ;
   private byte AV36TFHayRec_Sel ;
   private byte AV60Barsit ;
   private byte AV61BarSit_to ;
   private byte AV68BarCodReo ;
   private byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ;
   private byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ;
   private byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short AV70TFBarPart ;
   private short AV71TFBarPart_To ;
   private short AV99Mantenimientodehdrs_wcds_24_tfbarpart ;
   private short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ;
   private short A1503BarPart ;
   private short AV64Enc20c ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private int AV26TFBarColNum ;
   private int AV27TFBarColNum_To ;
   private int AV57Clicod ;
   private int AV67Barcod ;
   private int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ;
   private int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV40InsertIndex ;
   private long AV49count ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV65TFPedidoCliente ;
   private String AV66TFPedidoCliente_Sel ;
   private String AV16TFBarSer ;
   private String AV17TFBarSer_Sel ;
   private String AV18TFBarSerDsc ;
   private String AV19TFBarSerDsc_Sel ;
   private String AV20TFBarTipArtDsc ;
   private String AV21TFBarTipArtDsc_Sel ;
   private String AV24TFBarColNom ;
   private String AV25TFBarColNom_Sel ;
   private String AV56Emprcod ;
   private String AV62BarEnccli ;
   private String AV63BarDisnum ;
   private String AV69BarCodPar ;
   private String A13696BarNHdr ;
   private String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ;
   private String AV79Mantenimientodehdrs_wcds_4_tfclinom ;
   private String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ;
   private String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ;
   private String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV83Mantenimientodehdrs_wcds_8_tfbarser ;
   private String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ;
   private String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ;
   private String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ;
   private String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV77Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String lV79Mantenimientodehdrs_wcds_4_tfclinom ;
   private String lV83Mantenimientodehdrs_wcds_8_tfbarser ;
   private String lV85Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String lV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String lV89Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A13878PedidoClie ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV28TFBarFecGen ;
   private java.util.Date AV30TFBarFecCli ;
   private java.util.Date AV32TFBarFecSal ;
   private java.util.Date AV58Barfecgen ;
   private java.util.Date AV59BarFecGen_to ;
   private java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ;
   private java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ;
   private java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private boolean brk97D3 ;
   private boolean brk97D6 ;
   private boolean brk97D8 ;
   private boolean brk97D10 ;
   private boolean brk97D12 ;
   private String AV43OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV48OptionIndexesJson ;
   private String AV39DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV55FilterFullText ;
   private String AV76Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String lV76Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String AV41Option ;
   private com.genexus.webpanels.WebSession AV50Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P097D2_A217BarTipArt ;
   private boolean[] P097D2_n217BarTipArt ;
   private int[] P097D2_A252CliCod ;
   private boolean[] P097D2_n252CliCod ;
   private short[] P097D2_A1503BarPart ;
   private byte[] P097D2_A213BarSit ;
   private java.util.Date[] P097D2_A161BarFecSal ;
   private java.util.Date[] P097D2_A155BarFecCli ;
   private java.util.Date[] P097D2_A159BarFecGen ;
   private int[] P097D2_A136BarColNum ;
   private String[] P097D2_A135BarColNom ;
   private String[] P097D2_A13711BarTipArtD ;
   private boolean[] P097D2_n13711BarTipArtD ;
   private String[] P097D2_A1652BarSerDsc ;
   private String[] P097D2_A212BarSer ;
   private String[] P097D2_A279CliNom ;
   private String[] P097D2_A13696BarNHdr ;
   private String[] P097D2_A143BarDisNum ;
   private String[] P097D2_A4812BarEncCli ;
   private String[] P097D2_A130BarCodPar ;
   private byte[] P097D2_A132BarCodReo ;
   private int[] P097D2_A129BarCod ;
   private String[] P097D2_A396EmprCod ;
   private short[] P097D3_A217BarTipArt ;
   private boolean[] P097D3_n217BarTipArt ;
   private String[] P097D3_A279CliNom ;
   private int[] P097D3_A252CliCod ;
   private boolean[] P097D3_n252CliCod ;
   private short[] P097D3_A1503BarPart ;
   private byte[] P097D3_A213BarSit ;
   private java.util.Date[] P097D3_A161BarFecSal ;
   private java.util.Date[] P097D3_A155BarFecCli ;
   private java.util.Date[] P097D3_A159BarFecGen ;
   private int[] P097D3_A136BarColNum ;
   private String[] P097D3_A135BarColNom ;
   private String[] P097D3_A13711BarTipArtD ;
   private boolean[] P097D3_n13711BarTipArtD ;
   private String[] P097D3_A1652BarSerDsc ;
   private String[] P097D3_A212BarSer ;
   private String[] P097D3_A13696BarNHdr ;
   private String[] P097D3_A143BarDisNum ;
   private String[] P097D3_A4812BarEncCli ;
   private String[] P097D3_A130BarCodPar ;
   private byte[] P097D3_A132BarCodReo ;
   private int[] P097D3_A129BarCod ;
   private String[] P097D3_A396EmprCod ;
   private short[] P097D4_A217BarTipArt ;
   private boolean[] P097D4_n217BarTipArt ;
   private int[] P097D4_A252CliCod ;
   private boolean[] P097D4_n252CliCod ;
   private short[] P097D4_A1503BarPart ;
   private byte[] P097D4_A213BarSit ;
   private java.util.Date[] P097D4_A161BarFecSal ;
   private java.util.Date[] P097D4_A155BarFecCli ;
   private java.util.Date[] P097D4_A159BarFecGen ;
   private int[] P097D4_A136BarColNum ;
   private String[] P097D4_A135BarColNom ;
   private String[] P097D4_A13711BarTipArtD ;
   private boolean[] P097D4_n13711BarTipArtD ;
   private String[] P097D4_A1652BarSerDsc ;
   private String[] P097D4_A212BarSer ;
   private String[] P097D4_A279CliNom ;
   private String[] P097D4_A13696BarNHdr ;
   private String[] P097D4_A143BarDisNum ;
   private String[] P097D4_A4812BarEncCli ;
   private String[] P097D4_A130BarCodPar ;
   private byte[] P097D4_A132BarCodReo ;
   private int[] P097D4_A129BarCod ;
   private String[] P097D4_A396EmprCod ;
   private short[] P097D5_A217BarTipArt ;
   private boolean[] P097D5_n217BarTipArt ;
   private String[] P097D5_A212BarSer ;
   private int[] P097D5_A252CliCod ;
   private boolean[] P097D5_n252CliCod ;
   private short[] P097D5_A1503BarPart ;
   private byte[] P097D5_A213BarSit ;
   private java.util.Date[] P097D5_A161BarFecSal ;
   private java.util.Date[] P097D5_A155BarFecCli ;
   private java.util.Date[] P097D5_A159BarFecGen ;
   private int[] P097D5_A136BarColNum ;
   private String[] P097D5_A135BarColNom ;
   private String[] P097D5_A13711BarTipArtD ;
   private boolean[] P097D5_n13711BarTipArtD ;
   private String[] P097D5_A1652BarSerDsc ;
   private String[] P097D5_A279CliNom ;
   private String[] P097D5_A13696BarNHdr ;
   private String[] P097D5_A143BarDisNum ;
   private String[] P097D5_A4812BarEncCli ;
   private String[] P097D5_A130BarCodPar ;
   private byte[] P097D5_A132BarCodReo ;
   private int[] P097D5_A129BarCod ;
   private String[] P097D5_A396EmprCod ;
   private short[] P097D6_A217BarTipArt ;
   private boolean[] P097D6_n217BarTipArt ;
   private String[] P097D6_A1652BarSerDsc ;
   private int[] P097D6_A252CliCod ;
   private boolean[] P097D6_n252CliCod ;
   private short[] P097D6_A1503BarPart ;
   private byte[] P097D6_A213BarSit ;
   private java.util.Date[] P097D6_A161BarFecSal ;
   private java.util.Date[] P097D6_A155BarFecCli ;
   private java.util.Date[] P097D6_A159BarFecGen ;
   private int[] P097D6_A136BarColNum ;
   private String[] P097D6_A135BarColNom ;
   private String[] P097D6_A13711BarTipArtD ;
   private boolean[] P097D6_n13711BarTipArtD ;
   private String[] P097D6_A212BarSer ;
   private String[] P097D6_A279CliNom ;
   private String[] P097D6_A13696BarNHdr ;
   private String[] P097D6_A143BarDisNum ;
   private String[] P097D6_A4812BarEncCli ;
   private String[] P097D6_A130BarCodPar ;
   private byte[] P097D6_A132BarCodReo ;
   private int[] P097D6_A129BarCod ;
   private String[] P097D6_A396EmprCod ;
   private short[] P097D7_A217BarTipArt ;
   private boolean[] P097D7_n217BarTipArt ;
   private int[] P097D7_A252CliCod ;
   private boolean[] P097D7_n252CliCod ;
   private short[] P097D7_A1503BarPart ;
   private byte[] P097D7_A213BarSit ;
   private java.util.Date[] P097D7_A161BarFecSal ;
   private java.util.Date[] P097D7_A155BarFecCli ;
   private java.util.Date[] P097D7_A159BarFecGen ;
   private int[] P097D7_A136BarColNum ;
   private String[] P097D7_A135BarColNom ;
   private String[] P097D7_A13711BarTipArtD ;
   private boolean[] P097D7_n13711BarTipArtD ;
   private String[] P097D7_A1652BarSerDsc ;
   private String[] P097D7_A212BarSer ;
   private String[] P097D7_A279CliNom ;
   private String[] P097D7_A13696BarNHdr ;
   private String[] P097D7_A143BarDisNum ;
   private String[] P097D7_A4812BarEncCli ;
   private String[] P097D7_A130BarCodPar ;
   private byte[] P097D7_A132BarCodReo ;
   private int[] P097D7_A129BarCod ;
   private String[] P097D7_A396EmprCod ;
   private short[] P097D8_A217BarTipArt ;
   private boolean[] P097D8_n217BarTipArt ;
   private String[] P097D8_A135BarColNom ;
   private int[] P097D8_A252CliCod ;
   private boolean[] P097D8_n252CliCod ;
   private short[] P097D8_A1503BarPart ;
   private byte[] P097D8_A213BarSit ;
   private java.util.Date[] P097D8_A161BarFecSal ;
   private java.util.Date[] P097D8_A155BarFecCli ;
   private java.util.Date[] P097D8_A159BarFecGen ;
   private int[] P097D8_A136BarColNum ;
   private String[] P097D8_A13711BarTipArtD ;
   private boolean[] P097D8_n13711BarTipArtD ;
   private String[] P097D8_A1652BarSerDsc ;
   private String[] P097D8_A212BarSer ;
   private String[] P097D8_A279CliNom ;
   private String[] P097D8_A13696BarNHdr ;
   private String[] P097D8_A143BarDisNum ;
   private String[] P097D8_A4812BarEncCli ;
   private String[] P097D8_A130BarCodPar ;
   private byte[] P097D8_A132BarCodReo ;
   private int[] P097D8_A129BarCod ;
   private String[] P097D8_A396EmprCod ;
   private GXSimpleCollection<String> AV42Options ;
   private GXSimpleCollection<String> AV45OptionsDesc ;
   private GXSimpleCollection<String> AV47OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV52GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV53GridStateFilterValue ;
}

final  class mantenimientodehdrs_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[40];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P097D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[40];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T3.CliNom, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) ||" ;
      scmdbuf += " T1.BarCodPar AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P097D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[40];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P097D5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[40];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSer, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T1.BarSerDsc, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) ||" ;
      scmdbuf += " T1.BarCodPar AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int15[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int15[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int15[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P097D6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[40];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P097D7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String AV56Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[40];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarTipArt" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P097D8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV77Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV80Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV79Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV84Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV83Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV85Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV89Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV91Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV93Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV94Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV95Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV96Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV97Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV99Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV100Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          String AV76Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV82Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV81Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV98Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV57Clicod ,
                                          java.util.Date AV58Barfecgen ,
                                          java.util.Date AV59BarFecGen_to ,
                                          byte AV60Barsit ,
                                          byte AV61BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV62BarEnccli ,
                                          short AV64Enc20c ,
                                          String A143BarDisNum ,
                                          String AV63BarDisnum ,
                                          int AV67Barcod ,
                                          byte AV68BarCodReo ,
                                          String AV69BarCodPar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[40];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarColNom, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV77Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (0==AV97Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (0==AV99Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_P097D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 1 :
                  return conditional_P097D3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 2 :
                  return conditional_P097D4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 3 :
                  return conditional_P097D5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 4 :
                  return conditional_P097D6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 5 :
                  return conditional_P097D7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
            case 6 :
                  return conditional_P097D8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097D5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097D6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097D7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097D8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 16);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 13);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
      }
   }

}

