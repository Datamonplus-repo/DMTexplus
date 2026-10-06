package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasporseccion_wcgetfilterdata extends GXProcedure
{
   public cargasporseccion_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasporseccion_wcgetfilterdata.class ), "" );
   }

   public cargasporseccion_wcgetfilterdata( int remoteHandle ,
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
      cargasporseccion_wcgetfilterdata.this.aP5 = new String[] {""};
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
      cargasporseccion_wcgetfilterdata.this.AV84DDOName = aP0;
      cargasporseccion_wcgetfilterdata.this.AV82SearchTxt = aP1;
      cargasporseccion_wcgetfilterdata.this.AV83SearchTxtTo = aP2;
      cargasporseccion_wcgetfilterdata.this.aP3 = aP3;
      cargasporseccion_wcgetfilterdata.this.aP4 = aP4;
      cargasporseccion_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV87Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV90OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV92OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_PEDIDOCLIENTE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_MAQCODBIS") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_FASCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_FASDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV84DDOName), "DDO_BARFASCOD") == 0 )
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
      AV88OptionsJson = AV87Options.toJSonString(false) ;
      AV91OptionsDescJson = AV90OptionsDesc.toJSonString(false) ;
      AV93OptionIndexesJson = AV92OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV95Session.getValue("CargasporSeccion_WCGridState"), "") == 0 )
      {
         AV97GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CargasporSeccion_WCGridState"), null, null);
      }
      else
      {
         AV97GridState.fromxml(AV95Session.getValue("CargasporSeccion_WCGridState"), null, null);
      }
      AV152GXV1 = 1 ;
      while ( AV152GXV1 <= AV97GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV98GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV97GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV152GXV1));
         if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV100FilterFullText = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV104TFCliNom = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV105TFCliNom_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV106TFBarFecCli = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV107TFBarFecCli_To = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV108TFPedidoCliente = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV109TFPedidoCliente_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV110TFBarFecFpr = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV111TFBarFecFpr_To = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV112TFBarFecGen = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV113TFBarFecGen_To = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV114TFBarNHdr = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV115TFBarNHdr_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV116TFBarSer = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV117TFBarSer_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV118TFBarSerDsc = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV119TFBarSerDsc_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV120TFBarColNom = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV121TFBarColNom_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV122TFBarColNum = (int)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV123TFBarColNum_To = (int)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV124TFBarTipCol = (byte)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV125TFBarTipCol_To = (byte)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV20TFBarOrdLin = (short)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarOrdLin_To = (short)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV34TFMaqCodBis = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV35TFMaqCodBis_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV22TFFasCod = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV23TFFasCod_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV126TFFasDsc = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV127TFFasDsc_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV128TFBarFasEst_SelsJson = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV129TFBarFasEst_Sels.fromJSonString(AV128TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV130TFBarMtr = CommonUtil.decimalVal( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV131TFBarMtr_To = CommonUtil.decimalVal( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV132TFBarkgm = CommonUtil.decimalVal( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV133TFBarkgm_To = CommonUtil.decimalVal( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV134TFBarPie = (int)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV135TFBarPie_To = (int)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV136TFBarFasCod = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV137TFBarFasCod_Sel = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV138TFBarFecCum = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV139TFBarFecCum_To = localUtil.ctod( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV140TFBarSit = (byte)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV141TFBarSit_To = (byte)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV101Emprcod = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODINOUT") == 0 )
         {
            AV102MaqcodInout = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPOCONTROL") == 0 )
         {
            AV149TipoControl = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASESTOJSON") == 0 )
         {
            AV148FasesToJson = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV144Barcod = (int)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV145Barcodreo = (byte)(GXutil.lval( AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV146Barcodpar = AV98GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV152GXV1 = (int)(AV152GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV104TFCliNom = AV82SearchTxt ;
      AV105TFCliNom_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           A396EmprCod ,
                                           AV101Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B9 */
      pr_default.execute(0, new Object[] {AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, AV101Emprcod, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk98B2 = false ;
         A252CliCod = P098B9_A252CliCod[0] ;
         n252CliCod = P098B9_n252CliCod[0] ;
         A279CliNom = P098B9_A279CliNom[0] ;
         A213BarSit = P098B9_A213BarSit[0] ;
         A153BarFasEst = P098B9_A153BarFasEst[0] ;
         A460FasDsc = P098B9_A460FasDsc[0] ;
         A457FasCod = P098B9_A457FasCod[0] ;
         A603MaqCodBis = P098B9_A603MaqCodBis[0] ;
         A218BarTipCol = P098B9_A218BarTipCol[0] ;
         A136BarColNum = P098B9_A136BarColNum[0] ;
         A135BarColNom = P098B9_A135BarColNom[0] ;
         A1652BarSerDsc = P098B9_A1652BarSerDsc[0] ;
         A212BarSer = P098B9_A212BarSer[0] ;
         A13696BarNHdr = P098B9_A13696BarNHdr[0] ;
         A159BarFecGen = P098B9_A159BarFecGen[0] ;
         A158BarFecFpr = P098B9_A158BarFecFpr[0] ;
         A155BarFecCli = P098B9_A155BarFecCli[0] ;
         A156BarFecCum = P098B9_A156BarFecCum[0] ;
         n156BarFecCum = P098B9_n156BarFecCum[0] ;
         A151BarFasCod = P098B9_A151BarFasCod[0] ;
         n151BarFasCod = P098B9_n151BarFasCod[0] ;
         A166BarKgm = P098B9_A166BarKgm[0] ;
         A184BarMtr = P098B9_A184BarMtr[0] ;
         A143BarDisNum = P098B9_A143BarDisNum[0] ;
         A4812BarEncCli = P098B9_A4812BarEncCli[0] ;
         A199BarPie1 = P098B9_A199BarPie1[0] ;
         A365DisDes = P098B9_A365DisDes[0] ;
         A898BarPieNDes = P098B9_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B9_A194BarOrdLin[0] ;
         A130BarCodPar = P098B9_A130BarCodPar[0] ;
         A132BarCodReo = P098B9_A132BarCodReo[0] ;
         A129BarCod = P098B9_A129BarCod[0] ;
         A396EmprCod = P098B9_A396EmprCod[0] ;
         A758ProCod = P098B9_A758ProCod[0] ;
         A460FasDsc = P098B9_A460FasDsc[0] ;
         A252CliCod = P098B9_A252CliCod[0] ;
         n252CliCod = P098B9_n252CliCod[0] ;
         A213BarSit = P098B9_A213BarSit[0] ;
         A218BarTipCol = P098B9_A218BarTipCol[0] ;
         A136BarColNum = P098B9_A136BarColNum[0] ;
         A135BarColNom = P098B9_A135BarColNom[0] ;
         A1652BarSerDsc = P098B9_A1652BarSerDsc[0] ;
         A212BarSer = P098B9_A212BarSer[0] ;
         A13696BarNHdr = P098B9_A13696BarNHdr[0] ;
         A159BarFecGen = P098B9_A159BarFecGen[0] ;
         A158BarFecFpr = P098B9_A158BarFecFpr[0] ;
         A155BarFecCli = P098B9_A155BarFecCli[0] ;
         A143BarDisNum = P098B9_A143BarDisNum[0] ;
         A4812BarEncCli = P098B9_A4812BarEncCli[0] ;
         A365DisDes = P098B9_A365DisDes[0] ;
         A279CliNom = P098B9_A279CliNom[0] ;
         A156BarFecCum = P098B9_A156BarFecCum[0] ;
         n156BarFecCum = P098B9_n156BarFecCum[0] ;
         A151BarFasCod = P098B9_A151BarFasCod[0] ;
         n151BarFasCod = P098B9_n151BarFasCod[0] ;
         A166BarKgm = P098B9_A166BarKgm[0] ;
         A184BarMtr = P098B9_A184BarMtr[0] ;
         A199BarPie1 = P098B9_A199BarPie1[0] ;
         A898BarPieNDes = P098B9_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int10[0] = A194BarOrdLin ;
               GXv_int11[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int10, GXv_int11) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int10[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int11[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P098B9_A279CliNom[0], A279CliNom) == 0 ) )
                           {
                              brk98B2 = false ;
                              A252CliCod = P098B9_A252CliCod[0] ;
                              n252CliCod = P098B9_n252CliCod[0] ;
                              A194BarOrdLin = P098B9_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B9_A130BarCodPar[0] ;
                              A132BarCodReo = P098B9_A132BarCodReo[0] ;
                              A129BarCod = P098B9_A129BarCod[0] ;
                              A396EmprCod = P098B9_A396EmprCod[0] ;
                              A758ProCod = P098B9_A758ProCod[0] ;
                              A252CliCod = P098B9_A252CliCod[0] ;
                              n252CliCod = P098B9_n252CliCod[0] ;
                              AV94count = (long)(AV94count+1) ;
                              brk98B2 = true ;
                              pr_default.readNext(0);
                           }
                           if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                           {
                              AV86Option = A279CliNom ;
                              AV87Options.add(AV86Option, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B2 )
         {
            brk98B2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV108TFPedidoCliente = AV82SearchTxt ;
      AV109TFPedidoCliente_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           AV101Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B17 */
      pr_default.execute(1, new Object[] {AV101Emprcod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P098B17_A252CliCod[0] ;
         n252CliCod = P098B17_n252CliCod[0] ;
         A213BarSit = P098B17_A213BarSit[0] ;
         A153BarFasEst = P098B17_A153BarFasEst[0] ;
         A460FasDsc = P098B17_A460FasDsc[0] ;
         A457FasCod = P098B17_A457FasCod[0] ;
         A603MaqCodBis = P098B17_A603MaqCodBis[0] ;
         A218BarTipCol = P098B17_A218BarTipCol[0] ;
         A136BarColNum = P098B17_A136BarColNum[0] ;
         A135BarColNom = P098B17_A135BarColNom[0] ;
         A1652BarSerDsc = P098B17_A1652BarSerDsc[0] ;
         A212BarSer = P098B17_A212BarSer[0] ;
         A13696BarNHdr = P098B17_A13696BarNHdr[0] ;
         A159BarFecGen = P098B17_A159BarFecGen[0] ;
         A158BarFecFpr = P098B17_A158BarFecFpr[0] ;
         A155BarFecCli = P098B17_A155BarFecCli[0] ;
         A279CliNom = P098B17_A279CliNom[0] ;
         A156BarFecCum = P098B17_A156BarFecCum[0] ;
         n156BarFecCum = P098B17_n156BarFecCum[0] ;
         A151BarFasCod = P098B17_A151BarFasCod[0] ;
         n151BarFasCod = P098B17_n151BarFasCod[0] ;
         A166BarKgm = P098B17_A166BarKgm[0] ;
         A184BarMtr = P098B17_A184BarMtr[0] ;
         A143BarDisNum = P098B17_A143BarDisNum[0] ;
         A4812BarEncCli = P098B17_A4812BarEncCli[0] ;
         A199BarPie1 = P098B17_A199BarPie1[0] ;
         A365DisDes = P098B17_A365DisDes[0] ;
         A898BarPieNDes = P098B17_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B17_A194BarOrdLin[0] ;
         A130BarCodPar = P098B17_A130BarCodPar[0] ;
         A132BarCodReo = P098B17_A132BarCodReo[0] ;
         A129BarCod = P098B17_A129BarCod[0] ;
         A396EmprCod = P098B17_A396EmprCod[0] ;
         A758ProCod = P098B17_A758ProCod[0] ;
         A460FasDsc = P098B17_A460FasDsc[0] ;
         A252CliCod = P098B17_A252CliCod[0] ;
         n252CliCod = P098B17_n252CliCod[0] ;
         A213BarSit = P098B17_A213BarSit[0] ;
         A218BarTipCol = P098B17_A218BarTipCol[0] ;
         A136BarColNum = P098B17_A136BarColNum[0] ;
         A135BarColNom = P098B17_A135BarColNom[0] ;
         A1652BarSerDsc = P098B17_A1652BarSerDsc[0] ;
         A212BarSer = P098B17_A212BarSer[0] ;
         A13696BarNHdr = P098B17_A13696BarNHdr[0] ;
         A159BarFecGen = P098B17_A159BarFecGen[0] ;
         A158BarFecFpr = P098B17_A158BarFecFpr[0] ;
         A155BarFecCli = P098B17_A155BarFecCli[0] ;
         A143BarDisNum = P098B17_A143BarDisNum[0] ;
         A4812BarEncCli = P098B17_A4812BarEncCli[0] ;
         A365DisDes = P098B17_A365DisDes[0] ;
         A279CliNom = P098B17_A279CliNom[0] ;
         A156BarFecCum = P098B17_A156BarFecCum[0] ;
         n156BarFecCum = P098B17_n156BarFecCum[0] ;
         A151BarFasCod = P098B17_A151BarFasCod[0] ;
         n151BarFasCod = P098B17_n151BarFasCod[0] ;
         A166BarKgm = P098B17_A166BarKgm[0] ;
         A184BarMtr = P098B17_A184BarMtr[0] ;
         A199BarPie1 = P098B17_A199BarPie1[0] ;
         A898BarPieNDes = P098B17_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                           {
                              AV86Option = A13878PedidoClie ;
                              AV85InsertIndex = 1 ;
                              while ( ( AV85InsertIndex <= AV87Options.size() ) && ( GXutil.strcmp((String)AV87Options.elementAt(-1+AV85InsertIndex), AV86Option) < 0 ) )
                              {
                                 AV85InsertIndex = (int)(AV85InsertIndex+1) ;
                              }
                              if ( ( AV85InsertIndex <= AV87Options.size() ) && ( GXutil.strcmp((String)AV87Options.elementAt(-1+AV85InsertIndex), AV86Option) == 0 ) )
                              {
                                 AV94count = GXutil.lval( (String)AV92OptionIndexes.elementAt(-1+AV85InsertIndex)) ;
                                 AV94count = (long)(AV94count+1) ;
                                 AV92OptionIndexes.removeItem(AV85InsertIndex);
                                 AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), AV85InsertIndex);
                              }
                              else
                              {
                                 AV87Options.add(AV86Option, AV85InsertIndex);
                                 AV92OptionIndexes.add("1", AV85InsertIndex);
                              }
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
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
      AV114TFBarNHdr = AV82SearchTxt ;
      AV115TFBarNHdr_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           AV101Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B25 */
      pr_default.execute(2, new Object[] {AV101Emprcod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P098B25_A252CliCod[0] ;
         n252CliCod = P098B25_n252CliCod[0] ;
         A213BarSit = P098B25_A213BarSit[0] ;
         A153BarFasEst = P098B25_A153BarFasEst[0] ;
         A460FasDsc = P098B25_A460FasDsc[0] ;
         A457FasCod = P098B25_A457FasCod[0] ;
         A603MaqCodBis = P098B25_A603MaqCodBis[0] ;
         A218BarTipCol = P098B25_A218BarTipCol[0] ;
         A136BarColNum = P098B25_A136BarColNum[0] ;
         A135BarColNom = P098B25_A135BarColNom[0] ;
         A1652BarSerDsc = P098B25_A1652BarSerDsc[0] ;
         A212BarSer = P098B25_A212BarSer[0] ;
         A13696BarNHdr = P098B25_A13696BarNHdr[0] ;
         A159BarFecGen = P098B25_A159BarFecGen[0] ;
         A158BarFecFpr = P098B25_A158BarFecFpr[0] ;
         A155BarFecCli = P098B25_A155BarFecCli[0] ;
         A279CliNom = P098B25_A279CliNom[0] ;
         A156BarFecCum = P098B25_A156BarFecCum[0] ;
         n156BarFecCum = P098B25_n156BarFecCum[0] ;
         A151BarFasCod = P098B25_A151BarFasCod[0] ;
         n151BarFasCod = P098B25_n151BarFasCod[0] ;
         A166BarKgm = P098B25_A166BarKgm[0] ;
         A184BarMtr = P098B25_A184BarMtr[0] ;
         A143BarDisNum = P098B25_A143BarDisNum[0] ;
         A4812BarEncCli = P098B25_A4812BarEncCli[0] ;
         A199BarPie1 = P098B25_A199BarPie1[0] ;
         A365DisDes = P098B25_A365DisDes[0] ;
         A898BarPieNDes = P098B25_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B25_A194BarOrdLin[0] ;
         A130BarCodPar = P098B25_A130BarCodPar[0] ;
         A132BarCodReo = P098B25_A132BarCodReo[0] ;
         A129BarCod = P098B25_A129BarCod[0] ;
         A396EmprCod = P098B25_A396EmprCod[0] ;
         A758ProCod = P098B25_A758ProCod[0] ;
         A460FasDsc = P098B25_A460FasDsc[0] ;
         A252CliCod = P098B25_A252CliCod[0] ;
         n252CliCod = P098B25_n252CliCod[0] ;
         A213BarSit = P098B25_A213BarSit[0] ;
         A218BarTipCol = P098B25_A218BarTipCol[0] ;
         A136BarColNum = P098B25_A136BarColNum[0] ;
         A135BarColNom = P098B25_A135BarColNom[0] ;
         A1652BarSerDsc = P098B25_A1652BarSerDsc[0] ;
         A212BarSer = P098B25_A212BarSer[0] ;
         A13696BarNHdr = P098B25_A13696BarNHdr[0] ;
         A159BarFecGen = P098B25_A159BarFecGen[0] ;
         A158BarFecFpr = P098B25_A158BarFecFpr[0] ;
         A155BarFecCli = P098B25_A155BarFecCli[0] ;
         A143BarDisNum = P098B25_A143BarDisNum[0] ;
         A4812BarEncCli = P098B25_A4812BarEncCli[0] ;
         A365DisDes = P098B25_A365DisDes[0] ;
         A279CliNom = P098B25_A279CliNom[0] ;
         A156BarFecCum = P098B25_A156BarFecCum[0] ;
         n156BarFecCum = P098B25_n156BarFecCum[0] ;
         A151BarFasCod = P098B25_A151BarFasCod[0] ;
         n151BarFasCod = P098B25_n151BarFasCod[0] ;
         A166BarKgm = P098B25_A166BarKgm[0] ;
         A184BarMtr = P098B25_A184BarMtr[0] ;
         A199BarPie1 = P098B25_A199BarPie1[0] ;
         A898BarPieNDes = P098B25_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                           {
                              AV86Option = A13696BarNHdr ;
                              AV85InsertIndex = 1 ;
                              while ( ( AV85InsertIndex <= AV87Options.size() ) && ( GXutil.strcmp((String)AV87Options.elementAt(-1+AV85InsertIndex), AV86Option) < 0 ) )
                              {
                                 AV85InsertIndex = (int)(AV85InsertIndex+1) ;
                              }
                              if ( ( AV85InsertIndex <= AV87Options.size() ) && ( GXutil.strcmp((String)AV87Options.elementAt(-1+AV85InsertIndex), AV86Option) == 0 ) )
                              {
                                 AV94count = GXutil.lval( (String)AV92OptionIndexes.elementAt(-1+AV85InsertIndex)) ;
                                 AV94count = (long)(AV94count+1) ;
                                 AV92OptionIndexes.removeItem(AV85InsertIndex);
                                 AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), AV85InsertIndex);
                              }
                              else
                              {
                                 AV87Options.add(AV86Option, AV85InsertIndex);
                                 AV92OptionIndexes.add("1", AV85InsertIndex);
                              }
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
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
      AV116TFBarSer = AV82SearchTxt ;
      AV117TFBarSer_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           A396EmprCod ,
                                           AV101Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B33 */
      pr_default.execute(3, new Object[] {AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, AV101Emprcod, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk98B6 = false ;
         A252CliCod = P098B33_A252CliCod[0] ;
         n252CliCod = P098B33_n252CliCod[0] ;
         A212BarSer = P098B33_A212BarSer[0] ;
         A213BarSit = P098B33_A213BarSit[0] ;
         A153BarFasEst = P098B33_A153BarFasEst[0] ;
         A460FasDsc = P098B33_A460FasDsc[0] ;
         A457FasCod = P098B33_A457FasCod[0] ;
         A603MaqCodBis = P098B33_A603MaqCodBis[0] ;
         A218BarTipCol = P098B33_A218BarTipCol[0] ;
         A136BarColNum = P098B33_A136BarColNum[0] ;
         A135BarColNom = P098B33_A135BarColNom[0] ;
         A1652BarSerDsc = P098B33_A1652BarSerDsc[0] ;
         A13696BarNHdr = P098B33_A13696BarNHdr[0] ;
         A159BarFecGen = P098B33_A159BarFecGen[0] ;
         A158BarFecFpr = P098B33_A158BarFecFpr[0] ;
         A155BarFecCli = P098B33_A155BarFecCli[0] ;
         A279CliNom = P098B33_A279CliNom[0] ;
         A156BarFecCum = P098B33_A156BarFecCum[0] ;
         n156BarFecCum = P098B33_n156BarFecCum[0] ;
         A151BarFasCod = P098B33_A151BarFasCod[0] ;
         n151BarFasCod = P098B33_n151BarFasCod[0] ;
         A166BarKgm = P098B33_A166BarKgm[0] ;
         A184BarMtr = P098B33_A184BarMtr[0] ;
         A143BarDisNum = P098B33_A143BarDisNum[0] ;
         A4812BarEncCli = P098B33_A4812BarEncCli[0] ;
         A199BarPie1 = P098B33_A199BarPie1[0] ;
         A365DisDes = P098B33_A365DisDes[0] ;
         A898BarPieNDes = P098B33_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B33_A194BarOrdLin[0] ;
         A130BarCodPar = P098B33_A130BarCodPar[0] ;
         A132BarCodReo = P098B33_A132BarCodReo[0] ;
         A129BarCod = P098B33_A129BarCod[0] ;
         A396EmprCod = P098B33_A396EmprCod[0] ;
         A758ProCod = P098B33_A758ProCod[0] ;
         A460FasDsc = P098B33_A460FasDsc[0] ;
         A252CliCod = P098B33_A252CliCod[0] ;
         n252CliCod = P098B33_n252CliCod[0] ;
         A212BarSer = P098B33_A212BarSer[0] ;
         A213BarSit = P098B33_A213BarSit[0] ;
         A218BarTipCol = P098B33_A218BarTipCol[0] ;
         A136BarColNum = P098B33_A136BarColNum[0] ;
         A135BarColNom = P098B33_A135BarColNom[0] ;
         A1652BarSerDsc = P098B33_A1652BarSerDsc[0] ;
         A13696BarNHdr = P098B33_A13696BarNHdr[0] ;
         A159BarFecGen = P098B33_A159BarFecGen[0] ;
         A158BarFecFpr = P098B33_A158BarFecFpr[0] ;
         A155BarFecCli = P098B33_A155BarFecCli[0] ;
         A143BarDisNum = P098B33_A143BarDisNum[0] ;
         A4812BarEncCli = P098B33_A4812BarEncCli[0] ;
         A365DisDes = P098B33_A365DisDes[0] ;
         A279CliNom = P098B33_A279CliNom[0] ;
         A156BarFecCum = P098B33_A156BarFecCum[0] ;
         n156BarFecCum = P098B33_n156BarFecCum[0] ;
         A151BarFasCod = P098B33_A151BarFasCod[0] ;
         n151BarFasCod = P098B33_n151BarFasCod[0] ;
         A166BarKgm = P098B33_A166BarKgm[0] ;
         A184BarMtr = P098B33_A184BarMtr[0] ;
         A199BarPie1 = P098B33_A199BarPie1[0] ;
         A898BarPieNDes = P098B33_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P098B33_A212BarSer[0], A212BarSer) == 0 ) )
                           {
                              brk98B6 = false ;
                              A194BarOrdLin = P098B33_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B33_A130BarCodPar[0] ;
                              A132BarCodReo = P098B33_A132BarCodReo[0] ;
                              A129BarCod = P098B33_A129BarCod[0] ;
                              A396EmprCod = P098B33_A396EmprCod[0] ;
                              A758ProCod = P098B33_A758ProCod[0] ;
                              AV94count = (long)(AV94count+1) ;
                              brk98B6 = true ;
                              pr_default.readNext(3);
                           }
                           if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                           {
                              AV86Option = A212BarSer ;
                              AV87Options.add(AV86Option, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B6 )
         {
            brk98B6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV118TFBarSerDsc = AV82SearchTxt ;
      AV119TFBarSerDsc_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           A396EmprCod ,
                                           AV101Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B41 */
      pr_default.execute(4, new Object[] {AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, AV101Emprcod, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk98B8 = false ;
         A252CliCod = P098B41_A252CliCod[0] ;
         n252CliCod = P098B41_n252CliCod[0] ;
         A1652BarSerDsc = P098B41_A1652BarSerDsc[0] ;
         A213BarSit = P098B41_A213BarSit[0] ;
         A153BarFasEst = P098B41_A153BarFasEst[0] ;
         A460FasDsc = P098B41_A460FasDsc[0] ;
         A457FasCod = P098B41_A457FasCod[0] ;
         A603MaqCodBis = P098B41_A603MaqCodBis[0] ;
         A218BarTipCol = P098B41_A218BarTipCol[0] ;
         A136BarColNum = P098B41_A136BarColNum[0] ;
         A135BarColNom = P098B41_A135BarColNom[0] ;
         A212BarSer = P098B41_A212BarSer[0] ;
         A13696BarNHdr = P098B41_A13696BarNHdr[0] ;
         A159BarFecGen = P098B41_A159BarFecGen[0] ;
         A158BarFecFpr = P098B41_A158BarFecFpr[0] ;
         A155BarFecCli = P098B41_A155BarFecCli[0] ;
         A279CliNom = P098B41_A279CliNom[0] ;
         A156BarFecCum = P098B41_A156BarFecCum[0] ;
         n156BarFecCum = P098B41_n156BarFecCum[0] ;
         A151BarFasCod = P098B41_A151BarFasCod[0] ;
         n151BarFasCod = P098B41_n151BarFasCod[0] ;
         A166BarKgm = P098B41_A166BarKgm[0] ;
         A184BarMtr = P098B41_A184BarMtr[0] ;
         A143BarDisNum = P098B41_A143BarDisNum[0] ;
         A4812BarEncCli = P098B41_A4812BarEncCli[0] ;
         A199BarPie1 = P098B41_A199BarPie1[0] ;
         A365DisDes = P098B41_A365DisDes[0] ;
         A898BarPieNDes = P098B41_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B41_A194BarOrdLin[0] ;
         A130BarCodPar = P098B41_A130BarCodPar[0] ;
         A132BarCodReo = P098B41_A132BarCodReo[0] ;
         A129BarCod = P098B41_A129BarCod[0] ;
         A396EmprCod = P098B41_A396EmprCod[0] ;
         A758ProCod = P098B41_A758ProCod[0] ;
         A460FasDsc = P098B41_A460FasDsc[0] ;
         A252CliCod = P098B41_A252CliCod[0] ;
         n252CliCod = P098B41_n252CliCod[0] ;
         A1652BarSerDsc = P098B41_A1652BarSerDsc[0] ;
         A213BarSit = P098B41_A213BarSit[0] ;
         A218BarTipCol = P098B41_A218BarTipCol[0] ;
         A136BarColNum = P098B41_A136BarColNum[0] ;
         A135BarColNom = P098B41_A135BarColNom[0] ;
         A212BarSer = P098B41_A212BarSer[0] ;
         A13696BarNHdr = P098B41_A13696BarNHdr[0] ;
         A159BarFecGen = P098B41_A159BarFecGen[0] ;
         A158BarFecFpr = P098B41_A158BarFecFpr[0] ;
         A155BarFecCli = P098B41_A155BarFecCli[0] ;
         A143BarDisNum = P098B41_A143BarDisNum[0] ;
         A4812BarEncCli = P098B41_A4812BarEncCli[0] ;
         A365DisDes = P098B41_A365DisDes[0] ;
         A279CliNom = P098B41_A279CliNom[0] ;
         A156BarFecCum = P098B41_A156BarFecCum[0] ;
         n156BarFecCum = P098B41_n156BarFecCum[0] ;
         A151BarFasCod = P098B41_A151BarFasCod[0] ;
         n151BarFasCod = P098B41_n151BarFasCod[0] ;
         A166BarKgm = P098B41_A166BarKgm[0] ;
         A184BarMtr = P098B41_A184BarMtr[0] ;
         A199BarPie1 = P098B41_A199BarPie1[0] ;
         A898BarPieNDes = P098B41_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P098B41_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                           {
                              brk98B8 = false ;
                              A194BarOrdLin = P098B41_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B41_A130BarCodPar[0] ;
                              A132BarCodReo = P098B41_A132BarCodReo[0] ;
                              A129BarCod = P098B41_A129BarCod[0] ;
                              A396EmprCod = P098B41_A396EmprCod[0] ;
                              A758ProCod = P098B41_A758ProCod[0] ;
                              AV94count = (long)(AV94count+1) ;
                              brk98B8 = true ;
                              pr_default.readNext(4);
                           }
                           if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                           {
                              AV86Option = A1652BarSerDsc ;
                              AV87Options.add(AV86Option, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B8 )
         {
            brk98B8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV120TFBarColNom = AV82SearchTxt ;
      AV121TFBarColNom_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           A396EmprCod ,
                                           AV101Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B49 */
      pr_default.execute(5, new Object[] {AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, AV101Emprcod, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk98B10 = false ;
         A252CliCod = P098B49_A252CliCod[0] ;
         n252CliCod = P098B49_n252CliCod[0] ;
         A135BarColNom = P098B49_A135BarColNom[0] ;
         A213BarSit = P098B49_A213BarSit[0] ;
         A153BarFasEst = P098B49_A153BarFasEst[0] ;
         A460FasDsc = P098B49_A460FasDsc[0] ;
         A457FasCod = P098B49_A457FasCod[0] ;
         A603MaqCodBis = P098B49_A603MaqCodBis[0] ;
         A218BarTipCol = P098B49_A218BarTipCol[0] ;
         A136BarColNum = P098B49_A136BarColNum[0] ;
         A1652BarSerDsc = P098B49_A1652BarSerDsc[0] ;
         A212BarSer = P098B49_A212BarSer[0] ;
         A13696BarNHdr = P098B49_A13696BarNHdr[0] ;
         A159BarFecGen = P098B49_A159BarFecGen[0] ;
         A158BarFecFpr = P098B49_A158BarFecFpr[0] ;
         A155BarFecCli = P098B49_A155BarFecCli[0] ;
         A279CliNom = P098B49_A279CliNom[0] ;
         A156BarFecCum = P098B49_A156BarFecCum[0] ;
         n156BarFecCum = P098B49_n156BarFecCum[0] ;
         A151BarFasCod = P098B49_A151BarFasCod[0] ;
         n151BarFasCod = P098B49_n151BarFasCod[0] ;
         A166BarKgm = P098B49_A166BarKgm[0] ;
         A184BarMtr = P098B49_A184BarMtr[0] ;
         A143BarDisNum = P098B49_A143BarDisNum[0] ;
         A4812BarEncCli = P098B49_A4812BarEncCli[0] ;
         A199BarPie1 = P098B49_A199BarPie1[0] ;
         A365DisDes = P098B49_A365DisDes[0] ;
         A898BarPieNDes = P098B49_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B49_A194BarOrdLin[0] ;
         A130BarCodPar = P098B49_A130BarCodPar[0] ;
         A132BarCodReo = P098B49_A132BarCodReo[0] ;
         A129BarCod = P098B49_A129BarCod[0] ;
         A396EmprCod = P098B49_A396EmprCod[0] ;
         A758ProCod = P098B49_A758ProCod[0] ;
         A460FasDsc = P098B49_A460FasDsc[0] ;
         A252CliCod = P098B49_A252CliCod[0] ;
         n252CliCod = P098B49_n252CliCod[0] ;
         A135BarColNom = P098B49_A135BarColNom[0] ;
         A213BarSit = P098B49_A213BarSit[0] ;
         A218BarTipCol = P098B49_A218BarTipCol[0] ;
         A136BarColNum = P098B49_A136BarColNum[0] ;
         A1652BarSerDsc = P098B49_A1652BarSerDsc[0] ;
         A212BarSer = P098B49_A212BarSer[0] ;
         A13696BarNHdr = P098B49_A13696BarNHdr[0] ;
         A159BarFecGen = P098B49_A159BarFecGen[0] ;
         A158BarFecFpr = P098B49_A158BarFecFpr[0] ;
         A155BarFecCli = P098B49_A155BarFecCli[0] ;
         A143BarDisNum = P098B49_A143BarDisNum[0] ;
         A4812BarEncCli = P098B49_A4812BarEncCli[0] ;
         A365DisDes = P098B49_A365DisDes[0] ;
         A279CliNom = P098B49_A279CliNom[0] ;
         A156BarFecCum = P098B49_A156BarFecCum[0] ;
         n156BarFecCum = P098B49_n156BarFecCum[0] ;
         A151BarFasCod = P098B49_A151BarFasCod[0] ;
         n151BarFasCod = P098B49_n151BarFasCod[0] ;
         A166BarKgm = P098B49_A166BarKgm[0] ;
         A184BarMtr = P098B49_A184BarMtr[0] ;
         A199BarPie1 = P098B49_A199BarPie1[0] ;
         A898BarPieNDes = P098B49_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P098B49_A135BarColNom[0], A135BarColNom) == 0 ) )
                           {
                              brk98B10 = false ;
                              A194BarOrdLin = P098B49_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B49_A130BarCodPar[0] ;
                              A132BarCodReo = P098B49_A132BarCodReo[0] ;
                              A129BarCod = P098B49_A129BarCod[0] ;
                              A396EmprCod = P098B49_A396EmprCod[0] ;
                              A758ProCod = P098B49_A758ProCod[0] ;
                              AV94count = (long)(AV94count+1) ;
                              brk98B10 = true ;
                              pr_default.readNext(5);
                           }
                           if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                           {
                              AV86Option = A135BarColNom ;
                              AV87Options.add(AV86Option, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B10 )
         {
            brk98B10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV34TFMaqCodBis = AV82SearchTxt ;
      AV35TFMaqCodBis_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           AV101Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B57 */
      pr_default.execute(6, new Object[] {AV101Emprcod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk98B12 = false ;
         A252CliCod = P098B57_A252CliCod[0] ;
         n252CliCod = P098B57_n252CliCod[0] ;
         A603MaqCodBis = P098B57_A603MaqCodBis[0] ;
         A213BarSit = P098B57_A213BarSit[0] ;
         A153BarFasEst = P098B57_A153BarFasEst[0] ;
         A460FasDsc = P098B57_A460FasDsc[0] ;
         A457FasCod = P098B57_A457FasCod[0] ;
         A218BarTipCol = P098B57_A218BarTipCol[0] ;
         A136BarColNum = P098B57_A136BarColNum[0] ;
         A135BarColNom = P098B57_A135BarColNom[0] ;
         A1652BarSerDsc = P098B57_A1652BarSerDsc[0] ;
         A212BarSer = P098B57_A212BarSer[0] ;
         A13696BarNHdr = P098B57_A13696BarNHdr[0] ;
         A159BarFecGen = P098B57_A159BarFecGen[0] ;
         A158BarFecFpr = P098B57_A158BarFecFpr[0] ;
         A155BarFecCli = P098B57_A155BarFecCli[0] ;
         A279CliNom = P098B57_A279CliNom[0] ;
         A156BarFecCum = P098B57_A156BarFecCum[0] ;
         n156BarFecCum = P098B57_n156BarFecCum[0] ;
         A151BarFasCod = P098B57_A151BarFasCod[0] ;
         n151BarFasCod = P098B57_n151BarFasCod[0] ;
         A166BarKgm = P098B57_A166BarKgm[0] ;
         A184BarMtr = P098B57_A184BarMtr[0] ;
         A143BarDisNum = P098B57_A143BarDisNum[0] ;
         A4812BarEncCli = P098B57_A4812BarEncCli[0] ;
         A199BarPie1 = P098B57_A199BarPie1[0] ;
         A365DisDes = P098B57_A365DisDes[0] ;
         A898BarPieNDes = P098B57_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B57_A194BarOrdLin[0] ;
         A130BarCodPar = P098B57_A130BarCodPar[0] ;
         A132BarCodReo = P098B57_A132BarCodReo[0] ;
         A129BarCod = P098B57_A129BarCod[0] ;
         A396EmprCod = P098B57_A396EmprCod[0] ;
         A758ProCod = P098B57_A758ProCod[0] ;
         A460FasDsc = P098B57_A460FasDsc[0] ;
         A252CliCod = P098B57_A252CliCod[0] ;
         n252CliCod = P098B57_n252CliCod[0] ;
         A213BarSit = P098B57_A213BarSit[0] ;
         A218BarTipCol = P098B57_A218BarTipCol[0] ;
         A136BarColNum = P098B57_A136BarColNum[0] ;
         A135BarColNom = P098B57_A135BarColNom[0] ;
         A1652BarSerDsc = P098B57_A1652BarSerDsc[0] ;
         A212BarSer = P098B57_A212BarSer[0] ;
         A13696BarNHdr = P098B57_A13696BarNHdr[0] ;
         A159BarFecGen = P098B57_A159BarFecGen[0] ;
         A158BarFecFpr = P098B57_A158BarFecFpr[0] ;
         A155BarFecCli = P098B57_A155BarFecCli[0] ;
         A143BarDisNum = P098B57_A143BarDisNum[0] ;
         A4812BarEncCli = P098B57_A4812BarEncCli[0] ;
         A365DisDes = P098B57_A365DisDes[0] ;
         A279CliNom = P098B57_A279CliNom[0] ;
         A156BarFecCum = P098B57_A156BarFecCum[0] ;
         n156BarFecCum = P098B57_n156BarFecCum[0] ;
         A151BarFasCod = P098B57_A151BarFasCod[0] ;
         n151BarFasCod = P098B57_n151BarFasCod[0] ;
         A166BarKgm = P098B57_A166BarKgm[0] ;
         A184BarMtr = P098B57_A184BarMtr[0] ;
         A199BarPie1 = P098B57_A199BarPie1[0] ;
         A898BarPieNDes = P098B57_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P098B57_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P098B57_A603MaqCodBis[0], A603MaqCodBis) == 0 ) )
                           {
                              brk98B12 = false ;
                              A194BarOrdLin = P098B57_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B57_A130BarCodPar[0] ;
                              A132BarCodReo = P098B57_A132BarCodReo[0] ;
                              A129BarCod = P098B57_A129BarCod[0] ;
                              A758ProCod = P098B57_A758ProCod[0] ;
                              AV94count = (long)(AV94count+1) ;
                              brk98B12 = true ;
                              pr_default.readNext(6);
                           }
                           if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
                           {
                              AV86Option = A603MaqCodBis ;
                              AV87Options.add(AV86Option, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B12 )
         {
            brk98B12 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFasCod = AV82SearchTxt ;
      AV23TFFasCod_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           AV101Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B65 */
      pr_default.execute(7, new Object[] {AV101Emprcod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk98B14 = false ;
         A252CliCod = P098B65_A252CliCod[0] ;
         n252CliCod = P098B65_n252CliCod[0] ;
         A457FasCod = P098B65_A457FasCod[0] ;
         A213BarSit = P098B65_A213BarSit[0] ;
         A153BarFasEst = P098B65_A153BarFasEst[0] ;
         A460FasDsc = P098B65_A460FasDsc[0] ;
         A603MaqCodBis = P098B65_A603MaqCodBis[0] ;
         A218BarTipCol = P098B65_A218BarTipCol[0] ;
         A136BarColNum = P098B65_A136BarColNum[0] ;
         A135BarColNom = P098B65_A135BarColNom[0] ;
         A1652BarSerDsc = P098B65_A1652BarSerDsc[0] ;
         A212BarSer = P098B65_A212BarSer[0] ;
         A13696BarNHdr = P098B65_A13696BarNHdr[0] ;
         A159BarFecGen = P098B65_A159BarFecGen[0] ;
         A158BarFecFpr = P098B65_A158BarFecFpr[0] ;
         A155BarFecCli = P098B65_A155BarFecCli[0] ;
         A279CliNom = P098B65_A279CliNom[0] ;
         A156BarFecCum = P098B65_A156BarFecCum[0] ;
         n156BarFecCum = P098B65_n156BarFecCum[0] ;
         A151BarFasCod = P098B65_A151BarFasCod[0] ;
         n151BarFasCod = P098B65_n151BarFasCod[0] ;
         A166BarKgm = P098B65_A166BarKgm[0] ;
         A184BarMtr = P098B65_A184BarMtr[0] ;
         A143BarDisNum = P098B65_A143BarDisNum[0] ;
         A4812BarEncCli = P098B65_A4812BarEncCli[0] ;
         A199BarPie1 = P098B65_A199BarPie1[0] ;
         A365DisDes = P098B65_A365DisDes[0] ;
         A898BarPieNDes = P098B65_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B65_A194BarOrdLin[0] ;
         A130BarCodPar = P098B65_A130BarCodPar[0] ;
         A132BarCodReo = P098B65_A132BarCodReo[0] ;
         A129BarCod = P098B65_A129BarCod[0] ;
         A396EmprCod = P098B65_A396EmprCod[0] ;
         A758ProCod = P098B65_A758ProCod[0] ;
         A460FasDsc = P098B65_A460FasDsc[0] ;
         A252CliCod = P098B65_A252CliCod[0] ;
         n252CliCod = P098B65_n252CliCod[0] ;
         A213BarSit = P098B65_A213BarSit[0] ;
         A218BarTipCol = P098B65_A218BarTipCol[0] ;
         A136BarColNum = P098B65_A136BarColNum[0] ;
         A135BarColNom = P098B65_A135BarColNom[0] ;
         A1652BarSerDsc = P098B65_A1652BarSerDsc[0] ;
         A212BarSer = P098B65_A212BarSer[0] ;
         A13696BarNHdr = P098B65_A13696BarNHdr[0] ;
         A159BarFecGen = P098B65_A159BarFecGen[0] ;
         A158BarFecFpr = P098B65_A158BarFecFpr[0] ;
         A155BarFecCli = P098B65_A155BarFecCli[0] ;
         A143BarDisNum = P098B65_A143BarDisNum[0] ;
         A4812BarEncCli = P098B65_A4812BarEncCli[0] ;
         A365DisDes = P098B65_A365DisDes[0] ;
         A279CliNom = P098B65_A279CliNom[0] ;
         A156BarFecCum = P098B65_A156BarFecCum[0] ;
         n156BarFecCum = P098B65_n156BarFecCum[0] ;
         A151BarFasCod = P098B65_A151BarFasCod[0] ;
         n151BarFasCod = P098B65_n151BarFasCod[0] ;
         A166BarKgm = P098B65_A166BarKgm[0] ;
         A184BarMtr = P098B65_A184BarMtr[0] ;
         A199BarPie1 = P098B65_A199BarPie1[0] ;
         A898BarPieNDes = P098B65_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P098B65_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P098B65_A457FasCod[0], A457FasCod) == 0 ) )
                           {
                              brk98B14 = false ;
                              A194BarOrdLin = P098B65_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B65_A130BarCodPar[0] ;
                              A132BarCodReo = P098B65_A132BarCodReo[0] ;
                              A129BarCod = P098B65_A129BarCod[0] ;
                              A758ProCod = P098B65_A758ProCod[0] ;
                              if ( (AV103FasesColeccion.indexof(GXutil.rtrim( A457FasCod))>0) || ( AV103FasesColeccion.size() == 0 ) )
                              {
                                 AV94count = (long)(AV94count+1) ;
                              }
                              brk98B14 = true ;
                              pr_default.readNext(7);
                           }
                           if ( ! (GXutil.strcmp("", A457FasCod)==0) )
                           {
                              AV86Option = A457FasCod ;
                              AV89OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
                              AV87Options.add(AV86Option, 0);
                              AV90OptionsDesc.add(AV89OptionDesc, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B14 )
         {
            brk98B14 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV126TFFasDsc = AV82SearchTxt ;
      AV127TFFasDsc_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           A396EmprCod ,
                                           AV101Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B73 */
      pr_default.execute(8, new Object[] {AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, AV101Emprcod, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk98B16 = false ;
         A252CliCod = P098B73_A252CliCod[0] ;
         n252CliCod = P098B73_n252CliCod[0] ;
         A460FasDsc = P098B73_A460FasDsc[0] ;
         A213BarSit = P098B73_A213BarSit[0] ;
         A153BarFasEst = P098B73_A153BarFasEst[0] ;
         A457FasCod = P098B73_A457FasCod[0] ;
         A603MaqCodBis = P098B73_A603MaqCodBis[0] ;
         A218BarTipCol = P098B73_A218BarTipCol[0] ;
         A136BarColNum = P098B73_A136BarColNum[0] ;
         A135BarColNom = P098B73_A135BarColNom[0] ;
         A1652BarSerDsc = P098B73_A1652BarSerDsc[0] ;
         A212BarSer = P098B73_A212BarSer[0] ;
         A13696BarNHdr = P098B73_A13696BarNHdr[0] ;
         A159BarFecGen = P098B73_A159BarFecGen[0] ;
         A158BarFecFpr = P098B73_A158BarFecFpr[0] ;
         A155BarFecCli = P098B73_A155BarFecCli[0] ;
         A279CliNom = P098B73_A279CliNom[0] ;
         A156BarFecCum = P098B73_A156BarFecCum[0] ;
         n156BarFecCum = P098B73_n156BarFecCum[0] ;
         A151BarFasCod = P098B73_A151BarFasCod[0] ;
         n151BarFasCod = P098B73_n151BarFasCod[0] ;
         A166BarKgm = P098B73_A166BarKgm[0] ;
         A184BarMtr = P098B73_A184BarMtr[0] ;
         A143BarDisNum = P098B73_A143BarDisNum[0] ;
         A4812BarEncCli = P098B73_A4812BarEncCli[0] ;
         A199BarPie1 = P098B73_A199BarPie1[0] ;
         A365DisDes = P098B73_A365DisDes[0] ;
         A898BarPieNDes = P098B73_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B73_A194BarOrdLin[0] ;
         A130BarCodPar = P098B73_A130BarCodPar[0] ;
         A132BarCodReo = P098B73_A132BarCodReo[0] ;
         A129BarCod = P098B73_A129BarCod[0] ;
         A396EmprCod = P098B73_A396EmprCod[0] ;
         A758ProCod = P098B73_A758ProCod[0] ;
         A460FasDsc = P098B73_A460FasDsc[0] ;
         A252CliCod = P098B73_A252CliCod[0] ;
         n252CliCod = P098B73_n252CliCod[0] ;
         A213BarSit = P098B73_A213BarSit[0] ;
         A218BarTipCol = P098B73_A218BarTipCol[0] ;
         A136BarColNum = P098B73_A136BarColNum[0] ;
         A135BarColNom = P098B73_A135BarColNom[0] ;
         A1652BarSerDsc = P098B73_A1652BarSerDsc[0] ;
         A212BarSer = P098B73_A212BarSer[0] ;
         A13696BarNHdr = P098B73_A13696BarNHdr[0] ;
         A159BarFecGen = P098B73_A159BarFecGen[0] ;
         A158BarFecFpr = P098B73_A158BarFecFpr[0] ;
         A155BarFecCli = P098B73_A155BarFecCli[0] ;
         A143BarDisNum = P098B73_A143BarDisNum[0] ;
         A4812BarEncCli = P098B73_A4812BarEncCli[0] ;
         A365DisDes = P098B73_A365DisDes[0] ;
         A279CliNom = P098B73_A279CliNom[0] ;
         A156BarFecCum = P098B73_A156BarFecCum[0] ;
         n156BarFecCum = P098B73_n156BarFecCum[0] ;
         A151BarFasCod = P098B73_A151BarFasCod[0] ;
         n151BarFasCod = P098B73_n151BarFasCod[0] ;
         A166BarKgm = P098B73_A166BarKgm[0] ;
         A184BarMtr = P098B73_A184BarMtr[0] ;
         A199BarPie1 = P098B73_A199BarPie1[0] ;
         A898BarPieNDes = P098B73_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           AV94count = 0 ;
                           while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P098B73_A460FasDsc[0], A460FasDsc) == 0 ) )
                           {
                              brk98B16 = false ;
                              A457FasCod = P098B73_A457FasCod[0] ;
                              A194BarOrdLin = P098B73_A194BarOrdLin[0] ;
                              A130BarCodPar = P098B73_A130BarCodPar[0] ;
                              A132BarCodReo = P098B73_A132BarCodReo[0] ;
                              A129BarCod = P098B73_A129BarCod[0] ;
                              A396EmprCod = P098B73_A396EmprCod[0] ;
                              A758ProCod = P098B73_A758ProCod[0] ;
                              if ( (AV103FasesColeccion.indexof(GXutil.rtrim( A457FasCod))>0) || ( AV103FasesColeccion.size() == 0 ) )
                              {
                                 AV94count = (long)(AV94count+1) ;
                              }
                              brk98B16 = true ;
                              pr_default.readNext(8);
                           }
                           if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
                           {
                              AV86Option = A460FasDsc ;
                              AV87Options.add(AV86Option, 0);
                              AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk98B16 )
         {
            brk98B16 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV136TFBarFasCod = AV82SearchTxt ;
      AV137TFBarFasCod_Sel = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = AV100FilterFullText ;
      AV155Cargasporseccion_wcds_2_tfclinom = AV104TFCliNom ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = AV105TFCliNom_Sel ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = AV106TFBarFecCli ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = AV107TFBarFecCli_To ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = AV108TFPedidoCliente ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = AV109TFPedidoCliente_Sel ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = AV110TFBarFecFpr ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = AV111TFBarFecFpr_To ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = AV112TFBarFecGen ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = AV113TFBarFecGen_To ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = AV114TFBarNHdr ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = AV115TFBarNHdr_Sel ;
      AV167Cargasporseccion_wcds_14_tfbarser = AV116TFBarSer ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = AV117TFBarSer_Sel ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = AV118TFBarSerDsc ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = AV119TFBarSerDsc_Sel ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = AV120TFBarColNom ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = AV121TFBarColNom_Sel ;
      AV173Cargasporseccion_wcds_20_tfbarcolnum = AV122TFBarColNum ;
      AV174Cargasporseccion_wcds_21_tfbarcolnum_to = AV123TFBarColNum_To ;
      AV175Cargasporseccion_wcds_22_tfbartipcol = AV124TFBarTipCol ;
      AV176Cargasporseccion_wcds_23_tfbartipcol_to = AV125TFBarTipCol_To ;
      AV177Cargasporseccion_wcds_24_tfbarordlin = AV20TFBarOrdLin ;
      AV178Cargasporseccion_wcds_25_tfbarordlin_to = AV21TFBarOrdLin_To ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = AV34TFMaqCodBis ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = AV35TFMaqCodBis_Sel ;
      AV181Cargasporseccion_wcds_28_tffascod = AV22TFFasCod ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = AV23TFFasCod_Sel ;
      AV183Cargasporseccion_wcds_30_tffasdsc = AV126TFFasDsc ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = AV127TFFasDsc_Sel ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = AV129TFBarFasEst_Sels ;
      AV186Cargasporseccion_wcds_33_tfbarmtr = AV130TFBarMtr ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = AV131TFBarMtr_To ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = AV132TFBarkgm ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = AV133TFBarkgm_To ;
      AV190Cargasporseccion_wcds_37_tfbarpie = AV134TFBarPie ;
      AV191Cargasporseccion_wcds_38_tfbarpie_to = AV135TFBarPie_To ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = AV136TFBarFasCod ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = AV137TFBarFasCod_Sel ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = AV138TFBarFecCum ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = AV139TFBarFecCum_To ;
      AV196Cargasporseccion_wcds_43_tfbarsit = AV140TFBarSit ;
      AV197Cargasporseccion_wcds_44_tfbarsit_to = AV141TFBarSit_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV103FasesColeccion ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           AV155Cargasporseccion_wcds_2_tfclinom ,
                                           AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           AV167Cargasporseccion_wcds_14_tfbarser ,
                                           AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to) ,
                                           Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol) ,
                                           Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to) ,
                                           Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin) ,
                                           Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to) ,
                                           AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           AV181Cargasporseccion_wcds_28_tffascod ,
                                           AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           Integer.valueOf(AV185Cargasporseccion_wcds_32_tfbarfasest_sels.size()) ,
                                           AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit) ,
                                           Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to) ,
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
                                           AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV190Cargasporseccion_wcds_37_tfbarpie) ,
                                           Integer.valueOf(AV191Cargasporseccion_wcds_38_tfbarpie_to) ,
                                           AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           AV102MaqcodInout ,
                                           Integer.valueOf(AV103FasesColeccion.size()) ,
                                           Short.valueOf(A13889FaseAnteri) ,
                                           AV149TipoControl ,
                                           Integer.valueOf(AV144Barcod) ,
                                           Byte.valueOf(AV145Barcodreo) ,
                                           AV146Barcodpar ,
                                           AV101Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Cargasporseccion_wcds_39_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Cargasporseccion_wcds_39_tfbarfascod), 8, "%") ;
      lV102MaqcodInout = GXutil.padr( GXutil.rtrim( AV102MaqcodInout), 6, "%") ;
      lV155Cargasporseccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV155Cargasporseccion_wcds_2_tfclinom), 30, "%") ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Cargasporseccion_wcds_12_tfbarnhdr), 11, "%") ;
      lV167Cargasporseccion_wcds_14_tfbarser = GXutil.padr( GXutil.rtrim( AV167Cargasporseccion_wcds_14_tfbarser), 16, "%") ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV169Cargasporseccion_wcds_16_tfbarserdsc), 26, "%") ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV171Cargasporseccion_wcds_18_tfbarcolnom), 13, "%") ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV179Cargasporseccion_wcds_26_tfmaqcodbis), 6, "%") ;
      lV181Cargasporseccion_wcds_28_tffascod = GXutil.padr( GXutil.rtrim( AV181Cargasporseccion_wcds_28_tffascod), 8, "%") ;
      lV183Cargasporseccion_wcds_30_tffasdsc = GXutil.padr( GXutil.rtrim( AV183Cargasporseccion_wcds_30_tffasdsc), 28, "%") ;
      /* Using cursor P098B81 */
      pr_default.execute(9, new Object[] {AV101Emprcod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV192Cargasporseccion_wcds_39_tfbarfascod, lV192Cargasporseccion_wcds_39_tfbarfascod, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV193Cargasporseccion_wcds_40_tfbarfascod_sel, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV194Cargasporseccion_wcds_41_tfbarfeccum, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, AV195Cargasporseccion_wcds_42_tfbarfeccum_to, lV102MaqcodInout, Integer.valueOf(AV103FasesColeccion.size()), Integer.valueOf(AV144Barcod), Integer.valueOf(AV144Barcod), Byte.valueOf(AV145Barcodreo), Byte.valueOf(AV145Barcodreo), AV146Barcodpar, AV146Barcodpar, lV155Cargasporseccion_wcds_2_tfclinom, AV156Cargasporseccion_wcds_3_tfclinom_sel, AV157Cargasporseccion_wcds_4_tfbarfeccli, AV158Cargasporseccion_wcds_5_tfbarfeccli_to, AV161Cargasporseccion_wcds_8_tfbarfecfpr, AV162Cargasporseccion_wcds_9_tfbarfecfpr_to, AV163Cargasporseccion_wcds_10_tfbarfecgen, AV164Cargasporseccion_wcds_11_tfbarfecgen_to, lV165Cargasporseccion_wcds_12_tfbarnhdr, AV166Cargasporseccion_wcds_13_tfbarnhdr_sel, lV167Cargasporseccion_wcds_14_tfbarser, AV168Cargasporseccion_wcds_15_tfbarser_sel, lV169Cargasporseccion_wcds_16_tfbarserdsc, AV170Cargasporseccion_wcds_17_tfbarserdsc_sel, lV171Cargasporseccion_wcds_18_tfbarcolnom, AV172Cargasporseccion_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV173Cargasporseccion_wcds_20_tfbarcolnum), Integer.valueOf(AV174Cargasporseccion_wcds_21_tfbarcolnum_to), Byte.valueOf(AV175Cargasporseccion_wcds_22_tfbartipcol), Byte.valueOf(AV176Cargasporseccion_wcds_23_tfbartipcol_to), Short.valueOf(AV177Cargasporseccion_wcds_24_tfbarordlin), Short.valueOf(AV178Cargasporseccion_wcds_25_tfbarordlin_to), lV179Cargasporseccion_wcds_26_tfmaqcodbis, AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel, lV181Cargasporseccion_wcds_28_tffascod, AV182Cargasporseccion_wcds_29_tffascod_sel, lV183Cargasporseccion_wcds_30_tffasdsc, AV184Cargasporseccion_wcds_31_tffasdsc_sel, AV186Cargasporseccion_wcds_33_tfbarmtr, AV187Cargasporseccion_wcds_34_tfbarmtr_to, AV188Cargasporseccion_wcds_35_tfbarkgm, AV189Cargasporseccion_wcds_36_tfbarkgm_to, Byte.valueOf(AV196Cargasporseccion_wcds_43_tfbarsit), Byte.valueOf(AV197Cargasporseccion_wcds_44_tfbarsit_to)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A252CliCod = P098B81_A252CliCod[0] ;
         n252CliCod = P098B81_n252CliCod[0] ;
         A213BarSit = P098B81_A213BarSit[0] ;
         A153BarFasEst = P098B81_A153BarFasEst[0] ;
         A460FasDsc = P098B81_A460FasDsc[0] ;
         A457FasCod = P098B81_A457FasCod[0] ;
         A603MaqCodBis = P098B81_A603MaqCodBis[0] ;
         A218BarTipCol = P098B81_A218BarTipCol[0] ;
         A136BarColNum = P098B81_A136BarColNum[0] ;
         A135BarColNom = P098B81_A135BarColNom[0] ;
         A1652BarSerDsc = P098B81_A1652BarSerDsc[0] ;
         A212BarSer = P098B81_A212BarSer[0] ;
         A13696BarNHdr = P098B81_A13696BarNHdr[0] ;
         A159BarFecGen = P098B81_A159BarFecGen[0] ;
         A158BarFecFpr = P098B81_A158BarFecFpr[0] ;
         A155BarFecCli = P098B81_A155BarFecCli[0] ;
         A279CliNom = P098B81_A279CliNom[0] ;
         A156BarFecCum = P098B81_A156BarFecCum[0] ;
         n156BarFecCum = P098B81_n156BarFecCum[0] ;
         A151BarFasCod = P098B81_A151BarFasCod[0] ;
         n151BarFasCod = P098B81_n151BarFasCod[0] ;
         A166BarKgm = P098B81_A166BarKgm[0] ;
         A184BarMtr = P098B81_A184BarMtr[0] ;
         A143BarDisNum = P098B81_A143BarDisNum[0] ;
         A4812BarEncCli = P098B81_A4812BarEncCli[0] ;
         A199BarPie1 = P098B81_A199BarPie1[0] ;
         A365DisDes = P098B81_A365DisDes[0] ;
         A898BarPieNDes = P098B81_A898BarPieNDes[0] ;
         A194BarOrdLin = P098B81_A194BarOrdLin[0] ;
         A130BarCodPar = P098B81_A130BarCodPar[0] ;
         A132BarCodReo = P098B81_A132BarCodReo[0] ;
         A129BarCod = P098B81_A129BarCod[0] ;
         A396EmprCod = P098B81_A396EmprCod[0] ;
         A758ProCod = P098B81_A758ProCod[0] ;
         A460FasDsc = P098B81_A460FasDsc[0] ;
         A252CliCod = P098B81_A252CliCod[0] ;
         n252CliCod = P098B81_n252CliCod[0] ;
         A213BarSit = P098B81_A213BarSit[0] ;
         A218BarTipCol = P098B81_A218BarTipCol[0] ;
         A136BarColNum = P098B81_A136BarColNum[0] ;
         A135BarColNom = P098B81_A135BarColNom[0] ;
         A1652BarSerDsc = P098B81_A1652BarSerDsc[0] ;
         A212BarSer = P098B81_A212BarSer[0] ;
         A13696BarNHdr = P098B81_A13696BarNHdr[0] ;
         A159BarFecGen = P098B81_A159BarFecGen[0] ;
         A158BarFecFpr = P098B81_A158BarFecFpr[0] ;
         A155BarFecCli = P098B81_A155BarFecCli[0] ;
         A143BarDisNum = P098B81_A143BarDisNum[0] ;
         A4812BarEncCli = P098B81_A4812BarEncCli[0] ;
         A365DisDes = P098B81_A365DisDes[0] ;
         A279CliNom = P098B81_A279CliNom[0] ;
         A156BarFecCum = P098B81_A156BarFecCum[0] ;
         n156BarFecCum = P098B81_n156BarFecCum[0] ;
         A151BarFasCod = P098B81_A151BarFasCod[0] ;
         n151BarFasCod = P098B81_n151BarFasCod[0] ;
         A166BarKgm = P098B81_A166BarKgm[0] ;
         A184BarMtr = P098B81_A184BarMtr[0] ;
         A199BarPie1 = P098B81_A199BarPie1[0] ;
         A898BarPieNDes = P098B81_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         cargasporseccion_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         cargasporseccion_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV159Cargasporseccion_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV159Cargasporseccion_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV160Cargasporseccion_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV160Cargasporseccion_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13889FaseAnteri ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int8[0] = A129BarCod ;
               GXv_int9[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_int10[0] = GXt_int7 ;
               new app.core.faseanteriorcontrol_prc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int9, GXv_char5, GXv_int11, GXv_int10) ;
               cargasporseccion_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               cargasporseccion_wcgetfilterdata.this.A129BarCod = GXv_int8[0] ;
               cargasporseccion_wcgetfilterdata.this.A132BarCodReo = GXv_int9[0] ;
               cargasporseccion_wcgetfilterdata.this.A130BarCodPar = GXv_char5[0] ;
               cargasporseccion_wcgetfilterdata.this.A194BarOrdLin = GXv_int11[0] ;
               cargasporseccion_wcgetfilterdata.this.GXt_int7 = GXv_int10[0] ;
               A13889FaseAnteri = GXt_int7 ;
               if ( ( ( A13889FaseAnteri == 2 ) && ( GXutil.strcmp(AV149TipoControl, "D") == 0 ) ) || ( ( A13889FaseAnteri != 2 ) && ( GXutil.strcmp(AV149TipoControl, "G") == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV154Cargasporseccion_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV154Cargasporseccion_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV154Cargasporseccion_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV190Cargasporseccion_wcds_37_tfbarpie) || ( ( A198BarPie >= AV190Cargasporseccion_wcds_37_tfbarpie ) ) )
                     {
                        if ( (0==AV191Cargasporseccion_wcds_38_tfbarpie_to) || ( ( A198BarPie <= AV191Cargasporseccion_wcds_38_tfbarpie_to ) ) )
                        {
                           if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
                           {
                              AV86Option = A151BarFasCod ;
                              AV85InsertIndex = 1 ;
                              while ( ( AV85InsertIndex <= AV87Options.size() ) && ( GXutil.strcmp((String)AV87Options.elementAt(-1+AV85InsertIndex), AV86Option) < 0 ) )
                              {
                                 AV85InsertIndex = (int)(AV85InsertIndex+1) ;
                              }
                              if ( ( AV85InsertIndex <= AV87Options.size() ) && ( GXutil.strcmp((String)AV87Options.elementAt(-1+AV85InsertIndex), AV86Option) == 0 ) )
                              {
                                 AV94count = GXutil.lval( (String)AV92OptionIndexes.elementAt(-1+AV85InsertIndex)) ;
                                 AV94count = (long)(AV94count+1) ;
                                 AV92OptionIndexes.removeItem(AV85InsertIndex);
                                 AV92OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV94count), "Z,ZZZ,ZZZ,ZZ9")), AV85InsertIndex);
                              }
                              else
                              {
                                 AV87Options.add(AV86Option, AV85InsertIndex);
                                 AV92OptionIndexes.add("1", AV85InsertIndex);
                              }
                           }
                           if ( AV87Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
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
      this.aP3[0] = cargasporseccion_wcgetfilterdata.this.AV88OptionsJson;
      this.aP4[0] = cargasporseccion_wcgetfilterdata.this.AV91OptionsDescJson;
      this.aP5[0] = cargasporseccion_wcgetfilterdata.this.AV93OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV88OptionsJson = "" ;
      AV91OptionsDescJson = "" ;
      AV93OptionIndexesJson = "" ;
      AV87Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV90OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV92OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV95Session = httpContext.getWebSession();
      AV97GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV98GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV100FilterFullText = "" ;
      AV104TFCliNom = "" ;
      AV105TFCliNom_Sel = "" ;
      AV106TFBarFecCli = GXutil.nullDate() ;
      AV107TFBarFecCli_To = GXutil.nullDate() ;
      AV108TFPedidoCliente = "" ;
      AV109TFPedidoCliente_Sel = "" ;
      AV110TFBarFecFpr = GXutil.nullDate() ;
      AV111TFBarFecFpr_To = GXutil.nullDate() ;
      AV112TFBarFecGen = GXutil.nullDate() ;
      AV113TFBarFecGen_To = GXutil.nullDate() ;
      AV114TFBarNHdr = "" ;
      AV115TFBarNHdr_Sel = "" ;
      AV116TFBarSer = "" ;
      AV117TFBarSer_Sel = "" ;
      AV118TFBarSerDsc = "" ;
      AV119TFBarSerDsc_Sel = "" ;
      AV120TFBarColNom = "" ;
      AV121TFBarColNom_Sel = "" ;
      AV34TFMaqCodBis = "" ;
      AV35TFMaqCodBis_Sel = "" ;
      AV22TFFasCod = "" ;
      AV23TFFasCod_Sel = "" ;
      AV126TFFasDsc = "" ;
      AV127TFFasDsc_Sel = "" ;
      AV128TFBarFasEst_SelsJson = "" ;
      AV129TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV130TFBarMtr = DecimalUtil.ZERO ;
      AV131TFBarMtr_To = DecimalUtil.ZERO ;
      AV132TFBarkgm = DecimalUtil.ZERO ;
      AV133TFBarkgm_To = DecimalUtil.ZERO ;
      AV136TFBarFasCod = "" ;
      AV137TFBarFasCod_Sel = "" ;
      AV138TFBarFecCum = GXutil.nullDate() ;
      AV139TFBarFecCum_To = GXutil.nullDate() ;
      AV101Emprcod = "" ;
      AV102MaqcodInout = "" ;
      AV149TipoControl = "" ;
      AV148FasesToJson = "" ;
      AV146Barcodpar = "" ;
      A279CliNom = "" ;
      AV154Cargasporseccion_wcds_1_filterfulltext = "" ;
      AV155Cargasporseccion_wcds_2_tfclinom = "" ;
      AV156Cargasporseccion_wcds_3_tfclinom_sel = "" ;
      AV157Cargasporseccion_wcds_4_tfbarfeccli = GXutil.nullDate() ;
      AV158Cargasporseccion_wcds_5_tfbarfeccli_to = GXutil.nullDate() ;
      AV159Cargasporseccion_wcds_6_tfpedidocliente = "" ;
      AV160Cargasporseccion_wcds_7_tfpedidocliente_sel = "" ;
      AV161Cargasporseccion_wcds_8_tfbarfecfpr = GXutil.nullDate() ;
      AV162Cargasporseccion_wcds_9_tfbarfecfpr_to = GXutil.nullDate() ;
      AV163Cargasporseccion_wcds_10_tfbarfecgen = GXutil.nullDate() ;
      AV164Cargasporseccion_wcds_11_tfbarfecgen_to = GXutil.nullDate() ;
      AV165Cargasporseccion_wcds_12_tfbarnhdr = "" ;
      AV166Cargasporseccion_wcds_13_tfbarnhdr_sel = "" ;
      AV167Cargasporseccion_wcds_14_tfbarser = "" ;
      AV168Cargasporseccion_wcds_15_tfbarser_sel = "" ;
      AV169Cargasporseccion_wcds_16_tfbarserdsc = "" ;
      AV170Cargasporseccion_wcds_17_tfbarserdsc_sel = "" ;
      AV171Cargasporseccion_wcds_18_tfbarcolnom = "" ;
      AV172Cargasporseccion_wcds_19_tfbarcolnom_sel = "" ;
      AV179Cargasporseccion_wcds_26_tfmaqcodbis = "" ;
      AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel = "" ;
      AV181Cargasporseccion_wcds_28_tffascod = "" ;
      AV182Cargasporseccion_wcds_29_tffascod_sel = "" ;
      AV183Cargasporseccion_wcds_30_tffasdsc = "" ;
      AV184Cargasporseccion_wcds_31_tffasdsc_sel = "" ;
      AV185Cargasporseccion_wcds_32_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV186Cargasporseccion_wcds_33_tfbarmtr = DecimalUtil.ZERO ;
      AV187Cargasporseccion_wcds_34_tfbarmtr_to = DecimalUtil.ZERO ;
      AV188Cargasporseccion_wcds_35_tfbarkgm = DecimalUtil.ZERO ;
      AV189Cargasporseccion_wcds_36_tfbarkgm_to = DecimalUtil.ZERO ;
      AV192Cargasporseccion_wcds_39_tfbarfascod = "" ;
      AV193Cargasporseccion_wcds_40_tfbarfascod_sel = "" ;
      AV194Cargasporseccion_wcds_41_tfbarfeccum = GXutil.nullDate() ;
      AV195Cargasporseccion_wcds_42_tfbarfeccum_to = GXutil.nullDate() ;
      lV154Cargasporseccion_wcds_1_filterfulltext = "" ;
      AV103FasesColeccion = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV192Cargasporseccion_wcds_39_tfbarfascod = "" ;
      lV102MaqcodInout = "" ;
      lV155Cargasporseccion_wcds_2_tfclinom = "" ;
      lV165Cargasporseccion_wcds_12_tfbarnhdr = "" ;
      lV167Cargasporseccion_wcds_14_tfbarser = "" ;
      lV169Cargasporseccion_wcds_16_tfbarserdsc = "" ;
      lV171Cargasporseccion_wcds_18_tfbarcolnom = "" ;
      lV179Cargasporseccion_wcds_26_tfmaqcodbis = "" ;
      lV181Cargasporseccion_wcds_28_tffascod = "" ;
      lV183Cargasporseccion_wcds_30_tffasdsc = "" ;
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
      P098B9_A252CliCod = new int[1] ;
      P098B9_n252CliCod = new boolean[] {false} ;
      P098B9_A279CliNom = new String[] {""} ;
      P098B9_A213BarSit = new byte[1] ;
      P098B9_A153BarFasEst = new byte[1] ;
      P098B9_A460FasDsc = new String[] {""} ;
      P098B9_A457FasCod = new String[] {""} ;
      P098B9_A603MaqCodBis = new String[] {""} ;
      P098B9_A218BarTipCol = new byte[1] ;
      P098B9_A136BarColNum = new int[1] ;
      P098B9_A135BarColNom = new String[] {""} ;
      P098B9_A1652BarSerDsc = new String[] {""} ;
      P098B9_A212BarSer = new String[] {""} ;
      P098B9_A13696BarNHdr = new String[] {""} ;
      P098B9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B9_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B9_n156BarFecCum = new boolean[] {false} ;
      P098B9_A151BarFasCod = new String[] {""} ;
      P098B9_n151BarFasCod = new boolean[] {false} ;
      P098B9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B9_A143BarDisNum = new String[] {""} ;
      P098B9_A4812BarEncCli = new String[] {""} ;
      P098B9_A199BarPie1 = new short[1] ;
      P098B9_A365DisDes = new String[] {""} ;
      P098B9_A898BarPieNDes = new int[1] ;
      P098B9_A194BarOrdLin = new short[1] ;
      P098B9_A130BarCodPar = new String[] {""} ;
      P098B9_A132BarCodReo = new byte[1] ;
      P098B9_A129BarCod = new int[1] ;
      P098B9_A396EmprCod = new String[] {""} ;
      P098B9_A758ProCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      A758ProCod = "" ;
      AV86Option = "" ;
      P098B17_A252CliCod = new int[1] ;
      P098B17_n252CliCod = new boolean[] {false} ;
      P098B17_A213BarSit = new byte[1] ;
      P098B17_A153BarFasEst = new byte[1] ;
      P098B17_A460FasDsc = new String[] {""} ;
      P098B17_A457FasCod = new String[] {""} ;
      P098B17_A603MaqCodBis = new String[] {""} ;
      P098B17_A218BarTipCol = new byte[1] ;
      P098B17_A136BarColNum = new int[1] ;
      P098B17_A135BarColNom = new String[] {""} ;
      P098B17_A1652BarSerDsc = new String[] {""} ;
      P098B17_A212BarSer = new String[] {""} ;
      P098B17_A13696BarNHdr = new String[] {""} ;
      P098B17_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B17_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B17_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B17_A279CliNom = new String[] {""} ;
      P098B17_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B17_n156BarFecCum = new boolean[] {false} ;
      P098B17_A151BarFasCod = new String[] {""} ;
      P098B17_n151BarFasCod = new boolean[] {false} ;
      P098B17_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B17_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B17_A143BarDisNum = new String[] {""} ;
      P098B17_A4812BarEncCli = new String[] {""} ;
      P098B17_A199BarPie1 = new short[1] ;
      P098B17_A365DisDes = new String[] {""} ;
      P098B17_A898BarPieNDes = new int[1] ;
      P098B17_A194BarOrdLin = new short[1] ;
      P098B17_A130BarCodPar = new String[] {""} ;
      P098B17_A132BarCodReo = new byte[1] ;
      P098B17_A129BarCod = new int[1] ;
      P098B17_A396EmprCod = new String[] {""} ;
      P098B17_A758ProCod = new String[] {""} ;
      P098B25_A252CliCod = new int[1] ;
      P098B25_n252CliCod = new boolean[] {false} ;
      P098B25_A213BarSit = new byte[1] ;
      P098B25_A153BarFasEst = new byte[1] ;
      P098B25_A460FasDsc = new String[] {""} ;
      P098B25_A457FasCod = new String[] {""} ;
      P098B25_A603MaqCodBis = new String[] {""} ;
      P098B25_A218BarTipCol = new byte[1] ;
      P098B25_A136BarColNum = new int[1] ;
      P098B25_A135BarColNom = new String[] {""} ;
      P098B25_A1652BarSerDsc = new String[] {""} ;
      P098B25_A212BarSer = new String[] {""} ;
      P098B25_A13696BarNHdr = new String[] {""} ;
      P098B25_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B25_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B25_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B25_A279CliNom = new String[] {""} ;
      P098B25_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B25_n156BarFecCum = new boolean[] {false} ;
      P098B25_A151BarFasCod = new String[] {""} ;
      P098B25_n151BarFasCod = new boolean[] {false} ;
      P098B25_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B25_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B25_A143BarDisNum = new String[] {""} ;
      P098B25_A4812BarEncCli = new String[] {""} ;
      P098B25_A199BarPie1 = new short[1] ;
      P098B25_A365DisDes = new String[] {""} ;
      P098B25_A898BarPieNDes = new int[1] ;
      P098B25_A194BarOrdLin = new short[1] ;
      P098B25_A130BarCodPar = new String[] {""} ;
      P098B25_A132BarCodReo = new byte[1] ;
      P098B25_A129BarCod = new int[1] ;
      P098B25_A396EmprCod = new String[] {""} ;
      P098B25_A758ProCod = new String[] {""} ;
      P098B33_A252CliCod = new int[1] ;
      P098B33_n252CliCod = new boolean[] {false} ;
      P098B33_A212BarSer = new String[] {""} ;
      P098B33_A213BarSit = new byte[1] ;
      P098B33_A153BarFasEst = new byte[1] ;
      P098B33_A460FasDsc = new String[] {""} ;
      P098B33_A457FasCod = new String[] {""} ;
      P098B33_A603MaqCodBis = new String[] {""} ;
      P098B33_A218BarTipCol = new byte[1] ;
      P098B33_A136BarColNum = new int[1] ;
      P098B33_A135BarColNom = new String[] {""} ;
      P098B33_A1652BarSerDsc = new String[] {""} ;
      P098B33_A13696BarNHdr = new String[] {""} ;
      P098B33_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B33_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B33_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B33_A279CliNom = new String[] {""} ;
      P098B33_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B33_n156BarFecCum = new boolean[] {false} ;
      P098B33_A151BarFasCod = new String[] {""} ;
      P098B33_n151BarFasCod = new boolean[] {false} ;
      P098B33_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B33_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B33_A143BarDisNum = new String[] {""} ;
      P098B33_A4812BarEncCli = new String[] {""} ;
      P098B33_A199BarPie1 = new short[1] ;
      P098B33_A365DisDes = new String[] {""} ;
      P098B33_A898BarPieNDes = new int[1] ;
      P098B33_A194BarOrdLin = new short[1] ;
      P098B33_A130BarCodPar = new String[] {""} ;
      P098B33_A132BarCodReo = new byte[1] ;
      P098B33_A129BarCod = new int[1] ;
      P098B33_A396EmprCod = new String[] {""} ;
      P098B33_A758ProCod = new String[] {""} ;
      P098B41_A252CliCod = new int[1] ;
      P098B41_n252CliCod = new boolean[] {false} ;
      P098B41_A1652BarSerDsc = new String[] {""} ;
      P098B41_A213BarSit = new byte[1] ;
      P098B41_A153BarFasEst = new byte[1] ;
      P098B41_A460FasDsc = new String[] {""} ;
      P098B41_A457FasCod = new String[] {""} ;
      P098B41_A603MaqCodBis = new String[] {""} ;
      P098B41_A218BarTipCol = new byte[1] ;
      P098B41_A136BarColNum = new int[1] ;
      P098B41_A135BarColNom = new String[] {""} ;
      P098B41_A212BarSer = new String[] {""} ;
      P098B41_A13696BarNHdr = new String[] {""} ;
      P098B41_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B41_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B41_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B41_A279CliNom = new String[] {""} ;
      P098B41_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B41_n156BarFecCum = new boolean[] {false} ;
      P098B41_A151BarFasCod = new String[] {""} ;
      P098B41_n151BarFasCod = new boolean[] {false} ;
      P098B41_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B41_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B41_A143BarDisNum = new String[] {""} ;
      P098B41_A4812BarEncCli = new String[] {""} ;
      P098B41_A199BarPie1 = new short[1] ;
      P098B41_A365DisDes = new String[] {""} ;
      P098B41_A898BarPieNDes = new int[1] ;
      P098B41_A194BarOrdLin = new short[1] ;
      P098B41_A130BarCodPar = new String[] {""} ;
      P098B41_A132BarCodReo = new byte[1] ;
      P098B41_A129BarCod = new int[1] ;
      P098B41_A396EmprCod = new String[] {""} ;
      P098B41_A758ProCod = new String[] {""} ;
      P098B49_A252CliCod = new int[1] ;
      P098B49_n252CliCod = new boolean[] {false} ;
      P098B49_A135BarColNom = new String[] {""} ;
      P098B49_A213BarSit = new byte[1] ;
      P098B49_A153BarFasEst = new byte[1] ;
      P098B49_A460FasDsc = new String[] {""} ;
      P098B49_A457FasCod = new String[] {""} ;
      P098B49_A603MaqCodBis = new String[] {""} ;
      P098B49_A218BarTipCol = new byte[1] ;
      P098B49_A136BarColNum = new int[1] ;
      P098B49_A1652BarSerDsc = new String[] {""} ;
      P098B49_A212BarSer = new String[] {""} ;
      P098B49_A13696BarNHdr = new String[] {""} ;
      P098B49_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B49_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B49_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B49_A279CliNom = new String[] {""} ;
      P098B49_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B49_n156BarFecCum = new boolean[] {false} ;
      P098B49_A151BarFasCod = new String[] {""} ;
      P098B49_n151BarFasCod = new boolean[] {false} ;
      P098B49_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B49_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B49_A143BarDisNum = new String[] {""} ;
      P098B49_A4812BarEncCli = new String[] {""} ;
      P098B49_A199BarPie1 = new short[1] ;
      P098B49_A365DisDes = new String[] {""} ;
      P098B49_A898BarPieNDes = new int[1] ;
      P098B49_A194BarOrdLin = new short[1] ;
      P098B49_A130BarCodPar = new String[] {""} ;
      P098B49_A132BarCodReo = new byte[1] ;
      P098B49_A129BarCod = new int[1] ;
      P098B49_A396EmprCod = new String[] {""} ;
      P098B49_A758ProCod = new String[] {""} ;
      P098B57_A252CliCod = new int[1] ;
      P098B57_n252CliCod = new boolean[] {false} ;
      P098B57_A603MaqCodBis = new String[] {""} ;
      P098B57_A213BarSit = new byte[1] ;
      P098B57_A153BarFasEst = new byte[1] ;
      P098B57_A460FasDsc = new String[] {""} ;
      P098B57_A457FasCod = new String[] {""} ;
      P098B57_A218BarTipCol = new byte[1] ;
      P098B57_A136BarColNum = new int[1] ;
      P098B57_A135BarColNom = new String[] {""} ;
      P098B57_A1652BarSerDsc = new String[] {""} ;
      P098B57_A212BarSer = new String[] {""} ;
      P098B57_A13696BarNHdr = new String[] {""} ;
      P098B57_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B57_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B57_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B57_A279CliNom = new String[] {""} ;
      P098B57_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B57_n156BarFecCum = new boolean[] {false} ;
      P098B57_A151BarFasCod = new String[] {""} ;
      P098B57_n151BarFasCod = new boolean[] {false} ;
      P098B57_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B57_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B57_A143BarDisNum = new String[] {""} ;
      P098B57_A4812BarEncCli = new String[] {""} ;
      P098B57_A199BarPie1 = new short[1] ;
      P098B57_A365DisDes = new String[] {""} ;
      P098B57_A898BarPieNDes = new int[1] ;
      P098B57_A194BarOrdLin = new short[1] ;
      P098B57_A130BarCodPar = new String[] {""} ;
      P098B57_A132BarCodReo = new byte[1] ;
      P098B57_A129BarCod = new int[1] ;
      P098B57_A396EmprCod = new String[] {""} ;
      P098B57_A758ProCod = new String[] {""} ;
      P098B65_A252CliCod = new int[1] ;
      P098B65_n252CliCod = new boolean[] {false} ;
      P098B65_A457FasCod = new String[] {""} ;
      P098B65_A213BarSit = new byte[1] ;
      P098B65_A153BarFasEst = new byte[1] ;
      P098B65_A460FasDsc = new String[] {""} ;
      P098B65_A603MaqCodBis = new String[] {""} ;
      P098B65_A218BarTipCol = new byte[1] ;
      P098B65_A136BarColNum = new int[1] ;
      P098B65_A135BarColNom = new String[] {""} ;
      P098B65_A1652BarSerDsc = new String[] {""} ;
      P098B65_A212BarSer = new String[] {""} ;
      P098B65_A13696BarNHdr = new String[] {""} ;
      P098B65_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B65_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B65_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B65_A279CliNom = new String[] {""} ;
      P098B65_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B65_n156BarFecCum = new boolean[] {false} ;
      P098B65_A151BarFasCod = new String[] {""} ;
      P098B65_n151BarFasCod = new boolean[] {false} ;
      P098B65_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B65_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B65_A143BarDisNum = new String[] {""} ;
      P098B65_A4812BarEncCli = new String[] {""} ;
      P098B65_A199BarPie1 = new short[1] ;
      P098B65_A365DisDes = new String[] {""} ;
      P098B65_A898BarPieNDes = new int[1] ;
      P098B65_A194BarOrdLin = new short[1] ;
      P098B65_A130BarCodPar = new String[] {""} ;
      P098B65_A132BarCodReo = new byte[1] ;
      P098B65_A129BarCod = new int[1] ;
      P098B65_A396EmprCod = new String[] {""} ;
      P098B65_A758ProCod = new String[] {""} ;
      AV89OptionDesc = "" ;
      P098B73_A252CliCod = new int[1] ;
      P098B73_n252CliCod = new boolean[] {false} ;
      P098B73_A460FasDsc = new String[] {""} ;
      P098B73_A213BarSit = new byte[1] ;
      P098B73_A153BarFasEst = new byte[1] ;
      P098B73_A457FasCod = new String[] {""} ;
      P098B73_A603MaqCodBis = new String[] {""} ;
      P098B73_A218BarTipCol = new byte[1] ;
      P098B73_A136BarColNum = new int[1] ;
      P098B73_A135BarColNom = new String[] {""} ;
      P098B73_A1652BarSerDsc = new String[] {""} ;
      P098B73_A212BarSer = new String[] {""} ;
      P098B73_A13696BarNHdr = new String[] {""} ;
      P098B73_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B73_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B73_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B73_A279CliNom = new String[] {""} ;
      P098B73_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B73_n156BarFecCum = new boolean[] {false} ;
      P098B73_A151BarFasCod = new String[] {""} ;
      P098B73_n151BarFasCod = new boolean[] {false} ;
      P098B73_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B73_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B73_A143BarDisNum = new String[] {""} ;
      P098B73_A4812BarEncCli = new String[] {""} ;
      P098B73_A199BarPie1 = new short[1] ;
      P098B73_A365DisDes = new String[] {""} ;
      P098B73_A898BarPieNDes = new int[1] ;
      P098B73_A194BarOrdLin = new short[1] ;
      P098B73_A130BarCodPar = new String[] {""} ;
      P098B73_A132BarCodReo = new byte[1] ;
      P098B73_A129BarCod = new int[1] ;
      P098B73_A396EmprCod = new String[] {""} ;
      P098B73_A758ProCod = new String[] {""} ;
      P098B81_A252CliCod = new int[1] ;
      P098B81_n252CliCod = new boolean[] {false} ;
      P098B81_A213BarSit = new byte[1] ;
      P098B81_A153BarFasEst = new byte[1] ;
      P098B81_A460FasDsc = new String[] {""} ;
      P098B81_A457FasCod = new String[] {""} ;
      P098B81_A603MaqCodBis = new String[] {""} ;
      P098B81_A218BarTipCol = new byte[1] ;
      P098B81_A136BarColNum = new int[1] ;
      P098B81_A135BarColNom = new String[] {""} ;
      P098B81_A1652BarSerDsc = new String[] {""} ;
      P098B81_A212BarSer = new String[] {""} ;
      P098B81_A13696BarNHdr = new String[] {""} ;
      P098B81_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P098B81_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P098B81_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P098B81_A279CliNom = new String[] {""} ;
      P098B81_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P098B81_n156BarFecCum = new boolean[] {false} ;
      P098B81_A151BarFasCod = new String[] {""} ;
      P098B81_n151BarFasCod = new boolean[] {false} ;
      P098B81_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B81_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098B81_A143BarDisNum = new String[] {""} ;
      P098B81_A4812BarEncCli = new String[] {""} ;
      P098B81_A199BarPie1 = new short[1] ;
      P098B81_A365DisDes = new String[] {""} ;
      P098B81_A898BarPieNDes = new int[1] ;
      P098B81_A194BarOrdLin = new short[1] ;
      P098B81_A130BarCodPar = new String[] {""} ;
      P098B81_A132BarCodReo = new byte[1] ;
      P098B81_A129BarCod = new int[1] ;
      P098B81_A396EmprCod = new String[] {""} ;
      P098B81_A758ProCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_int10 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cargasporseccion_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P098B9_A252CliCod, P098B9_n252CliCod, P098B9_A279CliNom, P098B9_A213BarSit, P098B9_A153BarFasEst, P098B9_A460FasDsc, P098B9_A457FasCod, P098B9_A603MaqCodBis, P098B9_A218BarTipCol, P098B9_A136BarColNum,
            P098B9_A135BarColNom, P098B9_A1652BarSerDsc, P098B9_A212BarSer, P098B9_A13696BarNHdr, P098B9_A159BarFecGen, P098B9_A158BarFecFpr, P098B9_A155BarFecCli, P098B9_A156BarFecCum, P098B9_n156BarFecCum, P098B9_A151BarFasCod,
            P098B9_n151BarFasCod, P098B9_A166BarKgm, P098B9_A184BarMtr, P098B9_A143BarDisNum, P098B9_A4812BarEncCli, P098B9_A199BarPie1, P098B9_A365DisDes, P098B9_A898BarPieNDes, P098B9_A194BarOrdLin, P098B9_A130BarCodPar,
            P098B9_A132BarCodReo, P098B9_A129BarCod, P098B9_A396EmprCod, P098B9_A758ProCod
            }
            , new Object[] {
            P098B17_A252CliCod, P098B17_n252CliCod, P098B17_A213BarSit, P098B17_A153BarFasEst, P098B17_A460FasDsc, P098B17_A457FasCod, P098B17_A603MaqCodBis, P098B17_A218BarTipCol, P098B17_A136BarColNum, P098B17_A135BarColNom,
            P098B17_A1652BarSerDsc, P098B17_A212BarSer, P098B17_A13696BarNHdr, P098B17_A159BarFecGen, P098B17_A158BarFecFpr, P098B17_A155BarFecCli, P098B17_A279CliNom, P098B17_A156BarFecCum, P098B17_n156BarFecCum, P098B17_A151BarFasCod,
            P098B17_n151BarFasCod, P098B17_A166BarKgm, P098B17_A184BarMtr, P098B17_A143BarDisNum, P098B17_A4812BarEncCli, P098B17_A199BarPie1, P098B17_A365DisDes, P098B17_A898BarPieNDes, P098B17_A194BarOrdLin, P098B17_A130BarCodPar,
            P098B17_A132BarCodReo, P098B17_A129BarCod, P098B17_A396EmprCod, P098B17_A758ProCod
            }
            , new Object[] {
            P098B25_A252CliCod, P098B25_n252CliCod, P098B25_A213BarSit, P098B25_A153BarFasEst, P098B25_A460FasDsc, P098B25_A457FasCod, P098B25_A603MaqCodBis, P098B25_A218BarTipCol, P098B25_A136BarColNum, P098B25_A135BarColNom,
            P098B25_A1652BarSerDsc, P098B25_A212BarSer, P098B25_A13696BarNHdr, P098B25_A159BarFecGen, P098B25_A158BarFecFpr, P098B25_A155BarFecCli, P098B25_A279CliNom, P098B25_A156BarFecCum, P098B25_n156BarFecCum, P098B25_A151BarFasCod,
            P098B25_n151BarFasCod, P098B25_A166BarKgm, P098B25_A184BarMtr, P098B25_A143BarDisNum, P098B25_A4812BarEncCli, P098B25_A199BarPie1, P098B25_A365DisDes, P098B25_A898BarPieNDes, P098B25_A194BarOrdLin, P098B25_A130BarCodPar,
            P098B25_A132BarCodReo, P098B25_A129BarCod, P098B25_A396EmprCod, P098B25_A758ProCod
            }
            , new Object[] {
            P098B33_A252CliCod, P098B33_n252CliCod, P098B33_A212BarSer, P098B33_A213BarSit, P098B33_A153BarFasEst, P098B33_A460FasDsc, P098B33_A457FasCod, P098B33_A603MaqCodBis, P098B33_A218BarTipCol, P098B33_A136BarColNum,
            P098B33_A135BarColNom, P098B33_A1652BarSerDsc, P098B33_A13696BarNHdr, P098B33_A159BarFecGen, P098B33_A158BarFecFpr, P098B33_A155BarFecCli, P098B33_A279CliNom, P098B33_A156BarFecCum, P098B33_n156BarFecCum, P098B33_A151BarFasCod,
            P098B33_n151BarFasCod, P098B33_A166BarKgm, P098B33_A184BarMtr, P098B33_A143BarDisNum, P098B33_A4812BarEncCli, P098B33_A199BarPie1, P098B33_A365DisDes, P098B33_A898BarPieNDes, P098B33_A194BarOrdLin, P098B33_A130BarCodPar,
            P098B33_A132BarCodReo, P098B33_A129BarCod, P098B33_A396EmprCod, P098B33_A758ProCod
            }
            , new Object[] {
            P098B41_A252CliCod, P098B41_n252CliCod, P098B41_A1652BarSerDsc, P098B41_A213BarSit, P098B41_A153BarFasEst, P098B41_A460FasDsc, P098B41_A457FasCod, P098B41_A603MaqCodBis, P098B41_A218BarTipCol, P098B41_A136BarColNum,
            P098B41_A135BarColNom, P098B41_A212BarSer, P098B41_A13696BarNHdr, P098B41_A159BarFecGen, P098B41_A158BarFecFpr, P098B41_A155BarFecCli, P098B41_A279CliNom, P098B41_A156BarFecCum, P098B41_n156BarFecCum, P098B41_A151BarFasCod,
            P098B41_n151BarFasCod, P098B41_A166BarKgm, P098B41_A184BarMtr, P098B41_A143BarDisNum, P098B41_A4812BarEncCli, P098B41_A199BarPie1, P098B41_A365DisDes, P098B41_A898BarPieNDes, P098B41_A194BarOrdLin, P098B41_A130BarCodPar,
            P098B41_A132BarCodReo, P098B41_A129BarCod, P098B41_A396EmprCod, P098B41_A758ProCod
            }
            , new Object[] {
            P098B49_A252CliCod, P098B49_n252CliCod, P098B49_A135BarColNom, P098B49_A213BarSit, P098B49_A153BarFasEst, P098B49_A460FasDsc, P098B49_A457FasCod, P098B49_A603MaqCodBis, P098B49_A218BarTipCol, P098B49_A136BarColNum,
            P098B49_A1652BarSerDsc, P098B49_A212BarSer, P098B49_A13696BarNHdr, P098B49_A159BarFecGen, P098B49_A158BarFecFpr, P098B49_A155BarFecCli, P098B49_A279CliNom, P098B49_A156BarFecCum, P098B49_n156BarFecCum, P098B49_A151BarFasCod,
            P098B49_n151BarFasCod, P098B49_A166BarKgm, P098B49_A184BarMtr, P098B49_A143BarDisNum, P098B49_A4812BarEncCli, P098B49_A199BarPie1, P098B49_A365DisDes, P098B49_A898BarPieNDes, P098B49_A194BarOrdLin, P098B49_A130BarCodPar,
            P098B49_A132BarCodReo, P098B49_A129BarCod, P098B49_A396EmprCod, P098B49_A758ProCod
            }
            , new Object[] {
            P098B57_A252CliCod, P098B57_n252CliCod, P098B57_A603MaqCodBis, P098B57_A213BarSit, P098B57_A153BarFasEst, P098B57_A460FasDsc, P098B57_A457FasCod, P098B57_A218BarTipCol, P098B57_A136BarColNum, P098B57_A135BarColNom,
            P098B57_A1652BarSerDsc, P098B57_A212BarSer, P098B57_A13696BarNHdr, P098B57_A159BarFecGen, P098B57_A158BarFecFpr, P098B57_A155BarFecCli, P098B57_A279CliNom, P098B57_A156BarFecCum, P098B57_n156BarFecCum, P098B57_A151BarFasCod,
            P098B57_n151BarFasCod, P098B57_A166BarKgm, P098B57_A184BarMtr, P098B57_A143BarDisNum, P098B57_A4812BarEncCli, P098B57_A199BarPie1, P098B57_A365DisDes, P098B57_A898BarPieNDes, P098B57_A194BarOrdLin, P098B57_A130BarCodPar,
            P098B57_A132BarCodReo, P098B57_A129BarCod, P098B57_A396EmprCod, P098B57_A758ProCod
            }
            , new Object[] {
            P098B65_A252CliCod, P098B65_n252CliCod, P098B65_A457FasCod, P098B65_A213BarSit, P098B65_A153BarFasEst, P098B65_A460FasDsc, P098B65_A603MaqCodBis, P098B65_A218BarTipCol, P098B65_A136BarColNum, P098B65_A135BarColNom,
            P098B65_A1652BarSerDsc, P098B65_A212BarSer, P098B65_A13696BarNHdr, P098B65_A159BarFecGen, P098B65_A158BarFecFpr, P098B65_A155BarFecCli, P098B65_A279CliNom, P098B65_A156BarFecCum, P098B65_n156BarFecCum, P098B65_A151BarFasCod,
            P098B65_n151BarFasCod, P098B65_A166BarKgm, P098B65_A184BarMtr, P098B65_A143BarDisNum, P098B65_A4812BarEncCli, P098B65_A199BarPie1, P098B65_A365DisDes, P098B65_A898BarPieNDes, P098B65_A194BarOrdLin, P098B65_A130BarCodPar,
            P098B65_A132BarCodReo, P098B65_A129BarCod, P098B65_A396EmprCod, P098B65_A758ProCod
            }
            , new Object[] {
            P098B73_A252CliCod, P098B73_n252CliCod, P098B73_A460FasDsc, P098B73_A213BarSit, P098B73_A153BarFasEst, P098B73_A457FasCod, P098B73_A603MaqCodBis, P098B73_A218BarTipCol, P098B73_A136BarColNum, P098B73_A135BarColNom,
            P098B73_A1652BarSerDsc, P098B73_A212BarSer, P098B73_A13696BarNHdr, P098B73_A159BarFecGen, P098B73_A158BarFecFpr, P098B73_A155BarFecCli, P098B73_A279CliNom, P098B73_A156BarFecCum, P098B73_n156BarFecCum, P098B73_A151BarFasCod,
            P098B73_n151BarFasCod, P098B73_A166BarKgm, P098B73_A184BarMtr, P098B73_A143BarDisNum, P098B73_A4812BarEncCli, P098B73_A199BarPie1, P098B73_A365DisDes, P098B73_A898BarPieNDes, P098B73_A194BarOrdLin, P098B73_A130BarCodPar,
            P098B73_A132BarCodReo, P098B73_A129BarCod, P098B73_A396EmprCod, P098B73_A758ProCod
            }
            , new Object[] {
            P098B81_A252CliCod, P098B81_n252CliCod, P098B81_A213BarSit, P098B81_A153BarFasEst, P098B81_A460FasDsc, P098B81_A457FasCod, P098B81_A603MaqCodBis, P098B81_A218BarTipCol, P098B81_A136BarColNum, P098B81_A135BarColNom,
            P098B81_A1652BarSerDsc, P098B81_A212BarSer, P098B81_A13696BarNHdr, P098B81_A159BarFecGen, P098B81_A158BarFecFpr, P098B81_A155BarFecCli, P098B81_A279CliNom, P098B81_A156BarFecCum, P098B81_n156BarFecCum, P098B81_A151BarFasCod,
            P098B81_n151BarFasCod, P098B81_A166BarKgm, P098B81_A184BarMtr, P098B81_A143BarDisNum, P098B81_A4812BarEncCli, P098B81_A199BarPie1, P098B81_A365DisDes, P098B81_A898BarPieNDes, P098B81_A194BarOrdLin, P098B81_A130BarCodPar,
            P098B81_A132BarCodReo, P098B81_A129BarCod, P098B81_A396EmprCod, P098B81_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV124TFBarTipCol ;
   private byte AV125TFBarTipCol_To ;
   private byte AV140TFBarSit ;
   private byte AV141TFBarSit_To ;
   private byte AV145Barcodreo ;
   private byte AV175Cargasporseccion_wcds_22_tfbartipcol ;
   private byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ;
   private byte AV196Cargasporseccion_wcds_43_tfbarsit ;
   private byte AV197Cargasporseccion_wcds_44_tfbarsit_to ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte GXv_int9[] ;
   private short AV20TFBarOrdLin ;
   private short AV21TFBarOrdLin_To ;
   private short AV177Cargasporseccion_wcds_24_tfbarordlin ;
   private short AV178Cargasporseccion_wcds_25_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short A13889FaseAnteri ;
   private short A199BarPie1 ;
   private short GXt_int7 ;
   private short GXv_int11[] ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV152GXV1 ;
   private int AV122TFBarColNum ;
   private int AV123TFBarColNum_To ;
   private int AV134TFBarPie ;
   private int AV135TFBarPie_To ;
   private int AV144Barcod ;
   private int AV173Cargasporseccion_wcds_20_tfbarcolnum ;
   private int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ;
   private int AV190Cargasporseccion_wcds_37_tfbarpie ;
   private int AV191Cargasporseccion_wcds_38_tfbarpie_to ;
   private int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ;
   private int AV103FasesColeccion_size ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int AV85InsertIndex ;
   private int GXv_int8[] ;
   private long AV94count ;
   private java.math.BigDecimal AV130TFBarMtr ;
   private java.math.BigDecimal AV131TFBarMtr_To ;
   private java.math.BigDecimal AV132TFBarkgm ;
   private java.math.BigDecimal AV133TFBarkgm_To ;
   private java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ;
   private java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ;
   private java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ;
   private java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV104TFCliNom ;
   private String AV105TFCliNom_Sel ;
   private String AV108TFPedidoCliente ;
   private String AV109TFPedidoCliente_Sel ;
   private String AV114TFBarNHdr ;
   private String AV115TFBarNHdr_Sel ;
   private String AV116TFBarSer ;
   private String AV117TFBarSer_Sel ;
   private String AV118TFBarSerDsc ;
   private String AV119TFBarSerDsc_Sel ;
   private String AV120TFBarColNom ;
   private String AV121TFBarColNom_Sel ;
   private String AV34TFMaqCodBis ;
   private String AV35TFMaqCodBis_Sel ;
   private String AV22TFFasCod ;
   private String AV23TFFasCod_Sel ;
   private String AV126TFFasDsc ;
   private String AV127TFFasDsc_Sel ;
   private String AV136TFBarFasCod ;
   private String AV137TFBarFasCod_Sel ;
   private String AV101Emprcod ;
   private String AV102MaqcodInout ;
   private String AV149TipoControl ;
   private String AV146Barcodpar ;
   private String A279CliNom ;
   private String AV155Cargasporseccion_wcds_2_tfclinom ;
   private String AV156Cargasporseccion_wcds_3_tfclinom_sel ;
   private String AV159Cargasporseccion_wcds_6_tfpedidocliente ;
   private String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ;
   private String AV165Cargasporseccion_wcds_12_tfbarnhdr ;
   private String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ;
   private String AV167Cargasporseccion_wcds_14_tfbarser ;
   private String AV168Cargasporseccion_wcds_15_tfbarser_sel ;
   private String AV169Cargasporseccion_wcds_16_tfbarserdsc ;
   private String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ;
   private String AV171Cargasporseccion_wcds_18_tfbarcolnom ;
   private String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ;
   private String AV179Cargasporseccion_wcds_26_tfmaqcodbis ;
   private String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ;
   private String AV181Cargasporseccion_wcds_28_tffascod ;
   private String AV182Cargasporseccion_wcds_29_tffascod_sel ;
   private String AV183Cargasporseccion_wcds_30_tffasdsc ;
   private String AV184Cargasporseccion_wcds_31_tffasdsc_sel ;
   private String AV192Cargasporseccion_wcds_39_tfbarfascod ;
   private String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ;
   private String scmdbuf ;
   private String lV192Cargasporseccion_wcds_39_tfbarfascod ;
   private String lV102MaqcodInout ;
   private String lV155Cargasporseccion_wcds_2_tfclinom ;
   private String lV165Cargasporseccion_wcds_12_tfbarnhdr ;
   private String lV167Cargasporseccion_wcds_14_tfbarser ;
   private String lV169Cargasporseccion_wcds_16_tfbarserdsc ;
   private String lV171Cargasporseccion_wcds_18_tfbarcolnom ;
   private String lV179Cargasporseccion_wcds_26_tfmaqcodbis ;
   private String lV181Cargasporseccion_wcds_28_tffascod ;
   private String lV183Cargasporseccion_wcds_30_tffasdsc ;
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
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private java.util.Date AV106TFBarFecCli ;
   private java.util.Date AV107TFBarFecCli_To ;
   private java.util.Date AV110TFBarFecFpr ;
   private java.util.Date AV111TFBarFecFpr_To ;
   private java.util.Date AV112TFBarFecGen ;
   private java.util.Date AV113TFBarFecGen_To ;
   private java.util.Date AV138TFBarFecCum ;
   private java.util.Date AV139TFBarFecCum_To ;
   private java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ;
   private java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ;
   private java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ;
   private java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ;
   private java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ;
   private java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ;
   private java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ;
   private java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A156BarFecCum ;
   private boolean returnInSub ;
   private boolean brk98B2 ;
   private boolean n252CliCod ;
   private boolean n156BarFecCum ;
   private boolean n151BarFasCod ;
   private boolean brk98B6 ;
   private boolean brk98B8 ;
   private boolean brk98B10 ;
   private boolean brk98B12 ;
   private boolean brk98B14 ;
   private boolean brk98B16 ;
   private String AV88OptionsJson ;
   private String AV91OptionsDescJson ;
   private String AV93OptionIndexesJson ;
   private String AV128TFBarFasEst_SelsJson ;
   private String AV84DDOName ;
   private String AV82SearchTxt ;
   private String AV83SearchTxtTo ;
   private String AV100FilterFullText ;
   private String AV148FasesToJson ;
   private String AV154Cargasporseccion_wcds_1_filterfulltext ;
   private String lV154Cargasporseccion_wcds_1_filterfulltext ;
   private String AV86Option ;
   private String AV89OptionDesc ;
   private GXSimpleCollection<Byte> AV129TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV95Session ;
   private GXSimpleCollection<String> AV103FasesColeccion ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P098B9_A252CliCod ;
   private boolean[] P098B9_n252CliCod ;
   private String[] P098B9_A279CliNom ;
   private byte[] P098B9_A213BarSit ;
   private byte[] P098B9_A153BarFasEst ;
   private String[] P098B9_A460FasDsc ;
   private String[] P098B9_A457FasCod ;
   private String[] P098B9_A603MaqCodBis ;
   private byte[] P098B9_A218BarTipCol ;
   private int[] P098B9_A136BarColNum ;
   private String[] P098B9_A135BarColNom ;
   private String[] P098B9_A1652BarSerDsc ;
   private String[] P098B9_A212BarSer ;
   private String[] P098B9_A13696BarNHdr ;
   private java.util.Date[] P098B9_A159BarFecGen ;
   private java.util.Date[] P098B9_A158BarFecFpr ;
   private java.util.Date[] P098B9_A155BarFecCli ;
   private java.util.Date[] P098B9_A156BarFecCum ;
   private boolean[] P098B9_n156BarFecCum ;
   private String[] P098B9_A151BarFasCod ;
   private boolean[] P098B9_n151BarFasCod ;
   private java.math.BigDecimal[] P098B9_A166BarKgm ;
   private java.math.BigDecimal[] P098B9_A184BarMtr ;
   private String[] P098B9_A143BarDisNum ;
   private String[] P098B9_A4812BarEncCli ;
   private short[] P098B9_A199BarPie1 ;
   private String[] P098B9_A365DisDes ;
   private int[] P098B9_A898BarPieNDes ;
   private short[] P098B9_A194BarOrdLin ;
   private String[] P098B9_A130BarCodPar ;
   private byte[] P098B9_A132BarCodReo ;
   private int[] P098B9_A129BarCod ;
   private String[] P098B9_A396EmprCod ;
   private String[] P098B9_A758ProCod ;
   private int[] P098B17_A252CliCod ;
   private boolean[] P098B17_n252CliCod ;
   private byte[] P098B17_A213BarSit ;
   private byte[] P098B17_A153BarFasEst ;
   private String[] P098B17_A460FasDsc ;
   private String[] P098B17_A457FasCod ;
   private String[] P098B17_A603MaqCodBis ;
   private byte[] P098B17_A218BarTipCol ;
   private int[] P098B17_A136BarColNum ;
   private String[] P098B17_A135BarColNom ;
   private String[] P098B17_A1652BarSerDsc ;
   private String[] P098B17_A212BarSer ;
   private String[] P098B17_A13696BarNHdr ;
   private java.util.Date[] P098B17_A159BarFecGen ;
   private java.util.Date[] P098B17_A158BarFecFpr ;
   private java.util.Date[] P098B17_A155BarFecCli ;
   private String[] P098B17_A279CliNom ;
   private java.util.Date[] P098B17_A156BarFecCum ;
   private boolean[] P098B17_n156BarFecCum ;
   private String[] P098B17_A151BarFasCod ;
   private boolean[] P098B17_n151BarFasCod ;
   private java.math.BigDecimal[] P098B17_A166BarKgm ;
   private java.math.BigDecimal[] P098B17_A184BarMtr ;
   private String[] P098B17_A143BarDisNum ;
   private String[] P098B17_A4812BarEncCli ;
   private short[] P098B17_A199BarPie1 ;
   private String[] P098B17_A365DisDes ;
   private int[] P098B17_A898BarPieNDes ;
   private short[] P098B17_A194BarOrdLin ;
   private String[] P098B17_A130BarCodPar ;
   private byte[] P098B17_A132BarCodReo ;
   private int[] P098B17_A129BarCod ;
   private String[] P098B17_A396EmprCod ;
   private String[] P098B17_A758ProCod ;
   private int[] P098B25_A252CliCod ;
   private boolean[] P098B25_n252CliCod ;
   private byte[] P098B25_A213BarSit ;
   private byte[] P098B25_A153BarFasEst ;
   private String[] P098B25_A460FasDsc ;
   private String[] P098B25_A457FasCod ;
   private String[] P098B25_A603MaqCodBis ;
   private byte[] P098B25_A218BarTipCol ;
   private int[] P098B25_A136BarColNum ;
   private String[] P098B25_A135BarColNom ;
   private String[] P098B25_A1652BarSerDsc ;
   private String[] P098B25_A212BarSer ;
   private String[] P098B25_A13696BarNHdr ;
   private java.util.Date[] P098B25_A159BarFecGen ;
   private java.util.Date[] P098B25_A158BarFecFpr ;
   private java.util.Date[] P098B25_A155BarFecCli ;
   private String[] P098B25_A279CliNom ;
   private java.util.Date[] P098B25_A156BarFecCum ;
   private boolean[] P098B25_n156BarFecCum ;
   private String[] P098B25_A151BarFasCod ;
   private boolean[] P098B25_n151BarFasCod ;
   private java.math.BigDecimal[] P098B25_A166BarKgm ;
   private java.math.BigDecimal[] P098B25_A184BarMtr ;
   private String[] P098B25_A143BarDisNum ;
   private String[] P098B25_A4812BarEncCli ;
   private short[] P098B25_A199BarPie1 ;
   private String[] P098B25_A365DisDes ;
   private int[] P098B25_A898BarPieNDes ;
   private short[] P098B25_A194BarOrdLin ;
   private String[] P098B25_A130BarCodPar ;
   private byte[] P098B25_A132BarCodReo ;
   private int[] P098B25_A129BarCod ;
   private String[] P098B25_A396EmprCod ;
   private String[] P098B25_A758ProCod ;
   private int[] P098B33_A252CliCod ;
   private boolean[] P098B33_n252CliCod ;
   private String[] P098B33_A212BarSer ;
   private byte[] P098B33_A213BarSit ;
   private byte[] P098B33_A153BarFasEst ;
   private String[] P098B33_A460FasDsc ;
   private String[] P098B33_A457FasCod ;
   private String[] P098B33_A603MaqCodBis ;
   private byte[] P098B33_A218BarTipCol ;
   private int[] P098B33_A136BarColNum ;
   private String[] P098B33_A135BarColNom ;
   private String[] P098B33_A1652BarSerDsc ;
   private String[] P098B33_A13696BarNHdr ;
   private java.util.Date[] P098B33_A159BarFecGen ;
   private java.util.Date[] P098B33_A158BarFecFpr ;
   private java.util.Date[] P098B33_A155BarFecCli ;
   private String[] P098B33_A279CliNom ;
   private java.util.Date[] P098B33_A156BarFecCum ;
   private boolean[] P098B33_n156BarFecCum ;
   private String[] P098B33_A151BarFasCod ;
   private boolean[] P098B33_n151BarFasCod ;
   private java.math.BigDecimal[] P098B33_A166BarKgm ;
   private java.math.BigDecimal[] P098B33_A184BarMtr ;
   private String[] P098B33_A143BarDisNum ;
   private String[] P098B33_A4812BarEncCli ;
   private short[] P098B33_A199BarPie1 ;
   private String[] P098B33_A365DisDes ;
   private int[] P098B33_A898BarPieNDes ;
   private short[] P098B33_A194BarOrdLin ;
   private String[] P098B33_A130BarCodPar ;
   private byte[] P098B33_A132BarCodReo ;
   private int[] P098B33_A129BarCod ;
   private String[] P098B33_A396EmprCod ;
   private String[] P098B33_A758ProCod ;
   private int[] P098B41_A252CliCod ;
   private boolean[] P098B41_n252CliCod ;
   private String[] P098B41_A1652BarSerDsc ;
   private byte[] P098B41_A213BarSit ;
   private byte[] P098B41_A153BarFasEst ;
   private String[] P098B41_A460FasDsc ;
   private String[] P098B41_A457FasCod ;
   private String[] P098B41_A603MaqCodBis ;
   private byte[] P098B41_A218BarTipCol ;
   private int[] P098B41_A136BarColNum ;
   private String[] P098B41_A135BarColNom ;
   private String[] P098B41_A212BarSer ;
   private String[] P098B41_A13696BarNHdr ;
   private java.util.Date[] P098B41_A159BarFecGen ;
   private java.util.Date[] P098B41_A158BarFecFpr ;
   private java.util.Date[] P098B41_A155BarFecCli ;
   private String[] P098B41_A279CliNom ;
   private java.util.Date[] P098B41_A156BarFecCum ;
   private boolean[] P098B41_n156BarFecCum ;
   private String[] P098B41_A151BarFasCod ;
   private boolean[] P098B41_n151BarFasCod ;
   private java.math.BigDecimal[] P098B41_A166BarKgm ;
   private java.math.BigDecimal[] P098B41_A184BarMtr ;
   private String[] P098B41_A143BarDisNum ;
   private String[] P098B41_A4812BarEncCli ;
   private short[] P098B41_A199BarPie1 ;
   private String[] P098B41_A365DisDes ;
   private int[] P098B41_A898BarPieNDes ;
   private short[] P098B41_A194BarOrdLin ;
   private String[] P098B41_A130BarCodPar ;
   private byte[] P098B41_A132BarCodReo ;
   private int[] P098B41_A129BarCod ;
   private String[] P098B41_A396EmprCod ;
   private String[] P098B41_A758ProCod ;
   private int[] P098B49_A252CliCod ;
   private boolean[] P098B49_n252CliCod ;
   private String[] P098B49_A135BarColNom ;
   private byte[] P098B49_A213BarSit ;
   private byte[] P098B49_A153BarFasEst ;
   private String[] P098B49_A460FasDsc ;
   private String[] P098B49_A457FasCod ;
   private String[] P098B49_A603MaqCodBis ;
   private byte[] P098B49_A218BarTipCol ;
   private int[] P098B49_A136BarColNum ;
   private String[] P098B49_A1652BarSerDsc ;
   private String[] P098B49_A212BarSer ;
   private String[] P098B49_A13696BarNHdr ;
   private java.util.Date[] P098B49_A159BarFecGen ;
   private java.util.Date[] P098B49_A158BarFecFpr ;
   private java.util.Date[] P098B49_A155BarFecCli ;
   private String[] P098B49_A279CliNom ;
   private java.util.Date[] P098B49_A156BarFecCum ;
   private boolean[] P098B49_n156BarFecCum ;
   private String[] P098B49_A151BarFasCod ;
   private boolean[] P098B49_n151BarFasCod ;
   private java.math.BigDecimal[] P098B49_A166BarKgm ;
   private java.math.BigDecimal[] P098B49_A184BarMtr ;
   private String[] P098B49_A143BarDisNum ;
   private String[] P098B49_A4812BarEncCli ;
   private short[] P098B49_A199BarPie1 ;
   private String[] P098B49_A365DisDes ;
   private int[] P098B49_A898BarPieNDes ;
   private short[] P098B49_A194BarOrdLin ;
   private String[] P098B49_A130BarCodPar ;
   private byte[] P098B49_A132BarCodReo ;
   private int[] P098B49_A129BarCod ;
   private String[] P098B49_A396EmprCod ;
   private String[] P098B49_A758ProCod ;
   private int[] P098B57_A252CliCod ;
   private boolean[] P098B57_n252CliCod ;
   private String[] P098B57_A603MaqCodBis ;
   private byte[] P098B57_A213BarSit ;
   private byte[] P098B57_A153BarFasEst ;
   private String[] P098B57_A460FasDsc ;
   private String[] P098B57_A457FasCod ;
   private byte[] P098B57_A218BarTipCol ;
   private int[] P098B57_A136BarColNum ;
   private String[] P098B57_A135BarColNom ;
   private String[] P098B57_A1652BarSerDsc ;
   private String[] P098B57_A212BarSer ;
   private String[] P098B57_A13696BarNHdr ;
   private java.util.Date[] P098B57_A159BarFecGen ;
   private java.util.Date[] P098B57_A158BarFecFpr ;
   private java.util.Date[] P098B57_A155BarFecCli ;
   private String[] P098B57_A279CliNom ;
   private java.util.Date[] P098B57_A156BarFecCum ;
   private boolean[] P098B57_n156BarFecCum ;
   private String[] P098B57_A151BarFasCod ;
   private boolean[] P098B57_n151BarFasCod ;
   private java.math.BigDecimal[] P098B57_A166BarKgm ;
   private java.math.BigDecimal[] P098B57_A184BarMtr ;
   private String[] P098B57_A143BarDisNum ;
   private String[] P098B57_A4812BarEncCli ;
   private short[] P098B57_A199BarPie1 ;
   private String[] P098B57_A365DisDes ;
   private int[] P098B57_A898BarPieNDes ;
   private short[] P098B57_A194BarOrdLin ;
   private String[] P098B57_A130BarCodPar ;
   private byte[] P098B57_A132BarCodReo ;
   private int[] P098B57_A129BarCod ;
   private String[] P098B57_A396EmprCod ;
   private String[] P098B57_A758ProCod ;
   private int[] P098B65_A252CliCod ;
   private boolean[] P098B65_n252CliCod ;
   private String[] P098B65_A457FasCod ;
   private byte[] P098B65_A213BarSit ;
   private byte[] P098B65_A153BarFasEst ;
   private String[] P098B65_A460FasDsc ;
   private String[] P098B65_A603MaqCodBis ;
   private byte[] P098B65_A218BarTipCol ;
   private int[] P098B65_A136BarColNum ;
   private String[] P098B65_A135BarColNom ;
   private String[] P098B65_A1652BarSerDsc ;
   private String[] P098B65_A212BarSer ;
   private String[] P098B65_A13696BarNHdr ;
   private java.util.Date[] P098B65_A159BarFecGen ;
   private java.util.Date[] P098B65_A158BarFecFpr ;
   private java.util.Date[] P098B65_A155BarFecCli ;
   private String[] P098B65_A279CliNom ;
   private java.util.Date[] P098B65_A156BarFecCum ;
   private boolean[] P098B65_n156BarFecCum ;
   private String[] P098B65_A151BarFasCod ;
   private boolean[] P098B65_n151BarFasCod ;
   private java.math.BigDecimal[] P098B65_A166BarKgm ;
   private java.math.BigDecimal[] P098B65_A184BarMtr ;
   private String[] P098B65_A143BarDisNum ;
   private String[] P098B65_A4812BarEncCli ;
   private short[] P098B65_A199BarPie1 ;
   private String[] P098B65_A365DisDes ;
   private int[] P098B65_A898BarPieNDes ;
   private short[] P098B65_A194BarOrdLin ;
   private String[] P098B65_A130BarCodPar ;
   private byte[] P098B65_A132BarCodReo ;
   private int[] P098B65_A129BarCod ;
   private String[] P098B65_A396EmprCod ;
   private String[] P098B65_A758ProCod ;
   private int[] P098B73_A252CliCod ;
   private boolean[] P098B73_n252CliCod ;
   private String[] P098B73_A460FasDsc ;
   private byte[] P098B73_A213BarSit ;
   private byte[] P098B73_A153BarFasEst ;
   private String[] P098B73_A457FasCod ;
   private String[] P098B73_A603MaqCodBis ;
   private byte[] P098B73_A218BarTipCol ;
   private int[] P098B73_A136BarColNum ;
   private String[] P098B73_A135BarColNom ;
   private String[] P098B73_A1652BarSerDsc ;
   private String[] P098B73_A212BarSer ;
   private String[] P098B73_A13696BarNHdr ;
   private java.util.Date[] P098B73_A159BarFecGen ;
   private java.util.Date[] P098B73_A158BarFecFpr ;
   private java.util.Date[] P098B73_A155BarFecCli ;
   private String[] P098B73_A279CliNom ;
   private java.util.Date[] P098B73_A156BarFecCum ;
   private boolean[] P098B73_n156BarFecCum ;
   private String[] P098B73_A151BarFasCod ;
   private boolean[] P098B73_n151BarFasCod ;
   private java.math.BigDecimal[] P098B73_A166BarKgm ;
   private java.math.BigDecimal[] P098B73_A184BarMtr ;
   private String[] P098B73_A143BarDisNum ;
   private String[] P098B73_A4812BarEncCli ;
   private short[] P098B73_A199BarPie1 ;
   private String[] P098B73_A365DisDes ;
   private int[] P098B73_A898BarPieNDes ;
   private short[] P098B73_A194BarOrdLin ;
   private String[] P098B73_A130BarCodPar ;
   private byte[] P098B73_A132BarCodReo ;
   private int[] P098B73_A129BarCod ;
   private String[] P098B73_A396EmprCod ;
   private String[] P098B73_A758ProCod ;
   private int[] P098B81_A252CliCod ;
   private boolean[] P098B81_n252CliCod ;
   private byte[] P098B81_A213BarSit ;
   private byte[] P098B81_A153BarFasEst ;
   private String[] P098B81_A460FasDsc ;
   private String[] P098B81_A457FasCod ;
   private String[] P098B81_A603MaqCodBis ;
   private byte[] P098B81_A218BarTipCol ;
   private int[] P098B81_A136BarColNum ;
   private String[] P098B81_A135BarColNom ;
   private String[] P098B81_A1652BarSerDsc ;
   private String[] P098B81_A212BarSer ;
   private String[] P098B81_A13696BarNHdr ;
   private java.util.Date[] P098B81_A159BarFecGen ;
   private java.util.Date[] P098B81_A158BarFecFpr ;
   private java.util.Date[] P098B81_A155BarFecCli ;
   private String[] P098B81_A279CliNom ;
   private java.util.Date[] P098B81_A156BarFecCum ;
   private boolean[] P098B81_n156BarFecCum ;
   private String[] P098B81_A151BarFasCod ;
   private boolean[] P098B81_n151BarFasCod ;
   private java.math.BigDecimal[] P098B81_A166BarKgm ;
   private java.math.BigDecimal[] P098B81_A184BarMtr ;
   private String[] P098B81_A143BarDisNum ;
   private String[] P098B81_A4812BarEncCli ;
   private short[] P098B81_A199BarPie1 ;
   private String[] P098B81_A365DisDes ;
   private int[] P098B81_A898BarPieNDes ;
   private short[] P098B81_A194BarOrdLin ;
   private String[] P098B81_A130BarCodPar ;
   private byte[] P098B81_A132BarCodReo ;
   private int[] P098B81_A129BarCod ;
   private String[] P098B81_A396EmprCod ;
   private String[] P098B81_A758ProCod ;
   private GXSimpleCollection<String> AV87Options ;
   private GXSimpleCollection<String> AV90OptionsDesc ;
   private GXSimpleCollection<String> AV92OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPGridState AV97GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV98GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class cargasporseccion_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P098B9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A457FasCod ,
                                          GXSimpleCollection<String> AV103FasesColeccion ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                          String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                          String AV155Cargasporseccion_wcds_2_tfclinom ,
                                          java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                          java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                          java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                          java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                          java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                          java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                          String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                          String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                          String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                          String AV167Cargasporseccion_wcds_14_tfbarser ,
                                          String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                          String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                          String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                          String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                          int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                          int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                          byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                          byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                          short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                          short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                          String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                          String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                          String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                          String AV181Cargasporseccion_wcds_28_tffascod ,
                                          String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                          String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                          int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                          java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                          java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                          byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                          byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                          String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                          String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                          int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                          int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                          String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                          String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                          java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                          String AV102MaqcodInout ,
                                          int AV103FasesColeccion_size ,
                                          short A13889FaseAnteri ,
                                          String AV149TipoControl ,
                                          int AV144Barcod ,
                                          byte AV145Barcodreo ,
                                          String AV146Barcodpar ,
                                          String A396EmprCod ,
                                          String AV101Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[52];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T4.CliNom, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P098B17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String AV101Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[52];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int15[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int15[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int15[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int15[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int15[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int15[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int15[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int15[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int15[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int15[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int15[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int15[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int15[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P098B25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String AV101Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[52];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int18[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int18[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int18[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int18[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P098B33( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String A396EmprCod ,
                                           String AV101Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[52];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSer, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int21[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int21[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int21[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int21[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int21[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int21[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int21[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int21[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int21[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSer" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_P098B41( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String A396EmprCod ,
                                           String AV101Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[52];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSerDsc, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int24[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int24[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int24[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int24[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int24[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int24[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int24[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int24[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int24[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSerDsc" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_P098B49( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String A396EmprCod ,
                                           String AV101Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[52];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarColNom, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarColNom" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_P098B57( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String AV101Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[52];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T1.MaqCodBis, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int30[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int30[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int30[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int30[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int30[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int30[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int30[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int30[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int30[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int30[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int30[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCodBis" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
   }

   protected Object[] conditional_P098B65( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String AV101Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[52];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T1.FasCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int33[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int33[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int33[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int33[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int33[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int33[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_P098B73( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String A396EmprCod ,
                                           String AV101Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[52];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T2.FasDsc, T3.BarSit, T1.BarFasEst, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int36[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int36[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int36[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int36[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int36[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int36[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int36[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int36[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int36[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int36[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int36[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int36[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int36[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int36[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int36[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int36[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int36[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int36[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
   }

   protected Object[] conditional_P098B81( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A457FasCod ,
                                           GXSimpleCollection<String> AV103FasesColeccion ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV185Cargasporseccion_wcds_32_tfbarfasest_sels ,
                                           String AV156Cargasporseccion_wcds_3_tfclinom_sel ,
                                           String AV155Cargasporseccion_wcds_2_tfclinom ,
                                           java.util.Date AV157Cargasporseccion_wcds_4_tfbarfeccli ,
                                           java.util.Date AV158Cargasporseccion_wcds_5_tfbarfeccli_to ,
                                           java.util.Date AV161Cargasporseccion_wcds_8_tfbarfecfpr ,
                                           java.util.Date AV162Cargasporseccion_wcds_9_tfbarfecfpr_to ,
                                           java.util.Date AV163Cargasporseccion_wcds_10_tfbarfecgen ,
                                           java.util.Date AV164Cargasporseccion_wcds_11_tfbarfecgen_to ,
                                           String AV166Cargasporseccion_wcds_13_tfbarnhdr_sel ,
                                           String AV165Cargasporseccion_wcds_12_tfbarnhdr ,
                                           String AV168Cargasporseccion_wcds_15_tfbarser_sel ,
                                           String AV167Cargasporseccion_wcds_14_tfbarser ,
                                           String AV170Cargasporseccion_wcds_17_tfbarserdsc_sel ,
                                           String AV169Cargasporseccion_wcds_16_tfbarserdsc ,
                                           String AV172Cargasporseccion_wcds_19_tfbarcolnom_sel ,
                                           String AV171Cargasporseccion_wcds_18_tfbarcolnom ,
                                           int AV173Cargasporseccion_wcds_20_tfbarcolnum ,
                                           int AV174Cargasporseccion_wcds_21_tfbarcolnum_to ,
                                           byte AV175Cargasporseccion_wcds_22_tfbartipcol ,
                                           byte AV176Cargasporseccion_wcds_23_tfbartipcol_to ,
                                           short AV177Cargasporseccion_wcds_24_tfbarordlin ,
                                           short AV178Cargasporseccion_wcds_25_tfbarordlin_to ,
                                           String AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel ,
                                           String AV179Cargasporseccion_wcds_26_tfmaqcodbis ,
                                           String AV182Cargasporseccion_wcds_29_tffascod_sel ,
                                           String AV181Cargasporseccion_wcds_28_tffascod ,
                                           String AV184Cargasporseccion_wcds_31_tffasdsc_sel ,
                                           String AV183Cargasporseccion_wcds_30_tffasdsc ,
                                           int AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size ,
                                           java.math.BigDecimal AV186Cargasporseccion_wcds_33_tfbarmtr ,
                                           java.math.BigDecimal AV187Cargasporseccion_wcds_34_tfbarmtr_to ,
                                           java.math.BigDecimal AV188Cargasporseccion_wcds_35_tfbarkgm ,
                                           java.math.BigDecimal AV189Cargasporseccion_wcds_36_tfbarkgm_to ,
                                           byte AV196Cargasporseccion_wcds_43_tfbarsit ,
                                           byte AV197Cargasporseccion_wcds_44_tfbarsit_to ,
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
                                           String AV154Cargasporseccion_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           String AV160Cargasporseccion_wcds_7_tfpedidocliente_sel ,
                                           String AV159Cargasporseccion_wcds_6_tfpedidocliente ,
                                           int AV190Cargasporseccion_wcds_37_tfbarpie ,
                                           int AV191Cargasporseccion_wcds_38_tfbarpie_to ,
                                           String AV193Cargasporseccion_wcds_40_tfbarfascod_sel ,
                                           String AV192Cargasporseccion_wcds_39_tfbarfascod ,
                                           java.util.Date AV194Cargasporseccion_wcds_41_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV195Cargasporseccion_wcds_42_tfbarfeccum_to ,
                                           String AV102MaqcodInout ,
                                           int AV103FasesColeccion_size ,
                                           short A13889FaseAnteri ,
                                           String AV149TipoControl ,
                                           int AV144Barcod ,
                                           byte AV145Barcodreo ,
                                           String AV146Barcodpar ,
                                           String AV101Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[52];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum," ;
      scmdbuf += " TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr," ;
      scmdbuf += " T3.BarDisNum, T3.BarEncCli, COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM" ;
      scmdbuf += " TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo =" ;
      scmdbuf += " T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo," ;
      scmdbuf += " T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin)" ;
      scmdbuf += " AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE(" ;
      scmdbuf += " T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod" ;
      scmdbuf += " AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND" ;
      scmdbuf += " T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Cargasporseccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Cargasporseccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int39[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Cargasporseccion_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int39[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Cargasporseccion_wcds_5_tfbarfeccli_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli <= ?)");
      }
      else
      {
         GXv_int39[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV161Cargasporseccion_wcds_8_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int39[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Cargasporseccion_wcds_9_tfbarfecfpr_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int39[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV163Cargasporseccion_wcds_10_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int39[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV164Cargasporseccion_wcds_11_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      }
      else
      {
         GXv_int39[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Cargasporseccion_wcds_12_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Cargasporseccion_wcds_13_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV167Cargasporseccion_wcds_14_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Cargasporseccion_wcds_15_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV169Cargasporseccion_wcds_16_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Cargasporseccion_wcds_17_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV171Cargasporseccion_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Cargasporseccion_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( ! (0==AV173Cargasporseccion_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( ! (0==AV174Cargasporseccion_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( ! (0==AV175Cargasporseccion_wcds_22_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int39[36] = (byte)(1) ;
      }
      if ( ! (0==AV176Cargasporseccion_wcds_23_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int39[37] = (byte)(1) ;
      }
      if ( ! (0==AV177Cargasporseccion_wcds_24_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int39[38] = (byte)(1) ;
      }
      if ( ! (0==AV178Cargasporseccion_wcds_25_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int39[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV179Cargasporseccion_wcds_26_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Cargasporseccion_wcds_27_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int39[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV181Cargasporseccion_wcds_28_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Cargasporseccion_wcds_29_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int39[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV183Cargasporseccion_wcds_30_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Cargasporseccion_wcds_31_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int39[45] = (byte)(1) ;
      }
      if ( AV185Cargasporseccion_wcds_32_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV185Cargasporseccion_wcds_32_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Cargasporseccion_wcds_33_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int39[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Cargasporseccion_wcds_34_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int39[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Cargasporseccion_wcds_35_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int39[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Cargasporseccion_wcds_36_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int39[49] = (byte)(1) ;
      }
      if ( ! (0==AV196Cargasporseccion_wcds_43_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int39[50] = (byte)(1) ;
      }
      if ( ! (0==AV197Cargasporseccion_wcds_44_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int39[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
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
                  return conditional_P098B9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 1 :
                  return conditional_P098B17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 2 :
                  return conditional_P098B25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 3 :
                  return conditional_P098B33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 4 :
                  return conditional_P098B41(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 5 :
                  return conditional_P098B49(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 6 :
                  return conditional_P098B57(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 7 :
                  return conditional_P098B65(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 8 :
                  return conditional_P098B73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
            case 9 :
                  return conditional_P098B81(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).byteValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098B9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B41", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B49", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B57", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B65", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098B81", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 3);
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
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 28);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 28);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               return;
      }
   }

}

