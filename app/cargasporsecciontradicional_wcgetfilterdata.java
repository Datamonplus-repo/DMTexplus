package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasporsecciontradicional_wcgetfilterdata extends GXProcedure
{
   public cargasporsecciontradicional_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasporsecciontradicional_wcgetfilterdata.class ), "" );
   }

   public cargasporsecciontradicional_wcgetfilterdata( int remoteHandle ,
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
      cargasporsecciontradicional_wcgetfilterdata.this.aP5 = new String[] {""};
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
      cargasporsecciontradicional_wcgetfilterdata.this.AV56DDOName = aP0;
      cargasporsecciontradicional_wcgetfilterdata.this.AV54SearchTxt = aP1;
      cargasporsecciontradicional_wcgetfilterdata.this.AV55SearchTxtTo = aP2;
      cargasporsecciontradicional_wcgetfilterdata.this.aP3 = aP3;
      cargasporsecciontradicional_wcgetfilterdata.this.aP4 = aP4;
      cargasporsecciontradicional_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCODOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV60OptionsJson = AV59Options.toJSonString(false) ;
      AV63OptionsDescJson = AV62OptionsDesc.toJSonString(false) ;
      AV65OptionIndexesJson = AV64OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("CargasporSeccionTradicional_WCGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CargasporSeccionTradicional_WCGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("CargasporSeccionTradicional_WCGridState"), null, null);
      }
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV10TFCliNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV11TFCliNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV12TFBarFecCli = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV14TFPedidoCliente = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV15TFPedidoCliente_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV16TFBarFecFpr = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV18TFBarFecGen = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV20TFBarNHdr = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV21TFBarNHdr_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV22TFBarSer = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV23TFBarSer_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV24TFBarSerDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV25TFBarSerDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV26TFBarColNom = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV27TFBarColNom_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV28TFBarColNum = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarColNum_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV30TFBarTipCol = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFBarTipCol_To = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV32TFBarOrdLin = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFBarOrdLin_To = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV34TFMaqCodBis = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV35TFMaqCodBis_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV36TFFasCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV37TFFasCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV38TFFasDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV39TFFasDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV40TFBarFasEst_SelsJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV41TFBarFasEst_Sels.fromJSonString(AV40TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV42TFBarMtr = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFBarMtr_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV44TFBarKgm = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFBarKgm_To = CommonUtil.decimalVal( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV46TFBarPie = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarPie_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV48TFBarFasCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV49TFBarFasCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV50TFBarFecCum = localUtil.ctod( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV52TFBarSit = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarSit_To = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV73Emprcod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODINOUT") == 0 )
         {
            AV74MaqcodInout = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPOCONTROL") == 0 )
         {
            AV75TipoControl = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASESTOJSON") == 0 )
         {
            AV76FasesToJson = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV77Barcod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV78Barcodreo = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV79Barcodpar = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCliNom = AV54SearchTxt ;
      AV11TFCliNom_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           A396EmprCod ,
                                           AV73Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H9 */
      pr_default.execute(0, new Object[] {AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, AV73Emprcod, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk98H2 = false ;
         A252CliCod = P098H9_A252CliCod[0] ;
         n252CliCod = P098H9_n252CliCod[0] ;
         A279CliNom = P098H9_A279CliNom[0] ;
         A213BarSit = P098H9_A213BarSit[0] ;
         A153BarFasEst = P098H9_A153BarFasEst[0] ;
         A460FasDsc = P098H9_A460FasDsc[0] ;
         A457FasCod = P098H9_A457FasCod[0] ;
         A603MaqCodBis = P098H9_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H9_A194BarOrdLin[0] ;
         A218BarTipCol = P098H9_A218BarTipCol[0] ;
         A136BarColNum = P098H9_A136BarColNum[0] ;
         A135BarColNom = P098H9_A135BarColNom[0] ;
         A1652BarSerDsc = P098H9_A1652BarSerDsc[0] ;
         A212BarSer = P098H9_A212BarSer[0] ;
         A13696BarNHdr = P098H9_A13696BarNHdr[0] ;
         A159BarFecGen = P098H9_A159BarFecGen[0] ;
         A158BarFecFpr = P098H9_A158BarFecFpr[0] ;
         A155BarFecCli = P098H9_A155BarFecCli[0] ;
         A156BarFecCum = P098H9_A156BarFecCum[0] ;
         n156BarFecCum = P098H9_n156BarFecCum[0] ;
         A151BarFasCod = P098H9_A151BarFasCod[0] ;
         n151BarFasCod = P098H9_n151BarFasCod[0] ;
         A166BarKgm = P098H9_A166BarKgm[0] ;
         A184BarMtr = P098H9_A184BarMtr[0] ;
         A129BarCod = P098H9_A129BarCod[0] ;
         A132BarCodReo = P098H9_A132BarCodReo[0] ;
         A130BarCodPar = P098H9_A130BarCodPar[0] ;
         A143BarDisNum = P098H9_A143BarDisNum[0] ;
         A4812BarEncCli = P098H9_A4812BarEncCli[0] ;
         A396EmprCod = P098H9_A396EmprCod[0] ;
         A199BarPie1 = P098H9_A199BarPie1[0] ;
         A365DisDes = P098H9_A365DisDes[0] ;
         A898BarPieNDes = P098H9_A898BarPieNDes[0] ;
         A758ProCod = P098H9_A758ProCod[0] ;
         A460FasDsc = P098H9_A460FasDsc[0] ;
         A252CliCod = P098H9_A252CliCod[0] ;
         n252CliCod = P098H9_n252CliCod[0] ;
         A213BarSit = P098H9_A213BarSit[0] ;
         A218BarTipCol = P098H9_A218BarTipCol[0] ;
         A136BarColNum = P098H9_A136BarColNum[0] ;
         A135BarColNom = P098H9_A135BarColNom[0] ;
         A1652BarSerDsc = P098H9_A1652BarSerDsc[0] ;
         A212BarSer = P098H9_A212BarSer[0] ;
         A13696BarNHdr = P098H9_A13696BarNHdr[0] ;
         A159BarFecGen = P098H9_A159BarFecGen[0] ;
         A158BarFecFpr = P098H9_A158BarFecFpr[0] ;
         A155BarFecCli = P098H9_A155BarFecCli[0] ;
         A143BarDisNum = P098H9_A143BarDisNum[0] ;
         A4812BarEncCli = P098H9_A4812BarEncCli[0] ;
         A365DisDes = P098H9_A365DisDes[0] ;
         A279CliNom = P098H9_A279CliNom[0] ;
         A156BarFecCum = P098H9_A156BarFecCum[0] ;
         n156BarFecCum = P098H9_n156BarFecCum[0] ;
         A151BarFasCod = P098H9_A151BarFasCod[0] ;
         n151BarFasCod = P098H9_n151BarFasCod[0] ;
         A166BarKgm = P098H9_A166BarKgm[0] ;
         A184BarMtr = P098H9_A184BarMtr[0] ;
         A199BarPie1 = P098H9_A199BarPie1[0] ;
         A898BarPieNDes = P098H9_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P098H9_A279CliNom[0], A279CliNom) == 0 ) )
                        {
                           brk98H2 = false ;
                           A252CliCod = P098H9_A252CliCod[0] ;
                           n252CliCod = P098H9_n252CliCod[0] ;
                           A194BarOrdLin = P098H9_A194BarOrdLin[0] ;
                           A129BarCod = P098H9_A129BarCod[0] ;
                           A132BarCodReo = P098H9_A132BarCodReo[0] ;
                           A130BarCodPar = P098H9_A130BarCodPar[0] ;
                           A396EmprCod = P098H9_A396EmprCod[0] ;
                           A758ProCod = P098H9_A758ProCod[0] ;
                           A252CliCod = P098H9_A252CliCod[0] ;
                           n252CliCod = P098H9_n252CliCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk98H2 = true ;
                           pr_default.readNext(0);
                        }
                        if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                        {
                           AV58Option = A279CliNom ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H2 )
         {
            brk98H2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPedidoCliente = AV54SearchTxt ;
      AV15TFPedidoCliente_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           AV73Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H17 */
      pr_default.execute(1, new Object[] {AV73Emprcod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P098H17_A252CliCod[0] ;
         n252CliCod = P098H17_n252CliCod[0] ;
         A213BarSit = P098H17_A213BarSit[0] ;
         A153BarFasEst = P098H17_A153BarFasEst[0] ;
         A460FasDsc = P098H17_A460FasDsc[0] ;
         A457FasCod = P098H17_A457FasCod[0] ;
         A603MaqCodBis = P098H17_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H17_A194BarOrdLin[0] ;
         A218BarTipCol = P098H17_A218BarTipCol[0] ;
         A136BarColNum = P098H17_A136BarColNum[0] ;
         A135BarColNom = P098H17_A135BarColNom[0] ;
         A1652BarSerDsc = P098H17_A1652BarSerDsc[0] ;
         A212BarSer = P098H17_A212BarSer[0] ;
         A13696BarNHdr = P098H17_A13696BarNHdr[0] ;
         A159BarFecGen = P098H17_A159BarFecGen[0] ;
         A158BarFecFpr = P098H17_A158BarFecFpr[0] ;
         A155BarFecCli = P098H17_A155BarFecCli[0] ;
         A279CliNom = P098H17_A279CliNom[0] ;
         A156BarFecCum = P098H17_A156BarFecCum[0] ;
         n156BarFecCum = P098H17_n156BarFecCum[0] ;
         A151BarFasCod = P098H17_A151BarFasCod[0] ;
         n151BarFasCod = P098H17_n151BarFasCod[0] ;
         A166BarKgm = P098H17_A166BarKgm[0] ;
         A184BarMtr = P098H17_A184BarMtr[0] ;
         A129BarCod = P098H17_A129BarCod[0] ;
         A132BarCodReo = P098H17_A132BarCodReo[0] ;
         A130BarCodPar = P098H17_A130BarCodPar[0] ;
         A143BarDisNum = P098H17_A143BarDisNum[0] ;
         A4812BarEncCli = P098H17_A4812BarEncCli[0] ;
         A396EmprCod = P098H17_A396EmprCod[0] ;
         A199BarPie1 = P098H17_A199BarPie1[0] ;
         A365DisDes = P098H17_A365DisDes[0] ;
         A898BarPieNDes = P098H17_A898BarPieNDes[0] ;
         A758ProCod = P098H17_A758ProCod[0] ;
         A460FasDsc = P098H17_A460FasDsc[0] ;
         A252CliCod = P098H17_A252CliCod[0] ;
         n252CliCod = P098H17_n252CliCod[0] ;
         A213BarSit = P098H17_A213BarSit[0] ;
         A218BarTipCol = P098H17_A218BarTipCol[0] ;
         A136BarColNum = P098H17_A136BarColNum[0] ;
         A135BarColNom = P098H17_A135BarColNom[0] ;
         A1652BarSerDsc = P098H17_A1652BarSerDsc[0] ;
         A212BarSer = P098H17_A212BarSer[0] ;
         A13696BarNHdr = P098H17_A13696BarNHdr[0] ;
         A159BarFecGen = P098H17_A159BarFecGen[0] ;
         A158BarFecFpr = P098H17_A158BarFecFpr[0] ;
         A155BarFecCli = P098H17_A155BarFecCli[0] ;
         A143BarDisNum = P098H17_A143BarDisNum[0] ;
         A4812BarEncCli = P098H17_A4812BarEncCli[0] ;
         A365DisDes = P098H17_A365DisDes[0] ;
         A279CliNom = P098H17_A279CliNom[0] ;
         A156BarFecCum = P098H17_A156BarFecCum[0] ;
         n156BarFecCum = P098H17_n156BarFecCum[0] ;
         A151BarFasCod = P098H17_A151BarFasCod[0] ;
         n151BarFasCod = P098H17_n151BarFasCod[0] ;
         A166BarKgm = P098H17_A166BarKgm[0] ;
         A184BarMtr = P098H17_A184BarMtr[0] ;
         A199BarPie1 = P098H17_A199BarPie1[0] ;
         A898BarPieNDes = P098H17_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                        {
                           AV58Option = A13878PedidoClie ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                           {
                              AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                              AV66count = (long)(AV66count+1) ;
                              AV64OptionIndexes.removeItem(AV57InsertIndex);
                              AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                           }
                           else
                           {
                              AV59Options.add(AV58Option, AV57InsertIndex);
                              AV64OptionIndexes.add("1", AV57InsertIndex);
                           }
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
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
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarNHdr = AV54SearchTxt ;
      AV21TFBarNHdr_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           AV73Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H25 */
      pr_default.execute(2, new Object[] {AV73Emprcod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P098H25_A252CliCod[0] ;
         n252CliCod = P098H25_n252CliCod[0] ;
         A213BarSit = P098H25_A213BarSit[0] ;
         A153BarFasEst = P098H25_A153BarFasEst[0] ;
         A460FasDsc = P098H25_A460FasDsc[0] ;
         A457FasCod = P098H25_A457FasCod[0] ;
         A603MaqCodBis = P098H25_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H25_A194BarOrdLin[0] ;
         A218BarTipCol = P098H25_A218BarTipCol[0] ;
         A136BarColNum = P098H25_A136BarColNum[0] ;
         A135BarColNom = P098H25_A135BarColNom[0] ;
         A1652BarSerDsc = P098H25_A1652BarSerDsc[0] ;
         A212BarSer = P098H25_A212BarSer[0] ;
         A13696BarNHdr = P098H25_A13696BarNHdr[0] ;
         A159BarFecGen = P098H25_A159BarFecGen[0] ;
         A158BarFecFpr = P098H25_A158BarFecFpr[0] ;
         A155BarFecCli = P098H25_A155BarFecCli[0] ;
         A279CliNom = P098H25_A279CliNom[0] ;
         A156BarFecCum = P098H25_A156BarFecCum[0] ;
         n156BarFecCum = P098H25_n156BarFecCum[0] ;
         A151BarFasCod = P098H25_A151BarFasCod[0] ;
         n151BarFasCod = P098H25_n151BarFasCod[0] ;
         A166BarKgm = P098H25_A166BarKgm[0] ;
         A184BarMtr = P098H25_A184BarMtr[0] ;
         A129BarCod = P098H25_A129BarCod[0] ;
         A132BarCodReo = P098H25_A132BarCodReo[0] ;
         A130BarCodPar = P098H25_A130BarCodPar[0] ;
         A143BarDisNum = P098H25_A143BarDisNum[0] ;
         A4812BarEncCli = P098H25_A4812BarEncCli[0] ;
         A396EmprCod = P098H25_A396EmprCod[0] ;
         A199BarPie1 = P098H25_A199BarPie1[0] ;
         A365DisDes = P098H25_A365DisDes[0] ;
         A898BarPieNDes = P098H25_A898BarPieNDes[0] ;
         A758ProCod = P098H25_A758ProCod[0] ;
         A460FasDsc = P098H25_A460FasDsc[0] ;
         A252CliCod = P098H25_A252CliCod[0] ;
         n252CliCod = P098H25_n252CliCod[0] ;
         A213BarSit = P098H25_A213BarSit[0] ;
         A218BarTipCol = P098H25_A218BarTipCol[0] ;
         A136BarColNum = P098H25_A136BarColNum[0] ;
         A135BarColNom = P098H25_A135BarColNom[0] ;
         A1652BarSerDsc = P098H25_A1652BarSerDsc[0] ;
         A212BarSer = P098H25_A212BarSer[0] ;
         A13696BarNHdr = P098H25_A13696BarNHdr[0] ;
         A159BarFecGen = P098H25_A159BarFecGen[0] ;
         A158BarFecFpr = P098H25_A158BarFecFpr[0] ;
         A155BarFecCli = P098H25_A155BarFecCli[0] ;
         A143BarDisNum = P098H25_A143BarDisNum[0] ;
         A4812BarEncCli = P098H25_A4812BarEncCli[0] ;
         A365DisDes = P098H25_A365DisDes[0] ;
         A279CliNom = P098H25_A279CliNom[0] ;
         A156BarFecCum = P098H25_A156BarFecCum[0] ;
         n156BarFecCum = P098H25_n156BarFecCum[0] ;
         A151BarFasCod = P098H25_A151BarFasCod[0] ;
         n151BarFasCod = P098H25_n151BarFasCod[0] ;
         A166BarKgm = P098H25_A166BarKgm[0] ;
         A184BarMtr = P098H25_A184BarMtr[0] ;
         A199BarPie1 = P098H25_A199BarPie1[0] ;
         A898BarPieNDes = P098H25_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                        {
                           AV58Option = A13696BarNHdr ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                           {
                              AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                              AV66count = (long)(AV66count+1) ;
                              AV64OptionIndexes.removeItem(AV57InsertIndex);
                              AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                           }
                           else
                           {
                              AV59Options.add(AV58Option, AV57InsertIndex);
                              AV64OptionIndexes.add("1", AV57InsertIndex);
                           }
                        }
                        if ( AV59Options.size() == 50 )
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
      AV22TFBarSer = AV54SearchTxt ;
      AV23TFBarSer_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           A396EmprCod ,
                                           AV73Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H33 */
      pr_default.execute(3, new Object[] {AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, AV73Emprcod, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk98H6 = false ;
         A252CliCod = P098H33_A252CliCod[0] ;
         n252CliCod = P098H33_n252CliCod[0] ;
         A212BarSer = P098H33_A212BarSer[0] ;
         A213BarSit = P098H33_A213BarSit[0] ;
         A153BarFasEst = P098H33_A153BarFasEst[0] ;
         A460FasDsc = P098H33_A460FasDsc[0] ;
         A457FasCod = P098H33_A457FasCod[0] ;
         A603MaqCodBis = P098H33_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H33_A194BarOrdLin[0] ;
         A218BarTipCol = P098H33_A218BarTipCol[0] ;
         A136BarColNum = P098H33_A136BarColNum[0] ;
         A135BarColNom = P098H33_A135BarColNom[0] ;
         A1652BarSerDsc = P098H33_A1652BarSerDsc[0] ;
         A13696BarNHdr = P098H33_A13696BarNHdr[0] ;
         A159BarFecGen = P098H33_A159BarFecGen[0] ;
         A158BarFecFpr = P098H33_A158BarFecFpr[0] ;
         A155BarFecCli = P098H33_A155BarFecCli[0] ;
         A279CliNom = P098H33_A279CliNom[0] ;
         A156BarFecCum = P098H33_A156BarFecCum[0] ;
         n156BarFecCum = P098H33_n156BarFecCum[0] ;
         A151BarFasCod = P098H33_A151BarFasCod[0] ;
         n151BarFasCod = P098H33_n151BarFasCod[0] ;
         A166BarKgm = P098H33_A166BarKgm[0] ;
         A184BarMtr = P098H33_A184BarMtr[0] ;
         A129BarCod = P098H33_A129BarCod[0] ;
         A132BarCodReo = P098H33_A132BarCodReo[0] ;
         A130BarCodPar = P098H33_A130BarCodPar[0] ;
         A143BarDisNum = P098H33_A143BarDisNum[0] ;
         A4812BarEncCli = P098H33_A4812BarEncCli[0] ;
         A396EmprCod = P098H33_A396EmprCod[0] ;
         A199BarPie1 = P098H33_A199BarPie1[0] ;
         A365DisDes = P098H33_A365DisDes[0] ;
         A898BarPieNDes = P098H33_A898BarPieNDes[0] ;
         A758ProCod = P098H33_A758ProCod[0] ;
         A460FasDsc = P098H33_A460FasDsc[0] ;
         A252CliCod = P098H33_A252CliCod[0] ;
         n252CliCod = P098H33_n252CliCod[0] ;
         A212BarSer = P098H33_A212BarSer[0] ;
         A213BarSit = P098H33_A213BarSit[0] ;
         A218BarTipCol = P098H33_A218BarTipCol[0] ;
         A136BarColNum = P098H33_A136BarColNum[0] ;
         A135BarColNom = P098H33_A135BarColNom[0] ;
         A1652BarSerDsc = P098H33_A1652BarSerDsc[0] ;
         A13696BarNHdr = P098H33_A13696BarNHdr[0] ;
         A159BarFecGen = P098H33_A159BarFecGen[0] ;
         A158BarFecFpr = P098H33_A158BarFecFpr[0] ;
         A155BarFecCli = P098H33_A155BarFecCli[0] ;
         A143BarDisNum = P098H33_A143BarDisNum[0] ;
         A4812BarEncCli = P098H33_A4812BarEncCli[0] ;
         A365DisDes = P098H33_A365DisDes[0] ;
         A279CliNom = P098H33_A279CliNom[0] ;
         A156BarFecCum = P098H33_A156BarFecCum[0] ;
         n156BarFecCum = P098H33_n156BarFecCum[0] ;
         A151BarFasCod = P098H33_A151BarFasCod[0] ;
         n151BarFasCod = P098H33_n151BarFasCod[0] ;
         A166BarKgm = P098H33_A166BarKgm[0] ;
         A184BarMtr = P098H33_A184BarMtr[0] ;
         A199BarPie1 = P098H33_A199BarPie1[0] ;
         A898BarPieNDes = P098H33_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P098H33_A212BarSer[0], A212BarSer) == 0 ) )
                        {
                           brk98H6 = false ;
                           A194BarOrdLin = P098H33_A194BarOrdLin[0] ;
                           A129BarCod = P098H33_A129BarCod[0] ;
                           A132BarCodReo = P098H33_A132BarCodReo[0] ;
                           A130BarCodPar = P098H33_A130BarCodPar[0] ;
                           A396EmprCod = P098H33_A396EmprCod[0] ;
                           A758ProCod = P098H33_A758ProCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk98H6 = true ;
                           pr_default.readNext(3);
                        }
                        if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                        {
                           AV58Option = A212BarSer ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H6 )
         {
            brk98H6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarSerDsc = AV54SearchTxt ;
      AV25TFBarSerDsc_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           A396EmprCod ,
                                           AV73Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H41 */
      pr_default.execute(4, new Object[] {AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, AV73Emprcod, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk98H8 = false ;
         A252CliCod = P098H41_A252CliCod[0] ;
         n252CliCod = P098H41_n252CliCod[0] ;
         A1652BarSerDsc = P098H41_A1652BarSerDsc[0] ;
         A213BarSit = P098H41_A213BarSit[0] ;
         A153BarFasEst = P098H41_A153BarFasEst[0] ;
         A460FasDsc = P098H41_A460FasDsc[0] ;
         A457FasCod = P098H41_A457FasCod[0] ;
         A603MaqCodBis = P098H41_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H41_A194BarOrdLin[0] ;
         A218BarTipCol = P098H41_A218BarTipCol[0] ;
         A136BarColNum = P098H41_A136BarColNum[0] ;
         A135BarColNom = P098H41_A135BarColNom[0] ;
         A212BarSer = P098H41_A212BarSer[0] ;
         A13696BarNHdr = P098H41_A13696BarNHdr[0] ;
         A159BarFecGen = P098H41_A159BarFecGen[0] ;
         A158BarFecFpr = P098H41_A158BarFecFpr[0] ;
         A155BarFecCli = P098H41_A155BarFecCli[0] ;
         A279CliNom = P098H41_A279CliNom[0] ;
         A156BarFecCum = P098H41_A156BarFecCum[0] ;
         n156BarFecCum = P098H41_n156BarFecCum[0] ;
         A151BarFasCod = P098H41_A151BarFasCod[0] ;
         n151BarFasCod = P098H41_n151BarFasCod[0] ;
         A166BarKgm = P098H41_A166BarKgm[0] ;
         A184BarMtr = P098H41_A184BarMtr[0] ;
         A129BarCod = P098H41_A129BarCod[0] ;
         A132BarCodReo = P098H41_A132BarCodReo[0] ;
         A130BarCodPar = P098H41_A130BarCodPar[0] ;
         A143BarDisNum = P098H41_A143BarDisNum[0] ;
         A4812BarEncCli = P098H41_A4812BarEncCli[0] ;
         A396EmprCod = P098H41_A396EmprCod[0] ;
         A199BarPie1 = P098H41_A199BarPie1[0] ;
         A365DisDes = P098H41_A365DisDes[0] ;
         A898BarPieNDes = P098H41_A898BarPieNDes[0] ;
         A758ProCod = P098H41_A758ProCod[0] ;
         A460FasDsc = P098H41_A460FasDsc[0] ;
         A252CliCod = P098H41_A252CliCod[0] ;
         n252CliCod = P098H41_n252CliCod[0] ;
         A1652BarSerDsc = P098H41_A1652BarSerDsc[0] ;
         A213BarSit = P098H41_A213BarSit[0] ;
         A218BarTipCol = P098H41_A218BarTipCol[0] ;
         A136BarColNum = P098H41_A136BarColNum[0] ;
         A135BarColNom = P098H41_A135BarColNom[0] ;
         A212BarSer = P098H41_A212BarSer[0] ;
         A13696BarNHdr = P098H41_A13696BarNHdr[0] ;
         A159BarFecGen = P098H41_A159BarFecGen[0] ;
         A158BarFecFpr = P098H41_A158BarFecFpr[0] ;
         A155BarFecCli = P098H41_A155BarFecCli[0] ;
         A143BarDisNum = P098H41_A143BarDisNum[0] ;
         A4812BarEncCli = P098H41_A4812BarEncCli[0] ;
         A365DisDes = P098H41_A365DisDes[0] ;
         A279CliNom = P098H41_A279CliNom[0] ;
         A156BarFecCum = P098H41_A156BarFecCum[0] ;
         n156BarFecCum = P098H41_n156BarFecCum[0] ;
         A151BarFasCod = P098H41_A151BarFasCod[0] ;
         n151BarFasCod = P098H41_n151BarFasCod[0] ;
         A166BarKgm = P098H41_A166BarKgm[0] ;
         A184BarMtr = P098H41_A184BarMtr[0] ;
         A199BarPie1 = P098H41_A199BarPie1[0] ;
         A898BarPieNDes = P098H41_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P098H41_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                        {
                           brk98H8 = false ;
                           A194BarOrdLin = P098H41_A194BarOrdLin[0] ;
                           A129BarCod = P098H41_A129BarCod[0] ;
                           A132BarCodReo = P098H41_A132BarCodReo[0] ;
                           A130BarCodPar = P098H41_A130BarCodPar[0] ;
                           A396EmprCod = P098H41_A396EmprCod[0] ;
                           A758ProCod = P098H41_A758ProCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk98H8 = true ;
                           pr_default.readNext(4);
                        }
                        if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                        {
                           AV58Option = A1652BarSerDsc ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H8 )
         {
            brk98H8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarColNom = AV54SearchTxt ;
      AV27TFBarColNom_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           A396EmprCod ,
                                           AV73Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H49 */
      pr_default.execute(5, new Object[] {AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, AV73Emprcod, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk98H10 = false ;
         A252CliCod = P098H49_A252CliCod[0] ;
         n252CliCod = P098H49_n252CliCod[0] ;
         A135BarColNom = P098H49_A135BarColNom[0] ;
         A213BarSit = P098H49_A213BarSit[0] ;
         A153BarFasEst = P098H49_A153BarFasEst[0] ;
         A460FasDsc = P098H49_A460FasDsc[0] ;
         A457FasCod = P098H49_A457FasCod[0] ;
         A603MaqCodBis = P098H49_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H49_A194BarOrdLin[0] ;
         A218BarTipCol = P098H49_A218BarTipCol[0] ;
         A136BarColNum = P098H49_A136BarColNum[0] ;
         A1652BarSerDsc = P098H49_A1652BarSerDsc[0] ;
         A212BarSer = P098H49_A212BarSer[0] ;
         A13696BarNHdr = P098H49_A13696BarNHdr[0] ;
         A159BarFecGen = P098H49_A159BarFecGen[0] ;
         A158BarFecFpr = P098H49_A158BarFecFpr[0] ;
         A155BarFecCli = P098H49_A155BarFecCli[0] ;
         A279CliNom = P098H49_A279CliNom[0] ;
         A156BarFecCum = P098H49_A156BarFecCum[0] ;
         n156BarFecCum = P098H49_n156BarFecCum[0] ;
         A151BarFasCod = P098H49_A151BarFasCod[0] ;
         n151BarFasCod = P098H49_n151BarFasCod[0] ;
         A166BarKgm = P098H49_A166BarKgm[0] ;
         A184BarMtr = P098H49_A184BarMtr[0] ;
         A129BarCod = P098H49_A129BarCod[0] ;
         A132BarCodReo = P098H49_A132BarCodReo[0] ;
         A130BarCodPar = P098H49_A130BarCodPar[0] ;
         A143BarDisNum = P098H49_A143BarDisNum[0] ;
         A4812BarEncCli = P098H49_A4812BarEncCli[0] ;
         A396EmprCod = P098H49_A396EmprCod[0] ;
         A199BarPie1 = P098H49_A199BarPie1[0] ;
         A365DisDes = P098H49_A365DisDes[0] ;
         A898BarPieNDes = P098H49_A898BarPieNDes[0] ;
         A758ProCod = P098H49_A758ProCod[0] ;
         A460FasDsc = P098H49_A460FasDsc[0] ;
         A252CliCod = P098H49_A252CliCod[0] ;
         n252CliCod = P098H49_n252CliCod[0] ;
         A135BarColNom = P098H49_A135BarColNom[0] ;
         A213BarSit = P098H49_A213BarSit[0] ;
         A218BarTipCol = P098H49_A218BarTipCol[0] ;
         A136BarColNum = P098H49_A136BarColNum[0] ;
         A1652BarSerDsc = P098H49_A1652BarSerDsc[0] ;
         A212BarSer = P098H49_A212BarSer[0] ;
         A13696BarNHdr = P098H49_A13696BarNHdr[0] ;
         A159BarFecGen = P098H49_A159BarFecGen[0] ;
         A158BarFecFpr = P098H49_A158BarFecFpr[0] ;
         A155BarFecCli = P098H49_A155BarFecCli[0] ;
         A143BarDisNum = P098H49_A143BarDisNum[0] ;
         A4812BarEncCli = P098H49_A4812BarEncCli[0] ;
         A365DisDes = P098H49_A365DisDes[0] ;
         A279CliNom = P098H49_A279CliNom[0] ;
         A156BarFecCum = P098H49_A156BarFecCum[0] ;
         n156BarFecCum = P098H49_n156BarFecCum[0] ;
         A151BarFasCod = P098H49_A151BarFasCod[0] ;
         n151BarFasCod = P098H49_n151BarFasCod[0] ;
         A166BarKgm = P098H49_A166BarKgm[0] ;
         A184BarMtr = P098H49_A184BarMtr[0] ;
         A199BarPie1 = P098H49_A199BarPie1[0] ;
         A898BarPieNDes = P098H49_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P098H49_A135BarColNom[0], A135BarColNom) == 0 ) )
                        {
                           brk98H10 = false ;
                           A194BarOrdLin = P098H49_A194BarOrdLin[0] ;
                           A129BarCod = P098H49_A129BarCod[0] ;
                           A132BarCodReo = P098H49_A132BarCodReo[0] ;
                           A130BarCodPar = P098H49_A130BarCodPar[0] ;
                           A396EmprCod = P098H49_A396EmprCod[0] ;
                           A758ProCod = P098H49_A758ProCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk98H10 = true ;
                           pr_default.readNext(5);
                        }
                        if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                        {
                           AV58Option = A135BarColNom ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H10 )
         {
            brk98H10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV34TFMaqCodBis = AV54SearchTxt ;
      AV35TFMaqCodBis_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           AV73Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H57 */
      pr_default.execute(6, new Object[] {AV73Emprcod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk98H12 = false ;
         A252CliCod = P098H57_A252CliCod[0] ;
         n252CliCod = P098H57_n252CliCod[0] ;
         A603MaqCodBis = P098H57_A603MaqCodBis[0] ;
         A213BarSit = P098H57_A213BarSit[0] ;
         A153BarFasEst = P098H57_A153BarFasEst[0] ;
         A460FasDsc = P098H57_A460FasDsc[0] ;
         A457FasCod = P098H57_A457FasCod[0] ;
         A194BarOrdLin = P098H57_A194BarOrdLin[0] ;
         A218BarTipCol = P098H57_A218BarTipCol[0] ;
         A136BarColNum = P098H57_A136BarColNum[0] ;
         A135BarColNom = P098H57_A135BarColNom[0] ;
         A1652BarSerDsc = P098H57_A1652BarSerDsc[0] ;
         A212BarSer = P098H57_A212BarSer[0] ;
         A13696BarNHdr = P098H57_A13696BarNHdr[0] ;
         A159BarFecGen = P098H57_A159BarFecGen[0] ;
         A158BarFecFpr = P098H57_A158BarFecFpr[0] ;
         A155BarFecCli = P098H57_A155BarFecCli[0] ;
         A279CliNom = P098H57_A279CliNom[0] ;
         A156BarFecCum = P098H57_A156BarFecCum[0] ;
         n156BarFecCum = P098H57_n156BarFecCum[0] ;
         A151BarFasCod = P098H57_A151BarFasCod[0] ;
         n151BarFasCod = P098H57_n151BarFasCod[0] ;
         A166BarKgm = P098H57_A166BarKgm[0] ;
         A184BarMtr = P098H57_A184BarMtr[0] ;
         A129BarCod = P098H57_A129BarCod[0] ;
         A132BarCodReo = P098H57_A132BarCodReo[0] ;
         A130BarCodPar = P098H57_A130BarCodPar[0] ;
         A143BarDisNum = P098H57_A143BarDisNum[0] ;
         A4812BarEncCli = P098H57_A4812BarEncCli[0] ;
         A396EmprCod = P098H57_A396EmprCod[0] ;
         A199BarPie1 = P098H57_A199BarPie1[0] ;
         A365DisDes = P098H57_A365DisDes[0] ;
         A898BarPieNDes = P098H57_A898BarPieNDes[0] ;
         A758ProCod = P098H57_A758ProCod[0] ;
         A460FasDsc = P098H57_A460FasDsc[0] ;
         A252CliCod = P098H57_A252CliCod[0] ;
         n252CliCod = P098H57_n252CliCod[0] ;
         A213BarSit = P098H57_A213BarSit[0] ;
         A218BarTipCol = P098H57_A218BarTipCol[0] ;
         A136BarColNum = P098H57_A136BarColNum[0] ;
         A135BarColNom = P098H57_A135BarColNom[0] ;
         A1652BarSerDsc = P098H57_A1652BarSerDsc[0] ;
         A212BarSer = P098H57_A212BarSer[0] ;
         A13696BarNHdr = P098H57_A13696BarNHdr[0] ;
         A159BarFecGen = P098H57_A159BarFecGen[0] ;
         A158BarFecFpr = P098H57_A158BarFecFpr[0] ;
         A155BarFecCli = P098H57_A155BarFecCli[0] ;
         A143BarDisNum = P098H57_A143BarDisNum[0] ;
         A4812BarEncCli = P098H57_A4812BarEncCli[0] ;
         A365DisDes = P098H57_A365DisDes[0] ;
         A279CliNom = P098H57_A279CliNom[0] ;
         A156BarFecCum = P098H57_A156BarFecCum[0] ;
         n156BarFecCum = P098H57_n156BarFecCum[0] ;
         A151BarFasCod = P098H57_A151BarFasCod[0] ;
         n151BarFasCod = P098H57_n151BarFasCod[0] ;
         A166BarKgm = P098H57_A166BarKgm[0] ;
         A184BarMtr = P098H57_A184BarMtr[0] ;
         A199BarPie1 = P098H57_A199BarPie1[0] ;
         A898BarPieNDes = P098H57_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P098H57_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P098H57_A603MaqCodBis[0], A603MaqCodBis) == 0 ) )
                        {
                           brk98H12 = false ;
                           A194BarOrdLin = P098H57_A194BarOrdLin[0] ;
                           A129BarCod = P098H57_A129BarCod[0] ;
                           A132BarCodReo = P098H57_A132BarCodReo[0] ;
                           A130BarCodPar = P098H57_A130BarCodPar[0] ;
                           A758ProCod = P098H57_A758ProCod[0] ;
                           AV66count = (long)(AV66count+1) ;
                           brk98H12 = true ;
                           pr_default.readNext(6);
                        }
                        if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
                        {
                           AV58Option = A603MaqCodBis ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H12 )
         {
            brk98H12 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV36TFFasCod = AV54SearchTxt ;
      AV37TFFasCod_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           AV73Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H65 */
      pr_default.execute(7, new Object[] {AV73Emprcod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk98H14 = false ;
         A252CliCod = P098H65_A252CliCod[0] ;
         n252CliCod = P098H65_n252CliCod[0] ;
         A457FasCod = P098H65_A457FasCod[0] ;
         A213BarSit = P098H65_A213BarSit[0] ;
         A153BarFasEst = P098H65_A153BarFasEst[0] ;
         A460FasDsc = P098H65_A460FasDsc[0] ;
         A603MaqCodBis = P098H65_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H65_A194BarOrdLin[0] ;
         A218BarTipCol = P098H65_A218BarTipCol[0] ;
         A136BarColNum = P098H65_A136BarColNum[0] ;
         A135BarColNom = P098H65_A135BarColNom[0] ;
         A1652BarSerDsc = P098H65_A1652BarSerDsc[0] ;
         A212BarSer = P098H65_A212BarSer[0] ;
         A13696BarNHdr = P098H65_A13696BarNHdr[0] ;
         A159BarFecGen = P098H65_A159BarFecGen[0] ;
         A158BarFecFpr = P098H65_A158BarFecFpr[0] ;
         A155BarFecCli = P098H65_A155BarFecCli[0] ;
         A279CliNom = P098H65_A279CliNom[0] ;
         A156BarFecCum = P098H65_A156BarFecCum[0] ;
         n156BarFecCum = P098H65_n156BarFecCum[0] ;
         A151BarFasCod = P098H65_A151BarFasCod[0] ;
         n151BarFasCod = P098H65_n151BarFasCod[0] ;
         A166BarKgm = P098H65_A166BarKgm[0] ;
         A184BarMtr = P098H65_A184BarMtr[0] ;
         A129BarCod = P098H65_A129BarCod[0] ;
         A132BarCodReo = P098H65_A132BarCodReo[0] ;
         A130BarCodPar = P098H65_A130BarCodPar[0] ;
         A143BarDisNum = P098H65_A143BarDisNum[0] ;
         A4812BarEncCli = P098H65_A4812BarEncCli[0] ;
         A396EmprCod = P098H65_A396EmprCod[0] ;
         A199BarPie1 = P098H65_A199BarPie1[0] ;
         A365DisDes = P098H65_A365DisDes[0] ;
         A898BarPieNDes = P098H65_A898BarPieNDes[0] ;
         A758ProCod = P098H65_A758ProCod[0] ;
         A460FasDsc = P098H65_A460FasDsc[0] ;
         A252CliCod = P098H65_A252CliCod[0] ;
         n252CliCod = P098H65_n252CliCod[0] ;
         A213BarSit = P098H65_A213BarSit[0] ;
         A218BarTipCol = P098H65_A218BarTipCol[0] ;
         A136BarColNum = P098H65_A136BarColNum[0] ;
         A135BarColNom = P098H65_A135BarColNom[0] ;
         A1652BarSerDsc = P098H65_A1652BarSerDsc[0] ;
         A212BarSer = P098H65_A212BarSer[0] ;
         A13696BarNHdr = P098H65_A13696BarNHdr[0] ;
         A159BarFecGen = P098H65_A159BarFecGen[0] ;
         A158BarFecFpr = P098H65_A158BarFecFpr[0] ;
         A155BarFecCli = P098H65_A155BarFecCli[0] ;
         A143BarDisNum = P098H65_A143BarDisNum[0] ;
         A4812BarEncCli = P098H65_A4812BarEncCli[0] ;
         A365DisDes = P098H65_A365DisDes[0] ;
         A279CliNom = P098H65_A279CliNom[0] ;
         A156BarFecCum = P098H65_A156BarFecCum[0] ;
         n156BarFecCum = P098H65_n156BarFecCum[0] ;
         A151BarFasCod = P098H65_A151BarFasCod[0] ;
         n151BarFasCod = P098H65_n151BarFasCod[0] ;
         A166BarKgm = P098H65_A166BarKgm[0] ;
         A184BarMtr = P098H65_A184BarMtr[0] ;
         A199BarPie1 = P098H65_A199BarPie1[0] ;
         A898BarPieNDes = P098H65_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P098H65_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P098H65_A457FasCod[0], A457FasCod) == 0 ) )
                        {
                           brk98H14 = false ;
                           A194BarOrdLin = P098H65_A194BarOrdLin[0] ;
                           A129BarCod = P098H65_A129BarCod[0] ;
                           A132BarCodReo = P098H65_A132BarCodReo[0] ;
                           A130BarCodPar = P098H65_A130BarCodPar[0] ;
                           A758ProCod = P098H65_A758ProCod[0] ;
                           if ( (AV80FasesColeccion.indexof(GXutil.rtrim( A457FasCod))>0) || ( AV80FasesColeccion.size() == 0 ) )
                           {
                              AV66count = (long)(AV66count+1) ;
                           }
                           brk98H14 = true ;
                           pr_default.readNext(7);
                        }
                        if ( ! (GXutil.strcmp("", A457FasCod)==0) )
                        {
                           AV58Option = A457FasCod ;
                           AV61OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
                           AV59Options.add(AV58Option, 0);
                           AV62OptionsDesc.add(AV61OptionDesc, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H14 )
         {
            brk98H14 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV38TFFasDsc = AV54SearchTxt ;
      AV39TFFasDsc_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           A396EmprCod ,
                                           AV73Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H73 */
      pr_default.execute(8, new Object[] {AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, AV73Emprcod, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk98H16 = false ;
         A252CliCod = P098H73_A252CliCod[0] ;
         n252CliCod = P098H73_n252CliCod[0] ;
         A460FasDsc = P098H73_A460FasDsc[0] ;
         A213BarSit = P098H73_A213BarSit[0] ;
         A153BarFasEst = P098H73_A153BarFasEst[0] ;
         A457FasCod = P098H73_A457FasCod[0] ;
         A603MaqCodBis = P098H73_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H73_A194BarOrdLin[0] ;
         A218BarTipCol = P098H73_A218BarTipCol[0] ;
         A136BarColNum = P098H73_A136BarColNum[0] ;
         A135BarColNom = P098H73_A135BarColNom[0] ;
         A1652BarSerDsc = P098H73_A1652BarSerDsc[0] ;
         A212BarSer = P098H73_A212BarSer[0] ;
         A13696BarNHdr = P098H73_A13696BarNHdr[0] ;
         A159BarFecGen = P098H73_A159BarFecGen[0] ;
         A158BarFecFpr = P098H73_A158BarFecFpr[0] ;
         A155BarFecCli = P098H73_A155BarFecCli[0] ;
         A279CliNom = P098H73_A279CliNom[0] ;
         A156BarFecCum = P098H73_A156BarFecCum[0] ;
         n156BarFecCum = P098H73_n156BarFecCum[0] ;
         A151BarFasCod = P098H73_A151BarFasCod[0] ;
         n151BarFasCod = P098H73_n151BarFasCod[0] ;
         A166BarKgm = P098H73_A166BarKgm[0] ;
         A184BarMtr = P098H73_A184BarMtr[0] ;
         A129BarCod = P098H73_A129BarCod[0] ;
         A132BarCodReo = P098H73_A132BarCodReo[0] ;
         A130BarCodPar = P098H73_A130BarCodPar[0] ;
         A143BarDisNum = P098H73_A143BarDisNum[0] ;
         A4812BarEncCli = P098H73_A4812BarEncCli[0] ;
         A396EmprCod = P098H73_A396EmprCod[0] ;
         A199BarPie1 = P098H73_A199BarPie1[0] ;
         A365DisDes = P098H73_A365DisDes[0] ;
         A898BarPieNDes = P098H73_A898BarPieNDes[0] ;
         A758ProCod = P098H73_A758ProCod[0] ;
         A460FasDsc = P098H73_A460FasDsc[0] ;
         A252CliCod = P098H73_A252CliCod[0] ;
         n252CliCod = P098H73_n252CliCod[0] ;
         A213BarSit = P098H73_A213BarSit[0] ;
         A218BarTipCol = P098H73_A218BarTipCol[0] ;
         A136BarColNum = P098H73_A136BarColNum[0] ;
         A135BarColNom = P098H73_A135BarColNom[0] ;
         A1652BarSerDsc = P098H73_A1652BarSerDsc[0] ;
         A212BarSer = P098H73_A212BarSer[0] ;
         A13696BarNHdr = P098H73_A13696BarNHdr[0] ;
         A159BarFecGen = P098H73_A159BarFecGen[0] ;
         A158BarFecFpr = P098H73_A158BarFecFpr[0] ;
         A155BarFecCli = P098H73_A155BarFecCli[0] ;
         A143BarDisNum = P098H73_A143BarDisNum[0] ;
         A4812BarEncCli = P098H73_A4812BarEncCli[0] ;
         A365DisDes = P098H73_A365DisDes[0] ;
         A279CliNom = P098H73_A279CliNom[0] ;
         A156BarFecCum = P098H73_A156BarFecCum[0] ;
         n156BarFecCum = P098H73_n156BarFecCum[0] ;
         A151BarFasCod = P098H73_A151BarFasCod[0] ;
         n151BarFasCod = P098H73_n151BarFasCod[0] ;
         A166BarKgm = P098H73_A166BarKgm[0] ;
         A184BarMtr = P098H73_A184BarMtr[0] ;
         A199BarPie1 = P098H73_A199BarPie1[0] ;
         A898BarPieNDes = P098H73_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        AV66count = 0 ;
                        while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P098H73_A460FasDsc[0], A460FasDsc) == 0 ) )
                        {
                           brk98H16 = false ;
                           A457FasCod = P098H73_A457FasCod[0] ;
                           A194BarOrdLin = P098H73_A194BarOrdLin[0] ;
                           A129BarCod = P098H73_A129BarCod[0] ;
                           A132BarCodReo = P098H73_A132BarCodReo[0] ;
                           A130BarCodPar = P098H73_A130BarCodPar[0] ;
                           A396EmprCod = P098H73_A396EmprCod[0] ;
                           A758ProCod = P098H73_A758ProCod[0] ;
                           if ( (AV80FasesColeccion.indexof(GXutil.rtrim( A457FasCod))>0) || ( AV80FasesColeccion.size() == 0 ) )
                           {
                              AV66count = (long)(AV66count+1) ;
                           }
                           brk98H16 = true ;
                           pr_default.readNext(8);
                        }
                        if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
                        {
                           AV58Option = A460FasDsc ;
                           AV59Options.add(AV58Option, 0);
                           AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98H16 )
         {
            brk98H16 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV48TFBarFasCod = AV54SearchTxt ;
      AV49TFBarFasCod_Sel = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = AV72FilterFullText ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = AV10TFCliNom ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV11TFCliNom_Sel ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV12TFBarFecCli ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV14TFPedidoCliente ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV15TFPedidoCliente_Sel ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV16TFBarFecFpr ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV18TFBarFecGen ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV20TFBarNHdr ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV21TFBarNHdr_Sel ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = AV22TFBarSer ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV23TFBarSer_Sel ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV24TFBarSerDsc ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV26TFBarColNom ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV28TFBarColNum ;
      AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV103Cargasporsecciontradicional_wcds_19_tfbartipcol = AV30TFBarTipCol ;
      AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV31TFBarTipCol_To ;
      AV105Cargasporsecciontradicional_wcds_21_tfbarordlin = AV32TFBarOrdLin ;
      AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV33TFBarOrdLin_To ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV34TFMaqCodBis ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = AV36TFFasCod ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = AV37TFFasCod_Sel ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = AV38TFFasDsc ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV39TFFasDsc_Sel ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV41TFBarFasEst_Sels ;
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = AV42TFBarMtr ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV43TFBarMtr_To ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = AV44TFBarKgm ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV45TFBarKgm_To ;
      AV118Cargasporsecciontradicional_wcds_34_tfbarpie = AV46TFBarPie ;
      AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV47TFBarPie_To ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = AV48TFBarFasCod ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV49TFBarFasCod_Sel ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV50TFBarFecCum ;
      AV123Cargasporsecciontradicional_wcds_39_tfbarsit = AV52TFBarSit ;
      AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV53TFBarSit_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV80FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                           Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                           Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                           Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                           Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                           Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                           AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           Integer.valueOf(AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                           AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                           Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                           A279CliNom ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A159BarFecGen ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A460FasDsc ,
                                           A184BarMtr ,
                                           A166BarKgm ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           Integer.valueOf(AV118Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                           Integer.valueOf(AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                           AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV74MaqcodInout ,
                                           Integer.valueOf(AV80FasesColeccion.size()) ,
                                           Integer.valueOf(AV77Barcod) ,
                                           Byte.valueOf(AV78Barcodreo) ,
                                           AV79Barcodpar ,
                                           AV73Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
      lV74MaqcodInout = GXutil.padr( GXutil.rtrim( AV74MaqcodInout), 6, "%") ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV86Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV95Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV111Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
      /* Using cursor P098H81 */
      pr_default.execute(9, new Object[] {AV73Emprcod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV120Cargasporsecciontradicional_wcds_36_tfbarfascod, lV120Cargasporsecciontradicional_wcds_36_tfbarfascod, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV74MaqcodInout, Integer.valueOf(AV80FasesColeccion.size()), Integer.valueOf(AV77Barcod), Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), Byte.valueOf(AV78Barcodreo), AV79Barcodpar, AV79Barcodpar, lV86Cargasporsecciontradicional_wcds_2_tfclinom, AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV95Cargasporsecciontradicional_wcds_11_tfbarser, AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV103Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV105Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV109Cargasporsecciontradicional_wcds_25_tffascod, AV110Cargasporsecciontradicional_wcds_26_tffascod_sel, lV111Cargasporsecciontradicional_wcds_27_tffasdsc, AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV123Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A252CliCod = P098H81_A252CliCod[0] ;
         n252CliCod = P098H81_n252CliCod[0] ;
         A213BarSit = P098H81_A213BarSit[0] ;
         A153BarFasEst = P098H81_A153BarFasEst[0] ;
         A460FasDsc = P098H81_A460FasDsc[0] ;
         A457FasCod = P098H81_A457FasCod[0] ;
         A603MaqCodBis = P098H81_A603MaqCodBis[0] ;
         A194BarOrdLin = P098H81_A194BarOrdLin[0] ;
         A218BarTipCol = P098H81_A218BarTipCol[0] ;
         A136BarColNum = P098H81_A136BarColNum[0] ;
         A135BarColNom = P098H81_A135BarColNom[0] ;
         A1652BarSerDsc = P098H81_A1652BarSerDsc[0] ;
         A212BarSer = P098H81_A212BarSer[0] ;
         A13696BarNHdr = P098H81_A13696BarNHdr[0] ;
         A159BarFecGen = P098H81_A159BarFecGen[0] ;
         A158BarFecFpr = P098H81_A158BarFecFpr[0] ;
         A155BarFecCli = P098H81_A155BarFecCli[0] ;
         A279CliNom = P098H81_A279CliNom[0] ;
         A156BarFecCum = P098H81_A156BarFecCum[0] ;
         n156BarFecCum = P098H81_n156BarFecCum[0] ;
         A151BarFasCod = P098H81_A151BarFasCod[0] ;
         n151BarFasCod = P098H81_n151BarFasCod[0] ;
         A166BarKgm = P098H81_A166BarKgm[0] ;
         A184BarMtr = P098H81_A184BarMtr[0] ;
         A129BarCod = P098H81_A129BarCod[0] ;
         A132BarCodReo = P098H81_A132BarCodReo[0] ;
         A130BarCodPar = P098H81_A130BarCodPar[0] ;
         A143BarDisNum = P098H81_A143BarDisNum[0] ;
         A4812BarEncCli = P098H81_A4812BarEncCli[0] ;
         A396EmprCod = P098H81_A396EmprCod[0] ;
         A199BarPie1 = P098H81_A199BarPie1[0] ;
         A365DisDes = P098H81_A365DisDes[0] ;
         A898BarPieNDes = P098H81_A898BarPieNDes[0] ;
         A758ProCod = P098H81_A758ProCod[0] ;
         A460FasDsc = P098H81_A460FasDsc[0] ;
         A252CliCod = P098H81_A252CliCod[0] ;
         n252CliCod = P098H81_n252CliCod[0] ;
         A213BarSit = P098H81_A213BarSit[0] ;
         A218BarTipCol = P098H81_A218BarTipCol[0] ;
         A136BarColNum = P098H81_A136BarColNum[0] ;
         A135BarColNom = P098H81_A135BarColNom[0] ;
         A1652BarSerDsc = P098H81_A1652BarSerDsc[0] ;
         A212BarSer = P098H81_A212BarSer[0] ;
         A13696BarNHdr = P098H81_A13696BarNHdr[0] ;
         A159BarFecGen = P098H81_A159BarFecGen[0] ;
         A158BarFecFpr = P098H81_A158BarFecFpr[0] ;
         A155BarFecCli = P098H81_A155BarFecCli[0] ;
         A143BarDisNum = P098H81_A143BarDisNum[0] ;
         A4812BarEncCli = P098H81_A4812BarEncCli[0] ;
         A365DisDes = P098H81_A365DisDes[0] ;
         A279CliNom = P098H81_A279CliNom[0] ;
         A156BarFecCum = P098H81_A156BarFecCum[0] ;
         n156BarFecCum = P098H81_n156BarFecCum[0] ;
         A151BarFasCod = P098H81_A151BarFasCod[0] ;
         n151BarFasCod = P098H81_n151BarFasCod[0] ;
         A166BarKgm = P098H81_A166BarKgm[0] ;
         A184BarMtr = P098H81_A184BarMtr[0] ;
         A199BarPie1 = P098H81_A199BarPie1[0] ;
         A898BarPieNDes = P098H81_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporsecciontradicional_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporsecciontradicional_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               if ( (GXutil.strcmp("", AV85Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV85Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV85Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
               {
                  if ( (0==AV118Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV118Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                  {
                     if ( (0==AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
                        {
                           AV58Option = A151BarFasCod ;
                           AV57InsertIndex = 1 ;
                           while ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) < 0 ) )
                           {
                              AV57InsertIndex = (int)(AV57InsertIndex+1) ;
                           }
                           if ( ( AV57InsertIndex <= AV59Options.size() ) && ( GXutil.strcmp((String)AV59Options.elementAt(-1+AV57InsertIndex), AV58Option) == 0 ) )
                           {
                              AV66count = GXutil.lval( (String)AV64OptionIndexes.elementAt(-1+AV57InsertIndex)) ;
                              AV66count = (long)(AV66count+1) ;
                              AV64OptionIndexes.removeItem(AV57InsertIndex);
                              AV64OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), AV57InsertIndex);
                           }
                           else
                           {
                              AV59Options.add(AV58Option, AV57InsertIndex);
                              AV64OptionIndexes.add("1", AV57InsertIndex);
                           }
                        }
                        if ( AV59Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cargasporsecciontradicional_wcgetfilterdata.this.AV60OptionsJson;
      this.aP4[0] = cargasporsecciontradicional_wcgetfilterdata.this.AV63OptionsDescJson;
      this.aP5[0] = cargasporsecciontradicional_wcgetfilterdata.this.AV65OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60OptionsJson = "" ;
      AV63OptionsDescJson = "" ;
      AV65OptionIndexesJson = "" ;
      AV59Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72FilterFullText = "" ;
      AV10TFCliNom = "" ;
      AV11TFCliNom_Sel = "" ;
      AV12TFBarFecCli = GXutil.nullDate() ;
      AV14TFPedidoCliente = "" ;
      AV15TFPedidoCliente_Sel = "" ;
      AV16TFBarFecFpr = GXutil.nullDate() ;
      AV18TFBarFecGen = GXutil.nullDate() ;
      AV20TFBarNHdr = "" ;
      AV21TFBarNHdr_Sel = "" ;
      AV22TFBarSer = "" ;
      AV23TFBarSer_Sel = "" ;
      AV24TFBarSerDsc = "" ;
      AV25TFBarSerDsc_Sel = "" ;
      AV26TFBarColNom = "" ;
      AV27TFBarColNom_Sel = "" ;
      AV34TFMaqCodBis = "" ;
      AV35TFMaqCodBis_Sel = "" ;
      AV36TFFasCod = "" ;
      AV37TFFasCod_Sel = "" ;
      AV38TFFasDsc = "" ;
      AV39TFFasDsc_Sel = "" ;
      AV40TFBarFasEst_SelsJson = "" ;
      AV41TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV42TFBarMtr = DecimalUtil.ZERO ;
      AV43TFBarMtr_To = DecimalUtil.ZERO ;
      AV44TFBarKgm = DecimalUtil.ZERO ;
      AV45TFBarKgm_To = DecimalUtil.ZERO ;
      AV48TFBarFasCod = "" ;
      AV49TFBarFasCod_Sel = "" ;
      AV50TFBarFecCum = GXutil.nullDate() ;
      AV73Emprcod = "" ;
      AV74MaqcodInout = "" ;
      AV75TipoControl = "" ;
      AV76FasesToJson = "" ;
      AV79Barcodpar = "" ;
      A279CliNom = "" ;
      AV85Cargasporsecciontradicional_wcds_1_filterfulltext = "" ;
      AV86Cargasporsecciontradicional_wcds_2_tfclinom = "" ;
      AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel = "" ;
      AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli = GXutil.nullDate() ;
      AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente = "" ;
      AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = "" ;
      AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr = GXutil.nullDate() ;
      AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen = GXutil.nullDate() ;
      AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = "" ;
      AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = "" ;
      AV95Cargasporsecciontradicional_wcds_11_tfbarser = "" ;
      AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel = "" ;
      AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = "" ;
      AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = "" ;
      AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = "" ;
      AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = "" ;
      AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = "" ;
      AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = "" ;
      AV109Cargasporsecciontradicional_wcds_25_tffascod = "" ;
      AV110Cargasporsecciontradicional_wcds_26_tffascod_sel = "" ;
      AV111Cargasporsecciontradicional_wcds_27_tffasdsc = "" ;
      AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel = "" ;
      AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV114Cargasporsecciontradicional_wcds_30_tfbarmtr = DecimalUtil.ZERO ;
      AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to = DecimalUtil.ZERO ;
      AV116Cargasporsecciontradicional_wcds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV120Cargasporsecciontradicional_wcds_36_tfbarfascod = "" ;
      AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = "" ;
      AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum = GXutil.nullDate() ;
      lV85Cargasporsecciontradicional_wcds_1_filterfulltext = "" ;
      AV80FasesColeccion = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV120Cargasporsecciontradicional_wcds_36_tfbarfascod = "" ;
      lV74MaqcodInout = "" ;
      lV86Cargasporsecciontradicional_wcds_2_tfclinom = "" ;
      lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr = "" ;
      lV95Cargasporsecciontradicional_wcds_11_tfbarser = "" ;
      lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc = "" ;
      lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom = "" ;
      lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis = "" ;
      lV109Cargasporsecciontradicional_wcds_25_tffascod = "" ;
      lV111Cargasporsecciontradicional_wcds_27_tffasdsc = "" ;
      A457FasCod = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P098H9_A252CliCod = new int[1] ;
      P098H9_n252CliCod = new boolean[] {false} ;
      P098H9_A279CliNom = new String[] {""} ;
      P098H9_A213BarSit = new byte[1] ;
      P098H9_A153BarFasEst = new byte[1] ;
      P098H9_A460FasDsc = new String[] {""} ;
      P098H9_A457FasCod = new String[] {""} ;
      P098H9_A603MaqCodBis = new String[] {""} ;
      P098H9_A194BarOrdLin = new short[1] ;
      P098H9_A218BarTipCol = new byte[1] ;
      P098H9_A136BarColNum = new int[1] ;
      P098H9_A135BarColNom = new String[] {""} ;
      P098H9_A1652BarSerDsc = new String[] {""} ;
      P098H9_A212BarSer = new String[] {""} ;
      P098H9_A13696BarNHdr = new String[] {""} ;
      P098H9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H9_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H9_n156BarFecCum = new boolean[] {false} ;
      P098H9_A151BarFasCod = new String[] {""} ;
      P098H9_n151BarFasCod = new boolean[] {false} ;
      P098H9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H9_A129BarCod = new int[1] ;
      P098H9_A132BarCodReo = new byte[1] ;
      P098H9_A130BarCodPar = new String[] {""} ;
      P098H9_A143BarDisNum = new String[] {""} ;
      P098H9_A4812BarEncCli = new String[] {""} ;
      P098H9_A396EmprCod = new String[] {""} ;
      P098H9_A199BarPie1 = new short[1] ;
      P098H9_A365DisDes = new String[] {""} ;
      P098H9_A898BarPieNDes = new int[1] ;
      P098H9_A758ProCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      A758ProCod = "" ;
      AV58Option = "" ;
      P098H17_A252CliCod = new int[1] ;
      P098H17_n252CliCod = new boolean[] {false} ;
      P098H17_A213BarSit = new byte[1] ;
      P098H17_A153BarFasEst = new byte[1] ;
      P098H17_A460FasDsc = new String[] {""} ;
      P098H17_A457FasCod = new String[] {""} ;
      P098H17_A603MaqCodBis = new String[] {""} ;
      P098H17_A194BarOrdLin = new short[1] ;
      P098H17_A218BarTipCol = new byte[1] ;
      P098H17_A136BarColNum = new int[1] ;
      P098H17_A135BarColNom = new String[] {""} ;
      P098H17_A1652BarSerDsc = new String[] {""} ;
      P098H17_A212BarSer = new String[] {""} ;
      P098H17_A13696BarNHdr = new String[] {""} ;
      P098H17_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H17_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H17_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H17_A279CliNom = new String[] {""} ;
      P098H17_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H17_n156BarFecCum = new boolean[] {false} ;
      P098H17_A151BarFasCod = new String[] {""} ;
      P098H17_n151BarFasCod = new boolean[] {false} ;
      P098H17_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H17_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H17_A129BarCod = new int[1] ;
      P098H17_A132BarCodReo = new byte[1] ;
      P098H17_A130BarCodPar = new String[] {""} ;
      P098H17_A143BarDisNum = new String[] {""} ;
      P098H17_A4812BarEncCli = new String[] {""} ;
      P098H17_A396EmprCod = new String[] {""} ;
      P098H17_A199BarPie1 = new short[1] ;
      P098H17_A365DisDes = new String[] {""} ;
      P098H17_A898BarPieNDes = new int[1] ;
      P098H17_A758ProCod = new String[] {""} ;
      P098H25_A252CliCod = new int[1] ;
      P098H25_n252CliCod = new boolean[] {false} ;
      P098H25_A213BarSit = new byte[1] ;
      P098H25_A153BarFasEst = new byte[1] ;
      P098H25_A460FasDsc = new String[] {""} ;
      P098H25_A457FasCod = new String[] {""} ;
      P098H25_A603MaqCodBis = new String[] {""} ;
      P098H25_A194BarOrdLin = new short[1] ;
      P098H25_A218BarTipCol = new byte[1] ;
      P098H25_A136BarColNum = new int[1] ;
      P098H25_A135BarColNom = new String[] {""} ;
      P098H25_A1652BarSerDsc = new String[] {""} ;
      P098H25_A212BarSer = new String[] {""} ;
      P098H25_A13696BarNHdr = new String[] {""} ;
      P098H25_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H25_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H25_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H25_A279CliNom = new String[] {""} ;
      P098H25_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H25_n156BarFecCum = new boolean[] {false} ;
      P098H25_A151BarFasCod = new String[] {""} ;
      P098H25_n151BarFasCod = new boolean[] {false} ;
      P098H25_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H25_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H25_A129BarCod = new int[1] ;
      P098H25_A132BarCodReo = new byte[1] ;
      P098H25_A130BarCodPar = new String[] {""} ;
      P098H25_A143BarDisNum = new String[] {""} ;
      P098H25_A4812BarEncCli = new String[] {""} ;
      P098H25_A396EmprCod = new String[] {""} ;
      P098H25_A199BarPie1 = new short[1] ;
      P098H25_A365DisDes = new String[] {""} ;
      P098H25_A898BarPieNDes = new int[1] ;
      P098H25_A758ProCod = new String[] {""} ;
      P098H33_A252CliCod = new int[1] ;
      P098H33_n252CliCod = new boolean[] {false} ;
      P098H33_A212BarSer = new String[] {""} ;
      P098H33_A213BarSit = new byte[1] ;
      P098H33_A153BarFasEst = new byte[1] ;
      P098H33_A460FasDsc = new String[] {""} ;
      P098H33_A457FasCod = new String[] {""} ;
      P098H33_A603MaqCodBis = new String[] {""} ;
      P098H33_A194BarOrdLin = new short[1] ;
      P098H33_A218BarTipCol = new byte[1] ;
      P098H33_A136BarColNum = new int[1] ;
      P098H33_A135BarColNom = new String[] {""} ;
      P098H33_A1652BarSerDsc = new String[] {""} ;
      P098H33_A13696BarNHdr = new String[] {""} ;
      P098H33_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H33_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H33_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H33_A279CliNom = new String[] {""} ;
      P098H33_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H33_n156BarFecCum = new boolean[] {false} ;
      P098H33_A151BarFasCod = new String[] {""} ;
      P098H33_n151BarFasCod = new boolean[] {false} ;
      P098H33_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H33_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H33_A129BarCod = new int[1] ;
      P098H33_A132BarCodReo = new byte[1] ;
      P098H33_A130BarCodPar = new String[] {""} ;
      P098H33_A143BarDisNum = new String[] {""} ;
      P098H33_A4812BarEncCli = new String[] {""} ;
      P098H33_A396EmprCod = new String[] {""} ;
      P098H33_A199BarPie1 = new short[1] ;
      P098H33_A365DisDes = new String[] {""} ;
      P098H33_A898BarPieNDes = new int[1] ;
      P098H33_A758ProCod = new String[] {""} ;
      P098H41_A252CliCod = new int[1] ;
      P098H41_n252CliCod = new boolean[] {false} ;
      P098H41_A1652BarSerDsc = new String[] {""} ;
      P098H41_A213BarSit = new byte[1] ;
      P098H41_A153BarFasEst = new byte[1] ;
      P098H41_A460FasDsc = new String[] {""} ;
      P098H41_A457FasCod = new String[] {""} ;
      P098H41_A603MaqCodBis = new String[] {""} ;
      P098H41_A194BarOrdLin = new short[1] ;
      P098H41_A218BarTipCol = new byte[1] ;
      P098H41_A136BarColNum = new int[1] ;
      P098H41_A135BarColNom = new String[] {""} ;
      P098H41_A212BarSer = new String[] {""} ;
      P098H41_A13696BarNHdr = new String[] {""} ;
      P098H41_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H41_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H41_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H41_A279CliNom = new String[] {""} ;
      P098H41_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H41_n156BarFecCum = new boolean[] {false} ;
      P098H41_A151BarFasCod = new String[] {""} ;
      P098H41_n151BarFasCod = new boolean[] {false} ;
      P098H41_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H41_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H41_A129BarCod = new int[1] ;
      P098H41_A132BarCodReo = new byte[1] ;
      P098H41_A130BarCodPar = new String[] {""} ;
      P098H41_A143BarDisNum = new String[] {""} ;
      P098H41_A4812BarEncCli = new String[] {""} ;
      P098H41_A396EmprCod = new String[] {""} ;
      P098H41_A199BarPie1 = new short[1] ;
      P098H41_A365DisDes = new String[] {""} ;
      P098H41_A898BarPieNDes = new int[1] ;
      P098H41_A758ProCod = new String[] {""} ;
      P098H49_A252CliCod = new int[1] ;
      P098H49_n252CliCod = new boolean[] {false} ;
      P098H49_A135BarColNom = new String[] {""} ;
      P098H49_A213BarSit = new byte[1] ;
      P098H49_A153BarFasEst = new byte[1] ;
      P098H49_A460FasDsc = new String[] {""} ;
      P098H49_A457FasCod = new String[] {""} ;
      P098H49_A603MaqCodBis = new String[] {""} ;
      P098H49_A194BarOrdLin = new short[1] ;
      P098H49_A218BarTipCol = new byte[1] ;
      P098H49_A136BarColNum = new int[1] ;
      P098H49_A1652BarSerDsc = new String[] {""} ;
      P098H49_A212BarSer = new String[] {""} ;
      P098H49_A13696BarNHdr = new String[] {""} ;
      P098H49_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H49_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H49_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H49_A279CliNom = new String[] {""} ;
      P098H49_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H49_n156BarFecCum = new boolean[] {false} ;
      P098H49_A151BarFasCod = new String[] {""} ;
      P098H49_n151BarFasCod = new boolean[] {false} ;
      P098H49_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H49_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H49_A129BarCod = new int[1] ;
      P098H49_A132BarCodReo = new byte[1] ;
      P098H49_A130BarCodPar = new String[] {""} ;
      P098H49_A143BarDisNum = new String[] {""} ;
      P098H49_A4812BarEncCli = new String[] {""} ;
      P098H49_A396EmprCod = new String[] {""} ;
      P098H49_A199BarPie1 = new short[1] ;
      P098H49_A365DisDes = new String[] {""} ;
      P098H49_A898BarPieNDes = new int[1] ;
      P098H49_A758ProCod = new String[] {""} ;
      P098H57_A252CliCod = new int[1] ;
      P098H57_n252CliCod = new boolean[] {false} ;
      P098H57_A603MaqCodBis = new String[] {""} ;
      P098H57_A213BarSit = new byte[1] ;
      P098H57_A153BarFasEst = new byte[1] ;
      P098H57_A460FasDsc = new String[] {""} ;
      P098H57_A457FasCod = new String[] {""} ;
      P098H57_A194BarOrdLin = new short[1] ;
      P098H57_A218BarTipCol = new byte[1] ;
      P098H57_A136BarColNum = new int[1] ;
      P098H57_A135BarColNom = new String[] {""} ;
      P098H57_A1652BarSerDsc = new String[] {""} ;
      P098H57_A212BarSer = new String[] {""} ;
      P098H57_A13696BarNHdr = new String[] {""} ;
      P098H57_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H57_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H57_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H57_A279CliNom = new String[] {""} ;
      P098H57_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H57_n156BarFecCum = new boolean[] {false} ;
      P098H57_A151BarFasCod = new String[] {""} ;
      P098H57_n151BarFasCod = new boolean[] {false} ;
      P098H57_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H57_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H57_A129BarCod = new int[1] ;
      P098H57_A132BarCodReo = new byte[1] ;
      P098H57_A130BarCodPar = new String[] {""} ;
      P098H57_A143BarDisNum = new String[] {""} ;
      P098H57_A4812BarEncCli = new String[] {""} ;
      P098H57_A396EmprCod = new String[] {""} ;
      P098H57_A199BarPie1 = new short[1] ;
      P098H57_A365DisDes = new String[] {""} ;
      P098H57_A898BarPieNDes = new int[1] ;
      P098H57_A758ProCod = new String[] {""} ;
      P098H65_A252CliCod = new int[1] ;
      P098H65_n252CliCod = new boolean[] {false} ;
      P098H65_A457FasCod = new String[] {""} ;
      P098H65_A213BarSit = new byte[1] ;
      P098H65_A153BarFasEst = new byte[1] ;
      P098H65_A460FasDsc = new String[] {""} ;
      P098H65_A603MaqCodBis = new String[] {""} ;
      P098H65_A194BarOrdLin = new short[1] ;
      P098H65_A218BarTipCol = new byte[1] ;
      P098H65_A136BarColNum = new int[1] ;
      P098H65_A135BarColNom = new String[] {""} ;
      P098H65_A1652BarSerDsc = new String[] {""} ;
      P098H65_A212BarSer = new String[] {""} ;
      P098H65_A13696BarNHdr = new String[] {""} ;
      P098H65_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H65_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H65_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H65_A279CliNom = new String[] {""} ;
      P098H65_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H65_n156BarFecCum = new boolean[] {false} ;
      P098H65_A151BarFasCod = new String[] {""} ;
      P098H65_n151BarFasCod = new boolean[] {false} ;
      P098H65_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H65_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H65_A129BarCod = new int[1] ;
      P098H65_A132BarCodReo = new byte[1] ;
      P098H65_A130BarCodPar = new String[] {""} ;
      P098H65_A143BarDisNum = new String[] {""} ;
      P098H65_A4812BarEncCli = new String[] {""} ;
      P098H65_A396EmprCod = new String[] {""} ;
      P098H65_A199BarPie1 = new short[1] ;
      P098H65_A365DisDes = new String[] {""} ;
      P098H65_A898BarPieNDes = new int[1] ;
      P098H65_A758ProCod = new String[] {""} ;
      AV61OptionDesc = "" ;
      P098H73_A252CliCod = new int[1] ;
      P098H73_n252CliCod = new boolean[] {false} ;
      P098H73_A460FasDsc = new String[] {""} ;
      P098H73_A213BarSit = new byte[1] ;
      P098H73_A153BarFasEst = new byte[1] ;
      P098H73_A457FasCod = new String[] {""} ;
      P098H73_A603MaqCodBis = new String[] {""} ;
      P098H73_A194BarOrdLin = new short[1] ;
      P098H73_A218BarTipCol = new byte[1] ;
      P098H73_A136BarColNum = new int[1] ;
      P098H73_A135BarColNom = new String[] {""} ;
      P098H73_A1652BarSerDsc = new String[] {""} ;
      P098H73_A212BarSer = new String[] {""} ;
      P098H73_A13696BarNHdr = new String[] {""} ;
      P098H73_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H73_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H73_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H73_A279CliNom = new String[] {""} ;
      P098H73_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H73_n156BarFecCum = new boolean[] {false} ;
      P098H73_A151BarFasCod = new String[] {""} ;
      P098H73_n151BarFasCod = new boolean[] {false} ;
      P098H73_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H73_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H73_A129BarCod = new int[1] ;
      P098H73_A132BarCodReo = new byte[1] ;
      P098H73_A130BarCodPar = new String[] {""} ;
      P098H73_A143BarDisNum = new String[] {""} ;
      P098H73_A4812BarEncCli = new String[] {""} ;
      P098H73_A396EmprCod = new String[] {""} ;
      P098H73_A199BarPie1 = new short[1] ;
      P098H73_A365DisDes = new String[] {""} ;
      P098H73_A898BarPieNDes = new int[1] ;
      P098H73_A758ProCod = new String[] {""} ;
      P098H81_A252CliCod = new int[1] ;
      P098H81_n252CliCod = new boolean[] {false} ;
      P098H81_A213BarSit = new byte[1] ;
      P098H81_A153BarFasEst = new byte[1] ;
      P098H81_A460FasDsc = new String[] {""} ;
      P098H81_A457FasCod = new String[] {""} ;
      P098H81_A603MaqCodBis = new String[] {""} ;
      P098H81_A194BarOrdLin = new short[1] ;
      P098H81_A218BarTipCol = new byte[1] ;
      P098H81_A136BarColNum = new int[1] ;
      P098H81_A135BarColNom = new String[] {""} ;
      P098H81_A1652BarSerDsc = new String[] {""} ;
      P098H81_A212BarSer = new String[] {""} ;
      P098H81_A13696BarNHdr = new String[] {""} ;
      P098H81_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098H81_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098H81_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098H81_A279CliNom = new String[] {""} ;
      P098H81_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098H81_n156BarFecCum = new boolean[] {false} ;
      P098H81_A151BarFasCod = new String[] {""} ;
      P098H81_n151BarFasCod = new boolean[] {false} ;
      P098H81_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H81_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098H81_A129BarCod = new int[1] ;
      P098H81_A132BarCodReo = new byte[1] ;
      P098H81_A130BarCodPar = new String[] {""} ;
      P098H81_A143BarDisNum = new String[] {""} ;
      P098H81_A4812BarEncCli = new String[] {""} ;
      P098H81_A396EmprCod = new String[] {""} ;
      P098H81_A199BarPie1 = new short[1] ;
      P098H81_A365DisDes = new String[] {""} ;
      P098H81_A898BarPieNDes = new int[1] ;
      P098H81_A758ProCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cargasporsecciontradicional_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P098H9_A252CliCod, P098H9_n252CliCod, P098H9_A279CliNom, P098H9_A213BarSit, P098H9_A153BarFasEst, P098H9_A460FasDsc, P098H9_A457FasCod, P098H9_A603MaqCodBis, P098H9_A194BarOrdLin, P098H9_A218BarTipCol,
            P098H9_A136BarColNum, P098H9_A135BarColNom, P098H9_A1652BarSerDsc, P098H9_A212BarSer, P098H9_A13696BarNHdr, P098H9_A159BarFecGen, P098H9_A158BarFecFpr, P098H9_A155BarFecCli, P098H9_A156BarFecCum, P098H9_n156BarFecCum,
            P098H9_A151BarFasCod, P098H9_n151BarFasCod, P098H9_A166BarKgm, P098H9_A184BarMtr, P098H9_A129BarCod, P098H9_A132BarCodReo, P098H9_A130BarCodPar, P098H9_A143BarDisNum, P098H9_A4812BarEncCli, P098H9_A396EmprCod,
            P098H9_A199BarPie1, P098H9_A365DisDes, P098H9_A898BarPieNDes, P098H9_A758ProCod
            }
            , new Object[] {
            P098H17_A252CliCod, P098H17_n252CliCod, P098H17_A213BarSit, P098H17_A153BarFasEst, P098H17_A460FasDsc, P098H17_A457FasCod, P098H17_A603MaqCodBis, P098H17_A194BarOrdLin, P098H17_A218BarTipCol, P098H17_A136BarColNum,
            P098H17_A135BarColNom, P098H17_A1652BarSerDsc, P098H17_A212BarSer, P098H17_A13696BarNHdr, P098H17_A159BarFecGen, P098H17_A158BarFecFpr, P098H17_A155BarFecCli, P098H17_A279CliNom, P098H17_A156BarFecCum, P098H17_n156BarFecCum,
            P098H17_A151BarFasCod, P098H17_n151BarFasCod, P098H17_A166BarKgm, P098H17_A184BarMtr, P098H17_A129BarCod, P098H17_A132BarCodReo, P098H17_A130BarCodPar, P098H17_A143BarDisNum, P098H17_A4812BarEncCli, P098H17_A396EmprCod,
            P098H17_A199BarPie1, P098H17_A365DisDes, P098H17_A898BarPieNDes, P098H17_A758ProCod
            }
            , new Object[] {
            P098H25_A252CliCod, P098H25_n252CliCod, P098H25_A213BarSit, P098H25_A153BarFasEst, P098H25_A460FasDsc, P098H25_A457FasCod, P098H25_A603MaqCodBis, P098H25_A194BarOrdLin, P098H25_A218BarTipCol, P098H25_A136BarColNum,
            P098H25_A135BarColNom, P098H25_A1652BarSerDsc, P098H25_A212BarSer, P098H25_A13696BarNHdr, P098H25_A159BarFecGen, P098H25_A158BarFecFpr, P098H25_A155BarFecCli, P098H25_A279CliNom, P098H25_A156BarFecCum, P098H25_n156BarFecCum,
            P098H25_A151BarFasCod, P098H25_n151BarFasCod, P098H25_A166BarKgm, P098H25_A184BarMtr, P098H25_A129BarCod, P098H25_A132BarCodReo, P098H25_A130BarCodPar, P098H25_A143BarDisNum, P098H25_A4812BarEncCli, P098H25_A396EmprCod,
            P098H25_A199BarPie1, P098H25_A365DisDes, P098H25_A898BarPieNDes, P098H25_A758ProCod
            }
            , new Object[] {
            P098H33_A252CliCod, P098H33_n252CliCod, P098H33_A212BarSer, P098H33_A213BarSit, P098H33_A153BarFasEst, P098H33_A460FasDsc, P098H33_A457FasCod, P098H33_A603MaqCodBis, P098H33_A194BarOrdLin, P098H33_A218BarTipCol,
            P098H33_A136BarColNum, P098H33_A135BarColNom, P098H33_A1652BarSerDsc, P098H33_A13696BarNHdr, P098H33_A159BarFecGen, P098H33_A158BarFecFpr, P098H33_A155BarFecCli, P098H33_A279CliNom, P098H33_A156BarFecCum, P098H33_n156BarFecCum,
            P098H33_A151BarFasCod, P098H33_n151BarFasCod, P098H33_A166BarKgm, P098H33_A184BarMtr, P098H33_A129BarCod, P098H33_A132BarCodReo, P098H33_A130BarCodPar, P098H33_A143BarDisNum, P098H33_A4812BarEncCli, P098H33_A396EmprCod,
            P098H33_A199BarPie1, P098H33_A365DisDes, P098H33_A898BarPieNDes, P098H33_A758ProCod
            }
            , new Object[] {
            P098H41_A252CliCod, P098H41_n252CliCod, P098H41_A1652BarSerDsc, P098H41_A213BarSit, P098H41_A153BarFasEst, P098H41_A460FasDsc, P098H41_A457FasCod, P098H41_A603MaqCodBis, P098H41_A194BarOrdLin, P098H41_A218BarTipCol,
            P098H41_A136BarColNum, P098H41_A135BarColNom, P098H41_A212BarSer, P098H41_A13696BarNHdr, P098H41_A159BarFecGen, P098H41_A158BarFecFpr, P098H41_A155BarFecCli, P098H41_A279CliNom, P098H41_A156BarFecCum, P098H41_n156BarFecCum,
            P098H41_A151BarFasCod, P098H41_n151BarFasCod, P098H41_A166BarKgm, P098H41_A184BarMtr, P098H41_A129BarCod, P098H41_A132BarCodReo, P098H41_A130BarCodPar, P098H41_A143BarDisNum, P098H41_A4812BarEncCli, P098H41_A396EmprCod,
            P098H41_A199BarPie1, P098H41_A365DisDes, P098H41_A898BarPieNDes, P098H41_A758ProCod
            }
            , new Object[] {
            P098H49_A252CliCod, P098H49_n252CliCod, P098H49_A135BarColNom, P098H49_A213BarSit, P098H49_A153BarFasEst, P098H49_A460FasDsc, P098H49_A457FasCod, P098H49_A603MaqCodBis, P098H49_A194BarOrdLin, P098H49_A218BarTipCol,
            P098H49_A136BarColNum, P098H49_A1652BarSerDsc, P098H49_A212BarSer, P098H49_A13696BarNHdr, P098H49_A159BarFecGen, P098H49_A158BarFecFpr, P098H49_A155BarFecCli, P098H49_A279CliNom, P098H49_A156BarFecCum, P098H49_n156BarFecCum,
            P098H49_A151BarFasCod, P098H49_n151BarFasCod, P098H49_A166BarKgm, P098H49_A184BarMtr, P098H49_A129BarCod, P098H49_A132BarCodReo, P098H49_A130BarCodPar, P098H49_A143BarDisNum, P098H49_A4812BarEncCli, P098H49_A396EmprCod,
            P098H49_A199BarPie1, P098H49_A365DisDes, P098H49_A898BarPieNDes, P098H49_A758ProCod
            }
            , new Object[] {
            P098H57_A252CliCod, P098H57_n252CliCod, P098H57_A603MaqCodBis, P098H57_A213BarSit, P098H57_A153BarFasEst, P098H57_A460FasDsc, P098H57_A457FasCod, P098H57_A194BarOrdLin, P098H57_A218BarTipCol, P098H57_A136BarColNum,
            P098H57_A135BarColNom, P098H57_A1652BarSerDsc, P098H57_A212BarSer, P098H57_A13696BarNHdr, P098H57_A159BarFecGen, P098H57_A158BarFecFpr, P098H57_A155BarFecCli, P098H57_A279CliNom, P098H57_A156BarFecCum, P098H57_n156BarFecCum,
            P098H57_A151BarFasCod, P098H57_n151BarFasCod, P098H57_A166BarKgm, P098H57_A184BarMtr, P098H57_A129BarCod, P098H57_A132BarCodReo, P098H57_A130BarCodPar, P098H57_A143BarDisNum, P098H57_A4812BarEncCli, P098H57_A396EmprCod,
            P098H57_A199BarPie1, P098H57_A365DisDes, P098H57_A898BarPieNDes, P098H57_A758ProCod
            }
            , new Object[] {
            P098H65_A252CliCod, P098H65_n252CliCod, P098H65_A457FasCod, P098H65_A213BarSit, P098H65_A153BarFasEst, P098H65_A460FasDsc, P098H65_A603MaqCodBis, P098H65_A194BarOrdLin, P098H65_A218BarTipCol, P098H65_A136BarColNum,
            P098H65_A135BarColNom, P098H65_A1652BarSerDsc, P098H65_A212BarSer, P098H65_A13696BarNHdr, P098H65_A159BarFecGen, P098H65_A158BarFecFpr, P098H65_A155BarFecCli, P098H65_A279CliNom, P098H65_A156BarFecCum, P098H65_n156BarFecCum,
            P098H65_A151BarFasCod, P098H65_n151BarFasCod, P098H65_A166BarKgm, P098H65_A184BarMtr, P098H65_A129BarCod, P098H65_A132BarCodReo, P098H65_A130BarCodPar, P098H65_A143BarDisNum, P098H65_A4812BarEncCli, P098H65_A396EmprCod,
            P098H65_A199BarPie1, P098H65_A365DisDes, P098H65_A898BarPieNDes, P098H65_A758ProCod
            }
            , new Object[] {
            P098H73_A252CliCod, P098H73_n252CliCod, P098H73_A460FasDsc, P098H73_A213BarSit, P098H73_A153BarFasEst, P098H73_A457FasCod, P098H73_A603MaqCodBis, P098H73_A194BarOrdLin, P098H73_A218BarTipCol, P098H73_A136BarColNum,
            P098H73_A135BarColNom, P098H73_A1652BarSerDsc, P098H73_A212BarSer, P098H73_A13696BarNHdr, P098H73_A159BarFecGen, P098H73_A158BarFecFpr, P098H73_A155BarFecCli, P098H73_A279CliNom, P098H73_A156BarFecCum, P098H73_n156BarFecCum,
            P098H73_A151BarFasCod, P098H73_n151BarFasCod, P098H73_A166BarKgm, P098H73_A184BarMtr, P098H73_A129BarCod, P098H73_A132BarCodReo, P098H73_A130BarCodPar, P098H73_A143BarDisNum, P098H73_A4812BarEncCli, P098H73_A396EmprCod,
            P098H73_A199BarPie1, P098H73_A365DisDes, P098H73_A898BarPieNDes, P098H73_A758ProCod
            }
            , new Object[] {
            P098H81_A252CliCod, P098H81_n252CliCod, P098H81_A213BarSit, P098H81_A153BarFasEst, P098H81_A460FasDsc, P098H81_A457FasCod, P098H81_A603MaqCodBis, P098H81_A194BarOrdLin, P098H81_A218BarTipCol, P098H81_A136BarColNum,
            P098H81_A135BarColNom, P098H81_A1652BarSerDsc, P098H81_A212BarSer, P098H81_A13696BarNHdr, P098H81_A159BarFecGen, P098H81_A158BarFecFpr, P098H81_A155BarFecCli, P098H81_A279CliNom, P098H81_A156BarFecCum, P098H81_n156BarFecCum,
            P098H81_A151BarFasCod, P098H81_n151BarFasCod, P098H81_A166BarKgm, P098H81_A184BarMtr, P098H81_A129BarCod, P098H81_A132BarCodReo, P098H81_A130BarCodPar, P098H81_A143BarDisNum, P098H81_A4812BarEncCli, P098H81_A396EmprCod,
            P098H81_A199BarPie1, P098H81_A365DisDes, P098H81_A898BarPieNDes, P098H81_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30TFBarTipCol ;
   private byte AV31TFBarTipCol_To ;
   private byte AV52TFBarSit ;
   private byte AV53TFBarSit_To ;
   private byte AV78Barcodreo ;
   private byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ;
   private byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ;
   private byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ;
   private byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private short AV32TFBarOrdLin ;
   private short AV33TFBarOrdLin_To ;
   private short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ;
   private short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV83GXV1 ;
   private int AV28TFBarColNum ;
   private int AV29TFBarColNum_To ;
   private int AV46TFBarPie ;
   private int AV47TFBarPie_To ;
   private int AV77Barcod ;
   private int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ;
   private int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ;
   private int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ;
   private int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ;
   private int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ;
   private int AV80FasesColeccion_size ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int AV57InsertIndex ;
   private long AV66count ;
   private java.math.BigDecimal AV42TFBarMtr ;
   private java.math.BigDecimal AV43TFBarMtr_To ;
   private java.math.BigDecimal AV44TFBarKgm ;
   private java.math.BigDecimal AV45TFBarKgm_To ;
   private java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ;
   private java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ;
   private java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ;
   private java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV10TFCliNom ;
   private String AV11TFCliNom_Sel ;
   private String AV14TFPedidoCliente ;
   private String AV15TFPedidoCliente_Sel ;
   private String AV20TFBarNHdr ;
   private String AV21TFBarNHdr_Sel ;
   private String AV22TFBarSer ;
   private String AV23TFBarSer_Sel ;
   private String AV24TFBarSerDsc ;
   private String AV25TFBarSerDsc_Sel ;
   private String AV26TFBarColNom ;
   private String AV27TFBarColNom_Sel ;
   private String AV34TFMaqCodBis ;
   private String AV35TFMaqCodBis_Sel ;
   private String AV36TFFasCod ;
   private String AV37TFFasCod_Sel ;
   private String AV38TFFasDsc ;
   private String AV39TFFasDsc_Sel ;
   private String AV48TFBarFasCod ;
   private String AV49TFBarFasCod_Sel ;
   private String AV73Emprcod ;
   private String AV74MaqcodInout ;
   private String AV75TipoControl ;
   private String AV79Barcodpar ;
   private String A279CliNom ;
   private String AV86Cargasporsecciontradicional_wcds_2_tfclinom ;
   private String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ;
   private String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ;
   private String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ;
   private String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ;
   private String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ;
   private String AV95Cargasporsecciontradicional_wcds_11_tfbarser ;
   private String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ;
   private String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ;
   private String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ;
   private String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ;
   private String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ;
   private String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ;
   private String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ;
   private String AV109Cargasporsecciontradicional_wcds_25_tffascod ;
   private String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ;
   private String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ;
   private String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ;
   private String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ;
   private String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ;
   private String scmdbuf ;
   private String lV120Cargasporsecciontradicional_wcds_36_tfbarfascod ;
   private String lV74MaqcodInout ;
   private String lV86Cargasporsecciontradicional_wcds_2_tfclinom ;
   private String lV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ;
   private String lV95Cargasporsecciontradicional_wcds_11_tfbarser ;
   private String lV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ;
   private String lV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ;
   private String lV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ;
   private String lV109Cargasporsecciontradicional_wcds_25_tffascod ;
   private String lV111Cargasporsecciontradicional_wcds_27_tffasdsc ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A151BarFasCod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String A758ProCod ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV12TFBarFecCli ;
   private java.util.Date AV16TFBarFecFpr ;
   private java.util.Date AV18TFBarFecGen ;
   private java.util.Date AV50TFBarFecCum ;
   private java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ;
   private java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ;
   private java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ;
   private java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A156BarFecCum ;
   private boolean returnInSub ;
   private boolean brk98H2 ;
   private boolean n252CliCod ;
   private boolean n156BarFecCum ;
   private boolean n151BarFasCod ;
   private boolean brk98H6 ;
   private boolean brk98H8 ;
   private boolean brk98H10 ;
   private boolean brk98H12 ;
   private boolean brk98H14 ;
   private boolean brk98H16 ;
   private String AV60OptionsJson ;
   private String AV63OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV40TFBarFasEst_SelsJson ;
   private String AV56DDOName ;
   private String AV54SearchTxt ;
   private String AV55SearchTxtTo ;
   private String AV72FilterFullText ;
   private String AV76FasesToJson ;
   private String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ;
   private String lV85Cargasporsecciontradicional_wcds_1_filterfulltext ;
   private String AV58Option ;
   private String AV61OptionDesc ;
   private GXSimpleCollection<Byte> AV41TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private GXSimpleCollection<String> AV80FasesColeccion ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P098H9_A252CliCod ;
   private boolean[] P098H9_n252CliCod ;
   private String[] P098H9_A279CliNom ;
   private byte[] P098H9_A213BarSit ;
   private byte[] P098H9_A153BarFasEst ;
   private String[] P098H9_A460FasDsc ;
   private String[] P098H9_A457FasCod ;
   private String[] P098H9_A603MaqCodBis ;
   private short[] P098H9_A194BarOrdLin ;
   private byte[] P098H9_A218BarTipCol ;
   private int[] P098H9_A136BarColNum ;
   private String[] P098H9_A135BarColNom ;
   private String[] P098H9_A1652BarSerDsc ;
   private String[] P098H9_A212BarSer ;
   private String[] P098H9_A13696BarNHdr ;
   private java.util.Date[] P098H9_A159BarFecGen ;
   private java.util.Date[] P098H9_A158BarFecFpr ;
   private java.util.Date[] P098H9_A155BarFecCli ;
   private java.util.Date[] P098H9_A156BarFecCum ;
   private boolean[] P098H9_n156BarFecCum ;
   private String[] P098H9_A151BarFasCod ;
   private boolean[] P098H9_n151BarFasCod ;
   private java.math.BigDecimal[] P098H9_A166BarKgm ;
   private java.math.BigDecimal[] P098H9_A184BarMtr ;
   private int[] P098H9_A129BarCod ;
   private byte[] P098H9_A132BarCodReo ;
   private String[] P098H9_A130BarCodPar ;
   private String[] P098H9_A143BarDisNum ;
   private String[] P098H9_A4812BarEncCli ;
   private String[] P098H9_A396EmprCod ;
   private short[] P098H9_A199BarPie1 ;
   private String[] P098H9_A365DisDes ;
   private int[] P098H9_A898BarPieNDes ;
   private String[] P098H9_A758ProCod ;
   private int[] P098H17_A252CliCod ;
   private boolean[] P098H17_n252CliCod ;
   private byte[] P098H17_A213BarSit ;
   private byte[] P098H17_A153BarFasEst ;
   private String[] P098H17_A460FasDsc ;
   private String[] P098H17_A457FasCod ;
   private String[] P098H17_A603MaqCodBis ;
   private short[] P098H17_A194BarOrdLin ;
   private byte[] P098H17_A218BarTipCol ;
   private int[] P098H17_A136BarColNum ;
   private String[] P098H17_A135BarColNom ;
   private String[] P098H17_A1652BarSerDsc ;
   private String[] P098H17_A212BarSer ;
   private String[] P098H17_A13696BarNHdr ;
   private java.util.Date[] P098H17_A159BarFecGen ;
   private java.util.Date[] P098H17_A158BarFecFpr ;
   private java.util.Date[] P098H17_A155BarFecCli ;
   private String[] P098H17_A279CliNom ;
   private java.util.Date[] P098H17_A156BarFecCum ;
   private boolean[] P098H17_n156BarFecCum ;
   private String[] P098H17_A151BarFasCod ;
   private boolean[] P098H17_n151BarFasCod ;
   private java.math.BigDecimal[] P098H17_A166BarKgm ;
   private java.math.BigDecimal[] P098H17_A184BarMtr ;
   private int[] P098H17_A129BarCod ;
   private byte[] P098H17_A132BarCodReo ;
   private String[] P098H17_A130BarCodPar ;
   private String[] P098H17_A143BarDisNum ;
   private String[] P098H17_A4812BarEncCli ;
   private String[] P098H17_A396EmprCod ;
   private short[] P098H17_A199BarPie1 ;
   private String[] P098H17_A365DisDes ;
   private int[] P098H17_A898BarPieNDes ;
   private String[] P098H17_A758ProCod ;
   private int[] P098H25_A252CliCod ;
   private boolean[] P098H25_n252CliCod ;
   private byte[] P098H25_A213BarSit ;
   private byte[] P098H25_A153BarFasEst ;
   private String[] P098H25_A460FasDsc ;
   private String[] P098H25_A457FasCod ;
   private String[] P098H25_A603MaqCodBis ;
   private short[] P098H25_A194BarOrdLin ;
   private byte[] P098H25_A218BarTipCol ;
   private int[] P098H25_A136BarColNum ;
   private String[] P098H25_A135BarColNom ;
   private String[] P098H25_A1652BarSerDsc ;
   private String[] P098H25_A212BarSer ;
   private String[] P098H25_A13696BarNHdr ;
   private java.util.Date[] P098H25_A159BarFecGen ;
   private java.util.Date[] P098H25_A158BarFecFpr ;
   private java.util.Date[] P098H25_A155BarFecCli ;
   private String[] P098H25_A279CliNom ;
   private java.util.Date[] P098H25_A156BarFecCum ;
   private boolean[] P098H25_n156BarFecCum ;
   private String[] P098H25_A151BarFasCod ;
   private boolean[] P098H25_n151BarFasCod ;
   private java.math.BigDecimal[] P098H25_A166BarKgm ;
   private java.math.BigDecimal[] P098H25_A184BarMtr ;
   private int[] P098H25_A129BarCod ;
   private byte[] P098H25_A132BarCodReo ;
   private String[] P098H25_A130BarCodPar ;
   private String[] P098H25_A143BarDisNum ;
   private String[] P098H25_A4812BarEncCli ;
   private String[] P098H25_A396EmprCod ;
   private short[] P098H25_A199BarPie1 ;
   private String[] P098H25_A365DisDes ;
   private int[] P098H25_A898BarPieNDes ;
   private String[] P098H25_A758ProCod ;
   private int[] P098H33_A252CliCod ;
   private boolean[] P098H33_n252CliCod ;
   private String[] P098H33_A212BarSer ;
   private byte[] P098H33_A213BarSit ;
   private byte[] P098H33_A153BarFasEst ;
   private String[] P098H33_A460FasDsc ;
   private String[] P098H33_A457FasCod ;
   private String[] P098H33_A603MaqCodBis ;
   private short[] P098H33_A194BarOrdLin ;
   private byte[] P098H33_A218BarTipCol ;
   private int[] P098H33_A136BarColNum ;
   private String[] P098H33_A135BarColNom ;
   private String[] P098H33_A1652BarSerDsc ;
   private String[] P098H33_A13696BarNHdr ;
   private java.util.Date[] P098H33_A159BarFecGen ;
   private java.util.Date[] P098H33_A158BarFecFpr ;
   private java.util.Date[] P098H33_A155BarFecCli ;
   private String[] P098H33_A279CliNom ;
   private java.util.Date[] P098H33_A156BarFecCum ;
   private boolean[] P098H33_n156BarFecCum ;
   private String[] P098H33_A151BarFasCod ;
   private boolean[] P098H33_n151BarFasCod ;
   private java.math.BigDecimal[] P098H33_A166BarKgm ;
   private java.math.BigDecimal[] P098H33_A184BarMtr ;
   private int[] P098H33_A129BarCod ;
   private byte[] P098H33_A132BarCodReo ;
   private String[] P098H33_A130BarCodPar ;
   private String[] P098H33_A143BarDisNum ;
   private String[] P098H33_A4812BarEncCli ;
   private String[] P098H33_A396EmprCod ;
   private short[] P098H33_A199BarPie1 ;
   private String[] P098H33_A365DisDes ;
   private int[] P098H33_A898BarPieNDes ;
   private String[] P098H33_A758ProCod ;
   private int[] P098H41_A252CliCod ;
   private boolean[] P098H41_n252CliCod ;
   private String[] P098H41_A1652BarSerDsc ;
   private byte[] P098H41_A213BarSit ;
   private byte[] P098H41_A153BarFasEst ;
   private String[] P098H41_A460FasDsc ;
   private String[] P098H41_A457FasCod ;
   private String[] P098H41_A603MaqCodBis ;
   private short[] P098H41_A194BarOrdLin ;
   private byte[] P098H41_A218BarTipCol ;
   private int[] P098H41_A136BarColNum ;
   private String[] P098H41_A135BarColNom ;
   private String[] P098H41_A212BarSer ;
   private String[] P098H41_A13696BarNHdr ;
   private java.util.Date[] P098H41_A159BarFecGen ;
   private java.util.Date[] P098H41_A158BarFecFpr ;
   private java.util.Date[] P098H41_A155BarFecCli ;
   private String[] P098H41_A279CliNom ;
   private java.util.Date[] P098H41_A156BarFecCum ;
   private boolean[] P098H41_n156BarFecCum ;
   private String[] P098H41_A151BarFasCod ;
   private boolean[] P098H41_n151BarFasCod ;
   private java.math.BigDecimal[] P098H41_A166BarKgm ;
   private java.math.BigDecimal[] P098H41_A184BarMtr ;
   private int[] P098H41_A129BarCod ;
   private byte[] P098H41_A132BarCodReo ;
   private String[] P098H41_A130BarCodPar ;
   private String[] P098H41_A143BarDisNum ;
   private String[] P098H41_A4812BarEncCli ;
   private String[] P098H41_A396EmprCod ;
   private short[] P098H41_A199BarPie1 ;
   private String[] P098H41_A365DisDes ;
   private int[] P098H41_A898BarPieNDes ;
   private String[] P098H41_A758ProCod ;
   private int[] P098H49_A252CliCod ;
   private boolean[] P098H49_n252CliCod ;
   private String[] P098H49_A135BarColNom ;
   private byte[] P098H49_A213BarSit ;
   private byte[] P098H49_A153BarFasEst ;
   private String[] P098H49_A460FasDsc ;
   private String[] P098H49_A457FasCod ;
   private String[] P098H49_A603MaqCodBis ;
   private short[] P098H49_A194BarOrdLin ;
   private byte[] P098H49_A218BarTipCol ;
   private int[] P098H49_A136BarColNum ;
   private String[] P098H49_A1652BarSerDsc ;
   private String[] P098H49_A212BarSer ;
   private String[] P098H49_A13696BarNHdr ;
   private java.util.Date[] P098H49_A159BarFecGen ;
   private java.util.Date[] P098H49_A158BarFecFpr ;
   private java.util.Date[] P098H49_A155BarFecCli ;
   private String[] P098H49_A279CliNom ;
   private java.util.Date[] P098H49_A156BarFecCum ;
   private boolean[] P098H49_n156BarFecCum ;
   private String[] P098H49_A151BarFasCod ;
   private boolean[] P098H49_n151BarFasCod ;
   private java.math.BigDecimal[] P098H49_A166BarKgm ;
   private java.math.BigDecimal[] P098H49_A184BarMtr ;
   private int[] P098H49_A129BarCod ;
   private byte[] P098H49_A132BarCodReo ;
   private String[] P098H49_A130BarCodPar ;
   private String[] P098H49_A143BarDisNum ;
   private String[] P098H49_A4812BarEncCli ;
   private String[] P098H49_A396EmprCod ;
   private short[] P098H49_A199BarPie1 ;
   private String[] P098H49_A365DisDes ;
   private int[] P098H49_A898BarPieNDes ;
   private String[] P098H49_A758ProCod ;
   private int[] P098H57_A252CliCod ;
   private boolean[] P098H57_n252CliCod ;
   private String[] P098H57_A603MaqCodBis ;
   private byte[] P098H57_A213BarSit ;
   private byte[] P098H57_A153BarFasEst ;
   private String[] P098H57_A460FasDsc ;
   private String[] P098H57_A457FasCod ;
   private short[] P098H57_A194BarOrdLin ;
   private byte[] P098H57_A218BarTipCol ;
   private int[] P098H57_A136BarColNum ;
   private String[] P098H57_A135BarColNom ;
   private String[] P098H57_A1652BarSerDsc ;
   private String[] P098H57_A212BarSer ;
   private String[] P098H57_A13696BarNHdr ;
   private java.util.Date[] P098H57_A159BarFecGen ;
   private java.util.Date[] P098H57_A158BarFecFpr ;
   private java.util.Date[] P098H57_A155BarFecCli ;
   private String[] P098H57_A279CliNom ;
   private java.util.Date[] P098H57_A156BarFecCum ;
   private boolean[] P098H57_n156BarFecCum ;
   private String[] P098H57_A151BarFasCod ;
   private boolean[] P098H57_n151BarFasCod ;
   private java.math.BigDecimal[] P098H57_A166BarKgm ;
   private java.math.BigDecimal[] P098H57_A184BarMtr ;
   private int[] P098H57_A129BarCod ;
   private byte[] P098H57_A132BarCodReo ;
   private String[] P098H57_A130BarCodPar ;
   private String[] P098H57_A143BarDisNum ;
   private String[] P098H57_A4812BarEncCli ;
   private String[] P098H57_A396EmprCod ;
   private short[] P098H57_A199BarPie1 ;
   private String[] P098H57_A365DisDes ;
   private int[] P098H57_A898BarPieNDes ;
   private String[] P098H57_A758ProCod ;
   private int[] P098H65_A252CliCod ;
   private boolean[] P098H65_n252CliCod ;
   private String[] P098H65_A457FasCod ;
   private byte[] P098H65_A213BarSit ;
   private byte[] P098H65_A153BarFasEst ;
   private String[] P098H65_A460FasDsc ;
   private String[] P098H65_A603MaqCodBis ;
   private short[] P098H65_A194BarOrdLin ;
   private byte[] P098H65_A218BarTipCol ;
   private int[] P098H65_A136BarColNum ;
   private String[] P098H65_A135BarColNom ;
   private String[] P098H65_A1652BarSerDsc ;
   private String[] P098H65_A212BarSer ;
   private String[] P098H65_A13696BarNHdr ;
   private java.util.Date[] P098H65_A159BarFecGen ;
   private java.util.Date[] P098H65_A158BarFecFpr ;
   private java.util.Date[] P098H65_A155BarFecCli ;
   private String[] P098H65_A279CliNom ;
   private java.util.Date[] P098H65_A156BarFecCum ;
   private boolean[] P098H65_n156BarFecCum ;
   private String[] P098H65_A151BarFasCod ;
   private boolean[] P098H65_n151BarFasCod ;
   private java.math.BigDecimal[] P098H65_A166BarKgm ;
   private java.math.BigDecimal[] P098H65_A184BarMtr ;
   private int[] P098H65_A129BarCod ;
   private byte[] P098H65_A132BarCodReo ;
   private String[] P098H65_A130BarCodPar ;
   private String[] P098H65_A143BarDisNum ;
   private String[] P098H65_A4812BarEncCli ;
   private String[] P098H65_A396EmprCod ;
   private short[] P098H65_A199BarPie1 ;
   private String[] P098H65_A365DisDes ;
   private int[] P098H65_A898BarPieNDes ;
   private String[] P098H65_A758ProCod ;
   private int[] P098H73_A252CliCod ;
   private boolean[] P098H73_n252CliCod ;
   private String[] P098H73_A460FasDsc ;
   private byte[] P098H73_A213BarSit ;
   private byte[] P098H73_A153BarFasEst ;
   private String[] P098H73_A457FasCod ;
   private String[] P098H73_A603MaqCodBis ;
   private short[] P098H73_A194BarOrdLin ;
   private byte[] P098H73_A218BarTipCol ;
   private int[] P098H73_A136BarColNum ;
   private String[] P098H73_A135BarColNom ;
   private String[] P098H73_A1652BarSerDsc ;
   private String[] P098H73_A212BarSer ;
   private String[] P098H73_A13696BarNHdr ;
   private java.util.Date[] P098H73_A159BarFecGen ;
   private java.util.Date[] P098H73_A158BarFecFpr ;
   private java.util.Date[] P098H73_A155BarFecCli ;
   private String[] P098H73_A279CliNom ;
   private java.util.Date[] P098H73_A156BarFecCum ;
   private boolean[] P098H73_n156BarFecCum ;
   private String[] P098H73_A151BarFasCod ;
   private boolean[] P098H73_n151BarFasCod ;
   private java.math.BigDecimal[] P098H73_A166BarKgm ;
   private java.math.BigDecimal[] P098H73_A184BarMtr ;
   private int[] P098H73_A129BarCod ;
   private byte[] P098H73_A132BarCodReo ;
   private String[] P098H73_A130BarCodPar ;
   private String[] P098H73_A143BarDisNum ;
   private String[] P098H73_A4812BarEncCli ;
   private String[] P098H73_A396EmprCod ;
   private short[] P098H73_A199BarPie1 ;
   private String[] P098H73_A365DisDes ;
   private int[] P098H73_A898BarPieNDes ;
   private String[] P098H73_A758ProCod ;
   private int[] P098H81_A252CliCod ;
   private boolean[] P098H81_n252CliCod ;
   private byte[] P098H81_A213BarSit ;
   private byte[] P098H81_A153BarFasEst ;
   private String[] P098H81_A460FasDsc ;
   private String[] P098H81_A457FasCod ;
   private String[] P098H81_A603MaqCodBis ;
   private short[] P098H81_A194BarOrdLin ;
   private byte[] P098H81_A218BarTipCol ;
   private int[] P098H81_A136BarColNum ;
   private String[] P098H81_A135BarColNom ;
   private String[] P098H81_A1652BarSerDsc ;
   private String[] P098H81_A212BarSer ;
   private String[] P098H81_A13696BarNHdr ;
   private java.util.Date[] P098H81_A159BarFecGen ;
   private java.util.Date[] P098H81_A158BarFecFpr ;
   private java.util.Date[] P098H81_A155BarFecCli ;
   private String[] P098H81_A279CliNom ;
   private java.util.Date[] P098H81_A156BarFecCum ;
   private boolean[] P098H81_n156BarFecCum ;
   private String[] P098H81_A151BarFasCod ;
   private boolean[] P098H81_n151BarFasCod ;
   private java.math.BigDecimal[] P098H81_A166BarKgm ;
   private java.math.BigDecimal[] P098H81_A184BarMtr ;
   private int[] P098H81_A129BarCod ;
   private byte[] P098H81_A132BarCodReo ;
   private String[] P098H81_A130BarCodPar ;
   private String[] P098H81_A143BarDisNum ;
   private String[] P098H81_A4812BarEncCli ;
   private String[] P098H81_A396EmprCod ;
   private short[] P098H81_A199BarPie1 ;
   private String[] P098H81_A365DisDes ;
   private int[] P098H81_A898BarPieNDes ;
   private String[] P098H81_A758ProCod ;
   private GXSimpleCollection<String> AV59Options ;
   private GXSimpleCollection<String> AV62OptionsDesc ;
   private GXSimpleCollection<String> AV64OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class cargasporsecciontradicional_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P098H9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A457FasCod ,
                                          GXSimpleCollection<String> AV80FasesColeccion ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                          String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                          String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                          java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                          java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                          java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                          String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                          String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                          String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                          String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                          String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                          String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                          String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                          String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                          int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                          int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                          byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                          byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                          short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                          short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                          String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                          String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                          String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                          String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                          String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                          String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                          int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                          java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                          java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                          java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                          byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                          byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                          String A279CliNom ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A159BarFecGen ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.math.BigDecimal A166BarKgm ,
                                          byte A213BarSit ,
                                          String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                          String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                          int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                          int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                          String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                          String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                          java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          String AV74MaqcodInout ,
                                          int AV80FasesColeccion_size ,
                                          int AV77Barcod ,
                                          byte AV78Barcodreo ,
                                          String AV79Barcodpar ,
                                          String A396EmprCod ,
                                          String AV73Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[47];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T4.CliNom, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr," ;
      scmdbuf += " T3.BarFecCli, COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm," ;
      scmdbuf += " COALESCE( T7.BarMtr, 0) AS BarMtr, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes," ;
      scmdbuf += " COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER" ;
      scmdbuf += " JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON" ;
      scmdbuf += " T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND" ;
      scmdbuf += " T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod," ;
      scmdbuf += " T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod," ;
      scmdbuf += " '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int7[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int7[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int7[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int7[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int7[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int7[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int7[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int7[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int7[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int7[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int7[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int7[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int7[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int7[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int7[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int7[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int7[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int7[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int7[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P098H17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String AV73Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[47];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P098H25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String AV73Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[47];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int13[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int13[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int13[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int13[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int13[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int13[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int13[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P098H33( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String A396EmprCod ,
                                           String AV73Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[47];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSer, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSer" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P098H41( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String A396EmprCod ,
                                           String AV73Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[47];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSerDsc, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int19[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int19[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int19[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int19[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int19[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int19[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int19[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSerDsc" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P098H49( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String A396EmprCod ,
                                           String AV73Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[47];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarColNom, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int22[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int22[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int22[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int22[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int22[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarColNom" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P098H57( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String AV73Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[47];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T1.MaqCodBis, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCodBis" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_P098H65( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String AV73Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[47];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T1.FasCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int28[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int28[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int28[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int28[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int28[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int28[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int28[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int28[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_P098H73( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String A396EmprCod ,
                                           String AV73Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[47];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T2.FasDsc, T3.BarSit, T1.BarFasEst, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int31[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_P098H81( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV80FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                           String AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                           String AV86Cargasporsecciontradicional_wcds_2_tfclinom ,
                                           java.util.Date AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                           java.util.Date AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                           java.util.Date AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                           String AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                           String AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                           String AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                           String AV95Cargasporsecciontradicional_wcds_11_tfbarser ,
                                           String AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                           String AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                           String AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                           String AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                           int AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                           int AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                           byte AV103Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                           byte AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                           short AV105Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                           short AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                           String AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                           String AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                           String AV110Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                           String AV109Cargasporsecciontradicional_wcds_25_tffascod ,
                                           String AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                           String AV111Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                           int AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV114Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                           java.math.BigDecimal AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                           java.math.BigDecimal AV116Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                           java.math.BigDecimal AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                           byte AV123Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                           byte AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                           String A279CliNom ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A159BarFecGen ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           short A194BarOrdLin ,
                                           String A603MaqCodBis ,
                                           String A460FasDsc ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.math.BigDecimal A166BarKgm ,
                                           byte A213BarSit ,
                                           String AV85Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV90Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                           String AV89Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                           int AV118Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                           int AV119Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                           String AV121Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                           String AV120Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                           java.util.Date AV122Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV74MaqcodInout ,
                                           int AV80FasesColeccion_size ,
                                           int AV77Barcod ,
                                           byte AV78Barcodreo ,
                                           String AV79Barcodpar ,
                                           String AV73Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[47];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes," ;
      scmdbuf += " T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar)" ;
      scmdbuf += " WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo" ;
      scmdbuf += " = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod," ;
      scmdbuf += " T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod," ;
      scmdbuf += " T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV93Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV95Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (0==AV103Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! (0==AV104Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! (0==AV105Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (0==AV106Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV107Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int34[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int34[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int34[40] = (byte)(1) ;
      }
      if ( AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int34[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int34[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int34[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int34[44] = (byte)(1) ;
      }
      if ( ! (0==AV123Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int34[45] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int34[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
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
                  return conditional_P098H9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 1 :
                  return conditional_P098H17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 2 :
                  return conditional_P098H25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 3 :
                  return conditional_P098H33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 4 :
                  return conditional_P098H41(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 5 :
                  return conditional_P098H49(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 6 :
                  return conditional_P098H57(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 7 :
                  return conditional_P098H65(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 8 :
                  return conditional_P098H73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
            case 9 :
                  return conditional_P098H81(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.util.Date)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098H9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H41", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H49", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H57", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H65", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098H81", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 11);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((String[]) buf[28])[0] = rslt.getString(26, 20);
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
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
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
      }
   }

}

