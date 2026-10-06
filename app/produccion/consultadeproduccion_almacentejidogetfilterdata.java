package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_almacentejidogetfilterdata extends GXProcedure
{
   public consultadeproduccion_almacentejidogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_almacentejidogetfilterdata.class ), "" );
   }

   public consultadeproduccion_almacentejidogetfilterdata( int remoteHandle ,
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
      consultadeproduccion_almacentejidogetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion_almacentejidogetfilterdata.this.AV52DDOName = aP0;
      consultadeproduccion_almacentejidogetfilterdata.this.AV53SearchTxt = aP1;
      consultadeproduccion_almacentejidogetfilterdata.this.AV54SearchTxtTo = aP2;
      consultadeproduccion_almacentejidogetfilterdata.this.aP3 = aP3;
      consultadeproduccion_almacentejidogetfilterdata.this.aP4 = aP4;
      consultadeproduccion_almacentejidogetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_BARPIECOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARPIECODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_BARPIELOC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARPIELOCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBRENT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRENTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBRLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRLOTEOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBRTELAR") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRTELAROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBRMDLCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRMDLCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_ALBMAQTEJ") == 0 )
      {
         /* Execute user subroutine: 'LOADALBMAQTEJOPTIONS' */
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
      if ( GXutil.strcmp(AV47Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV10TFBarPieCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV11TFBarPieCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV12TFAlbRecCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFAlbRecCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKILLAN") == 0 )
         {
            AV14TFBarKilLan = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFBarKilLan_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMETLAN") == 0 )
         {
            AV16TFBarMetLan = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFBarMetLan_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV18TFBarPieKil = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFBarPieKil_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV20TFBarPieMet = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFBarPieMet_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC") == 0 )
         {
            AV22TFBarPieLoc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC_SEL") == 0 )
         {
            AV23TFBarPieLoc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV24TFBarPieEst = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFBarPieEst_To = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV26TFAlbREnt = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV27TFAlbREnt_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV28TFAlbRLote = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV29TFAlbRLote_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR") == 0 )
         {
            AV30TFAlbRTelar = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR_SEL") == 0 )
         {
            AV31TFAlbRTelar_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD") == 0 )
         {
            AV32TFAlbRMdlCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD_SEL") == 0 )
         {
            AV33TFAlbRMdlCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLU") == 0 )
         {
            AV34TFAlbRLu = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFAlbRLu_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARA") == 0 )
         {
            AV36TFAlbRTara = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFAlbRTara_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ") == 0 )
         {
            AV38TFAlbMaqTej = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ_SEL") == 0 )
         {
            AV39TFAlbMaqTej_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV58Emprcod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV59Barcod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV60Barcodreo = (byte)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV61Barcodpar = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV62Clicod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV63CliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV64PedidoCliente = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV65Barser = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV66BarSerDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV67Barcolnom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV68Barcolnum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarPieCod = AV53SearchTxt ;
      AV11TFBarPieCod_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           AV58Emprcod ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           AV61Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X42 */
      pr_default.execute(0, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9X42 = false ;
         A130BarCodPar = P09X42_A130BarCodPar[0] ;
         A132BarCodReo = P09X42_A132BarCodReo[0] ;
         A129BarCod = P09X42_A129BarCod[0] ;
         A396EmprCod = P09X42_A396EmprCod[0] ;
         A200BarPieCod = P09X42_A200BarPieCod[0] ;
         A8035AlbMaqTej = P09X42_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X42_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X42_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X42_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X42_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X42_A6463AlbRLote[0] ;
         A46AlbREnt = P09X42_A46AlbREnt[0] ;
         A201BarPieEst = P09X42_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X42_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X42_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X42_A205BarPieMet[0] ;
         A203BarPieKil = P09X42_A203BarPieKil[0] ;
         A183BarMetLan = P09X42_A183BarMetLan[0] ;
         A170BarKilLan = P09X42_A170BarKilLan[0] ;
         A44AlbRecCod = P09X42_A44AlbRecCod[0] ;
         A8035AlbMaqTej = P09X42_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X42_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X42_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X42_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X42_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X42_A6463AlbRLote[0] ;
         A46AlbREnt = P09X42_A46AlbREnt[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09X42_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09X42_A129BarCod[0] == A129BarCod ) && ( P09X42_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P09X42_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P09X42_A200BarPieCod[0], A200BarPieCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk9X42 = false ;
            AV46count = (long)(AV46count+1) ;
            brk9X42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A200BarPieCod)==0) )
         {
            AV41Option = A200BarPieCod ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X42 )
         {
            brk9X42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARPIELOCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarPieLoc = AV53SearchTxt ;
      AV23TFBarPieLoc_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           A130BarCodPar ,
                                           AV61Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X43 */
      pr_default.execute(1, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9X44 = false ;
         A396EmprCod = P09X43_A396EmprCod[0] ;
         A129BarCod = P09X43_A129BarCod[0] ;
         A132BarCodReo = P09X43_A132BarCodReo[0] ;
         A130BarCodPar = P09X43_A130BarCodPar[0] ;
         A2186BarPieLoc = P09X43_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X43_n2186BarPieLoc[0] ;
         A8035AlbMaqTej = P09X43_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X43_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X43_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X43_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X43_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X43_A6463AlbRLote[0] ;
         A46AlbREnt = P09X43_A46AlbREnt[0] ;
         A201BarPieEst = P09X43_A201BarPieEst[0] ;
         A205BarPieMet = P09X43_A205BarPieMet[0] ;
         A203BarPieKil = P09X43_A203BarPieKil[0] ;
         A183BarMetLan = P09X43_A183BarMetLan[0] ;
         A170BarKilLan = P09X43_A170BarKilLan[0] ;
         A44AlbRecCod = P09X43_A44AlbRecCod[0] ;
         A200BarPieCod = P09X43_A200BarPieCod[0] ;
         A8035AlbMaqTej = P09X43_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X43_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X43_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X43_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X43_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X43_A6463AlbRLote[0] ;
         A46AlbREnt = P09X43_A46AlbREnt[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09X43_A2186BarPieLoc[0], A2186BarPieLoc) == 0 ) )
         {
            brk9X44 = false ;
            A396EmprCod = P09X43_A396EmprCod[0] ;
            A129BarCod = P09X43_A129BarCod[0] ;
            A132BarCodReo = P09X43_A132BarCodReo[0] ;
            A130BarCodPar = P09X43_A130BarCodPar[0] ;
            A200BarPieCod = P09X43_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9X44 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2186BarPieLoc)==0) )
         {
            AV41Option = A2186BarPieLoc ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X44 )
         {
            brk9X44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBRENTOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbREnt = AV53SearchTxt ;
      AV27TFAlbREnt_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           A130BarCodPar ,
                                           AV61Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X44 */
      pr_default.execute(2, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9X46 = false ;
         A396EmprCod = P09X44_A396EmprCod[0] ;
         A129BarCod = P09X44_A129BarCod[0] ;
         A132BarCodReo = P09X44_A132BarCodReo[0] ;
         A130BarCodPar = P09X44_A130BarCodPar[0] ;
         A46AlbREnt = P09X44_A46AlbREnt[0] ;
         A8035AlbMaqTej = P09X44_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X44_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X44_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X44_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X44_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X44_A6463AlbRLote[0] ;
         A201BarPieEst = P09X44_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X44_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X44_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X44_A205BarPieMet[0] ;
         A203BarPieKil = P09X44_A203BarPieKil[0] ;
         A183BarMetLan = P09X44_A183BarMetLan[0] ;
         A170BarKilLan = P09X44_A170BarKilLan[0] ;
         A44AlbRecCod = P09X44_A44AlbRecCod[0] ;
         A200BarPieCod = P09X44_A200BarPieCod[0] ;
         A46AlbREnt = P09X44_A46AlbREnt[0] ;
         A8035AlbMaqTej = P09X44_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X44_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X44_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X44_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X44_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X44_A6463AlbRLote[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09X44_A46AlbREnt[0], A46AlbREnt) == 0 ) )
         {
            brk9X46 = false ;
            A396EmprCod = P09X44_A396EmprCod[0] ;
            A129BarCod = P09X44_A129BarCod[0] ;
            A132BarCodReo = P09X44_A132BarCodReo[0] ;
            A130BarCodPar = P09X44_A130BarCodPar[0] ;
            A44AlbRecCod = P09X44_A44AlbRecCod[0] ;
            A200BarPieCod = P09X44_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9X46 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV41Option = A46AlbREnt ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X46 )
         {
            brk9X46 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBRLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV28TFAlbRLote = AV53SearchTxt ;
      AV29TFAlbRLote_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           A130BarCodPar ,
                                           AV61Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X45 */
      pr_default.execute(3, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9X48 = false ;
         A396EmprCod = P09X45_A396EmprCod[0] ;
         A129BarCod = P09X45_A129BarCod[0] ;
         A132BarCodReo = P09X45_A132BarCodReo[0] ;
         A130BarCodPar = P09X45_A130BarCodPar[0] ;
         A6463AlbRLote = P09X45_A6463AlbRLote[0] ;
         A8035AlbMaqTej = P09X45_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X45_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X45_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X45_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X45_A6464AlbRTelar[0] ;
         A46AlbREnt = P09X45_A46AlbREnt[0] ;
         A201BarPieEst = P09X45_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X45_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X45_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X45_A205BarPieMet[0] ;
         A203BarPieKil = P09X45_A203BarPieKil[0] ;
         A183BarMetLan = P09X45_A183BarMetLan[0] ;
         A170BarKilLan = P09X45_A170BarKilLan[0] ;
         A44AlbRecCod = P09X45_A44AlbRecCod[0] ;
         A200BarPieCod = P09X45_A200BarPieCod[0] ;
         A6463AlbRLote = P09X45_A6463AlbRLote[0] ;
         A8035AlbMaqTej = P09X45_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X45_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X45_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X45_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X45_A6464AlbRTelar[0] ;
         A46AlbREnt = P09X45_A46AlbREnt[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09X45_A6463AlbRLote[0], A6463AlbRLote) == 0 ) )
         {
            brk9X48 = false ;
            A396EmprCod = P09X45_A396EmprCod[0] ;
            A129BarCod = P09X45_A129BarCod[0] ;
            A132BarCodReo = P09X45_A132BarCodReo[0] ;
            A130BarCodPar = P09X45_A130BarCodPar[0] ;
            A44AlbRecCod = P09X45_A44AlbRecCod[0] ;
            A200BarPieCod = P09X45_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9X48 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A6463AlbRLote)==0) )
         {
            AV41Option = A6463AlbRLote ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X48 )
         {
            brk9X48 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBRTELAROPTIONS' Routine */
      returnInSub = false ;
      AV30TFAlbRTelar = AV53SearchTxt ;
      AV31TFAlbRTelar_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           A130BarCodPar ,
                                           AV61Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X46 */
      pr_default.execute(4, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9X410 = false ;
         A396EmprCod = P09X46_A396EmprCod[0] ;
         A129BarCod = P09X46_A129BarCod[0] ;
         A132BarCodReo = P09X46_A132BarCodReo[0] ;
         A130BarCodPar = P09X46_A130BarCodPar[0] ;
         A6464AlbRTelar = P09X46_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P09X46_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X46_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X46_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X46_A4602AlbRMdlCod[0] ;
         A6463AlbRLote = P09X46_A6463AlbRLote[0] ;
         A46AlbREnt = P09X46_A46AlbREnt[0] ;
         A201BarPieEst = P09X46_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X46_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X46_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X46_A205BarPieMet[0] ;
         A203BarPieKil = P09X46_A203BarPieKil[0] ;
         A183BarMetLan = P09X46_A183BarMetLan[0] ;
         A170BarKilLan = P09X46_A170BarKilLan[0] ;
         A44AlbRecCod = P09X46_A44AlbRecCod[0] ;
         A200BarPieCod = P09X46_A200BarPieCod[0] ;
         A6464AlbRTelar = P09X46_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P09X46_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X46_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X46_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X46_A4602AlbRMdlCod[0] ;
         A6463AlbRLote = P09X46_A6463AlbRLote[0] ;
         A46AlbREnt = P09X46_A46AlbREnt[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09X46_A6464AlbRTelar[0], A6464AlbRTelar) == 0 ) )
         {
            brk9X410 = false ;
            A396EmprCod = P09X46_A396EmprCod[0] ;
            A129BarCod = P09X46_A129BarCod[0] ;
            A132BarCodReo = P09X46_A132BarCodReo[0] ;
            A130BarCodPar = P09X46_A130BarCodPar[0] ;
            A44AlbRecCod = P09X46_A44AlbRecCod[0] ;
            A200BarPieCod = P09X46_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9X410 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A6464AlbRTelar)==0) )
         {
            AV41Option = A6464AlbRTelar ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X410 )
         {
            brk9X410 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBRMDLCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFAlbRMdlCod = AV53SearchTxt ;
      AV33TFAlbRMdlCod_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           A130BarCodPar ,
                                           AV61Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X47 */
      pr_default.execute(5, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9X412 = false ;
         A396EmprCod = P09X47_A396EmprCod[0] ;
         A129BarCod = P09X47_A129BarCod[0] ;
         A132BarCodReo = P09X47_A132BarCodReo[0] ;
         A130BarCodPar = P09X47_A130BarCodPar[0] ;
         A4602AlbRMdlCod = P09X47_A4602AlbRMdlCod[0] ;
         A8035AlbMaqTej = P09X47_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X47_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X47_A6465AlbRLu[0] ;
         A6464AlbRTelar = P09X47_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X47_A6463AlbRLote[0] ;
         A46AlbREnt = P09X47_A46AlbREnt[0] ;
         A201BarPieEst = P09X47_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X47_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X47_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X47_A205BarPieMet[0] ;
         A203BarPieKil = P09X47_A203BarPieKil[0] ;
         A183BarMetLan = P09X47_A183BarMetLan[0] ;
         A170BarKilLan = P09X47_A170BarKilLan[0] ;
         A44AlbRecCod = P09X47_A44AlbRecCod[0] ;
         A200BarPieCod = P09X47_A200BarPieCod[0] ;
         A4602AlbRMdlCod = P09X47_A4602AlbRMdlCod[0] ;
         A8035AlbMaqTej = P09X47_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X47_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X47_A6465AlbRLu[0] ;
         A6464AlbRTelar = P09X47_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X47_A6463AlbRLote[0] ;
         A46AlbREnt = P09X47_A46AlbREnt[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09X47_A4602AlbRMdlCod[0], A4602AlbRMdlCod) == 0 ) )
         {
            brk9X412 = false ;
            A396EmprCod = P09X47_A396EmprCod[0] ;
            A129BarCod = P09X47_A129BarCod[0] ;
            A132BarCodReo = P09X47_A132BarCodReo[0] ;
            A130BarCodPar = P09X47_A130BarCodPar[0] ;
            A44AlbRecCod = P09X47_A44AlbRecCod[0] ;
            A200BarPieCod = P09X47_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9X412 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A4602AlbRMdlCod)==0) )
         {
            AV41Option = A4602AlbRMdlCod ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X412 )
         {
            brk9X412 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBMAQTEJOPTIONS' Routine */
      returnInSub = false ;
      AV38TFAlbMaqTej = AV53SearchTxt ;
      AV39TFAlbMaqTej_Sel = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV10TFBarPieCod ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV12TFAlbRecCod ;
      AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV14TFBarKilLan ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV15TFBarKilLan_To ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV16TFBarMetLan ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV17TFBarMetLan_To ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV18TFBarPieKil ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV19TFBarPieKil_To ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV20TFBarPieMet ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV21TFBarPieMet_To ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV22TFBarPieLoc ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV23TFBarPieLoc_Sel ;
      AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV24TFBarPieEst ;
      AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV25TFBarPieEst_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV26TFAlbREnt ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV27TFAlbREnt_Sel ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV28TFAlbRLote ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV29TFAlbRLote_Sel ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV30TFAlbRTelar ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV31TFAlbRTelar_Sel ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV32TFAlbRMdlCod ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV33TFAlbRMdlCod_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV34TFAlbRLu ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV35TFAlbRLu_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV36TFAlbRTara ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV37TFAlbRTara_To ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV38TFAlbMaqTej ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV39TFAlbMaqTej_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           AV58Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV59Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV60Barcodreo) ,
                                           A130BarCodPar ,
                                           AV61Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X48 */
      pr_default.execute(6, new Object[] {AV58Emprcod, Integer.valueOf(AV59Barcod), Byte.valueOf(AV60Barcodreo), AV61Barcodpar, lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9X414 = false ;
         A396EmprCod = P09X48_A396EmprCod[0] ;
         A129BarCod = P09X48_A129BarCod[0] ;
         A132BarCodReo = P09X48_A132BarCodReo[0] ;
         A130BarCodPar = P09X48_A130BarCodPar[0] ;
         A8035AlbMaqTej = P09X48_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X48_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X48_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X48_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X48_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X48_A6463AlbRLote[0] ;
         A46AlbREnt = P09X48_A46AlbREnt[0] ;
         A201BarPieEst = P09X48_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X48_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X48_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X48_A205BarPieMet[0] ;
         A203BarPieKil = P09X48_A203BarPieKil[0] ;
         A183BarMetLan = P09X48_A183BarMetLan[0] ;
         A170BarKilLan = P09X48_A170BarKilLan[0] ;
         A44AlbRecCod = P09X48_A44AlbRecCod[0] ;
         A200BarPieCod = P09X48_A200BarPieCod[0] ;
         A8035AlbMaqTej = P09X48_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X48_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X48_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X48_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X48_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X48_A6463AlbRLote[0] ;
         A46AlbREnt = P09X48_A46AlbREnt[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09X48_A8035AlbMaqTej[0], A8035AlbMaqTej) == 0 ) )
         {
            brk9X414 = false ;
            A396EmprCod = P09X48_A396EmprCod[0] ;
            A129BarCod = P09X48_A129BarCod[0] ;
            A132BarCodReo = P09X48_A132BarCodReo[0] ;
            A130BarCodPar = P09X48_A130BarCodPar[0] ;
            A44AlbRecCod = P09X48_A44AlbRecCod[0] ;
            A200BarPieCod = P09X48_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9X414 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A8035AlbMaqTej)==0) )
         {
            AV41Option = A8035AlbMaqTej ;
            AV42Options.add(AV41Option, 0);
            AV45OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV42Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9X414 )
         {
            brk9X414 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_almacentejidogetfilterdata.this.AV55OptionsJson;
      this.aP4[0] = consultadeproduccion_almacentejidogetfilterdata.this.AV56OptionsDescJson;
      this.aP5[0] = consultadeproduccion_almacentejidogetfilterdata.this.AV57OptionIndexesJson;
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
      AV10TFBarPieCod = "" ;
      AV11TFBarPieCod_Sel = "" ;
      AV14TFBarKilLan = DecimalUtil.ZERO ;
      AV15TFBarKilLan_To = DecimalUtil.ZERO ;
      AV16TFBarMetLan = DecimalUtil.ZERO ;
      AV17TFBarMetLan_To = DecimalUtil.ZERO ;
      AV18TFBarPieKil = DecimalUtil.ZERO ;
      AV19TFBarPieKil_To = DecimalUtil.ZERO ;
      AV20TFBarPieMet = DecimalUtil.ZERO ;
      AV21TFBarPieMet_To = DecimalUtil.ZERO ;
      AV22TFBarPieLoc = "" ;
      AV23TFBarPieLoc_Sel = "" ;
      AV26TFAlbREnt = "" ;
      AV27TFAlbREnt_Sel = "" ;
      AV28TFAlbRLote = "" ;
      AV29TFAlbRLote_Sel = "" ;
      AV30TFAlbRTelar = "" ;
      AV31TFAlbRTelar_Sel = "" ;
      AV32TFAlbRMdlCod = "" ;
      AV33TFAlbRMdlCod_Sel = "" ;
      AV34TFAlbRLu = DecimalUtil.ZERO ;
      AV35TFAlbRLu_To = DecimalUtil.ZERO ;
      AV36TFAlbRTara = DecimalUtil.ZERO ;
      AV37TFAlbRTara_To = DecimalUtil.ZERO ;
      AV38TFAlbMaqTej = "" ;
      AV39TFAlbMaqTej_Sel = "" ;
      AV58Emprcod = "" ;
      AV61Barcodpar = "" ;
      AV63CliNom = "" ;
      AV64PedidoCliente = "" ;
      AV65Barser = "" ;
      AV66BarSerDsc = "" ;
      AV67Barcolnom = "" ;
      A200BarPieCod = "" ;
      AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = "" ;
      AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = DecimalUtil.ZERO ;
      AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = DecimalUtil.ZERO ;
      AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = DecimalUtil.ZERO ;
      AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = DecimalUtil.ZERO ;
      AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = DecimalUtil.ZERO ;
      AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = DecimalUtil.ZERO ;
      AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = "" ;
      AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = "" ;
      AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = "" ;
      AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = "" ;
      AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = "" ;
      AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = DecimalUtil.ZERO ;
      AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = DecimalUtil.ZERO ;
      AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = DecimalUtil.ZERO ;
      AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = DecimalUtil.ZERO ;
      AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = "" ;
      scmdbuf = "" ;
      lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A46AlbREnt = "" ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A4602AlbRMdlCod = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09X42_A130BarCodPar = new String[] {""} ;
      P09X42_A132BarCodReo = new byte[1] ;
      P09X42_A129BarCod = new int[1] ;
      P09X42_A396EmprCod = new String[] {""} ;
      P09X42_A200BarPieCod = new String[] {""} ;
      P09X42_A8035AlbMaqTej = new String[] {""} ;
      P09X42_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X42_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X42_A4602AlbRMdlCod = new String[] {""} ;
      P09X42_A6464AlbRTelar = new String[] {""} ;
      P09X42_A6463AlbRLote = new String[] {""} ;
      P09X42_A46AlbREnt = new String[] {""} ;
      P09X42_A201BarPieEst = new byte[1] ;
      P09X42_A2186BarPieLoc = new String[] {""} ;
      P09X42_n2186BarPieLoc = new boolean[] {false} ;
      P09X42_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X42_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X42_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X42_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X42_A44AlbRecCod = new int[1] ;
      AV41Option = "" ;
      P09X43_A396EmprCod = new String[] {""} ;
      P09X43_A129BarCod = new int[1] ;
      P09X43_A132BarCodReo = new byte[1] ;
      P09X43_A130BarCodPar = new String[] {""} ;
      P09X43_A2186BarPieLoc = new String[] {""} ;
      P09X43_n2186BarPieLoc = new boolean[] {false} ;
      P09X43_A8035AlbMaqTej = new String[] {""} ;
      P09X43_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X43_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X43_A4602AlbRMdlCod = new String[] {""} ;
      P09X43_A6464AlbRTelar = new String[] {""} ;
      P09X43_A6463AlbRLote = new String[] {""} ;
      P09X43_A46AlbREnt = new String[] {""} ;
      P09X43_A201BarPieEst = new byte[1] ;
      P09X43_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X43_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X43_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X43_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X43_A44AlbRecCod = new int[1] ;
      P09X43_A200BarPieCod = new String[] {""} ;
      P09X44_A396EmprCod = new String[] {""} ;
      P09X44_A129BarCod = new int[1] ;
      P09X44_A132BarCodReo = new byte[1] ;
      P09X44_A130BarCodPar = new String[] {""} ;
      P09X44_A46AlbREnt = new String[] {""} ;
      P09X44_A8035AlbMaqTej = new String[] {""} ;
      P09X44_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X44_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X44_A4602AlbRMdlCod = new String[] {""} ;
      P09X44_A6464AlbRTelar = new String[] {""} ;
      P09X44_A6463AlbRLote = new String[] {""} ;
      P09X44_A201BarPieEst = new byte[1] ;
      P09X44_A2186BarPieLoc = new String[] {""} ;
      P09X44_n2186BarPieLoc = new boolean[] {false} ;
      P09X44_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X44_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X44_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X44_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X44_A44AlbRecCod = new int[1] ;
      P09X44_A200BarPieCod = new String[] {""} ;
      P09X45_A396EmprCod = new String[] {""} ;
      P09X45_A129BarCod = new int[1] ;
      P09X45_A132BarCodReo = new byte[1] ;
      P09X45_A130BarCodPar = new String[] {""} ;
      P09X45_A6463AlbRLote = new String[] {""} ;
      P09X45_A8035AlbMaqTej = new String[] {""} ;
      P09X45_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X45_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X45_A4602AlbRMdlCod = new String[] {""} ;
      P09X45_A6464AlbRTelar = new String[] {""} ;
      P09X45_A46AlbREnt = new String[] {""} ;
      P09X45_A201BarPieEst = new byte[1] ;
      P09X45_A2186BarPieLoc = new String[] {""} ;
      P09X45_n2186BarPieLoc = new boolean[] {false} ;
      P09X45_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X45_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X45_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X45_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X45_A44AlbRecCod = new int[1] ;
      P09X45_A200BarPieCod = new String[] {""} ;
      P09X46_A396EmprCod = new String[] {""} ;
      P09X46_A129BarCod = new int[1] ;
      P09X46_A132BarCodReo = new byte[1] ;
      P09X46_A130BarCodPar = new String[] {""} ;
      P09X46_A6464AlbRTelar = new String[] {""} ;
      P09X46_A8035AlbMaqTej = new String[] {""} ;
      P09X46_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X46_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X46_A4602AlbRMdlCod = new String[] {""} ;
      P09X46_A6463AlbRLote = new String[] {""} ;
      P09X46_A46AlbREnt = new String[] {""} ;
      P09X46_A201BarPieEst = new byte[1] ;
      P09X46_A2186BarPieLoc = new String[] {""} ;
      P09X46_n2186BarPieLoc = new boolean[] {false} ;
      P09X46_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X46_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X46_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X46_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X46_A44AlbRecCod = new int[1] ;
      P09X46_A200BarPieCod = new String[] {""} ;
      P09X47_A396EmprCod = new String[] {""} ;
      P09X47_A129BarCod = new int[1] ;
      P09X47_A132BarCodReo = new byte[1] ;
      P09X47_A130BarCodPar = new String[] {""} ;
      P09X47_A4602AlbRMdlCod = new String[] {""} ;
      P09X47_A8035AlbMaqTej = new String[] {""} ;
      P09X47_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X47_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X47_A6464AlbRTelar = new String[] {""} ;
      P09X47_A6463AlbRLote = new String[] {""} ;
      P09X47_A46AlbREnt = new String[] {""} ;
      P09X47_A201BarPieEst = new byte[1] ;
      P09X47_A2186BarPieLoc = new String[] {""} ;
      P09X47_n2186BarPieLoc = new boolean[] {false} ;
      P09X47_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X47_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X47_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X47_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X47_A44AlbRecCod = new int[1] ;
      P09X47_A200BarPieCod = new String[] {""} ;
      P09X48_A396EmprCod = new String[] {""} ;
      P09X48_A129BarCod = new int[1] ;
      P09X48_A132BarCodReo = new byte[1] ;
      P09X48_A130BarCodPar = new String[] {""} ;
      P09X48_A8035AlbMaqTej = new String[] {""} ;
      P09X48_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X48_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X48_A4602AlbRMdlCod = new String[] {""} ;
      P09X48_A6464AlbRTelar = new String[] {""} ;
      P09X48_A6463AlbRLote = new String[] {""} ;
      P09X48_A46AlbREnt = new String[] {""} ;
      P09X48_A201BarPieEst = new byte[1] ;
      P09X48_A2186BarPieLoc = new String[] {""} ;
      P09X48_n2186BarPieLoc = new boolean[] {false} ;
      P09X48_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X48_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X48_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X48_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X48_A44AlbRecCod = new int[1] ;
      P09X48_A200BarPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_almacentejidogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09X42_A130BarCodPar, P09X42_A132BarCodReo, P09X42_A129BarCod, P09X42_A396EmprCod, P09X42_A200BarPieCod, P09X42_A8035AlbMaqTej, P09X42_A6470AlbRTara, P09X42_A6465AlbRLu, P09X42_A4602AlbRMdlCod, P09X42_A6464AlbRTelar,
            P09X42_A6463AlbRLote, P09X42_A46AlbREnt, P09X42_A201BarPieEst, P09X42_A2186BarPieLoc, P09X42_n2186BarPieLoc, P09X42_A205BarPieMet, P09X42_A203BarPieKil, P09X42_A183BarMetLan, P09X42_A170BarKilLan, P09X42_A44AlbRecCod
            }
            , new Object[] {
            P09X43_A396EmprCod, P09X43_A129BarCod, P09X43_A132BarCodReo, P09X43_A130BarCodPar, P09X43_A2186BarPieLoc, P09X43_n2186BarPieLoc, P09X43_A8035AlbMaqTej, P09X43_A6470AlbRTara, P09X43_A6465AlbRLu, P09X43_A4602AlbRMdlCod,
            P09X43_A6464AlbRTelar, P09X43_A6463AlbRLote, P09X43_A46AlbREnt, P09X43_A201BarPieEst, P09X43_A205BarPieMet, P09X43_A203BarPieKil, P09X43_A183BarMetLan, P09X43_A170BarKilLan, P09X43_A44AlbRecCod, P09X43_A200BarPieCod
            }
            , new Object[] {
            P09X44_A396EmprCod, P09X44_A129BarCod, P09X44_A132BarCodReo, P09X44_A130BarCodPar, P09X44_A46AlbREnt, P09X44_A8035AlbMaqTej, P09X44_A6470AlbRTara, P09X44_A6465AlbRLu, P09X44_A4602AlbRMdlCod, P09X44_A6464AlbRTelar,
            P09X44_A6463AlbRLote, P09X44_A201BarPieEst, P09X44_A2186BarPieLoc, P09X44_n2186BarPieLoc, P09X44_A205BarPieMet, P09X44_A203BarPieKil, P09X44_A183BarMetLan, P09X44_A170BarKilLan, P09X44_A44AlbRecCod, P09X44_A200BarPieCod
            }
            , new Object[] {
            P09X45_A396EmprCod, P09X45_A129BarCod, P09X45_A132BarCodReo, P09X45_A130BarCodPar, P09X45_A6463AlbRLote, P09X45_A8035AlbMaqTej, P09X45_A6470AlbRTara, P09X45_A6465AlbRLu, P09X45_A4602AlbRMdlCod, P09X45_A6464AlbRTelar,
            P09X45_A46AlbREnt, P09X45_A201BarPieEst, P09X45_A2186BarPieLoc, P09X45_n2186BarPieLoc, P09X45_A205BarPieMet, P09X45_A203BarPieKil, P09X45_A183BarMetLan, P09X45_A170BarKilLan, P09X45_A44AlbRecCod, P09X45_A200BarPieCod
            }
            , new Object[] {
            P09X46_A396EmprCod, P09X46_A129BarCod, P09X46_A132BarCodReo, P09X46_A130BarCodPar, P09X46_A6464AlbRTelar, P09X46_A8035AlbMaqTej, P09X46_A6470AlbRTara, P09X46_A6465AlbRLu, P09X46_A4602AlbRMdlCod, P09X46_A6463AlbRLote,
            P09X46_A46AlbREnt, P09X46_A201BarPieEst, P09X46_A2186BarPieLoc, P09X46_n2186BarPieLoc, P09X46_A205BarPieMet, P09X46_A203BarPieKil, P09X46_A183BarMetLan, P09X46_A170BarKilLan, P09X46_A44AlbRecCod, P09X46_A200BarPieCod
            }
            , new Object[] {
            P09X47_A396EmprCod, P09X47_A129BarCod, P09X47_A132BarCodReo, P09X47_A130BarCodPar, P09X47_A4602AlbRMdlCod, P09X47_A8035AlbMaqTej, P09X47_A6470AlbRTara, P09X47_A6465AlbRLu, P09X47_A6464AlbRTelar, P09X47_A6463AlbRLote,
            P09X47_A46AlbREnt, P09X47_A201BarPieEst, P09X47_A2186BarPieLoc, P09X47_n2186BarPieLoc, P09X47_A205BarPieMet, P09X47_A203BarPieKil, P09X47_A183BarMetLan, P09X47_A170BarKilLan, P09X47_A44AlbRecCod, P09X47_A200BarPieCod
            }
            , new Object[] {
            P09X48_A396EmprCod, P09X48_A129BarCod, P09X48_A132BarCodReo, P09X48_A130BarCodPar, P09X48_A8035AlbMaqTej, P09X48_A6470AlbRTara, P09X48_A6465AlbRLu, P09X48_A4602AlbRMdlCod, P09X48_A6464AlbRTelar, P09X48_A6463AlbRLote,
            P09X48_A46AlbREnt, P09X48_A201BarPieEst, P09X48_A2186BarPieLoc, P09X48_n2186BarPieLoc, P09X48_A205BarPieMet, P09X48_A203BarPieKil, P09X48_A183BarMetLan, P09X48_A170BarKilLan, P09X48_A44AlbRecCod, P09X48_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24TFBarPieEst ;
   private byte AV25TFBarPieEst_To ;
   private byte AV60Barcodreo ;
   private byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ;
   private byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ;
   private byte A201BarPieEst ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV12TFAlbRecCod ;
   private int AV13TFAlbRecCod_To ;
   private int AV59Barcod ;
   private int AV62Clicod ;
   private int AV68Barcolnum ;
   private int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ;
   private int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private long AV46count ;
   private java.math.BigDecimal AV14TFBarKilLan ;
   private java.math.BigDecimal AV15TFBarKilLan_To ;
   private java.math.BigDecimal AV16TFBarMetLan ;
   private java.math.BigDecimal AV17TFBarMetLan_To ;
   private java.math.BigDecimal AV18TFBarPieKil ;
   private java.math.BigDecimal AV19TFBarPieKil_To ;
   private java.math.BigDecimal AV20TFBarPieMet ;
   private java.math.BigDecimal AV21TFBarPieMet_To ;
   private java.math.BigDecimal AV34TFAlbRLu ;
   private java.math.BigDecimal AV35TFAlbRLu_To ;
   private java.math.BigDecimal AV36TFAlbRTara ;
   private java.math.BigDecimal AV37TFAlbRTara_To ;
   private java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ;
   private java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ;
   private java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ;
   private java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ;
   private java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ;
   private java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ;
   private java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ;
   private java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ;
   private java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ;
   private java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ;
   private java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ;
   private java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private String AV10TFBarPieCod ;
   private String AV11TFBarPieCod_Sel ;
   private String AV22TFBarPieLoc ;
   private String AV23TFBarPieLoc_Sel ;
   private String AV26TFAlbREnt ;
   private String AV27TFAlbREnt_Sel ;
   private String AV28TFAlbRLote ;
   private String AV29TFAlbRLote_Sel ;
   private String AV30TFAlbRTelar ;
   private String AV31TFAlbRTelar_Sel ;
   private String AV32TFAlbRMdlCod ;
   private String AV33TFAlbRMdlCod_Sel ;
   private String AV38TFAlbMaqTej ;
   private String AV39TFAlbMaqTej_Sel ;
   private String AV58Emprcod ;
   private String AV61Barcodpar ;
   private String AV63CliNom ;
   private String AV64PedidoCliente ;
   private String AV65Barser ;
   private String AV66BarSerDsc ;
   private String AV67Barcolnom ;
   private String A200BarPieCod ;
   private String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ;
   private String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ;
   private String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ;
   private String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ;
   private String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ;
   private String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ;
   private String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ;
   private String scmdbuf ;
   private String lV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String lV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String lV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String lV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String lV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String lV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String lV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String A2186BarPieLoc ;
   private String A46AlbREnt ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A4602AlbRMdlCod ;
   private String A8035AlbMaqTej ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9X42 ;
   private boolean n2186BarPieLoc ;
   private boolean brk9X44 ;
   private boolean brk9X46 ;
   private boolean brk9X48 ;
   private boolean brk9X410 ;
   private boolean brk9X412 ;
   private boolean brk9X414 ;
   private String AV55OptionsJson ;
   private String AV56OptionsDescJson ;
   private String AV57OptionIndexesJson ;
   private String AV52DDOName ;
   private String AV53SearchTxt ;
   private String AV54SearchTxtTo ;
   private String AV41Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09X42_A130BarCodPar ;
   private byte[] P09X42_A132BarCodReo ;
   private int[] P09X42_A129BarCod ;
   private String[] P09X42_A396EmprCod ;
   private String[] P09X42_A200BarPieCod ;
   private String[] P09X42_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X42_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X42_A6465AlbRLu ;
   private String[] P09X42_A4602AlbRMdlCod ;
   private String[] P09X42_A6464AlbRTelar ;
   private String[] P09X42_A6463AlbRLote ;
   private String[] P09X42_A46AlbREnt ;
   private byte[] P09X42_A201BarPieEst ;
   private String[] P09X42_A2186BarPieLoc ;
   private boolean[] P09X42_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X42_A205BarPieMet ;
   private java.math.BigDecimal[] P09X42_A203BarPieKil ;
   private java.math.BigDecimal[] P09X42_A183BarMetLan ;
   private java.math.BigDecimal[] P09X42_A170BarKilLan ;
   private int[] P09X42_A44AlbRecCod ;
   private String[] P09X43_A396EmprCod ;
   private int[] P09X43_A129BarCod ;
   private byte[] P09X43_A132BarCodReo ;
   private String[] P09X43_A130BarCodPar ;
   private String[] P09X43_A2186BarPieLoc ;
   private boolean[] P09X43_n2186BarPieLoc ;
   private String[] P09X43_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X43_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X43_A6465AlbRLu ;
   private String[] P09X43_A4602AlbRMdlCod ;
   private String[] P09X43_A6464AlbRTelar ;
   private String[] P09X43_A6463AlbRLote ;
   private String[] P09X43_A46AlbREnt ;
   private byte[] P09X43_A201BarPieEst ;
   private java.math.BigDecimal[] P09X43_A205BarPieMet ;
   private java.math.BigDecimal[] P09X43_A203BarPieKil ;
   private java.math.BigDecimal[] P09X43_A183BarMetLan ;
   private java.math.BigDecimal[] P09X43_A170BarKilLan ;
   private int[] P09X43_A44AlbRecCod ;
   private String[] P09X43_A200BarPieCod ;
   private String[] P09X44_A396EmprCod ;
   private int[] P09X44_A129BarCod ;
   private byte[] P09X44_A132BarCodReo ;
   private String[] P09X44_A130BarCodPar ;
   private String[] P09X44_A46AlbREnt ;
   private String[] P09X44_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X44_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X44_A6465AlbRLu ;
   private String[] P09X44_A4602AlbRMdlCod ;
   private String[] P09X44_A6464AlbRTelar ;
   private String[] P09X44_A6463AlbRLote ;
   private byte[] P09X44_A201BarPieEst ;
   private String[] P09X44_A2186BarPieLoc ;
   private boolean[] P09X44_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X44_A205BarPieMet ;
   private java.math.BigDecimal[] P09X44_A203BarPieKil ;
   private java.math.BigDecimal[] P09X44_A183BarMetLan ;
   private java.math.BigDecimal[] P09X44_A170BarKilLan ;
   private int[] P09X44_A44AlbRecCod ;
   private String[] P09X44_A200BarPieCod ;
   private String[] P09X45_A396EmprCod ;
   private int[] P09X45_A129BarCod ;
   private byte[] P09X45_A132BarCodReo ;
   private String[] P09X45_A130BarCodPar ;
   private String[] P09X45_A6463AlbRLote ;
   private String[] P09X45_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X45_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X45_A6465AlbRLu ;
   private String[] P09X45_A4602AlbRMdlCod ;
   private String[] P09X45_A6464AlbRTelar ;
   private String[] P09X45_A46AlbREnt ;
   private byte[] P09X45_A201BarPieEst ;
   private String[] P09X45_A2186BarPieLoc ;
   private boolean[] P09X45_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X45_A205BarPieMet ;
   private java.math.BigDecimal[] P09X45_A203BarPieKil ;
   private java.math.BigDecimal[] P09X45_A183BarMetLan ;
   private java.math.BigDecimal[] P09X45_A170BarKilLan ;
   private int[] P09X45_A44AlbRecCod ;
   private String[] P09X45_A200BarPieCod ;
   private String[] P09X46_A396EmprCod ;
   private int[] P09X46_A129BarCod ;
   private byte[] P09X46_A132BarCodReo ;
   private String[] P09X46_A130BarCodPar ;
   private String[] P09X46_A6464AlbRTelar ;
   private String[] P09X46_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X46_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X46_A6465AlbRLu ;
   private String[] P09X46_A4602AlbRMdlCod ;
   private String[] P09X46_A6463AlbRLote ;
   private String[] P09X46_A46AlbREnt ;
   private byte[] P09X46_A201BarPieEst ;
   private String[] P09X46_A2186BarPieLoc ;
   private boolean[] P09X46_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X46_A205BarPieMet ;
   private java.math.BigDecimal[] P09X46_A203BarPieKil ;
   private java.math.BigDecimal[] P09X46_A183BarMetLan ;
   private java.math.BigDecimal[] P09X46_A170BarKilLan ;
   private int[] P09X46_A44AlbRecCod ;
   private String[] P09X46_A200BarPieCod ;
   private String[] P09X47_A396EmprCod ;
   private int[] P09X47_A129BarCod ;
   private byte[] P09X47_A132BarCodReo ;
   private String[] P09X47_A130BarCodPar ;
   private String[] P09X47_A4602AlbRMdlCod ;
   private String[] P09X47_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X47_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X47_A6465AlbRLu ;
   private String[] P09X47_A6464AlbRTelar ;
   private String[] P09X47_A6463AlbRLote ;
   private String[] P09X47_A46AlbREnt ;
   private byte[] P09X47_A201BarPieEst ;
   private String[] P09X47_A2186BarPieLoc ;
   private boolean[] P09X47_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X47_A205BarPieMet ;
   private java.math.BigDecimal[] P09X47_A203BarPieKil ;
   private java.math.BigDecimal[] P09X47_A183BarMetLan ;
   private java.math.BigDecimal[] P09X47_A170BarKilLan ;
   private int[] P09X47_A44AlbRecCod ;
   private String[] P09X47_A200BarPieCod ;
   private String[] P09X48_A396EmprCod ;
   private int[] P09X48_A129BarCod ;
   private byte[] P09X48_A132BarCodReo ;
   private String[] P09X48_A130BarCodPar ;
   private String[] P09X48_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X48_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X48_A6465AlbRLu ;
   private String[] P09X48_A4602AlbRMdlCod ;
   private String[] P09X48_A6464AlbRTelar ;
   private String[] P09X48_A6463AlbRLote ;
   private String[] P09X48_A46AlbREnt ;
   private byte[] P09X48_A201BarPieEst ;
   private String[] P09X48_A2186BarPieLoc ;
   private boolean[] P09X48_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X48_A205BarPieMet ;
   private java.math.BigDecimal[] P09X48_A203BarPieKil ;
   private java.math.BigDecimal[] P09X48_A183BarMetLan ;
   private java.math.BigDecimal[] P09X48_A170BarKilLan ;
   private int[] P09X48_A44AlbRecCod ;
   private String[] P09X48_A200BarPieCod ;
   private GXSimpleCollection<String> AV42Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV45OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class consultadeproduccion_almacentejidogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09X42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String AV58Emprcod ,
                                          int AV59Barcod ,
                                          byte AV60Barcodreo ,
                                          String AV61Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarPieCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt," ;
      scmdbuf += " T1.BarPieEst, T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09X43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          int A129BarCod ,
                                          int AV59Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV60Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV61Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[34];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieLoc, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt," ;
      scmdbuf += " T1.BarPieEst, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarPieLoc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09X44( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          int A129BarCod ,
                                          int AV59Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV60Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV61Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbREnt, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbREnt" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09X45( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          int A129BarCod ,
                                          int AV59Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV60Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV61Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[34];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRLote, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRLote" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09X46( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          int A129BarCod ,
                                          int AV59Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV60Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV61Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[34];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRTelar" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09X47( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          int A129BarCod ,
                                          int AV59Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV60Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV61Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[34];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRMdlCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRMdlCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09X48( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          String AV58Emprcod ,
                                          int A129BarCod ,
                                          int AV59Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV60Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV61Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[34];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV73Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV75Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV91Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV93Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbMaqTej" ;
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
                  return conditional_P09X42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] );
            case 1 :
                  return conditional_P09X43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 2 :
                  return conditional_P09X44(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 3 :
                  return conditional_P09X45(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 4 :
                  return conditional_P09X46(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 5 :
                  return conditional_P09X47(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 6 :
                  return conditional_P09X48(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09X42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X44", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X45", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X46", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X47", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X48", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
      }
   }

}

