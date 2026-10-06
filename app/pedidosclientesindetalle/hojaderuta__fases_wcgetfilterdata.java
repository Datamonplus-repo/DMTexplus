package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta__fases_wcgetfilterdata extends GXProcedure
{
   public hojaderuta__fases_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__fases_wcgetfilterdata.class ), "" );
   }

   public hojaderuta__fases_wcgetfilterdata( int remoteHandle ,
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
      hojaderuta__fases_wcgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta__fases_wcgetfilterdata.this.AV52DDOName = aP0;
      hojaderuta__fases_wcgetfilterdata.this.AV53SearchTxt = aP1;
      hojaderuta__fases_wcgetfilterdata.this.AV54SearchTxtTo = aP2;
      hojaderuta__fases_wcgetfilterdata.this.aP3 = aP3;
      hojaderuta__fases_wcgetfilterdata.this.aP4 = aP4;
      hojaderuta__fases_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV42Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV45OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_FASCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_FASDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_MAQCODBIS") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_BARFASCON") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCONOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_BARFACTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFACTINOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_BARFASACAB") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASACABOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_BARFASFOR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASFOROPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV55OptionsJson = AV42Options.toJSonString(false) ;
      AV56OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV57OptionIndexesJson = AV45OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("PedidosClienteSinDetalle.HojadeRuta__Fases_WCGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta__Fases_WCGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("PedidosClienteSinDetalle.HojadeRuta__Fases_WCGridState"), null, null);
      }
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV10TFBarOrdLin = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarOrdLin_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV16TFMaqCodBis = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV17TFMaqCodBis_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCON") == 0 )
         {
            AV18TFBarFasCon = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCON_SEL") == 0 )
         {
            AV19TFBarFasCon_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST") == 0 )
         {
            AV20TFBarFasEst = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarFasEst_To = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFACTIN") == 0 )
         {
            AV22TFBarFacTin = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFACTIN_SEL") == 0 )
         {
            AV23TFBarFacTin_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASACAB") == 0 )
         {
            AV24TFBarFasAcab = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASACAB_SEL") == 0 )
         {
            AV25TFBarFasAcab_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASFOR") == 0 )
         {
            AV26TFBarFasFor = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASFOR_SEL") == 0 )
         {
            AV27TFBarFasFor_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV28TFBarTieTeo = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarTieTeo_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV30TFBarTieRea = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFBarTieRea_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV32TFBarFasDTI = localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTF") == 0 )
         {
            AV33TFBarFasDTF = localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV34TFBarFasKgm = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFBarFasKgm_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV36TFBarFasMtr = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFBarFasMtr_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV58EmprCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV59BarCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV60BarCodReo = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV61BarCodPar = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCOD") == 0 )
         {
            AV62ProCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRODSC") == 0 )
         {
            AV63ProDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BAREXT") == 0 )
         {
            AV64Barext = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISCOD") == 0 )
         {
            AV65Discod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV66BarSit = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV67Clicod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARUNIMED") == 0 )
         {
            AV68Barunimed = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARPES") == 0 )
         {
            AV69Barpes = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV70barser = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV71PedidoCliente = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV72barcolnom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV73barcolnum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARPIE") == 0 )
         {
            AV74Barpie = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARKGM") == 0 )
         {
            AV75BarKgm = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARMTR") == 0 )
         {
            AV76Barmtr = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV77CliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV78BarSerDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARAGREST") == 0 )
         {
            AV79BarAgrest = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV53SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ2 */
      pr_default.execute(0, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAGQ2 = false ;
         A396EmprCod = P0AGQ2_A396EmprCod[0] ;
         A129BarCod = P0AGQ2_A129BarCod[0] ;
         A132BarCodReo = P0AGQ2_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ2_A130BarCodPar[0] ;
         A758ProCod = P0AGQ2_A758ProCod[0] ;
         A759ProDsc = P0AGQ2_A759ProDsc[0] ;
         A457FasCod = P0AGQ2_A457FasCod[0] ;
         A3838BarFasMtr = P0AGQ2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ2_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ2_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ2_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ2_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ2_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ2_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ2_A216BarTieTeo[0] ;
         A4287BarFasFor = P0AGQ2_A4287BarFasFor[0] ;
         A4905BarFasAcab = P0AGQ2_A4905BarFasAcab[0] ;
         A150BarFacTin = P0AGQ2_A150BarFacTin[0] ;
         A153BarFasEst = P0AGQ2_A153BarFasEst[0] ;
         A152BarFasCon = P0AGQ2_A152BarFasCon[0] ;
         A603MaqCodBis = P0AGQ2_A603MaqCodBis[0] ;
         A460FasDsc = P0AGQ2_A460FasDsc[0] ;
         A194BarOrdLin = P0AGQ2_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ2_A759ProDsc[0] ;
         A460FasDsc = P0AGQ2_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AGQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ2_A129BarCod[0] == A129BarCod ) && ( P0AGQ2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ2_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ2_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ2_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ2 = false ;
            A194BarOrdLin = P0AGQ2_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV41Option = A457FasCod ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV42Options.add(AV41Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ2 )
         {
            brkAGQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV53SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ3 */
      pr_default.execute(1, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAGQ4 = false ;
         A396EmprCod = P0AGQ3_A396EmprCod[0] ;
         A129BarCod = P0AGQ3_A129BarCod[0] ;
         A132BarCodReo = P0AGQ3_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ3_A130BarCodPar[0] ;
         A758ProCod = P0AGQ3_A758ProCod[0] ;
         A759ProDsc = P0AGQ3_A759ProDsc[0] ;
         A460FasDsc = P0AGQ3_A460FasDsc[0] ;
         A3838BarFasMtr = P0AGQ3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ3_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ3_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ3_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ3_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ3_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ3_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ3_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ3_A216BarTieTeo[0] ;
         A4287BarFasFor = P0AGQ3_A4287BarFasFor[0] ;
         A4905BarFasAcab = P0AGQ3_A4905BarFasAcab[0] ;
         A150BarFacTin = P0AGQ3_A150BarFacTin[0] ;
         A153BarFasEst = P0AGQ3_A153BarFasEst[0] ;
         A152BarFasCon = P0AGQ3_A152BarFasCon[0] ;
         A603MaqCodBis = P0AGQ3_A603MaqCodBis[0] ;
         A457FasCod = P0AGQ3_A457FasCod[0] ;
         A194BarOrdLin = P0AGQ3_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ3_A759ProDsc[0] ;
         A460FasDsc = P0AGQ3_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AGQ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ3_A129BarCod[0] == A129BarCod ) && ( P0AGQ3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ3_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ3_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ3_A460FasDsc[0], A460FasDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ4 = false ;
            A457FasCod = P0AGQ3_A457FasCod[0] ;
            A194BarOrdLin = P0AGQ3_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV41Option = A460FasDsc ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ4 )
         {
            brkAGQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCodBis = AV53SearchTxt ;
      AV17TFMaqCodBis_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ4 */
      pr_default.execute(2, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAGQ6 = false ;
         A396EmprCod = P0AGQ4_A396EmprCod[0] ;
         A129BarCod = P0AGQ4_A129BarCod[0] ;
         A132BarCodReo = P0AGQ4_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ4_A130BarCodPar[0] ;
         A758ProCod = P0AGQ4_A758ProCod[0] ;
         A759ProDsc = P0AGQ4_A759ProDsc[0] ;
         A603MaqCodBis = P0AGQ4_A603MaqCodBis[0] ;
         A3838BarFasMtr = P0AGQ4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ4_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ4_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ4_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ4_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ4_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ4_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ4_A216BarTieTeo[0] ;
         A4287BarFasFor = P0AGQ4_A4287BarFasFor[0] ;
         A4905BarFasAcab = P0AGQ4_A4905BarFasAcab[0] ;
         A150BarFacTin = P0AGQ4_A150BarFacTin[0] ;
         A153BarFasEst = P0AGQ4_A153BarFasEst[0] ;
         A152BarFasCon = P0AGQ4_A152BarFasCon[0] ;
         A460FasDsc = P0AGQ4_A460FasDsc[0] ;
         A457FasCod = P0AGQ4_A457FasCod[0] ;
         A194BarOrdLin = P0AGQ4_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ4_A759ProDsc[0] ;
         A460FasDsc = P0AGQ4_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AGQ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ4_A129BarCod[0] == A129BarCod ) && ( P0AGQ4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ4_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ4_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ4_A603MaqCodBis[0], A603MaqCodBis) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ6 = false ;
            A194BarOrdLin = P0AGQ4_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV41Option = A603MaqCodBis ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ6 )
         {
            brkAGQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARFASCONOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarFasCon = AV53SearchTxt ;
      AV19TFBarFasCon_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ5 */
      pr_default.execute(3, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAGQ8 = false ;
         A396EmprCod = P0AGQ5_A396EmprCod[0] ;
         A129BarCod = P0AGQ5_A129BarCod[0] ;
         A132BarCodReo = P0AGQ5_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ5_A130BarCodPar[0] ;
         A758ProCod = P0AGQ5_A758ProCod[0] ;
         A759ProDsc = P0AGQ5_A759ProDsc[0] ;
         A152BarFasCon = P0AGQ5_A152BarFasCon[0] ;
         A3838BarFasMtr = P0AGQ5_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ5_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ5_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ5_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ5_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ5_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ5_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ5_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ5_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ5_A216BarTieTeo[0] ;
         A4287BarFasFor = P0AGQ5_A4287BarFasFor[0] ;
         A4905BarFasAcab = P0AGQ5_A4905BarFasAcab[0] ;
         A150BarFacTin = P0AGQ5_A150BarFacTin[0] ;
         A153BarFasEst = P0AGQ5_A153BarFasEst[0] ;
         A603MaqCodBis = P0AGQ5_A603MaqCodBis[0] ;
         A460FasDsc = P0AGQ5_A460FasDsc[0] ;
         A457FasCod = P0AGQ5_A457FasCod[0] ;
         A194BarOrdLin = P0AGQ5_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ5_A759ProDsc[0] ;
         A460FasDsc = P0AGQ5_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AGQ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ5_A129BarCod[0] == A129BarCod ) && ( P0AGQ5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ5_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ5_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ5_A152BarFasCon[0], A152BarFasCon) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ8 = false ;
            A194BarOrdLin = P0AGQ5_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A152BarFasCon)==0) )
         {
            AV41Option = A152BarFasCon ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A152BarFasCon, "@!"))) ;
            AV42Options.add(AV41Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ8 )
         {
            brkAGQ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARFACTINOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarFacTin = AV53SearchTxt ;
      AV23TFBarFacTin_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ6 */
      pr_default.execute(4, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAGQ10 = false ;
         A396EmprCod = P0AGQ6_A396EmprCod[0] ;
         A129BarCod = P0AGQ6_A129BarCod[0] ;
         A132BarCodReo = P0AGQ6_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ6_A130BarCodPar[0] ;
         A758ProCod = P0AGQ6_A758ProCod[0] ;
         A759ProDsc = P0AGQ6_A759ProDsc[0] ;
         A150BarFacTin = P0AGQ6_A150BarFacTin[0] ;
         A3838BarFasMtr = P0AGQ6_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ6_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ6_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ6_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ6_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ6_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ6_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ6_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ6_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ6_A216BarTieTeo[0] ;
         A4287BarFasFor = P0AGQ6_A4287BarFasFor[0] ;
         A4905BarFasAcab = P0AGQ6_A4905BarFasAcab[0] ;
         A153BarFasEst = P0AGQ6_A153BarFasEst[0] ;
         A152BarFasCon = P0AGQ6_A152BarFasCon[0] ;
         A603MaqCodBis = P0AGQ6_A603MaqCodBis[0] ;
         A460FasDsc = P0AGQ6_A460FasDsc[0] ;
         A457FasCod = P0AGQ6_A457FasCod[0] ;
         A194BarOrdLin = P0AGQ6_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ6_A759ProDsc[0] ;
         A460FasDsc = P0AGQ6_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AGQ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ6_A129BarCod[0] == A129BarCod ) && ( P0AGQ6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ6_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ6_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ6_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ6_A150BarFacTin[0], A150BarFacTin) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ10 = false ;
            A194BarOrdLin = P0AGQ6_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A150BarFacTin)==0) )
         {
            AV41Option = A150BarFacTin ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A150BarFacTin, "@!"))) ;
            AV42Options.add(AV41Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ10 )
         {
            brkAGQ10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARFASACABOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarFasAcab = AV53SearchTxt ;
      AV25TFBarFasAcab_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ7 */
      pr_default.execute(5, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAGQ12 = false ;
         A396EmprCod = P0AGQ7_A396EmprCod[0] ;
         A129BarCod = P0AGQ7_A129BarCod[0] ;
         A132BarCodReo = P0AGQ7_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ7_A130BarCodPar[0] ;
         A758ProCod = P0AGQ7_A758ProCod[0] ;
         A759ProDsc = P0AGQ7_A759ProDsc[0] ;
         A4905BarFasAcab = P0AGQ7_A4905BarFasAcab[0] ;
         A3838BarFasMtr = P0AGQ7_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ7_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ7_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ7_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ7_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ7_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ7_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ7_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ7_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ7_A216BarTieTeo[0] ;
         A4287BarFasFor = P0AGQ7_A4287BarFasFor[0] ;
         A150BarFacTin = P0AGQ7_A150BarFacTin[0] ;
         A153BarFasEst = P0AGQ7_A153BarFasEst[0] ;
         A152BarFasCon = P0AGQ7_A152BarFasCon[0] ;
         A603MaqCodBis = P0AGQ7_A603MaqCodBis[0] ;
         A460FasDsc = P0AGQ7_A460FasDsc[0] ;
         A457FasCod = P0AGQ7_A457FasCod[0] ;
         A194BarOrdLin = P0AGQ7_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ7_A759ProDsc[0] ;
         A460FasDsc = P0AGQ7_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AGQ7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ7_A129BarCod[0] == A129BarCod ) && ( P0AGQ7_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ7_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ7_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ7_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ7_A4905BarFasAcab[0], A4905BarFasAcab) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ12 = false ;
            A194BarOrdLin = P0AGQ7_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A4905BarFasAcab)==0) )
         {
            AV41Option = A4905BarFasAcab ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))) ;
            AV42Options.add(AV41Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ12 )
         {
            brkAGQ12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARFASFOROPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarFasFor = AV53SearchTxt ;
      AV27TFBarFasFor_Sel = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV58EmprCod ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV59BarCod ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV60BarCodReo ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV61BarCodPar ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV62ProCod ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV63ProDsc ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV10TFBarOrdLin ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV11TFBarOrdLin_To ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV12TFFasCod ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV14TFFasDsc ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV16TFMaqCodBis ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV17TFMaqCodBis_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV18TFBarFasCon ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV19TFBarFasCon_Sel ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV20TFBarFasEst ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV21TFBarFasEst_To ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV22TFBarFacTin ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV23TFBarFacTin_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV24TFBarFasAcab ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV25TFBarFasAcab_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV26TFBarFasFor ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV27TFBarFasFor_Sel ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV28TFBarTieTeo ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV29TFBarTieTeo_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV30TFBarTieRea ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV31TFBarTieRea_To ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV32TFBarFasDTI ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV33TFBarFasDTF ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV34TFBarFasKgm ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV35TFBarFasKgm_To ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV36TFBarFasMtr ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV37TFBarFasMtr_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A396EmprCod ,
                                           AV58EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60BarCodReo) ,
                                           A130BarCodPar ,
                                           AV61BarCodPar ,
                                           A758ProCod ,
                                           AV62ProCod ,
                                           AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                           AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A759ProDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor P0AGQ8 */
      pr_default.execute(6, new Object[] {AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV58EmprCod, Integer.valueOf(AV59BarCod), Byte.valueOf(AV60BarCodReo), AV61BarCodPar, AV62ProCod, Short.valueOf(AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAGQ14 = false ;
         A396EmprCod = P0AGQ8_A396EmprCod[0] ;
         A129BarCod = P0AGQ8_A129BarCod[0] ;
         A132BarCodReo = P0AGQ8_A132BarCodReo[0] ;
         A130BarCodPar = P0AGQ8_A130BarCodPar[0] ;
         A758ProCod = P0AGQ8_A758ProCod[0] ;
         A759ProDsc = P0AGQ8_A759ProDsc[0] ;
         A4287BarFasFor = P0AGQ8_A4287BarFasFor[0] ;
         A3838BarFasMtr = P0AGQ8_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AGQ8_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AGQ8_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AGQ8_n3837BarFasKgm[0] ;
         A4443BarFasDTF = P0AGQ8_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AGQ8_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P0AGQ8_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AGQ8_n4442BarFasDTI[0] ;
         A215BarTieRea = P0AGQ8_A215BarTieRea[0] ;
         A216BarTieTeo = P0AGQ8_A216BarTieTeo[0] ;
         A4905BarFasAcab = P0AGQ8_A4905BarFasAcab[0] ;
         A150BarFacTin = P0AGQ8_A150BarFacTin[0] ;
         A153BarFasEst = P0AGQ8_A153BarFasEst[0] ;
         A152BarFasCon = P0AGQ8_A152BarFasCon[0] ;
         A603MaqCodBis = P0AGQ8_A603MaqCodBis[0] ;
         A460FasDsc = P0AGQ8_A460FasDsc[0] ;
         A457FasCod = P0AGQ8_A457FasCod[0] ;
         A194BarOrdLin = P0AGQ8_A194BarOrdLin[0] ;
         A759ProDsc = P0AGQ8_A759ProDsc[0] ;
         A460FasDsc = P0AGQ8_A460FasDsc[0] ;
         W759ProDsc = A759ProDsc ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AGQ8_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGQ8_A129BarCod[0] == A129BarCod ) && ( P0AGQ8_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AGQ8_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AGQ8_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(P0AGQ8_A759ProDsc[0], A759ProDsc) == 0 ) && ( GXutil.strcmp(P0AGQ8_A4287BarFasFor[0], A4287BarFasFor) == 0 ) ) )
            {
               if (true) break;
            }
            brkAGQ14 = false ;
            A194BarOrdLin = P0AGQ8_A194BarOrdLin[0] ;
            AV46count = (long)(AV46count+1) ;
            brkAGQ14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A4287BarFasFor)==0) )
         {
            AV41Option = A4287BarFasFor ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))) ;
            AV42Options.add(AV41Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A759ProDsc = W759ProDsc ;
         if ( ! brkAGQ14 )
         {
            brkAGQ14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = hojaderuta__fases_wcgetfilterdata.this.AV55OptionsJson;
      this.aP4[0] = hojaderuta__fases_wcgetfilterdata.this.AV56OptionsDescJson;
      this.aP5[0] = hojaderuta__fases_wcgetfilterdata.this.AV57OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV55OptionsJson = "" ;
      AV56OptionsDescJson = "" ;
      AV57OptionIndexesJson = "" ;
      AV42Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFMaqCodBis = "" ;
      AV17TFMaqCodBis_Sel = "" ;
      AV18TFBarFasCon = "" ;
      AV19TFBarFasCon_Sel = "" ;
      AV22TFBarFacTin = "" ;
      AV23TFBarFacTin_Sel = "" ;
      AV24TFBarFasAcab = "" ;
      AV25TFBarFasAcab_Sel = "" ;
      AV26TFBarFasFor = "" ;
      AV27TFBarFasFor_Sel = "" ;
      AV28TFBarTieTeo = DecimalUtil.ZERO ;
      AV29TFBarTieTeo_To = DecimalUtil.ZERO ;
      AV30TFBarTieRea = DecimalUtil.ZERO ;
      AV31TFBarTieRea_To = DecimalUtil.ZERO ;
      AV32TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV33TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV34TFBarFasKgm = DecimalUtil.ZERO ;
      AV35TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV36TFBarFasMtr = DecimalUtil.ZERO ;
      AV37TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV58EmprCod = "" ;
      AV61BarCodPar = "" ;
      AV62ProCod = "" ;
      AV63ProDsc = "" ;
      AV68Barunimed = "" ;
      AV70barser = "" ;
      AV71PedidoCliente = "" ;
      AV72barcolnom = "" ;
      AV75BarKgm = DecimalUtil.ZERO ;
      AV76Barmtr = DecimalUtil.ZERO ;
      AV77CliNom = "" ;
      AV78BarSerDsc = "" ;
      AV79BarAgrest = "" ;
      A457FasCod = "" ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = "" ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = "" ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = "" ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = "" ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = "" ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = "" ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = "" ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = "" ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = "" ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = "" ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = "" ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = "" ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = "" ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = "" ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = "" ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = "" ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = "" ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = "" ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = DecimalUtil.ZERO ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = DecimalUtil.ZERO ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = DecimalUtil.ZERO ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = DecimalUtil.ZERO ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = DecimalUtil.ZERO ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = DecimalUtil.ZERO ;
      AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = "" ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = "" ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = "" ;
      lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = "" ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = "" ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = "" ;
      lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      P0AGQ2_A396EmprCod = new String[] {""} ;
      P0AGQ2_A129BarCod = new int[1] ;
      P0AGQ2_A132BarCodReo = new byte[1] ;
      P0AGQ2_A130BarCodPar = new String[] {""} ;
      P0AGQ2_A758ProCod = new String[] {""} ;
      P0AGQ2_A759ProDsc = new String[] {""} ;
      P0AGQ2_A457FasCod = new String[] {""} ;
      P0AGQ2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ2_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ2_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ2_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ2_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ2_A4287BarFasFor = new String[] {""} ;
      P0AGQ2_A4905BarFasAcab = new String[] {""} ;
      P0AGQ2_A150BarFacTin = new String[] {""} ;
      P0AGQ2_A153BarFasEst = new byte[1] ;
      P0AGQ2_A152BarFasCon = new String[] {""} ;
      P0AGQ2_A603MaqCodBis = new String[] {""} ;
      P0AGQ2_A460FasDsc = new String[] {""} ;
      P0AGQ2_A194BarOrdLin = new short[1] ;
      W759ProDsc = "" ;
      AV41Option = "" ;
      AV43OptionDesc = "" ;
      P0AGQ3_A396EmprCod = new String[] {""} ;
      P0AGQ3_A129BarCod = new int[1] ;
      P0AGQ3_A132BarCodReo = new byte[1] ;
      P0AGQ3_A130BarCodPar = new String[] {""} ;
      P0AGQ3_A758ProCod = new String[] {""} ;
      P0AGQ3_A759ProDsc = new String[] {""} ;
      P0AGQ3_A460FasDsc = new String[] {""} ;
      P0AGQ3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ3_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ3_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ3_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ3_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ3_A4287BarFasFor = new String[] {""} ;
      P0AGQ3_A4905BarFasAcab = new String[] {""} ;
      P0AGQ3_A150BarFacTin = new String[] {""} ;
      P0AGQ3_A153BarFasEst = new byte[1] ;
      P0AGQ3_A152BarFasCon = new String[] {""} ;
      P0AGQ3_A603MaqCodBis = new String[] {""} ;
      P0AGQ3_A457FasCod = new String[] {""} ;
      P0AGQ3_A194BarOrdLin = new short[1] ;
      P0AGQ4_A396EmprCod = new String[] {""} ;
      P0AGQ4_A129BarCod = new int[1] ;
      P0AGQ4_A132BarCodReo = new byte[1] ;
      P0AGQ4_A130BarCodPar = new String[] {""} ;
      P0AGQ4_A758ProCod = new String[] {""} ;
      P0AGQ4_A759ProDsc = new String[] {""} ;
      P0AGQ4_A603MaqCodBis = new String[] {""} ;
      P0AGQ4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ4_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ4_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ4_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ4_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ4_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ4_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ4_A4287BarFasFor = new String[] {""} ;
      P0AGQ4_A4905BarFasAcab = new String[] {""} ;
      P0AGQ4_A150BarFacTin = new String[] {""} ;
      P0AGQ4_A153BarFasEst = new byte[1] ;
      P0AGQ4_A152BarFasCon = new String[] {""} ;
      P0AGQ4_A460FasDsc = new String[] {""} ;
      P0AGQ4_A457FasCod = new String[] {""} ;
      P0AGQ4_A194BarOrdLin = new short[1] ;
      P0AGQ5_A396EmprCod = new String[] {""} ;
      P0AGQ5_A129BarCod = new int[1] ;
      P0AGQ5_A132BarCodReo = new byte[1] ;
      P0AGQ5_A130BarCodPar = new String[] {""} ;
      P0AGQ5_A758ProCod = new String[] {""} ;
      P0AGQ5_A759ProDsc = new String[] {""} ;
      P0AGQ5_A152BarFasCon = new String[] {""} ;
      P0AGQ5_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ5_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ5_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ5_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ5_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ5_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ5_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ5_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ5_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ5_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ5_A4287BarFasFor = new String[] {""} ;
      P0AGQ5_A4905BarFasAcab = new String[] {""} ;
      P0AGQ5_A150BarFacTin = new String[] {""} ;
      P0AGQ5_A153BarFasEst = new byte[1] ;
      P0AGQ5_A603MaqCodBis = new String[] {""} ;
      P0AGQ5_A460FasDsc = new String[] {""} ;
      P0AGQ5_A457FasCod = new String[] {""} ;
      P0AGQ5_A194BarOrdLin = new short[1] ;
      P0AGQ6_A396EmprCod = new String[] {""} ;
      P0AGQ6_A129BarCod = new int[1] ;
      P0AGQ6_A132BarCodReo = new byte[1] ;
      P0AGQ6_A130BarCodPar = new String[] {""} ;
      P0AGQ6_A758ProCod = new String[] {""} ;
      P0AGQ6_A759ProDsc = new String[] {""} ;
      P0AGQ6_A150BarFacTin = new String[] {""} ;
      P0AGQ6_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ6_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ6_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ6_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ6_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ6_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ6_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ6_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ6_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ6_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ6_A4287BarFasFor = new String[] {""} ;
      P0AGQ6_A4905BarFasAcab = new String[] {""} ;
      P0AGQ6_A153BarFasEst = new byte[1] ;
      P0AGQ6_A152BarFasCon = new String[] {""} ;
      P0AGQ6_A603MaqCodBis = new String[] {""} ;
      P0AGQ6_A460FasDsc = new String[] {""} ;
      P0AGQ6_A457FasCod = new String[] {""} ;
      P0AGQ6_A194BarOrdLin = new short[1] ;
      P0AGQ7_A396EmprCod = new String[] {""} ;
      P0AGQ7_A129BarCod = new int[1] ;
      P0AGQ7_A132BarCodReo = new byte[1] ;
      P0AGQ7_A130BarCodPar = new String[] {""} ;
      P0AGQ7_A758ProCod = new String[] {""} ;
      P0AGQ7_A759ProDsc = new String[] {""} ;
      P0AGQ7_A4905BarFasAcab = new String[] {""} ;
      P0AGQ7_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ7_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ7_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ7_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ7_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ7_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ7_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ7_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ7_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ7_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ7_A4287BarFasFor = new String[] {""} ;
      P0AGQ7_A150BarFacTin = new String[] {""} ;
      P0AGQ7_A153BarFasEst = new byte[1] ;
      P0AGQ7_A152BarFasCon = new String[] {""} ;
      P0AGQ7_A603MaqCodBis = new String[] {""} ;
      P0AGQ7_A460FasDsc = new String[] {""} ;
      P0AGQ7_A457FasCod = new String[] {""} ;
      P0AGQ7_A194BarOrdLin = new short[1] ;
      P0AGQ8_A396EmprCod = new String[] {""} ;
      P0AGQ8_A129BarCod = new int[1] ;
      P0AGQ8_A132BarCodReo = new byte[1] ;
      P0AGQ8_A130BarCodPar = new String[] {""} ;
      P0AGQ8_A758ProCod = new String[] {""} ;
      P0AGQ8_A759ProDsc = new String[] {""} ;
      P0AGQ8_A4287BarFasFor = new String[] {""} ;
      P0AGQ8_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ8_n3838BarFasMtr = new boolean[] {false} ;
      P0AGQ8_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ8_n3837BarFasKgm = new boolean[] {false} ;
      P0AGQ8_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ8_n4443BarFasDTF = new boolean[] {false} ;
      P0AGQ8_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGQ8_n4442BarFasDTI = new boolean[] {false} ;
      P0AGQ8_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ8_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGQ8_A4905BarFasAcab = new String[] {""} ;
      P0AGQ8_A150BarFacTin = new String[] {""} ;
      P0AGQ8_A153BarFasEst = new byte[1] ;
      P0AGQ8_A152BarFasCon = new String[] {""} ;
      P0AGQ8_A603MaqCodBis = new String[] {""} ;
      P0AGQ8_A460FasDsc = new String[] {""} ;
      P0AGQ8_A457FasCod = new String[] {""} ;
      P0AGQ8_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__fases_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AGQ2_A396EmprCod, P0AGQ2_A129BarCod, P0AGQ2_A132BarCodReo, P0AGQ2_A130BarCodPar, P0AGQ2_A758ProCod, P0AGQ2_A759ProDsc, P0AGQ2_A457FasCod, P0AGQ2_A3838BarFasMtr, P0AGQ2_n3838BarFasMtr, P0AGQ2_A3837BarFasKgm,
            P0AGQ2_n3837BarFasKgm, P0AGQ2_A4443BarFasDTF, P0AGQ2_n4443BarFasDTF, P0AGQ2_A4442BarFasDTI, P0AGQ2_n4442BarFasDTI, P0AGQ2_A215BarTieRea, P0AGQ2_A216BarTieTeo, P0AGQ2_A4287BarFasFor, P0AGQ2_A4905BarFasAcab, P0AGQ2_A150BarFacTin,
            P0AGQ2_A153BarFasEst, P0AGQ2_A152BarFasCon, P0AGQ2_A603MaqCodBis, P0AGQ2_A460FasDsc, P0AGQ2_A194BarOrdLin
            }
            , new Object[] {
            P0AGQ3_A396EmprCod, P0AGQ3_A129BarCod, P0AGQ3_A132BarCodReo, P0AGQ3_A130BarCodPar, P0AGQ3_A758ProCod, P0AGQ3_A759ProDsc, P0AGQ3_A460FasDsc, P0AGQ3_A3838BarFasMtr, P0AGQ3_n3838BarFasMtr, P0AGQ3_A3837BarFasKgm,
            P0AGQ3_n3837BarFasKgm, P0AGQ3_A4443BarFasDTF, P0AGQ3_n4443BarFasDTF, P0AGQ3_A4442BarFasDTI, P0AGQ3_n4442BarFasDTI, P0AGQ3_A215BarTieRea, P0AGQ3_A216BarTieTeo, P0AGQ3_A4287BarFasFor, P0AGQ3_A4905BarFasAcab, P0AGQ3_A150BarFacTin,
            P0AGQ3_A153BarFasEst, P0AGQ3_A152BarFasCon, P0AGQ3_A603MaqCodBis, P0AGQ3_A457FasCod, P0AGQ3_A194BarOrdLin
            }
            , new Object[] {
            P0AGQ4_A396EmprCod, P0AGQ4_A129BarCod, P0AGQ4_A132BarCodReo, P0AGQ4_A130BarCodPar, P0AGQ4_A758ProCod, P0AGQ4_A759ProDsc, P0AGQ4_A603MaqCodBis, P0AGQ4_A3838BarFasMtr, P0AGQ4_n3838BarFasMtr, P0AGQ4_A3837BarFasKgm,
            P0AGQ4_n3837BarFasKgm, P0AGQ4_A4443BarFasDTF, P0AGQ4_n4443BarFasDTF, P0AGQ4_A4442BarFasDTI, P0AGQ4_n4442BarFasDTI, P0AGQ4_A215BarTieRea, P0AGQ4_A216BarTieTeo, P0AGQ4_A4287BarFasFor, P0AGQ4_A4905BarFasAcab, P0AGQ4_A150BarFacTin,
            P0AGQ4_A153BarFasEst, P0AGQ4_A152BarFasCon, P0AGQ4_A460FasDsc, P0AGQ4_A457FasCod, P0AGQ4_A194BarOrdLin
            }
            , new Object[] {
            P0AGQ5_A396EmprCod, P0AGQ5_A129BarCod, P0AGQ5_A132BarCodReo, P0AGQ5_A130BarCodPar, P0AGQ5_A758ProCod, P0AGQ5_A759ProDsc, P0AGQ5_A152BarFasCon, P0AGQ5_A3838BarFasMtr, P0AGQ5_n3838BarFasMtr, P0AGQ5_A3837BarFasKgm,
            P0AGQ5_n3837BarFasKgm, P0AGQ5_A4443BarFasDTF, P0AGQ5_n4443BarFasDTF, P0AGQ5_A4442BarFasDTI, P0AGQ5_n4442BarFasDTI, P0AGQ5_A215BarTieRea, P0AGQ5_A216BarTieTeo, P0AGQ5_A4287BarFasFor, P0AGQ5_A4905BarFasAcab, P0AGQ5_A150BarFacTin,
            P0AGQ5_A153BarFasEst, P0AGQ5_A603MaqCodBis, P0AGQ5_A460FasDsc, P0AGQ5_A457FasCod, P0AGQ5_A194BarOrdLin
            }
            , new Object[] {
            P0AGQ6_A396EmprCod, P0AGQ6_A129BarCod, P0AGQ6_A132BarCodReo, P0AGQ6_A130BarCodPar, P0AGQ6_A758ProCod, P0AGQ6_A759ProDsc, P0AGQ6_A150BarFacTin, P0AGQ6_A3838BarFasMtr, P0AGQ6_n3838BarFasMtr, P0AGQ6_A3837BarFasKgm,
            P0AGQ6_n3837BarFasKgm, P0AGQ6_A4443BarFasDTF, P0AGQ6_n4443BarFasDTF, P0AGQ6_A4442BarFasDTI, P0AGQ6_n4442BarFasDTI, P0AGQ6_A215BarTieRea, P0AGQ6_A216BarTieTeo, P0AGQ6_A4287BarFasFor, P0AGQ6_A4905BarFasAcab, P0AGQ6_A153BarFasEst,
            P0AGQ6_A152BarFasCon, P0AGQ6_A603MaqCodBis, P0AGQ6_A460FasDsc, P0AGQ6_A457FasCod, P0AGQ6_A194BarOrdLin
            }
            , new Object[] {
            P0AGQ7_A396EmprCod, P0AGQ7_A129BarCod, P0AGQ7_A132BarCodReo, P0AGQ7_A130BarCodPar, P0AGQ7_A758ProCod, P0AGQ7_A759ProDsc, P0AGQ7_A4905BarFasAcab, P0AGQ7_A3838BarFasMtr, P0AGQ7_n3838BarFasMtr, P0AGQ7_A3837BarFasKgm,
            P0AGQ7_n3837BarFasKgm, P0AGQ7_A4443BarFasDTF, P0AGQ7_n4443BarFasDTF, P0AGQ7_A4442BarFasDTI, P0AGQ7_n4442BarFasDTI, P0AGQ7_A215BarTieRea, P0AGQ7_A216BarTieTeo, P0AGQ7_A4287BarFasFor, P0AGQ7_A150BarFacTin, P0AGQ7_A153BarFasEst,
            P0AGQ7_A152BarFasCon, P0AGQ7_A603MaqCodBis, P0AGQ7_A460FasDsc, P0AGQ7_A457FasCod, P0AGQ7_A194BarOrdLin
            }
            , new Object[] {
            P0AGQ8_A396EmprCod, P0AGQ8_A129BarCod, P0AGQ8_A132BarCodReo, P0AGQ8_A130BarCodPar, P0AGQ8_A758ProCod, P0AGQ8_A759ProDsc, P0AGQ8_A4287BarFasFor, P0AGQ8_A3838BarFasMtr, P0AGQ8_n3838BarFasMtr, P0AGQ8_A3837BarFasKgm,
            P0AGQ8_n3837BarFasKgm, P0AGQ8_A4443BarFasDTF, P0AGQ8_n4443BarFasDTF, P0AGQ8_A4442BarFasDTI, P0AGQ8_n4442BarFasDTI, P0AGQ8_A215BarTieRea, P0AGQ8_A216BarTieTeo, P0AGQ8_A4905BarFasAcab, P0AGQ8_A150BarFacTin, P0AGQ8_A153BarFasEst,
            P0AGQ8_A152BarFasCon, P0AGQ8_A603MaqCodBis, P0AGQ8_A460FasDsc, P0AGQ8_A457FasCod, P0AGQ8_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFBarFasEst ;
   private byte AV21TFBarFasEst_To ;
   private byte AV60BarCodReo ;
   private byte AV64Barext ;
   private byte AV66BarSit ;
   private byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ;
   private byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ;
   private byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short AV69Barpes ;
   private short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ;
   private short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV82GXV1 ;
   private int AV59BarCod ;
   private int AV65Discod ;
   private int AV67Clicod ;
   private int AV73barcolnum ;
   private int AV74Barpie ;
   private int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ;
   private int A129BarCod ;
   private long AV46count ;
   private java.math.BigDecimal AV28TFBarTieTeo ;
   private java.math.BigDecimal AV29TFBarTieTeo_To ;
   private java.math.BigDecimal AV30TFBarTieRea ;
   private java.math.BigDecimal AV31TFBarTieRea_To ;
   private java.math.BigDecimal AV34TFBarFasKgm ;
   private java.math.BigDecimal AV35TFBarFasKgm_To ;
   private java.math.BigDecimal AV36TFBarFasMtr ;
   private java.math.BigDecimal AV37TFBarFasMtr_To ;
   private java.math.BigDecimal AV75BarKgm ;
   private java.math.BigDecimal AV76Barmtr ;
   private java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ;
   private java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ;
   private java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ;
   private java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ;
   private java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ;
   private java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ;
   private java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ;
   private java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFMaqCodBis ;
   private String AV17TFMaqCodBis_Sel ;
   private String AV18TFBarFasCon ;
   private String AV19TFBarFasCon_Sel ;
   private String AV22TFBarFacTin ;
   private String AV23TFBarFacTin_Sel ;
   private String AV24TFBarFasAcab ;
   private String AV25TFBarFasAcab_Sel ;
   private String AV26TFBarFasFor ;
   private String AV27TFBarFasFor_Sel ;
   private String AV58EmprCod ;
   private String AV61BarCodPar ;
   private String AV62ProCod ;
   private String AV63ProDsc ;
   private String AV68Barunimed ;
   private String AV70barser ;
   private String AV71PedidoCliente ;
   private String AV72barcolnom ;
   private String AV77CliNom ;
   private String AV78BarSerDsc ;
   private String AV79BarAgrest ;
   private String A457FasCod ;
   private String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ;
   private String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ;
   private String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ;
   private String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ;
   private String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ;
   private String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ;
   private String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ;
   private String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ;
   private String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ;
   private String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ;
   private String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ;
   private String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ;
   private String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ;
   private String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ;
   private String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ;
   private String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ;
   private String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ;
   private String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ;
   private String scmdbuf ;
   private String lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ;
   private String lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ;
   private String lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ;
   private String lV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ;
   private String lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ;
   private String lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ;
   private String lV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A152BarFasCon ;
   private String A150BarFacTin ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String W759ProDsc ;
   private java.util.Date AV32TFBarFasDTI ;
   private java.util.Date AV33TFBarFasDTF ;
   private java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ;
   private java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private boolean returnInSub ;
   private boolean brkAGQ2 ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean brkAGQ4 ;
   private boolean brkAGQ6 ;
   private boolean brkAGQ8 ;
   private boolean brkAGQ10 ;
   private boolean brkAGQ12 ;
   private boolean brkAGQ14 ;
   private String AV55OptionsJson ;
   private String AV56OptionsDescJson ;
   private String AV57OptionIndexesJson ;
   private String AV52DDOName ;
   private String AV53SearchTxt ;
   private String AV54SearchTxtTo ;
   private String AV41Option ;
   private String AV43OptionDesc ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGQ2_A396EmprCod ;
   private int[] P0AGQ2_A129BarCod ;
   private byte[] P0AGQ2_A132BarCodReo ;
   private String[] P0AGQ2_A130BarCodPar ;
   private String[] P0AGQ2_A758ProCod ;
   private String[] P0AGQ2_A759ProDsc ;
   private String[] P0AGQ2_A457FasCod ;
   private java.math.BigDecimal[] P0AGQ2_A3838BarFasMtr ;
   private boolean[] P0AGQ2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ2_A3837BarFasKgm ;
   private boolean[] P0AGQ2_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ2_A4443BarFasDTF ;
   private boolean[] P0AGQ2_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ2_A4442BarFasDTI ;
   private boolean[] P0AGQ2_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ2_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ2_A216BarTieTeo ;
   private String[] P0AGQ2_A4287BarFasFor ;
   private String[] P0AGQ2_A4905BarFasAcab ;
   private String[] P0AGQ2_A150BarFacTin ;
   private byte[] P0AGQ2_A153BarFasEst ;
   private String[] P0AGQ2_A152BarFasCon ;
   private String[] P0AGQ2_A603MaqCodBis ;
   private String[] P0AGQ2_A460FasDsc ;
   private short[] P0AGQ2_A194BarOrdLin ;
   private String[] P0AGQ3_A396EmprCod ;
   private int[] P0AGQ3_A129BarCod ;
   private byte[] P0AGQ3_A132BarCodReo ;
   private String[] P0AGQ3_A130BarCodPar ;
   private String[] P0AGQ3_A758ProCod ;
   private String[] P0AGQ3_A759ProDsc ;
   private String[] P0AGQ3_A460FasDsc ;
   private java.math.BigDecimal[] P0AGQ3_A3838BarFasMtr ;
   private boolean[] P0AGQ3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ3_A3837BarFasKgm ;
   private boolean[] P0AGQ3_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ3_A4443BarFasDTF ;
   private boolean[] P0AGQ3_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ3_A4442BarFasDTI ;
   private boolean[] P0AGQ3_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ3_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ3_A216BarTieTeo ;
   private String[] P0AGQ3_A4287BarFasFor ;
   private String[] P0AGQ3_A4905BarFasAcab ;
   private String[] P0AGQ3_A150BarFacTin ;
   private byte[] P0AGQ3_A153BarFasEst ;
   private String[] P0AGQ3_A152BarFasCon ;
   private String[] P0AGQ3_A603MaqCodBis ;
   private String[] P0AGQ3_A457FasCod ;
   private short[] P0AGQ3_A194BarOrdLin ;
   private String[] P0AGQ4_A396EmprCod ;
   private int[] P0AGQ4_A129BarCod ;
   private byte[] P0AGQ4_A132BarCodReo ;
   private String[] P0AGQ4_A130BarCodPar ;
   private String[] P0AGQ4_A758ProCod ;
   private String[] P0AGQ4_A759ProDsc ;
   private String[] P0AGQ4_A603MaqCodBis ;
   private java.math.BigDecimal[] P0AGQ4_A3838BarFasMtr ;
   private boolean[] P0AGQ4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ4_A3837BarFasKgm ;
   private boolean[] P0AGQ4_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ4_A4443BarFasDTF ;
   private boolean[] P0AGQ4_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ4_A4442BarFasDTI ;
   private boolean[] P0AGQ4_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ4_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ4_A216BarTieTeo ;
   private String[] P0AGQ4_A4287BarFasFor ;
   private String[] P0AGQ4_A4905BarFasAcab ;
   private String[] P0AGQ4_A150BarFacTin ;
   private byte[] P0AGQ4_A153BarFasEst ;
   private String[] P0AGQ4_A152BarFasCon ;
   private String[] P0AGQ4_A460FasDsc ;
   private String[] P0AGQ4_A457FasCod ;
   private short[] P0AGQ4_A194BarOrdLin ;
   private String[] P0AGQ5_A396EmprCod ;
   private int[] P0AGQ5_A129BarCod ;
   private byte[] P0AGQ5_A132BarCodReo ;
   private String[] P0AGQ5_A130BarCodPar ;
   private String[] P0AGQ5_A758ProCod ;
   private String[] P0AGQ5_A759ProDsc ;
   private String[] P0AGQ5_A152BarFasCon ;
   private java.math.BigDecimal[] P0AGQ5_A3838BarFasMtr ;
   private boolean[] P0AGQ5_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ5_A3837BarFasKgm ;
   private boolean[] P0AGQ5_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ5_A4443BarFasDTF ;
   private boolean[] P0AGQ5_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ5_A4442BarFasDTI ;
   private boolean[] P0AGQ5_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ5_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ5_A216BarTieTeo ;
   private String[] P0AGQ5_A4287BarFasFor ;
   private String[] P0AGQ5_A4905BarFasAcab ;
   private String[] P0AGQ5_A150BarFacTin ;
   private byte[] P0AGQ5_A153BarFasEst ;
   private String[] P0AGQ5_A603MaqCodBis ;
   private String[] P0AGQ5_A460FasDsc ;
   private String[] P0AGQ5_A457FasCod ;
   private short[] P0AGQ5_A194BarOrdLin ;
   private String[] P0AGQ6_A396EmprCod ;
   private int[] P0AGQ6_A129BarCod ;
   private byte[] P0AGQ6_A132BarCodReo ;
   private String[] P0AGQ6_A130BarCodPar ;
   private String[] P0AGQ6_A758ProCod ;
   private String[] P0AGQ6_A759ProDsc ;
   private String[] P0AGQ6_A150BarFacTin ;
   private java.math.BigDecimal[] P0AGQ6_A3838BarFasMtr ;
   private boolean[] P0AGQ6_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ6_A3837BarFasKgm ;
   private boolean[] P0AGQ6_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ6_A4443BarFasDTF ;
   private boolean[] P0AGQ6_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ6_A4442BarFasDTI ;
   private boolean[] P0AGQ6_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ6_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ6_A216BarTieTeo ;
   private String[] P0AGQ6_A4287BarFasFor ;
   private String[] P0AGQ6_A4905BarFasAcab ;
   private byte[] P0AGQ6_A153BarFasEst ;
   private String[] P0AGQ6_A152BarFasCon ;
   private String[] P0AGQ6_A603MaqCodBis ;
   private String[] P0AGQ6_A460FasDsc ;
   private String[] P0AGQ6_A457FasCod ;
   private short[] P0AGQ6_A194BarOrdLin ;
   private String[] P0AGQ7_A396EmprCod ;
   private int[] P0AGQ7_A129BarCod ;
   private byte[] P0AGQ7_A132BarCodReo ;
   private String[] P0AGQ7_A130BarCodPar ;
   private String[] P0AGQ7_A758ProCod ;
   private String[] P0AGQ7_A759ProDsc ;
   private String[] P0AGQ7_A4905BarFasAcab ;
   private java.math.BigDecimal[] P0AGQ7_A3838BarFasMtr ;
   private boolean[] P0AGQ7_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ7_A3837BarFasKgm ;
   private boolean[] P0AGQ7_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ7_A4443BarFasDTF ;
   private boolean[] P0AGQ7_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ7_A4442BarFasDTI ;
   private boolean[] P0AGQ7_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ7_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ7_A216BarTieTeo ;
   private String[] P0AGQ7_A4287BarFasFor ;
   private String[] P0AGQ7_A150BarFacTin ;
   private byte[] P0AGQ7_A153BarFasEst ;
   private String[] P0AGQ7_A152BarFasCon ;
   private String[] P0AGQ7_A603MaqCodBis ;
   private String[] P0AGQ7_A460FasDsc ;
   private String[] P0AGQ7_A457FasCod ;
   private short[] P0AGQ7_A194BarOrdLin ;
   private String[] P0AGQ8_A396EmprCod ;
   private int[] P0AGQ8_A129BarCod ;
   private byte[] P0AGQ8_A132BarCodReo ;
   private String[] P0AGQ8_A130BarCodPar ;
   private String[] P0AGQ8_A758ProCod ;
   private String[] P0AGQ8_A759ProDsc ;
   private String[] P0AGQ8_A4287BarFasFor ;
   private java.math.BigDecimal[] P0AGQ8_A3838BarFasMtr ;
   private boolean[] P0AGQ8_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AGQ8_A3837BarFasKgm ;
   private boolean[] P0AGQ8_n3837BarFasKgm ;
   private java.util.Date[] P0AGQ8_A4443BarFasDTF ;
   private boolean[] P0AGQ8_n4443BarFasDTF ;
   private java.util.Date[] P0AGQ8_A4442BarFasDTI ;
   private boolean[] P0AGQ8_n4442BarFasDTI ;
   private java.math.BigDecimal[] P0AGQ8_A215BarTieRea ;
   private java.math.BigDecimal[] P0AGQ8_A216BarTieTeo ;
   private String[] P0AGQ8_A4905BarFasAcab ;
   private String[] P0AGQ8_A150BarFacTin ;
   private byte[] P0AGQ8_A153BarFasEst ;
   private String[] P0AGQ8_A152BarFasCon ;
   private String[] P0AGQ8_A603MaqCodBis ;
   private String[] P0AGQ8_A460FasDsc ;
   private String[] P0AGQ8_A457FasCod ;
   private short[] P0AGQ8_A194BarOrdLin ;
   private GXSimpleCollection<String> AV42Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV45OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class hojaderuta__fases_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AGQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.FasCod, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T3.FasDsc, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AGQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[39];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T3.FasDsc, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T1.FasCod, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T3.FasDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AGQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[39];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.MaqCodBis, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T3.FasDsc, T1.FasCod, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.MaqCodBis" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AGQ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFasCon, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.MaqCodBis, T3.FasDsc, T1.FasCod, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFasCon" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AGQ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[39];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFacTin, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T3.FasDsc, T1.FasCod, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFacTin" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AGQ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[39];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFasAcab, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasFor, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T3.FasDsc, T1.FasCod, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFasAcab" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0AGQ8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          String A396EmprCod ,
                                          String AV58EmprCod ,
                                          int A129BarCod ,
                                          int AV59BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV60BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV61BarCodPar ,
                                          String A758ProCod ,
                                          String AV62ProCod ,
                                          String AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                          String AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A759ProDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[39];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFasFor, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea," ;
      scmdbuf += " T1.BarTieTeo, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T3.FasDsc, T1.FasCod, T1.BarOrdLin FROM ((TXPBARFAS T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T2.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, T1.BarFasFor" ;
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
                  return conditional_P0AGQ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 1 :
                  return conditional_P0AGQ3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 2 :
                  return conditional_P0AGQ4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 3 :
                  return conditional_P0AGQ5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 4 :
                  return conditional_P0AGQ6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 5 :
                  return conditional_P0AGQ7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 6 :
                  return conditional_P0AGQ8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGQ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGQ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGQ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGQ8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 6);
               ((String[]) buf[23])[0] = rslt.getString(20, 28);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 6);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 28);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 6);
               ((String[]) buf[22])[0] = rslt.getString(19, 28);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 6);
               ((String[]) buf[22])[0] = rslt.getString(19, 28);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 6);
               ((String[]) buf[22])[0] = rslt.getString(19, 28);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 6);
               ((String[]) buf[22])[0] = rslt.getString(19, 28);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((short[]) buf[24])[0] = rslt.getShort(21);
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
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
      }
   }

}

